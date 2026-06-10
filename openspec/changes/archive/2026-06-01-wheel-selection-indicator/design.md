## Context

Compose-компонент `Wheel` (`sdds-core/uikit-compose`) состоит из публичного composable `Wheel.kt` и внутреннего `BaseWheel.kt`, который рендерит `LazyColumn` внутри `Box`. Конфигурация стиля задаётся через `WheelStyle`, `WheelColors`, `WheelDimensions`.

View-реализация (`WheelItemView.kt`) уже содержит `_selectorDrawable: ShapeDrawable`, который рисуется в `onDraw` под элементами при `itemSelectorEnabled && _listViewHasFocus`. В конфиге `WheelProperties` присутствуют поля `itemSelectorEnabled`, `itemSelectorShape`, `itemSelectorColor`, `itemSelectorPaddingTop/Bottom/Start/End`, но генератор `WheelComposeVariationGenerator` их не обрабатывает, а `WheelStyle` их не имеет.

В проекте уже есть примеры компонентов с `StatefulValue<Shape>` (`NavigationDrawerStyle`, `ListItemStyle`) и `StatefulValue<Dp>` (`ListItemStyle`). Генератор `ComposeVariationGenerator` поддерживает `appendDimension` (→ `StatefulValue<Dp>`) и `getShape` (→ простой `Shape`, затем враппируется в `StatefulValue` через builder-перегрузку). Для цвета-кисти используется `getGradientOrWrappedColor` → `StatefulValue<Brush>`.

## Goals / Non-Goals

**Goals:**
- Добавить в `WheelStyle` / `WheelColors` / `WheelDimensions` свойства для настройки индикатора выбранного элемента с `StatefulValue`-типизацией для цвета, формы и дименшенов.
- Отрисовать прямоугольный индикатор (форма + brush) за колёсами в `BaseWheel.kt`, занимающий полную ширину viewport.
- Подключить генерацию этих свойств в `WheelComposeVariationGenerator`.

**Non-Goals:**
- Изменения View-стека (`WheelItemView`, `Wheel.kt` View).
- Изменения `WheelConfig.kt` (все поля уже есть).
- Токенные пакеты (`tokens/**`).

## Decisions

### 1. Цвет индикатора: `StatefulValue<Brush>` в `WheelColors`

Хранится в `WheelColors.itemSelectorBrush: StatefulValue<Brush>`. Builder принимает `InteractiveColor` — `asStatefulBrush()` уже есть в `interactions/InteractiveColor.kt`. Генератор вызывает `getGradientOrWrappedColor("itemSelectorColor", color)` — этот метод уже корректно обрабатывает `SolidColor` и `Gradient`.

### 2. Форма индикатора: `StatefulValue<Shape>` в `WheelStyle`

По аналогии с `NavigationDrawerStyle.selectorShape: StatefulValue<Shape>`. Builder предоставляет две перегрузки: `itemSelectorShape(Shape)` (враппирует в `asStatefulValue()`) и `itemSelectorShape(StatefulValue<Shape>)`. Генератор вызывает `getShape(shape, variationId, "itemSelectorShape")` — возвращает `.itemSelectorShape(ThemeClass.shapes.xxx)`, builder-перегрузка с `Shape` принимает его и конвертирует.

Дефолт: `RectangleShape.asStatefulValue()`.

### 3. Отступы индикатора: `StatefulValue<Dp>` в `WheelDimensions`

По аналогии с `ListItemStyle`: `itemSelectorPaddingTop/Bottom/Start/End: StatefulValue<Dp>`. Builder: первичный метод принимает `StatefulValue<Dp>`, convenience-перегрузка принимает `Dp` и враппирует. Генератор вызывает `appendDimension("item_selector_padding_top", it, variationId)` — уже возвращает нужный stateful-фрагмент.

Дефолт: `0.dp.asStatefulValue()` для всех padding.

### 4. Флаг включения: `itemSelectorEnabled: Boolean` в `WheelStyle`

Простой `Boolean`, не stateful — по аналогии с View-реализацией. Дефолт: `false` (обратно совместимо).

### 5. Расположение индикатора: отдельный `Box` под LazyColumn

Внутри viewport `Box` в `BaseWheel.kt` добавить дочерний `Box` с:
```
Modifier
  .fillMaxWidth()
  .height((itemHeight - paddingTop - paddingBottom).coerceAtLeast(0))
  .align(Alignment.Center)
  .background(brush, shape)
```

Этот `Box` должен быть первым child в viewport `Box` — Compose рисует детей в порядке добавления, поэтому он окажется за `LazyColumn` по z-order. Не использовать `drawBehind`, чтобы корректно работала форма через `Modifier.background(brush, shape)`.

## Risks / Trade-offs

- **`itemHeight == 0` до первого layout**: индикатор не рисуется — корректное начальное состояние, пользователь ничего не заметит.
- **`itemSelectorEnabled = false` по умолчанию** — полностью обратно совместимо, существующие стили без изменений.
- **Ширина индикатора**: при `WheelConstraints.Loose` ширина viewport может быть `WRAP_CONTENT`. Индикатор использует `fillMaxWidth()` — займёт ширину viewport как есть.
- **`StatefulValue<Dp>` для padding**: `getValue(interactionSource)` нужно будет вызвать в composable-контексте. Паттерн уже используется в `ListItemStyle` — следуем ему.

## Валидация

После реализации запустить:
- `./gradlew :sdds-core:uikit-compose:test`
- `./gradlew :sdds-core:plugin_theme_builder:test`
- `./gradlew :sdds-core:uikit-compose:detekt`
- `./gradlew :sdds-core:plugin_theme_builder:detekt`
