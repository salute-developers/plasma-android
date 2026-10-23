## 1. sdds-core/uikit-compose — AvatarStyle.kt: AvatarStyle и AvatarStyleBuilder

- [x] 1.1 В интерфейсе `AvatarStyle` добавить `val shapes: StatefulValue<Shape>` и `val textStyles: StatefulValue<TextStyle>` с KDoc; существующие `shape`/`textStyle` пометить `@Deprecated("Use shapes", ReplaceWith("shapes"))` / `@Deprecated("Use textStyles", ReplaceWith("textStyles"))`
- [x] 1.2 В `AvatarStyleBuilder` добавить абстрактные `fun shape(shape: StatefulValue<Shape>): AvatarStyleBuilder` и `fun textStyle(textStyle: StatefulValue<TextStyle>): AvatarStyleBuilder`; существующие `shape(Shape)`/`textStyle(TextStyle)` сделать default-реализациями с делегированием через `shape.asStatefulValue()` / `textStyle.asStatefulValue()`
- [x] 1.3 В `DefaultAvatarStyle` заменить constructor-поля `shape: Shape`/`textStyle: TextStyle` на `shapes: StatefulValue<Shape>`/`textStyles: StatefulValue<TextStyle>`; deprecated-свойства реализовать как `get() = shapes.getDefaultValue()` / `get() = textStyles.getDefaultValue()` (с `@Suppress("OVERRIDE_DEPRECATION")` по месту, как для `dimensions`)
- [x] 1.4 В `DefaultAvatarStyle.Builder` заменить типы полей на `StatefulValue<Shape>?`/`StatefulValue<TextStyle>?`, обновить override-методы и дефолты в `style()`: `shapes ?: RoundedCornerShape(50).asStatefulValue()`, `textStyles ?: TextStyle.Default.asStatefulValue()`

## 2. sdds-core/uikit-compose — AvatarStyle.kt: AvatarColors

- [x] 2.1 В интерфейсе `AvatarColors` добавить `val actionBrushes: StatefulValue<Brush>` и `val actionScrimBrushes: StatefulValue<Brush>` с KDoc; `actionColor`/`actionScrimColor` пометить `@Deprecated("Use actionBrushes", ReplaceWith("actionBrushes"))` / `@Deprecated("Use actionScrimBrushes", ReplaceWith("actionScrimBrushes"))`. Уже мигрированные `textBrushes`/`textColors`/`backgroundBrushes`/`backgroundColors` не изменять
- [x] 2.2 В `AvatarColorsBuilder` для `actionColor` добавить default-перегрузки `Color` → `actionColor(color.asStatefulBrush())`, `InteractiveColor` → `actionColor(color.asStatefulBrush())`, `Brush` → `actionColor(brush.asStatefulValue())` и абстрактную `actionColor(actionColor: StatefulValue<Brush>)`; то же для `actionScrimColor`. Проверить импорты: `graphics.brush.asStatefulBrush` (Color) и `interactions.asStatefulBrush` (InteractiveColor)
- [x] 2.3 В `DefaultAvatarColors` заменить constructor-поля `actionColor`/`actionScrimColor: Color` на `actionBrushes`/`actionScrimBrushes: StatefulValue<Brush>`; deprecated-свойства вычислять как `(actionBrushes.getDefaultValue() as? SolidColor)?.value ?: Color.White` и `(actionScrimBrushes.getDefaultValue() as? SolidColor)?.value ?: AvatarDefaults.DefaultScrimColor`
- [x] 2.4 В `DefaultAvatarColors.Builder` заменить поля на `StatefulValue<Brush>?`, обновить override-методы и дефолты в `build()`: `actionBrushes ?: Color.White.asStatefulBrush()`, `actionScrimBrushes ?: AvatarDefaults.DefaultScrimColor.asStatefulBrush()`

## 3. sdds-core/uikit-compose — AvatarStyle.kt: AvatarDimensionValues

- [x] 3.1 В `AvatarDimensionValues` добавить `statusOffsetXValues`, `statusOffsetYValues`, `widthValues`, `heightValues`, `statusCutoutPaddingValues`: `StatefulValue<Dp>` с KDoc; существующие `Dp`-свойства пометить `@Deprecated("Use <name>Values", ReplaceWith("<name>Values"))`
- [x] 3.2 В `AvatarDimensionsBuilder` для каждого из пяти параметров добавить абстрактную перегрузку `fun x(x: StatefulValue<Dp>)` и default-перегрузку `fun x(x: Dp) = x(x.asStatefulValue())`
- [x] 3.3 В `DefaultAvatarDimensionValues` оставить в constructor только `StatefulValue<Dp>`-поля; deprecated-свойства реализовать как `get() = xValues.getDefaultValue()`
- [x] 3.4 В `DefaultAvatarDimensionValues.Builder` заменить поля на `StatefulValue<Dp>` с дефолтами `0.dp.asStatefulValue()` (statusOffsetX/Y, width, height) и `3.dp.asStatefulValue()` (statusCutoutPadding); значения по умолчанию в `build()` сохранить без изменений

## 4. sdds-core/uikit-compose — Avatar.kt: резолв stateful-значений

- [x] 4.1 В Composable `Avatar`: сформировать `stateSet` из `status` до `Box` и резолвить `widthValues`/`heightValues` через `getValueAsState(interactionSource, stateSet)` для `requiredSize(...)`, `statusCutoutPaddingValues` — для параметра `statusCutoutPadding` модификатора `avatar`
- [x] 4.2 В `Modifier.avatar(interactionSource, ...)`: резолвить через `getValue(interactionSource, stateSet)` значения `statusOffsetXValues`/`statusOffsetYValues` (в `Modifier.indicator`), `widthValues`/`heightValues` (sizeModifier), `shapes` (`.clip(...)`), `textStyles` (placeholder), `actionBrushes`/`actionScrimBrushes` (actionModifier)
- [x] 4.3 Приватный `Modifier.action` перевести на `color: Brush`, `scrimColor: Brush`: scrim через `drawRect(brush = ...)`, tint иконки через `ColorFilter.tint` из `SolidColor` (без tint для non-solid brush). Дополнительно: `AvatarGroup.kt` переведён с deprecated `avatarStyle.shape` на `avatarStyle.shapes.getDefaultValue()`

## 5. Публичный API (бейзлайны)

- [x] 5.1 Обновить бейзлайны binary-compatibility-validator (`api/uikit-compose.api`, `api/android/uikit-compose.api`, `api/jvm/uikit-compose.api`) — добавлены новые members, удалённых нет. ПРИМЕЧАНИЕ: `apiDump`/`apiCheck` не запускаются локально (SSL-блокировка загрузки `kotlin-metadata-jvm:2.1.10`), бейзлайны обновлены вручную по формату BCV; перепроверить `apiCheck` в CI

## 6. Валидация

- [x] 6.1 Проверить все usages `AvatarStyle`/`AvatarColors`/`AvatarDimensionValues` (`Avatar.kt`, `AvatarGroup.kt`, `AvatarGroupStyle.kt`, `CellStyle.kt`, `ListItemStyle.kt`, `NavigationDrawerItem.kt`) — совместимость сохранена; `AvatarGroup.kt` переведён на новый API, остальные только передают стиль
- [x] 6.2 `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` — нет ошибок компиляции
- [ ] 6.3 `./gradlew :sdds-core:uikit-compose:apiCheck` — ЗАБЛОКИРОВАНО: задача не может resolвить `org.jetbrains.kotlin:kotlin-metadata-jvm:2.1.10` (SSL handshake к dl.google.com/repo.maven.apache.org). Выполнить в CI
- [x] 6.4 `./gradlew :sdds-core:uikit-compose:detekt` и `./gradlew :sdds-core:uikit-compose:spotlessApply` — нет новых нарушений, форматирование применено
- [x] 6.5 `./gradlew :integration-core:sandbox-compose:compileDebugKotlin`, `./gradlew :tokens:plasma.giga.compose:compileDebugKotlin`, `./gradlew :tokens:sdds-sbcom-compose:compileDebugKotlin` — сгенерированный код компилируется без изменений (default/Dp-перегрузки работают)
- [x] 6.6 `./gradlew :tokens:plasma.giga.compose:testDebugUnitTest --tests "*ComposeAvatarScreenshotTest*"` — 22 теста, 0 failures; goldens в `screenshots-compose/` не изменились (дефолты сохранены)
- [x] 6.7 Deprecated-API компилируется (только warnings); KDoc новых свойств/builder-перегрузок добавлен
