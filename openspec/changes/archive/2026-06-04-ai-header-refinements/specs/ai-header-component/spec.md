## ADDED Requirements

### Requirement: AiHeader SHALL accept SeparationType instead of hasDivider
`AiHeader` SHALL принимать параметр `separationType: AiHeaderSeparationType` с дефолтом `AiHeaderSeparationType.None` вместо `hasDivider: Boolean`. При `separationType == AiHeaderSeparationType.Divider` компонент MUST рисовать горизонтальную линию по нижнему краю через `Modifier.drawBehind`, используя `AiHeaderColors.dividerBrush` и `AiHeaderDimensions.dividerThickness`.

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

### Requirement: AiHeader SHALL provide LocalButtonGroupStyle inside action slots
В каждом слоте (`actionBefore`, `actionAfter`) `AiHeader` MUST провайдить как `LocalIconButtonStyle` (из `style.startButtonStyle`/`style.endButtonStyle`), так и `LocalButtonGroupStyle` (из `style.startButtonGroupStyle`/`style.endButtonGroupStyle`) через `CompositionLocalProvider`.

#### Scenario: Слот получает LocalButtonGroupStyle
- **WHEN** `actionBefore` рендерит `ButtonGroup`
- **THEN** `LocalButtonGroupStyle.current` внутри слота MUST равняться `style.startButtonGroupStyle`

#### Scenario: Слот по-прежнему получает LocalIconButtonStyle
- **WHEN** `actionBefore` рендерит `IconButton`
- **THEN** `LocalIconButtonStyle.current` внутри слота MUST равняться `style.startButtonStyle`

## MODIFIED Requirements

### Requirement: AiHeader SHALL render start and end button slots
`AiHeader` в `sdds-core/uikit-compose` SHALL принимать опциональные параметры `actionBefore: (@Composable () -> Unit)?` и `actionAfter: (@Composable () -> Unit)?`. Каждый слот MUST получать стиль кнопки через `CompositionLocalProvider(LocalIconButtonStyle provides ...)` из `AiHeaderStyle.startButtonStyle` / `AiHeaderStyle.endButtonStyle`, а также стиль группы кнопок через `LocalButtonGroupStyle` из `AiHeaderStyle.startButtonGroupStyle` / `AiHeaderStyle.endButtonGroupStyle`.

#### Scenario: Оба слота кнопок отсутствуют
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

## REMOVED Requirements

### Requirement: AiHeader SHALL render divider via drawBehind
**Reason**: Параметр `hasDivider: Boolean` заменён на `separationType: AiHeaderSeparationType`. Поведение divider сохраняется через `AiHeaderSeparationType.Divider`.
**Migration**: Заменить `hasDivider = true` на `separationType = AiHeaderSeparationType.Divider`; `hasDivider = false` (или дефолт) — на `separationType = AiHeaderSeparationType.None`.
