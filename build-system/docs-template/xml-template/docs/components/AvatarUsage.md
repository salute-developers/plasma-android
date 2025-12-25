---
title: Avatar
---

```xml
<com.sdds.uikit.Avatar
    style="@style/{{ docs-theme-prefix }}.Components.Avatar.L"
    android:id="@+id/Avatar"
    android:layout_height="wrap_content"
    android:layout_width="wrap_content" 
    />
```

## Стиль Avatar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля Avatar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_name|если не задан ресурс изображения, инициалы можно задать с помощью этого свойства| текст (желательный формат строки - "Имя Фамилия")|
|sd_status|отображение статуса|enum (none, active, inactive)|
|sd_statusOffsetX / sd_statusOffsetY|смещение статуса по x/y|dimension, reference|
|sd_statusStyle|статусу можно задать стиль (обычно это стиль компонента Indicator)|reference|

В Avatar возможно отобразить extra (обвесы), в качестве которых предусмотрен компонент Badge и компонент Counter

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_extraBadgeStyle|стиль Badge|reference|
|sd_extraBadgeEnabled|отображение Badge как enabled|boolean|
|sd_extraBadgeText|текст внутри Badge|string|
|sd_extraBadgeIconStart / sd_extraBadgeIconEnd|расположение иконки внутри Badge|reference|
|sd_extraBadgePlacement|расположение Badge внутри Avatar|enum (topLeft,topRight, bottomRight, bottomLeft)|
|sd_extraCounterStyle|стиль Counter|reference|
|sd_extraCounterEnabled|отображение Counter как enabled|boolean|
|sd_extraCounterText|текст внутри Counter (число)|string|
|sd_extraCounterPlacement|расположение Counter внутри Avatar|enum (topLeft,topRight, bottomRight, bottomLeft)|

Для настройки цвета (фона/текста), размера (ширины/высоты)  применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance)
