## 1. DS Builder plugin foundation (`sdds-core/plugin_theme_builder`)

- [x] 1.1 Зарегистрировать plugin id `io.github.salute-developers.design-system-builder`, implementation `DsBuilderPlugin` и extension `dsBuilder`, удалив старую регистрацию `themeBuilder`
- [x] 1.2 Реализовать composed extension models для `theme`, `components`, `documentation` и `sandbox` с типизированными Gradle properties и KDoc
- [x] 1.3 Реализовать общий lazy resolver `sddsDirectory`, `.sdds/config.json`, platform-specific `componentsInfoFile` и `themeInfoFile` с точными диагностическими сообщениями
- [x] 1.4 Перевести регистрацию существующих theme/components задач на новый DSL без массового переноса генераторов и подтвердить сохранение tenant-вариаций одной темы
- [x] 1.5 Добавить unit/TestKit tests для plugin id, отсутствия legacy DSL, независимой активации capabilities и поиска `.sdds` в текущем/parent project

## 2. Documentation capability (`sdds-core/plugin_theme_builder`)

- [x] 2.1 Перенести snippet extractor, Kotlin compiler worker, XML extractor, metadata models и unzip task из `build-system` в подпакет `documentation`
- [x] 2.2 Добавить documentation extension для Compose/View, resolvable core snippets configuration и standard output conventions
- [x] 2.3 Реализовать lifecycle-задачу платформенной агрегации snippets, metadata, components info и theme info с declared inputs/outputs
- [x] 2.4 Обеспечить детерминированное объединение core snippet artifacts и понятные ошибки отсутствующих обязательных info-файлов
- [x] 2.5 Добавить unit/TestKit tests для Compose/View conventions, пустых и нескольких core artifacts, aggregation layout и отсутствия portal/network задач в lifecycle graph

## 3. Sandbox capability (`sdds-core/plugin_theme_builder`)

- [x] 3.1 Перенести `GenerateComponentsDictionary`, generator models и Compose/View templates из `build-system` в подпакет `sandbox` и переименовать API по новому назначению
- [x] 3.2 Реализовать `sandbox { compose { ... } / view { ... } }` с properties `componentsInfoFile`, `generatedPackageName`, `themeAlias`, `scheme` и multiplatform mode
- [x] 3.3 Реализовать conventions для package из Android namespace или `componentsInfo.packageName` и для `themeAlias` из базового tenant `.sdds/config.json`
- [x] 3.4 Перенести generated output в `build/generated/sdds/sandbox` и подключить его к Android и Compose Multiplatform Kotlin source sets
- [x] 3.5 Добавить unit/TestKit tests для Compose/View generation, package/theme alias conventions, нескольких tenant-вариаций без selector и generated source wiring

## 4. Пилотная миграция (`tokens`, `build-system`)

- [x] 4.1 Перенести View `config-info`/`theme-info` пилотной дизайн-системы в `.sdds` и мигрировать один Compose и один View theme module на новый plugin id и `dsBuilder`
- [x] 4.2 Мигрировать один Compose и один View docs module с `convention.documentation-*` на documentation capability и проверить существующий Docusaurus consumer
- [x] 4.3 Мигрировать один Compose и один View integration module на sandbox capability, удалить их `integration.*`/`theme-alias` properties и сравнить сгенерированный API
- [x] 4.4 После успешной пилотной проверки удалить перенесённую implementation-логику из documentation/integration conventions либо превратить необходимые переходные места во внутренние consumers нового plugin API

## 5. Полная миграция и cleanup (`tokens`, `build-system`, `sdds-core`)

- [x] 5.1 Мигрировать оставшиеся theme/component modules `tokens` с `themeBuilder` на `dsBuilder`
- [x] 5.2 Мигрировать оставшиеся docs modules на documentation capability и стандартные `.sdds` info paths
- [x] 5.3 Мигрировать оставшиеся integration modules на sandbox capability, сохранив физические имена modules там, где переименование не требуется
- [x] 5.4 Удалить `convention.documentation`, `convention.documentation-compose`, `convention.documentation-view`, `convention.integration-compose`, `convention.integration-view` и неиспользуемые extension/task/resources из `build-system`
- [x] 5.5 Удалить obsolete Gradle properties и обновить version catalog/plugin references на новый plugin id

## 6. Документация и проверка

- [x] 6.1 Обновить README `plugin_theme_builder`, примеры Gradle DSL и KDoc для `.sdds`, documentation и sandbox conventions
- [x] 6.2 Выполнить focused unit/TestKit, detekt и Spotless проверки `sdds-core/plugin_theme_builder`
- [x] 6.3 Собрать пилотные и затем все затронутые Compose/View theme, docs и sandbox modules из корня репозитория
- [x] 6.4 Выполнить полные проверки, безопасные для локального запуска: `./gradlew detektAll` и `./gradlew spotlessApplyAll`; `testAll` не запускать, поскольку он включает screenshot-тесты `tokens`. Зафиксировать отдельно инфраструктурные ограничения полного composite build
  - `spotlessApplyAll` завершён успешно.
  - `detektAll` запускается, но падает на накопленных нарушениях в сгенерированных `tokens` sources (`MaxLineLength`, `UndocumentedPublicFunction`); целевая проверка `plugin_theme_builder:detekt` проходит.

## 7. Исправления после review

- [x] 7.1 Поднять общие target, packageName, resourcePrefix, outputLocation и dimensions на уровень `dsBuilder`, сохранив capability overrides
- [x] 7.2 Мигрировать theme/components consumers на общие generation settings и применить `dimensions.fromResources` к обоим генераторам `plasma-stards-compose`
- [x] 7.3 Изменить default sandbox schema на V2 и покрыть новые conventions тестами

## 8. Исправление documentation enrichment layout

- [x] 8.1 Использовать `.sdds/temp/docs` как корень `documentationAggregate` и обновить всех consumers
- [x] 8.2 Объединять Core `meta.json` и локальную snippet metadata в `meta/samples.json`, сохраняя приоритет локальных записей
- [x] 8.3 Добавить regression tests для Core metadata и итогового layout
- [x] 8.4 Нормализовать Kotlin/XML `snippetPath` относительно `.sdds/temp/docs`

## 9. Исправление активации генерации темы

- [x] 9.1 Включить theme capability во всех корневых `tokens/{ds-module}` проектах, которые до миграции генерировали и тему, и компоненты
