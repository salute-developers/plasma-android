# Package com.sdds.uikit

## ListItem

Компонент ListItem разработан на основе Cell, поэтому построение стиля ListItem, а так же наполнение его контентом,  
выполняется аналогично компоненту Cell.

```kotlin
<com.sdds.uikit.ListItemView
    style="@style/Serv.Sdds.Components.ListItemNormal.M"
    android:id="@+id/first"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:sd_avatarStyle="@style/Serv.Sdds.Components.Avatar.Xxl"
    app:sd_disclosureText="disclosure">

    <com.sdds.uikit.Avatar
        app:sd_name="User Name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.TextView
        android:id="@+id/firstItemLabel"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Label"
        app:layout_cellContent="label" />

    <com.sdds.uikit.TextView
        android:id="@+id/firstItemTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Title"
        app:layout_cellContent="title" />

    <com.sdds.uikit.TextView
        android:id="@+id/firstItemSubtitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Subtitle"
        app:layout_cellContent="subtitle" />

</com.sdds.uikit.ListItemView>
```

## Стиль ListItem

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля ListItem в формате xml используйте атрибуты [Cell](./CellUsage.md#стиль-cell)
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
