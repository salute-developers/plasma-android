---
title: Editable
---

Редактируемое текстовое поле с возможностью установки drawable ресурса.
В качестве ресурса ожидается иконка, drawable возможно установить в конце Editable с несколькими режимами отображения -  
[relative](#icon-placement-relative) и [absolute](#icon-placement-absolute)

```xml
<!-- @sample: com/sdds/uikit/fixtures/Editable_Simple.xml -->
```

## Стиль Editable

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля Editable в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_icon|иконка(drawable ресурс)|reference|
|sd_iconTint|цвет drawable|reference, color|
|sd_iconMargin|отступ от иконки до текста|dimension|
|sd_iconSize|размер drawable|dimension|
|sd_valueColor|цвет текста|reference, color|
|sd_valueAppearance|стиль текста|reference|
|sd_cursorColor|цвет курсора|reference, color|
|sd_editableIconPlacement|позиция относительно текста Button|enum (absolute, relative)|

Так как Editable наследник AppCompatEditText - для конфигурирования доступны все
стандартные атрибуты AppCompatEditText.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style укатать стиль из библиотеки.  

```xml
<!-- @sample: com/sdds/uikit/fixtures/EditableStyle.xml -->
```

## Icon placement Relative

Режим расположения иконки(drawable), при котором размеры Editable учитывают ее размер. Drawable находится в 
границах компонента.

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/editable/Editable_SingleLine_Icon_Relative.kt
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.editable.Editable.SingleLine.Icon.Relative -->

## Icon placement Absolute

Режим расположения иконки(drawable), при котором размеры Editable не учитывают ее размер. Drawable находится вне 
границ компонента, тем самым при центрировании Editable в каком либо ViewGroup будет учитываться только ширина 
текстового поля. Так как drawable рисуется за пределами компонента Editable у родительского контейнера (ViewGroup)  
должно быть установлено `clipChildren = false`

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/editable/Editable_MultiLine_Icon_Absolute.kt
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.editable.Editable.MultiLine.Icon.Absolute -->

## Icon size 

Если размер иконки (drawable) не задан явно, будет применен intrinsic размер этого drawable.