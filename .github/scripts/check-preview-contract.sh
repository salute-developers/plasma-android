#!/usr/bin/env bash
# Сверяет отпечатки копии Preview Protocol (integration-core/preview-contract) с каноническими из design-system-builder.
#
# Переменные:
#   DSB_CONTRACT_REF  ветка или тег design-system-builder (по умолчанию dev)
#   CONTRACT_URL      полный адрес CONTRACT.sha256 (для проверки скрипта)
#   MODE              warn - расхождение даёт предупреждение GitHub Actions, error - ошибку (по умолчанию error)
set -uo pipefail

ref="${DSB_CONTRACT_REF:-dev}"
mode="${MODE:-error}"
digest="integration-core/preview-contract/src/commonMain/resources/schemas/v1/DIGEST"
url="${CONTRACT_URL:-https://raw.githubusercontent.com/salute-developers/design-system-builder/${ref}/backend-kt/preview/contract/CONTRACT.sha256}"

report() {
  if [ "$mode" = "warn" ]; then
    echo "::warning title=Preview contract::$1"
    exit 0
  fi
  echo "::error title=Preview contract::$1"
  exit 1
}

canonical="$(mktemp)"
if ! curl -fsSL --retry 3 "$url" -o "$canonical"; then
  report "Не удалось скачать $url"
fi

# В копии фикстуры лежат в fixtures/v1/shared, в каноническом каталоге - в fixtures/v1.
local_normalized="$(sed -E 's#  fixtures/v1/shared/#  fixtures/v1/#' "$digest" | LC_ALL=C sort -k2)"
canonical_sorted="$(LC_ALL=C sort -k2 "$canonical")"

if [ "$local_normalized" = "$canonical_sorted" ]; then
  echo "Копия Preview Protocol совпадает с design-system-builder@${ref}"
  exit 0
fi

changed="$(diff <(echo "$canonical_sorted") <(echo "$local_normalized") | grep '^[<>]' | awk '{print $3}' | sort -u | tr '\n' ' ')"
echo "Расхождение с design-system-builder@${ref}:"
diff <(echo "$canonical_sorted") <(echo "$local_normalized") || true
report "Копия контракта отличается от design-system-builder@${ref}: ${changed}. Обновите: backend-kt/preview/contract/fingerprint.sh --sync-to integration-core/preview-contract/src/commonMain/resources"
