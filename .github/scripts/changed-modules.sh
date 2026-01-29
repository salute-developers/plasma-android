#!/bin/bash
set -euo pipefail

FROM_TAG=$1

echo "🔍 Detecting changed modules since $FROM_TAG"

# Track if affected special dirs
UIKIT_COMPOSE_CHANGED=false
UIKIT_CHANGED=false
TESTING_CHANGED=false
TESTING_CHANGED_TARGET=""
TESTING_SEEN_VS=false
TESTING_SEEN_COMPOSE=false

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
    if [[ "$FIRST" == "uikit-compose" || "$FIRST" == "uikit-compose-fixtures" ]]; then
      UIKIT_COMPOSE_CHANGED=true
    elif [[ "$FIRST" == "uikit" || "$FIRST" == "uikit-fixtures" ]]; then
      UIKIT_CHANGED=true
    elif [[ "$FIRST" == "testing" ]]; then
      TESTING_CHANGED=true
      # Track which testing flavors changed
      if [[ "$FILE" == */vs/* ]]; then
        TESTING_SEEN_VS=true
      fi
      if [[ "$FILE" == */compose/* ]]; then
        TESTING_SEEN_COMPOSE=true
      fi
    fi
    if [[ "$FIRST" != "icons" && "$FIRST" != "testing" && "$FIRST" != "gradle"]]; then
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

# Resolve testing target based on observed paths
if [[ "$TESTING_CHANGED" == true ]]; then
  if [[ "$TESTING_SEEN_VS" == true && "$TESTING_SEEN_COMPOSE" == true ]]; then
    TESTING_CHANGED_TARGET="all"
  elif [[ "$TESTING_SEEN_VS" == true ]]; then
    TESTING_CHANGED_TARGET="view"
  elif [[ "$TESTING_SEEN_COMPOSE" == true ]]; then
    TESTING_CHANGED_TARGET="compose"
  else
    # Default when testing changed but neither subfolder matched explicitly
    TESTING_CHANGED_TARGET="none"
  fi
else
  TESTING_CHANGED_TARGET="none"
fi

echo "🧪 Testing target resolved: $TESTING_CHANGED_TARGET"

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
    elif [[ "$TESTING_CHANGED_TARGET" == "view" && "$NAME" == *view* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added view token module due to testing change: $MODULE"
    elif [[ "$TESTING_CHANGED_TARGET" == "compose" && "$NAME" == *compose* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added compose token module due to testing change: $MODULE"
    elif [[ "$TESTING_CHANGED_TARGET" == "all" && ( "$NAME" == *view* || "$NAME" == *compose* ) ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added token module for all testing targets: $MODULE"
    fi
  done
fi

if [[ "$CHANGED_TOKENS" == true ]]; then
  echo "📦 Detected changes in tokens/, enumerating submodules from git diff..."

  TOKEN_MODULES=$(git diff --name-only "$FROM_TAG" HEAD | \
    grep '^tokens/.*/' | cut -d '/' -f2 | sort -u) || true

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

# Apply ignore list from .ignore-changed-modules (if exists)
IGNORED_MODULES=()
if [[ -f ".ignore-changed-modules" ]]; then
  echo "🚫 Applying .ignore-changed-modules"
  while IFS= read -r LINE || [[ -n "$LINE" ]]; do
    # skip empty lines and comments
    [[ -z "$LINE" || "$LINE" =~ ^# ]] && continue
    IGNORED_MODULES+=("$LINE")
  done < .ignore-changed-modules
fi

if [[ ${#IGNORED_MODULES[@]} -gt 0 ]]; then
  FILTERED_MODULES=()
  for MODULE in $UNIQUE_MODULES; do
    SKIP=false
    for IGNORED in "${IGNORED_MODULES[@]}"; do
      if [[ "$MODULE" == "$IGNORED" ]]; then
        echo "🚫 Excluded module: $MODULE"
        SKIP=true
        break
      fi
    done
    if [[ "$SKIP" == false ]]; then
      FILTERED_MODULES+=("$MODULE")
    fi
  done
  UNIQUE_MODULES=$(printf "%s " "${FILTERED_MODULES[@]}")
fi

echo "✅ Final module list: $UNIQUE_MODULES"

# Output testing target for GitHub Actions
echo "testing_changed_target=$TESTING_CHANGED_TARGET" >> "$GITHUB_OUTPUT"

# Output for GitHub Actions
echo "modules=$UNIQUE_MODULES" >> "$GITHUB_OUTPUT"