---
title: Overlay
--- 

Стилизованный контейнер на основе Box.

```kotlin
Overlay(
    modifier = Modifier.fillMaxSize(),
    style = Overlay.Default.style(),
) {
    IconButton(
        modifier = Modifier
            .align(Alignment.TopEnd)
            .padding(end = 8.dp, top = 8.dp),
        style = IconButton.S.Clear.style(),
        icon = painterResource(id = R.drawable.ic_close_24),
        onClick = {},
    )
}
```

## Стиль Overlay

Для Overlay существует набор сгенерированных стилей. Также стиль можно настроить с помощью OverlayStyle.builder().

### Создание стиля с помощью builder()

```kotlin
OverlayStyle.builder()
    .colors {
        backgroundColor(SolidColor(Color.Gray))
    }
    .style()
```
