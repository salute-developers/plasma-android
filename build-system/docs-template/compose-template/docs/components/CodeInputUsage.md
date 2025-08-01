---
title: CodeInput
---
Компонент CodeInput представляет собой горизонтальный ряд графических элементов (точек). Каждая точка вмещает в себя один символ, введеный с клавиатуры.

После каждого ввода символа происходит автоматических переход к следующему. 
После заполнения всех символов, если код верный, осуществляется автоматических переход к следующему действию. 
Если код неверный - значения в полях сбрасываются и ввод осуществляется снова с первого символа.

Заполнение полей возможно только по порядку. Если требуется вернуться назад к одному из символов - необходимо удалить все впереди стоящие символы тоже.

```kotlin
import javax.swing.GroupLayout.Alignment

val focusRequester = remember { FocusRequester() }
val validCode = "123456"
val invalidChar = "q"
LaunchedEffect(Unit) { focusRequester.requestFocus() }
CodeInput(
    modifier = Modifier.focusRequester(focusRequester),
    style = CodeInput.L.style(),
    codeLength = 6,
    hidden = true,
    onCodeComplete = { it == validCode },
    isItemValid = { it != invalidChar },
    caption = "Caption",
    captionAlignment = Alignment.CenterHorizontaly,
)
```

## Стиль CodeInput

Для CodeInput существует набор сгенерированных стилей. 
Также стиль можно настроить с помощью CodeInputStyle.builder().

### Создание стиля CodeInputStyle с помощью builder()

```kotlin
CodeInputItemStyle.builder()
    .codeStyle({{ docs-theme-codeReference }}.typography.displayMBold)
    .captionStyle({{ docs-theme-codeReference }}.typography.headerH4Normal)
    .colors {
        codeColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asStatefulValue(
                setOf(CodeInputStates.Error)
                        to {{ docs-theme-codeReference }}.colors.textDefaultNegative,
            ),
        )
        captionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(CodeInputStates.Error)
                        to {{ docs-theme-codeReference }}.colors.textDefaultNegative,
            ),
        )
        fillColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault.asStatefulValue(
                setOf(CodeInputStates.Error)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultNegative,
            ),
        )
        strokeColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault.asStatefulValue(
                setOf(CodeInputStates.Error)
                        to {{ docs-theme-codeReference }}.colors.outlineDefaultNegative,
            ),
        )
    }
    .dimensions {
        dotSize(16.0.dp)
        strokeWidth(1.5.dp)
        itemHeight(36.0.dp)
        itemWidth(60.0.dp)
        itemSpacing(8.0.dp)
        groupSpacing(28.0.dp)
        captionPadding(28.0.dp)
    }
    .style()
```
