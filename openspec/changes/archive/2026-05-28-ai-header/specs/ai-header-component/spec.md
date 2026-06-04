## ADDED Requirements

### Requirement: AiHeader SHALL render start and end button slots
`AiHeader` в `sdds-core/uikit-compose` SHALL принимать опциональные параметры `startContent: (@Composable RowScope.() -> Unit)?` и `endContent: (@Composable RowScope.() -> Unit)?`. Каждый слот MUST получать стиль кнопки через `CompositionLocalProvider(LocalIconButtonStyle provides ...)` из `AiHeaderStyle.startButtonStyle` / `AiHeaderStyle.endButtonStyle`.

#### Scenario: Оба слота кнопок отсутствуют
- **WHEN** `startContent = null` и `endContent = null`
- **THEN** Row MUST не содержать элементов слева и справа от текстового блока

#### Scenario: Только startContent задан
- **WHEN** `startContent != null`, `endContent = null`
- **THEN** кнопка MUST рендерится слева, справа — пусто; текстовый блок занимает `weight(1f)`

#### Scenario: Оба слота заданы
- **WHEN** `startContent != null` и `endContent != null`
- **THEN** обе кнопки MUST рендериться по краям, текстовый блок между ними с `weight(1f)`

#### Scenario: Слот кнопки получает стиль из AiHeaderStyle
- **WHEN** `startContent` рендерит `IconButton`
- **THEN** `LocalIconButtonStyle` MUST содержать `style.startButtonStyle` внутри слота

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
Все элементы Row (кнопки и текстовый блок) MUST быть выровнены по верхнему краю через `verticalAlignment = Alignment.Top`.

#### Scenario: Кнопки и текстовый блок выровнены по верху
- **WHEN** `AiHeader` рендерится с обоими слотами кнопок и title/subtitle
- **THEN** верхние края кнопок и текстового блока MUST совпадать визуально

### Requirement: AiHeader SHALL render divider via drawBehind
`AiHeader` SHALL принимать параметр `hasDivider: Boolean`. При `hasDivider = true` компонент MUST рисовать горизонтальную линию по нижнему краю через `Modifier.drawBehind { drawLine(...) }`, используя `AiHeaderColors.dividerBrush` и `AiHeaderDimensions.dividerThickness`. Компонент `Divider` MUST NOT использоваться.

#### Scenario: hasDivider = true
- **WHEN** `hasDivider = true`
- **THEN** линия MUST рисоваться по нижнему краю компонента с толщиной из `dividerThickness` и цветом из `dividerBrush`

#### Scenario: hasDivider = false
- **WHEN** `hasDivider = false`
- **THEN** линия MUST NOT рисоваться; `drawBehind` блок MUST быть пустым или отсутствовать

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
