---
title: Slider
---
Компонент Slider - применяется для выбора значения (value) из заданного диапозона.  
Представляет собой контейнер для отображения [SliderView] совместно с Label - блоком, включающим  
в себя заголовок (title) и иконку (icon), с возможностью конфигурирования расположения этих блоков.  
Для отображения выбранного значения используется компонент [ToolTip](TooltipUsage.md).

## Использование Slider в xml

```xml
<com.sdds.uikit.Slider
    style="@style/{{ docs-theme-prefix }}.Components.SliderHorizontalLabelOuter.L.Accent"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    app:sd_title="Title"
    app:sd_icon="@drawable/ic_animal_fill_16"/>
```

## Стили

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Slider предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|android:orientation|Ориентация|enum(horizontal, vertical)|
|sd_progress|текущий прогресс|float|
|sd_maxProgress|максимальный прогресс|float|
|sd_minProgress|минимальный прогресс|float|
|sd_title|текст в title|string|
|sd_titleColor|цвет текста Title|color|
|sd_titleAppearance|стиль текста Title|reference|
|sd_titleMargin|отступ от между текстом Title и иконкой|dimension|
|sd_titleAlignment|расположение текста в лэйбле|enum(none,start,end)|
|sd_icon|ссылка на ресурс иконки в Label|reference|
|sd_iconSize|размер иконки|dimension|
|sd_iconTint|окрас иконки|reference,color|
|sd_labelMargin|отступ от Label до Slider|dimension|
|sd_labelEnabled|отображение Label|boolean|
|sd_labelAlignment|расположение лэйбла с иконкой относительной Slider|enum(top,center,bottom)|
|sd_alignment|выравнивание всего контента внутри Slider|enum(start,center,end)|
|sd_thumbEnabled|отображение ползунка|boolean|
|sd_limitLabelAlignment|расположение лэйблов ограничений|enum(start,center,end)|
|sd_limitLabelMargin|отступ от limitLabel до Slider|dimension|
|sd_limitLabelEnabled|отображение limitLabel|boolean|
|sd_tooltipStyleOverlay|оверлэй стиль компоннета ToolTip, отображающего текст, установленного значения|reference|
|sd_limitLabelAppearance|стиль текста Label|reference|
|sd_limitLabelColor|цвет текста Label|reference,color|
|sd_valuePlacement|расположение текста установленного значения|enum(top,start,end,bottom)|
|sd_valueMode|режим отображения текста установленного значения|enum(none,interaction)|
|sd_slideDirection|направление slide|enum(normal,reversed)|
|sd_trackColor|окрас неподвижной части slider|reference,color|
|sd_thumbColor|окрас подвижной части slider|reference,color|
|sd_strokeColor|окрас бордера подвижной части slider|reference,color|
|sd_indicatorColor|окрас неподвижной части slider в пределах установленного значения|reference,color|
|sd_trackThickness|толщина трэка |dimension|reference|
|sd_indicatorThickness|толщина линии прогресса|dimension|reference|
|sd_shapeAppearance|форма скруглений неподвижной части (track)|reference|
|sd_thumbShapeAppearance|форма скруглений ползунка (thumb)|reference|
|sd_indicatorShapeAppearance|форма скруглений неподвижной части в пределах установленного значения|reference|
|sd_thumbSize|размер ползунка (thumb)|dimension|
|sd_strokeWidth|толщина бордера ползунка (thumb)|float,fraction,dimension|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте  
[sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

## Взаимодействие со Slider

Ползунок Slider поддерживает drag, для изменения значения нажмите на ползунок и потяните в нужную сторону, так же  
имеется возможность моментальной установки значения нажатием на произвольное место в области трэка, если при этом не  
отпускать  палец то нажатие переходит в режим drag и вы можете продолжить перетаскивать его.

## ValueMode

Для конфигурирования режима отображения выбранного значения, используйте setValueMode(valueMode: Int) и константы  
Slider.VALUE_MODE_NONE - не отображать, Slider.VALUE_MODE_INTERACTION - отображать пока идет взаимодействие со Slider  
(пока есть событие касания полунка).

## ValuePlacement

По скольку для отображения выбранного значения используется компонет [ToolTip](TooltipUsage.md), для конфигурирования  
размещения в коде воспользуйтесь функцией setValueMode(valueMode: Int) и константами расположения  
[Popover](PopoverUsage.md) Popover.PLACEMENT_START,  Popover.PLACEMENT_END, Popover.PLACEMENT_TOP,  
Popover.PLACEMENT_BOTTOM.  

## ProgressListener

Для установки колбэка на изменение выбранного значения, используйте setProgressListener `{ progress: Float -> }`.  
Значение прогресса находится в диапазоне от 0 до 1.  

## ProgressFormatTransformer

Для конфигурирования формата вывода установленного значения используйте setProgressFormatTransformer `{ progress: Float -> }`.  
Здесь прогресс возвращается в диапазоне установленных минимального и максимального значений (minProgress, maxProgress).  
Пример конфигурирования для перевода значения в формате минуты:секунды

```kotlin
setProgressFormatTransformer { progress: Float ->
    val totalSeconds = progress.toInt()
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    "%02d:%02d".format(minutes, seconds)
}
```

При таком конфигурировании изменится формат вывода установленного значения, а так же отображение значений в лэйблах  
минимального и максимального значений прогресса.

## LimitLabelAlignment

Для конфигурирования расположения лэйблов минимального и максимального значений используйте свойство  
limitLabelAlignment: Int  и константы Slider.LIMIT_LABEL_ALIGNMENT_START - расположение слева или сверху от  
полосы прогресса, Slider.LIMIT_LABEL_ALIGNMENT_CENTER - на одном уроывне с полосой прогресса,  
Slider.LIMIT_LABEL_ALIGNMENT_END - снизу или справа от полосы прогресса.  

## LabelAlignment

Для конфигурирования расположения лэйбла (заголовок и иконка) используйте свойство  
labelAlignment: Int  и константы Slider.LABEL_ALIGNMENT_TOP - расположение сверху от полосы прогресса,  
Slider.LABEL_ALIGNMENT_CENTER - на одном уроывне с полосой прогресса, Slider.LABEL_ALIGNMENT_BOTTOM -  
снизу от полосы прогресса.  

## TitleAlignment

Для конфигурирования расположения заголовка в блоке Label используйте свойство  
titleAlignment: Int  и константы Slider.TITLE_ALIGNMENT_NONE - заголовок не отображается,  
Slider.TITLE_ALIGNMENT_START - слева или сверху от иконки, Slider.TITLE_ALIGNMENT_END -  
справа или снизу от иконки.  

## Alignment

Для конфигурирования выравнивания всего контента внутри [Slider] используйте свойство  
alignment: Int  и константы Slider.ALIGNMENT_START - выравнивает весь контент к start, при этом в горизонтальной  
ориентации, при LABEL_ALIGNMENT_CENTER - Label становится на start, то есть снача Label, затем Slider.  
Slider.ALIGNMENT_END - противоположно ALIGNMENT_START. Slider.ALIGNMENT_CENTER - в вертикальной ориентации располагет
весь контент в одну линию с поолосой прогресса.
