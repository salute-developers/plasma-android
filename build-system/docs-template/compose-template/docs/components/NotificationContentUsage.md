---
title: NotificationContent
---
Компонент, предназначенный для использования в [Notification](NotificationUsage.md) в качестве контента.

В качестве кнопок ожидает [Button](ButtonUsage.md). Кнопки добавляются с помощью функции button() из NotificationContentButtonsScope.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notificationcontent/NotificationContent_Simple.kt
```

## Стиль NotificationContent

Стиль NotificationContent можно настроить с помощью NotificationContentStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notificationcontent/NotificationContent_Style.kt
```

## NotificationContentButtonLayout

Режим размещения кнопок. Возможные значения: Stretch (Кнопки занимают всю ширину компонента), Normal (Кнопки имеют ширину по своему контенту)

## NotificationContentIconPlacement

Расположение иконки. Возможные значения: Start, Top, None