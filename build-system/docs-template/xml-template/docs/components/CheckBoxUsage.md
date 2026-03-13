---
title: CheckBox
---

```xml
<!-- @sample: com/sdds/uikit/fixtures/CheckBox_Simple.xml -->
```

## Стиль CheckBox

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля CheckBox в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_description|дополнительный текст (описание)|string|
|sd_descriptionTextAppearance|стиль дополнительного текста|reference|
|sd_descriptionTextColor|цвет дополнительного текста|reference, color|
|sd_descriptionPadding|отступ дополнительного текста от основного|dimension|
|android:drawablePadding|отступ основного текста от toggle|dimension|
|sd_toggleState|состояние тумблер|enum ("off", "on", "indeterminate")|
|sd_toggleWidth|ширина тумблера|dimension|
|sd_toggleHeight|высота тумблера|dimension|
|sd_buttonPadding|отступ от границ toggle на layout'е до самого toggle|dimension|
|sd_buttonBoxColor|цвет бокса тумблера, согласно его состоянию|reference, color|
|sd_buttonBorderColor|цвет рамки тумблера, согласно его состоянию|reference, color|
|sd_buttonMarkColor|цвет иконки, согласно состоянию|reference, color|
|sd_toggleBorderOffset|отступ рамки тумблера от бокса, согласно состоянию|dimension|
|sd_checkedIcon / sd_indeterminateIcon|иконка в состоянии checked и indeterminate|reference|
|sd_toggleIconWidth / sd_toggleIconHeight|размеры иконок, согласно состоянию|dimension|

Если ресурсы иконок не предоставлены - используется анимированная отрисовка состояний (такое поведение предпочтительно).  
Основной текст стилизуется с помощью стандартных атрибутов android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки.  
