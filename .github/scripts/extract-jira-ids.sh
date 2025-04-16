#!/bin/bash
set -euo pipefail

# 📥 Аргумент: список PR ID через запятую
PULL_REQUESTS_IDS="$1"
OWNER="salute-developers"
REPO="plasma-android"

JIRA_IDS=()

IFS=',' read -ra PR_IDS <<< "$PULL_REQUESTS_IDS"

echo "🔍 Получаем JIRA ID из PR: $PULL_REQUESTS_IDS"

for PR_ID in "${PR_IDS[@]}"; do
  echo "➡️ Обрабатываем PR #$PR_ID"

  # Получаем JSON с PR через GitHub CLI
  PR_DATA=$(gh pr view "$PR_ID" --repo "$OWNER/$REPO" --json title -q .title || true)

  if [[ -n "$PR_DATA" ]]; then
    echo "🔤 PR title: $PR_DATA"

    if [[ "$PR_DATA" =~ (plasma-[0-9]+) ]]; then
      JIRA_ID="${BASH_REMATCH[1]}"
      echo "✅ Найден JIRA ID: $JIRA_ID"
      JIRA_IDS+=("$JIRA_ID")
    else
      echo "⚠️ JIRA ID не найден в заголовке"
    fi
  else
    echo "❌ Ошибка при получении PR #$PR_ID"
  fi
done

echo "🎯 Все найденные задачи:"
printf "%s\n" "${JIRA_IDS[@]}"

# 👉 Вывод в формате, который можно использовать в GitHub Actions output
echo "jira_ids=$(IFS=, ; echo "${JIRA_IDS[*]}")" >> "$GITHUB_OUTPUT"