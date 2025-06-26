# Package com.sdds.uikit

## Switch

```kotlin
<com.sdds.uikit.Switch
    style="@style/Serv.Sdds.Components.Switch.L.ToggleS"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Label"
    app:sd_description="Description" />
```

## Стиль Switch

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
Для настройки стиля Switch в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_description|дополнительный текст (описание)|string|
|sd_descriptionTextAppearance|стиль дополнительного текста|reference|
|sd_descriptionTextColor|цвет дополнительного текста|color, reference|
|sd_descriptionPadding|отступ дополнительного текста от нижней границы|dimension|
|android:drawablePadding|отступ основного текста от toggle|dimension|
|sd_switchWidth|ширина неподвижной части переключателя|dimension|
|sd_switchHeight|высота неподвижной части переключателя|dimension|
|sd_switchBorderWidth|толщина бордера неподвижной части|dimension|
|sd_buttonTrackColor|цвет неподвижной части переключателя|color, reference|
|sd_buttonTrackBorderColor|цвет бордера неподвижной части переключателя|color, reference|
|sd_buttonThumbColor|цвет подвижной части переключателя|color, reference|
|sd_thumbWidth|ширина подвижной части переключателя|dimension|
|sd_thumbHeight|высота подвижной части переключателя|dimension|
|sd_thumbPadding|отступ подвижной части переключателя|dimension|
|sd_thumbShapeAppearance|форма скругления подвижной части переключателя|reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
