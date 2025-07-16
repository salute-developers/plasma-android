# Package com.sdds.compose.uikit

## Segment

Компонент Segment - контейнер для отображения  SegmentItem.
Контент Segment формируется с помощью функции segmentItem() из скоупа SegmentScope,

```kotlin
SegmentHorizontal(
    stretch = false,
    hasBackground = true,
    style = Segment.Xl.Primary.style(),
) {
    segmentItem {
        SegmentItem(
            isSelected = true,
            style = SegmentItem.Xl.Primary.style(),
            label = "Label",
            value = "Value",
            startIcon =  painterResource(id = R.drawable.ic_scribble_diagonal_24),
            counter = "55",
            enabled = true
        )
    }
}
```

## Стиль Segment

Стиль Segment можно настроить с помощью SegmentStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
SegmentStyle.builder()
    .segmentItemStyle(SegmentItem.Xl.Accent.style())
    .colors {
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
        )
    }
    .shape(SddsServTheme.shapes.roundXl.adjustBy(all = -2.0.dp))
    .dimensions {
        paddingStart(2.0.dp)
        paddingEnd(2.0.dp)
        paddingTop(2.0.dp)
        paddingBottom(2.0.dp)
    }
    .sttyle()
```

## Ориентация Segment

Для горизонтальной ориентации используйте SegmentHorizontal, для вертикальной - SegmentVertical

## Background Segment

Для включения/отключения background, нужно установить параметр hasBackground в true/false

```kotlin
SegmentHorizontal(
    stretch = false,
    hasBackground = false,
    style = Segment.Xl.Primary.style(),
) {...}
```
