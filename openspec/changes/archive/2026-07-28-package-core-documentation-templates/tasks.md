## 1. Build system: структура Core-документации

- [x] 1.1 Добавить `compose-template/structure.json` с явной навигацией quick start, theme, graphics и всех существующих component markdown, исключив `CHANGELOG.md`
- [x] 1.2 Добавить `xml-template/structure.json` с явной навигацией quick start, theme, components и focus, исключив `CHANGELOG.md`
- [x] 1.3 Добавить проверку, что все публичные paths обоих `structure.json` существуют, а неописанные markdown не попадают в публичный Core content случайно

## 2. Build system и integration-core: docs-артефакт fixtures

- [x] 2.1 Расширить `convention.core-fixtures`, выбрав Compose или View template root и добавив в `docsJar` только `structure.json` и `docs/**/*.md`
- [x] 2.2 Разместить извлечённые Kotlin/XML examples и `meta/samples.json` в явных namespaces `META-INF/sdds-docs/assets/examples/**` и `META-INF/sdds-docs/meta/samples.json`
- [x] 2.3 Сохранить classifier `docs`, переименовать Gradle variant attribute с `snippets` на `templates` у producer и не публиковать совместимый `snippets` variant
- [x] 2.4 Исключить из docs JAR `sidebars.ts`, Docusaurus runtime/config, static assets и генерируемый changelog
- [x] 2.5 Добавить проверки содержимого docs JAR для `integration-core:uikit-compose-fixtures` и `integration-core:uikit-fixtures`, включая attribute `templates` и отрицательные проверки Docusaurus-файлов

## 3. sdds-core: чтение Core documentation artifact

- [x] 3.1 Переименовать запрашиваемый `com.sdds.docs.variant` с `snippets` на `templates` в resolvable Core documentation configuration
- [x] 3.2 Разделить обработку entries в `DocumentationAggregateTask` на structure, markdown templates, namespaced examples, sample metadata и legacy snippets-only layout
- [x] 3.3 Добавить безопасную нормализацию ZIP paths и понятные ошибки для path traversal, конфликтующих template paths и некорректной структуры
- [x] 3.4 Сохранить merge Core/local sample metadata и приоритет локальных examples над Core examples
- [x] 3.5 Добавить unit-тесты нового layout и regression-тесты legacy `meta.json`/snippets behavior

## 4. sdds-core: enrichment и output

- [x] 4.1 Реализовать чтение navigation tree из Core `structure.json` и валидацию всех публичных markdown paths
- [x] 4.2 Реализовать замену существующих Kotlin `// @sample:` и XML `<!-- @sample: -->` directives с диагностикой template path и отсутствующего sample
- [x] 4.3 Записывать только перечисленные в structure насыщенные страницы в `.sdds/temp/docs/content` с сохранением относительных путей
- [x] 4.4 Записывать Core structure в `.sdds/temp/docs/structure-core.json`, сохраняя текущие `assets/examples` и `meta` outputs
- [x] 4.5 Обновить KDoc documentation task/plugin contract и тесты для empty Core artifact, конфликтов, missing pages и local sample override
- [x] 4.6 Сохранять screenshot directives как ключи, копировать PNG в `.sdds/temp/docs/assets/screenshots` и не создавать локальные ссылки; S3 enrichment оставить за рамками change
- [x] 4.7 Заменять Compose style-api directives данными из platform components info

## 5. Интеграционная проверка

- [x] 5.1 Собрать оба fixtures docs JAR и проверить их entries на соответствие allowlist
- [x] 5.2 Выполнить focused unit-тесты `sdds-core:plugin_theme_builder`
- [x] 5.3 Выполнить `documentationAggregate` минимум для одного Compose и одного View docs-модуля и проверить `content`, `structure-core.json`, examples, screenshots, сохранённые screenshot directives и meta
- [x] 5.4 Запустить релевантные detekt/Spotless проверки затронутых included builds из корня репозитория
