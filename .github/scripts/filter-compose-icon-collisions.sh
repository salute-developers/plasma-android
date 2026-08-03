#!/usr/bin/env bash
#
# Remove the 6 icon variants that collide on case-insensitive file systems
# (macOS/Windows) once Valkyrie strips underscores when turning file names into
# PascalCase property names. This is applied ONLY to the input of the Compose
# icon generation — the XML drawable module keeps both variants of each pair
# (there underscores are preserved, so there is no collision).
#
# The two variants of each pair are DIFFERENT glyphs, so this drops a real icon
# from the Compose pack by design (see openspec/changes/add-icons-compose-module
# design.md, decision 4). Root fix belongs upstream in plasma (sber->Sb).
#
# For each pair we KEEP the "ic_sb_boom_*" / "ic_sb_box_top_outline_*" variant
# (literal "Sb") and DROP the "ic_sbboom_*" / "ic_sbbox_top_outline_*" variant
# (former "Sber", mangled to "Sb" by plasma's sber->Sb transform).
#
# We match EXACT file names (stem + size), not a glob prefix: a prefix like
# "ic_sbboom_*" would miss "ic_sbbox_top_outline" (sbbox, not sbboom), and a
# broader "ic_sbbo*" risks catching unrelated icons.
#
# Usage: filter-compose-icon-collisions.sh <input-dir>
set -euo pipefail

INPUT_DIR="${1:?usage: filter-compose-icon-collisions.sh <input-dir>}"

if [[ ! -d "$INPUT_DIR" ]]; then
  echo "error: input dir not found: $INPUT_DIR" >&2
  exit 1
fi

# Exact stems of the variant to DROP from the Compose pack.
DROP_STEMS=(
  ic_sbboom_cast
  ic_sbboom_error
  ic_sbboom_mini_cast_outline
  ic_sbboom_mini_error_fill
  ic_sbboom_mini_error_outline
  ic_sbbox_top_outline
)
SIZES=(16 24 36)

removed=0
for stem in "${DROP_STEMS[@]}"; do
  for size in "${SIZES[@]}"; do
    f="${INPUT_DIR}/${stem}_${size}.xml"
    if [[ -f "$f" ]]; then
      rm -f "$f"
      echo "dropped: ${stem}_${size}.xml"
      removed=$((removed + 1))
    fi
  done
done

echo "filter-compose-icon-collisions: removed ${removed} file(s) from ${INPUT_DIR}"
