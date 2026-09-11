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

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyState` и установить `showEmptyState`.
В скоупе dropdown существует преднастроенный компонент `EmptyState()`. 
Рекомендуется использовать его в качестве контента для `emptyState`.

Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

## StatefulValue и Motion

`AutocompleteStyle` содержит вложенные `textFieldStyle` и `dropdownStyle`. StatefulValue задаются внутри этих стилей:
например, фон TextField может зависеть от фокуса. Собственных цветов, размеров или формы у стиля Autocomplete нет.

Для передачи контекста меню используйте перегрузку с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>`.
Существующие вызовы остаются совместимыми и создают Motion меню через `rememberDropdownMenuMotion()` с
`LocalDropdownMenuMotionStyle`. Motion поля передаётся непосредственно в TextField внутри слота `field`.
Поле, меню и строки используют независимые контексты по умолчанию; при необходимости источники можно связать явно.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Motion.kt
```

В примере stateful-фон поля меняется при фокусе через существующий `TextFieldMotionStyle`.
Фильтрацией подсказок, выбором и флагом `showDropdown` управляет вызывающий код.
`onDismissRequest` сообщает о запросе закрытия; обновление флага остаётся у потребителя.

В текущем API контекст меню уже используется для stateful-обводки (`strokeColor`). Доступные переходы свойств
определяются реализацией DropdownMenu; передача Motion сама по себе не добавляет анимации его фона, размеров или формы.
`noMotion` отключает настроенные переходы свойств и сохраняет существующие `fadeIn`/`fadeOut` меню и `TextFieldAnimation`.

## Стиль Autocomplete

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Style.kt
```
