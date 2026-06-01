## MODIFIED Requirements

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

### Requirement: AiHeaderMotionStyle SHALL expose MotionProperty<Dp> for all dimension properties
`@Stable interface AiHeaderMotionStyle` SHALL содержать `MotionProperty<Dp>` для каждого из 10 dimension-полей: `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`. `AiHeaderMotionStyleBuilder` MUST предоставлять соответствующие setter-методы. Дефолтное значение каждого MUST быть `noMotion()`.

#### Scenario: noMotion() по умолчанию для dimension-полей
- **WHEN** вызывается `AiHeaderMotionStyle.builder().style()` без задания dimension-свойств
- **THEN** все 10 `MotionProperty<Dp>` MUST возвращать `noMotion()`

#### Scenario: paddingStart можно задать через builder
- **WHEN** вызывается `AiHeaderMotionStyle.builder().paddingStart(myMotionProperty).style()`
- **THEN** `result.paddingStart` MUST равняться `myMotionProperty`

## ADDED Requirements

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
- **WHEN** `hasDivider = true`
- **THEN** `strokeWidth` в `drawLine` MUST равняться `style.dimensions.dividerThickness.getDpAsState(...).value.toPx()`
