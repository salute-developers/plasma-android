# Package com.sdds.uikit

## Spinner

Индикатор бесконечной загрузки.

```kotlin
<com.sdds.uikit.Spinner
    style="@style/Serv.Sdds.Components.Spinner.Xs.Accent"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

## Стиль Spinner

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля Spinner в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_strokeWidth|толщина линии индикатора загрузки| float, fraction, dimension|
|android:tint|окрас индикатора загрузки|color|
|sd_startColor|начальный цвет градиента индикатора загрузки|reference, color|
|sd_endColor|конечный цвет градиента индикатора загрузки|reference, color|
|sd_strokeCap|форма крааев линии индикатора загрузки|enum(round, square)|
|sd_sweepAngle|угол дуги индикатора загрузки в градусах, определяет какую часть окружности занимает индикатор|float|

Для настройки размера и отступов применяются стандартные атрибуты android (android:maxWidth, android:minHeight, android:padding)

## StrokeCap

Вид концов спиннера. Возможные значения: Round, Square
