#!/bin/bash
set -euo pipefail

FROM_TAG=$1

echo "🔍 Detecting changed modules since $FROM_TAG"

# Track if affected special dirs
UIKIT_COMPOSE_CHANGED=false
UIKIT_CHANGED=false
TESTING_CHANGED=false

declare -a MODULES_SET=()
CHANGED_TOKENS=false
INCLUDE_SANDBOX=false

while IFS= read -r FILE; do
  echo "➡️ Checking file: $FILE"

  if [[ "$FILE" == sdds-core/*/* ]]; then
    INCLUDE_SANDBOX=true
  fi

  # sdds-core (excluding icons/ and testing/)
  if [[ "$FILE" == sdds-core/*/* ]]; then
    FIRST=$(echo "$FILE" | cut -d '/' -f2)
    if [[ "$FIRST" == "uikit-compose" ]]; then
      UIKIT_COMPOSE_CHANGED=true
    elif [[ "$FIRST" == "uikit" ]]; then
      UIKIT_CHANGED=true
    elif [[ "$FIRST" == "testing" ]]; then
      TESTING_CHANGED=true
    fi
    if [[ "$FIRST" != "icons" && "$FIRST" != "testing" ]]; then
      MODULE=":sdds-core:$FIRST"
      MODULES_SET+=("$MODULE")
      echo "✅ Matched: $MODULE"
    fi
  fi

  # tokens/*
  if [[ "$FILE" == tokens/* ]]; then
    INCLUDE_SANDBOX=true
    CHANGED_TOKENS=true
  fi

  # playground/sandbox-compose
  if [[ "$FILE" == playground/sandbox-compose/* ]]; then
    MODULE=":playground:sandbox-compose"
    MODULES_SET+=("$MODULE")
    echo "✅ Matched: $MODULE"
  fi
done < <(git diff --name-only "$FROM_TAG" HEAD)

if [[ "$UIKIT_COMPOSE_CHANGED" == true || "$UIKIT_CHANGED" == true || "$TESTING_CHANGED" == true ]]; then
  echo "🔁 Resolving token modules due to changes in uikit or testing"

  for DIR in tokens/*/; do
    NAME=$(basename "$DIR")
    if [[ "$UIKIT_COMPOSE_CHANGED" == true && "$NAME" == *compose* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added compose token module due to uikit-compose change: $MODULE"
    elif [[ "$UIKIT_CHANGED" == true && "$NAME" == *view* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added view token module due to uikit change: $MODULE"
    elif [[ "$TESTING_CHANGED" == true && ( "$NAME" == *view* || "$NAME" == *compose* ) ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added token module due to testing change: $MODULE"
    fi
  done
fi

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

if [[ "$INCLUDE_SANDBOX" == true ]]; then
  MODULE=":playground:sandbox-compose"
  MODULES_SET+=("$MODULE")
  echo "📦 Included sandbox-compose due to core/tokens changes"
fi

UNIQUE_MODULES=$(printf "%s\n" "${MODULES_SET[@]:-}" | sort -u | xargs)
echo "✅ Final module list: $UNIQUE_MODULES"

# Output for GitHub Actions
#echo "modules=$UNIQUE_MODULES" >> "$GITHUB_OUTPUT"