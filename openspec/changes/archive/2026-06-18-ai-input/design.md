## Context

В дизайн-системе уже существует `AiHeader` — компонент шапки AI-интерфейса, реализованный по шаблону: Composable-компонент + Style-интерфейс + StyleBuilder (аннотированный `@ApiInfo`) + Colors/Dimensions + Motion + CompositionLocal. `AiInput` расширяет AI-семейство компонентов, следуя тому же шаблону. Компонент размещается рядом с `AiHeader` в пакете `com.sdds.compose.uikit.ai` модуля `sdds-core/uikit-compose`.

Текстовый ввод реализуется через стандартный `BasicTextField` из Compose Foundation — без переиспользования существующего `TextField` дизайн-системы, поскольку `AiInput` имеет принципиально иную структуру слотов и логику адаптивного поведения.

## Goals / Non-Goals

**Goals:**
- Компонент `AiInput` с двумя режимами (`Condensed` / `Extended`) в `sdds-core/uikit-compose`.
- Стиль `AiInputStyle` + билдер `AiInputStyleBuilder` с `@ApiInfo`; режим отображения задаётся через `AiInputStyle` (не параметром компонента).
- Все цвета в `AiInputColors` используют `StatefulValue<Brush>` — интерактивные состояния поддерживаются из коробки.
- `cursorColor` в `AiInputColors` + соответствующий метод в `AiInputColorsBuilder`.
- Поддержка Motion: `AiInputMotionStyle` + `rememberAiInputMotion` по образцу `AiHeaderMotion`.
- Полный API текстового поля: `keyboardOptions`, `keyboardActions`, `visualTransformation` как параметры `AiInput`.
- Провайдинг `FileStyle`, `ButtonGroupStyle`, `ButtonStyle` дочерним слотам через `CompositionLocalProvider`.
- `AiInputStory` в `integration-core/uikit-compose-fixtures`.
- Документация `AiInputUsage.md`.

**Non-Goals:**
- Реализация компонента в View-стеке.
- Встроенная валидация или форматирование вводимого текста.
- Поддержка нескольких строк вложений (только один слот `content`).

## Decisions

### 1. Режим Condensed / Extended — в стиле, не в параметре

**Решение**: `AiInputStyle` содержит поле `mode: AiInputMode` (enum `Condensed` / `Extended`). Компонент читает `style.mode` и выбирает компоновку. Переключение режима — смена стиля снаружи, а не параметр `AiInput(mode = ...)`.

**Почему**: Режим является частью дизайн-токена (определяется брендом/вариантом), а не состоянием UI. Это согласуется с подходом `AiHeaderStyle`, где все визуальные характеристики задаются стилем.

`AiInputStyleBuilder` предоставляет метод:
```kotlin
fun mode(mode: AiInputMode): AiInputStyleBuilder
```

### 2. Адаптивная компоновка в режиме Condensed через `onTextLayout`

В режиме `Condensed` компонент отслеживает `lineCount` текущего текста через `BasicTextField.onTextLayout`. Состояние `isMultiline: Boolean` (remember + mutableStateOf) управляет переключением между компоновками:

**Condensed (однострочный)**:
```
[ content area                                       ]
[ startControls | field | endControls | sendButton  ]
```
**Condensed (многострочный) и Extended (всегда)**:
```
[ content area                   ]
[ field                          ]
[ startControls | endControls | sendButton ]
```

Поле ввода и контролы выкладываются единым кастомным `Layout`, где текстовое поле всегда остаётся одним и тем же узлом дерева композиции (меняется только measure/placement). Это исключает пересоздание `BasicTextField` при переключении одно-/многострочного режима и сохраняет фокус и курсор.

### 3. Motion — по образцу AiHeaderMotion

Добавляются:
- `AiInputMotionStyle` — data class с анимируемыми свойствами (цвета фона, курсора, placeholder и т.д.).
- `rememberAiInputMotion(motionContext)` — remember-функция, возвращающая `Motion<AiInputMotionStyle>`.
- Компонент принимает параметр `motion: Motion<AiInputMotionStyle>` с дефолтом через `rememberAiInputMotion`.
- Все `StatefulValue<Brush>` из `AiInputColors` разворачиваются через `getBrushAsState(motion.context, motion.style.*)`.
- `StatefulValue<Dp>` из `AiInputDimensions` — через `getDpAsState`.

Файлы размещаются в `com.sdds.compose.uikit.motion.components.aiinput`.

### 4. Все цвета — StatefulValue<Brush>, включая cursorColor

`AiInputColors` содержит только `StatefulValue<Brush>` — без `Color` напрямую. Это обеспечивает поддержку интерактивных состояний (pressed/focused/disabled) и градиентных кистей.

Состав `AiInputColors`:
- `backgroundColor: StatefulValue<Brush>` — фон компонента
- `inputColor: StatefulValue<Brush>` — цвет вводимого текста
- `placeholderColor: StatefulValue<Brush>` — цвет placeholder
- `cursorColor: StatefulValue<Brush>` — кисть курсора, передаётся в `BasicTextField(cursorBrush = ...)`

`AiInputColorsBuilder` предоставляет для каждого цвета удобные перегрузки:
- `fun xColor(color: Color)` → `SolidColor(color).asStatefulValue()`
- `fun xColor(color: InteractiveColor)` → `color.asStatefulBrush()`
- `fun xColor(brush: Brush)` → `brush.asStatefulValue()`
- `fun xColor(brush: StatefulValue<Brush>)` — основной метод

### 5. Полный API текстового поля

`AiInput` принимает параметры `BasicTextField` для полного контроля над вводом:
```kotlin
@Composable
fun AiInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: AiInputStyle = LocalAiInputStyle.current,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    hasScrollBar: Boolean = true,
    placeholder: (@Composable () -> Unit)? = null,
    content: (@Composable RowScope.() -> Unit)? = null,
    startControls: (@Composable () -> Unit)? = null,
    endControls: (@Composable () -> Unit)? = null,
    sendButton: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<AiInputMotionStyle> = rememberAiInputMotion(...),
)
```

### 6. Слоты и провайдинг стилей

- `content` — получает `LocalFileStyle` из `AiInputStyle.fileStyle`.
- `startControls` — получает `LocalButtonGroupStyle` из `startButtonGroupStyle`.
- `endControls` — получает `LocalButtonGroupStyle` из `endButtonGroupStyle`.
- `sendButton` — получает `LocalButtonStyle` из `sendButtonStyle`.

### 7. BasicTextField с кастомным decorationBox

`BasicTextField` с параметром `decorationBox`: если `value.text.isEmpty()` — отображается placeholder-слот через `ProvideTextStyle` с `placeholderColor` и `placeholderStyle` из стиля. Курсор передаётся через `cursorBrush`, разворачиваемый из `AiInputColors.cursorColor` через Motion.

### 9. Форма компонента — shape в стиле

`AiInputStyle` содержит `shape: StatefulValue<Shape>` (методы `shape(Shape)` / `shape(StatefulValue<Shape>)`, дефолт `RoundedCornerShape(0)`). Компонент применяет форму через `clip(shape)` к корневому контейнеру. Контейнер области `content` дополнительно клипается формой из `fileStyle.shape`.

### 10. Скроллбар в многострочном режиме — оверлей

Скроллбар (`ScrollBar`, стиль из `AiInputStyle.scrollBarStyle`) показывается только при многострочном прокручиваемом тексте и `hasScrollBar = true`. Он накладывается поверх текстового поля через кастомный `Layout` и НЕ участвует в измерении строки, поэтому его появление/исчезновение не сдвигает верстку. По горизонтали — после текстового поля и его `textFieldPaddingEnd` (со смещением `scrollBarPaddingStart`); по вертикали трек выровнен по области текста с инсетом `scrollBarPaddingTop`/`scrollBarPaddingBottom` внутрь.

### 8. Следование шаблону AiHeaderStyle

`AiInputStyle` строится по тому же шаблону:
- `@Stable interface AiInputStyle : Style`
- `@ApiInfo interface AiInputStyleBuilder : StyleBuilder<AiInputStyle>`
- `@Immutable private data class DefaultAiInputStyle`
- `AiInputColors` / `AiInputColorsBuilder` / `DefaultAiInputColors`
- `AiInputDimensions` / `AiInputDimensionsBuilder` / `DefaultAiInputDimensions`
- `LocalAiInputStyle = compositionLocalOf { AiInputStyle.builder().style() }`

## Risks / Trade-offs

- **Мерцание при переключении режима в Condensed** → рекомпозиция при изменении `isMultiline`; митигируется тем, что состояние локально и не поднимается наверх.
- **Motion-зависимость** → добавление `AiInputMotionStyle` требует координации с модулем `motion`; при отсутствии анимаций используется `rememberAiInputMotion` с нулевыми/статичными значениями.
- **KDoc на публичном API** → обязателен для всех публичных интерфейсов, классов и функций в `AiInput.kt` и `AiInputStyle.kt` — иначе Dokka-генерация будет неполной.

## Validation

```
./gradlew :sdds-core:uikit-compose:detekt
./gradlew :sdds-core:uikit-compose:spotlessApply
./gradlew :integration-core:uikit-compose-fixtures:detekt
```
