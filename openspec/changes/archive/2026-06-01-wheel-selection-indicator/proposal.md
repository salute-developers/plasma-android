## Why

Compose-реализация компонента `Wheel` не имеет визуального индикатора выбранного элемента — прямоугольника с кастомизируемой формой и цветом, располагающегося позади колёс. View-реализация (`WheelItemView`) поддерживает `itemSelector`, но в Compose (`WheelStyle`, `BaseWheel`) эта возможность отсутствует, хотя конфиг (`WheelProperties`) уже содержит все нужные поля.

## What Changes

- `WheelStyle` (модуль `sdds-core/uikit-compose`): добавить свойства `itemSelectorEnabled`, `itemSelectorBrush: StatefulValue<Brush>`, `itemSelectorShape: Shape`, `itemSelectorPaddingTop/Bottom/Start/End: Dp` в `WheelColors`/`WheelDimensions` и соответствующие builder-методы.
- `BaseWheel.kt` (модуль `sdds-core/uikit-compose`): добавить отрисовку прямоугольного индикатора позади (`drawBehind` или дополнительный `Box` ниже по z-order) для центрального элемента колеса, занимающего полную ширину viewport.
- `WheelComposeVariationGenerator.kt` (модуль `sdds-core/plugin_theme_builder`): добавить генерацию builder-вызовов для свойств `itemSelectorEnabled`, `itemSelectorColor` (через `getGradientOrWrappedColor`), `itemSelectorShape`, `itemSelectorPadding*`.

## Capabilities

### New Capabilities

- `wheel-compose-selection-indicator`: визуальный индикатор выбранного элемента для Compose-компонента Wheel — прямоугольник с настраиваемой формой, кистью (`StatefulValue<Brush>`) и отступами, отрисовываемый за колёсами.

### Modified Capabilities

_Нет изменений требований к существующим спецификациям._

## Impact

- Публичный API: `WheelStyle`, `WheelColors`, `WheelColorsBuilder`, `WheelDimensions`, `WheelDimensionsBuilder` — добавляются новые свойства и методы (не ломающие изменения, все новые поля опциональны / имеют дефолты).
- Внутренняя реализация: `BaseWheel.kt` — добавляется новый composable-слой под списком.
- `WheelComposeVariationGenerator.kt` — добавляется генерация для selector-полей, уже присутствующих в `WheelProperties`.
- `WheelConfig.kt` — не изменяется (все нужные поля уже есть).
- Затронутые модули: `sdds-core/uikit-compose`, `sdds-core/plugin_theme_builder`.
- Токены и View-стек не затрагиваются.
