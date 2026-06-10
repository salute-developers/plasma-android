## 1. Публичный API — sdds-core/uikit-compose

- [x] 1.1 Добавить `enum class TextAfterMode { EachItem, Static }` в `Wheel.kt` с KDoc
- [x] 1.2 Добавить свойство `textAfterMode: TextAfterMode` в интерфейс `WheelStyle` с KDoc
- [x] 1.3 Добавить метод `fun textAfterMode(mode: TextAfterMode): WheelStyleBuilder` в интерфейс `WheelStyleBuilder` с KDoc
- [x] 1.4 Добавить поле `textAfterMode` в `DefaultWheelStyle` и его `Builder` (дефолт: `TextAfterMode.EachItem`)
- [x] 1.5 Пробросить `textAfterMode` из `Wheel` в `BaseWheel` (новый параметр `textAfterMode: TextAfterMode`)
- [x] 1.6 Добавить `WheelDataSet.staticTextAfter: String? = null` с сохранением обратной совместимости конструктора
- [x] 1.7 Пробросить `WheelDataSet.staticTextAfter` из `Wheel` в `BaseWheel`

## 2. Внутренняя реализация — BaseWheel

- [x] 2.1 Добавить параметр `textAfterMode: TextAfterMode` в сигнатуру `BaseWheel` (дефолт `TextAfterMode.EachItem`)
- [x] 2.1.1 Добавить параметр `staticTextAfter: String?` в сигнатуру `BaseWheel`
- [x] 2.2 В режиме `EachItem` — поведение без изменений; убедиться, что `textAfter` по-прежнему передаётся в элементы `LazyColumn`
- [x] 2.3 В режиме `Static` — передавать пустую строку / `null` вместо `textAfter` в элементы `LazyColumn` (чтобы элементы не рендерили суффикс)
- [x] 2.4 В режиме `Static` — добавить в `SubcomposeLayout` измерение наиширшего элемента **без учёта** `textAfter` (для корректного вычисления ширины колонки)
- [x] 2.5 Вычислять ширину самого широкого основного текста через `textMeasurer` для стабильного горизонтального offset статичного оверлея
- [x] 2.6 Добавить в единый `SubcomposeLayout` оверлейный `Text` (статичный `textAfter`), отображаемый только в режиме `Static` и только если есть `staticTextAfter` или legacy fallback
- [x] 2.7 Позиционировать оверлей стабильно: `Start` — после самого широкого текста, `Center` — с учётом центрирования колонки, `End` — у правого края с дополнительным end padding
- [x] 2.8 Применить `textAfterStyle` и `textAfterColor` к оверлейному `Text` (те же параметры, что используются в `EachItem`)
- [x] 2.9 Объединить layout controls, viewport, description overlay и static overlay в один `SubcomposeLayout`
- [x] 2.10 Обработать fixed width constraints: растягивать `LazyColumn` по ширине без растягивания wheel на всю доступную высоту
- [x] 2.11 Добавить защиты от NaN при нулевой высоте item/viewport
- [x] 2.12 Восстановить clipped viewport высотой `scaledWheelHeight`, чтобы крайние элементы исчезали до controls
- [x] 2.13 Восстановить размещение `Description` как center + computed offset внутри viewport

## 3. Кодогенерация — sdds-core/plugin_theme_builder

- [x] 3.1 Добавить поле `val textAfterMode: Value? = null` в `WheelProperties`
- [x] 3.2 Добавить `textAfterMode` в метод `merge` класса `WheelProperties` (child-overrides-parent)
- [x] 3.3 Добавить `textAfterModeCall(props)` в `propsToBuilderCalls` генератора `WheelComposeVariationGenerator`
- [x] 3.4 Реализовать `textAfterModeCall`: маппинг строк `"eachItem"` → `TextAfterMode.EachItem`, `"static"` → `TextAfterMode.Static`
- [x] 3.5 Добавить импорт `TextAfterMode` в `onAddImports` генератора wheel-стилей

## 4. Документация

- [x] 4.1 Обновить KDoc для `WheelStyle`, `WheelStyleBuilder` — описать новое поле `textAfterMode`
- [x] 4.2 Обновить KDoc/API docs для `WheelDataSet` и `TextAfterMode`, описать `staticTextAfter`
- [x] 4.3 Добавить Preview `BaseWheelStaticTextAfterPreview` в `BaseWheel.kt` с демонстрацией `TextAfterMode.Static`
- [x] 4.4 Обновить `WheelStory`, чтобы задавать `staticTextAfter` явно

## 5. Валидация

- [x] 5.1 Запустить `./gradlew :sdds-core:uikit-compose:compileDebugKotlin`
- [x] 5.2 Запустить `./gradlew :integration-core:uikit-compose-fixtures:compileDebugKotlin`
- [x] 5.3 Запустить `./gradlew :sdds-core:uikit-compose:detekt`
- [x] 5.4 Запустить `./gradlew :sdds-core:plugin_theme_builder:detekt`
- [x] 5.5 Запустить более широкий regression suite при необходимости
