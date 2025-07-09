# Package com.sdds.compose.uikit

## Image

Технический компонент отображения изображений.

В качестве источника поддерживает Painter, ImageVector или ImageBitmap.

```kotlin
Image(
    modifier = Modifier
        .width(100.dp)
        .background(Color.Gray),
    painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
    contentDescription = "image",
    style = Image.Ratio3x4.style(),
    contentScale = ContentScale.Fit,
    alignment = Alignment.Center,
)
```

## Стиль Image

Стиль Image можно настроить с помощью ImageStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ImageStyle.builder()
    .ratio(2f)
.style()
```