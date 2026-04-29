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

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

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
    ...
    hasBackground = false,
) {...}
```

## Segment с Divider

Чтобы добавить разделители между `SegmentItem`, используйте слот `divider { ... }` внутри `SegmentHorizontal/SegmentVertical`.
Обычно divider добавляется **между** элементами, поэтому удобно делать это в цикле и проверять индекс, но 
можно использовать и свою логику

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/Segment_Dividers.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.segment.Segment_Dividers -->
