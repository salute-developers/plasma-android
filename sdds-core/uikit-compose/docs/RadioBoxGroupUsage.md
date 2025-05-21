# Package com.sdds.compose.uikit

## RadioBoxGroup

RadioBoxGroup в качестве контента ожидает composable лямбды с ресивером RadioBoxGroupScope  - обертки над RadioBox,
в которые передается текущее состояние (выбран или нет элемент RadioBoxGroup).

```kotlin
RadioBoxGroup(
    style = RadioBoxGroup.M.style(),
    default = 1,
) { selection ->
    radioBoxItem(key = 1) { key ->
        RadioBox(
            checked = isChecked(selection, key),
            label = "Label",
            description = "Description",
            onClick = { updateSelection(selection, key) },
        )
    }
    radioBoxItem(key = 2) { key ->
        RadioBox(
            checked = isChecked(selection, key),
            label = "Label",
            description = "Description",
            onClick = { updateSelection(selection, key) },
        )
    }
    radioBoxItem(key = 3) { key ->
        RadioBox(
            checked = isChecked(selection, key),
            label = "Label",
            description = "Description",
            onClick = { updateSelection(selection, key) },
        )
    }
}    
```

## Стиль RadioBoxGroup

Стиль RadioBoxGroup можно настроить с помощью RadioBoxGroupStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
RadioBoxGroupStyle.builder()
.radioBoxStyle(RadioBox.M.style())
.dimensions {
    itemSpacing(12.0.dp)
}
.style()
```
