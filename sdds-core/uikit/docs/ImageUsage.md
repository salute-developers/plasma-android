# Package com.sdds.uikit

## Image

Компонент для отображения изображений. Поддерживает изменение формы, установку отступов только для контента (без фона),  
а также отрисовку границы. Возможна настройка фокусного состояния.

```kotlin
<com.sdds.uikit.ImageView
    style="@style/Serv.Sdds.Components.ImageView.Ratio_2_1"
    android:layout_width="200dp"
    android:layout_height="wrap_content"
    android:background="#cccfff"
    android:src="@drawable/ic_bank_card_lock_outline_16"/>
    />
```

## Стиль Image

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля Image в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_contentPadding|внутренние отступы для контента (изображения)|dimension|
|sd_contentPaddingStart|внутренний отступ контента в начале|dimension|
|sd_contentPaddingEnd|внутренний отступ контента в конце|dimension|
|sd_contentPaddingLeft|внутренний отступ контента слева|dimension|
|sd_contentPaddingTop|внутренний отступ контента сверху|dimension|
|sd_contentPaddingRight|внутренний отступ контента справа|dimension|
|sd_contentPaddingBottom|внутренний отступ контента снизу|dimension|
|sd_aspectRatio|результат отношения сторон width/height|float|
|sd_background|цвет фона |color,reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](./FocusSelectorUsage.md).  

## Примечание

Для корректного применения aspectRatio необхоимо задать либо width, либо height.  
Если заданы оба параметра aspectRatio будет проигнорирован, отдав приоритет явно заданным  
границам view.
