---
title: ButtonGroup
---

Контент ButtonGroup формируется с помощью [Button](Button/ButtonUsage.md).

```xml
<com.sdds.uikit.ButtonGroup
    style="@style/{{ docs-theme-prefix }}.Components.BasicButtonGroup.L.Wide.Segmented"
    android:orientation="vertical"
    android:layout_gravity="center"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" >

    <com.sdds.uikit.Button
        app:sd_value="text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.Button
        app:sd_value="text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.Button
        app:sd_value="text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</com.sdds.uikit.ButtonGroup>
```

Или с помощью [IconButton](Button/ButtonUsage.md).

```xml
<com.sdds.uikit.ButtonGroup
    style="@style/{{ docs-theme-prefix }}.Components.IconButtonGroup.L.Wide.Segmented"
    android:orientation="vertical"
    android:layout_gravity="center"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" >

    <com.sdds.uikit.IconButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.IconButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.IconButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</com.sdds.uikit.ButtonGroup>
```

## Стиль ButtonGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля ButtonGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_buttonStyleOverlay|оверлэй стиль кнопки|reference|
|sd_externalShapeAppearance|форма скруглений наружных углов у крайних элементов группы|reference|
|sd_internalShapeAppearance|форма скруглений углов элементов группы |reference|
|sd_buttonSpacing|отступ между элементами внутри группы|dimension|
