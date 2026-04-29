---
title: NotificationContent
---
Компонент, предназначенный для использования в [Notification](NotificationUsage.md) в качестве контента.

В качестве кнопок ожидает [Button](BasicButtonUsage). Кнопки добавляются с помощью функции button() из NotificationContentButtonsScope.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notificationcontent/NotificationContent_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.notificationcontent.NotificationContent_Simple -->

## Стиль NotificationContent

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/notificationcontent/NotificationContent_Style.kt
```

## NotificationContentButtonLayout

Режим размещения кнопок. Возможные значения: Stretch (Кнопки занимают всю ширину компонента), Normal (Кнопки имеют ширину по своему контенту)

## NotificationContentIconPlacement

Расположение иконки. Возможные значения: Start, Top, None