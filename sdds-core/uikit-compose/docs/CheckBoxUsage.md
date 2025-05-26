# Package com.sdds.compose.uikit

## CheckBox

Компонент Checkbox может содержать лейбл и описание.

```kotlin
 CheckBox(
    style = CheckBox.M.style(),
    state = ToggleableState.On,
    enabled = true,
    label = "Label",
    description = "Description",
    onClick = {},
)
```

## Стиль CheckBox

Стиль CheckBox можно настроить с помощью CheckBoxStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
CheckBoxStyle.builder()
    .colorValues {
        labelColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(),
        )
        descriptionColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        toggleColor(
            SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                setOf(CheckBoxStates.Checked)
                    to SddsServTheme.colors.surfaceDefaultNegative,
                setOf(CheckBoxStates.Indeterminate)
                    to SddsServTheme.colors.surfaceDefaultNegative,
            ),
        )
        toggleIconColor(
            SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
        )
        toggleBorderColor(
            SddsServTheme.colors.outlineDefaultNegative.asInteractive(
                setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                    to SddsServTheme.colors.outlineDefaultNegative,
            )
        )
        ...
    .shape(SddsServTheme.shapes.roundXs)
    .labelStyle(SddsServTheme.typography.bodyLNormal)
    .descriptionStyle(SddsServTheme.typography.bodyMNormal)
    .dimensionValues {
        toggleWidth(24.0.dp)
        toggleHeight(24.0.dp)
        toggleIconHeight(
            0.0.dp.asStatefulValue(
                setOf(CheckBoxStates.Checked) to 6.0.dp,
                setOf(CheckBoxStates.Indeterminate) to
                    2.0.dp,
            ),
        )
    }
    .style()
}
```
