---
title: Loader
---

Компонент Loader используется для отображения статуса загрузки. Включает в себя компоненты [Spinner](SpinnerUsage.md),  
в качестве бесконечного прогресса, и [CircularProgressBar](CircularProgressBarUsage.md) - как конечный прогресс загрузки.  
Для настройки Loader используются те же параметры, что и для каждого из компонентов [Spinner] и [CircularProgressBar].  

Пример использования с помощью стиля самого Loader:

```xml
<!-- @sample: com/sdds/uikit/fixtures/Loader_Simple.xml -->
```

Пример использования через стили [Spinner] и [CircularProgressBar]:

```xml
<!-- @sample: com/sdds/uikit/fixtures/Loader_Custom_Overlays.xml -->

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
|sd_trackEnabled|бордер, по которому отрисовывается прогресс|boolean|
|sd_progressValueEnabled|включение отображения численного значения прогресса|boolean|
|sd_progressValueSuffix|суффикс(единица измерения прогресса)|string|
|sd_sweepAngle|угол дуги индикатора загрузки в градусах, определяет какую часть окружности занимает индикатор спиннера|float|
|sd_loaderType|тип отображаемого индикатора загрузки Spinner или CircularProgressBar|enum(spinner, progress)|

## LoaderType

Параметр, определяющий, какой компонент отображается в данный момент. Ожидаемое значение  
Int,  для отображения [Spinner] - Loader.SPINNER, для [CircularProgressBar] - Loader.PROGRESS

## Примечание

При использовании Loader с конструктором, принимающим value и valueSuffix, используя готовую линейку  
сгенерированных стилей, обратите внимание, что в размерах меньше Xl, параметр valueEnabled у CircularProgressBar,  
выключен.
Так же, стоит отметить, что возможно задать разные стили и размеры компонентов [Spinner] и [CircularProgressBar]  
при этом, размер самого компонента Loader примет размеры большего из дочерних компонентов.
