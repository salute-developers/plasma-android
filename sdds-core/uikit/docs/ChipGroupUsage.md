# Package com.sdds.uikit

## ChipGroup

Контент ChipGroup формируется с помощью [Chip](./ChipUsage.md#chip).

```kotlin
 <com.sdds.uikit.ChipGroup
    style="@style/Serv.Sdds.Components.ChipGroupWide.L.Accent"
    app:sd_gap="10dp"
    app:sd_lineSpacing="20dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.sdds.uikit.Chip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawableStart="@drawable/ic_arrow_down_16"
        android:text="Chip" />

    <com.sdds.uikit.Chip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawableStart="@drawable/ic_arrow_down_16"
        android:text="Chip" />
</com.sdds.uikit.ChipGroup>
```

## Стиль ChipGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля ChipGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_gap|отступ между чипами|dimension|
|sd_lineSpacing|Отступ между строками при переносе Chip на следующую строку|dimension|
|sd_chipStyleOverlay|стиль Chip в группе|reference|
|android:gravity|расположение Chip в группе, если параметры layout у ChipGroup не wrapContent|enum|
