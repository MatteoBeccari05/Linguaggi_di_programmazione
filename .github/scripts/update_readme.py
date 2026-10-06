#!/usr/bin/env python3
"""Rigenera la sezione "Struttura della Repository" del README.md.

Il testo tra i marcatori <!-- STRUCTURE:START --> e <!-- STRUCTURE:END -->
viene sostituito con una tabella delle cartelle e un albero dei file .java.
Le descrizioni si modificano in .github/descrizioni.json.
"""
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
README = ROOT / "README.md"
DESCR = ROOT / ".github" / "descrizioni.json"
REPO_URL = "https://github.com/MatteoBeccari05/Linguaggi_di_programmazione"
START, END = "<!-- STRUCTURE:START -->", "<!-- STRUCTURE:END -->"
IGNORE = {".git", ".github", "node_modules", "out", "bin"}


def natural_key(p: Path):
    return [int(t) if t.isdigit() else t.lower() for t in re.split(r"(\d+)", p.name)]


def java_files(folder: Path):
    return sorted(folder.rglob("*.java"), key=natural_key)


def build_tree(folder: Path, prefix=""):
    """Albero testuale con sole cartelle e file .java."""
    entries = [
        e for e in sorted(folder.iterdir(), key=natural_key)
        if not e.name.startswith(".") and e.name not in IGNORE
        and (e.suffix == ".java" or (e.is_dir() and java_files(e)))
    ]
    lines = []
    for i, e in enumerate(entries):
        last = i == len(entries) - 1
        lines.append(f"{prefix}{'└── ' if last else '├── '}{e.name}{'/' if e.is_dir() else ''}")
        if e.is_dir():
            lines += build_tree(e, prefix + ("    " if last else "│   "))
    return lines


def main():
    descr = json.loads(DESCR.read_text(encoding="utf-8")) if DESCR.exists() else {}
    folders = sorted(
        (d for d in ROOT.iterdir()
         if d.is_dir() and not d.name.startswith(".") and d.name not in IGNORE),
        key=natural_key,
    )
    root_java = sorted(ROOT.glob("*.java"), key=natural_key)

    out = ["| Cartella | Descrizione | File `.java` |", "|----------|-------------|:------------:|"]
    for d in folders:
        out.append(
            f"| 📁 [**{d.name}**]({REPO_URL}/tree/main/{d.name}) "
            f"| {descr.get(d.name, '—')} | {len(java_files(d))} |"
        )
    for f in root_java:
        out.append(f"| 📄 [`{f.name}`]({REPO_URL}/blob/main/{f.name}) | File nella root | 1 |")

    tree = [f"{ROOT.name}/"]
    for d in folders:
        tree.append(f"├── {d.name}/")
        tree += ["│   " + l for l in build_tree(d)]
    for f in root_java:
        tree.append(f"├── {f.name}")
    if tree:
        tree[-1] = tree[-1].replace("├──", "└──", 1)

    block = (
        f"{START}\n\n" + "\n".join(out) + "\n\n```text\n" + "\n".join(tree) + "\n```\n\n"
        "> *Sezione generata automaticamente: non modificarla a mano.*\n\n" + END
    )

    text = README.read_text(encoding="utf-8")
    if START not in text or END not in text:
        raise SystemExit("Marcatori STRUCTURE:START / STRUCTURE:END non trovati nel README.md")
    new = re.sub(re.escape(START) + r".*?" + re.escape(END), lambda _: block, text, flags=re.S)
    if new != text:
        README.write_text(new, encoding="utf-8")
        print("README aggiornato.")
    else:
        print("Nessuna modifica.")


if __name__ == "__main__":
    main()
