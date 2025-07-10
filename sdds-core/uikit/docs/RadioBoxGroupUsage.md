# Package com.sdds.uikit

## RadioBoxGroup

Контент RadioBoxGroup формируется с помощью [RadioBox](./RadioBoxUsage.md#radiobox).

```kotlin
<com.sdds.uikit.RadioBoxGroup
    style="@style/Serv.Sdds.Components.RadioBoxGroup.S"
    app:sd_itemSpacing="10dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.sdds.uikit.RadioBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label"
        app:sd_description="Description" />

    <com.sdds.uikit.RadioBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label"
        app:sd_description="Description" />

    <com.sdds.uikit.RadioBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label"
        app:sd_description="Description" />
</com.sdds.uikit.RadioBoxGroup>
```

## Стиль RadioBoxGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля RadioBoxGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_itemSpacing|отступ между всеми RadioBox в группе|dimension|
|sd_radioBoxStyleOverlay|стиль RadioBox, которые находятся в группе|reference|
