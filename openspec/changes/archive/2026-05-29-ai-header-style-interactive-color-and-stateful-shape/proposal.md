## Why

Стиль компонента `AiHeader` поддерживал только статические цвета (`Color`, `Brush`, `StatefulValue<Brush>`) и единственную форму (`Shape`). Это не позволяет задавать цвета, зависящие от интерактивных состояний (нажатие, фокус, ховер), и форму, меняющуюся по состоянию — в то время как остальные компоненты дизайн-системы (например, `NavigationDrawer`) уже поддерживают эти возможности через `InteractiveColor` и `StatefulValue<Shape>`.

## What Changes

- **`AiHeaderColorsBuilder`** — добавлены перегрузки `InteractiveColor` для всех четырёх цветовых свойств: `backgroundColor`, `titleColor`, `subtitleColor`, `dividerColor`. Каждая перегрузка конвертирует `InteractiveColor` в `StatefulValue<Brush>` через `.asStatefulBrush()`.
- **`AiHeaderStyle`** — тип свойства `shape` изменён с `Shape` на `StatefulValue<Shape>`.
- **`AiHeaderStyleBuilder`** — метод `shape(Shape)` стал дефолтной реализацией, делегирующей в новый абстрактный `shape(StatefulValue<Shape>)`.
- **`AiHeader.kt`** — резолв формы перенесён в Composable-тело через `style.shape.getValueAsState(motion.context)`.
- **`plugin_theme_builder`** — `AiHeaderConfigDelegate` получил `componentStylePackage` для нового пакета `ai.*`; из `AiHeaderProperties` удалены ошибочно добавленные поля `startButtonIcon`/`endButtonIcon`.

## Capabilities

### New Capabilities

*(нет новых capability — изменения расширяют существующую)*

### Modified Capabilities

- `ai-header-style`: расширение контракта `AiHeaderColorsBuilder` (новые перегрузки `InteractiveColor`) и изменение типа `shape` с `Shape` на `StatefulValue<Shape>` в интерфейсе `AiHeaderStyle` и билдере.

## Impact

- `sdds-core/uikit-compose` — изменены публичные интерфейсы `AiHeaderStyle`, `AiHeaderStyleBuilder`, `AiHeaderColorsBuilder` в `AiHeaderStyle.kt`; обновлён компонент `AiHeader.kt`.
- `sdds-core/plugin_theme_builder` — в `AiHeaderConfigDelegate` добавлен параметр `componentStylePackage` (новый пакет `com.sdds.compose.uikit.ai`); из `AiHeaderProperties` и `AiHeaderComposeVariationGenerator` удалены поля `startButtonIcon`/`endButtonIcon`.
- Публичный API: **не breaking** — все существующие вызовы `shape(Shape)` и `*Color(Color/Brush/StatefulValue<Brush>)` продолжают компилироваться без изменений.
- Токены: изменения в `tokens/*` не требуются; существующие стили в `tokens/sdds.serv.compose` корректно работают с новым API.
- Docs generation: KDoc в изменённых интерфейсах подхватывается `docs-ksp` автоматически.
