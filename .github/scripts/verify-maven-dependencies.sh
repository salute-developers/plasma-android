#!/bin/bash
set -euo pipefail

MODULES_STRING=${1:-}
MODE=${2:-}
MAVEN_REPOSITORY_URL=${MAVEN_REPOSITORY_URL:-https://repo1.maven.org/maven2}
MAVEN_CHECK_ATTEMPTS=${MAVEN_CHECK_ATTEMPTS:-1}
MAVEN_CHECK_INTERVAL_SECONDS=${MAVEN_CHECK_INTERVAL_SECONDS:-20}
GROUP_ID="io.github.salute-developers"
GROUP_PATH=${GROUP_ID//.//}
REQUIRE_AVAILABLE=false

if [[ "$MODE" == "--require-available" ]]; then
  REQUIRE_AVAILABLE=true
elif [[ -n "$MODE" ]]; then
  echo "Unknown mode: $MODE" >&2
  exit 2
fi

if [[ ! "$MAVEN_CHECK_ATTEMPTS" =~ ^[1-9][0-9]*$ ]] ||
  [[ ! "$MAVEN_CHECK_INTERVAL_SECONDS" =~ ^[0-9]+$ ]]; then
  echo "Maven check attempts must be positive and interval must be non-negative" >&2
  exit 2
fi

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

catalog_version() {
  local catalog=$1
  local key=$2

  awk -F= -v key="$key" '
    {
      name = $1
      gsub(/^[[:space:]]+|[[:space:]]+$/, "", name)
      if (name == key) {
        version = $2
        gsub(/[[:space:]\"]/, "", version)
        print version
        exit
      }
    }
  ' "$catalog"
}

module_is_selected() {
  local expected=$1
  local module

  for module in $MODULES_STRING; do
    if [[ "$module" == "$expected" ]]; then
      return 0
    fi
  done
  return 1
}

# Keep this list aligned with the cases handled by dispatch-publish.sh.
module_has_publish_dispatch() {
  case "$1" in
    :sdds-core:uikit-compose | \
    :sdds-core:uikit | \
    :sdds-core:plugin_theme_builder | \
    :integration-core:sandbox-compose | \
    :integration-core:sandbox-view | \
    :integration-core:sandbox-core | \
    :integration-core:sandbox-ksp | \
    :sdds-haze:haze | \
    :tokens:*)
      return 0
      ;;
    *)
      return 1
      ;;
  esac
}

declare -a FAILURES=()

verify_dependency() {
  local consumer_module=$1
  local dependency_reference=$2
  local artifact_id=$3
  local version=$4
  local provider_module=$5
  local build_file=$6
  local coordinate="$GROUP_ID:$artifact_id:$version"
  local pom_url="$MAVEN_REPOSITORY_URL/$GROUP_PATH/$artifact_id/$version/$artifact_id-$version.pom"
  local http_code attempt

  if ! grep -Eq "$dependency_reference" "$build_file"; then
    return
  fi

  if [[ -z "$version" ]]; then
    FAILURES+=("$consumer_module: cannot determine the version of $artifact_id")
    return
  fi

  for ((attempt = 1; attempt <= MAVEN_CHECK_ATTEMPTS; attempt++)); do
    if ! http_code=$(curl \
      --location \
      --silent \
      --show-error \
      --connect-timeout 10 \
      --max-time 30 \
      --retry 3 \
      --retry-delay 2 \
      --output /dev/null \
      --write-out '%{http_code}' \
      "$pom_url"); then
      FAILURES+=("$consumer_module: failed to check $coordinate in Maven Central")
      return
    fi

    if [[ "$http_code" == "200" ]]; then
      echo "Verified $consumer_module dependency: $coordinate is available"
      return
    fi

    if [[ "$http_code" != "404" ]]; then
      FAILURES+=("$consumer_module: Maven Central returned HTTP $http_code for $coordinate")
      return
    fi

    if [[ "$REQUIRE_AVAILABLE" == false ]] || (( attempt == MAVEN_CHECK_ATTEMPTS )); then
      break
    fi

    echo "Waiting for $coordinate in Maven Central (attempt $attempt/$MAVEN_CHECK_ATTEMPTS)"
    sleep "$MAVEN_CHECK_INTERVAL_SECONDS"
  done

  if [[ "$REQUIRE_AVAILABLE" == true ]]; then
    FAILURES+=("$consumer_module requires missing $coordinate after $MAVEN_CHECK_ATTEMPTS checks")
    return
  fi

  if module_is_selected "$provider_module" && module_has_publish_dispatch "$provider_module"; then
    echo "Verified $consumer_module dependency: $coordinate will be published by $provider_module in this release"
    return
  fi

  if module_is_selected "$provider_module"; then
    FAILURES+=("$consumer_module requires missing $coordinate; $provider_module is selected but has no publish dispatch")
  else
    FAILURES+=("$consumer_module requires missing $coordinate; $provider_module is not scheduled for this release")
  fi
}

verify_local_project_dependency() {
  local consumer_module=$1
  local dependency_reference=$2
  local provider_module=$3
  local build_file=$4
  local provider_directory properties_file artifact_id version
  local major minor patch

  if ! grep -Eq "$dependency_reference" "$build_file"; then
    return
  fi

  provider_directory=$(module_directory "$provider_module")
  properties_file="$provider_directory/gradle.properties"
  if [[ ! -f "$properties_file" ]]; then
    FAILURES+=("$consumer_module: cannot find properties for $provider_module")
    return
  fi

  artifact_id=$(sed -n 's/^nexus.artifactId=//p' "$properties_file")
  major=$(sed -n 's/^versionMajor=//p' "$properties_file")
  minor=$(sed -n 's/^versionMinor=//p' "$properties_file")
  patch=$(sed -n 's/^versionPatch=//p' "$properties_file")
  version="$major.$minor.$patch"

  verify_dependency \
    "$consumer_module" \
    "$dependency_reference" \
    "$artifact_id" \
    "$version" \
    "$provider_module" \
    "$build_file"
}

UIKIT_VERSION=$(catalog_version gradle/libs.versions.toml sdds-uikit)
UIKIT_COMPOSE_VERSION=$(catalog_version gradle/libs.versions.toml sdds-uikit-compose)
HAZE_VERSION=$(catalog_version gradle/libs.versions.toml sdds-haze)
ICONS_VERSION=$(catalog_version gradle/icons.version.toml sdds-icons)
ICONS_COMPOSE_VERSION=$(catalog_version gradle/icons-compose.version.toml sdds-icons-compose)

for MODULE in $MODULES_STRING; do
  DIRECTORY=$(module_directory "$MODULE")
  BUILD_FILE="$DIRECTORY/build.gradle.kts"

  if [[ ! -f "$BUILD_FILE" ]]; then
    FAILURES+=("$MODULE: $BUILD_FILE does not exist")
    continue
  fi

  verify_dependency "$MODULE" 'libs\.sdds\.haze([^[:alnum:]_.]|$)' \
    "sdds-haze" "$HAZE_VERSION" ":sdds-haze:haze" "$BUILD_FILE"
  verify_dependency "$MODULE" 'libs\.sdds\.uikit\.compose([^[:alnum:]_.]|$)' \
    "sdds-uikit-compose" "$UIKIT_COMPOSE_VERSION" ":sdds-core:uikit-compose" "$BUILD_FILE"
  verify_dependency "$MODULE" 'libs\.sdds\.uikit([^[:alnum:]_.]|$)' \
    "sdds-uikit" "$UIKIT_VERSION" ":sdds-core:uikit" "$BUILD_FILE"
  verify_dependency "$MODULE" 'icons\.sdds\.icons([^[:alnum:]_.]|$)' \
    "sdds-icons" "$ICONS_VERSION" ":sdds-core:icons" "$BUILD_FILE"
  verify_dependency "$MODULE" 'iconsCompose\.sdds\.icons\.compose([^[:alnum:]_.]|$)' \
    "sdds-icons-compose" "$ICONS_COMPOSE_VERSION" ":sdds-core:icons-compose" "$BUILD_FILE"

  if [[ "$MODULE" == :integration-core:* ]]; then
    verify_local_project_dependency "$MODULE" 'implementation\(project\(":sandbox-core"\)\)' \
      ":integration-core:sandbox-core" "$BUILD_FILE"
    verify_local_project_dependency "$MODULE" 'implementation\(project\(":sandbox-compose"\)\)' \
      ":integration-core:sandbox-compose" "$BUILD_FILE"
  fi
done

if (( ${#FAILURES[@]} > 0 )); then
  echo "Internal Maven dependency verification failed:" >&2
  printf '  - %s\n' "${FAILURES[@]}" >&2
  echo "Publish the missing dependencies or include their publishable modules in this release." >&2
  exit 1
fi

echo "All internal Maven dependencies are available or scheduled for this release"
