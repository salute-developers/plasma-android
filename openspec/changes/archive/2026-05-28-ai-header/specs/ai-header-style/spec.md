## ADDED Requirements

### Requirement: AiHeaderStyle SHALL define component appearance
`sdds-core/uikit-compose` SHALL содержать `@Stable interface AiHeaderStyle : Style` с полями: `titleStyles: StatefulValue<TextStyle>`, `subtitleStyles: StatefulValue<TextStyle>`, `colors: AiHeaderColors`, `dimensions: AiHeaderDimensions`, `startButtonStyle: ButtonStyle`, `endButtonStyle: ButtonStyle`. Companion object MUST предоставлять `fun builder(): AiHeaderStyleBuilder`.

#### Scenario: Дефолтный стиль через builder
- **WHEN** вызывается `AiHeaderStyle.builder().style()`
- **THEN** MUST возвращаться валидный `AiHeaderStyle` без исключений

#### Scenario: Все поля доступны из стиля
- **WHEN** получен экземпляр `AiHeaderStyle`
- **THEN** все поля (`titleStyles`, `subtitleStyles`, `colors`, `dimensions`, `startButtonStyle`, `endButtonStyle`) MUST быть доступны без NPE

### Requirement: AiHeaderColors SHALL use StatefulValue\<Brush\> for all colors
`@Stable interface AiHeaderColors` SHALL содержать только `StatefulValue<Brush>` поля: `backgroundBrush`, `titleBrush`, `subtitleBrush`, `dividerBrush`. `Color` и `InteractiveColor` MUST NOT использоваться напрямую.

#### Scenario: Цвет фона через brush
- **WHEN** `AiHeaderColors.backgroundBrush` задан как `SolidColor(color).asStatefulValue()`
- **THEN** компонент MUST применять этот brush как фон

#### Scenario: Все brush-поля задаются через билдер
- **WHEN** вызываются `backgroundBrush(Color)`, `titleBrush(Color)`, `subtitleBrush(Color)`, `dividerBrush(Color)` в `AiHeaderColorsBuilder`
- **THEN** каждый MUST конвертироваться в `StatefulValue<Brush>` через `asStatefulBrush()`

### Requirement: AiHeaderColorsBuilder SHALL provide Color, Brush and StatefulValue overloads
`interface AiHeaderColorsBuilder` SHALL предоставлять для каждого цвета три перегрузки: `fun xColor(Color)`, `fun xColor(Brush)`, `fun xColor(StatefulValue<Brush>)`. Перегрузки с `Color` и `Brush` MUST быть default-методами, делегирующими к `StatefulValue<Brush>` перегрузке.

#### Scenario: Color-перегрузка делегирует к StatefulValue
- **WHEN** вызывается `backgroundBrush(Color.White)`
- **THEN** результирующий `AiHeaderColors.backgroundBrush` MUST равняться `SolidColor(Color.White).asStatefulValue()`

### Requirement: AiHeaderDimensions SHALL define all spacing and size properties
`@Stable interface AiHeaderDimensions` SHALL содержать: `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness` — все типа `Dp`.

#### Scenario: subtitlePadding доступен из dimensions
- **WHEN** получен экземпляр `AiHeaderDimensions`
- **THEN** `subtitlePadding` MUST возвращать `Dp` без NPE

#### Scenario: dividerThickness используется при отрисовке линии
- **WHEN** `hasDivider = true`
- **THEN** `strokeWidth` в `drawLine` MUST равняться `dimensions.dividerThickness.toPx()`

### Requirement: AiHeaderStyleBuilder SHALL build complete style
`interface AiHeaderStyleBuilder : StyleBuilder<AiHeaderStyle>` SHALL предоставлять методы для установки всех полей `AiHeaderStyle`. `@Composable fun colors(builder)` и `@Composable fun dimensions(builder)` MUST принимать builder-лямбды. Метод `style()` MUST возвращать корректный `AiHeaderStyle`.

#### Scenario: Builder собирает стиль с кастомными кнопками
- **WHEN** вызывается `AiHeaderStyle.builder().startButtonStyle(myStyle).style()`
- **THEN** `result.startButtonStyle` MUST равняться `myStyle`

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
