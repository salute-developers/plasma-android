## 1. WheelStyle — публичный API (sdds-core/uikit-compose)

- [x] 1.1 Добавить `itemSelectorBrush: StatefulValue<Brush>` в интерфейс `WheelColors` и реализацию `DefaultWheelColors`
- [x] 1.2 Добавить в `WheelColorsBuilder` перегрузки для установки цвета индикатора:
  - первичный: `itemSelectorColor(brush: StatefulValue<Brush>): WheelColorsBuilder`
  - `itemSelectorColor(brush: Brush): WheelColorsBuilder` → `brush.asStatefulValue()`
  - `itemSelectorColor(color: Color): WheelColorsBuilder` → `color.asStatefulBrush()`
  - `itemSelectorColor(color: InteractiveColor): WheelColorsBuilder` → `color.asStatefulBrush()`
- [x] 1.3 Добавить `itemSelectorPaddingTop/Bottom/Start/End: StatefulValue<Dp>` в интерфейс `WheelDimensions` и реализацию `DefaultWheelDimensions` (дефолт `0.dp.asStatefulValue()`)
- [x] 1.4 Добавить в `WheelDimensionsBuilder` методы `itemSelectorPaddingTop/Bottom/Start/End(Dp)` (враппируют в `asStatefulValue()`) и `itemSelectorPaddingTop/Bottom/Start/End(StatefulValue<Dp>)` (первичные)
- [x] 1.5 Добавить `itemSelectorEnabled: Boolean` в интерфейс `WheelStyle` и реализацию `DefaultWheelStyle` (дефолт `false`)
- [x] 1.6 Добавить `itemSelectorShape: StatefulValue<Shape>` в интерфейс `WheelStyle` и реализацию `DefaultWheelStyle` (дефолт `RectangleShape.asStatefulValue()`)
- [x] 1.7 Добавить в `WheelStyleBuilder` методы `itemSelectorEnabled(Boolean)`, `itemSelectorShape(Shape)` (враппируют в `asStatefulValue()`), `itemSelectorShape(StatefulValue<Shape>)` (первичный)
- [x] 1.8 Обновить KDoc для всех новых публичных свойств и методов

## 2. Wheel — отрисовка индикатора на группу (sdds-core/uikit-compose)

- [x] 2.1 Добавить `onItemHeightCalculated: ((Int) -> Unit)?` в `BaseWheel` (вызывается аналогично `onLabelPositionCalculated`); передавать значение из `Wheel.kt` в `BaseWheel`
- [x] 2.2 В `Wheel.kt` добавить `var wheelItemHeight by remember { mutableIntStateOf(0) }` и получать `itemHeight` из коллбэка каждого колеса
- [x] 2.3 В `Wheel.kt` добавить `Modifier.drawBehind` на `WheelLayout`: рисовать индикатор через `Shape.createOutline` + `DrawScope.drawOutline(outline, brush)` только при `itemSelectorEnabled && wheelItemHeight > 0`
- [x] 2.4 Высота индикатора: `itemHeight + paddingTop + paddingBottom - itemSpacing` (аналог View); ширина: `groupWidth + paddingStart + paddingEnd`; вертикальная позиция: `(layoutHeight - selectorHeight) / 2`; значения берутся через `StatefulValue.getValue(interactionSource)`

## 3. WheelComposeVariationGenerator (sdds-core/plugin_theme_builder)

- [x] 3.1 Добавить генерацию `itemSelectorEnabled` в `propsToBuilderCalls`: если `WheelProperties.itemSelectorEnabled != null` → `.itemSelectorEnabled(true/false)`
- [x] 3.2 Добавить генерацию `itemSelectorColor` через `getGradientOrWrappedColor("itemSelectorColor", color)` в блок `colorsCall`
- [x] 3.3 Добавить генерацию `itemSelectorShape` через `getShape(shape, variationId, "itemSelectorShape")` в `propsToBuilderCalls`
- [x] 3.4 Добавить генерацию `itemSelectorPaddingTop/Bottom/Start/End` через `appendDimension("item_selector_padding_top", it, variationId)` и т.д. в `dimensionsCall`
- [x] 3.5 Обновить `hasDimensions()` и `hasColors()` для включения новых полей

## 4. Валидация

- [x] 4.1 `./gradlew :sdds-core:uikit-compose:detekt`
- [x] 4.2 `./gradlew :sdds-core:plugin_theme_builder:test`
- [x] 4.3 `./gradlew :sdds-core:plugin_theme_builder:detekt`

## 5. Документация (build-system/docs-template)

- [x] 5.1 Добавить секцию «Индикатор выбранного элемента» в `WheelUsage.md` с описанием свойств и примером кода
