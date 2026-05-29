## MODIFIED Requirements

### Requirement: AiHeaderStyle SHALL define component appearance
`sdds-core/uikit-compose` SHALL содержать `@Stable interface AiHeaderStyle : Style` с полями: `shape: StatefulValue<Shape>`, `titleStyles: StatefulValue<TextStyle>`, `subtitleStyles: StatefulValue<TextStyle>`, `colors: AiHeaderColors`, `dimensions: AiHeaderDimensions`, `startButtonStyle: ButtonStyle`, `endButtonStyle: ButtonStyle`. Companion object MUST предоставлять `fun builder(): AiHeaderStyleBuilder`.

#### Scenario: Дефолтный стиль через builder
- **WHEN** вызывается `AiHeaderStyle.builder().style()`
- **THEN** MUST возвращаться валидный `AiHeaderStyle` без исключений

#### Scenario: Все поля доступны из стиля
- **WHEN** получен экземпляр `AiHeaderStyle`
- **THEN** все поля (`shape`, `titleStyles`, `subtitleStyles`, `colors`, `dimensions`, `startButtonStyle`, `endButtonStyle`) MUST быть доступны без NPE

#### Scenario: shape по умолчанию
- **WHEN** вызывается `AiHeaderStyle.builder().style()` без явного задания `shape`
- **THEN** `shape.getDefaultValue()` MUST возвращать `RoundedCornerShape(0)`

### Requirement: AiHeaderColorsBuilder SHALL provide Color, Brush, InteractiveColor and StatefulValue overloads
`interface AiHeaderColorsBuilder` SHALL предоставлять для каждого из четырёх цветов (`backgroundColor`, `titleColor`, `subtitleColor`, `dividerColor`) четыре перегрузки: `fun xColor(Color)`, `fun xColor(InteractiveColor)`, `fun xColor(Brush)`, `fun xColor(StatefulValue<Brush>)`. Перегрузки с `Color`, `InteractiveColor` и `Brush` MUST быть default-методами, делегирующими к `StatefulValue<Brush>` перегрузке.

#### Scenario: Color-перегрузка делегирует к StatefulValue
- **WHEN** вызывается `backgroundColor(Color.White)`
- **THEN** результирующий `AiHeaderColors.backgroundBrush` MUST равняться `SolidColor(Color.White).asStatefulValue()`

#### Scenario: InteractiveColor-перегрузка конвертируется через asStatefulBrush
- **WHEN** вызывается `titleColor(myInteractiveColor)` где `myInteractiveColor: InteractiveColor`
- **THEN** результирующий `AiHeaderColors.titleBrush` MUST равняться `myInteractiveColor.asStatefulBrush()`

#### Scenario: InteractiveColor с несколькими состояниями
- **WHEN** вызывается `backgroundColor(color.asInteractive(pressed = pressedColor))`
- **THEN** `AiHeaderColors.backgroundBrush.isStateful()` MUST возвращать `true`

## ADDED Requirements

### Requirement: AiHeaderStyleBuilder SHALL support StatefulValue\<Shape\> and Shape overloads
`interface AiHeaderStyleBuilder` SHALL предоставлять два метода для установки формы: `fun shape(shape: StatefulValue<Shape>): AiHeaderStyleBuilder` (абстрактный) и `fun shape(shape: Shape): AiHeaderStyleBuilder` (default-реализация, делегирующая к `shape(shape.asStatefulValue())`). Компонент `AiHeader` MUST резолвить текущую форму через `style.shape.getValueAsState(motion.context)` и передавать её в `backgroundBrush`.

#### Scenario: Shape-перегрузка оборачивается в StatefulValue
- **WHEN** вызывается `shape(RoundedCornerShape(8.dp))`
- **THEN** `style.shape.getDefaultValue()` MUST равняться `RoundedCornerShape(8.dp)`

#### Scenario: StatefulValue<Shape> с разными состояниями
- **WHEN** задаётся `shape(StatefulValue)` с разными формами для состояний pressed/default
- **THEN** компонент MUST применять соответствующую форму при изменении состояния interaction source

#### Scenario: Обратная совместимость — существующий вызов shape(Shape) компилируется
- **WHEN** код вызывает `builder.shape(someShape)` где `someShape: Shape`
- **THEN** код MUST компилироваться без ошибок и продолжать работать корректно
