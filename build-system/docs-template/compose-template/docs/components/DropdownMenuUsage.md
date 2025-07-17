---
title: DropdownMenu
--- 

Раскрывающееся меню — отображает список пунктов поверх контента. 

В качестве контента ожидает List c элементами ListItem (стилизуются автоматически при использовании предопределенных стилей) либо произвольный контент.

```kotlin
val showDropdownMenu = remember { mutableStateOf(false) }
val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
Button(
    modifier = Modifier.popoverTrigger(triggerInfo),
    label = "Show dropdown menu",
    onClick = { showDropdownMenu.value = true },
)
DropdownMenu(
    opened = showDropdownMenu.value,
    onDismissRequest = {
        showDropdownMenu.value = false
    },
    triggerInfo = triggerInfo.value,
    placement = PopoverPlacement.Bottom,
    placementMode = PopoverPlacementMode.Loose,
    alignment = PopoverAlignment.Center,
    style = DropdownMenuNormal.Xl.Default.style(),
) {
    List(
        modifier = Modifier
            .width(200.dp)
            .height(300.dp),
    ) {
        item {
            ListItem(
                title = "Item title 1",
                disclosureEnabled = dropdownMenuUiState.hasDisclosure,
            )
        }
        item {
            Divider()
        }
        item {
            ListItem(
                title = "Item title 2",
                disclosureEnabled = dropdownMenuUiState.hasDisclosure,
            )
        }
    }
}
```

## Стиль DropdownMenu

Для DropdownMenu существует набор сгенерированных стилей. Также стиль можно настроить с помощью DropdownMenuStyle.builder().

### Создание стиля с помощью builder()

```kotlin
DropdownMenuStyle.builder()
    .shadow(SddsServTheme.shadows.downHardM)
    .shape(SddsServTheme.shapes.roundL)
    .listStyle(DropdownMenuListNormal.M.style())
    .dividerStyle(Divider.Default.style())
    .dimensions {
        width(200.dp)
        strokeWidth(1.dp)
        offset(8.0.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.LightGray))
        strokeColor(SolidColor(Color.Black))
    }
    .style()
```

## TriggerInfo

см. [TriggerInfo](PopoverUsage.md#triggerinfo)

## PopoverPlacement

см. [PopoverPlacement](PopoverUsage.md#popoverplacement)

## PopoverAlignment

см. [PopoverAlignment](PopoverUsage.md#popoveralignment)

## PopoverPlacementMode

см. [PopoverPlacementMode](PopoverUsage.md#popoverplacementmode)
