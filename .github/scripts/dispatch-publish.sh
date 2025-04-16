#!/bin/bash
set -euo pipefail

MODULES_STRING="$1"
TAG="$2"
REPO="salute-developers/plasma-android"

echo "📦 Dispatching publish events for modules:"
echo "$MODULES_STRING"

IFS=' ' read -ra MODULES <<< "$MODULES_STRING"

# Для publish-tokens соберём список модулей
TOKENS_MODULES=()

for MODULE in "${MODULES[@]}"; do
  echo "➡️ Processing module: $MODULE"

  EVENT_TYPE=""
  PAYLOAD=""

  case "$MODULE" in
    ":sdds-core:uikit-compose")
      EVENT_TYPE="publish-uikit-compose"
      PAYLOAD="{\"tag\": \"$TAG\"}"
      ;;
    ":sdds-core:uikit")
      EVENT_TYPE="publish-uikit"
      PAYLOAD="{\"tag\": \"$TAG\"}"
      ;;
    ":sdds-core:plugin_theme_builder")
      EVENT_TYPE="publish-plugin-theme-builder"
      PAYLOAD="{\"tag\": \"$TAG\"}"
      ;;
    ":playground:sandbox-compose")
      EVENT_TYPE="publish-sandbox"
      PAYLOAD="{\"tag\": \"$TAG\"}"
      ;;
    :tokens:*)
      TOKENS_MODULES+=("$MODULE")
      continue  # пропускаем прямую отправку — обработаем потом все вместе
      ;;
    *)
      echo "⚠️ Unknown module: $MODULE — skipping"
      continue
      ;;
  esac

  echo "🚀 Dispatching $EVENT_TYPE with payload: $PAYLOAD"

  curl -s -X POST "https://api.github.com/repos/$REPO/dispatches" \
    -H "Accept: application/vnd.github+json" \
    -H "Authorization: Bearer ${GH_TOKEN}" \
    -d @- <<EOF
{
  "event_type": "$EVENT_TYPE",
  "client_payload": $PAYLOAD
}
EOF

done

# Отправим одно событие для всех tokens-модулей
if [[ ${#TOKENS_MODULES[@]} -gt 0 ]]; then
  MODULE_LIST=$(printf "\"%s\", " "${TOKENS_MODULES[@]}" | sed 's/, $//')
  PAYLOAD="{\"modules\": [ $MODULE_LIST ], \"tag\": \"$TAG\"}"

  echo "🚀 Dispatching publish-tokens for modules: ${TOKENS_MODULES[*]}"
  echo "📦 Payload: $PAYLOAD"

  curl -s -X POST "https://api.github.com/repos/$REPO/dispatches" \
    -H "Accept: application/vnd.github+json" \
    -H "Authorization: Bearer ${GH_TOKEN}" \
    -d @- <<EOF
{
  "event_type": "publish-tokens",
  "client_payload": $PAYLOAD
}
EOF
fi