---
title: Cell
---


Компонент CellLayout (a.k.a Cell) позволяет компоновать дочерние View согласно заданным им ролей CellContent при помощи
атрибута R.styleable.CellLayout_Layout_layout_cellContent. Контент в центре CellLayout может представлять из себя  
столбец содержащий три разных текста, стилизованных по-своему (label, title, subtitle)

```xml
<com.sdds.uikit.CellLayout
    style="@style/{{ docs-theme-prefix }}.Components.Cell.L"
    android:id="@+id/cell"
    android:focusable="true"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:gravity="center_vertical"
    android:padding="2dp">

    <com.sdds.uikit.Avatar
        android:id="@+id/componentCellStartAvatar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:sd_name="User" />

    <com.sdds.uikit.Switch
        android:id="@+id/componentCellStartSwitch"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawablePadding="0dp" />

    <com.sdds.uikit.TextView
        android:id="@+id/componentCellLabel"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Label"
        app:layout_cellContent="label" />

    <com.sdds.uikit.TextView
        android:id="@+id/componentCellTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Title"
        app:layout_cellContent="title" />

    <com.sdds.uikit.TextView
        android:id="@+id/componentCellSubtitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Subtitle"
        app:layout_cellContent="subtitle" />

    <com.sdds.uikit.Avatar
        android:id="@+id/componentCellEndAvatar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:sd_name="User"
        app:layout_cellContent="end"/>

    <com.sdds.uikit.Switch
        android:id="@+id/componentCellEndSwitch"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawablePadding="0dp"
        app:layout_cellContent="end" />
</com.sdds.uikit.CellLayout>
```

## Стиль Cell

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля Cell в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_contentStartPadding / sd_contentEndPadding|Отступ между контентом в начале/конце и контентом в середине|number|
|sd_labelAppearance|стиль текста Label|reference|
|sd_labelColor|цвет текста Label|reference,color|
|sd_titleAppearance|стиль текста Title|reference|
|sd_titleColor|цвет текста Title|reference,color|
|sd_subtitleAppearance|стиль текста Subtitle|reference|
|sd_subtitleColor|цвет текста Subtitle|reference,color|

В конце CellLayout можно отобразить drawable(иконку) disclosureIcon и disclosureText(описание), которые  
так же можно стилизовать по-своему.

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_disclosureTextAppearance|стиль текста|reference|
|sd_disclosureIcon|drawable(иконка)|reference|
|sd_disclosureColor / sd_disclosureTextColor|если не задан sd_disclosureTextColor то цвет текста и drawable будет определен атрибутом sd_disclosureColor|reference,color|

Предполагается, что в качестве контента используются компоненты [Avatar](AvatarUsage.md#avatar), [CheckBox](CheckBoxUsage.md#checkbox), [RadioBox](RadioBoxUsage.md#radiobox), [IconButton](ButtonUsage.md), [Switch](SwitchUsage.md#switch).  
Если в CellLayout не используется сгенерированный стиль (который определяет стили контента в начале и в конце),  
то возможно задать стили контента самостоятельно при помощи следующих атрибутов

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_avatarStyle|стиль Avatar|reference|
|sd_iconButtonStyle|стиль IconButton|reference|
|android:checkboxStyle|стиль CheckBox|reference|
|sd_switchStyle|стиль Switch|reference|
|android:radioButtonStyle|стиль RadioBox|reference|

Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../focus).  
