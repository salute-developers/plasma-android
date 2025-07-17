---
title: Button
---


```xml
 <com.sdds.uikit.Button
    android:text="Label"
    app:sd_value="Value"
    android:background="#cccc"
    app:sd_valuePadding="10dp"
    app:sd_icon="@drawable/ic_arrow_down_16"
    app:sd_iconSize="32dp"
    app:sd_iconPadding="10dp"
    android:paddingStart="10dp"
    android:paddingEnd="10dp"
    app:sd_spacing="spaceBetween"
    android:layout_width="200dp"
    android:layout_height="wrap_content" />
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
|sd_spacing|расположение контента, может быть packed (контент центрирован, лишние оступы располагаются по краям) или spaceBetween (контент отобразится по всей ширине, отступы будут добавлены между элементами контента)|enum(packed, spaceBetween)|

Для задания лэйбла (основного текста внутри Button), а так же конфигурирования стиля и цвета текста - используйте  
стандартные атрибуты android(android:text, android:textAppearance, android:textColor).  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](../focus).  

```xml
<com.sdds.uikit.Button
    style="@style/{{ docs-theme-prefix }}.Components.BasicButton.Xl"
    android:text="LabeL"
    app:sd_value="Value"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

## Стиль IconButton

IconButton - кнопка, которая умеет отображать только иконку или индикатор загрузки.  
Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля IconButton в формате xml предусмотрены те же атрибуты, что у Button,  
за исключением атрибутов связанных с установкой основного и дополнительного текста.

```xml
<com.sdds.uikit.IconButton
    style="@style/{{ docs-theme-prefix }}.Components.IconButton.M.Negative"
    app:sd_icon="@drawable/ic_arrow_down_16"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль LinkButton

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
LinkButton и Button отличаются тем, что в сгенерированных стилях у LinkButton прозрачный фон.  
Для настройки стиля LinkButton в формате xml предусмотрены те же атрибуты, что у Button,  

```xml
<com.sdds.uikit.LinkButton
    style="@style/{{ docs-theme-prefix }}.Components.LinkButton.M.Negative"
    android:text="Label"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```
