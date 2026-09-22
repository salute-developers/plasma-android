## ADDED Requirements

### Requirement: `common-template` содержит независимую страницу про MCP
`build-system/docs-template/common-template/docs/mcp.md` SHALL описывать подключение AI-агента к дизайн-системе через MCP исключительно в контексте установленного CLI `dsbuilder` — без сценария использования MCP без CLI.

#### Scenario: Быстрый старт через CLI
- **WHEN** читатель открывает `mcp.md`
- **THEN** страница SHALL содержать явную инструкцию запустить MCP-сервер командой `dsbuilder mcp serve` (например, шаг «Запустите MCP-сервер:» перед командой), а не только ссылку на `cli.md` без самой команды
- **THEN** страница SHALL описывать, что запуск предполагает установленный CLI (установка — на странице `cli.md`)
- **THEN** страница SHALL содержать пример конфигурации `mcpServers` для MCP-клиента, использующий команду `dsbuilder`
- **THEN** `mcp.md` SHALL NOT содержать `npx dsbuilder-mcp` или другой способ запустить MCP-сервер без установленного CLI
- **THEN** `mcp.md` SHALL NOT содержать explicit `designSystem`-ссылку как способ передать контекст — контекст всегда приходит из `.sdds/config.json`, разрешённого CLI

#### Scenario: Список доступных read-only инструментов
- **WHEN** читатель хочет понять, что умеет MCP-сервер
- **THEN** `mcp.md` SHALL перечислять доступные read-only MCP tools (контекст, документация, code binding, токены, компоненты)
- **THEN** `mcp.md` SHALL NOT описывать write/publish tools или операции

#### Scenario: Не описывает write/publish-сценарии
- **WHEN** читатель ищет в `mcp.md` инструкции по публикации или изменению дизайн-системы
- **THEN** `mcp.md` SHALL NOT содержать команды или сценарии `components push` или `docs publish`

### Requirement: `common-template` содержит независимую страницу про CLI
`build-system/docs-template/common-template/docs/cli.md` SHALL описывать установку и consumer-использование CLI `dsbuilder` независимо от `mcp.md`, без пересказа списка MCP tools или примера конфигурации MCP-клиента.

#### Scenario: Установка CLI
- **WHEN** читатель открывает `cli.md`
- **THEN** страница SHALL описывать установку `dsbuilder` из GitHub Release `design-system-builder` и проверку `dsbuilder --version`

#### Scenario: Локальный контекст проекта
- **WHEN** читатель хочет закрепить `project-id`/`design-system-id` локально
- **THEN** `cli.md` SHALL описывать `dsbuilder init` с указанием платформы (`compose` или `android-view`) и последующую авторизацию (`dsbuilder auth login` или API key через переменную окружения)

#### Scenario: Проверка доступа
- **WHEN** читатель настроил контекст и авторизацию
- **THEN** `cli.md` SHALL описывать `dsbuilder status` как способ проверить доступ

#### Scenario: Загрузка темы и конфигов компонентов — часть consumer-сценария
- **WHEN** читатель хочет получить актуальную тему или конфигурацию компонентов дизайн-системы локально
- **THEN** `cli.md` SHALL описывать `dsbuilder theme fetch` и `dsbuilder components fetch` как pull-операции, доступные потребителю дизайн-системы
- **THEN** `cli.md` SHALL NOT относить `theme fetch` или `components fetch` к write/maintainer-сценарию

#### Scenario: Генерация кода темы и компонентов — часть consumer-сценария
- **WHEN** читатель загрузил тему или конфигурацию компонентов через `theme fetch`/`components fetch` и хочет получить из них код
- **THEN** `cli.md` SHALL описывать `dsbuilder theme generate` и `dsbuilder components generate`, включая явное указание платформы через `--platform`, если она не задана в `.sdds/config.json`
- **THEN** `cli.md` SHALL NOT относить `theme generate` или `components generate` к write/maintainer-сценарию

#### Scenario: Не описывает write/publish-команды
- **WHEN** читатель ищет в `cli.md` инструкции по публикации или изменению дизайн-системы
- **THEN** `cli.md` SHALL NOT содержать инструкции по `components push` или `docs publish` — эти команды пишут в дизайн-систему, а не читают из неё
- **THEN** `cli.md` MAY явно упоминать, что эти команды существуют, но не входят в область страницы

### Requirement: Страницы MCP и CLI связаны ровно одним мостиком, без дублирования
`mcp.md` и `cli.md` SHALL оставаться независимо читаемыми страницами, связанными не более чем одной перекрёстной ссылкой в каждую сторону.

#### Scenario: Мостик из MCP в CLI
- **WHEN** читатель `mcp.md` доходит до основного сценария быстрого старта, требующего установленного CLI
- **THEN** `mcp.md` SHALL содержать ровно одну ссылку на `cli.md`
- **THEN** `mcp.md` SHALL NOT дублировать шаги установки CLI из `cli.md`

#### Scenario: Мостик из CLI в MCP
- **WHEN** читатель `cli.md` доходит до команды `dsbuilder mcp serve`
- **THEN** `cli.md` SHALL содержать ровно одну ссылку на `mcp.md` за конфигурацией MCP-клиента и списком инструментов
- **THEN** `cli.md` SHALL NOT дублировать пример конфигурации `mcpServers` или список read-only tools из `mcp.md`

### Requirement: Страницы MCP и CLI включены в навигацию сайта
Генератор документации SHALL делать `mcp.md` и `cli.md` доступными в сайдбаре и достижимыми из стартовой страницы каждого сгенерированного сайта Compose- и XML-библиотек.

#### Scenario: Сайдбар перечисляет новые страницы в порядке CLI, затем MCP
- **WHEN** `docusaurusGenerate` собирает сайт из `common-template` и (`compose-template` или `xml-template`)
- **THEN** эффективный `sidebars.ts` сгенерированного сайта SHALL перечислять `cli`, затем `mcp` в `tutorialSidebar` сразу после `quick_start` — именно в этом порядке, так как быстрый старт `mcp.md` предполагает установленный CLI
- **THEN** это требование SHALL выполняться для каждого `sidebars.ts`, который копия `docusaurusGenerate` реально оставляет в сгенерированном сайте — как минимум `common-template/sidebars.ts`, а также `compose-template/sidebars.ts` и `xml-template/sidebars.ts`, если они переопределяют общий файл через `DuplicatesStrategy.INCLUDE`

#### Scenario: Quick start ссылается на обе страницы для Compose как два раздельных пункта
- **WHEN** читатель открывает `quick_start.md` Compose-библиотеки
- **THEN** раздел «Что прочитать дальше» SHALL содержать ссылку на `mcp.md` отдельным пунктом и ссылку на `cli.md` отдельным пунктом
- **THEN** эти два пункта SHALL NOT быть объединены в один общий пункт/заголовок с одной вводной фразой на оба

#### Scenario: Quick start ссылается на обе страницы для XML как два раздельных пункта
- **WHEN** читатель открывает `quick_start.md` XML-библиотеки
- **THEN** раздел «Что прочитать дальше» SHALL содержать ссылку на `mcp.md` отдельным пунктом и ссылку на `cli.md` отдельным пунктом
- **THEN** эти два пункта SHALL NOT быть объединены в один общий пункт/заголовок с одной вводной фразой на оба

### Requirement: Страницы вне механизма `structure.json`
Добавление `mcp.md` и `cli.md` в `common-template` SHALL NOT требовать изменений в `structure.json` или docs JAR (`convention.core-fixtures`).

#### Scenario: `structure.json` не изменяется
- **WHEN** это изменение вносится в `build-system/docs-template`
- **THEN** `compose-template/structure.json` и `xml-template/structure.json` SHALL остаться без изменений
