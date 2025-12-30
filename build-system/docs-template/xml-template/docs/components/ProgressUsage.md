---
title: ProgressBar
---

```xml
<com.sdds.uikit.ProgressBar
    style="@style/{{ docs-theme-prefix }}.Components.ProgressBar.Accent"
    android:maxHeight="10dp"
    app:sd_progress="0.5"
    app:sd_trackHeight="2dp"
    android:layout_width="200dp"
    android:layout_height="wrap_content"/>
```

## Стиль ProgressBar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля ProgressBar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_progress|текущий прогресс|float|
|sd_maxProgress|максимальный прогресс(это значение будет означать 100%)|float|
|sd_minProgress|минимальный прогресс|float|
|android:minHeight / android:maxHeight|высота компонента ProgressBar|dimension|
|app:backgroundTint|цвет бордера|color|
|android:background|цвет бордера если используется drawable (градиент)|reference|
|sd_trackHeight|толщина бордера|dimension|
|sd_progressColor|цвет прогресса|color,reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
