---
title: Accordion
---
Вертикальный список с возможностью показать или скрыть связанный компонент.

В качестве контента ожидает AccordionItem и [Divider](DividerUsage.md#divider), стилизует их автоматически.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/accordion/Accordion_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.accordion.Accordion_Simple -->

## Стиль Accordion и AccordionItem

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля AccordionItemStyle с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/accordion/Accordion_ItemStyle.kt
```

### Создание стиля AccordionStyle с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/accordion/Accordion_Style.kt
```
