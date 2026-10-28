## Why

`AvatarStyle` частично не поддерживает stateful-значения: форма (`shape`) и стиль текста (`textStyle`) хранятся как простые `Shape`/`TextStyle`, цвета иконки действия (`actionColor`, `actionScrimColor`) — как простые `Color`, а все размеры `AvatarDimensionValues` — как простые `Dp`. Это не позволяет задавать значения, зависящие от интерактивных состояний и статуса (`AvatarStatus`), в то время как другие компоненты уже переведены на `StatefulValue` (эталонные реализации — `IndicatorStyle`, `SwitchStyle`, уже мигрированная часть `AvatarColors`).

`AvatarColors` уже частично мигрирован (`textBrushes`/`textColors`, `backgroundBrushes`/`backgroundColors`) — эта часть API повторно не меняется.

## What Changes

- **`AvatarStyle`** — добавлены `shapes: StatefulValue<Shape>` и `textStyles: StatefulValue<TextStyle>`; свойства `shape` и `textStyle` сохранены как `@Deprecated` compat API (вычисляются из новых через `getDefaultValue()`).
- **`AvatarStyleBuilder`** — методы `shape(Shape)` и `textStyle(TextStyle)` становятся default-перегрузками, делегирующими новым абстрактным `shape(StatefulValue<Shape>)` / `textStyle(StatefulValue<TextStyle>)`.
- **`AvatarColors`** — добавлены `actionBrushes: StatefulValue<Brush>` и `actionScrimBrushes: StatefulValue<Brush>`; свойства `actionColor`/`actionScrimColor` сохранены как `@Deprecated` compat API. Уже мигрированные `textBrushes`/`backgroundBrushes` и т.п. не изменяются.
- **`AvatarColorsBuilder`** — для `actionColor` и `actionScrimColor` добавлены перегрузки `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>` с конвертацией через существующие расширения проекта (`asStatefulBrush()`, `asStatefulValue()`).
- **`AvatarDimensionValues`** — каждое dimension-значение получает `StatefulValue<Dp>`-свойство с суффиксом `Values` (`widthValues`, `heightValues`, `statusOffsetXValues`, `statusOffsetYValues`, `statusCutoutPaddingValues`); существующие `Dp`-свойства сохранены как `@Deprecated` compat API.
- **`AvatarDimensionsBuilder`** — для каждого параметра добавлена пара перегрузок `fun x(Dp)` (default-реализация через `asStatefulValue()`) и `fun x(StatefulValue<Dp>)` (абстрактная).
- **`DefaultAvatarStyle` / `DefaultAvatarColors` / `DefaultAvatarDimensionValues`** — хранят только stateful-значения; deprecated-свойства вычисляются из них (`getDefaultValue()`). Существующие значения по умолчанию не меняются.
- **`Avatar.kt`** — резолв `shapes`, `textStyles`, размеров и action-цветов перенесён на `getValue`/`getValueAsState` с учётом `interactionSource` и состояния `AvatarStatus`.

## Capabilities

### New Capabilities

- `avatar-style`: контракт stateful-API стиля `Avatar` (интерфейсы `AvatarStyle`, `AvatarColors`, `AvatarDimensionValues`, их билдеры и compat-поведение deprecated-API).

### Modified Capabilities

*(нет — `avatar-style` ранее не был описан в `openspec/specs`)*

## Impact

- `sdds-core/uikit-compose` — изменены публичные интерфейсы и реализации в `AvatarStyle.kt` (единственный файл со всем семейством стилей Avatar); обновлён потребитель `Avatar.kt`.
- Публичный API: **не breaking** — все существующие вызовы (`shape(Shape)`, `width(Dp)`, `actionColor(Color)`, чтение `style.shape`, `dimensionValues.width` и т.д.) продолжают компилироваться и работать; изменённые свойства помечены `@Deprecated` с `ReplaceWith`. Нужно обновить бейзлайны binary-compatibility-validator: `api/uikit-compose.api`, `api/android/uikit-compose.api`, `api/jvm/uikit-compose.api` задачей `apiDump`.
- `tokens/*` и `integration-core/*` — сгенерированный Theme Builder код (например, `tokens/plasma.giga.compose/.../avatar/AvatarStyles.kt`, `integration-core/sandbox-compose/.../avatar/AvatarStyles.kt`) вызывает `Dp`/`Color`/`StatefulValue`-перегрузки билдеров — они сохраняются, регенерация не требуется. Код плагина `plugin_theme_builder` не меняется (маппинг перегрузок рефлексивный).
- Docs generation: KDoc новых свойств подхватывается docs-ksp автоматически; скриншоты документации Avatar генерируются из существующих samples без изменений.
- Валидация: компиляция `:sdds-core:uikit-compose`, `apiCheck`, detekt/spotless, компиляция затронутых `tokens/*`/`integration-core/*`, скриншотные тесты Avatar (`ComposeAvatarScreenshotTest`).
