# Package com.sdds.uikit

## SegmentItem

```kotlin
 <com.sdds.uikit.SegmentItem
    style="@style/Serv.Sdds.Components.SegmentItem.L.Primary"
    android:text="label"
    app:sd_value="value"
    app:sd_counterEnabled="true"
    app:sd_counterText="123"
    app:sd_iconPosition="textStart"
    android:checked="true"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль SegmentItem

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
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

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
