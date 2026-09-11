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

## Состояния и Motion API

В перегрузки `SegmentHorizontal` и `SegmentVertical` можно передать `motion: Motion<SegmentMotionStyle>`.
`rememberSegmentMotion()` использует `LocalSegmentMotionStyle`, если стиль переходов не указан явно.
`StatefulValue` задаёт значения для состояний, а `SegmentMotionStyle` — переходы фона, отступов, gap и отступов разделителей.
По умолчанию все переходы используют `noMotion()`: значения меняются без анимации.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/Segment_Motion.kt
```

Для передачи взаимодействий используйте `motion.context.interactionSource` также в `clickable`.
Семантические состояния задаются через `motion.context.semanticStateSource`.
Контейнер не объединяет автоматически состояния своих `SegmentItem`: у каждого элемента остаётся собственный контекст.
`hasBackground = false` отключает фон, сохраняя изменение размеров по состояниям.
Неопределённый gap отображается как нулевой; размеры с неопределёнными значениями переключаются без интерполяции.

### Переход со старых свойств

Существующие вызовы компонентов и builder-ов со статическими значениями сохраняются.
Для чтения текущих значений используйте stateful-свойства `shapes`, `colors.backgroundBrush`
и размерные свойства с суффиксом `Values`, например `dimensions.gapValues`.
Старые свойства помечены deprecated: размеры и форма возвращают default-значение,
а цветовое представление сохраняет однотонные состояния. Для градиентов старый Color API возвращает прозрачный цвет;
для отображения градиентов используйте `backgroundBrush`.
Форма переключается по состоянию без плавной анимации. Собственные реализации style/builder-интерфейсов
необходимо дополнить новыми контрактами.
