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

### Requirement: Пер-платформенные generation-таски

Плагин SHALL регистрировать для `theme` и `components` capability отдельную generation-таску на каждую
сконфигурированную платформу (`generateComposeTheme`/`generateViewTheme` для `theme`,
`generateComposeComponents`/`generateViewComponents` для `components`), генерирующую строго одну платформу
независимо от того, сколько платформ сконфигурировано в модуле в целом.

#### Scenario: Модуль конфигурирует одну платформу

- **WHEN** `dsBuilder.theme` (или `dsBuilder.components`) включена и `dsBuilder.targets` содержит только `compose`
- **THEN** плагин SHALL зарегистрировать `generateComposeTheme` (или `generateComposeComponents`)
- **THEN** плагин SHALL NOT зарегистрировать `generateViewTheme` (или `generateViewComponents`) для этого модуля

#### Scenario: Модуль конфигурирует обе платформы

- **WHEN** `dsBuilder.targets` содержит и `compose`, и `view`
- **THEN** плагин SHALL зарегистрировать обе пер-платформенные таски для включённой capability
- **THEN** запуск `generateComposeTheme` SHALL сгенерировать только Compose-вывод, а `generateViewTheme` — только
  View-вывод, независимо друг от друга

#### Scenario: Незапрошенная платформа отсутствует как таска

- **WHEN** внешний вызывающий запрашивает таску платформы, не сконфигурированной в модуле (например,
  `generateViewTheme` в модуле с `targets { compose() }`)
- **THEN** Gradle SHALL сообщить об отсутствующей таске вместо запуска генерации для неверной платформы

#### Scenario: Платформа не сконфигурирована вовсе

- **WHEN** `dsBuilder.theme` (или `dsBuilder.components`) включена, но `dsBuilder.targets` не содержит ни одной
  платформы
- **THEN** плагин SHALL NOT зарегистрировать ни одну пер-платформенную таску для этой capability
- **THEN** `generateTheme`/`generateComponents` SHALL остаться зарегистрированной с прежним (сегодняшним)
  поведением при отсутствующем `target`

### Requirement: Общие generation-таски не меняют поведение

`generateTheme` и `generateComponents` SHALL оставаться зарегистрированными под тем же именем, того же типа
(`GenerateThemeTask`/`GenerateComponentsTask`) и с тем же `target`, вычисленным из `dsBuilder.targets` (включая
`ALL`, когда сконфигурированы обе платформы), независимо от появления пер-платформенных тасок.

#### Scenario: Существующий вызов продолжает работать

- **WHEN** модуль уже вызывает `generateTheme` или `generateComponents` напрямую или через `autoGenerate`/`preBuild`
- **THEN** результат SHALL совпадать с результатом до появления пер-платформенных тасок: сгенерированы все
  сконфигурированные для модуля платформы
- **THEN** `generateTheme`/`generateComponents` SHALL remain instances of `GenerateThemeTask`/
  `GenerateComponentsTask`, so code that reads their properties directly continues to work

#### Scenario: Пер-платформенные таски не подключены к preBuild

- **WHEN** `autoGenerate` включён для `theme` или `components`
- **THEN** только `generateTheme`/`generateComponents` SHALL быть добавлены в зависимости `preBuild`
- **THEN** `generateComposeTheme`/`generateViewTheme`/`generateComposeComponents`/`generateViewComponents` SHALL
  NOT быть добавлены в зависимости `preBuild`

