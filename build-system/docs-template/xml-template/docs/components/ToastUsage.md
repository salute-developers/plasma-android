---
title: Toast
---

Временное всплывающее сообщение, отображаемое с помощью системы оверлеев SDDS UI Kit,  
разработааной для удобства позиционирования и анимирования контента.

## Стиль Toast

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Toast предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:textAppearance|стиль текста|reference|
|sd_contentStart|иконка (drawable) в начале|reference|
|sd_contentStartSize|размер иконки в начале|dimension|
|sd_contentStartPadding|отступ после иконки в начале|dimension|
|sd_contentEnd|иконка (drawable) в конце|reference|
|sd_contentEndSize|размер иконки в конце|dimension|
|sd_contentEndPadding|отступ до иконки в конце|dimension|
|sd_background|цвет фона Toast|color, reference|
|sd_textColor|цвет текста|color, reference|
|sd_contentStartTint|цвет иконки в начале|color, reference|
|sd_contentEndTint|цвет иконки в конце|color, reference|
|android:maxLines|максимальное количество строк в Toast| dimension|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

Для создания Toast предусмотрены функции makeToast и simpleToast, ниже приведен пример использования.  
где style - ресурс оверлэй стиля Toast.

```kotlin
val context = requireContext()
val toast = Toast.simpleToast(
    context = ContextThemeWrapper(context, style),
    message = "Toast Text",
    position = OverlayPosition.BottomCenter,
    duration = 3000L,
    animationSpec = OverlayPosition.BottomCenter.getAnimationSpec(),
    contentStart = ContextCompat.getDrawable(
        context,
        com.sdds.icons.R.drawable.ic_plasma_24,
        ),
    contentEnd = ContextCompat.getDrawable(
        context,
        com.sdds.icons.R.drawable.ic_close_24,
        ),
    )
val trigger = Button(context).apply {
    text = "Show Toast"
    setOnClickListener { toast.show() }
}
```
