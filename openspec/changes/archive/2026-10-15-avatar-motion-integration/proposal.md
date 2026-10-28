## Why

Стиль `Avatar` переведён на `StatefulValue` (change `avatar-style-stateful-value`), но значения резолвятся мгновенно (`getValue`/`getValueAsState(interactionSource, stateSet)`) — при смене состояния (нажатие, фокус, `AvatarStatus`) значения переключаются без анимации. В модуле уже есть инфраструктура motion (`Motion`/`MotionContext`, `getBrushAsState`, `getTextStyleAsState`), а эталонные компоненты (`Counter`, `Switch`, `Chip`, `SegmentItem`) поддерживают анимации через параметр `motion`. Пользователем уже добавлены `AvatarMotion` (`rememberAvatarMotion`) и `AvatarMotionStyle` (свойства `backgroundColor`, `actionColor`, `actionScrimColor`, `textColor`: `MotionProperty<Brush>`, `textStyle`: `MotionProperty<TextStyle>`, по умолчанию `noMotion()`); требуется внедрить motion в функции компонента.

Также существует текущий дефект: `Modifier.avatar(...)` создаёт `rememberIndicatorMotion()` с изолированным контекстом (приватные `MutableInteractionSource`/`MutableSemanticStateSource`), поэтому нажатия/ховеры аватара не влияют на индикатор статуса.

## What Changes

- **`motion: Motion<AvatarMotionStyle>` добавляется последним параметром** в функции, где это обратно совместимо (последний параметр — не лямбда): `Avatar(imageBitmap, …)`, `Avatar(imageVector, …)`, `Avatar(painter, …)`, `Modifier.avatar(interactionSource, …)`. Внутри реализаций источником взаимодействий становится `motion.context.interactionSource` (как в `Indicator`/`Switch`).
- **Только для `Avatar(…, interactionSource, content)`** (последний параметр — лямбда `content`) добавление параметра ломает совместимость: создаётся **новая перегрузка** `Avatar(…, extra, motion: Motion<AvatarMotionStyle>, content)` (основная реализация), а существующая функция остаётся с прежней сигнатурой и делегирует ей, конструируя motion из переданного `interactionSource` (`@Deprecated("Use Avatar with motion parameter")` по образцу контентной перегрузки `Counter`). Это же разграничение реализовано в `Counter.kt`.
- **Анимируемые значения** (при заданном motion-свойстве): `colors.backgroundBrushes` → `motion.style.backgroundColor`, `colors.textBrushes` → `motion.style.textColor`, `colors.actionBrushes` → `motion.style.actionColor`, `colors.actionScrimBrushes` → `motion.style.actionScrimBrushes` (все через `getBrushAsState`), `style.textStyles` → `motion.style.textStyle` (через `getTextStyleAsState`).
- **Мгновенные значения** (motion не вводится, как в `BaseSwitch`/`Indicator`): `shapes`, `widthValues`/`heightValues`, `statusOffsetXValues`/`statusOffsetYValues`, `statusCutoutPaddingValues` — резолвятся через `getValueAsState(motion.context)` без интерполяции.
- **Статус** — `AvatarStatus` публикуется в `motion.context.semanticStateSource` через `setExclusive(status, Inactive, Active, None)` (SideEffect), вместо локального `stateSet` для анимируемых путей; статусно-зависимые `StatefulValue` начинают резолвиться и анимироваться через контекст.
- **Внутренний индикатор** — `rememberIndicatorMotion(motionContext = motion.context)`: общий контекст с аватаром; исправляет дефект изоляции interaction source.
- **Legacy-пути `InteractiveColor`** (`colors.textColors`, `colors.backgroundColors`, используемые когда brush-свойства `null`) остаются мгновенными — поведение без изменений.
- **`AvatarMotionStyle`/`AvatarMotion` не изменяются** (уже добавлены); **`AvatarGroup` не изменяется** — стиль анимации достигает элементов группы через `LocalAvatarMotionStyle`, каждый `Avatar` сохраняет собственный контекст.
- **Docs/фикстуры** — пример `Avatar_Motion` в `uikit-compose-fixtures`, секция «Состояния и Motion API» в `AvatarUsage.md`.

## Capabilities

### New Capabilities

- `avatar-motion`: motion-API компонента `Avatar` — параметры `motion` функций, резолв/анимация stateful-значений через `MotionContext`, публикация статуса в семантический источник, поведение совместимости.

### Modified Capabilities

- `avatar-style`: не меняется (API стиля остаётся прежним; change только использует его).

## Impact

- `sdds-core/uikit-compose` — `Avatar.kt` (параметры и резолв), импорты `motion.*`; `AvatarStyle.kt`/`AvatarGroup.kt` без изменений.
- Публичный API: **source-compatible** — `motion` добавляется последним параметром с дефолтом там, где это безопасно; для контентной перегрузки — только новая перегрузка + делегирование. Существующие вызовы компилируются без изменений. JVM-сигнатуры функций с добавленным параметром меняются → обновить BCV-бейзлайны `apiDump` (`api/uikit-compose.api`, `api/android/`, `api/jvm/`) — локально `apiDump` заблокирован сетью (SSL), выполнить в CI.
- Дефолты: `AvatarMotionStyle` по умолчанию `noMotion()` → скриншотные тесты и поведение существующих вызовов не меняются.
- `tokens/*`, `integration-core/sandbox-compose` (сгенерированный код) — не затрагиваются, регенерация не требуется.
- `integration-core/uikit-compose-fixtures` — новый doc-sample; `build-system/docs-template` — документация.
- Валидация: компиляция `:sdds-core:uikit-compose`, detekt/spotless, компиляция токенов, скриншотные тесты Avatar, (опционально) целевой motion-тест по образцу `SelectItemMotionTest` в `tokens/sdds.serv.compose`.
