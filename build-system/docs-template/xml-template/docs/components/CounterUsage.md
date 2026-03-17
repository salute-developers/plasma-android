---
title: Counter
---

```xml
<!-- @sample: com/sdds/uikit/fixtures/Counter_Simple.xml -->
```

## Стиль Counter

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать  
стиль из библиотеки (пример выше).  
Для настройки стиля Counter в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:text|текст Counter|string|
|android:textAppearance|стиль текста|reference|
|android:textColor|цвет текста|reference,color|
|android:backgroundTint|цвет фона|color|

Для задания отступов, а так же размера компонента - используйте стандартные атрибуты  
android (paddings, minHeight, maxWidth и другие).  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
