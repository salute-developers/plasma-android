---
title: Indicator
---

```xml
<com.sdds.uikit.Indicator
    style="@style/{{ docs-theme-prefix }}.Components.Indicator.L"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль Indicator

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать  
стиль из библиотеки (пример выше).  
Для настройки стиля Indicator в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:maxHeight / android:maxWidth|размеры Indicator|dimension|
|android:backgroundTint / backgroundTint|цвет фона|color|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
