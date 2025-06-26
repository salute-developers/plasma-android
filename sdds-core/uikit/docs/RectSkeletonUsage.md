# Package com.sdds.uikit

## RectSkeleton

```kotlin
<com.sdds.uikit.RectSkeleton
    style="@style/Serv.Sdds.Components.RectSkeleton"
    android:layout_width="100dp"
    android:layout_height="100dp"/>
```

## Стиль RectSkeleton

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
По скольку в основе RectSkeleton лежит ShimmerLayout - атрибуты ShimmerLayout так же доступны для конфигурирования.  
Для настройки стиля RectSkeleton в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shimmer|drawable для отрисоки шиммера|reference|
|sd_shimmerDuration|время движения шиммера - скорочть анимации|integer|
|sd_autoStart|анимация запускается сама, автоматически|boolean|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
