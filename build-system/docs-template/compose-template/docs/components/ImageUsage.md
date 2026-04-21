---
title: Image
---

Технический компонент отображения изображений.

В качестве источника поддерживает Painter, ImageVector или ImageBitmap.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/image/Image_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.image.Image_Simple -->

## Стиль Image

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/image/Image_Style.kt
```

## Поддержка стиля Image для других компонентов

Чтобы поддержать стиль Image в произвольном компоненте, нужно использовать модификатор image(style: ImageStyle)

```kotlin
AsyncImage(
    modifier = Modifier
        .width(100.dp)
        .image(Image.Ratio3x4.style())
        .background(Color.Gray),
    model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
    contentDescription = "image",
    contentScale = ContentScale.Crop,
)
```