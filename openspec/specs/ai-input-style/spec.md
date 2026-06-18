# ai-input-style Specification

## Purpose
TBD - created by archiving change ai-input. Update Purpose after archive.
## Requirements
### Requirement: AiInputStyle SHALL define shape as StatefulValue<Shape>
`AiInputStyle` SHALL содержать поле `shape: StatefulValue<Shape>`. `AiInputStyleBuilder` MUST предоставлять методы `fun shape(shape: Shape)` и `fun shape(shape: StatefulValue<Shape>)`. Значение по умолчанию в `DefaultAiInputStyle` MUST быть `RoundedCornerShape(0)`.

#### Scenario: shape применяется к компоненту
- **WHEN** стиль задаёт `shape(RoundedCornerShape(16.dp))`
- **THEN** компонент отображается с clip формы `RoundedCornerShape(16.dp)`

### Requirement: AiInputStyle SHALL define mode as AiInputMode
`AiInputStyle` SHALL содержать поле `mode: AiInputMode`, где `AiInputMode` — enum с вариантами `Condensed` и `Extended`. `AiInputStyleBuilder` MUST предоставлять метод `fun mode(mode: AiInputMode): AiInputStyleBuilder`. Значение по умолчанию в `DefaultAiInputStyle` MUST быть `AiInputMode.Condensed`.

#### Scenario: mode возвращается из стиля
- **WHEN** стиль собирается через `AiInputStyle.builder().mode(AiInputMode.Extended).style()`
- **THEN** `style.mode` MUST равняться `AiInputMode.Extended`

#### Scenario: AiInputMode содержит ровно два варианта
- **WHEN** перечисляются все варианты `AiInputMode`
- **THEN** MUST существовать ровно два значения: `Condensed` и `Extended`

### Requirement: AiInputStyle SHALL expose child component styles
`AiInputStyle` SHALL содержать поля для провайдинга стилей дочерним слотам:
- `fileStyle: FileStyle`
- `startButtonGroupStyle: ButtonGroupStyle`
- `endButtonGroupStyle: ButtonGroupStyle`
- `sendButtonStyle: ButtonStyle`
- `scrollBarStyle: ScrollBarStyle` — стиль скроллбара в многострочном режиме

`AiInputStyleBuilder` MUST предоставлять соответствующие методы-сеттеры для каждого поля.

#### Scenario: fileStyle устанавливается через builder
- **WHEN** `builder.fileStyle(myFileStyle).style()`
- **THEN** `style.fileStyle` MUST равняться `myFileStyle`

#### Scenario: sendButtonStyle устанавливается через builder
- **WHEN** `builder.sendButtonStyle(myButtonStyle).style()`
- **THEN** `style.sendButtonStyle` MUST равняться `myButtonStyle`

#### Scenario: Все стили имеют значения по умолчанию
- **WHEN** `AiInputStyle.builder().style()` вызывается без настройки дочерних стилей
- **THEN** все поля стилей MUST возвращать ненулевые значения по умолчанию

### Requirement: AiInputColors SHALL use StatefulValue<Brush> for all color properties
`AiInputColors` SHALL содержать только свойства типа `StatefulValue<Brush>`:
- `backgroundColor: StatefulValue<Brush>` — фон компонента
- `inputColor: StatefulValue<Brush>` — цвет вводимого текста
- `placeholderColor: StatefulValue<Brush>` — цвет placeholder
- `cursorColor: StatefulValue<Brush>` — кисть курсора для `BasicTextField`

`AiInputColorsBuilder` MUST предоставлять для каждого цвета четыре перегрузки: `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>`.

#### Scenario: cursorColor устанавливается через builder
- **WHEN** `colorsBuilder.cursorColor(Color.Blue).build()`
- **THEN** `colors.cursorColor` MUST быть `StatefulValue` оборачивающий `SolidColor(Color.Blue)`

#### Scenario: backgroundColor поддерживает InteractiveColor
- **WHEN** `colorsBuilder.backgroundColor(interactiveColor).build()`
- **THEN** `colors.backgroundColor` MUST быть `StatefulValue<Brush>` с интерактивными состояниями

#### Scenario: Все цвета имеют значения по умолчанию
- **WHEN** `AiInputColors.builder().build()` вызывается без настройки цветов
- **THEN** все поля MUST возвращать ненулевые `StatefulValue<Brush>`

### Requirement: AiInputDimensions SHALL define all spacing values as StatefulValue<Dp>
`AiInputDimensions` SHALL содержать поля типа `StatefulValue<Dp>`:
- `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom` — внешние отступы компонента
- `textFieldPaddingStart`, `textFieldPaddingEnd`, `textFieldPaddingTop`, `textFieldPaddingBottom` — внутренние отступы текстового поля
- `contentPadding` — отступ снизу области контента
- `contentSpacing` — расстояние между элементами области контента
- `scrollBarPaddingStart` — отступ от правой границы текстового поля до скроллбара
- `scrollBarPaddingTop`, `scrollBarPaddingBottom` — отступы трека скроллбара внутрь от верхней/нижней границы области текста

`AiInputDimensionsBuilder` MUST предоставлять для каждого поля методы с `StatefulValue<Dp>` и shorthand-перегрузку с `Dp`.

#### Scenario: contentPadding устанавливается через builder
- **WHEN** `dimensionsBuilder.contentPadding(8.dp).build()`
- **THEN** `dimensions.contentPadding` MUST быть `StatefulValue` оборачивающий `8.dp`

#### Scenario: Все размеры имеют значения по умолчанию
- **WHEN** `AiInputDimensions.builder().build()` вызывается без настройки
- **THEN** все поля MUST возвращать ненулевые `StatefulValue<Dp>` (значение `0.dp`)

### Requirement: AiInputStyle SHALL expose text style for input and placeholder
`AiInputStyle` SHALL содержать:
- `inputStyle: StatefulValue<TextStyle>` — типографика вводимого текста
- `placeholderStyle: StatefulValue<TextStyle>` — типографика placeholder

`AiInputStyleBuilder` MUST предоставлять методы `inputStyle(TextStyle)`, `inputStyle(StatefulValue<TextStyle>)`, `placeholderStyle(TextStyle)`, `placeholderStyle(StatefulValue<TextStyle>)`.

#### Scenario: inputStyle устанавливается через builder
- **WHEN** `builder.inputStyle(TextStyle(fontSize = 16.sp)).style()`
- **THEN** `style.inputStyle` MUST содержать TextStyle с `fontSize = 16.sp`

#### Scenario: placeholderStyle имеет значение по умолчанию
- **WHEN** `AiInputStyle.builder().style()` без вызова `placeholderStyle`
- **THEN** `style.placeholderStyle` MUST возвращать ненулевой `StatefulValue<TextStyle>`

### Requirement: AiInputStyleBuilder SHALL be annotated with @ApiInfo
Интерфейс `AiInputStyleBuilder` SHALL быть аннотирован `@ApiInfo` из пакета `com.sdds.api.info.compose`. Это обеспечивает генерацию конфигурации компонента через KSP.

#### Scenario: Аннотация присутствует на интерфейсе
- **WHEN** инспектируется интерфейс `AiInputStyleBuilder`
- **THEN** MUST присутствовать аннотация `@ApiInfo`

### Requirement: LocalAiInputStyle SHALL provide default AiInputStyle via CompositionLocal
`LocalAiInputStyle` SHALL быть объявлен как `compositionLocalOf { AiInputStyle.builder().style() }`. Компонент `AiInput` SHALL использовать `LocalAiInputStyle.current` как значение по умолчанию параметра `style`.

#### Scenario: Компонент использует LocalAiInputStyle по умолчанию
- **WHEN** `AiInput` вызывается без явного параметра `style`
- **THEN** компонент MUST использовать `LocalAiInputStyle.current`

#### Scenario: LocalAiInputStyle можно переопределить через CompositionLocalProvider
- **WHEN** `CompositionLocalProvider(LocalAiInputStyle provides customStyle)` оборачивает `AiInput`
- **THEN** `AiInput` внутри MUST использовать `customStyle`

### Requirement: AiInputMotionStyle SHALL be defined for motion support
`AiInputMotionStyle` SHALL быть data class с анимируемыми свойствами, соответствующими полям `AiInputColors` и `AiInputDimensions`: `backgroundColor`, `inputColor`, `placeholderColor`, `cursorColor` и ключевые отступы. `rememberAiInputMotion(motionContext)` SHALL возвращать `Motion<AiInputMotionStyle>`.

#### Scenario: rememberAiInputMotion возвращает Motion с ненулевым style
- **WHEN** `rememberAiInputMotion(rememberMotionContext(interactionSource))` вызывается в Composable-контексте
- **THEN** возвращаемый `Motion<AiInputMotionStyle>` MUST иметь ненулевое поле `style`

