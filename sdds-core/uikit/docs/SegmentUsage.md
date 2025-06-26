# Package com.sdds.uikit

## Segment

Контент Segment формируется с помощью [SegmentItem](./SegmentItemUsage.md#segmentitem).

```kotlin
 <com.sdds.uikit.Segment
    style="@style/Serv.Sdds.Components.Segment.Xl.Primary"
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
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
Для настройки стиля Segment в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_stretch|если ширина не wrap_content, при включении этого атрибута SegmentItem's будут распределятся равномерно, по всей ширине Segment|boolean|
|android:orientation|ориентация Segment|enum(horizontal,vertical)|

Так же доступны атрибуты LinearLayout, так как он лежит в основе Segment.
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
