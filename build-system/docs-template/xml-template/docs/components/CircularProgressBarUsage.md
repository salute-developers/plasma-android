---
title: CircularProgressBar
---

```xml
<com.sdds.uikit.CircularProgressBar
    style="@style/{{ docs-theme-prefix }}.Components.CircularProgressBar.L.Gradient"
    app:sd_progress="0.8"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль CircularProgressBar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля CircularProgressBar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_progress|текущий прогресс|float|
|sd_maxProgress|максимальный прогресс(это значение будет означать 100%)|float|
|sd_minProgress|минимальный прогресс|float|
|sd_trackEnabled|бордер, по которому отрисовывается прогресс|boolean|
|sd_trackColor|цвет бордера|color, reference|
|sd_trackThickness|толщина бордера|dimension, reference|
|sd_progressColor|цвет прогресса|color, reference|
|sd_progressThickness|толщина линии прогресса|dimension, reference|
|sd_progressValueEnabled|включение отображения численного значения прогресса|boolean|
|sd_progressValueSuffix|единицы измерения прогресса (по умолчанию в процентах)|string|
|sd_progressValueAppearance|стиль текста численного значения прогресса|reference|
|sd_progressValueColor|цвет текста численного значения прогресса|color, reference|
|sd_progressValueSuffixColor|цвет текста единиц измерения прогресса|color, reference|
