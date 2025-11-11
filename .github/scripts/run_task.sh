#!/usr/bin/env bash
set -euo pipefail

# Usage:
#   ./run_task.sh <gradle_task> <changed_modules_json_or_space_separated> [extra gradle args...]
#
# Examples:
#   ./run_task.sh lintDebug '${{ needs.detect_changes.outputs.changed }}'
#   ./run_task.sh detekt '${{ needs.detect_changes.outputs.changed }}' --continue --no-daemon
#
# Notes:
# - The second argument can be a JSON array (e.g. '[" :app",":core:ui" ]') or a space-separated list (':app :core:ui').
# - All remaining arguments are forwarded to Gradle as-is.

if [[ $# -lt 2 ]]; then
  echo "Usage: $0 <gradle_task> <changed_modules_json_or_space_separated> [extra gradle args...]"
  exit 2
fi

TASK="$1"; shift
MODULES_ARG="$1"; shift

# Parse modules either from JSON array or space-separated list
MODULES=()
if [[ "$MODULES_ARG" =~ ^\[ ]]; then
  if ! command -v jq >/dev/null 2>&1; then
    echo "jq is required to parse JSON input for modules." >&2
    exit 3
  fi
  # Normalize JSON (remove spaces/newlines) and extract as lines
  while IFS= read -r m; do
    MODULES+=("$m")
  done < <(printf '%s' "$MODULES_ARG" | jq -r '.[]')
else
  # Treat as space-separated list
  # shellcheck disable=SC2206
  MODULES=($MODULES_ARG)
fi

# Trim empty entries and surrounding quotes
CLEANED_MODULES=()
for m in "${MODULES[@]}"; do
  # remove surrounding quotes if any
  m="${m%\"}"
  m="${m#\"}"
  # skip empties
  if [[ -n "${m// /}" ]]; then
    CLEANED_MODULES+=("$m")
  fi
done

if [[ ${#CLEANED_MODULES[@]} -eq 0 ]]; then
  echo "No changed modules detected. Skipping Gradle task '$TASK'."
  exit 0
fi

# Build Gradle task list: :module:task
GRADLE_TASKS=()
for mod in "${CLEANED_MODULES[@]}"; do
  # Ensure module path starts with a colon
  if [[ "$mod" != :* ]]; then
    mod=":$mod"
  fi
  GRADLE_TASKS+=("${mod}:${TASK}")
done

# Forward any extra args to Gradle (robust under `set -u`)
if (( $# > 0 )); then
  EXTRA_ARGS=("$@")
else
  EXTRA_ARGS=()
fi

echo "Running Gradle for changed modules:"
printf '  - %s\n' "${CLEANED_MODULES[@]}"
echo "Task: $TASK"
if (( ${#EXTRA_ARGS[@]} > 0 )); then
  echo "Extra Gradle args: ${EXTRA_ARGS[*]}"
fi

# Run all module-scoped tasks in a single Gradle invocation for speed
if (( ${#EXTRA_ARGS[@]} > 0 )); then
  echo "Executing: ./gradlew ${GRADLE_TASKS[*]} ${EXTRA_ARGS[*]}"
  ./gradlew "${GRADLE_TASKS[@]}" "${EXTRA_ARGS[@]}"
else
  echo "Executing: ./gradlew ${GRADLE_TASKS[*]}"
  ./gradlew "${GRADLE_TASKS[@]}"
fi