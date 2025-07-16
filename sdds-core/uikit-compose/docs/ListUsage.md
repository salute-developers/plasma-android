# Package com.sdds.compose.uikit

## List

Компонент List используется для отображения информации списком.
В качестве контента принимает либо [ListItem](#listitem) либо произвольный контент.

```kotlin
List(
    style = ListNormal.M.style(),
) {
    items(5) {
        val interactionSource = remember { MutableInteractionSource() }
        val isFocused = interactionSource.collectIsFocusedAsState()
        ListItem(
            modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .focusSelector(
                    settings = LocalFocusSelectorSettings.current,
                ) { isFocused.value },
            title = "List item title",
            disclosureEnabled = true,
            interactionSource = interactionSource,
        )
    }
}
```

## Стиль List

Для List существует набор сгенерированных стилей. Также стиль можно настроить с помощью ListStyle.builder().

### Создание стиля с помощью builder()

```kotlin
ListStyle.builder()
    .listItemStyle(ListItem.M.style())
    .style()
```

## ListItem

Элемент списка [List](#list). При использовании в List ListItem стилизуется автоматически. Также можно настроить стиль элемента с помощью ListItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
ListItemStyle.builder()
    .shape(SddsServTheme.shapes.roundM)
    .titleStyle(SddsServTheme.typography.bodyMNormal)
    .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
    .colors {
        titleColor(Color.Black)
        dislosureIconColor(Color.Gray)
        backgroundColor(Color.Transparent)
    }
    .dimensions {
        contentPaddingEnd(4.dp)
        height(32.dp)
        paddingStart(8.dp)
        paddingEnd(8.dp)
        paddingTop(8.dp)
        paddingBottom(8.dp)
    }
    .style()
```
