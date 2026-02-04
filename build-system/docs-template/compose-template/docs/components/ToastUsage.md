---
title: Toast
---

Временное, неблокируемое уведомление, которое появляется на короткое время, чтобы предоставить пользователю обратную связь.

Для корректной работы компонента необходимо обернуть контент в OverlayHost либо вручную провайдить менеджер уведомлений в [LocalOverlayManager](#overlaymanager).

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/toast/Toast_Simple.kt
```

## Стиль Toast

Для Toast существует набор сгенерированных стилей. Также стиль можно настроить с помощью ToastStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/toast/Toast_Style.kt
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
