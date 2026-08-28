---
title: CheckBox
---

Компонент Checkbox может содержать лейбл и описание.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/checkbox/CheckBox_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.checkbox.CheckBox_Simple -->

## Состояния CheckBox

Значение `CheckBox` задаётся через `CheckBoxValue` — тип с четырьмя равноправными значениями: `Off`, `On`, `Indeterminate` и `Error`. Перегрузки `CheckBox(value: CheckBoxValue, ...)` — основной способ задать состояние, включая `Error`.

Для обратной совместимости остаются перегрузки на `checked: Boolean` и на `androidx.compose.ui.state.ToggleableState` — но `ToggleableState` не содержит `Error` (это закрытый enum AndroidX), поэтому состояние `Error` доступно только через перегрузки с `CheckBoxValue`.

### Error

`Error` сигнализирует, что значение чекбокса невалидно (например, по результату валидации формы). Это состояние можно задать только программно — сам компонент никогда не переводит себя в `Error` в результате клика по нему; переход в `Error` и обратно должен управляться вызывающим кодом.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/checkbox/CheckBox_Error.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.checkbox.CheckBox_Error -->

## Стиль CheckBox

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/checkbox/CheckBox_Style.kt
```
