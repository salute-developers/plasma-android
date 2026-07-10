# style-builder-api-info Specification

## Purpose
TBD - created by archiving change annotate-compose-style-builders-api-info. Update Purpose after archive.
## Requirements

### Requirement: Все StyleBuilder-интерфейсы аннотированы @ApiInfo
Каждый интерфейс в `sdds-core/uikit-compose`, расширяющий `StyleBuilder<T>`, SHALL быть помечен аннотацией `@ApiInfo` из пакета `com.sdds.api.info.compose`.

#### Scenario: Билдер с именем, совпадающим с именем компонента
- **WHEN** интерфейс называется `*StyleBuilder` и имя компонента совпадает с именем интерфейса без суффикса `StyleBuilder`
- **THEN** аннотация добавляется без параметров: `@ApiInfo`

#### Scenario: Билдер, обслуживающий несколько компонентов
- **WHEN** один `*StyleBuilder`-интерфейс используется для нескольких компонентов (как `TextFieldStyleBuilder` для `TextField` и `TextArea`)
- **THEN** аннотация добавляется с явным перечислением: `@ApiInfo(components = ["ComponentA", "ComponentB"])`

### Requirement: MotionStyleBuilder-интерфейсы не аннотируются
Интерфейсы, расширяющие `MotionStyleBuilder<T>`, SHALL NOT помечаться аннотацией `@ApiInfo`.

#### Scenario: MotionStyleBuilder остаётся без аннотации
- **WHEN** интерфейс расширяет `MotionStyleBuilder<T>` (пакет `motion/`)
- **THEN** аннотация `@ApiInfo` не добавляется

### Requirement: Импорт аннотации присутствует в файле
В каждом файле, где добавляется `@ApiInfo`, SHALL присутствовать импорт `com.sdds.api.info.compose.ApiInfo`.

#### Scenario: Импорт добавлен корректно
- **WHEN** файл содержит `@ApiInfo` на интерфейсе
- **THEN** секция импортов файла содержит `import com.sdds.api.info.compose.ApiInfo`

### Requirement: ImageSource builder parameters classify as icons
API info extraction for `StyleBuilder` methods SHALL classify parameters of type `com.sdds.compose.uikit.ImageSource` as `ParameterType.ICON` when those parameters represent icon configuration.

#### Scenario: Builder method accepts ImageSource icon
- **WHEN** an `@ApiInfo` style builder method has a parameter whose resolved type is `com.sdds.compose.uikit.ImageSource`
- **THEN** generated API metadata classifies that parameter as `ICON`

#### Scenario: Deprecated drawable overload remains compatible
- **WHEN** a style builder exposes both a deprecated `@DrawableRes Int` overload and an `ImageSource` overload for the same icon property
- **THEN** API metadata preserves icon classification for the non-deprecated `ImageSource` overload
