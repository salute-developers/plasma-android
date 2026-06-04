## Context

`AiHeaderStyle` последовательно переводит свои поля на `StatefulValue<T>`: `shape` и все цвета уже `StatefulValue<Shape>`/`StatefulValue<Brush>` и резолвятся через Motion API. Размеры (`AiHeaderDimensions`) пока остаются единственной группой с plain `Dp`, что блокирует анимацию отступов и задание разных значений на разных интерактивных состояниях. Эталон: `NavigationDrawerDimensions` — там все поля уже `StatefulValue<Dp>` и используется `getDpAsState(motion.context, motion.style.prop)`.

## Goals / Non-Goals

**Goals:**
- Перевести все 10 полей `AiHeaderDimensions` с `Dp` на `StatefulValue<Dp>`
- Добавить `MotionProperty<Dp>` для всех 10 dimension-полей в `AiHeaderMotionStyle`
- Сохранить обратную совместимость builder API: существующий код с `Dp`-вызовами компилируется без изменений
- Компонент `AiHeader` резолвит размеры через `getDpAsState` по аналогии с colors

**Non-Goals:**
- Реализация анимаций для конкретных transitions на уровне токенов
- Изменения в View-реализации или модуле `uikit`
- Изменения в `plugin_theme_builder` — генератор уже добавляет `.asStatefulValue(...)` когда у размера есть states

## Decisions

**1. Паттерн: `StatefulValue<Dp>` + `getDpAsState`**

Следуем точно тому же паттерну, что уже применён в `NavigationDrawerDimensions`. Альтернатива — добавить обёртку `DimensionState` — отклонена как преждевременная абстракция без существующей потребности.

**2. Полный охват всех 10 полей**

Переводим все поля разом, а не выборочно. Частичный перевод (например, только padding) создал бы неконсистентность: часть полей stateful, часть — нет. Всё разом — предпочтительнее.

**3. Backward-compatible builder: `StatefulValue<Dp>` + Dp default**

Абстрактный метод: `fun paddingStart(paddingStart: StatefulValue<Dp>): AiHeaderDimensionsBuilder`  
Default-метод: `fun paddingStart(paddingStart: Dp) = paddingStart(paddingStart.asStatefulValue())`  
Это аналогично паттерну `shape(Shape)` / `shape(StatefulValue<Shape>)` в `AiHeaderStyleBuilder`.  
Генератор `plugin_theme_builder` вызывает `paddingStart(someTokenDp)` — этот код продолжает компилироваться через default-метод.

**4. `AiHeaderMotionStyle` — 10 новых `MotionProperty<Dp>`**

По аналогии с тем, как colors добавили `MotionProperty<Brush>` для каждого цвета, Motion API должен поддерживать анимацию каждого параметра отступа/размера. Default для всех 10: `noMotion()`.

**5. Резолв в `AiHeader.kt`**

Каждый `Dp` заменяется на `val paddingStart by style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)`. Расчёт всех 10 значений выносится в начало composable-функции.

## Risks / Trade-offs

- **BREAKING change** — публичный API `AiHeaderDimensions` меняется. Потребители, напрямую реализующие интерфейс (не через builder), получат ошибки компиляции. → Митигация: это ожидаемое изменение в рамках текущей фичи-ветки до выпуска публичного релиза.
- **10 новых `getDpAsState` вызовов** в одном composable — незначительная overhead (аналогично NavigationDrawer, где столько же). → Приемлемо.
