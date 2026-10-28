## 1. sdds-core/uikit-compose — Modifier.avatar: motion-параметр и резолв

- [x] 1.1 В существующую `@Composable fun Modifier.avatar(interactionSource, style, status, action, actionEnabled, placeholder, statusCutoutEnabled, statusCutoutPadding)` добавить в конец `motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(motionContext = rememberMotionContext(interactionSource as? MutableInteractionSource ?: MutableInteractionSource()))` (каст — приём `TabBarItem`); внутри `val interactionSource = motion.context.interactionSource`; семантический источник инициализировать `remember { MutableSemanticStateSource().apply { setExclusive(status, Inactive, Active, None) } }` до резолва + `SideEffect` для обновлений статуса
- [x] 1.2 Перевести резолв анимируемых значений: `colors.backgroundBrushes?.getBrushAsState(motion.context, motion.style.backgroundColor)`, `colors.textBrushes?.getBrushAsState(motion.context, motion.style.textColor)`, `colors.actionBrushes.getBrushAsState(motion.context, motion.style.actionColor)`, `colors.actionScrimBrushes.getBrushAsState(motion.context, motion.style.actionScrimColor)`, `style.textStyles.getTextStyleAsState(motion.context, motion.style.textStyle)`; null-проверки brush-свойств и legacy-пути `textColors`/`backgroundColors` (через `colorForInteraction(motion.context.interactionSource, ...)`) сохранить
- [x] 1.3 Мгновенные значения (`shapes`, `widthValues`, `heightValues`, `statusOffsetXValues`, `statusOffsetYValues`) резолвить через `getValueAsState(motion.context).value` / `getValue(motion.context.interactionSource, stateSet)` вместо исходного источника
- [x] 1.4 Индикатор: `rememberIndicatorMotion(motionContext = motion.context)` вместо изолированного `rememberIndicatorMotion()`; убрать старый `SideEffect` c `setExclusive` (публикация статуса идёт в общий контекст по 1.1)
- [x] 1.5 Приватный `Modifier.action` перевести на `color: () -> Brush`, `scrimColor: () -> Brush` (чтение `State<Brush>.value` внутри `drawWithContent`), tint — из `SolidColor` (текущая логика)
- [x] 1.6 Новая motion-перегрузка для `Modifier.avatar` НЕ создаётся (параметр добавлен в существующую по 1.1); `@Deprecated fun Modifier.avatar(style, ...)` остаётся без изменений; KDoc обновить `@param motion`

## 2. sdds-core/uikit-compose — Avatar composable: motion-перегрузки и параметры

- [x] 2.1 Добавить **новую** перегрузку `Avatar(modifier, style, status, action, actionEnabled, placeholder, extra, motion: Motion<AvatarMotionStyle>, content)` — основная реализация (существующая контентная сигнатура заканчивается лямбдой, добавлять motion в неё нельзя); `motion` **без дефолта** — иначе вызовы без `motion`/`interactionSource` дают overload ambiguity (тот же приём — обязательный `motion` в `Modifier.indicator`); `width`/`height`/`statusCutoutPadding` резолвить из `motion.context` (без `stateSet`)
- [x] 2.2 Существующая `Avatar(modifier, style, status, action, actionEnabled, placeholder, extra, interactionSource, content)`: сигнатура не меняется; `@Deprecated("Use Avatar with motion parameter")`; делегирует 2.1 с `motion = rememberAvatarMotion(motionContext = rememberMotionContext(<cast interactionSource>))`
- [x] 2.3 Convenience-перегрузки `Avatar(painter, ...)`, `Avatar(imageVector, ...)`, `Avatar(imageBitmap, ...)`: добавить `motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(...)` последним параметром (после `contentScale`/`filterQuality` — лямбды нет, безопасно), прокинуть в 2.1/2.2, дополнить KDoc `@param motion`
- [x] 2.4 Импорты: `getBrushAsState`, `getTextStyleAsState`, `MutableSemanticStateSource`, `Motion` (убрать неиспользуемые)

## 3. Метаданные и публичный API

- [ ] 3.1 Обновить BCV-бейзлайны (`api/uikit-compose.api`, `api/android/uikit-compose.api`, `api/jvm/uikit-compose.api`) — новые motion-перегрузки, удалённых members нет; локальный `apiDump` заблокирован сетью (SSL), обновить вручную по формату BCV и перепроверить `apiCheck` в CI

## 4. Примеры и документация — integration-core, build-system

- [ ] 4.1 В `integration-core/uikit-compose-fixtures/.../samples/avatar/AvatarSamples.kt` добавить `Avatar_Motion` (`@DocSnippet(needScreenshot = false)`) по образцу `SegmentItem_Motion`: переключаемый `status`/клик через `motion.context.interactionSource`, style с статусно-зависимым `backgroundBrushes`, `rememberAvatarMotion(style = AvatarMotionStyle.builder().backgroundColor(transition { segment { } changesWith { finite(tween(200)) } }).style())`
- [ ] 4.2 В `build-system/docs-template/compose-template/docs/components/AvatarUsage.md` добавить секцию «Состояния и Motion API» по образцу `SegmentUsage.md` (передача motion, `LocalAvatarMotionStyle`, `noMotion()` по умолчанию, `motion.context.interactionSource` в `clickable`, статус через семантический источник); в `docs/graphics/MotionAPI.md` добавить `getTextStyleAsState` в каталог резолверов

## 5. Валидация — sdds-core, tokens

- [ ] 5.1 `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` — нет ошибок
- [ ] 5.2 `./gradlew :sdds-core:uikit-compose:detekt` и `./gradlew :sdds-core:uikit-compose:spotlessApply`
- [ ] 5.3 `./gradlew :integration-core:uikit-compose-fixtures:compileDebugKotlin` (новый sample) и компиляция 1–2 токеновых систем (`:tokens:plasma.giga.compose:compileDebugKotlin`, `:tokens:sdds-sbcom-compose:compileDebugKotlin`)
- [ ] 5.4 Скриншотные тесты: `./gradlew :tokens:plasma.giga.compose:testDebugUnitTest --tests "*ComposeAvatarScreenshotTest*"` и `:tokens:sdds-sbcom-compose:...` — goldens без изменений (`noMotion()` по умолчанию)
- [ ] 5.5 Целевой motion-тест по образцу `tokens/sdds.serv.compose/src/androidUnitTest/kotlin/com/sdds/serv/SelectItemMotionTest.kt`: `AvatarMotionTest` — при `transition`-стиле с `tween` смена `status` анимирует `backgroundBrushes` (прогресс между SolidColor), при `noMotion()` — мгновенное переключение; добавить только если тестовая инфраструктура `sdds.serv.compose` позволяет собрать Avatar-стили (иначе — задокументировать пропуск)
- [ ] 5.6 `./gradlew :sdds-core:uikit-compose:apiCheck` в CI (локально заблокирован)
