# sandbox-adapter-generation Specification

## Purpose
TBD - created by archiving change unify-ds-builder-plugin. Update Purpose after archive.
## Requirements
### Requirement: Sandbox capability генерирует платформенные адаптеры
Sandbox capability SHALL генерировать адаптеры темы и компонентов для sandbox/demo infrastructure из `componentsInfoFile`.

#### Scenario: Compose sandbox
- **WHEN** модуль включает `sandbox { compose { ... } }`
- **THEN** плагин SHALL зарегистрировать Compose sandbox generation task с Compose target и выбранной схемой

#### Scenario: View sandbox
- **WHEN** модуль включает `sandbox { view { ... } }`
- **THEN** плагин SHALL зарегистрировать View sandbox generation task с View target и выбранной схемой

### Requirement: Sandbox inputs имеют типизированные conventions
Sandbox extension SHALL предоставлять типизированные Gradle properties для `componentsInfoFile`, `generatedPackageName`, `themeAlias`, `scheme` и Compose Multiplatform mode.

#### Scenario: Стандартный components info
- **WHEN** `componentsInfoFile` не задан явно
- **THEN** sandbox capability SHALL использовать platform-specific файл из разрешённой `.sdds`

#### Scenario: Package выводится из Android namespace
- **WHEN** `generatedPackageName` не задан явно и текущий Android-модуль имеет `namespace`
- **THEN** generator SHALL использовать Android namespace как пакет генерируемого кода

#### Scenario: Package выводится без Android namespace
- **WHEN** `generatedPackageName` и Android namespace отсутствуют, но `componentsInfoFile` содержит `packageName`
- **THEN** generator SHALL вывести sandbox package из `componentsInfoFile.packageName` по документированному соглашению

#### Scenario: Theme alias выводится из .sdds config
- **WHEN** `themeAlias` не задан явно
- **THEN** generator SHALL использовать alias первого базового tenant из `.sdds/config.json`, а при отсутствии alias — его name

#### Scenario: Theme alias переопределён
- **WHEN** пользователь явно задаёт `themeAlias`
- **THEN** generator SHALL использовать явно заданное название темы

### Requirement: Tenants не выбираются sandbox capability
Sandbox capability SHALL рассматривать tenants как вариации одной темы и SHALL NOT предоставлять параметр выбора tenant.

#### Scenario: Config содержит несколько tenants
- **WHEN** `.sdds/config.json` содержит несколько tenant-вариаций
- **THEN** sandbox configuration SHALL разрешить одно название темы и SHALL NOT требовать выбора tenant

### Requirement: Generated sources подключаются к сборке
Sandbox generator SHALL создавать код в Gradle build directory и подключать output directory к соответствующему Kotlin source set.

#### Scenario: Android Compose или View module
- **WHEN** sandbox generation task создаёт код для Android-модуля
- **THEN** generated directory SHALL участвовать в компиляции без записи в `src/main`

#### Scenario: Compose Multiplatform module
- **WHEN** Compose sandbox включает multiplatform mode
- **THEN** generated directory SHALL подключаться к согласованному common Kotlin source set

### Requirement: Старые integration properties не используются
Sandbox capability SHALL NOT читать `integration.compose.*`, `integration.view.*` или `theme-alias` из Gradle properties.

#### Scenario: Модуль мигрирован на sandbox DSL
- **WHEN** sandbox module применяет новый DS Builder Plugin
- **THEN** вся конфигурация generator SHALL поступать из typed extension properties и `.sdds` metadata

### Requirement: Sandbox schema по умолчанию использует V2
Sandbox capability SHALL использовать `SandboxScheme.V2`, когда schema явно не переопределена.

#### Scenario: Schema не указана
- **WHEN** пользователь включает Compose или View sandbox без явного `scheme`
- **THEN** generation task SHALL использовать `SandboxScheme.V2`

