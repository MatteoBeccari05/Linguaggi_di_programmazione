#!/usr/bin/env python3
"""Rigenera la sezione "Struttura della Repository" del README.md.

Il testo tra i marcatori <!-- STRUCTURE:START --> e <!-- STRUCTURE:END -->
viene sostituito con una tabella delle cartelle e del numero di file .java.
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

    block = (
        f"{START}\n\n" + "\n".join(out) + "\n\n"
        "> *Tabella generata automaticamente: non modificarla a mano.*\n\n" + END
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
