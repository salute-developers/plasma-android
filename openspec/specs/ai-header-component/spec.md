## ADDED Requirements

### Requirement: AiHeader SHALL render actionBefore and actionAfter slots
`AiHeader` в `sdds-core/uikit-compose` SHALL принимать опциональные параметры `actionBefore: (@Composable () -> Unit)?` и `actionAfter: (@Composable () -> Unit)?`. Каждый слот MUST получать стиль кнопки через `CompositionLocalProvider(LocalIconButtonStyle provides ...)` из `AiHeaderStyle.startButtonStyle` / `AiHeaderStyle.endButtonStyle`, а также стиль группы кнопок через `LocalButtonGroupStyle` из `AiHeaderStyle.startButtonGroupStyle` / `AiHeaderStyle.endButtonGroupStyle`.

#### Scenario: Оба слота отсутствуют
- **WHEN** `actionBefore = null` и `actionAfter = null`
- **THEN** Row MUST не содержать элементов слева и справа от текстового блока

#### Scenario: Только actionBefore задан
- **WHEN** `actionBefore != null`, `actionAfter = null`
- **THEN** контент MUST рендерится слева, справа — пусто; текстовый блок занимает `weight(1f)`

#### Scenario: Оба слота заданы
- **WHEN** `actionBefore != null` и `actionAfter != null`
- **THEN** оба слота MUST рендериться по краям, текстовый блок между ними с `weight(1f)`

#### Scenario: Слот кнопки получает стиль из AiHeaderStyle
- **WHEN** `actionBefore` рендерит `IconButton`
- **THEN** `LocalIconButtonStyle` MUST содержать `style.startButtonStyle` внутри слота

#### Scenario: Слот получает LocalButtonGroupStyle
- **WHEN** `actionBefore` рендерит `ButtonGroup`
- **THEN** `LocalButtonGroupStyle.current` внутри слота MUST равняться `style.startButtonGroupStyle`

### Requirement: AiHeader SHALL render title and subtitle slots
`AiHeader` SHALL принимать `titleContent: (@Composable () -> Unit)?` и `subtitleContent: (@Composable () -> Unit)?`. Оба слота MUST получать типографику и цвет через `ProvideTextStyle` и `getBrushAsState` из `AiHeaderStyle` и `Motion`.

#### Scenario: Только title задан
- **WHEN** `titleContent != null`, `subtitleContent = null`
- **THEN** Column MUST содержать только title без отступа для subtitle

#### Scenario: Title и subtitle заданы
- **WHEN** `titleContent != null` и `subtitleContent != null`
- **THEN** subtitle MUST рендерится ниже title с вертикальным отступом `subtitlePadding` из `AiHeaderDimensions`

#### Scenario: Subtitle null — отступ не добавляется
- **WHEN** `subtitleContent = null`
- **THEN** `Spacer` с `subtitlePadding` MUST NOT присутствовать в иерархии

### Requirement: AiHeader SHALL support title alignment
`AiHeader` SHALL принимать параметр `titleAlignment: AiHeaderTitleAlignment` с дефолтом `AiHeaderTitleAlignment.Start`. Значение MUST влиять на `horizontalAlignment` текстового Column и `TextAlign` провайдимого `TextStyle`.

#### Scenario: Выравнивание Start
- **WHEN** `titleAlignment = AiHeaderTitleAlignment.Start`
- **THEN** текстовый Column MUST иметь `horizontalAlignment = Alignment.Start`, текст MUST иметь `TextAlign.Start`

#### Scenario: Выравнивание Center
- **WHEN** `titleAlignment = AiHeaderTitleAlignment.Center`
- **THEN** текстовый Column MUST иметь `horizontalAlignment = Alignment.CenterHorizontally`, текст MUST иметь `TextAlign.Center`

#### Scenario: Выравнивание End
- **WHEN** `titleAlignment = AiHeaderTitleAlignment.End`
- **THEN** текстовый Column MUST иметь `horizontalAlignment = Alignment.End`, текст MUST иметь `TextAlign.End`

### Requirement: AiHeader SHALL align content to top
Все элементы Row (слоты и текстовый блок) MUST быть выровнены по верхнему краю через `verticalAlignment = Alignment.Top`.

#### Scenario: Слоты и текстовый блок выровнены по верху
- **WHEN** `AiHeader` рендерится с обоими слотами и title/subtitle
- **THEN** верхние края слотов и текстового блока MUST совпадать визуально

### Requirement: AiHeader SHALL accept SeparationType for divider control
`AiHeader` SHALL принимать параметр `separationType: AiHeaderSeparationType` с дефолтом `AiHeaderSeparationType.None`. При `separationType == AiHeaderSeparationType.Divider` компонент MUST рисовать горизонтальную линию по нижнему краю через `Modifier.drawBehind { drawLine(...) }`, используя `AiHeaderColors.dividerBrush` и `AiHeaderDimensions.dividerThickness`. Компонент `Divider` MUST NOT использоваться.

#### Scenario: separationType = Divider рисует линию
- **WHEN** `separationType = AiHeaderSeparationType.Divider`
- **THEN** линия MUST рисоваться по нижнему краю компонента с толщиной из `dividerThickness` и цветом из `dividerBrush`

#### Scenario: separationType = None не рисует линию
- **WHEN** `separationType = AiHeaderSeparationType.None`
- **THEN** линия MUST NOT рисоваться; `drawBehind`-блок MUST быть пустым или отсутствовать

### Requirement: AiHeaderSeparationType SHALL be defined as enum
`AiHeaderSeparationType` SHALL быть `enum class` с двумя вариантами: `Divider` и `None`. SHALL быть объявлен в пакете `com.sdds.compose.uikit.ai` рядом с `AiHeaderTitleAlignment`.

#### Scenario: Enum содержит ровно два варианта
- **WHEN** перечисляются все варианты `AiHeaderSeparationType`
- **THEN** MUST существовать ровно два значения: `Divider` и `None`

### Requirement: AiHeader SHALL apply background from style
`AiHeader` MUST применять фон через `Modifier.background(brush = backgroundBrush)`, где `backgroundBrush` берётся из `AiHeaderColors` с учётом текущего состояния `InteractionSource` / Motion-контекста.

#### Scenario: Фон применяется из стиля
- **WHEN** `AiHeaderStyle.colors.backgroundBrush` задан
- **THEN** компонент MUST отображаться с этим brush-фоном

### Requirement: AiHeader SHALL support Motion API
`AiHeader` SHALL принимать параметр `motion: Motion<AiHeaderMotionStyle>` с дефолтом `rememberAiHeaderMotion(motionContext = rememberMotionContext(interactionSource))`. Цвета title, subtitle, background, divider и стили текста MUST браться через `getBrushAsState` / `getTextStyleAsState` из motion-контекста.

#### Scenario: Motion применяется к цвету title
- **WHEN** `AiHeaderMotionStyle.titleColor` задан как анимированное свойство
- **THEN** цвет title MUST анимироваться согласно motion при смене состояния

#### Scenario: Motion применяется к стилю subtitle
- **WHEN** `AiHeaderMotionStyle.subtitleStyle` задан
- **THEN** `TextStyle` subtitle MUST анимироваться через `getTextStyleAsState`
