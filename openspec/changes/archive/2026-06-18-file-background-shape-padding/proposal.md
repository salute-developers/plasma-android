## Why

Компонент `File` (модуль `sdds-core/uikit-compose`) сейчас не умеет рисовать собственный фон, скруглять углы или задавать внешние отступы вокруг контента. Из-за этого его нельзя оформить как «карточку» (контейнер с заливкой и формой) средствами стиля, как это уже умеют соседние компоненты (например, `ListItem`). Нужно добавить поддержку `background`, формы и отступов, не сломав существующие стили File.

## What Changes

- В `FileColors` добавляется свойство `backgroundColor` (тип `StatefulValue<Brush>`) с дефолтом из `Color.Transparent`. В билдер добавляются перегрузки `backgroundColor(Color)`, `backgroundColor(InteractiveColor)`, `backgroundColor(Brush)`, `backgroundColor(StatefulValue<Brush>)` (по образцу `ListItem`).
- В `FileStyle` добавляется свойство `shape` (тип `StatefulValue<Shape>`) с дефолтом из `RectangleShape`; в билдер — `shape(Shape)` и `shape(StatefulValue<Shape>)`.
- В `FileDimensions` добавляются раздельные свойства внешних отступов вокруг контента: `paddingStart`, `paddingTop`, `paddingEnd`, `paddingBottom` (тип `StatefulValue<Dp>`), каждое с дефолтом из `0.dp`; добавляется хелпер `getPaddingValues(interactionSource)`. В билдер — перегрузки `paddingStart(Dp)`/`paddingStart(StatefulValue<Dp>)` и аналоги для остальных сторон.
- Все новые свойства — состоянийзависимые (`StatefulValue`), значения резолвятся по `interactionSource`.
- Composable `File` начинает применять фон (с учётом формы) и внешние отступы к корневому контейнеру.
- Дефолты подобраны так, что без явной настройки поведение и внешний вид существующих стилей не меняются (прозрачный фон, прямоугольная форма, нулевые отступы) — это НЕ breaking change.

## Capabilities

### New Capabilities
- `file-component`: поведение Composable `File` при отрисовке фона, формы и внешних отступов вокруг контента.
- `file-style`: API стиля `FileStyle`/`FileColors`/`FileDimensions` для настройки фона (`StatefulValue<Brush>`), формы (`StatefulValue<Shape>`) и раздельных отступов (`StatefulValue<Dp>`) с обратносовместимыми дефолтами.

### Modified Capabilities
<!-- Нет существующих spec-ов для File; новые требования оформляются как новые capability. -->

## Impact

- Затронутый модуль: `sdds-core/uikit-compose`.
- Затронутые файлы: `File.kt`, `FileStyle.kt`.
- Публичный API: расширяется (новые свойства интерфейсов `FileStyle`, `FileColors`, `FileDimensions` и методы их билдеров). Изменения аддитивные и обратносовместимые по поведению; требуется обновить KDoc.
- Токены / генерация докуменации / Gradle conventions: не затрагиваются.
- Валидация: `:sdds-core:uikit-compose:test`, `:sdds-core:uikit-compose:detekt`, `:sdds-core:uikit-compose:spotlessApply`.
