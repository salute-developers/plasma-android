#!/bin/bash
set -euo pipefail

FROM_TAG=$1

echo "🔍 Detecting changed modules since $FROM_TAG"

declare -a MODULES_SET=()
CHANGED_TOKENS=false

while IFS= read -r FILE; do
  echo "➡️ Checking file: $FILE"

  # sdds-core (excluding icons/ and testing/)
  if [[ "$FILE" == sdds-core/*/* ]]; then
    FIRST=$(echo "$FILE" | cut -d '/' -f2)
    if [[ "$FIRST" != "icons" && "$FIRST" != "testing" ]]; then
      MODULE=":sdds-core:$FIRST"
      MODULES_SET+=("$MODULE")
      echo "✅ Matched: $MODULE"
    fi
  fi

  # tokens/*
  if [[ "$FILE" == tokens/* ]]; then
    CHANGED_TOKENS=true
  fi

  # playground/sandbox-compose
  if [[ "$FILE" == playground/sandbox-compose/* ]]; then
    MODULE=":playground:sandbox-compose"
    MODULES_SET+=("$MODULE")
    echo "✅ Matched: $MODULE"
  fi
done < <(git diff --name-only "$FROM_TAG" HEAD)

if [[ "$CHANGED_TOKENS" == true ]]; then
  echo "📦 Detected changes in tokens/, enumerating submodules from git diff..."

  TOKEN_MODULES=$(git diff --name-only "$FROM_TAG" HEAD | \
    grep '^tokens/.*/' | cut -d '/' -f2 | sort -u)

  for NAME in $TOKEN_MODULES; do
    if [[ -d "tokens/$NAME" ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "✅ Added token module: $MODULE"
    else
      echo "⏭ Skipped file-level token: tokens/$NAME"
    fi
  done
fi

UNIQUE_MODULES=$(printf "%s\n" "${MODULES_SET[@]}" | sort -u | xargs)
echo "✅ Final module list: $UNIQUE_MODULES"

# Output for GitHub Actions
echo "modules=$UNIQUE_MODULES" >> "$GITHUB_OUTPUT"