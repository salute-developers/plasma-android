---
title: SegmentItem
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/SegmentItem_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.segment.SegmentItem_Simple -->

## Стиль SegmentItem

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/SegmentItem_Style.kt
```

## Состояния и Motion API

У всех трёх форм `SegmentItem` есть перегрузка с `motion: Motion<SegmentItemMotionStyle>`.
`rememberSegmentItemMotion()` использует переданный стиль переходов или `LocalSegmentItemMotionStyle`.
Через `SegmentItemMotionStyle` настраиваются переходы фона, текста, иконок, типографики и всех размеров/отступов.
По умолчанию используется `noMotion()`, поэтому добавление Motion само по себе не запускает анимации.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/segment/SegmentItem_Motion.kt
```

`isSelected` обновляет семантическое состояние элемента. Для pressed, hovered и focused передавайте
`motion.context.interactionSource` в модификатор взаимодействия, например `clickable`.
Встроенный Counter использует тот же контекст состояний и собственные CounterStyle/CounterMotionStyle.
У произвольного содержимого слотов общий контекст задаётся явно.
При наличии `endIcon` счётчик не отображается; null или пустой counter не создаёт слот счётчика.

### Переход со старых свойств

Старые перегрузки компонента и builder-вызовы с Color, InteractiveColor, Dp, TextStyle и формой продолжают работать.
Новые свойства для чтения: `shapes`, `labelStyles`, `valueStyles`, цвета с суффиксом `Brush`
и размеры с суффиксом `Values`, например `dimensions.endContentSizeValues`.
Размер конечной иконки определяется `endContentSize`, независимо от размера начальной иконки;
отступ `valueMargin` учитывает также selected из семантического источника.

Старые deprecated-свойства формы, размеров и типографики возвращают default-значения.
Legacy InteractiveColor сохраняет однотонные состояния; для градиентов его fallback — Color.Transparent.
Отрисовка через новые Brush-свойства поддерживает градиенты.
Форма переключается без плавной интерполяции, `disabledAlpha` остаётся обычным Float.
Собственные реализации style/builder-интерфейсов необходимо дополнить новыми контрактами.
