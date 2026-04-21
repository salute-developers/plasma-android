---
title: List
---

Компонент List используется для отображения информации списком.
В качестве контента принимает либо [ListItem](#listitem) либо произвольный контент.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/List_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.list.List_Simple -->

## Стиль List

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/List_Style.kt
```

## ListItem

Элемент списка [List](#list). При использовании внутри `List` компонент стилизуется автоматически. Если нужен отдельный стиль для элемента, используйте `ListItemStyle.builder()`. Общие принципы работы `Style` и `StyleBuilder` описаны в разделе [Стилизация компонентов](../theme/Styles.md).

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/ListItem_Style.kt
```
