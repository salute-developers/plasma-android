---
title: ScrollBar
---

Интерактивный индикатор для горизонтального или вертикального перемещения по контенту.

Предусмотрены две Composable функции для работы с ScrollState и LazyListState.

### ScrollBar для обычного списка

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/scrollbar/ScrollBar_Simple.kt
```

### ScrollBar для ленивого списка

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/scrollbar/ScrollBarLazy_Simple.kt
```

## Стиль ScrollBar

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/scrollbar/ScrollBar_Style.kt
```
