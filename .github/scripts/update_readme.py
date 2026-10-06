#!/usr/bin/env python3
"""Rigenera la sezione "Struttura della Repository" del README.md.

Il testo tra <!-- STRUCTURE:START --> e <!-- STRUCTURE:END --> viene
sostituito con:
  - un riepilogo (cartelle e file .java totali);
  - una tabella con icona, argomento, concetti chiave, numero di file e link;
  - un elenco a comparsa, per ogni cartella, con i link ai singoli file.

Le informazioni sulle cartelle si modificano in .github/descrizioni.json:
  "Lezione_7": {"icona": "🧩", "titolo": "...", "tag": ["a", "b"]}
(va bene anche solo una stringa: viene usata come titolo).
"""
import json
import re
from pathlib import Path
from urllib.parse import quote

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


def url(path: Path, kind: str) -> str:
    return f"{REPO_URL}/{kind}/main/{quote(path.relative_to(ROOT).as_posix())}"


def badge(label: str, value, color: str) -> str:
    return (f"![{label}](https://img.shields.io/badge/{label}-{value}-{color}"
            f"?style=flat-square&logo=openjdk&logoColor=white)")


def button(text: str, link: str) -> str:
    return (f"[![{text}](https://img.shields.io/badge/{quote(text)}-→-0366d6"
            f"?style=flat-square)]({link})")


def info(descr: dict, name: str) -> dict:
    d = descr.get(name, {})
    if isinstance(d, str):
        d = {"titolo": d}
    default_icon = "🎓" if name.lower().startswith("tutor") else "📁"
    return {
        "icona": d.get("icona", default_icon),
        "titolo": d.get("titolo", "—"),
        "tag": d.get("tag", []),
    }


def main():
    descr = json.loads(DESCR.read_text(encoding="utf-8")) if DESCR.exists() else {}
    folders = sorted(
        (d for d in ROOT.iterdir()
         if d.is_dir() and not d.name.startswith(".") and d.name not in IGNORE),
        key=natural_key,
    )
    root_java = sorted(ROOT.glob("*.java"), key=natural_key)
    totale = sum(len(java_files(d)) for d in folders) + len(root_java)

    out = [
        f"{badge('cartelle', len(folders), 'blue')} "
        f"{badge('file%20Java', totale, 'ED8B00')}",
        "",
        "| | Cartella | Argomento | Concetti chiave | File | |",
        "|:-:|----------|-----------|-----------------|:----:|:-:|",
    ]
    for d in folders:
        i = info(descr, d.name)
        tags = " ".join(f"`{t}`" for t in i["tag"]) or "—"
        n = len(java_files(d))
        out.append(
            f"| {i['icona']} | **{d.name}** | {i['titolo']} | {tags} "
            f"| {badge('file', n, 'ED8B00')} | {button('Apri', url(d, 'tree'))} |"
        )
    for f in root_java:
        out.append(
            f"| 📄 | **{f.name}** | File nella root | — "
            f"| {badge('file', 1, 'ED8B00')} | {button('Apri', url(f, 'blob'))} |"
        )

    out += ["", "#### 🔎 Esplora i file", ""]
    for d in folders:
        files = java_files(d)
        i = info(descr, d.name)
        out.append(f"<details>\n<summary>{i['icona']} <b>{d.name}</b> — {len(files)} file</summary>\n")
        if files:
            out += [f"- [`{f.relative_to(d).as_posix()}`]({url(f, 'blob')})" for f in files]
        else:
            out.append("- *Nessun file `.java` per ora.*")
        out.append("\n</details>\n")

    out.append("> *Sezione generata automaticamente: non modificarla a mano.*")
    block = f"{START}\n\n" + "\n".join(out) + f"\n\n{END}"

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
