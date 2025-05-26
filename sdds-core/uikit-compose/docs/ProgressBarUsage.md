# Package com.sdds.compose.uikit

## ProgressBar

Горизонтальный прогресс.

```kotlin
  ProgressBar(
    progress = 0.25f,
    modifier = Modifier.width(240.dp),
    style = ProgressBar.Default.style(),
)
```

## Стиль ProgressBar

Стиль ProgressBar можно настроить с помощью ProgressBarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ProgressBarStyle.builder()
.colorValues {
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
    )
    indicatorColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(),
    )
}
.indicatorShape(CircleShape)
.backgroundShape(CircleShape)
.dimensionValues {
    indicatorHeight(4.0.dp)
    backgroundHeight(4.0.dp)
.style()
}
```
