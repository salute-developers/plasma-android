---
title: CodeField
---
Компонент CodeField представляет собой горизонтальный ряд текстовых полей. Каждое поле вмещает в себя один символ, введеный с клавиатуры.

После каждого ввода символа происходит автоматических переход к следующему. 
После заполнения всех символов, если код верный, осуществляется автоматических переход к следующему действию. 
Если код неверный - значения в полях сбрасываются и ввод осуществляется снова с первого символа.

Заполнение полей возможно только по порядку. Если требуется вернуться назад к одному из символов - необходимо удалить все впереди стоящие символы тоже.

```kotlin
val focusRequester = remember { FocusRequester() }
val validCode = "123456"
val invalidChar = "q"
LaunchedEffect(Unit) { focusRequester.requestFocus() }
CodeField(
    modifier = Modifier.focusRequester(focusRequester),
    style = CodeField.L.Segmented.style(),
    codeLength = 6,
    hidden = true,
    onCodeComplete = { it == validCode },
    isItemValid = { it != invalidChar },
    caption = "Caption",
    captionAlignment = Alignment.CenterHorizontally,
)
```

## Стиль CodeField

Для CodeField существует набор сгенерированных стилей. 
Также стиль можно настроить с помощью CodeFieldStyle.builder().

### Создание стиля CodeFieldStyle с помощью builder()

```kotlin
CodeFieldItemStyle.builder()
    .itemShape({{ docs-theme-codeReference }}.shapes.roundM)
    .groupShape({{ docs-theme-codeReference }}.shapes.roundL)
    .valueStyle({{ docs-theme-codeReference }}.typography.displayMBold)
    .captionStyle({{ docs-theme-codeReference }}.typography.headerH4Normal)
    .colors {
        valueColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asStatefulValue(
                setOf(CodeFieldStates.Error)
                        to {{ docs-theme-codeReference }}.colors.textDefaultNegative,
            ),
        )
        captionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(CodeFieldStates.Error)
                        to {{ docs-theme-codeReference }}.colors.textDefaultNegative,
            ),
        )
        dotColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault.asStatefulValue(
                setOf(CodeFieldStates.Error)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultNegative,
            ),
        )
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidPrimary.asStatefulValue(
                setOf(CodeInputStates.Error)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentNegative,
                setOf(InteractiveState.Activated)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentSecondary,
            ),
        )
        cursorColor(
            {{ docs-theme-codeReference }}.colors.textDefaultAccent,
        )
    }
    .dimensions {
        dotSize(16.0.dp)
        height(36.0.dp)
        width(60.0.dp)
        itemSpacing(8.0.dp)
        groupSpacing(28.0.dp)
        captionSpacing(28.0.dp)
    }
    .style()
```
