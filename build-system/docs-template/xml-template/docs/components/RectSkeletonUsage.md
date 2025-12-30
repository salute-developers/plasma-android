---
title: RectSkeleton
---

```xml
<com.sdds.uikit.RectSkeleton
    style="@style/{{ docs-theme-prefix }}.Components.RectSkeleton"
    android:layout_width="100dp"
    android:layout_height="100dp"/>
```

## Стиль RectSkeleton

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
По скольку в основе RectSkeleton лежит ShimmerLayout - атрибуты ShimmerLayout так же доступны для конфигурирования.  
Для настройки стиля RectSkeleton в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shimmer|drawable для отрисовки шиммера|reference|
|sd_shimmerDuration|время движения шиммера - скорость анимации|integer|
|sd_autoStart|анимация запускается сама, автоматически|boolean|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
