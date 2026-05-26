---
title: ComboBox
---

`ComboBox` — компонент с возможностью ввода текста и выбора одного или нескольких вариантов в выпадающем списке.
В качестве триггера ожидает `ComboBoxTextField`. В качестве контента - список из `SelectItem`.

## Примеры использования

`ComboBox` нужно использовать с `ComboBoxTextField`.
Он представляет собой обертку над `TextField`, принимает его стиль и предоставляет часть его api,
а также содержит дополнительный функционал, необходимый для `ComboBox`.

### Единичный выбор

Пример с `ComboBoxTextField`, фильтрацией списка и единичным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/combobox/ComboBox_Single.kt
```

### Множественный выбор

Пример с `ComboBoxTextField`, фильтрацией списка, множественным выбором и отображением выбранных значений в `chipsContent`:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/combobox/ComboBox_Multiple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.combobox.ComboBox_Multiple -->

### SelectItem

Элемент списка `ComboBox`. Может быть выбранным и ожидает в качестве контента [Cell](CellUsage).

```kotlin
SelectItem(
    modifier = Modifier.fillMaxWidth(),
    checked = checkedStateManager.isSelected(comboBoxList[it]),
    onClick = {
        checkedStateManager.onItemPressed(comboBoxList[it])
    },
) {
    Cell(
        title = AnnotatedString(comboBoxList[it]),
        disclosureIconRes = null,
    )
}
```

## Работа с компонентом

### SelectState

Для работы с компонентом необходимо создать экземпляр `SelectState` и передать его в `ComboBox`.
Он служит для управления состоянием компонента открыт / закрыт.

```kotlin
val state = remember { SelectState(initialState = true) }
ComboBox(
    state = state
)
```

Список открывается при активации текстового поля и при вводе текста.
При необходимости состоянием можно управлять вручную:

```kotlin
state.open() // открыть список
state.close() // закрыть список
state.toggle() // переключить текущее состояние
```

### SelectDataStateManager

Для управления состоянием элементов `выбран` / `не выбран` лучше использовать ViewModel, но если она не используется,
то существует интерфейс `SelectDataStateManager<T>` и две реализации для множественного и одиночного выбора.
Реализации доступны с помощью функций `rememberSelectMultipleDataStateManager()` и `rememberSelectSingleDataStateManager()`.

### Фильтрация списка

Если текстовое поле активно и значение пустое, обычно показывается весь список.
Если пользователь вводит текст, список можно отфильтровать по введенной строке.

```kotlin
val filteredList = if (state.isOpened && value.isEmpty()) {
    comboBoxList
} else {
    comboBoxList.filter { it.contains(value, ignoreCase = true) }
}
```

### Chips

Для множественного выбора выбранные элементы можно отображать внутри `ComboBoxTextField` через параметр `chipsContent`.
Чтобы удалить выбранный элемент, достаточно обработать клик по контенту чипа и обновить состояние выбора.

### EmptyState

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyContent` и установить `showEmptyState`.
В скоупе dropdown существует преднастроенный компонент `EmptyState()`.
Рекомендуется использовать его в качестве контента для `emptyState`.

### Footer / header

Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

Чтобы показывать произвольный контент в верхней части списка, необходимо передать контент в `header`.

## Стиль ComboBox

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/combobox/ComboBox_Style.kt
```
