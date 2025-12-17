---
title: Slider
---
Компонент Slider - применяется для выбора значения (value) из заданного диапозона.  
Представляет собой контейнер для отображения полосы прогресса с ползунком, совместно с Label - блоком, включающим  
в себя заголовок (title) и контент (labelContent), с возможностью конфигурирования расположения этих блоков.  
Для отображения выбранного значения используется компонент [ToolTip](TooltipUsage.md).

В качестве `labelContent` ожидает иконку / изображение / произвольный контент.

### Пример использования в коде
```kotlin
Slider(
    modifier = Modifier,
    value = 0f,
    title = "Title",
    labelContent = {
        Icon(
            painter = painterResource(R.drawable.ic_salute_outline_36),
            contentDescription = null,
        )
    },
    style = SliderHorizontalLabelInner.L.Default.style(),
    onValueChange = {},
    labelEnabled = true,
    thumbEnabled = true,
    limitLabelEnabled = true,
    slideDirection = SlideDirection.Normal,
    valueRange = 0f..1f,
    valueFormatTransformer = { progress ->
        val totalSeconds = progress.toInt()
        val minutes = totalSeconds / 60
        val seconds = totalSeconds % 60
        "%02d:%02d".format(minutes, seconds)
    },
    alignment = SliderAlignment.Start,
)
```

## Стиль Slider

Стиль Slider можно настроить с помощью SliderStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
SliderStyle.builder()
    .colors {
        thumbColor(Color.White)
        trackColor(Color.LightGray)
        iconColor(Color.Black)
        titleColor(Color.Black)
        limitLabelColor(Color.Black)
        indicatorColor(Color.Green)
        thumbStrokeColor(SolidColor(Color.Red)),
    }
    .dimensions {
        trackThickness(4.0.dp)
        indicatorThickness(4.0.dp)
        thumbStrokeWidth(1.0.dp)
        thumbSize(20.0.dp)
        iconSize(24.0.dp)
        labelMargin(14.0.dp)
        limitLabelMargin(12.0.dp)
        titleMargin(4.0.dp)
    }
    .tooltipStyle(Tooltip.S.style())
    .orientation(SliderOrientation.Horizontal)
    .titleAlignment(TitleAlignment.End)
    .labelAlignment(LabelAlignment.Center)
    .slideDirection(SlideDirection.Normal)
    .valuePlacement(ValuePlacement.Top)
    .shape(CircleShape)
    .indicatorShape(CircleShape)
    .thumbShape(CircleShape)
    .titleStyle({{ docs-theme-codeReference }}.typography.bodyMNormal)
    .limitLabelStyle({{ docs-theme-codeReference }}.typography.bodySNormal)
    .alignment(SliderAlignment.Start)
    .limitLabelAlignment(LimitLabelAlignment.End)
    .style()
```

## Взаимодействие со Slider

Ползунок Slider поддерживает drag, для изменения значения нажмите на ползунок и потяните в нужную сторону, так же  
имеется возможность моментальной установки значения нажатием на произвольное место в области трэка, если при этом не  
отпускать  палец то нажатие переходит в режим drag и вы можете продолжить перетаскивать его.

## onValueChange

Для установки колбэка на изменение выбранного значения, используйте `onValueChange: ((Float) -> Unit)`.  
Значение прогресса находится в заданном диапазоне valueRange.  

Для конфигурирования формата вывода установленного значения используйте  
ValueFormatTransformer `{ progress: Float -> }`. Здесь прогресс возвращается в диапазоне valueRange.  
Пример конфигурирования для перевода значения в формате минуты:секунды

```kotlin
valueFormatTransformer = { progress: Float ->
    val totalSeconds = progress.toInt()
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    "%02d:%02d".format(minutes, seconds)
}
```

При таком конфигурировании изменится формат вывода установленного значения, а так же отображение значений в лэйблах  
минимального и максимального значений прогресса.

## LimitLabelAlignment

Для конфигурирования расположения лэйблов минимального и максимального значений в билдере стиля используйте  
enum LimitLabelAlignment: Start - расположение слева или сверху от полосы прогресса,  
Center - на одном уровне с полосой прогресса,  End - снизу или справа от полосы прогресса.  

## LabelAlignment

Для конфигурирования расположения лэйбла (заголовок и иконка) в билдере стиля используйте 
enum LabelAlignment: Top - расположение сверху от полосы прогресса,  
Center - на одном уроывне с полосой прогресса, Bottom - снизу от полосы прогресса.  

## TitleAlignment

Для конфигурирования расположения заголовка в блоке Label в билдере стиля используйте  
enum TitleAlignment:  None - заголовок не отображается,  
Start - слева или сверху от иконки, End -  справа или снизу от иконки.  

## SliderAlignment

Для конфигурирования выравнивания всего контента внутри [Slider] в билдере стиля или как парметр функции используйте  
SliderAlignment:  Start - выравнивает весь контент к start, при этом в горизонтальной  
ориентации, при LabelAlignment.Center - Label становится на start, то есть снача Label, затем Slider.  
End - противоположно Start. Center - в вертикальной ориентации располагет весь контент в одну линию с  
полосой прогресса.

## SlideDirection

Для изменения направления slide в билдере стиля или как парметр функции используйте enum SlideDirection.
Normal - slide происходит в нормальном режиме (увеличение значения от start к end, либо от bottom к top).  
Reversed - противоположное направление.