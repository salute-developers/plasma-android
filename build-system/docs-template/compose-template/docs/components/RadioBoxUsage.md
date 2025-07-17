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
            SddsServTheme.colors.textDefaultPrimary.asInteractive(),
        )
        descriptionColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        toggleColor(
            SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                setOf(RadioBoxStates.Checked)
                    to SddsServTheme.colors.surfaceDefaultAccent,
            ),
        )
        toggleIconColor(...)
        toggleBorderColor(...)
    }
    .shape(SddsServTheme.shapes.roundXs)
    .labelStyle(SddsServTheme.typography.bodyLNormal)
    .descriptionStyle(SddsServTheme.typography.bodyMNormal)
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
