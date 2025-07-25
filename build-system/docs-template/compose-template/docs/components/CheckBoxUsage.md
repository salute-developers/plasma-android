---
title: CheckBox
--- 

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
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        descriptionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        toggleColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultClear.asInteractive(
                setOf(CheckBoxStates.Checked)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultNegative,
                setOf(CheckBoxStates.Indeterminate)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultNegative,
            ),
        )
        toggleIconColor(
            {{ docs-theme-codeReference }}.colors.textOnDarkPrimary.asInteractive(),
        )
        toggleBorderColor(
            {{ docs-theme-codeReference }}.colors.outlineDefaultNegative.asInteractive(
                setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                    to {{ docs-theme-codeReference }}.colors.outlineDefaultNegative,
            )
        )
        ...
    .shape({{ docs-theme-codeReference }}.shapes.roundXs)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyLNormal)
    .descriptionStyle({{ docs-theme-codeReference }}.typography.bodyMNormal)
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
