---
title: Select
---

`Select` — Компонент с возможностью выбора одного или нескольких вариантов в выпадающем списке.
В качестве триггера ожидает `SelectButton` или `SelectTextField`. В качестве контента - список из `SelectItem`.

## Примеры использования

Select нужно использовать с `SelectTextField` либо с `SelectButton`. 
Они представляют собой обертки над `TextField` и `Button`, принимают их стиль и предоставляют часть их api, 
а также содержат дополнительный функционал, необходимый для `Select`.

### SelectTextField

Пример с `SelectTextField` и множественным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_MultipleTextFieldLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_MultipleTextFieldLike -->

Пример с `SelectTextField` и единичным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_SingleTextFieldLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_SingleTextFieldLike -->

### SelectButton

Пример с `SelectButton` и единичным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_SingleButtonLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_SingleButtonLike -->

Пример с `SelectButton` и множественным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_MultipleButtonLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_MultipleButtonLike -->

### SelectItem

Элемент списка `Select`. Может быть выбранным и ожидает в качестве контента [Cell](CellUsage).

```kotlin
SelectItem(
    modifier = Modifier.fillMaxWidth(),
    checked = checkedStateManager.isSelected(SelectList[it]),
    onClick = {
        checkedStateManager.onItemPressed(SelectList[it])
    },
) {
    Cell(
        title = AnnotatedString(SelectList[it]),
        disclosureIconRes = null,
    )
}
```

## Работа с компонентом

### SelectState

Для работы с компонентом необходимо создать экземпляр `SelectState` и передать его в `Select`. 
Он служит для управления состоянием компонента открыт / закрыт. 
```kotlin
val state = remember { SelectState(initialState = true) }
Select(
    state = state
)
```
Список открывается и закрывается автоматически при активации / деактивации триггера. 
При необходимости состоянием можно управлять вручную:
```kotlin
state.open() // открыть список
state.close // закрыть список
state.toggle // переключить текущее состояние
```

### SelectDataStateManager

Для управления состоянием элементов `выбран` / `не выбран` лучше использовать ViewModel, но если она не используется, 
то существует интерфейс `SelectDataStateManager<T>` и две реализации для множественного и одиночного выбора.
Реализации доступны с помощью функций `rememberSelectMultipleDataStateManager()` и `rememberSelectSingleDataStateManager()`

### EmptyState

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyContent` и установить `showEmptyState`. 
В скоупе dropdown существует преднастроенный компонент `EmptyState()`. 
Рекомендуется использовать его в качестве контента для `emptyState`.

### Footer / header
Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

Чтобы показывать произвольный контент в верхней части списка, необходимо передать контент в `header`.

## Стиль Select

Для Select существует набор сгенерированных стилей. Также стиль Select можно настроить с помощью SelectStyle.builder(). 

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_Style.kt
```