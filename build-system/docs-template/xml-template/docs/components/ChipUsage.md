---
title: Chip
---

```xml
<com.sdds.uikit.Chip
    style="@style/{{ docs-theme-prefix }}.Components.Chip.L.Negative"
    android:text="Chip"
    android:drawableStart="@drawable/ic_arrow_down_16"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль Chip

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля Chip в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:drawableStart / android:drawableEnd|иконка в начале/ в конце|reference|
|sd_drawableStartTint / sd_drawableEndTint|цвет иконки в начале/ в конце|color|
|sd_contentStartSize / sd_contentEndSize|размер иконки в начале/ в конце|dimension|
|sd_textPaddingStart / sd_textPaddingEnd|отступы от текста в начале/ вконце|dimension|

Для задания лэйбла (текста внутри Chip), а так же конфигурирования стиля и цвета текста - используйте  
стандартные атрибуты android(android:text, android:textAppearance, android:textColor).  
Для изменения цвета фона, а так же задания отступов(paddings), размера Chip - так же используйте  
стандартные атрибуты android. Для поддержки состояния кликабельности используйте атрибут  
android:checkable, для включения/выкдючения android:checked.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../focus).  
