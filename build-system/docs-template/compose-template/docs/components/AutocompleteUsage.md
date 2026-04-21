---
title: Autocomplete
---

`Autocomplete` — Поле ввода с возможностью подстановки значения из предварительно заполненного выпадающего списка по мере ввода данных.
Состоит из текстового поля и раскрывающегося списка.

## Пример использования

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.autocomplete.Autocomplete_Simple -->

Чтобы показать раскрывающийся список необходимо установить `showDropdown = true` и передать данные для раскрывающегося списка в `listContent`.

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyContent` и установить `showEmptyState`. 
В скоупе dropdown существует преднастроенный компонент `EmptyState()`. 
Рекомендуется использовать его в качестве контента для `emptyState`.

Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

## Стиль Autocomplete

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Style.kt
```