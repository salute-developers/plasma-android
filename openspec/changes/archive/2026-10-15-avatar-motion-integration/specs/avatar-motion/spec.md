## ADDED Requirements

### Requirement: Avatar functions SHALL accept Motion<AvatarMotionStyle> compatibly
`sdds-core/uikit-compose` SHALL предоставить функции `Avatar(...)` и `Modifier.avatar(...)`, принимающие `motion: Motion<AvatarMotionStyle>`. Параметр `motion` с дефолтным значением SHALL добавляться **последним параметром** функций, у которых последний параметр не является лямбдой (`Avatar(imageBitmap/…)`, `Avatar(imageVector/…)`, `Avatar(painter/…)`, `Modifier.avatar(interactionSource/…)`). Для функции `Avatar(…, interactionSource, content: @Composable BoxScope.() -> Unit)` (последний параметр — лямбда) SHALL быть создана **новая перегрузка** с `motion` перед `content`, а существующая сигнатура SHALL сохраниться без изменений и делегировать новой, конструируя motion из переданного `interactionSource`.

#### Scenario: Существующие вызовы компилируются без изменений
- **WHEN** существующий код вызывает `Avatar(style = s, status = st) { ... }`, `Modifier.avatar(interactionSource, style)` или convenience-перегрузку с позиционными/именованными аргументами
- **THEN** код MUST компилироваться без изменений и MUST рендериться идентично предыдущей версии

#### Scenario: Делегирование контентной перегрузки
- **WHEN** вызывается `Avatar(..., interactionSource = src) { ... }`
- **THEN** реализация MUST использовать motion, чей контекст связан с `src`, и поведение MUST совпадать с предыдущей версией

#### Scenario: Перегрузка с motion
- **WHEN** вызывается `Avatar(style = s, motion = rememberAvatarMotion()) { ... }`
- **THEN** компонент MUST использовать `motion.context.interactionSource` как источник взаимодействий

### Requirement: Animated values SHALL resolve through MotionContext
В motion-реализации `Modifier.avatar` SHALL анимироваться: `colors.backgroundBrushes` через `getBrushAsState(motion.context, motion.style.backgroundColor)`, `colors.textBrushes` через `motion.style.textColor`, `colors.actionBrushes` через `motion.style.actionColor`, `colors.actionScrimBrushes` через `motion.style.actionScrimColor`, `style.textStyles` через `getTextStyleAsState(motion.context, motion.style.textStyle)`. `shapes` и все `*Values: StatefulValue<Dp>` SHALL резолвиться через `motion.context` без интерполяции. Nullability `backgroundBrushes`/`textBrushes` SHALL сохраняться: при `null` используется существующий legacy-путь `backgroundColors`/`textColors` (`InteractiveColor`, мгновенный резолв).

#### Scenario: noMotion по умолчанию не анимирует
- **WHEN** используется `AvatarMotionStyle.builder().style()` (все свойства `noMotion()`) и меняется состояние
- **THEN** значения MUST переключаться мгновенно, без анимационных кадров между состояниями

#### Scenario: transition анимирует смену статуса
- **WHEN** motion-стиль содержит `backgroundColor = transition<Brush> { segment { } changesWith { finite(tween(200)) } }`, а `backgroundBrushes` заданы разными `SolidColor` для `AvatarStatus.None`/`AvatarStatus.Active`
- **AND** компонент отрисуется, затем `status` изменится с `None` на `Active`
- **THEN** кисть фона MUST проходить промежуточные значения между цветами во время `tween`

#### Scenario: Legacy InteractiveColor путь без изменений
- **WHEN** `backgroundBrushes == null` и задан `backgroundColors: InteractiveColor`
- **THEN** фон MUST резолвиться мгновенно по состояниям, поведение MUST совпадать с предыдущей версией

### Requirement: AvatarStatus SHALL publish to MotionContext semantic state source
Реализация `Avatar` SHALL инициализировать `motion.context.semanticStateSource` текущим статусом до первого резолва (`remember` с первичным `setExclusive(status, AvatarStatus.Inactive, AvatarStatus.Active, AvatarStatus.None)`) и SHALL обновлять его через `SideEffect` при изменении `status`. Локальный `stateSet = setOf(status)` SHALL больше не участвовать в резолвинге значений.

#### Scenario: Статусно-зависимые значения резолвятся через контекст
- **WHEN** `backgroundBrushes` содержит значение для состояния `AvatarStatus.Active`, компонент отображается со `status = Active`
- **THEN** `getBrushAsState` MUST вернуть значение для `AvatarStatus.Active` без явной передачи stateSet

### Requirement: Indicator inside Avatar SHALL share Avatar MotionContext
`Modifier.indicator` внутри аватара SHALL вызываться с `rememberIndicatorMotion(motionContext = motion.context)`, сохраняя стиль `style.statusStyle ?: LocalIndicatorStyle.current`.

#### Scenario: Взаимодействия аватара достигают индикатора
- **WHEN** аватар находится в нажатом состоянии (Pressed через interaction source аватара) и у индикатора заданы значения для `InteractiveState.Pressed`
- **THEN** индикатор MUST применить нажатое значение (ранее — приватный источник индикатора не получал взаимодействия)

#### Scenario: Скриншоты без взаимодействий не меняются
- **WHEN** выполняются существующие скриншотные тесты Avatar c дефолтными стилями и без взаимодействий
- **THEN** отрендеренные артефакты MUST остаться идентичными предыдущей версии

### Requirement: AvatarGroup SHALL inherit motion style via CompositionLocal
`AvatarGroup` SHALL не требовать изменений: элементы группы получают стиль анимации через `LocalAvatarMotionStyle`, каждый `Avatar` обязан иметь собственный `MotionContext` (смена статуса одного элемента не должна анимировать соседей).

#### Scenario: Независимость контекстов элементов группы
- **WHEN** в `AvatarGroup` у одного аватара меняется `status`
- **THEN** анимация MUST произойти только у этого аватара
