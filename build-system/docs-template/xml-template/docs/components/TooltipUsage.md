---
title: Tooltip
---

Простое всплывающее окно с текстом и иконкой.

## Стиль Tooltip

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Tooltip предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:textAppearance|стиль текста|reference|
|sd_contentStart|иконка (drawable) в начале|reference|
|sd_contentStartSize|размер иконки в начале|dimension|
|sd_contentStartPadding|отступ после иконки в начале|dimension|
|sd_background|цвет фона Toast|color, reference|
|sd_textColor|цвет текста|color, reference|
|sd_contentStartTint|цвет иконки в начале|color,reference|
|android:maxLines|максимальное количество строк в Toast| dimension|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
По скольку Tooltip разработан на Popover - доступны атрибуты [Popover](PopoverUsage.md#стиль-popover).  

Для отображения Tooltip, так же как и а Popover можно использовать функцию showWithTrigger.  
где style - ресурс оверлэй стиля Tooltip.

```kotlin
val context = requireContext()
val tooltip = Tooltip(ContextThemeWrapper(context, style)).apply{ isFocusable = true }
val trigger = Button(context).apply {
    id = R.id.popover_trigger
    text = "Show Tooltip"
    setOnClickListener { tooltip.showWithTrigger(
        trigger = it,
        placement = Popover.PLACEMENT_START,
        placementMode = Popover.PLACEMENT_MODE_LOOSE,
        alignment = Popover.ALIGNMENT_START,
        triggerCentered = false,
        tailEnabled = true,
        duration = 3000L,
        )
    }
}
```
