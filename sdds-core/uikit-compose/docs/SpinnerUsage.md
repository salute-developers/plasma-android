# Package com.sdds.compose.uikit

## Spinner

Индикатор бесконечной загрузки.

```kotlin
Spinner(style = Spinner.L.Positive.style())
```

## Стиль Spinner

Для Modal существует набор сгенерированных стилей. Также стиль можно настроить с помощью SpinnerStyle.builder().

### Создание стиля с помощью builder()

```kotlin
SpinnerStyle.builder()
    .angle(360)
    .strokeCap(SpinnerStrokeCap.Round)
    .dimensions {
        size(16.0.dp)
        strokeWidth(2.dp)
        padding(1.dp)
    }
    .colors {
        backgroundColor(Color.LightGray)
        startColor(Color.LightGray)
        endColor(Color.Black)
    }
.style()
```

## SpinnerStrokeCap

Вид концов спиннера. Возможные значения: Round, Square
