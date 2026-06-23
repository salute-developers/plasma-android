## ADDED Requirements

### Requirement: AiInput SHALL accept text input parameters including keyboard and transformation options
`AiInput` в `sdds-core/uikit-compose` SHALL принимать параметры `value: TextFieldValue`, `onValueChange: (TextFieldValue) -> Unit`, `enabled: Boolean`, `readOnly: Boolean`, `keyboardOptions: KeyboardOptions`, `keyboardActions: KeyboardActions`, `visualTransformation: VisualTransformation`, `interactionSource: MutableInteractionSource`. Все параметры MUST передаваться в `BasicTextField`.

#### Scenario: keyboardOptions передаётся в BasicTextField
- **WHEN** `AiInput` вызывается с `keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send)`
- **THEN** `BasicTextField` внутри MUST получить тот же `keyboardOptions`

#### Scenario: keyboardActions передаётся в BasicTextField
- **WHEN** `AiInput` вызывается с `keyboardActions = KeyboardActions(onSend = { ... })`
- **THEN** `BasicTextField` внутри MUST получить тот же `keyboardActions`

#### Scenario: visualTransformation передаётся в BasicTextField
- **WHEN** `AiInput` вызывается с `visualTransformation = PasswordVisualTransformation()`
- **THEN** отображаемый текст MUST быть трансформирован согласно переданному `VisualTransformation`

#### Scenario: enabled = false отключает ввод
- **WHEN** `enabled = false`
- **THEN** `BasicTextField` MUST быть в неактивном состоянии и не реагировать на ввод

### Requirement: AiInput SHALL display placeholder when value is empty
`AiInput` SHALL отображать слот `placeholder: (@Composable () -> Unit)?` внутри `decorationBox` у `BasicTextField`, когда `value.text.isEmpty()`. При непустом `value` placeholder MUST быть скрыт. Стиль placeholder MUST применяться через `ProvideTextStyle` с типографикой и кистью из `AiInputStyle`.

#### Scenario: Пустое поле показывает placeholder
- **WHEN** `value.text == ""` и `placeholder != null`
- **THEN** placeholder-контент MUST быть виден в области ввода

#### Scenario: Непустое поле скрывает placeholder
- **WHEN** `value.text.isNotEmpty()`
- **THEN** placeholder-контент MUST NOT быть виден

#### Scenario: placeholder = null — ничего не рендерится
- **WHEN** `placeholder = null` и `value.text == ""`
- **THEN** в `decorationBox` MUST NOT быть дополнительных элементов для placeholder

### Requirement: AiInput SHALL switch layout based on mode from style
`AiInput` SHALL читать режим отображения из `AiInputStyle.mode: AiInputMode`. В режиме `AiInputMode.Extended` поле ввода MUST всегда располагаться над панелью контролов в отдельной строке. В режиме `AiInputMode.Condensed` поле ввода MUST располагаться в одну горизонтальную строку с контролами, когда текст однострочный, и переноситься над контролами, когда текст становится многострочным.

#### Scenario: Extended — поле всегда над контролами
- **WHEN** `style.mode == AiInputMode.Extended` и поле пустое
- **THEN** поле ввода MUST занимать отдельную строку над панелью `[ startControls | endControls | sendButton ]`

#### Scenario: Extended — многострочный текст не меняет компоновку
- **WHEN** `style.mode == AiInputMode.Extended` и текст занимает несколько строк
- **THEN** компоновка MUST оставаться неизменной: поле над контролами

#### Scenario: Condensed — однострочный текст в одну строку с контролами
- **WHEN** `style.mode == AiInputMode.Condensed` и `lineCount == 1`
- **THEN** компоновка MUST быть `[ startControls | field | endControls | sendButton ]` в одном Row

#### Scenario: Condensed — многострочный текст переносит поле над контролами
- **WHEN** `style.mode == AiInputMode.Condensed` и `lineCount > 1`
- **THEN** поле ввода MUST переместиться над панелью контролов, как в Extended

#### Scenario: Condensed — удаление до однострочного возвращает компоновку
- **WHEN** `style.mode == AiInputMode.Condensed` и текст был многострочным, затем пользователь удалил текст до одной строки
- **THEN** компоновка MUST вернуться к горизонтальной строке

#### Scenario: Переключение компоновки сохраняет фокус и курсор
- **WHEN** поле ввода в фокусе, и `Condensed` переключается между одно- и многострочным режимом (текст заполняет/освобождает первую строку)
- **THEN** текстовое поле MUST сохранять фокус и позицию курсора без пересоздания (поле остаётся одним и тем же узлом дерева композиции)

### Requirement: AiInput SHALL render content slot above text field
`AiInput` SHALL принимать слот `content: (@Composable RowScope.() -> Unit)?`. Если задан, он MUST рендерится выше области ввода с горизонтальным скроллом и нижним отступом из `AiInputDimensions.contentPadding`. Стиль файлов MUST провайдиться через `CompositionLocalProvider(LocalFileStyle provides style.fileStyle)`.

#### Scenario: Слот content задан — рендерится выше поля
- **WHEN** `content != null`
- **THEN** контент `content` MUST располагаться выше поля ввода с отступом снизу

#### Scenario: Слот content = null — ничего не рендерится
- **WHEN** `content == null`
- **THEN** область контента MUST NOT присутствовать в иерархии компонента

#### Scenario: Внутри content LocalFileStyle провайдится из стиля
- **WHEN** `content` содержит компонент `File`
- **THEN** `LocalFileStyle.current` внутри слота MUST равняться `style.fileStyle`

### Requirement: AiInput SHALL render startControls and endControls slots with button style providers
`AiInput` SHALL принимать слоты `startControls: (@Composable () -> Unit)?` и `endControls: (@Composable () -> Unit)?`. Каждый слот MUST получать стили через `CompositionLocalProvider`: `LocalButtonGroupStyle` и `LocalButtonStyle` из соответствующих полей `AiInputStyle`.

#### Scenario: startControls получает LocalButtonGroupStyle
- **WHEN** `startControls` содержит `ButtonGroup`
- **THEN** `LocalButtonGroupStyle.current` внутри слота MUST равняться `style.startButtonGroupStyle`

#### Scenario: endControls получает LocalButtonGroupStyle
- **WHEN** `endControls` содержит `ButtonGroup`
- **THEN** `LocalButtonGroupStyle.current` внутри слота MUST равняться `style.endButtonGroupStyle`

#### Scenario: Оба слота null — панель контролов рендерится пустой строкой
- **WHEN** `startControls == null` и `endControls == null`
- **THEN** строка контролов MUST содержать только слот `sendButton` (если задан)

### Requirement: AiInput SHALL render sendButton slot to the right of controls
`AiInput` SHALL принимать слот `sendButton: (@Composable () -> Unit)?`. Он MUST располагаться справа от `endControls` в той же строке контролов. Стиль MUST провайдиться через `CompositionLocalProvider(LocalButtonStyle provides style.sendButtonStyle)`.

#### Scenario: sendButton располагается справа от endControls
- **WHEN** `sendButton != null` и `endControls != null`
- **THEN** `sendButton` MUST рендерится правее `endControls` в строке контролов

#### Scenario: sendButton получает LocalButtonStyle из стиля
- **WHEN** `sendButton` содержит кнопку
- **THEN** `LocalButtonStyle.current` MUST равняться `style.sendButtonStyle`

#### Scenario: sendButton = null — слот отсутствует
- **WHEN** `sendButton == null`
- **THEN** правая часть строки контролов MUST NOT содержать элементов для кнопки отправки

### Requirement: AiInput SHALL render an overlay ScrollBar in multiline mode
`AiInput` SHALL принимать параметр `hasScrollBar: Boolean` (по умолчанию `true`). Скроллбар MUST отображаться только когда поле многострочное и контент реально прокручивается (высота ограничена родителем и `verticalScrollState.maxValue > 0`). Скроллбар MUST накладываться поверх поля и НЕ участвовать в измерении размеров строки — его появление или исчезновение MUST NOT изменять ширину/высоту текстового поля. По горизонтали скроллбар MUST располагаться после текстового поля и его `textFieldPaddingEnd`: левый край на правой границе поля плюс `scrollBarPaddingStart`. По вертикали трек MUST выравниваться по области текста (инсет от границ поля равен `textFieldPadding`) с дополнительным отступом `scrollBarPaddingTop`/`scrollBarPaddingBottom` внутрь. Стиль скроллбара MUST браться из `AiInputStyle.scrollBarStyle`.

#### Scenario: hasScrollBar = false — скроллбар не показывается
- **WHEN** `hasScrollBar == false` и текст многострочный и прокручиваемый
- **THEN** скроллбар MUST NOT отображаться

#### Scenario: Однострочный/непрокручиваемый текст — скроллбара нет
- **WHEN** поле однострочное либо контент полностью помещается (`maxValue == 0`)
- **THEN** скроллбар MUST NOT отображаться

#### Scenario: Многострочный прокручиваемый текст — скроллбар поверх поля
- **WHEN** `hasScrollBar == true`, поле многострочное и контент прокручивается
- **THEN** скроллбар MUST отображаться справа от текста, после `textFieldPaddingEnd`

#### Scenario: Появление скроллбара не сдвигает текстовое поле
- **WHEN** скроллбар появляется или исчезает при прокрутке
- **THEN** ширина и высота текстового поля MUST оставаться неизменными (скроллбар не входит в размер строки)

### Requirement: AiInput SHALL support Motion
`AiInput` SHALL принимать параметр `motion: Motion<AiInputMotionStyle>` с дефолтом `rememberAiInputMotion(rememberMotionContext(interactionSource))`. Все анимируемые свойства (цвета, отступы) MUST разворачиваться через `getBrushAsState` / `getDpAsState` с учётом `motion.context` и `motion.style`.

#### Scenario: По умолчанию motion создаётся через rememberAiInputMotion
- **WHEN** `AiInput` вызывается без явного параметра `motion`
- **THEN** компонент MUST использовать `rememberAiInputMotion` с `MutableInteractionSource` из параметра `interactionSource`

#### Scenario: Кастомный motion применяется к цветам
- **WHEN** передан кастомный `motion` с анимированными значениями цветов
- **THEN** цвета фона и текста MUST анимироваться согласно `motion.style`
