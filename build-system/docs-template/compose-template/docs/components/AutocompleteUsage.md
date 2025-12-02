---
title: Autocomplete
---

`Autocomplete` — Поле ввода с возможностью подстановки значения из предварительно заполненного выпадающего списка по мере ввода данных.
Состоит из текстового поля и раскрывающегося списка.

## Пример использования

```kotlin
val componentKeyboardOffset by getComponentOffset()
var text by remember { mutableStateOf("") }
var showDropdown by remember { mutableStateOf(false) }
val filteredList = AutocompleteSuggestions.filterSuggestions(text)
val showEmptyState = autocompleteUiState.withEmptyState && filteredList.isEmpty()
Autocomplete(
    showDropdown = showDropdown,
    onDismissRequest = { showDropdown = false },
    style = style,
    field = {
        TextField(
            modifier = Modifier.width(240.dp),
            value = text,
            placeholderText = "Сотрудник",
            captionText = "Введите имя",
            onValueChange = {
                text = it
                showDropdown = true
            },
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    },
    showEmptyState = showEmptyState,
    emptyState = {
        EmptyState(
            iconRes = com.sdds.icons.R.drawable.ic_plasma_36,
            description = "Empty State",
            buttonLabel = "Action",
        )
    },
    footer = { LoadingContent() },
    listContent = {
        items(filteredList.size) { index ->
            ListItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                    ) {
                        text = filteredList[index]
                        showDropdown = false
                    },
                text = filteredList[index],
            )
        }
    },
)
```

Чтобы показать раскрывающийся список необходимо установить `showDropdown = true` и передать данные для раскрывающегося списка в `listContent`.

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyContent` и установить `showEmptyState`. 
В скоупе dropdown существует преднастроенный компонент `EmptyState()`. 
Рекомендуется использовать его в качестве контента для `emptyState`.

Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

## Стиль Autocomplete

Для Autocomplete существует набор сгенерированных стилей. Также стиль Autocomplete можно настроить с помощью AutocompleteStyle.builder(). 

### Создание стиля с помощью builder()

```kotlin
AutocompleteStyle.builder()
    .textFieldStyle(TextField.Xl.Default.style())
    .dropdownStyle(DropdownMenuNormal.Xl.style())
    .style()
```