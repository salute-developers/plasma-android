## 1. AiInputStyle — стиль и билдер (sdds-core/uikit-compose)

- [x] 1.1 Создать `AiInputMode` — enum с вариантами `Condensed` и `Extended` в пакете `com.sdds.compose.uikit.ai`
- [x] 1.2 Создать `AiInputColors` — `@Stable interface` с полями `backgroundColor`, `inputColor`, `placeholderColor`, `cursorColor` типа `StatefulValue<Brush>`
- [x] 1.3 Создать `AiInputColorsBuilder` — interface с четырьмя перегрузками (`Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>`) для каждого цвета и методом `build(): AiInputColors`
- [x] 1.4 Создать `DefaultAiInputColors` — `@Immutable private data class` с вложенным `Builder`, реализующим `AiInputColorsBuilder`
- [x] 1.5 Создать `AiInputDimensions` — `@Stable interface` с полями `paddingStart/End/Top/Bottom`, `textFieldPaddingStart/End/Top/Bottom`, `contentPadding`, `contentSpacing`, `scrollBarPaddingStart/Top/Bottom` типа `StatefulValue<Dp>`
- [x] 1.6 Создать `AiInputDimensionsBuilder` — interface с методами-сеттерами для каждого поля (`StatefulValue<Dp>` + shorthand `Dp`) и методом `build(): AiInputDimensions`
- [x] 1.7 Создать `DefaultAiInputDimensions` — `@Immutable private data class` с вложенным `Builder`
- [x] 1.8 Создать `AiInputStyle` — `@Stable interface : Style` с полями `shape: StatefulValue<Shape>`, `mode: AiInputMode`, `inputStyle: StatefulValue<TextStyle>`, `placeholderStyle: StatefulValue<TextStyle>`, `colors: AiInputColors`, `dimensions: AiInputDimensions`, `fileStyle: FileStyle`, `startButtonGroupStyle: ButtonGroupStyle`, `endButtonGroupStyle: ButtonGroupStyle`, `sendButtonStyle: ButtonStyle`, `scrollBarStyle: ScrollBarStyle`
- [x] 1.9 Создать `AiInputStyleBuilder` — `@ApiInfo interface : StyleBuilder<AiInputStyle>` с методами для всех полей стиля
- [x] 1.10 Создать `DefaultAiInputStyle` — `@Immutable private data class` с вложенным `Builder`, реализующим `AiInputStyleBuilder`
- [x] 1.11 Объявить `LocalAiInputStyle = compositionLocalOf { AiInputStyle.builder().style() }`
- [x] 1.12 Добавить KDoc ко всем публичным интерфейсам, классам и методам в `AiInputStyle.kt`

## 2. AiInputMotionStyle — поддержка анимаций (sdds-core/uikit-compose)

- [x] 2.1 Создать `AiInputMotionStyle` — data class с анимируемыми свойствами: `backgroundColor`, `inputColor`, `placeholderColor`, `cursorColor` и ключевые отступы
- [x] 2.2 Создать `rememberAiInputMotion(motionContext: MotionContext): Motion<AiInputMotionStyle>` — remember-функцию с нулевыми/статичными анимациями по умолчанию
- [x] 2.3 Разместить файлы в пакете `com.sdds.compose.uikit.motion.components.aiinput`

## 3. AiInput — компонент (sdds-core/uikit-compose)

- [x] 3.1 Создать файл `AiInput.kt` в пакете `com.sdds.compose.uikit.ai`
- [x] 3.2 Объявить сигнатуру `@Composable fun AiInput(value, onValueChange, modifier, style, enabled, readOnly, keyboardOptions, keyboardActions, visualTransformation, hasScrollBar, placeholder, content, startControls, endControls, sendButton, interactionSource, motion)`
- [x] 3.3 Реализовать разворачивание цветов через `getBrushAsState(motion.context, motion.style.*)` для всех кистей из `AiInputColors`
- [x] 3.4 Реализовать разворачивание отступов через `getDpAsState` для всех `StatefulValue<Dp>` из `AiInputDimensions`
- [x] 3.5 Реализовать слот `content` с `CompositionLocalProvider(LocalFileStyle provides style.fileStyle)`, горизонтальным скроллом и отступом снизу `contentPadding`
- [x] 3.6 Реализовать `BasicTextField` с `decorationBox` (placeholder при пустом `value.text`), `cursorBrush`, `keyboardOptions`, `keyboardActions`, `visualTransformation`
- [x] 3.7 Реализовать слот `startControls` с `CompositionLocalProvider(LocalButtonGroupStyle provides ..., LocalButtonStyle provides ...)`
- [x] 3.8 Реализовать слот `endControls` с `CompositionLocalProvider(LocalButtonGroupStyle provides ..., LocalButtonStyle provides ...)`
- [x] 3.9 Реализовать слот `sendButton` с `CompositionLocalProvider(LocalButtonStyle provides style.sendButtonStyle)`
- [x] 3.10 Реализовать режим `Extended`: поле ввода всегда в отдельной строке над контролами
- [x] 3.11 Реализовать режим `Condensed`: `remember { mutableStateOf(false) }` для `isMultiline`, переключение компоновки через `onTextLayout { isMultiline = it.lineCount > 1 }`
- [x] 3.12 Добавить KDoc ко всем параметрам `AiInput`

## 4. AiInputStory — интеграционная песочница (integration-core/uikit-compose-fixtures)

- [x] 4.1 Создать директорию `stories/aiinput` в `integration-core/uikit-compose-fixtures`
- [x] 4.2 Создать `AiInputUiState` — `@StoryUiState data class` с полями: `variant`, `appearance`, `placeholder`, `hasContent`, `hasActionsBefore`, `hasActionsAfter`, `autoResize`
- [x] 4.3 Создать `AiInputStory` — `@Story object : ComposeBaseStory<AiInputUiState, AiInputStyle>` с реализацией `Content` и `Preview`
- [x] 4.4 Зарегистрировать `ComponentKey.AiInput` (или переиспользовать существующий) в `StoryRegistry`

## 5. AiInputSamples — документационные примеры (integration-core/uikit-compose-fixtures)

- [x] 5.1 Создать `samples/aiinput/AiInputSamples.kt` с `@DocSample`-функциями: `AiInput_Simple`, `AiInput_WithContent`, `AiInput_WithControls`, `AiInput_Extended`, `AiInput_Style`
- [x] 5.2 В `AiInput_Style` показать сборку `AiInputStyle.builder()` со всеми секциями (colors, dimensions, mode, дочерние стили)

## 6. Документация

- [x] 6.1 Создать `AiInputUsage.md` с описанием компонента, режимов, слотов, примерами использования и примерами стилизации

## 7. Валидация

- [x] 7.1 Запустить `./gradlew :sdds-core:uikit-compose:detekt` и устранить замечания
- [x] 7.2 Запустить `./gradlew :sdds-core:uikit-compose:spotlessApply`
- [x] 7.3 Запустить `./gradlew :integration-core:uikit-compose-fixtures:detekt`
- [x] 7.4 Убедиться, что компонент компилируется без ошибок в sandbox-приложении

## 8. Доработки

- [x] 8.1 Добавить `shape: StatefulValue<Shape>` в `AiInputStyle` (+ методы билдера, дефолт `RoundedCornerShape(0)`) и применить `clip(shape)`; контейнер `content` клипать формой `fileStyle.shape`
- [x] 8.2 Добавить `scrollBarStyle: ScrollBarStyle` в `AiInputStyle`
- [x] 8.3 Заменить компоновку через два `if/else`-родителя на единый кастомный `Layout`, чтобы текстовое поле не пересоздавалось при смене режима (сохранение фокуса и курсора)
- [x] 8.4 Реализовать скроллбар как оверлей (кастомный `Layout`, не влияет на размер строки); позиция после `textFieldPaddingEnd` со смещением `scrollBarPaddingStart`, вертикаль по области текста + `scrollBarPaddingTop`/`scrollBarPaddingBottom`
- [x] 8.5 Переименовать `scrollBarPaddingEnd` → `scrollBarPaddingStart` в стиле, motion и токенах
- [x] 8.6 Добавить в `AiInputStory` флаг `autoResize` (при `false` — фиксированная высота 150.dp)
