## ADDED Requirements

### Requirement: AiHeaderStyle SHALL define component appearance
`sdds-core/uikit-compose` SHALL содержать `@Stable interface AiHeaderStyle : Style` с полями: `shape: StatefulValue<Shape>`, `titleStyles: StatefulValue<TextStyle>`, `subtitleStyles: StatefulValue<TextStyle>`, `colors: AiHeaderColors`, `dimensions: AiHeaderDimensions`, `startButtonStyle: ButtonStyle`, `endButtonStyle: ButtonStyle`, `startButtonGroupStyle: ButtonGroupStyle`, `endButtonGroupStyle: ButtonGroupStyle`. Companion object MUST предоставлять `fun builder(): AiHeaderStyleBuilder`.

#### Scenario: Дефолтный стиль через builder
- **WHEN** вызывается `AiHeaderStyle.builder().style()`
- **THEN** MUST возвращаться валидный `AiHeaderStyle` без исключений

#### Scenario: Все поля доступны из стиля
- **WHEN** получен экземпляр `AiHeaderStyle`
- **THEN** все поля (`shape`, `titleStyles`, `subtitleStyles`, `colors`, `dimensions`, `startButtonStyle`, `endButtonStyle`, `startButtonGroupStyle`, `endButtonGroupStyle`) MUST быть доступны без NPE

#### Scenario: shape по умолчанию
- **WHEN** вызывается `AiHeaderStyle.builder().style()` без явного задания `shape`
- **THEN** `shape.getDefaultValue()` MUST возвращать `RoundedCornerShape(0)`

### Requirement: AiHeaderColors SHALL use StatefulValue\<Brush\> for all colors
`@Stable interface AiHeaderColors` SHALL содержать только `StatefulValue<Brush>` поля: `backgroundBrush`, `titleBrush`, `subtitleBrush`, `dividerBrush`. `Color` и `InteractiveColor` MUST NOT использоваться напрямую.

#### Scenario: Цвет фона через brush
- **WHEN** `AiHeaderColors.backgroundBrush` задан как `SolidColor(color).asStatefulValue()`
- **THEN** компонент MUST применять этот brush как фон

#### Scenario: Все brush-поля задаются через билдер
- **WHEN** вызываются `backgroundBrush(Color)`, `titleBrush(Color)`, `subtitleBrush(Color)`, `dividerBrush(Color)` в `AiHeaderColorsBuilder`
- **THEN** каждый MUST конвертироваться в `StatefulValue<Brush>` через `asStatefulBrush()`

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

### Requirement: AiHeaderDimensions SHALL define all spacing and size properties
`@Stable interface AiHeaderDimensions` SHALL содержать все 10 полей типа `StatefulValue<Dp>` (не `Dp`): `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`.

#### Scenario: subtitlePadding доступен из dimensions
- **WHEN** получен экземпляр `AiHeaderDimensions`
- **THEN** `subtitlePadding` MUST возвращать `StatefulValue<Dp>` без NPE

#### Scenario: dividerThickness — StatefulValue<Dp>
- **WHEN** получен экземпляр `AiHeaderDimensions`
- **THEN** `dividerThickness` MUST иметь тип `StatefulValue<Dp>`

#### Scenario: Все поля — StatefulValue<Dp>
- **WHEN** проверяются типы всех 10 полей `AiHeaderDimensions`
- **THEN** каждое поле MUST быть `StatefulValue<Dp>`, а не plain `Dp`

### Requirement: AiHeaderStyleBuilder SHALL build complete style
`interface AiHeaderStyleBuilder : StyleBuilder<AiHeaderStyle>` SHALL предоставлять методы для установки всех полей `AiHeaderStyle`. `@Composable fun colors(builder)` и `@Composable fun dimensions(builder)` MUST принимать builder-лямбды. Метод `style()` MUST возвращать корректный `AiHeaderStyle`.

#### Scenario: Builder собирает стиль с кастомными кнопками
- **WHEN** вызывается `AiHeaderStyle.builder().startButtonStyle(myStyle).style()`
- **THEN** `result.startButtonStyle` MUST равняться `myStyle`

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

### Requirement: LocalAiHeaderStyle SHALL provide default style via CompositionLocal
`val LocalAiHeaderStyle` SHALL быть `compositionLocalOf { AiHeaderStyle.builder().style() }`. `AiHeader` MUST использовать `LocalAiHeaderStyle.current` как дефолтный стиль.

#### Scenario: CompositionLocal провайдит стиль
- **WHEN** `AiHeader` используется без явного параметра `style`
- **THEN** стиль MUST браться из `LocalAiHeaderStyle.current`

### Requirement: AiHeaderMotionStyle SHALL define motion properties for animated values
`@Stable interface AiHeaderMotionStyle : MotionStyle` SHALL содержать `MotionProperty<Brush>` для `titleColor`, `subtitleColor`, `backgroundColor`, `dividerColor` и `MotionProperty<TextStyle>` для `titleStyle`, `subtitleStyle`. Companion object MUST предоставлять `fun builder(): AiHeaderMotionStyleBuilder`.

#### Scenario: noMotion() используется как дефолт
- **WHEN** вызывается `AiHeaderMotionStyle.builder().style()`
- **THEN** все `MotionProperty` MUST быть `noMotion()` — без анимации по умолчанию

### Requirement: LocalAiHeaderMotionStyle and rememberAiHeaderMotion SHALL integrate with Motion API
SHALL существовать `val LocalAiHeaderMotionStyle = compositionLocalOf { AiHeaderMotionStyle.builder().style() }` и `@Composable fun rememberAiHeaderMotion(style, motionContext): Motion<AiHeaderMotionStyle>` по образцу `rememberCellMotion`.

#### Scenario: rememberAiHeaderMotion возвращает Motion
- **WHEN** вызывается `rememberAiHeaderMotion(motionContext = rememberMotionContext(interactionSource))`
- **THEN** MUST возвращаться `Motion<AiHeaderMotionStyle>` без исключений

### Requirement: AiHeaderMotionStyle SHALL expose MotionProperty<Dp> for all dimension properties
`@Stable interface AiHeaderMotionStyle` SHALL содержать `MotionProperty<Dp>` для каждого из 10 dimension-полей: `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`. `AiHeaderMotionStyleBuilder` MUST предоставлять соответствующие setter-методы. Дефолтное значение каждого MUST быть `noMotion()`.

#### Scenario: noMotion() по умолчанию для dimension-полей
- **WHEN** вызывается `AiHeaderMotionStyle.builder().style()` без задания dimension-свойств
- **THEN** все 10 `MotionProperty<Dp>` MUST возвращать `noMotion()`

#### Scenario: paddingStart можно задать через builder
- **WHEN** вызывается `AiHeaderMotionStyle.builder().paddingStart(myMotionProperty).style()`
- **THEN** `result.paddingStart` MUST равняться `myMotionProperty`

### Requirement: AiHeaderDimensionsBuilder SHALL support StatefulValue<Dp> and Dp overloads
`interface AiHeaderDimensionsBuilder` SHALL предоставлять для каждого из 10 полей два метода: абстрактный `fun xPadding(value: StatefulValue<Dp>): AiHeaderDimensionsBuilder` и default-метод `fun xPadding(value: Dp): AiHeaderDimensionsBuilder`, делегирующий через `value.asStatefulValue()`. Существующий код, вызывающий Dp-перегрузку, MUST компилироваться без изменений.

#### Scenario: Dp-перегрузка делегирует к StatefulValue
- **WHEN** вызывается `dimensionsBuilder.paddingStart(16.dp)`
- **THEN** `result.paddingStart.getDefaultValue()` MUST равняться `16.dp`

#### Scenario: StatefulValue-перегрузка принимается напрямую
- **WHEN** вызывается `dimensionsBuilder.paddingStart(myStatefulDp)` где `myStatefulDp: StatefulValue<Dp>`
- **THEN** `result.paddingStart` MUST быть идентичен `myStatefulDp`

#### Scenario: Обратная совместимость — Dp-вызов компилируется
- **WHEN** существующий код передаёт `Dp`-значение любому из 10 сеттеров билдера
- **THEN** код MUST компилироваться без ошибок

### Requirement: AiHeader SHALL resolve dimensions via getDpAsState
Компонент `AiHeader` MUST получать актуальное значение каждого из 10 dimension-полей через `style.dimensions.xPadding.getDpAsState(motion.context, motion.style.xPadding)`. Прямое использование `Dp`-значений из dimensions без резолва через Motion API NOT ALLOWED.

#### Scenario: paddingStart резолвится через getDpAsState
- **WHEN** компонент `AiHeader` рендерится с `motion.context` из `rememberMotionContext`
- **THEN** внешний padding Row MUST браться из `style.dimensions.paddingStart.getDpAsState(...).value`

#### Scenario: dividerThickness резолвится через getDpAsState
- **WHEN** `separationType = AiHeaderSeparationType.Divider`
- **THEN** `strokeWidth` в `drawLine` MUST равняться `style.dimensions.dividerThickness.getDpAsState(...).value.toPx()`

### Requirement: AiHeaderStyle SHALL define startButtonGroupStyle and endButtonGroupStyle
`@Stable interface AiHeaderStyle` SHALL содержать поля `startButtonGroupStyle: ButtonGroupStyle` и `endButtonGroupStyle: ButtonGroupStyle`. Дефолтные значения в `DefaultAiHeaderStyle.Builder.style()` MUST быть `ButtonGroupStyle.builder().style()`.

#### Scenario: Поля доступны из стиля без NPE
- **WHEN** получен экземпляр `AiHeaderStyle` через `AiHeaderStyle.builder().style()`
- **THEN** `startButtonGroupStyle` и `endButtonGroupStyle` MUST быть доступны без `NullPointerException`

#### Scenario: Дефолтный стиль группы кнопок не null
- **WHEN** `AiHeaderStyle.builder().style()` вызван без явной установки `startButtonGroupStyle`
- **THEN** `startButtonGroupStyle` MUST быть экземпляром дефолтного `ButtonGroupStyle` (не `null`)

### Requirement: AiHeaderStyleBuilder SHALL provide setters for button group styles
`interface AiHeaderStyleBuilder` SHALL предоставлять методы `fun startButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder` и `fun endButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder`.

#### Scenario: Builder принимает startButtonGroupStyle
- **WHEN** вызывается `AiHeaderStyle.builder().startButtonGroupStyle(myGroupStyle).style()`
- **THEN** `result.startButtonGroupStyle` MUST равняться `myGroupStyle`

#### Scenario: Builder принимает endButtonGroupStyle
- **WHEN** вызывается `AiHeaderStyle.builder().endButtonGroupStyle(myGroupStyle).style()`
- **THEN** `result.endButtonGroupStyle` MUST равняться `myGroupStyle`
