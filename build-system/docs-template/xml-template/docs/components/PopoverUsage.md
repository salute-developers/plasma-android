---
title: Popover
---

Всплывающее окно — появляется при наведении или клике на элемент,  
используется для отображения одного контента поверх другого.

## Стиль Popover

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Popover преддусмтотрены следующие атрибуты

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shadowAppearance|стиль тени под всплывающим окном|reference|
|sd_shapeTailWidth / sd_shapeTailHeight|размеры хвостика всплывающего окна|dimension|
|sd_background|цвет фона всплывающего окна|color, reference|
|sd_shapeTailOffset|дополнительное смещение хвостика|dimension|
|sd_shapeTailPlacement|расположение хвостика на всплывающем окне|enum(start, top, end, bottom)|
|sd_shapeTailAlignment|выравнивание хвостика на выбранной стороне всплывающего окна|enum(start, center, end)|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
Для отображения Popover предусмотрена функция showWithTrigger, ниже приведен пример использования.  
где style - ресурс оверлэй стиля Popover.

```kotlin
val context = requireContext()
val popover = Popover(ContextThemeWrapper(context, style)).apply {
    isFocusable = true
    contentView = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL
        clipToPadding = false
        clipChildren = false
        isFocusable = false
        setPadding(8.dp)
        TextView(context)
            .apply {
                text = "Content"
            }.also {
                val lp = MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT)
                lp.bottomMargin = 20.dp
                addView(it, lp)
            }

        Button(context).apply {
            text = "Dismiss"
            setOnClickListener { dismiss() }
        }.also {
            addView(it)
        }
    }
}

val trigger = Button(context).apply {
    id = R.id.popover_trigger
    text = "Show Popover"
    setOnClickListener { 
        popover.showWithTrigger(
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
