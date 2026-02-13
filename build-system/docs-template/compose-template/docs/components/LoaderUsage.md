---
title: Loader
---

Компонент Loader используется для отображения статуса загрузки. Включает в себя компоненты [Spinner](SpinnerUsage.md),  
в качестве бесконечного прогресса, и [CircularProgressBar](CircularProgressBarUsage.md) - как конечный прогресс загрузки.  
Для настройки Loader используются те же параметры, что и для каждого из компонентов [Spinner] и [CircularProgressBar].  

Пример использования с помощью стиля самого Loader:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/loader/Loader_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.loader.Loader_Simple -->

Пример использования через стили [Spinner] и [CircularProgressBar]:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/loader/LoaderSpinner_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.loader.LoaderSpinner_Simple -->

## Стиль Loader

Для Loader существует дефолтный стиль. Также стиль можно настроить с помощью LoaderStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/loader/Loader_Style.kt
```

## LoaderType

Параметр, определяющй, какой компонент отображается в данный момент. Ожидаемое значение  
enum LoaderType,  для отображения [Spinner] - LoaderType.Spinner, для [CircularProgressBar] - LoaderType.Progress

## Примечание

При использовании Loader с конструктором, принимающим value и valueSuffix, используя готовую линейку  
сгенерированных стилей, обратите внимание, что в размерах меньше Xl, параметр valueEnabled у CircularProgressBar,  
выключен.
Так же, стоит отметить, что возможно задать разные стили и размеры компонентов [Spinner] и [CircularProgressBar]  
при этом, размер самого компонента Loader примет размеры большего из дочерних компонентов.
