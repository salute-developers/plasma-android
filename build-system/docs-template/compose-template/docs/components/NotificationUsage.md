---
title: Notification
---

Всплывающий элемент — уведомление поверх контента.
В качестве контента ожидает [NotificationContent](NotificationContentUsage.md) либо произвольный контент.

Для корректной работы компонента необходимо обернуть контент в OverlayHost либо вручную провайдить менеджер уведомлений в [LocalOverlayManager](#overlaymanager).

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notification/Notification_Simple.kt
```

## Стиль Notification

Для Notification существует набор сгенерированных стилей. Также стиль можно настроить с помощью NotificationStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notification/Notification_Style.kt
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
