## 1. Token docs: декларативный user source

- [x] 1.1 Добавить `tokens/plasma.homeds.compose/docs/override-docs/structure.json`, перечислив три существующих append override и две standalone pages с логическими путями без `+`
- [x] 1.2 Добавить `tokens/sdds-sbcom-compose/docs/override-docs/structure.json` для append override страницы Indication
- [x] 1.3 Исправить repository-relative ссылки в standalone user markdown на bundle-safe логические ссылки
- [x] 1.4 Проверить, что token modules без user markdown не получают фиктивный `structure.json`

## 2. sdds-core: Gradle inputs и раздельный output

- [x] 2.1 Расширить documentation capability/task optional user documentation root с convention на `override-docs` и обновить KDoc Gradle contract
- [x] 2.2 Перенести насыщенный Core markdown из `content/**` в `content/core/**`, сохранив `structure-core.json`
- [x] 2.3 Не создавать `structure-user.json` и `content/user` при отсутствии user structure
- [x] 2.4 Обновить plugin/task tests для нового breaking output layout и optional Gradle input

## 3. sdds-core: user structure и legacy source resolver

- [x] 3.1 Прочитать и провалидировать `override-docs/structure.json`, сохраняя navigation metadata без изменений
- [x] 3.2 Реализовать logical-to-physical resolver: standalone page → обычный markdown, Core append → `+Name.md`, Core replace → обычный markdown
- [x] 3.3 Отклонять Core collision без explicit merge, append без `+`, plus для standalone page, unsupported prepend и небезопасные paths
- [x] 3.4 Записывать только перечисленные user pages в `content/user/**` и user structure в `structure-user.json`
- [x] 3.5 Добавить unit-тесты standalone, append, replace, отсутствующего user layer, unlisted draft, missing source и всех invalid mapping scenarios

## 4. sdds-core: единое platform enrichment

- [x] 4.1 Обобщить Core enrichment processor для повторного использования Core и user layers без предварительного merge
- [x] 4.2 Насыщать user Kotlin/XML `@sample` directives локальными examples с диагностикой layer, logical path и reference
- [x] 4.3 Насыщать user Compose `@style-api`, сохраняя screenshot directives как ключи
- [x] 4.4 Сохранить общие `assets/examples`, `assets/screenshots` и `meta` outputs и добавить collision checks для несовпадающих assets
- [x] 4.5 Добавить regression-тест одинакового Core/user logical path с двумя отдельными output files

## 5. Legacy Docusaurus compatibility

- [x] 5.1 Добавить focused regression-тест, что `mergePlusPrefixedDocs` продолжает дописывать `+*.md` к Core page
- [x] 5.2 Проверить, что новые `override-docs/structure.json` не влияют на Docusaurus copy/transform и не публикуются как markdown
- [x] 5.3 Выполнить Docusaurus generation для `plasma.homeds.compose` и `sdds-sbcom-compose` и сравнить append/standalone semantics

## 6. Интеграционная и статическая проверка

- [x] 6.1 Выполнить focused unit-тесты `sdds-core:plugin_theme_builder` и затронутые `build-system:conventions` tests
- [x] 6.2 Выполнить `documentationAggregate` для Compose DS с user layer и проверить обе structures, `content/core`, `content/user`, examples, screenshots и meta
- [x] 6.3 Выполнить `documentationAggregate` для View DS без user layer и проверить только Core namespace
- [x] 6.4 Запустить релевантные detekt и Spotless задачи затронутых included builds из корня репозитория
- [x] 6.5 Выполнить strict OpenSpec validation и `git diff --check`
