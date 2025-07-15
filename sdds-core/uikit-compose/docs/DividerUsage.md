# Package com.sdds.compose.uikit

## Divider

Компонент Divider используется для визуального разделения контента.

```kotlin
 Divider(
    style = Divider.Default.style(),
)
```

## Стиль Divider

Стиль Divider можно настроить с помощью DividerStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
DividerStyle.builder()
    .shape(CircleShape)
    .color {
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
        )
    }
    .dimensions {
        thickness(1.0.dp)
    }
    .style()
```
