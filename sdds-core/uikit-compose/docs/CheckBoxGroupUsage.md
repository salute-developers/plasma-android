# Package com.sdds.compose.uikit

## CheckBoxGroup

CheckBoxGroup в качестве контента ожидает composable лямбды с ресивером CheckboxGroupScope - обертки над CheckBox.

```kotlin
CheckBoxGroup(
    style = CheckBoxGroup.M.style(),
) {
    rootCheckbox {
        CheckBox(
            state = ToggleableState.On,
            label = "Label",
            description = "Description",
        )
    }
    checkbox {
        CheckBox(
            state = ToggleableState.On,
            label = "Label",
            description = "Description",
        )
    }
    checkbox {
        CheckBox(
            state = ToggleableState.On,
            label = "Label",
            description = "Description",
        )
    }
}
        
```

## Стиль CheckBoxGroup

Стиль CheckBoxGroup можно настроить с помощью CheckBoxGroupStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
CheckBoxGroupStyle.builder()
.checkBoxStyle(CheckBox.L.Default.style())
    .dimensions {
        itemSpacing(14.0.dp)
        itemOffset(36.0.dp)
    }
.style()
```
