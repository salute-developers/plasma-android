## 1. Страница MCP (`build-system/docs-template/common-template/docs/mcp.md`)

- [x] 1.1 Создать `mcp.md` с front matter (`id`, `title`, `sidebar_position`), согласованным со стилем существующих страниц (`quick_start.md`, `theme/*.md`)
- [x] 1.2 Раздел «Зачем» — доступ AI-агента к документации/токенам/компонентам дизайн-системы
- [x] 1.3 Раздел быстрого старта: `npx dsbuilder-mcp serve` без установки CLI + пример конфигурации `mcpServers` для MCP-клиента
- [x] 1.4 Раздел про explicit `designSystem`-ссылку (`dsbuilder://projects/<project-id>/design-systems/<design-system-id>?version=<version>&platform=compose`) как альтернативу локальному `.sdds/config.json`
- [x] 1.5 Раздел со списком read-only MCP tools (контекст, документация, code binding, токены, компоненты) без описания write/publish операций
- [x] 1.6 Один абзац-мостик в конце страницы со ссылкой на `cli.md`, без пересказа шагов установки CLI

## 2. Страница CLI (`build-system/docs-template/common-template/docs/cli.md`)

- [x] 2.1 Создать `cli.md` с front matter, согласованным со стилем существующих страниц
- [x] 2.2 Раздел «Зачем» — постоянный локальный контекст проекта (`.sdds/config.json`)
- [x] 2.3 Раздел установки: GitHub Release `dsbuilder-cli-macos-arm64.zip`, `./install.sh`, добавление `~/.local/bin` в `PATH`, проверка `dsbuilder --version`
- [x] 2.4 Раздел `dsbuilder init --project-id <id> --design-system-id <id> --platform compose|android-view`
- [x] 2.5 Раздел авторизации: `dsbuilder auth login` и API key через переменную окружения (`DSBUILDER_API_KEY` / `--api-key-env`)
- [x] 2.6 Раздел `dsbuilder status` для проверки доступа
- [x] 2.7 Короткий раздел `dsbuilder mcp serve` с одной ссылкой-мостиком на `mcp.md` за конфигурацией клиента и списком инструментов, без дублирования этого списка
- [x] 2.8 Явная строка, что write/maintainer-команды (`theme fetch/push`, `components push`, `docs publish`) не входят в область страницы

## 3. Навигация

- [x] 3.1 Добавить `'mcp'` и `'cli'` в `tutorialSidebar` в `build-system/docs-template/common-template/sidebars.ts` сразу после `'quick_start'`. При валидации (4.2) обнаружилось, что `compose-template/sidebars.ts` и `xml-template/sidebars.ts` — отдельные файлы, побеждающие общий при копировании (`DuplicatesStrategy.INCLUDE`); та же правка внесена и в них
- [x] 3.2 Добавить в раздел «Что прочитать дальше» `build-system/docs-template/compose-template/docs/quick_start.md` пункты со ссылками на `mcp.md` и `cli.md`
- [x] 3.3 Добавить аналогичные пункты в `build-system/docs-template/xml-template/docs/quick_start.md`

## 4. Валидация

- [x] 4.1 Убедиться, что `compose-template/structure.json` и `xml-template/structure.json` не затронуты (`git diff` не показывает изменений в этих файлах)
- [x] 4.2 Локально сгенерировать сайт для одной Compose-библиотеки: `./gradlew :tokens:sdds.serv.compose:docs:docusaurusGenerate`, проверить, что `mcp.md` и `cli.md` доступны в сайдбаре и ссылки из `quick_start.md` рабочие. По ходу обнаружилось и исправлено: `compose-template/sidebars.ts` — собственный файл, перекрывающий `common-template/sidebars.ts` при копировании (`DuplicatesStrategy.INCLUDE`), поэтому `mcp`/`cli` дополнительно добавлены и туда
- [x] 4.3 Локально сгенерировать сайт для одной XML-библиотеки: `./gradlew :tokens:sdds.serv.view:docs:docusaurusGenerate`, аналогично проверить сайдбар и ссылки. По той же причине `mcp`/`cli` дополнительно добавлены в `xml-template/sidebars.ts`
- [x] 4.4 Проверить мостик: со страницы `mcp.md` ровно одна ссылка на `cli.md` и наоборот, без дублирования контента (убран второй case-ссылки в `cli.md`, найденный при проверке)
