---
title: NotificationContent
---
Компонент, предназначенный для использования в [Notification](NotificationUsage.md) в качестве контента.

Компонент наследует LinearLayout, для добавления кнопок необходимо добавить вложенную view ButtonGroup стандартным способом.

## Стиль NotificationContent

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Notification предусмотрены следующие атрибуты:

|      Название атрибута       |               Описание                | Формат данных |
|:----------------------------:|:-------------------------------------:|:-------------:|
|  sd_buttonGroupStyleOverlay  |          cтиль группы кнопок          |   reference   |
|       sd_buttonLayout        |        режим размещения кнопок        |     enum      |
| sd_notificationIconPlacement |          расположение иконки          |     enum      |
|           sd_icon            |                иконка                 |   reference   |
|         sd_iconTint          |              цвет иконки              |     color     |
|         sd_iconSize          |             размер иконки             |   dimension   |
|        sd_iconMargin         |             отступ иконки             |   dimension   |
|           sd_title           |               заголовок               |    string     |
|      sd_titleAppearance      |            стиль заголовка            |   reference   |
|        sd_titleColor         |            цвет заголовка             |     color     |
|           sd_text            |           текст уведомления           |    string     |
|      sd_textAppearance       |             стиль текста              |   reference   |
|         sd_textColor         |              цвет текста              |     color     |
|        sd_textPadding        |           отступ до текста            |   dimension   |
|    sd_contentStartPadding    |       отступ контента в начале        |   dimension   |
|     sd_contentEndPadding     |        отступ контента в конце        |   dimension   |
|     sd_contentTopPadding     |        отступ контента сверху         |   dimension   |
|   sd_contentBottomPadding    |         отступ контента снизу         |   dimension   |
|    sd_textBoxStartPadding    | отступ текстового контейнера в начале |   dimension   |
|     sd_textBoxEndPadding     | отступ текстового контейнера в конце  |   dimension   |
|     sd_textBoxTopPadding     |  отступ текстового контейнера сверху  |   dimension   |
|   sd_textBoxBottomPadding    |  отступ текстового контейнера снизу   |   dimension   |
|    sd_buttonGroupStartPadding    |     отступ группы кнопок в начале     |   dimension   |
|     sd_buttonGroupEndPadding     | отступ группы кнопок в конце  |   dimension   |
|     sd_buttonGroupTopPadding     |  отступ группы кнопок сверху  |   dimension   |
|   sd_buttonGroupBottomPadding    |  отступ группы кнопок снизу   |   dimension   |

## Использование NotificationContent в коде

```kotlin
val context = requireContext()
val notification = Notification.makeNotification(
    context = context,
    position = OverlayPosition.BottomEnd,
    duration = 5000L,
    animationSpec = OverlayPosition.BottomEnd.getAnimationSpec(),
    notificationStyleOverlay = R.style.AppNotificationStyleOverlay,
    isFocusable = false,
    hasClose = true,
) { ctx, _ ->
    NotificationContent(ctx).apply {
        title = "Notification Title"
        text = "Notification Text"
        icon = R.drawable.ic_icon
    }
}
val trigger = Button(context).apply {
    text = "Show Notification"
    setOnClickListener { notification.show() }
}
```

## Использование NotificationContent в xml

```xml
<com.sdds.uikit.NotificationContent
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:minWidth="300dp"
        app:sd_notificationIconPlacement="start"
        app:sd_buttonLayout="stretch"
        app:sd_text="Notification Text"
        app:sd_title="Notification Title">

        <com.sdds.uikit.ButtonGroup
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <com.sdds.uikit.Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Ok" />

            <com.sdds.uikit.Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Cancel" />
        </com.sdds.uikit.ButtonGroup>

    </com.sdds.uikit.NotificationContent>
```