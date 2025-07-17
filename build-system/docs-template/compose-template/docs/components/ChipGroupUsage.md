---
title: ChipGroup
---

ChipGroup контейнер для Chip.

```kotlin
val items: List<String> = List(3) { "label" }
ChipGroup(
    style = ChipGroupDense.L.Default.style(),
) {
    items.forEach {
        var isSelected by remember { mutableStateOf(false) }
        Chip(
            isSelected = isSelected,
            onSelectedChange = { value -> isSelected = value },
            label = it,
            endContent = if (isSelected) {
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close_24),
                        contentDescription = "",
                    )
                }
            } else {
                null
            },
            enabled = chipGroupState.enabled,
        )
    }
}
        
```

## Стиль ChipGroup

Стиль ChipGroup можно настроить с помощью ChipGroupStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ChipGroupStyle.builder()
    .dimensions {
        gap(2.0.dp)
        lineSpacing(2.0.dp)
    }
    .chipStyle(Chip.L.Warning.style())
    .style()
```
