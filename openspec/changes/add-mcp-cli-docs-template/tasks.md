## 1. Страница MCP (`build-system/docs-template/common-template/docs/mcp.md`)

- [x] 1.1 Создать `mcp.md` с front matter (`id`, `title`, `sidebar_position`), согласованным со стилем существующих страниц (`quick_start.md`, `theme/*.md`)
- [x] 1.2 Раздел «Зачем» — доступ AI-агента к документации/токенам/компонентам дизайн-системы
- [x] 1.3 Раздел быстрого старта: `dsbuilder mcp serve` как единственный способ (предполагает установленный CLI, ссылка на `cli.md` за установкой) + пример конфигурации `mcpServers` для MCP-клиента, использующий `dsbuilder`. **Пересмотрено дважды**: сначала `npx dsbuilder-mcp serve` был основным, затем — fallback-разделом «Без установленного CLI», теперь по прямому запросу пользователя убран со страницы полностью
- [x] 1.3.1 Оформить шаги нумерованным списком (1. установите/настройте CLI → 2. «Запустите MCP-сервер:» + `dsbuilder mcp serve` → 3. добавьте в конфиг клиента) — исправлена жалоба, что инструкция запустить сервер из CLI была не видна за прозой, ведущей на страницу `cli.md`
- [x] 1.4 Раздел про explicit `designSystem`-ссылку — убран со страницы полностью вместе с fallback-разделом «Без установленного CLI»; контекст в `mcp.md` теперь всегда приходит из `.sdds/config.json`, разрешённого CLI
- [x] 1.5 Раздел со списком read-only MCP tools (контекст, документация, code binding, токены, компоненты) без описания write/publish операций
- [x] 1.6 Один абзац-мостик в разделе быстрого старта со ссылкой на `cli.md`, без пересказа шагов установки CLI

## 2. Страница CLI (`build-system/docs-template/common-template/docs/cli.md`)

- [x] 2.1 Создать `cli.md` с front matter, согласованным со стилем существующих страниц
- [x] 2.2 Раздел «Зачем» — постоянный локальный контекст проекта (`.sdds/config.json`)
- [x] 2.3 Раздел установки: GitHub Release `dsbuilder-cli-macos-arm64.zip`, `./install.sh`, добавление `~/.local/bin` в `PATH`, проверка `dsbuilder --version`
- [x] 2.4 Раздел `dsbuilder init --project-id <id> --design-system-id <id> --platform compose|android-view`
- [x] 2.5 Раздел авторизации: `dsbuilder auth login` и API key через переменную окружения (`DSBUILDER_API_KEY` / `--api-key-env`)
- [x] 2.6 Раздел `dsbuilder status` для проверки доступа
- [x] 2.7 Короткий раздел «MCP-сервер» (`dsbuilder mcp serve`) с одной ссылкой-мостиком на `mcp.md` за конфигурацией клиента и списком инструментов, без дублирования этого списка
- [x] 2.8 Явная строка, что write/publish-команды (`components push`, `docs publish`) не входят в область страницы
- [x] 2.9 Раздел `dsbuilder theme fetch` (pull темы) и раздел `dsbuilder components fetch` (pull конфигурации компонентов) как часть consumer-сценария — исправлена ошибочная классификация: это pull-операции потребителя, а не write-сценарий мейнтейнера
- [x] 2.10 Раздел `dsbuilder theme generate`/`dsbuilder components generate` (генерация кода из загруженных `fetch`-данных, с `--platform` при необходимости) — тоже часть consumer-сценария, пропущена в первой версии страницы

## 3. Навигация

- [x] 3.1 Добавить `'cli'` и `'mcp'` (в этом порядке — CLI перед MCP, так как быстрый старт `mcp.md` ссылается на `cli.md` за установкой) в `tutorialSidebar` в `build-system/docs-template/common-template/sidebars.ts` сразу после `'quick_start'`. При валидации (4.2) обнаружилось, что `compose-template/sidebars.ts` и `xml-template/sidebars.ts` — отдельные файлы, побеждающие общий при копировании (`DuplicatesStrategy.INCLUDE`); та же правка внесена и в них
- [x] 3.2 Добавить в раздел «Что прочитать дальше» `build-system/docs-template/compose-template/docs/quick_start.md` два раздельных пункта (7. CLI, 8. MCP — в этом порядке) со ссылками на `cli.md` и `mcp.md` — не объединять в один общий пункт/заголовок
- [x] 3.3 Добавить аналогичные два раздельных пункта (CLI, затем MCP) в `build-system/docs-template/xml-template/docs/quick_start.md` — не объединять в один общий пункт/заголовок

## 4. Валидация

- [x] 4.1 Убедиться, что `compose-template/structure.json` и `xml-template/structure.json` не затронуты (`git diff` не показывает изменений в этих файлах)
- [x] 4.2 Локально сгенерировать сайт для одной Compose-библиотеки: `./gradlew :tokens:sdds.serv.compose:docs:docusaurusGenerate`, проверить, что `mcp.md` и `cli.md` доступны в сайдбаре и ссылки из `quick_start.md` рабочие. По ходу обнаружилось и исправлено: `compose-template/sidebars.ts` — собственный файл, перекрывающий `common-template/sidebars.ts` при копировании (`DuplicatesStrategy.INCLUDE`), поэтому `mcp`/`cli` дополнительно добавлены и туда
- [x] 4.3 Локально сгенерировать сайт для одной XML-библиотеки: `./gradlew :tokens:sdds.serv.view:docs:docusaurusGenerate`, аналогично проверить сайдбар и ссылки. По той же причине `mcp`/`cli` дополнительно добавлены в `xml-template/sidebars.ts`
- [x] 4.4 Проверить мостик: со страницы `mcp.md` ровно одна ссылка на `cli.md` и наоборот, без дублирования контента (убран второй case-ссылки в `cli.md`, найденный при проверке)
