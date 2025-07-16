# Package com.sdds.compose.uikit

## Notification

Всплывающий элемент — уведомление поверх контента.

Для корректной работы компонента необходимо обернуть контент в OverlayHost либо вручную провайдить менеджер уведомлений в [LocalOverlayManager](#overlaymanager).

```kotlin
val overlayManager = LocalOverlayManager.current
Button(
    label = "show notification",
    onClick = {
        overlayManager.showNotification(
            durationMillis = 3000,
            position = OverlayPosition.BottomEnd,
            isFocusable = false,
        ) {
            Notification(
                style = NotificationCompact.M.style(),
                hasClose = true,
                closeIcon = painterResource(R.drawable.ic_close_24),
                onClose = { overlayManager.remove(it) },
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 32.dp),
                ) {
                    Text(text = "Notification text")
                }
            }
        }
    },
)
```

## Стиль Notification

Для Notification существует набор сгенерированных стилей. Также стиль можно настроить с помощью NotificationStyle.builder().

### Создание стиля с помощью builder()

```kotlin
NotificationStyle.builder()
    .shadow(SddsServTheme.shadows.downHardM)
    .shape(SddsServTheme.shapes.roundM)
    .textStyle(SddsServTheme.typography.bodyMNormal)
    .dimensions {
        closeSize(16.0.dp)
        paddingStart(8.dp)
        paddingEnd(8.dp)
        paddingTop(8.dp)
        paddingBottom(8.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.Gray))
        closeColor(Color.LightGray)
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
    overlayManager.showNotification(
        durationMillis = 3000,
        position = OverlayPosition.BottomEnd,
        isFocusable = false,
    ) {...}
}
```
