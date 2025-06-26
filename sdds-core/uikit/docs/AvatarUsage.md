# Package com.sdds.uikit

## Avatar

```kotlin
<com.sdds.uikit.Avatar
    style="Serv.Sdds.Components.Avatar.L"
    android:id="@+id/Avatar"
    android:layout_height="wrapContent"
    android:layout_width="wrapContent" 
    ...
    />
```

## Стиль Avatar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля Avatar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_name|если не задан ресурс изображения, инициалы можно задать с помощью этого свойства| текст (желательный формат строки - "Имя Фамилия")|
|sd_status|отображение статуса|enum (none, active, inactive)|
|sd_statusOffsetX / sd_statusOffsetY|смещение статуса по x/y|dimension, reference|
|sd_statusStyle|статусу можно задать стиль (обычно это стиль компонента Indicator)|reference|

В Avatar возможно отобразить extra (обвесы), в качестве которых пердусмотрен компонент Badge и компонент Counter

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_extraBadgeStyle|cтиль Badge|reference|
|sd_extraBadgeEnabled|отображение Badge как enabled|boolean|
|sd_extraBadgeText|текст внутри Badge|string|
|sd_extraBadgeIconStart / sd_extraBadgeIconEnd|расположение иконки внутри Badge|reference|
|sd_extraBadgePlacement|расположение Badge внутри Avatar|enum (topLeft,topRight, bottomRight, bottomLeft)|
|sd_extraCounterStyle|cтиль Counter|reference|
|sd_extraCounterEnabled|отображение Counter как enabled|boolean|
|sd_extraCounterText|текст внутри Counter (число)|string|
|sd_extraCounterPlacement|расположение Counter внутри Avatar|enum (topLeft,topRight, bottomRight, bottomLeft)|

Для настройки цвета (фона/текста), размера (ширины/высоты)  применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance)
