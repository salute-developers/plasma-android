#!/bin/bash
set -euo pipefail

FROM_REF=${1:?Usage: verify-release-versions.sh <from-ref> <modules>}
MODULES_STRING=${2:-}

if [[ -z "$MODULES_STRING" ]]; then
  echo "No modules to verify"
  exit 0
fi

module_directory() {
  local module=$1
  local directory=${module#:}
  directory=${directory//://}

  if [[ "$module" == :sdds-haze:* ]]; then
    directory="third-party/$directory"
  fi

  echo "$directory"
}

read_version() {
  awk -F= '
    $1 == "versionMajor" { major = $2 }
    $1 == "versionMinor" { minor = $2 }
    $1 == "versionPatch" { patch = $2 }
    END {
      if (major !~ /^[0-9]+$/ || minor !~ /^[0-9]+$/ || patch !~ /^[0-9]+$/) {
        exit 1
      }
      print major "." minor "." patch
    }
  '
}

is_version_greater() {
  local current=$1
  local previous=$2
  local current_major current_minor current_patch
  local previous_major previous_minor previous_patch

  IFS=. read -r current_major current_minor current_patch <<< "$current"
  IFS=. read -r previous_major previous_minor previous_patch <<< "$previous"

  current_major=$((10#$current_major))
  current_minor=$((10#$current_minor))
  current_patch=$((10#$current_patch))
  previous_major=$((10#$previous_major))
  previous_minor=$((10#$previous_minor))
  previous_patch=$((10#$previous_patch))

  (( current_major > previous_major )) ||
    (( current_major == previous_major && current_minor > previous_minor )) ||
    (( current_major == previous_major && current_minor == previous_minor && current_patch > previous_patch ))
}

declare -a FAILURES=()

for MODULE in $MODULES_STRING; do
  DIRECTORY=$(module_directory "$MODULE")
  PROPERTIES_PATH="$DIRECTORY/gradle.properties"

  if [[ ! -f "$PROPERTIES_PATH" ]]; then
    FAILURES+=("$MODULE: $PROPERTIES_PATH does not exist")
    continue
  fi

  if ! CURRENT_VERSION=$(read_version < "$PROPERTIES_PATH"); then
    FAILURES+=("$MODULE: current version is missing or invalid in $PROPERTIES_PATH")
    continue
  fi

  if ! PREVIOUS_PROPERTIES=$(git show "$FROM_REF:$PROPERTIES_PATH" 2>/dev/null); then
    echo "New module $MODULE has version $CURRENT_VERSION; no version exists at $FROM_REF"
    continue
  fi

  if ! PREVIOUS_VERSION=$(read_version <<< "$PREVIOUS_PROPERTIES"); then
    FAILURES+=("$MODULE: version at $FROM_REF is missing or invalid in $PROPERTIES_PATH")
    continue
  fi

  if is_version_greater "$CURRENT_VERSION" "$PREVIOUS_VERSION"; then
    echo "Verified $MODULE: $PREVIOUS_VERSION -> $CURRENT_VERSION"
  else
    FAILURES+=("$MODULE: version must be greater than $PREVIOUS_VERSION, but is $CURRENT_VERSION")
  fi
done

if (( ${#FAILURES[@]} > 0 )); then
  echo "Release version verification failed:" >&2
  printf '  - %s\n' "${FAILURES[@]}" >&2
  echo "Run the bump task for every module listed above before publishing the release." >&2
  exit 1
fi

echo "All release module versions were bumped"
