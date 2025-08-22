---
title: NotificationContent
---
Компонент, предназначенный для использования в [Notification](NotificationUsage.md) в качестве контента.

В качестве кнопок ожидает [Button](ButtonUsage.md). Кнопки добавляются с помощью функции button() из NotificationContentButtonsScope.

```kotlin
NotificationContent(
    modifier = Modifier.fillMaxWidth(),
    style = NotificationContentCompact.IconStart.Positive.style(),
    title = "Title",
    text = "Notification Text",
    buttons = {
        button { Button(label = "Ok", onClick = {}) }
        button { Button(label = "Cancel", onClick = {}) }
    },
)
```

## Стиль NotificationContent

Стиль NotificationContent можно настроить с помощью NotificationContentStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
NotificationContentStyle.builder()
    .buttonLayout(NotificationContentButtonLayout.Stretch)
    .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
    .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
    .titleStyle({{ docs-theme-codeReference }}.typography.bodySBold)
    .textStyle({{ docs-theme-codeReference }}.typography.textSNormal)
    .dimensions {
        iconSize(24.0.dp)
        textPadding(4.0.dp)
        contentStartPadding(4.0.dp)
        contentTopPadding(2.0.dp)
        textBoxBottomPadding(6.0.dp)
        buttonGroupTopPadding(6.0.dp)
    }
    .style()
```

## NotificationContentButtonLayout

Режим размещения кнопок. Возможные значения: Stretch (Кнопки занимают всю ширину компонента), Normal (Кнопки имеют ширину по своему контенту)

## NotificationContentIconPlacement

Расположение иконки. Возможные значения: Start, Top, None