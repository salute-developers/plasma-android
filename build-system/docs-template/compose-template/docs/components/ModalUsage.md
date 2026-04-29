---
title: Modal
---

Модальное окно — это всплывающее окно, появляющееся поверх текущей страницы и блокирующее доступ к основному содержимому страницы. 
Если модальное окно необходимо наложить поверх затемненного экрана, то используйте фон с токенами цвета из группы Overlay.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/modal/Modal_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.modal.Modal_Simple -->

## Стиль Modal

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/modal/Modal_Style.kt
```
