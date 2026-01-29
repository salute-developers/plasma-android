---
title: IconButton
---


```xml
<!-- @sample: com/sdds/uikit/fixtures/IconButton_Simple.xml -->
```

## Стиль IconButton

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля IconButton в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_icon|иконка(drawable)|reference|
|sd_iconTint|цвет drawable|reference, color|
|sd_iconPadding|отступ от иконки до текста|dimension|
|sd_iconSize|размер drawable|dimension|
|sd_iconPosition|позиция относительно текста Button|enum (textStart, textEnd)|
|sd_spinnerSize|размер спиннера, который отображается как состояние загрузки|dimension|
|sd_spinnerStrokeWidth|ширина бордера анимированного спиннера, в состоянии загрузки|dimension|
|sd_spinnerTint|цвет спиннера|reference, color|

Для использования заранее сгенерированного стиля, необходимо через атрибут style укатать стиль из библиотеки.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../../theme/ShapeAppearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../../focus).  

```xml
<!-- @sample: com/sdds/uikit/fixtures/IconButtonStyle.xml -->
```

## Индикатор загрузки

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/button/IconButton_isLoading.kt
```
