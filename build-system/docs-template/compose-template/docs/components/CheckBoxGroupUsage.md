---
title: CheckBoxGroup
---

Контент CheckBoxGroup формируется с помощью функций rootCheckbox(), checkbox() и checkboxes() из скоупа CheckboxGroupScope.
RootCheckBox() функция для главного чекбокса, который управляет всей группой, для добавления остальных элементов в группе - checkbox()
или checkboxes().

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
