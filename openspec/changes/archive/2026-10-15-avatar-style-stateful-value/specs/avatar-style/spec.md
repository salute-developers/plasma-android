## ADDED Requirements

### Requirement: AvatarStyle SHALL expose stateful shape and textStyle
`sdds-core/uikit-compose` SHALL содержать в `interface AvatarStyle` свойства `shapes: StatefulValue<Shape>` и `textStyles: StatefulValue<TextStyle>`. Существующие свойства `shape: Shape` и `textStyle: TextStyle` SHALL сохраняться как compatibility API, помеченные `@Deprecated` с `ReplaceWith`, указывающим на соответствующее новое свойство, и SHALL вычисляться из новых значений через `getDefaultValue()`.

#### Scenario: Дефолтный стиль через builder
- **WHEN** вызывается `AvatarStyle.builder().style()` без явных `shape`/`textStyle`
- **THEN** `shapes.getDefaultValue()` MUST равняться `RoundedCornerShape(50)`
- **AND** `textStyles.getDefaultValue()` MUST равняться `TextStyle.Default`

#### Scenario: Deprecated-свойства остаются рабочими
- **WHEN** из полученного `AvatarStyle` читаются `shape` и `textStyle`
- **THEN** значения MUST совпадать с `shapes.getDefaultValue()` и `textStyles.getDefaultValue()` соответственно

#### Scenario: StatefulValue<Shape> через builder
- **WHEN** вызывается `shape(statefulValue)` с разными формами для состояний
- **THEN** `Avatar.kt` MUST резолвить форму через `interactionSource` и stateSet статуса и применять соответствующую форму при изменении состояния

### Requirement: AvatarStyleBuilder SHALL provide Shape/TextStyle and StatefulValue overloads
`interface AvatarStyleBuilder` SHALL предоставлять абстрактные методы `shape(StatefulValue<Shape>)` и `textStyle(StatefulValue<TextStyle>)`, а также default-перегрузки `shape(Shape)` и `textStyle(TextStyle)`, делегирующие каноническим через `asStatefulValue()`.

#### Scenario: Обратная совместимость shape(Shape)
- **WHEN** существующий код вызывает `builder.shape(RoundedCornerShape(8.dp))`
- **THEN** код MUST компилироваться без изменений
- **AND** `style().shapes.getDefaultValue()` MUST равняться `RoundedCornerShape(8.dp)`

### Requirement: AvatarColors SHALL store action colors as StatefulValue<Brush>
`interface AvatarColors` SHALL содержать `actionBrushes: StatefulValue<Brush>` и `actionScrimBrushes: StatefulValue<Brush>`. Свойства `actionColor: Color` и `actionScrimColor: Color` SHALL сохраняться как `@Deprecated` compatibility API (с `ReplaceWith`) и SHALL вычисляться как `SolidColor`-компонента дефолтного значения кисти с fallback на прежние значения по умолчанию (`Color.White` и `AvatarDefaults.DefaultScrimColor`). Уже stateful-свойства (`textBrushes`, `textColors`, `backgroundBrushes`, `backgroundColors`) SHALL оставаться без изменений.

#### Scenario: Значения по умолчанию сохранены
- **WHEN** вызывается `AvatarColors.builder().build()` без параметров
- **THEN** `actionBrushes.getDefaultValue()` MUST быть эквивалентна `SolidColor(Color.White)`
- **AND** `actionScrimBrushes.getDefaultValue()` MUST быть эквивалентна `SolidColor(AvatarDefaults.DefaultScrimColor)`
- **AND** deprecated-свойства `actionColor`/`actionScrimColor` MUST возвращать те же цвета, что и до миграции

#### Scenario: Обратная совместимость actionColor(Color)
- **WHEN** существующий код вызывает `colorsBuilder.actionColor(Color.Red)`
- **THEN** код MUST компилироваться без изменений
- **AND** `build().actionBrushes.getDefaultValue()` MUST быть эквивалентна `SolidColor(Color.Red)`

### Requirement: AvatarColorsBuilder SHALL provide Color, InteractiveColor, Brush and StatefulValue overloads
`interface AvatarColorsBuilder` SHALL предоставлять для `actionColor` и `actionScrimColor` по четыре перегрузки: `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>`. Перегрузки `Color` и `InteractiveColor` MUST конвертироваться через существующие расширения `asStatefulBrush()`, перегрузка `Brush` — через `asStatefulValue()`, и все MUST делегировать к `StatefulValue<Brush>`-перегрузке.

#### Scenario: InteractiveColor конвертируется в StatefulValue<Brush>
- **WHEN** вызывается `actionColor(interactiveColor)` где `interactiveColor: InteractiveColor`
- **THEN** результирующий `actionBrushes` MUST равняться `interactiveColor.asStatefulBrush()`
- **AND** `actionBrushes.isStateful()` MUST возвращать `true` для интерактивного цвета с состояниями

### Requirement: AvatarDimensionValues SHALL expose StatefulValue<Dp> per dimension
`interface AvatarDimensionValues` SHALL содержать `statusOffsetXValues`, `statusOffsetYValues`, `widthValues`, `heightValues`, `statusCutoutPaddingValues` типа `StatefulValue<Dp>`. Существующие `Dp`-свойства SHALL сохраняться как `@Deprecated` compatibility API (с `ReplaceWith` на соответствующее `*Values`) и SHALL вычисляться через `getDefaultValue()`. Реализация `DefaultAvatarDimensionValues` SHALL хранить в constructor только stateful-значения. Значения по умолчанию SHALL сохраниться: `0.dp` для всех, кроме `statusCutoutPadding = 3.dp`.

#### Scenario: Дефолты builder не изменились
- **WHEN** вызывается `AvatarDimensionsBuilder.builder().build()` без параметров
- **THEN** `widthValues.getDefaultValue()` и `heightValues.getDefaultValue()` MUST равняться `0.dp`
- **AND** `statusCutoutPaddingValues.getDefaultValue()` MUST равняться `3.dp`
- **AND** deprecated-свойство `width` MUST равняться `widthValues.getDefaultValue()`

#### Scenario: Обратная совместимость width(Dp)
- **WHEN** существующий код (в т.ч. сгенерированный Theme Builder) вызывает `dimensions { width(88.0.dp) }`
- **THEN** код MUST компилироваться без изменений
- **AND** `build().widthValues.getDefaultValue()` MUST равняться `88.0.dp`

#### Scenario: Разные размеры по состояниям
- **WHEN** задан `widthValues` с разными `Dp` для состояний из `AvatarStatus`/`InteractiveState`
- **THEN** компонент `Avatar` MUST резолвить актуальный размер через `interactionSource` и stateSet и применять его в `requiredSize`/размере фона

### Requirement: Existing Avatar API SHALL remain source-compatible
Миграция SHALL сохранять все существующие public API `AvatarStyle`, `AvatarColors`, `AvatarDimensions*` без удаления. Компоненты-потребители, передающие `AvatarStyle` (`AvatarGroupStyle`, `Cell`, `ListItem`, `NavigationDrawerItem`), и сгенерированный код `tokens/*`/`integration-core/sandbox-compose` MUST компилироваться без правок.

#### Scenario: Сгенерированные стили токенов компилируются
- **WHEN** собирается модуль `tokens/*`, содержащий сгенерированный `AvatarStyles.kt` (вызовы `dimensions { statusOffsetX(1.0.dp); width(88.0.dp) }`, `colors { textColor(...); backgroundColor(...) }`)
- **THEN** компиляция MUST проходить без изменений в сгенерированном коде

#### Scenario: Скриншотное поведение не изменилось
- **WHEN** выполняются существующие скриншотные тесты Avatar (`ComposeAvatarScreenshotTest`) с дефолтными стилями
- **THEN** отрендеренные артефакты MUST остаться идентичными предыдущей версии
