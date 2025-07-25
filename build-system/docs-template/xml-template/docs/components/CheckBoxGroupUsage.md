---
title: CheckBoxGroup
---

Контент CheckBoxGroup формируется с помощью [CheckBox](CheckBoxUsage.md#checkbox).

```xml
 <com.sdds.uikit.CheckBoxGroup
    app:sd_itemOffset="20dp"
    app:sd_itemSpacing="20dp"
    app:sd_hasMain="true"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

        <com.sdds.uikit.CheckBox
            android:text="Label"
            app:sd_description="Description"
            app:sd_descriptionTextColor="#f1f1"
            app:sd_descriptionPadding="5dp"
            android:drawablePadding="10dp"
            app:sd_buttonPadding="2dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>

        <com.sdds.uikit.CheckBox
            android:text="Label"
            app:sd_description="Description"
            app:sd_descriptionTextColor="#f1f1"
            app:sd_descriptionPadding="5dp"
            android:drawablePadding="10dp"
            app:sd_buttonPadding="2dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>
        
        <com.sdds.uikit.CheckBox
            android:text="Label"
            app:sd_description="Description"
            app:sd_descriptionTextColor="#f1f1"
            app:sd_descriptionPadding="5dp"
            android:drawablePadding="10dp"
            app:sd_buttonPadding="2dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>
        
</com.sdds.uikit.CheckBoxGroup>
```

## Стиль CheckBoxGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля CheckBoxGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_hasMain|с помощью этого атрибута первый CheckBox в группе становится главным. Это значит, что он управляет состоянием checked всех CheckBox'ов, у самого RootCheckBox при этом появляется состояние Indeterminate - когда один из CheckBox'ов в группе не checked, а остальные checked|boolean|
|sd_itemOffset|отступ главного CheckBox от остальных|dimension|
|sd_itemSpacing|отступ между всеми CheckBox в группе|dimension|
|sd_checkBoxStyleOverlay|стиль CheckBox, которые находятся в группе|reference|
