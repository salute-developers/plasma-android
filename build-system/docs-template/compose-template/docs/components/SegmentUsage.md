---
title: Segment
---

Компонент Segment - контейнер для отображения  SegmentItem.
Контент Segment формируется с помощью функции segmentItem() из скоупа SegmentScope,

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/Segment_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.segment.Segment_Simple -->

## Стиль Segment

Стиль Segment можно настроить с помощью SegmentStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/Segment_Style.kt
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
