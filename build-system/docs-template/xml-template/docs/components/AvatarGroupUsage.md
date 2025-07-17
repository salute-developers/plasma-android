---
title: AvatarGroup
---

Контент AvatarGroup формируется с помощью [Avatar](AvatarUsage.md#avatar).

```xml

<com.sdds.uikit.AvatarGroup 
    style="@style/{{ docs-theme-prefix }}.Components.AvatarGroup.S"
    android:layout_height="wrap_content" 
    android:layout_width="wrap_content" 
    app:sd_itemOffset="10dp"
    app:sd_itemSpacing="2dp">

    <com.sdds.uikit.Avatar 
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        app:sd_name="User Name" />

    <com.sdds.uikit.Avatar 
        android:layout_height="wrap_content" 
        android:layout_width="wrap_content"
        app:sd_name="User Name" />

    <com.sdds.uikit.Avatar 
        android:layout_height="wrap_content" 
        android:layout_width="wrap_content"
        app:sd_name="User Name" />
</com.sdds.uikit.AvatarGroup>
```

## Стиль AvatarGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля Avatar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_avatarStyleOverlay|стиль Avatar, которые будут в группе|reference|
|sd_itemOffset|смещение Avatar относительно друг друга|dimension|
|sd_itemSpacing|расстояние между Avatar, влияет на толщину выреза аватара|dimension|
