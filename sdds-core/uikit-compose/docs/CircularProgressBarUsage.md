# Package com.sdds.compose.uikit

## CircularProgressBar

```kotlin
CircularProgressBar(
    progress = 0.5f,
    style = CircularProgressBar.Xxl.Default.style(),
    trackEnabled = true,
)
```

## Стиль CircularProgressBar

Стиль CircularProgressBar можно настроить с помощью CircularProgressBarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
CircularProgressBarStyle.builder()
 .colors {
    indicatorColor(
        SolidColor(SddsServTheme.colors.surfaceDefaultWarning).asStatefulValue(),
    )
    trackColor(
        SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
    )
    valueColor(
        SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
    )
.valueStyle(SddsServTheme.typography.headerH2Bold)
.dimensions {
    width(128.0.dp)
    height(128.0.dp)
    trackThickness(4.0.dp)
    progressThickness(4.0.dp)
}
.style()
}
```

## CircularProgressBar value и valueSuffix

value - параметр для отображения прогресса (как правило в числовом формате)
valueSuffix - параметр для отображения единиц измерения прогресса

```kotlin
CircularProgressBar(
    progress = 0.5f,
    style = LocalCircularProgressBarStyle.current,
    value = "${(progress * 100).roundToInt()}",
    valueSuffix = "%",
    ...
)
```
