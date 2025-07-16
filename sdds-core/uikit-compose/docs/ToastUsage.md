# Package com.sdds.compose.uikit

## Toast

Временное, неблокируемое уведомление, которое появляется на короткое время, чтобы предоставить пользователю обратную связь.

Для корректной работы компонента необходимо обернуть контент в OverlayHost либо вручную провайдить менеджер уведомлений в [LocalOverlayManager](#overlaymanager).

```kotlin
val overlayManager = LocalOverlayManager.current
Button(
    modifier = Modifier.align(Alignment.Center),
    label = "Show toast",
    onClick = {
        overlayManager.showToast(
            position = OverlayPosition.BottomEnd,
        ) {
            Toast(
                style = Toast.Rounded.Negative.style(),
                text = "Toast text",
                contentStart = {
                    Icon(painter = painterResource(R.drawable.ic_shazam_16))
                },
                contentEnd = {
                    Icon(painter = painterResource(R.drawable.ic_close_16))
                },
            )
        }
    },
)
```

## Стиль Toast

Для Toast существует набор сгенерированных стилей. Также стиль можно настроить с помощью ToastStyle.builder().

### Создание стиля с помощью builder()

```kotlin
ToastStyle.builder()
    .shadow(SddsServTheme.shadows.downHardM)
    .shape(SddsServTheme.shapes.roundM)
    .textStyle(SddsServTheme.typography.bodyMNormal)
    .dimensions {
        contentStartSize(16.0.dp)
        contentStartPadding(4.0.dp)
        contentEndSize(16.0.dp)
        contentEndPadding(4.0.dp)
        paddingStart(8.dp)
        paddingEnd(8.dp)
        paddingTop(8.dp)
        paddingBottom(8.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.Black))
        textColor(Color.LightGray)
        contentStartColor(Color.LightGray)
        contentEndColor(Color.LightGray)
    }
    .style()
```

## OverlayManager

Менеджер уведомлений.

Можно использовать OverlayHost, который провайдит преднастроенный менеджер OverlayManager в контент.
Также менеджер можно создать с помощью функции overlayManager() и вручную провайдить созданный экземпляр в LocalOverlayManager.

```kotlin
OverlayHost {
    ...
    val overlayManager = LocalOverlayManager.current
    overlayManager.showToast(
        position = OverlayPosition.BottomEnd,
    ) {...}
}
```
