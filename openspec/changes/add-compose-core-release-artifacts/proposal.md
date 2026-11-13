## Why

DS Builder закрепляет опубликованные версии ДС за неизменяемым Core и совместимым preview. Текущий Compose-архив содержит версию UIKit и хеш меты, но не координаты `coreRelease`; кроме того, разные исходники `develop` могут иметь одинаковую версию UIKit. Нужны согласованный контракт производителя и настоящие сборки A/B для проверки истории, конфликтов и позднего preview.

## What Changes

- Дополнить manifest `integration-core/preview-compose-plugin` полем `coreRelease: {libraryId, platform, version}`; сохранить массив `api-meta.json`, его исходные байты и существующий browser protocol.
- Зафиксировать `libraryId = uikit-compose`, `platform = compose`, равенство `coreRelease.version` и `uikitComposeVersion`, независимость этих координат от идентификатора preview-сборки.
- Разделить стабильную версию Core для релизного источника и явно назначенную prerelease-версию для dev/проверочных исходников. Изменённая мета не публикуется под уже использованной версией.
- Расширить проверку архива и существующий CI публикации; закрепить совместимую версию DS Builder CLI перед включением отправки нового формата. **BREAKING для старых архивов:** новый DS Builder требует `coreRelease`; старые ZIP нужно пересобрать, а не дописать manifest вручную.
- Добавить воспроизводимый рецепт A/B: изолированные исходники, реальный KSP → UIKit → Wasm preview, удаление deprecated-свойства из меты B, контрольные суммы и отчёт происхождения. Дополнительная сборка B2 того же Core проверяет однократное закрепление preview.
- Документировать передачу артефактов в локальный контур DS Builder и сквозные проверки; публикация Core остаётся технической операцией и не выпускает ДС.

## Capabilities

### New Capabilities

- `compose-core-release-artifacts`: координаты Core, политика версий, проверка исходных байтов и согласованная упаковка/публикация Compose preview.
- `compose-core-release-verification`: воспроизводимые A/B/B2, происхождение артефактов и измеримые проверки с DS Builder.

### Modified Capabilities

Нет. Существующие требования генерации меты, preview-фабрик, реестра компонентов и browser bridge сохраняются; новые спецификации дополняют контракт поставки.

## Impact

- Основные изменения: `integration-core/preview-compose-plugin` (Gradle-упаковка, manifest, Node-проверки, README, проверочный рецепт) и `.github/workflows/publish-preview-plugin.yml`.
- `sdds-core/uikit-compose` и `sdds-core/api-info-ksp` используются для сборки настоящей меты. Изменение аннотации свойства для B применяется только в изолированном проверочном checkout; публичный Kotlin API основной библиотеки не удаляется. Алгоритмы KSP, Theme Builder и генерации ДС не меняются.
- `tokens`, генерация документации и общие Gradle conventions не требуют изменений. Документируются параметры локальной упаковки и CI; KDoc обновляется, если реализация вводит именованные публичные Gradle-типы.
- Связанный change DS Builder: `version-core-entities-and-preview`, задачи 1.1 и 8.1–8.4. Нужны совместимые CLI/backend, PostgreSQL/S3/gateway и редактор. Android change поставляет артефакты и свидетельства, а не реализует серверные конфликты/публикацию ДС.
- Проверки: тесты manifest/архива и версий, JVM-тесты preview, настоящие production Wasm-сборки и browser-тесты A/B/B2, затем локальные сквозные сценарии DS Builder. Бинарные архивы и локальные результаты не добавляются в Git.
