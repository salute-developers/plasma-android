---
title: RadioBox
---

```xml
<com.sdds.uikit.RadioBox
    style="@style/{{ docs-theme-prefix }}.Components.RadioBox.L"
    android:text="Label"
    app:sd_description="Description"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль RadioBox

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
Для настройки стиля RadioBox в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_description|дополнительный текст (описание)|string|
|sd_descriptionTextAppearance|стиль дополнительного текста|reference|
|sd_descriptionTextColor|цвет дополнительного текста|reference, color|
|sd_descriptionPadding|отступ дополнительного текста от основного|dimension|
|android:drawablePadding|отступ основного текста от toggle|dimension|
|sd_toggleWidth|ширина тумблера|dimension|
|sd_toggleHeight|высота тумблера|dimension|
|sd_buttonPadding|отступ от границ toggle на layout'е до самого toggle|dimension|
|sd_buttonBoxColor|цвет бокса тумблера, согласно его состоянию|reference, color|
|sd_buttonBorderColor|цвет рамки тумблера, согласно его состоянию|reference, color|
|sd_buttonMarkColor|цвет иконки, согласно состоянию|reference, color|
|sd_toggleBorderOffset|отступ рамки тумблера от бокса, согласно состоянию|dimension|
|sd_checkedIcon|иконка в состоянии checked|reference|
|sd_toggleIconWidth / sd_toggleIconHeight|размеры иконок, согласно состоянию|dimension|

Если ресурс иконки не предоставлен - используется дефолтная отрисовка состояний (такое поведение предпочтительно).  
Основной текст стилизуется с помощю стандартных атрибутов android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
