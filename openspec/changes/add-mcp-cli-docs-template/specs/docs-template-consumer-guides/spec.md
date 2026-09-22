## ADDED Requirements

### Requirement: `common-template` содержит независимую страницу про MCP
`build-system/docs-template/common-template/docs/mcp.md` SHALL описывать подключение AI-агента к дизайн-системе через MCP для внешнего потребителя дизайн-системы, без предположения об установленном CLI `dsbuilder`.

#### Scenario: Быстрый старт без установки CLI
- **WHEN** читатель открывает `mcp.md`, не имея установленного `dsbuilder`
- **THEN** страница SHALL содержать способ запустить MCP-сервер через `npx dsbuilder-mcp serve` без предварительной установки CLI
- **THEN** страница SHALL содержать пример конфигурации `mcpServers` для MCP-клиента

#### Scenario: Явный контекст дизайн-системы без локального проекта
- **WHEN** у читателя нет локального `.sdds/config.json`
- **THEN** `mcp.md` SHALL показывать способ передать контекст через explicit `designSystem`-ссылку (`dsbuilder://projects/<project-id>/design-systems/<design-system-id>?...`)

#### Scenario: Список доступных read-only инструментов
- **WHEN** читатель хочет понять, что умеет MCP-сервер
- **THEN** `mcp.md` SHALL перечислять доступные read-only MCP tools (контекст, документация, code binding, токены, компоненты)
- **THEN** `mcp.md` SHALL NOT описывать write/publish tools или операции

#### Scenario: Не описывает write/maintainer-сценарии
- **WHEN** читатель ищет в `mcp.md` инструкции по публикации или изменению дизайн-системы
- **THEN** `mcp.md` SHALL NOT содержать команды или сценарии `theme fetch/push`, `components push` или `docs publish`

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

#### Scenario: Не описывает write/maintainer-команды
- **WHEN** читатель ищет в `cli.md` инструкции по публикации или изменению дизайн-системы
- **THEN** `cli.md` SHALL NOT содержать инструкции по `theme fetch/push`, `components push` или `docs publish`
- **THEN** `cli.md` MAY явно упоминать, что эти команды существуют, но не входят в область страницы

### Requirement: Страницы MCP и CLI связаны ровно одним мостиком, без дублирования
`mcp.md` и `cli.md` SHALL оставаться независимо читаемыми страницами, связанными не более чем одной перекрёстной ссылкой в каждую сторону.

#### Scenario: Мостик из MCP в CLI
- **WHEN** читатель `mcp.md` хочет запускать MCP-сервер через установленный CLI вместо `npx`
- **THEN** `mcp.md` SHALL содержать ровно одну ссылку на `cli.md`
- **THEN** `mcp.md` SHALL NOT дублировать шаги установки или использования CLI из `cli.md`

#### Scenario: Мостик из CLI в MCP
- **WHEN** читатель `cli.md` доходит до команды `dsbuilder mcp serve`
- **THEN** `cli.md` SHALL содержать ровно одну ссылку на `mcp.md` за конфигурацией MCP-клиента и списком инструментов
- **THEN** `cli.md` SHALL NOT дублировать пример конфигурации `mcpServers` или список read-only tools из `mcp.md`

### Requirement: Страницы MCP и CLI включены в навигацию сайта
Генератор документации SHALL делать `mcp.md` и `cli.md` доступными в сайдбаре и достижимыми из стартовой страницы каждого сгенерированного сайта Compose- и XML-библиотек.

#### Scenario: Сайдбар перечисляет новые страницы
- **WHEN** `docusaurusGenerate` собирает сайт из `common-template` и (`compose-template` или `xml-template`)
- **THEN** эффективный `sidebars.ts` сгенерированного сайта SHALL перечислять `mcp` и `cli` в `tutorialSidebar` сразу после `quick_start`
- **THEN** это требование SHALL выполняться для каждого `sidebars.ts`, который копия `docusaurusGenerate` реально оставляет в сгенерированном сайте — как минимум `common-template/sidebars.ts`, а также `compose-template/sidebars.ts` и `xml-template/sidebars.ts`, если они переопределяют общий файл через `DuplicatesStrategy.INCLUDE`

#### Scenario: Quick start ссылается на обе страницы для Compose
- **WHEN** читатель открывает `quick_start.md` Compose-библиотеки
- **THEN** раздел «Что прочитать дальше» SHALL содержать ссылки на `mcp.md` и `cli.md`

#### Scenario: Quick start ссылается на обе страницы для XML
- **WHEN** читатель открывает `quick_start.md` XML-библиотеки
- **THEN** раздел «Что прочитать дальше» SHALL содержать ссылки на `mcp.md` и `cli.md`

### Requirement: Страницы вне механизма `structure.json`
Добавление `mcp.md` и `cli.md` в `common-template` SHALL NOT требовать изменений в `structure.json` или docs JAR (`convention.core-fixtures`).

#### Scenario: `structure.json` не изменяется
- **WHEN** это изменение вносится в `build-system/docs-template`
- **THEN** `compose-template/structure.json` и `xml-template/structure.json` SHALL остаться без изменений
