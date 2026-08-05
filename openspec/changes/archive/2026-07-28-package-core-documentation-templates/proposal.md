## Why

Core-документация Compose и View сейчас существует только как Docusaurus-шаблоны внутри `build-system` и не поставляется Android-инструментам как версионированный вход для DS Builder CLI. Необходимо публиковать markdown-шаблоны вместе с fixtures и насыщать их платформенными примерами в `.sdds/temp/docs/content`, сохраняя соответствие версии UIKit, примеров и документации.

## What Changes

- Добавить декларативные `structure.json` рядом с Compose- и View-шаблонами Docusaurus, воспроизводящие публичную навигацию существующих `sidebars.ts`.
- Расширить `convention.core-fixtures`, чтобы дополнительный docs-артефакт включал Core markdown, соответствующий `structure.json`, snippets и metadata.
- **BREAKING**: переименовать Gradle variant attribute документационного артефакта с `snippets` на `templates` у producer и consumer без публикации совместимого варианта.
- Ограничить шаблонную часть артефакта файлами `structure.json` и `docs/**/*.md`; Docusaurus-конфигурация, runtime-файлы и сгенерированный changelog в артефакт не попадают.
- Расширить documentation capability DS Builder Gradle Plugin: читать версионированные Core-шаблоны, подставлять Kotlin/XML snippets и Compose style API и записывать насыщенные markdown-файлы непосредственно в `.sdds/temp/docs/content`.
- Сохранять Core `structure.json` как `.sdds/temp/docs/structure-core.json` рядом с будущим `docs.json` для последующей сборки итоговой структуры средствами DS Builder CLI.
- Копировать локально созданные screenshots в `.sdds/temp/docs/assets/screenshots`, сохраняя в Markdown исходные screenshot keys для последующей замены documentation service на S3 URL.
- Сохранить текущую агрегацию examples, sample metadata и platform info files, включая совместимость с legacy snippets-only docs-артефактами.

## Capabilities

### New Capabilities

- `core-documentation-templates`: Описывает декларативную структуру Compose/View Core-документации и состав версионированного docs-артефакта fixtures.

### Modified Capabilities

- `android-documentation-aggregation`: Расширяет платформенную агрегацию обработкой Core markdown-шаблонов и формированием насыщенного `content`.

## Impact

- `build-system`: изменятся Compose/View docs templates и `convention.core-fixtures`; потребуется проверка содержимого публикуемого `docs` JAR.
- `integration-core:uikit-compose-fixtures` и `integration-core:uikit-fixtures`: станут источниками версионированных Core documentation artifacts.
- `sdds-core:plugin_theme_builder`: изменятся распаковка и агрегация документации, формат входного Core docs-артефакта и тесты Gradle task.
- Изменение затрагивает Gradle conventions и docs generation, но не меняет API UIKit, токены или формат финального пакета сервиса документации.
- Валидация должна охватить unit-тесты плагина, сборку обоих fixtures docs JAR и Compose/View `documentationAggregate`.
