---
title: RadioBox
--- 

Компонент RadioBox может содержать лейбл и описание.

```kotlin
RadioBox(
    style = RadioBox.M.style(),
    checked = true,
    enabled = true,
    label = "Label",
    description = "Description",
    onClick = {},
)
```

## Стиль RadioBox

Стиль RadioBox можно настроить с помощью RadioBoxStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
RadioBoxStyle.builder()
    .colorValues {
        labelColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        descriptionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        toggleColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultClear.asInteractive(
                setOf(RadioBoxStates.Checked)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultAccent,
            ),
        )
        toggleIconColor(...)
        toggleBorderColor(...)
    }
    .shape({{ docs-theme-codeReference }}.shapes.roundXs)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyLNormal)
    .descriptionStyle({{ docs-theme-codeReference }}.typography.bodyMNormal)
    .dimensionValues {
        toggleBorderOffset(
            0.0.dp.asStatefulValue(
                setOf(InteractiveState.Focused) to 3.0.dp,
                setOf(
                    InteractiveState.Focused,
                    RadioBoxStates.Checked,
                ) to 3.0.dp,
            ),
        ),
        toggleWidth(24.0.dp)
        toggleHeight(24.0.dp)
        toggleIconHeight(10.0.dp)
        toggleIconWidth(10.0.dp)
        toggleBorderWidth(
            2.0.dp.asStatefulValue(
                setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
            ),
        )
        togglePadding(1.0.dp)
        textPadding(12.0.dp)
        descriptionPadding(2.0.dp)
    }
    .style()

```
