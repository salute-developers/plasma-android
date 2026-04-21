---
title: Counter
---

Компонент Counter - по сути небольшого размера Badge для отображения числовых значений (счетчик).
Параметр count может быть формата String, AnnotatedString, а так же composable лямбдой.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/counter/Counter_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.counter.Counter_Simple -->

## Стиль Counter

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/counter/Counter_Style.kt
```
