---
title: Button
---


```xml
<!-- @sample: com/sdds/uikit/fixtures/BasicButton_Simple.xml -->
```

## Стиль Button

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля Button в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_value|дополнительный текст|string|
|sd_valuePadding|отступ между дополнительным основным и дополнительным текстом|dimension|
|sd_valueTextColor|цвет дополнительного текста|reference, color|
|sd_icon|иконка(drawable)|reference|
|sd_iconTint|цвет drawable|reference, color|
|sd_iconPadding|отступ от иконки до текста|dimension|
|sd_iconSize|размер drawable|dimension|
|sd_iconPosition|позиция относительно текста Button|enum (textStart, textEnd)|
|sd_spinnerSize|размер спиннера, который отображается как состояние загрузки|dimension|
|sd_spinnerStrokeWidth|ширина бордера анимированного спиннера, в состоянии загрузки|dimension|
|sd_spinnerTint|цвет спиннера|reference, color|
|sd_spacing|расположение контента, может быть packed (контент центрирован, лишние отступы располагаются по краям) или spaceBetween (контент отобразится по всей ширине, отступы будут добавлены между элементами контента)|enum(packed, spaceBetween)|

Для задания лэйбла (основного текста внутри Button), а так же конфигурирования стиля и цвета текста - используйте  
стандартные атрибуты android(android:text, android:textAppearance, android:textColor).  
Для использования заранее сгенерированного стиля, необходимо через атрибут style укатать стиль из библиотеки.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../../theme/ShapeAppearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../../focus).  

```xml
<!-- @sample: com/sdds/uikit/fixtures/ButtonStyle.xml -->
```

## Расположение контента внутри Button

Расположение контента задается при помощи параметра sd_spacing.
Может быть Packed (контент центрирован, лишние оступы располагаются по краям):

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/button/BasicButton_LabelValue_Packed.kt
```

или SpaceBetween (Контент отобразится по всей ширине, отступы будут добавлены между элементами контента):
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/button/BasicButton_LabelValue_SpaceBetween.kt
```

## Индикатор загрузки

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/button/BasicButton_isLoading.kt
```

