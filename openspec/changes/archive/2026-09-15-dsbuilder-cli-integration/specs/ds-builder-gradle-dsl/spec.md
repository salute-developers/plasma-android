## ADDED Requirements

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
