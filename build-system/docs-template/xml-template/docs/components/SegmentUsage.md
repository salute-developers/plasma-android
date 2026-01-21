---
title: Segment
---

Контент Segment формируется с помощью SegmentItem.

```xml
 <com.sdds.uikit.Segment
    style="@style/{{ docs-theme-prefix }}.Components.Segment.Xl.Primary"
    android:orientation="vertical"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.sdds.uikit.SegmentItem
        android:text="Label"
        app:sd_value="Value"
        app:sd_icon="@drawable/ic_arrow_down_16"
        android:checked="true"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <com.sdds.uikit.SegmentItem
        android:text="Label"
        app:sd_value="Value"
        app:sd_counterEnabled="true"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

  </com.sdds.uikit.Segment>
```

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
