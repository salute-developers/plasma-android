---
title: Chip
--- 

Компонент Chip может содержать текст, который указывается через label.
label можно использовать вместе с startContent и endContent, с их помощью можно размещать иконку слева или справа от текста.

```kotlin
Chip(
    style = Chip.M.Default.style(),
    label = "label",
    isSelected = true,
    startContent = {
        Icon(
            painter = painterResource(id = R.drawable.ic_accessibility_24),
            contentDescription = "",
        )
    },
    endContent = {
        Icon(
            painter = painterResource(id = R.drawable.ic_close_24),
            contentDescription = "",
        )
    },
)
```

## Стиль Chip

Стиль Chip можно настроить с помощью ChipStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ChipStyle.builder()
    .colors {
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault.asInteractive(
                setOf(InteractiveState.Pressed)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefaultActive,
                setOf(InteractiveState.Hovered)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefaultHover,
            ),
        )
        contentStartColor(...)
        contentEndColor(...)
        labelColor(...)
    }
    .shape({{ docs-theme-codeReference }}.shapes.roundM)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyLNormal)
    .dimensions {
        height(48.0.dp)
        paddingStart(16.0.dp)
        paddingEnd(16.0.dp)
        contentStartPadding(8.0.dp)
        contentEndPadding(8.0.dp)
        contentStartSize(24.0.dp)
        contentEndSize(24.0.dp)
    }
    .style()
```
