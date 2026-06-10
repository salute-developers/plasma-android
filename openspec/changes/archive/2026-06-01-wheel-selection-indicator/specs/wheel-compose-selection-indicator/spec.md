## ADDED Requirements

### Requirement: WheelStyle предоставляет свойства индикатора с StatefulValue-типизацией
`WheelStyle` SHALL предоставлять свойство `itemSelectorEnabled: Boolean` (по умолчанию `false`).
`WheelStyle` SHALL предоставлять свойство `itemSelectorShape: StatefulValue<Shape>` (по умолчанию `RectangleShape.asStatefulValue()`).
`WheelColors` SHALL предоставлять свойство `itemSelectorBrush: StatefulValue<Brush>`.
`WheelDimensions` SHALL предоставлять свойства `itemSelectorPaddingTop`, `itemSelectorPaddingBottom`, `itemSelectorPaddingStart`, `itemSelectorPaddingEnd: StatefulValue<Dp>` (по умолчанию `0.dp.asStatefulValue()`).

#### Scenario: Дефолтные значения индикатора
- **WHEN** вызывается `WheelStyle.builder().style()`
- **THEN** `itemSelectorEnabled == false`, `itemSelectorShape` содержит `RectangleShape`, все `itemSelectorPadding*` содержат `0.dp`

#### Scenario: Builder принимает StatefulValue<Brush> напрямую
- **WHEN** вызывается `WheelColorsBuilder.itemSelectorColor(StatefulValue<Brush>)`
- **THEN** `WheelColors.itemSelectorBrush` содержит переданный `StatefulValue<Brush>`

#### Scenario: Builder принимает Brush с автоматической обёрткой в StatefulValue
- **WHEN** вызывается `WheelColorsBuilder.itemSelectorColor(Brush)`
- **THEN** `WheelColors.itemSelectorBrush` содержит `StatefulValue<Brush>` с переданной кистью

#### Scenario: Builder принимает Color с конвертацией в StatefulValue<Brush>
- **WHEN** вызывается `WheelColorsBuilder.itemSelectorColor(Color)`
- **THEN** `WheelColors.itemSelectorBrush` содержит `StatefulValue<Brush>` через `SolidColor`

#### Scenario: Builder принимает InteractiveColor с конвертацией через asStatefulBrush
- **WHEN** вызывается `WheelColorsBuilder.itemSelectorColor(InteractiveColor)`
- **THEN** `WheelColors.itemSelectorBrush` содержит `StatefulValue<Brush>` с правильным цветом для каждого интерактивного состояния

#### Scenario: Builder принимает Shape с автоматической обёрткой в StatefulValue
- **WHEN** вызывается `WheelStyleBuilder.itemSelectorShape(shape: Shape)`
- **THEN** `WheelStyle.itemSelectorShape` содержит `StatefulValue<Shape>` с переданной формой

#### Scenario: Builder принимает StatefulValue<Shape> напрямую
- **WHEN** вызывается `WheelStyleBuilder.itemSelectorShape(shape: StatefulValue<Shape>)`
- **THEN** `WheelStyle.itemSelectorShape` содержит переданный `StatefulValue<Shape>`

#### Scenario: Builder принимает Dp с автоматической обёрткой в StatefulValue
- **WHEN** вызывается `WheelDimensionsBuilder.itemSelectorPaddingTop(dp: Dp)`
- **THEN** `WheelDimensions.itemSelectorPaddingTop` содержит `StatefulValue<Dp>` с переданным значением

### Requirement: Индикатор отрисовывается за всей группой колёс
Индикатор SHALL отрисовываться в `Wheel` (не в `BaseWheel`) через `Modifier.drawBehind` на `WheelLayout`, охватывая всю группу колёс как единый прямоугольник.
Индикатор SHALL отрисовываться ТОЛЬКО когда `itemSelectorEnabled == true` и `itemHeight > 0`.
Высота индикатора SHALL вычисляться как `itemHeight + paddingTop + paddingBottom - itemSpacing`, но не менее `0` (положительный padding расширяет индикатор за границы элемента, аналогично View-реализации).
Ширина индикатора SHALL вычисляться как `groupWidth + paddingStart + paddingEnd` (положительный padding расширяет за границы группы).
Индикатор SHALL быть выровнен вертикально по центру `WheelLayout`: `top = (layoutHeight - selectorHeight) / 2`.
Форма и кисть SHALL применяться через `Shape.createOutline` + `DrawScope.drawOutline(outline, brush)`.
`itemHeight` SHALL передаваться из `BaseWheel` в `Wheel` через коллбэк `onItemHeightCalculated` — по аналогии с `onLabelPositionCalculated`.

#### Scenario: Индикатор виден при itemSelectorEnabled = true
- **WHEN** `WheelStyle.itemSelectorEnabled == true` и `itemHeight > 0`
- **THEN** единый прямоугольник с заданной формой и кистью отрисовывается за всеми колёсами группы

#### Scenario: Индикатор скрыт при itemSelectorEnabled = false
- **WHEN** `WheelStyle.itemSelectorEnabled == false`
- **THEN** компонент не отрисовывает никакого индикатора

#### Scenario: Индикатор не отрисовывается до получения itemHeight
- **WHEN** `itemHeight == 0` (первый кадр до того как BaseWheel сообщил высоту)
- **THEN** индикатор не отрисовывается

#### Scenario: Padding расширяет индикатор наружу
- **WHEN** `itemSelectorPaddingTop = 4.dp`, `itemSelectorPaddingBottom = 4.dp`
- **THEN** высота индикатора больше `itemHeight` на `8.dp - itemSpacing`

#### Scenario: Индикатор использует актуальные значения StatefulValue по interactionSource
- **WHEN** компонент находится в нажатом или ином интерактивном состоянии
- **THEN** форма, цвет и отступы индикатора берутся из `StatefulValue.getValue(interactionSource)`

### Requirement: WheelComposeVariationGenerator генерирует код для индикатора
Генератор SHALL добавлять builder-вызовы для `itemSelectorEnabled`, `itemSelectorColor`, `itemSelectorShape`, `itemSelectorPadding*` когда соответствующие поля заданы в `WheelProperties`.
Генератор SHALL использовать `getGradientOrWrappedColor` для `itemSelectorColor`, чтобы корректно обрабатывать как `SolidColor`, так и `Gradient`.
Генератор SHALL использовать `getShape` для `itemSelectorShape`.
Генератор SHALL использовать `appendDimension` для каждого из `itemSelectorPadding*`.

#### Scenario: Генерируется вызов для itemSelectorEnabled
- **WHEN** `WheelProperties.itemSelectorEnabled != null`
- **THEN** генерируется `.itemSelectorEnabled(true)` или `.itemSelectorEnabled(false)`

#### Scenario: Генерируется вызов для itemSelectorColor как StatefulValue<Brush>
- **WHEN** `WheelProperties.itemSelectorColor != null` и является SolidColor
- **THEN** генерируется builder-вызов `.itemSelectorColor(...)` со ссылкой на color-токен

#### Scenario: Генерируется вызов для itemSelectorColor-gradient как StatefulValue<Brush>
- **WHEN** `WheelProperties.itemSelectorColor != null` и является Gradient
- **THEN** генерируется builder-вызов `.itemSelectorColor(...)` со ссылкой на gradient-токен

#### Scenario: Генерируется вызов для itemSelectorShape
- **WHEN** `WheelProperties.itemSelectorShape != null`
- **THEN** генерируется `.itemSelectorShape(ThemeClass.shapes.xxx)`

#### Scenario: Генерируются вызовы для itemSelectorPadding* как StatefulValue<Dp>
- **WHEN** `WheelProperties.itemSelectorPaddingTop != null`
- **THEN** генерируется `itemSelectorPaddingTop(...)` с корректным dp-значением или ресурсной ссылкой
