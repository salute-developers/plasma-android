## Context

`AiHeaderStyle` — стиль Compose-компонента `AiHeader` в `sdds-core/uikit-compose`. До этого изменения цвета в `AiHeaderColorsBuilder` принимали только `Color`, `Brush` и `StatefulValue<Brush>`, а форма хранилась как простой `Shape`. Остальные компоненты дизайн-системы (например, `NavigationDrawer`) уже используют `InteractiveColor` для цветов и `StatefulValue<Shape>` для формы. Изменение приводит `AiHeader` к единому стандарту.

## Goals / Non-Goals

**Goals:**
- Добавить перегрузки `InteractiveColor` во все четыре цветовых метода `AiHeaderColorsBuilder`.
- Изменить тип `AiHeaderStyle.shape` с `Shape` на `StatefulValue<Shape>`.
- Сохранить полную обратную совместимость: существующий код не требует изменений.
- Следовать паттерну `NavigationDrawerStyle` как эталонной реализации.

**Non-Goals:**
- Добавление motion-свойств для `shape` (анимированный переход формы).
- Изменения в `tokens/*` — существующие стили уже совместимы с новым API.

## Decisions

**Конвертация `InteractiveColor` → `StatefulValue<Brush>`**
Перегрузки `InteractiveColor` реализуются как default-методы в интерфейсе `AiHeaderColorsBuilder`, вызывающие `.asStatefulBrush()` (из `com.sdds.compose.uikit.interactions`). Это тот же паттерн, что и в `NavigationDrawerColorsBuilder`. Альтернатива — хранить `InteractiveColor` напрямую — отклонена: `AiHeaderColors` использует `StatefulValue<Brush>` как единственный формат хранения цветов.

**`shape: StatefulValue<Shape>` вместо `Shape`**
Тип свойства в интерфейсе и data class изменяется; метод `shape(Shape)` в `AiHeaderStyleBuilder` становится default-реализацией (`shape.asStatefulValue()`), абстрактным остаётся только `shape(StatefulValue<Shape>)`. В компоненте `AiHeader.kt` добавляется `val shape = style.shape.getValueAsState(motion.context)` с передачей `shape.value` в `backgroundBrush`. Альтернатива — оставить `Shape` и добавить отдельный метод — отклонена ради однородности с другими компонентами.

**Два импорта `asStatefulBrush`**
В `AiHeaderStyle.kt` нужны оба импорта: `com.sdds.compose.uikit.graphics.brush.asStatefulBrush` (для `Color`) и `com.sdds.compose.uikit.interactions.asStatefulBrush` (для `InteractiveColor`). Kotlin разрешает их без конфликта, так как функции расширены на разные типы-приёмники.

**Правки в `plugin_theme_builder`**
Два сопутствующих изменения потребовались из-за переноса `AiHeaderStyle` в пакет `com.sdds.compose.uikit.ai`:
1. В `AiHeaderConfigDelegate` добавлен параметр `componentStylePackage = "com.sdds.compose.uikit.ai"` — без него кодогенератор генерировал импорт из старого пакета.
2. Поля `startButtonIcon` / `endButtonIcon` удалены из `AiHeaderProperties` и `AiHeaderComposeVariationGenerator` — они были добавлены по ошибке и никогда не реализовывались в самом компоненте.

## Risks / Trade-offs

- [Несовместимость типа `shape`] → Mitigation: обратная совместимость полная — метод `shape(Shape)` остаётся, перегрузка просто оборачивает значение в `asStatefulValue()`. Бинарная несовместимость на уровне JVM отсутствует.
- [Render-поведение формы по состоянию] → `backgroundBrush` — не Composable, shape передаётся как параметр. При изменении состояния через `getValueAsState` Compose перерисует Row с новым значением. Outline пересчитывается через `drawWithCache` при изменении размера; при смене состояния — через перекомпозицию. Это корректно.
