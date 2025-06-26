# Package com.sdds.uikit

## Notification

Всплывающий элемент - уведомление поверх контента, отображаемое с помощью системы оверлеев SDDS UI Kit,  
разработааной для удобства позиционирования и анимирования контента.

## Стиль Notification

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Notification предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_background|цвет фона Notification|color, reference|
|sd_shapeAppearance|форма скругления углов|reference|
|sd_closeIcon|иконка закрытия|reference|
|sd_closeIconTint|цвет иконки|color|
|sd_closeIconSize|размер иконки|dimension|
|sd_closeIconContentPadding|отступ иконки|dimension|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  

Для создания Notification предусмотрена функция makeNotification, ниже приведен пример использования.  
где style - ресурс оверлэй стиля Notification.

```kotlin
val context = requireContext()
val notification = Notification.makeNotification(
    context = ContextThemeWrapper(context, style),
    position = OverlayPosition.BottomEnd,
    duration = 5000L,
    animationSpec = OverlayPosition.BottomEnd.getAnimationSpec(),
    isFocusable = false,
    hasClose = true,
) { ctx, _ ->
    TextView(ctx).apply {
        text = "Notification Text"
        setTextColor(ctx.getTextColorPrimary())
    }
}
val trigger = Button(context).apply {
    text = "Show Notification"
    setOnClickListener { notification.show() }
}
```
