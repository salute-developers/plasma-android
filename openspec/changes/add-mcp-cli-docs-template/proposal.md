## Why

Внешние потребители дизайн-системы (разработчики приложений на `sdds-uikit`/`sdds-uikit-compose`) сегодня не видят в документации ни слова про MCP-сервер и CLI design-system-builder — хотя оба уже читают ту же документацию, токены и компоненты, которые видит человек на сгенерированном Docusaurus-сайте. Без инструкции в шаблоне документации подключение ИИ-агента к дизайн-системе остаётся недокументированной возможностью, доступной только тем, кто уже знает о соседнем репозитории `design-system-builder`.

## What Changes

- Добавить в `build-system/docs-template/common-template/docs/` две новые самостоятельные страницы: `mcp.md` (подключение ИИ-агента через MCP) и `cli.md` (установка и consumer-использование CLI `dsbuilder`). Страницы независимы друг от друга, с единственной перекрёстной ссылкой-мостиком в каждую сторону, без дублирования контента.
- `mcp.md` описывает только read-only consumer-сценарий исключительно в контексте установленного CLI: быстрый старт через `dsbuilder mcp serve` (установка — на `cli.md`), пример конфига `mcpServers` для этой команды, краткий список read-only MCP tools. Сценарий без установленного CLI (`npx dsbuilder-mcp`, explicit `designSystem`-ссылка) сознательно не описывается.
- `cli.md` описывает только consumer-сценарий: установку `dsbuilder` из GitHub Release, `dsbuilder init`/`auth login`/`status`, `dsbuilder theme fetch`/`components fetch` (pull актуальной темы и конфигурации компонентов), `dsbuilder theme generate`/`components generate` (генерация кода из загруженных данных) и `dsbuilder mcp serve` как встроенную команду CLI (с отсылкой к `mcp.md` за конфигом клиента). Write/publish-команды (`components push`, `docs publish`) явно исключены из страницы — это отдельный сценарий для мейнтейнеров дизайн-системы.
- Обновить `build-system/docs-template/common-template/sidebars.ts`: добавить `'mcp'` и `'cli'` в `tutorialSidebar` сразу после `'quick_start'`.
- Обновить `build-system/docs-template/compose-template/docs/quick_start.md` и `build-system/docs-template/xml-template/docs/quick_start.md`: добавить в раздел «Что прочитать дальше» два новых пункта со ссылками на `mcp.md` и `cli.md`.

Важное допущение: релиз `dsbuilder-cli-macos-arm64.zip` на GitHub Releases `design-system-builder` на момент написания не существует — там пока только локальная Gradle-сборка (`frontend-kt/cli/build/distributions/...`) без release/publish workflow. Инструкция сознательно описывает целевое, ещё не опубликованное поведение — она должна synchронизироваться с моментом появления реального релизного пайплайна в `design-system-builder`.

## Capabilities

### New Capabilities
- `docs-template-consumer-guides`: страницы `mcp.md` и `cli.md` в `common-template`, их связь друг с другом, навигационное включение в `sidebars.ts` и `quick_start.md` обоих платформенных шаблонов.

### Modified Capabilities

_(нет — `core-documentation-templates` и `android-documentation-aggregation` касаются `structure.json` и docs JAR только для `compose-template`/`xml-template` Core-шаблонов; `common-template` вне их скоупа, `structure.json` в `common-template` не существует.)_

## Impact

- `build-system/docs-template/common-template/docs/mcp.md` — новый файл.
- `build-system/docs-template/common-template/docs/cli.md` — новый файл.
- `build-system/docs-template/common-template/sidebars.ts` — изменение навигации.
- `build-system/docs-template/compose-template/sidebars.ts` — изменение навигации (обнаружено при реализации: этот файл, а не `common-template/sidebars.ts`, реально побеждает при копировании для Compose-сайтов).
- `build-system/docs-template/xml-template/sidebars.ts` — изменение навигации (аналогично, для XML-сайтов).
- `build-system/docs-template/compose-template/docs/quick_start.md` — изменение контента.
- `build-system/docs-template/xml-template/docs/quick_start.md` — изменение контента.
- Публичный API, токены, Gradle-конвенции, генерация кода — не затронуты. Изменение чисто в контенте `docs-template`, потребляемом задачей `docusaurusGenerate` (`build-system/conventions/src/main/kotlin/convention.docusaurus.gradle.kts`); `structure.json`/docs JAR (`core-documentation-templates`) не затрагиваются.
- Валидация: `./gradlew :tokens:sdds.serv.compose:docs:docusaurusGenerate` и `./gradlew :tokens:sdds.serv.view:docs:docusaurusGenerate` — оба прогнаны при реализации, подтверждают, что `mcp.md`/`cli.md` попадают в сгенерированный сайт, эффективный `sidebars.ts` их перечисляет, а ссылки из `quick_start.md` резолвятся.
