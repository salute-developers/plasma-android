---
title: Divider
---

```xml
<com.sdds.uikit.Divider
    style="@style/{{ docs-theme-prefix }}.Components.Divider"
    app:sd_thickness="2dp"
    android:orientation="vertical"
    android:layout_height="100dp"
    android:layout_width="wrap_content"/>
```

## Стиль Divider

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля Divider в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_thickness|толщина Divider|dimension|
|android:orientation|ориентация Divider|enum (vertical, horizontal)|
|android:backgroundTint / backgroundTint|цвет Divider|color|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
