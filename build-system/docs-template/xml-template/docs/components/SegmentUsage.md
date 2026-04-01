---
title: Segment
---

Контент Segment формируется с помощью SegmentItem.

```xml
<!-- @sample: com/sdds/uikit/fixtures/Segment_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.segment.Segment.Simple -->

<!-- @screenshot: com.sdds.uikit.fixtures.samples.segment.item.SegmentItem.Simple -->

## Стиль Segment

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки.  
Для настройки стиля Segment в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_stretch|если ширина не wrap_content, при включении этого атрибута SegmentItem's будут распределятся равномерно, по всей ширине Segment|boolean|
|android:orientation|ориентация Segment|enum(horizontal,vertical)|

Так же доступны атрибуты LinearLayout, так как он лежит в основе Segment.
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).

## Стиль SegmentItem

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки.  
Для настройки стиля SegmentItem в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_value|дополнительный текст|string|
|sd_valuePadding|отступ между дополнительным основным и дополнительным текстом|dimension|
|sd_valueTextColor|цвет дополнительного текста|color,reference|
|sd_icon|иконка(drawable)|reference|
|sd_iconTint|цвет drawable|color|
|sd_iconPadding|отступ от иконки до текста|dimension|
|sd_contentStartSize / sd_contentEndSize|размер drawable в начале/в конце, может быть разным для одного и того же drawable|dimension|
|sd_iconPosition|позиция относительно текста SegmentItem|enum (textStart, textEnd)|
|sd_counterStyle|стиль компонента Counter|reference|
|sd_counterPadding|отступ от текста до Counter|dimension|
|sd_counterText|текст counter|string|
|sd_counterEnabled|включение отображения Counter|boolean|
|android:checkable|может ли SegmentItem быть выбранным|boolean|
|android:checked|состояние выбранного SegmentItem|boolean|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
