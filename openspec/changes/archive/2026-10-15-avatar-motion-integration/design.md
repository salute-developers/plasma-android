## Context

`Avatar` — Compose-компонент в `sdds-core/uikit-compose`. После миграции на `StatefulValue` (`avatar-style-stateful-value`) все визуальные значения стиля уже stateful:

- `AvatarStyle.shapes: StatefulValue<Shape>`, `textStyles: StatefulValue<TextStyle>`
- `AvatarColors.backgroundBrushes/textBrushes: StatefulValue<Brush>?`, `actionBrushes/actionScrimBrushes: StatefulValue<Brush>`
- `AvatarDimensionValues.widthValues/heightValues/statusOffsetXValues/statusOffsetYValues/statusCutoutPaddingValues: StatefulValue<Dp>`

Но резолвинг в `Avatar.kt` идёт мгновенно через `getValue(interactionSource, stateSet)` / `getValueAsState(interactionSource, stateSet)`, где `stateSet = setOf(status)`. Анимации отсутствуют.

`AvatarMotionStyle`/`AvatarMotion` добавлены заказчиком и **не изменяются**: свойства `backgroundColor`, `actionColor`, `actionScrimColor`, `textColor`: `MotionProperty<Brush>`; `textStyle`: `MotionProperty<TextStyle>`; по умолчанию все `noMotion()`. CompositionLocal — `LocalAvatarMotionStyle`, фабрика — `rememberAvatarMotion(style, motionContext)`.

Эталон интеграции motion в этом же модуле: `Counter.kt`, `Switch.kt`/`internal/checkable/switch/BaseSwitch.kt`, `Chip.kt`, `motion/components/indicator/IndicatorMotion.kt` (+ `Indicator.kt`), `internal/segment/SegmentStyleValues.kt`. Хелперы резолва: `motion/BrushMotion.kt` → `StatefulValue<Brush>.getBrushAsState(context, motionProperty, defaultValue)`; `motion/TextStyleMotion.kt` → `StatefulValue<TextStyle>.getTextStyleAsState(context, motionProperty, defaultValue)`; `motion/StatefulValueMotion.kt` → `getDpAsState` и др.

## Goals / Non-Goals

**Goals:**
- Предоставить `motion: Motion<AvatarMotionStyle>` **новыми перегрузками** функций `Avatar` и `Modifier.avatar`; существующие сигнатуры не изменяются (binary-совместимость, additive API).
- Анимировать цвета кистей (`backgroundColor`, `textColor`, `actionColor`, `actionScrimColor`) и стиль текста через `getBrushAsState`/`getTextStyleAsState`.
- Перевести `AvatarStatus` в `motion.context.semanticStateSource`, чтобы статусно-зависимые значения резолвились и анимировались.
- Дать индикатору статуса общий с аватаром `MotionContext` (сейчас у него изолированный).
- Сохранить обратную совместимость: при `noMotion()` (дефолт) поведение и пиксели идентичны текущим.

**Non-Goals:**
- Изменение `AvatarMotionStyle`/`AvatarMotion` (уже готовы).
- Motion для формы и размеров (shape/width/height/offsets/cutout) — резолв через `motion.context` без интерполяции, по образцу `BaseSwitch` (`getValueAsState(motion.context)`).
- Motion для `AvatarGroupStyle`/`AvatarGroupDimensions` (обычные `Dp`, не stateful) и отдельных `AvatarGroupMotionStyle`.
- Изменения в `tokens/*`, `plugin_theme_builder`, View-стеке.

## Decisions

**1. Сигнатуры: `motion` последним параметром; перегрузка — только где мешает trailing-лямбда**

Правило: параметр `motion: Motion<AvatarMotionStyle>` с дефолтом добавляется **последним параметром** каждой публичной функции — это source-совместимо. Исключение: функции, у которых последний параметр — лямбда `content` (нельзя вставить параметр после обязательной trailing-лямбды, сохранив идиоматический порядок «параметры, затем лямбда»): для них создаётся **новая перегрузка** с `motion` перед `content`, а существующая функция **делегированно** вызывает её, конструируя motion из `interactionSource`. Это ровно схема `Counter.kt`: count-перегрузки получили `motion` в конец, контентная — новая перегрузка + делегирование старой.

| Функция | Последний параметр | Решение |
|---|---|---|
| `Avatar(imageBitmap, …, filterQuality)` | `filterQuality: FilterQuality` | `motion = rememberAvatarMotion()` в конец, прокинуть вниз |
| `Avatar(imageVector, …, contentScale)` | `contentScale: ContentScale` | `motion` в конец, прокинуть вниз |
| `Avatar(modifier, painter, …, contentScale)` | `contentScale: ContentScale` | `motion` в конец, прокинуть вниз |
| `Avatar(…, extra, interactionSource, content: @Composable BoxScope.() -> Unit)` | лямбда `content` | **новая перегрузка** `Avatar(…, extra, motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(), content)` — основная реализация; старая сигнатура без изменений, делегирует с `motion = rememberAvatarMotion(motionContext = rememberMotionContext(interactionSource as? MutableInteractionSource ?: MutableInteractionSource()))` (cast — приём `TabBarItem`), помечается `@Deprecated("Use Avatar with motion parameter")` как контентная перегрузка `Counter` |
| `Modifier.avatar(interactionSource, …, statusCutoutPadding): Modifier` | `statusCutoutPadding: Dp` | `motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(motionContext = rememberMotionContext(cast(interactionSource)))` в конец — **без новой перегрузки**, реализация здесь |
| `Modifier.avatar(style, …)` (`@Deprecated`) | — | не трогаем (делегает предыдущей) |

Смысл: `motion.context.interactionSource` — единственный источник взаимодействий внутри реализации (`Indicator.kt`); делегирующая контентная перегрузка связывает переданный `interactionSource` через контекст motion.

Альтернативы и почему отклонены:
- *Перегрузки для каждой функции* — лишний API-surface, расходится с практикой `Counter`/`Chip` (там, где можно, motion добавлялся в сигнатуру).
- *Менять существующую контентную сигнатуру (заменить `interactionSource` на `motion` или вставить `motion` перед `content`)* — ломает вызовы с позиционными аргументами/`content` по позиции.

**2. Единый источник состояний — `motion.context`**

После входа в реализацию: `val interactionSource = motion.context.interactionSource` (как делает `Indicator.kt`), и **все** резолвы используют `motion.context`. `stateSet` из `setOf(status)` убирается из резолвинга — статус публикуется в семантический источник:

```kotlin
SideEffect {
    motion.context.semanticStateSource.setExclusive(
        status, AvatarStatus.Inactive, AvatarStatus.Active, AvatarStatus.None,
    )
}
```

Это уже применялось к изолированному `indicatorMotion`; теперь к общему контексту. `setExclusive` (а не `replace`) сохраняет интерактивные состояния и исключает взаимно исключающие статусы.

Публичный `interactionSource` сохраняет силу, пока `motion` не передан явно: дефолт `motion` привязывает контекст к `interactionSource` (см. таблицу Decision 1). Если вызывающий передал и `interactionSource`, и `motion` — действует `motion.context.interactionSource` (параметр игнорируется) — задокументировать в KDoc, как в `Indicator`.

**3. Разделение анимируемых и мгновенных значений**

| Значение | Резолвинг |
|---|---|
| `colors.backgroundBrushes` | `getBrushAsState(motion.context, motion.style.backgroundColor)` |
| `colors.textBrushes` | `getBrushAsState(motion.context, motion.style.textColor)` |
| `colors.actionBrushes` | `getBrushAsState(motion.context, motion.style.actionColor)` |
| `colors.actionScrimBrushes` | `getBrushAsState(motion.context, motion.style.actionScrimColor)` |
| `style.textStyles` | `getTextStyleAsState(motion.context, motion.style.textStyle)` |
| `shapes`, `*Values` (Dp) | `getValueAsState(motion.context)` — без интерполяции |
| `textColors`, `backgroundColors` (`InteractiveColor`) | legacy-путь, мгновенно через `motion.context.interactionSource` |

`getBrushAsState`/`getTextStyleAsState` **не принимают nullable** `StatefulValue` → null-проверка обязательна до вызова (текущая логика `textBrushes`/`backgroundBrushes` + fallback на `InteractiveColor` сохраняется полностью).

**4. Общий контекст для индикатора**

`Modifier.indicator(motion = rememberIndicatorMotion(motionContext = motion.context), ...)` — по образцу `SegmentItem.kt` (`motion = rememberCounterMotion(motionContext = motion.context)`). Исправляет дефект: взаимодействия аватара теперь доходят до индикатора. Стиль индикатора остаётся `style.statusStyle ?: LocalIndicatorStyle.current`.

Риск: индикатор начнёт реагировать на Pressed/Hovered аватара. Принято осознанно — это и есть цель интеграции; если в дизайн-системе у `statusStyle` есть hover-состояния, они станут живыми. Скриншотные тесты это проверят (goldens не должны измениться, т.к. скриншоты снимаются без взаимодействий).

**5. Подпись `Modifier.action` остаётся brush-колбэком**

Текущая private-функция принимает `color: Brush, scrimColor: Brush` (резолв до вызова). Меняем на `color: () -> Brush, scrimColor: () -> Brush`, читающие `State<Brush>.value` внутри `drawWithContent` — анимация не вызывает рекомпозицию поддерева (паттерн `Counter`: `brushProducer = { backgroundColor.value }`).

**6. Nullability значения по умолчанию**

`getBrushAsState(context, motionProperty, defaultValue)` — `defaultValue` оставляем `null`: `StatefulValue.getDefaultValue()` уже содержит корректный дефолт стиля. Для `backgroundBrushes == null` используем прежний путь `backgroundColors` → `internal.background(brush, color)`, ничего не анимируем.

## Risks / Trade-offs

- [Двойственность `backgroundBrushes` (nullable) и `backgroundColors`] → сохранена текущая логика приоритета; анимируется только brush-путь. A/B-поведение legacy `InteractiveColor`-пути не меняется.
- [`SideEffect` с `setExclusive` выполняется после первого кадра] → на первой композиции статус может быть не применён в анимационном снапшоте. Mitigation: семантическое состояние инициализируется синхронно до резолва там, где это важно (Switch использует `rememberSwitchSemanticStateSource(active)` — `remember {}` с первичным значением). Применим тот же приём: `remember { MutableSemanticStateSource().apply { setExclusive(status, ...) } }` + `SideEffect` для обновлений.
- [`Modifier.avatar` на `composed {}` + motion] → `composed` устаревший путь; оставляем как есть (non-goal), motion передаётся в лямбду `composed` из внешней Composable-области, что корректно.
- [BCV] → изменение/добавление сигнатур требует `apiDump`; локально задача заблокирована сетью — проверить в CI.
- [Скриншотные goldens] → при `noMotion()` значения резолвятся так же (`motionProperty.isEmpty` → `rememberUpdatedState(getValue(...))` внутри `getBrushAsState`), пиксельных отличий быть не должно; обязательный прогон тестов.
