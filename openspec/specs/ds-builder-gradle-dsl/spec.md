# ds-builder-gradle-dsl Specification

## Purpose
TBD - created by archiving change unify-ds-builder-plugin. Update Purpose after archive.
## Requirements
### Requirement: Единый публичный DS Builder DSL
Gradle-плагин с id `io.github.salute-developers.design-system-builder` SHALL регистрировать extension `dsBuilder` как единую точку конфигурации генерации темы, компонентов, документации и sandbox-адаптеров.

#### Scenario: Проект конфигурирует одну возможность
- **WHEN** проект применяет DS Builder Gradle Plugin и конфигурирует только один из блоков `theme`, `components`, `documentation` или `sandbox`
- **THEN** плагин SHALL регистрировать и настраивать задачи этой возможности без требования сконфигурировать остальные блоки

#### Scenario: Старый extension отсутствует
- **WHEN** проект применяет новую версию DS Builder Gradle Plugin
- **THEN** extension `themeBuilder` SHALL NOT регистрироваться и проект MUST использовать `dsBuilder`

#### Scenario: Старый plugin id отсутствует
- **WHEN** repository modules мигрированы на DS Builder Gradle Plugin
- **THEN** они SHALL применять `io.github.salute-developers.design-system-builder` и SHALL NOT применять `io.github.salute-developers.theme-builder-plugin`

### Requirement: Общая резолюция директории .sdds
`dsBuilder` SHALL предоставлять общее свойство `sddsDirectory` и автоматически находить `.sdds` для текущего или родительского проекта.

#### Scenario: .sdds находится в текущем проекте
- **WHEN** `sddsDirectory` не задан явно и `${project.projectDir}/.sdds` существует
- **THEN** плагин SHALL использовать эту директорию

#### Scenario: .sdds находится в родительском проекте
- **WHEN** `sddsDirectory` не задан явно, `.sdds` отсутствует в текущем проекте и `${project.parent.projectDir}/.sdds` существует
- **THEN** плагин SHALL использовать `.sdds` родительского проекта

#### Scenario: Директория переопределена
- **WHEN** пользователь явно задаёт `sddsDirectory`
- **THEN** все включённые возможности SHALL разрешать стандартные DS Builder артефакты относительно указанной директории

#### Scenario: Директория не найдена
- **WHEN** возможность требует локальные DS Builder артефакты, `sddsDirectory` не задана и `.sdds` не найдена в текущем или родительском проекте
- **THEN** конфигурация или выполнение соответствующей задачи MUST завершиться понятной ошибкой со списком проверенных путей

### Requirement: Платформенные info-файлы имеют стандартные conventions
Плагин SHALL выводить стандартные `componentsInfoFile` и `themeInfoFile` из разрешённой `.sdds` директории и выбранной платформы.

#### Scenario: Выбрана Compose-платформа
- **WHEN** documentation или sandbox capability настроена для Compose и пути не переопределены
- **THEN** `componentsInfoFile` SHALL указывать на `.sdds/config-info-compose.json`, а `themeInfoFile` SHALL указывать на `.sdds/theme-info-compose.json`

#### Scenario: Выбрана View-платформа
- **WHEN** documentation или sandbox capability настроена для View и пути не переопределены
- **THEN** `componentsInfoFile` SHALL указывать на `.sdds/config-info-view-system.json`, а `themeInfoFile` SHALL указывать на `.sdds/theme-info-view-system.json`

#### Scenario: Info-файл переопределён
- **WHEN** пользователь явно задаёт `componentsInfoFile` или `themeInfoFile`
- **THEN** соответствующая capability SHALL использовать явно заданный файл вместо стандартного пути

### Requirement: Возможности плагина не зависят от внутренних convention-плагинов
DS Builder Gradle Plugin SHALL регистрировать собственные configurations, task types и platform-specific настройки documentation и sandbox capabilities без применения специализированных `convention.documentation-*` или `convention.integration-*`.

#### Scenario: Плагин используется в token-модуле
- **WHEN** token-модуль применяет базовые Android/Compose conventions и DS Builder Gradle Plugin
- **THEN** documentation или sandbox capability SHALL работать без специализированного documentation/integration convention-плагина

### Requirement: Theme и components наследуют общие generation settings
`dsBuilder` SHALL предоставлять общие `target`, `packageName`, `resourcePrefix`, `outputLocation`
и `dimensions`, применяемые как conventions к theme и components capabilities.

#### Scenario: Общие dimensions используют Android resources
- **WHEN** пользователь включает `dimensions.fromResources` на уровне `dsBuilder`
- **THEN** и theme, и components generation SHALL получить `DimensionsConfig.fromResources = true`

#### Scenario: Capability переопределяет общее значение
- **WHEN** theme или components задаёт собственное generation property
- **THEN** явно заданное capability value SHALL иметь приоритет над общей convention

