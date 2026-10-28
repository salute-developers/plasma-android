## Context

`AvatarStyle` — стиль Compose-компонента `Avatar` в `sdds-core/uikit-compose`. Всё семейство стилей (`AvatarStyle`, `AvatarStyleBuilder`, `AvatarColors`, `AvatarColorsBuilder`, `AvatarDimensionValues`, `AvatarDimensionsBuilder`, `DefaultAvatarStyle`, `DefaultAvatarColors`, `DefaultAvatarDimensionValues`) находится в одном файле `sdds-core/uikit-compose/src/commonMain/kotlin/com/sdds/compose/uikit/AvatarStyle.kt`.

Состояние на момент изменения:

- `AvatarColors` уже частично мигрирован: есть `textBrushes: StatefulValue<Brush>?` + `textColors: InteractiveColor?` и `backgroundBrushes: StatefulValue<Brush>?` + `backgroundColors: InteractiveColor?`, deprecated-compat свойства (`textColor`, `backgroundColor`) вычисляются через `getDefaultValue()`. Не мигрированы только `actionColor: Color` и `actionScrimColor: Color`.
- `AvatarStyle.shape: Shape` и `AvatarStyle.textStyle: TextStyle` — простые значения.
- `AvatarDimensionValues` — пять простых `Dp`-свойств (`statusOffsetX`, `statusOffsetY`, `width`, `height`, `statusCutoutPadding`).
- Свойство `AvatarStyle.dimensions: AvatarDimensions` уже помечено `@Deprecated("Use dimensionValues")` и не участвует в миграции.

Эталонные реализации миграции в этом же модуле: `IndicatorStyle.kt` (shape→`shapes`, `width`/`widthValues`), `SwitchStyle.kt` (`toggleTrackWidth` + `toggleTrackWidthValues`), `PopoverStyle.kt`, `ChipStyle.kt`. `StatefulValue` определён в этом же репозитории: `com.sdds.compose.uikit.interactions.StatefulValue` (методы `getValue(stateSet)`, `getDefaultValue()`, `isStateful()`), конструируется через `T.asStatefulValue(vararg valueStates)`.

## Goals / Non-Goals

**Goals:**
- `AvatarStyle.shape`/`textStyle` → `shapes: StatefulValue<Shape>`/`textStyles: StatefulValue<TextStyle>`.
- `AvatarColors.actionColor`/`actionScrimColor` → `actionBrushes`/`actionScrimBrushes: StatefulValue<Brush>`.
- Каждое свойство `AvatarDimensionValues` → `*Values: StatefulValue<Dp>` (суффикс `Values` — паттерн `SwitchDimensionValues`/`IndicatorDimensions`).
- Полная обратная совместимость: старые свойства и builder-перегрузки сохраняются, помечаются `@Deprecated` с `ReplaceWith` на новое property.
- Реализации (`Default*`) хранят только stateful-значения; deprecated-свойства вычисляются из них.
- Дефолтные значения не меняются (`RoundedCornerShape(50)`, `TextStyle.Default`, `Color.White`, `AvatarDefaults.DefaultScrimColor`, `0.dp`, `3.dp`).

**Non-Goals:**
- Повторная миграция уже stateful-частей `AvatarColors` (`textBrushes`/`textColors`/`backgroundBrushes`/`backgroundColors`) — не трогаем.
- Motion-анимации переходов между состояниями значений Avatar.
- Изменения в `tokens/*`, `plugin_theme_builder`, View-стеке (`uikit`), а также миграция других компонентов.
- Удаление `AvatarDimensions` (deprecated data class) — остаётся как есть.

## Decisions

**Naming: `shapes`/`textStyles`, `actionBrushes`/`actionScrimBrushes`, `*Values`**
Для shape/TextStyle используется множественное число (`shapes`, `textStyles`) — как `IndicatorStyle.shapes`, `AiHeaderStyle.titleStyles`. Для action-цветов — суффикс `Brushes` по образцу уже мигрированных `textBrushes`/`backgroundBrushes` в этом же `AvatarColors`. Для размеров — суффикс `Values` (`widthValues`, `heightValues`, `statusOffsetXValues`, `statusOffsetYValues`, `statusCutoutPaddingValues`) — как `SwitchDimensionValues.toggleTrackWidthValues` и `IndicatorDimensions.widthValues`. Альтернатива (единый суффикс `Values` для всего) отклонена: противоречит устоявшимся в модуле паттернам для shape/кистей.

**Хранение в `Default*` — только stateful**
Основные constructor-properties `DefaultAvatarStyle`, `DefaultAvatarColors`, `DefaultAvatarDimensionValues` — только `StatefulValue`. Deprecated-свойства вычисляются как `get()`:
- `override val shape: Shape get() = shapes.getDefaultValue()` (по образцу `DefaultIndicatorStyle`).
- `override val width: Dp get() = widthValues.getDefaultValue()` (по образцу `DefaultSwitchDimensionValues`).
- Для цветов: `override val actionColor: Color get() = (actionBrushes.getDefaultValue() as? SolidColor)?.value ?: Color.White` — по образцу `TabBarStyle.kt:372` / `SegmentStyleValues.legacyColor()` (извлечение `Color` из `SolidColor`). Fallback равен существующему дефолту (`Color.White` для action, `AvatarDefaults.DefaultScrimColor` для scrim), что сохраняет прежнее поведение при non-solid brush.

**Builder: abstract StatefulValue-перегрузка + default Dp/Color-перегрузка**
В `AvatarDimensionsBuilder` абстрактным остаётся `fun width(width: StatefulValue<Dp>)`, а `fun width(width: Dp)` становится default-методом `width(width.asStatefulValue())` — точно как `IndicatorDimensionsBuilder.height`. Аналогично в `AvatarStyleBuilder` для `shape`/`textStyle`. В `AvatarColorsBuilder` для `actionColor`/`actionScrimColor` — четыре перегрузки: `Color` → `asStatefulBrush()` (из `graphics/brush/BrushUtils.kt`), `InteractiveColor` → `asStatefulBrush()` (из `interactions/InteractiveColor.kt`), `Brush` → `asStatefulValue()`, `StatefulValue<Brush>` — каноническая абстрактная. Существующие вызовы в сгенерированных стилях (`actionColor(Color)`, `width(88.0.dp)`) продолжают компилироваться без изменений.

**Сигнатура `Modifier.action` в `Avatar.kt`**
Приватный `Modifier.action(painter, color: () -> Color, scrimColor: () -> Color, size)` меняет типы лямбд на `() -> Brush`: scrim рисуется через `drawRect(brush = ...)`, tint иконки — `ColorFilter.tint((color() as? SolidColor)?.value ?: Color.Unspecified)`. Это internal-функция, публичный API не затрагивается.

**Резолв в компоненте `Avatar.kt`**
stateSet уже формируется из `AvatarStatus` (`remember(status) { setOf(status) }`) и используется для `textBrushes`/`backgroundBrushes`. Те же `interactionSource` + stateSet применяются к новым значениям: `shapes`, `textStyles`, `widthValues`/`heightValues`/`statusOffsetXValues`/`statusOffsetYValues`/`statusCutoutPaddingValues`, `actionBrushes`/`actionScrimBrushes`. В `Avatar` Composable (нужны до входа в `Box`) — через `getValueAsState(...).value`; внутри `Modifier.avatar(...)` (composed-область) — через недерёвянный `getValue(interactionSource, stateSet)` по образцу существующего `backgroundBrush`.

**Defaults сохраняются 1:1**
`shapes = shapes ?: RoundedCornerShape(50).asStatefulValue()`, `textStyles = textStyles ?: TextStyle.Default.asStatefulValue()`, `actionBrushes = actionBrushes ?: Color.White.asStatefulBrush()`, `actionScrimBrushes = ... ?: AvatarDefaults.DefaultScrimColor.asStatefulBrush()`, все размеры `?: 0.dp.asStatefulValue()`, `statusCutoutPadding ?: 3.dp.asStatefulValue()`.

## Risks / Trade-offs

- [Двойной API surface] → Mitigation: deprecated-свойства — тонкие геттеры над stateful-значениями, логика одна; `@Deprecated(..., ReplaceWith(...))` направляет на новый API.
- [Non-solid brush в `actionColor`] → из `LinearGradient` нельзя извлечь `Color`; fallback — прежний дефолт (`Color.White`/`DefaultScrimColor`). Acceptable: legacy-API по определению про одиночный `Color`; документировано в KDoc deprecated-свойства.
- [Перехват `shape` в `.clip()` вне recomposition-трека] → `getValue` в composed-области перекомпозируется при изменении состояния interaction source (тот же механизм, что у работающего `backgroundBrush`).
- [BCV-бейзлайны] → любое изменение сигнатур ломает `apiCheck`; обязательно `./gradlew :sdds-core:uikit-compose:apiDump` и коммит трёх `.api` файлов.
- [Сгенерированный код `tokens/*`] → не регенерируется сейчас; default-перегрузки `Dp`/`Color` сохраняют компилируемость. При будущей регенерации Theme Builder сам начнёт выбирать `StatefulValue`-перегрузки (поведение проверено существующими тестами `PropGroupTreeTest`).
