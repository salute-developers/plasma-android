---
title: Drawer
---

`Drawer` выдвижная панель, располагаемая поверх или рядом с основным контентом.  
Следует использовать совместно с `DrawerLayout` компонентом - контейнером, предназначенным для отображения основного  
контента пользователя, поверх которого показывается `Drawer`. В компоненте `DarwerLayout` предусмотрена возможность  
использования в качестве выдвижной панели другиx view, для этого необходимо задать у этой view атрибут  
sd_drawerPlacement, указав сторону расположения панели. Пример использования `DrawerLayout` с "кастомной" панелью:  

```xml
<com.sdds.uikit.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/drawer_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:clipChildren="false"
    app:sd_focusDepended="true"
    app:sd_peakHeight="20dp"
    app:sd_shiftContent="true"
    app:sd_drawerMargin="2dp" >

    <include
        layout="@layout/..."
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <androidx.fragment.app.FragmentContainerView
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        app:sd_drawerPlacement="left" />
    
</com.sdds.uikit.DrawerLayout>
```

Пример использования `DrawerLayout` с `Drawer`:  

```xml
<com.sdds.uikit.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/drawer_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:clipChildren="false"
    app:sd_focusDepended="true"
    app:sd_peakHeight="20dp"
    app:sd_shiftContent="true"
    app:sd_drawerMargin="2dp" >

    <include
        layout="@layout/..."
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <com.sdds.uikit.Drawer
        style="@style/{{ docs-theme-prefix }}.Sdkit.StarDs.Components.Drawer.HasBackground"
        app:sd_drawerPlacement="left"
        android:layout_width="wrap_content"
        android:layout_height="match_parent" >

        <androidx.fragment.app.FragmentContainerView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            app:sd_contentPlacement="body"/>

    </com.sdds.uikit.Drawer>

</com.sdds.uikit.DrawerLayout>
```

## Стиль Drawer

Существует набор сгенерированных стилей для `Darwer`. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля `Drawer` в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shadowAppearance|ссылка на ресурс тени|reference|
|sd_background|цвет фона панели|color, reference|
|sd_closeIcon|ссылка на ресурс иконки|reference|
|sd_closeIconTint|окрас иконки|color|
|sd_closeIconHeaderPadding|отступ от иконки закрытия|dimension|
|sd_drawerCloseAlignment|выравнивание иконки закрытия|enum(end, start)|
|sd_closeIconPlacement|расположение иконки закрытия|enum(inner, outer, none)|
|sd_closeIconOffsetX|смещение иконки закрытия по оси х, при расположении снаружи|dimension|
|sd_closeIconOffsetY|смещение иконки закрытия по оси y, при расположении снаружи|dimension|
|sd_absoluteClosePlacement|расположение иконки закрытия над контентом body, позволяет достичь еффекта левитации иконки закрытия при этом скроллируемый контент в body "уходит" под иконку. Работает только когда в секции header нет контента|boolean|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance)
Компонентам, добавленным в Layout `Drawer` доступны следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_contentPlacement|расположение контента в `Drawer`|enum(header,body,footer)|

`DrawerLayout` не имеет сгененрированных стилей, для его натсройки в формате xml предусмотрены следующие атрибуты:

|  Название атрибута  |                                      Описание                                       |Формат данных|
|:-------------------:|:-----------------------------------------------------------------------------------:|:-:|
|    sd_peakHeight    |                           видимая часть выдвижной панели                            |dimension|
|   sd_drawerMargin   |                    отступ основного контента от выдвижной панели                    |dimension|
|  sd_focusDepended   |                будет ли панель двигаться при получении/потери фокуса                |boolean|
|   sd_shiftContent   |                будет ли основной контент смещаться вместе с панелью                 |boolean|
| sd_animationEnabled |                        включение анимации выдвижения панели                         |boolean|

Компонентам, добавленным в Layout `DrawerLayout` доступны следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_drawerPlacement|расположение панели на экране|enum(left, top, right, bottom)|
