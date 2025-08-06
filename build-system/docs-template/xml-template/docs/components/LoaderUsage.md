---
title: Loader
--- 

Компонент Loader используется для отображения статуса загрузки. Включает в себя компоненты [Spinner](SpinnerUsage.md),  
в качестве бесконечного прогресса, и [CircularProgressBar](CircularProgressBarUsage.md) - как конечный прогресс загрузки.  
Для настройки Loader используются те же параметры, что и для каждого из компонентов [Spinner] и [CircularProgressBar].  

Пример использования с помощью стиля самого Loader:

```xml
<com.sdds.uikit.Loader
    style="@style/Serv.Sdds.ComponentOverlays.Loader"
    app:sd_loaderType="progress"
    app:sd_progress="0.9"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    />
```

Пример использования через стили [Spinner] и [CircularProgressBar]:

```xml
<com.sdds.uikit.Loader
    app:sd_circularProgressBarStyleOverlay="@style/Serv.Sdds.ComponentOverlays.CircularProgressBarXlAccent"
    app:sd_spinnerStyleOverlay="@style/Serv.Sdds.ComponentOverlays.SpinnerLNegative"
    app:sd_loaderType="spinner"
    app:sd_progress="0.9"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    />
```

## Стиль Loader

Для Loader существует дефолтный стиль. Также стиль можно настроить, указав отдельные стили для [Spinner] и  
[CircularProgressBar].

Для настройки стиля Loader в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_spinnerStyleOverlay|оверлэй стиль компонента Spinner|reference|
|sd_circularProgressBarStyleOverlay|оверлэй стиль компонента CircularProgressBar|reference|
|sd_progress|текущий прогресс|float|
|sd_maxProgress|максимальный прогресс(это значение будет означать 100%)|float|
|sd_minProgress|минимальный прогресс|float|
|sd_trackEnabled|бордер, по которому отрисовывется прогресс|boolean|
|sd_progressValueEnabled|включение отображения численного значения прогресса|boolean|
|sd_progressValueSuffix|суффикс(единца измерения прогресса)|string|
|sd_sweepAngle|угол дуги индикатора загрузки в градусах, определяет какую часть окружности занимает индикатор спиннера|float|
|sd_loaderType|тип отображаемого индикатора загрузки Spinner или CircularProgressBar|enum(spinner, progress)|

## LoaderType

Параметр, определяющй, какой компонент отображается в данный момент. Ожидаемое значение  
Int,  для отображения [Spinner] - Loader.SPINNER, для [CircularProgressBar] - Loader.PROGRESS

## Примечание

При использовании Loader с конструктором, принимающим value и valueSuffix, используя готовую линейку  
сгенерированных стилей, обратите внимание, что в размерах меньше Xl, параметр valueEnabled у CircularProgressBar,  
выключен.
Так же, стоит отметить, что возможно задать разные стили и размеры компонентов [Spinner] и [CircularProgressBar]  
при этом, размер самого компонента Loader примет размеры большего из дочерних компонентов.
