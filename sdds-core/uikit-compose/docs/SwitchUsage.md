# Package com.sdds.compose.uikit

## Switch

Компонент Switch может содержать лейбл и описание.

```kotlin
Switch(
    style = Switch.L.style(),
    active = true,
    label = "Label",
    description = "Description",
    enabled = true,
)
```

## Стиль Switch

Стиль Switch можно настроить с помощью SwitchStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
SwitchStyle.builder()
    .toggleTrackShape(CircleShape)
    .toggleThumbShape(CircleShape)
    .colorValues {
        labelColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(),
        )
        descriptionColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        toggleTrackColor(
            SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                setOf(SwitchStates.Checked)
                    to SddsServTheme.colors.surfaceDefaultAccent,
            ),
        )
        toggleTrackBorderColor(
            SddsServTheme.colors.surfaceDefaultClear.asInteractive(),
        )
        toggleThumbColor(
            SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
        )
    }
    .invariantProps
    .labelStyle(SddsServTheme.typography.bodyLNormal)
    .descriptionStyle(SddsServTheme.typography.bodyMNormal)
    .dimensionValues {
        toggleTrackWidth(44.0.dp)
        toggleTrackHeight(28.0.dp)
        toggleThumbWidth(24.0.dp)
        toggleThumbHeight(24.0.dp)
        textPadding(12.0.dp)
        descriptionPadding(4.0.dp)
    }
    .style()
```

## Label и Description

По умолчанию текст в label и description - многострочный, это можно изменить с помощью параметров
labelMaxLines и descriptionMaxLines соответственно, установив нужное значение.
