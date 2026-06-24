## ADDED Requirements

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
