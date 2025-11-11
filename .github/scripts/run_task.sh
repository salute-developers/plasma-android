#!/usr/bin/env bash
set -euo pipefail

# Usage:
#   ./run_task.sh <gradle_task> <changed_modules_json_or_space_separated> [extra gradle args...]
#
# Examples:
#   ./run_task.sh lintDebug '${{ needs.detect_changes.outputs.changed }}'
#   ./run_task.sh detekt '${{ needs.detect_changes.outputs.changed }}' --continue --no-daemon
#   ./run_task.sh test '${{ needs.detect_changes.outputs.changed }}' --ignore-modules=:tokens,:legacy:ui
#
# Notes:
# - The second argument can be a JSON array (e.g. '[" :app",":core:ui" ]') or a space-separated list (':app :core:ui').
# - All remaining arguments are forwarded to Gradle as-is.
# - Optional flag: --ignore-modules=<comma separated list>. Each entry may be a full module path (":app") or a common prefix (":tokens") to ignore that module and its submodules.

if [[ $# -lt 2 ]]; then
  echo "Usage: $0 <gradle_task> <changed_modules_json_or_space_separated> [extra gradle args...]"
  exit 2
fi

TASK="$1"; shift
MODULES_ARG="$1"; shift

# Collect our custom flags and the remaining args to forward to Gradle
declare -a IGNORE_PATTERNS=()
declare -a FORWARDED_ARGS=()
while (( $# > 0 )); do
  case "$1" in
    --ignore-modules|--ignore)
      if [[ "$1" == *=* ]]; then
        VAL="${1#*=}"
      else
        shift
        VAL="${1-}"
      fi
      # split by comma
      IFS=',' read -r -a _TMP_IGN <<< "$VAL"
      for p in "${_TMP_IGN[@]}"; do
        p="${p%\"}"; p="${p#\"}"
        p="${p// /}"
        if [[ -n "$p" ]]; then
          # ensure starts with ':'
          [[ "$p" != :* ]] && p=":$p"
          IGNORE_PATTERNS+=("$p")
        fi
      done
      ;;
    --ignore-modules=*|--ignore=*)
      VAL="${1#*=}"
      IFS=',' read -r -a _TMP_IGN <<< "$VAL"
      for p in "${_TMP_IGN[@]}"; do
        p="${p%\"}"; p="${p#\"}"
        p="${p// /}"
        if [[ -n "$p" ]]; then
          [[ "$p" != :* ]] && p=":$p"
          IGNORE_PATTERNS+=("$p")
        fi
      done
      ;;
    *)
      FORWARDED_ARGS+=("$1")
      ;;
  esac
  shift
done

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

# Apply ignore filters (exact module or prefix like :tokens)
if (( ${#IGNORE_PATTERNS[@]} > 0 )); then
  FILTERED_MODULES=()
  for m in "${CLEANED_MODULES[@]}"; do
    SKIP=0
    for p in "${IGNORE_PATTERNS[@]}"; do
      if [[ "$m" == "$p" || "$m" == "$p:"* ]]; then
        SKIP=1; break
      fi
    done
    (( SKIP == 0 )) && FILTERED_MODULES+=("$m")
  done
else
  FILTERED_MODULES=("${CLEANED_MODULES[@]}")
fi

# Replace CLEANED_MODULES with filtered set
CLEANED_MODULES=("${FILTERED_MODULES[@]}")

if [[ ${#CLEANED_MODULES[@]} -eq 0 ]]; then
  echo "No applicable modules to run after filtering. Skipping Gradle task '$TASK'."
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

# Forward any extra args to Gradle (after stripping our custom flags)
if (( ${#FORWARDED_ARGS[@]:-0} > 0 )); then
  EXTRA_ARGS=("${FORWARDED_ARGS[@]}")
else
  EXTRA_ARGS=()
fi

echo "Running Gradle for changed modules:"
printf '  - %s\n' "${CLEANED_MODULES[@]}"
if (( ${#IGNORE_PATTERNS[@]} > 0 )); then
  echo "Ignored patterns: ${IGNORE_PATTERNS[*]}"
fi
echo "Task: $TASK"
if (( ${#EXTRA_ARGS[@]:-0} > 0 )); then
  echo "Extra Gradle args: ${EXTRA_ARGS[*]}"
fi

# Run all module-scoped tasks in a single Gradle invocation for speed
if (( ${#EXTRA_ARGS[@]:-0} > 0 )); then
  echo "Executing: ./gradlew ${GRADLE_TASKS[*]} ${EXTRA_ARGS[*]:-}"
  ./gradlew "${GRADLE_TASKS[@]}" ${EXTRA_ARGS[@]:+"${EXTRA_ARGS[@]}"}
else
  echo "Executing: ./gradlew ${GRADLE_TASKS[*]}"
  ./gradlew "${GRADLE_TASKS[@]}"
fi