---
title: Button
---

```kotlin
Button(
    style = BasicButton.L.Default.style(),
    label = "Label",
    enabled = true,
    loading = false,
    onClick = {},
)
```

## Стиль Button

Стиль Button можно настроить с помощью ButtonStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ButtonStyle.basicButtonBuilder()
    .shape({{ docs-theme-codeReference }}.shapes.roundL)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .valueStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .colors {
        spinnerColor(
            {{ docs-theme-codeReference }}.colors.textOnLightPrimary.asInteractive(
                setOf(InteractiveState.Pressed)
                    to {{ docs-theme-codeReference }}.colors.textOnLightPrimaryActive,
                setOf(InteractiveState.Hovered)
                    to {{ docs-theme-codeReference }}.colors.textOnLightPrimaryHover,
            ),
        )
        iconColor(...),
        labelColor(...),
        valueColor(...),
        backgroundColor(...),
    }
    .dimensions {
        height(64.0.dp)
        paddingStart(28.0.dp)
        paddingEnd(28.0.dp)
        minWidth(106.0.dp)
        iconSize(24.0.dp)
        spinnerSize(24.0.dp)
        spinnerStrokeWidth(2.0.dp)
        iconMargin(8.0.dp)
        valueMargin(4.0.dp)
    }
    .style()
```

## Расположение контента внутри Button

Расположение контента задается при помощи параметра spacing. Может быть Packed (контент центрирован, лишние оступы располагаются по краям) или SpaceBetween (Контент отобразится по всей ширине, отступы будут добавлены между элементами контента).

```kotlin
Button(
    style = BasicButton.L.Default.style(),
    label = "Label",
    value = "Value",
    spacing = ButtonSpacing.Packed,
    onClick = {},
)
```

## Button Loading

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
Button(
    style = BasicButton.L.Default.style(),
    label = "Label",
    value = "",
    enabled = true,
    loading = true,
    onClick = {},
)
```
