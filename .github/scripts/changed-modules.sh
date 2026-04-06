#!/bin/bash
set -euo pipefail

FROM_TAG=$1

echo "🔍 Detecting changed modules since $FROM_TAG"

# Track if affected special dirs
UIKIT_COMPOSE_CHANGED=false
INTEGR_COMPOSE_CHANGED=false
UIKIT_CHANGED=false
INTEGR_CHANGED=false

declare -a MODULES_SET=()
CHANGED_TOKENS=false
INCLUDE_SANDBOX=false

while IFS= read -r FILE; do
  echo "➡️ Checking file: $FILE"

  # sdds-haze
  if [[ "$FILE" == third-party/sdds-haze/*/* ]]; then
    FIRST=$(echo "$FILE" | cut -d '/' -f3)
    if [[ "$FIRST" == "haze" ]]; then
      MODULE=":sdds-haze:haze"
      MODULES_SET+=("$MODULE")
      echo "✅ Matched: $MODULE"
    fi
  fi


  # sdds-core (excluding icons/ and testing/)
  if [[ "$FILE" == sdds-core/*/* ]]; then
    FIRST=$(echo "$FILE" | cut -d '/' -f2)
    if [[ "$FIRST" == "uikit-compose" ]]; then
      UIKIT_COMPOSE_CHANGED=true
    elif [[ "$FIRST" == "uikit" ]]; then
      UIKIT_CHANGED=true
    fi
    if [[ "$FIRST" != "icons" && "$FIRST" != "testing" && "$FIRST" != "gradle" ]]; then
      MODULE=":sdds-core:$FIRST"
      MODULES_SET+=("$MODULE")
      echo "✅ Matched: $MODULE"
    fi
  fi

  # integration-core
  if [[ "$FILE" == integration-core/*/* ]]; then
    FIRST=$(echo "$FILE" | cut -d '/' -f2)
     if [[ "$FIRST" == "uikit-compose-fixtures" || "$FIRST" == "sandbox-compose" ]]; then
        INTEGR_COMPOSE_CHANGED=true
     elif [[ "$FIRST" == "uikit-fixtures" || "$FIRST" == "sandbox-view"  ]]; then
        INTEGR_CHANGED=true
     elif [[ "$FIRST" == "sandbox-ksp" || "$FIRST" == "sandbox-core" ]]; then
       INTEGR_COMPOSE_CHANGED=true
       INTEGR_CHANGED=true
     fi
    MODULE=":integration-core:$FIRST"
    MODULES_SET+=("$MODULE")
    echo "✅ Matched: $MODULE"
  fi

  # tokens/*
  if [[ "$FILE" == tokens/* ]]; then
    CHANGED_TOKENS=true
  fi
done < <(git diff --name-only "$FROM_TAG" HEAD)

if [[ "$UIKIT_COMPOSE_CHANGED" == true || "$UIKIT_CHANGED" == true || "$INTEGR_COMPOSE_CHANGED" == true || "$INTEGR_CHANGED" == true ]]; then
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
    elif [[ "$INTEGR_CHANGED" == true && "$NAME" == *view* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added view token module due to integration change: $MODULE"
    elif [[ "$INTEGR_COMPOSE_CHANGED" == true && "$NAME" == *compose* ]]; then
      MODULE=":tokens:$NAME"
      MODULES_SET+=("$MODULE")
      echo "🔗 Added compose token module due to integration compose change: $MODULE"
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

UNIQUE_MODULES=$(printf "%s\n" "${MODULES_SET[@]:-}" | sort -u | xargs)
echo "✅ Pre Final module list: $UNIQUE_MODULES"

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

# Check which modules actually exist (to handle deleted modules)
EXISTING_MODULES=()
NON_EXISTENT_MODULES=()
for MODULE in $UNIQUE_MODULES; do
  # Convert Gradle module path to filesystem path
  # :app -> app
  # :core:ui -> core/ui
  FS_PATH="${MODULE#:}"  # Remove leading colon
  FS_PATH="${FS_PATH//://}"  # Replace colons with slashes

  # Check if module directory exists
  if [[ -d "$FS_PATH" ]]; then
    EXISTING_MODULES+=("$MODULE")
  else
    NON_EXISTENT_MODULES+=("$MODULE")
  fi
done

# Report non-existent modules
if (( ${#NON_EXISTENT_MODULES[@]} > 0 )); then
  echo "Warning: The following modules do not exist (they were likely deleted) and will be skipped:" >&2
  printf '  - %s\n' "${NON_EXISTENT_MODULES[@]}" >&2
fi

# Replace CLEANED_MODULES with only existing modules
UNIQUE_MODULES=$(printf "%s " "${EXISTING_MODULES[@]:-}")

echo "✅ Final module list: $UNIQUE_MODULES"

# Output for GitHub Actions
echo "modules=$UNIQUE_MODULES" >> "$GITHUB_OUTPUT"