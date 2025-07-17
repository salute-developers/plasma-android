---
title: Card
---


Визуальный контейнер, который объединяет различные элементы, такие как изображения, текст и кнопки, в единый блок.  
Настройка размера осуществляется явным образом или в зависимости от содержимого.  
Компонент Card является базовым контейнером. CardContent используется для вложенного контента внутри Card, имеет свою форму.

```xml
<com.sdds.uikit.Card
    style="@style/{{ docs-theme-prefix }}.Components.CardSolid.M"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    app:sd_alignment="center"
    app:sd_arrangement="center"
    app:sd_crossAxisGap="20dp"
    app:sd_itemsPerLine="1">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello" />

    <com.sdds.uikit.Button
        style="@style/{{ docs-theme-prefix }}.Components.BasicButton.Xs"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label"
        app:sd_value="Value" />

    <com.sdds.uikit.CardContent
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <DatePicker
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </com.sdds.uikit.CardContent>
</com.sdds.uikit.Card>
```

## Стиль Card

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Компонент Card разработан на основе Flow, поэтому атрибуты [FlowLayout](FlowUsage.md#настройка-flow) доступны для использования
Для настройки размера и паддингов Card используйте стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../focus).  

## Стиль CardContent

Для настройки контейнера CardContent используйте атрибуты AndroidConstraintLayout.
