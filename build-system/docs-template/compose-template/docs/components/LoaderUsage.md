---
title: Loader
--- 

Компонент Loader используется для отображения статуса загрузки. Включает в себя компоненты [Spinner](SpinnerUsage.md),  
в качестве бесконечного прогресса, и [CircularProgressBar](CircularProgressBarUsage.md) - как конечный прогресс загрузки.  
Для настройки Loader используются те же параметры, что и для каждого из компонентов [Spinner] и [CircularProgressBar].  

Пример использования с помощью стиля самого Loader:

```kotlin
Loader(
    style = Loader.Default.style(),
    progress = 0.4f,
    trackEnabled = true,
    valueContent = {
        Icon(
            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
            contentDescription = "",
        )
    },
    loaderType = LoaderType.Progress,
)
```

Пример использования через стили [Spinner] и [CircularProgressBar]:

```kotlin
Loader(
    spinnerStyle = Spinner.M.Default.style()
    circularProgressStyle = CircularProgressBar.L.Positive.style()
    progress = 0.4f,
    trackEnabled = true,
    valueContent = {
        Icon(
            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
            contentDescription = "",
        )
    },
    loaderType = LoaderType.Progress,
)
```

## Стиль Loader

Для Loader существует дефолтный стиль. Также стиль можно настроить с помощью LoaderStyle.builder().

### Создание стиля с помощью builder()

```kotlin
LoaderStyle.builder()
    .spinnerStyle(Spinner.L.Default.style())
    .circularProgressStyle(CircularProgressBar.L.Default.style())
    .style()
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
