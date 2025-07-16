# Package com.sdds.compose.uikit

## Popover

Всплывающее окно — появляется при наведении или клике на элемент (триггер), 
используется для отображения одного контента поверх другого.

```kotlin
val showPopover = remember { mutableStateOf(false) }
val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
Button(
    modifier = Modifier
        .popoverTrigger(triggerInfo),
    label = "show",
    onClick = { showPopover.value = true },
)
Popover(
    show = showPopover.value,
    triggerInfo = triggerInfo.value,
    placement = PopoverPlacement.Top,
    placementMode = PopoverPlacementMode.Loose,
    triggerCentered = false,
    alignment = PopoverAlignment.Start,
    style = Popover.M.Default.style(),
    onDismissRequest = {
        showPopover.value = false
    },
    duration = 3000,
) {
    Column(
        modifier = Modifier
            .padding(top = 12.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
    ) {
        Text("Title")
        Spacer(Modifier.height(4.dp))
        Text("Description")
    }
}
```

## Стиль Popover

Для Popover существует набор сгенерированных стилей. Также стиль можно настроить с помощью PopoverStyle.builder().

### Создание стиля с помощью builder()

```kotlin
PopoverStyle.builder()
    .shadow(SddsServTheme.shadows.downHardM)
    .shape(SddsServTheme.shapes.roundL)
    .dimensions {
        width(182.0.dp)
        offset(8.0.dp)
        tailWidth(20.0.dp)
        tailHeight(8.0.dp)
        tailPadding(20.0.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.Gray))
    }
    .style()
```

## TriggerInfo

Информация о расположении и размерах триггера. 

Его удобно сохранять в state с помощью модификатора popoverTrigger(), применяемого к триггеру, 
и читать из state в Popover.

```kotlin
val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
Button(
    modifier = Modifier.popoverTrigger(triggerInfo),
    label = "show popover",
    onClick = { showPopover.value = true },
)
Popover(
    show = showPopover.value,
    triggerInfo = triggerInfo.value,
)
```

## PopoverPlacement

Расположение Popover относительно триггера.

__PopoverPlacement.Top__ - Popover расположен сверху триггера.

__PopoverPlacement.Bottom__ - Popover расположен снизу триггера.

__PopoverPlacement.Start__ - Popover расположен в начале триггера.

__PopoverPlacement.End__ - Popover расположен в конце триггера.

```kotlin
Popover(
    placement = PopoverPlacement.Top,
)
```

## PopoverAlignment

Режим выравнивания Popover относительно триггера.

__PopoverAlignment.Start__ - Popover выравнивается по началу триггера при PopoverPlacement.Top или PopoverPlacementBottom,
по верху триггера при PopoverPlacement.Start или PopoverPlacement.End.

__PopoverAlignment.Center__ - Popover выравнивается по центру триггера.

__PopoverAlignment.End__ - Popover выравнивается по концу триггера при PopoverPlacement.Top или PopoverPlacementBottom,
по низу триггера при PopoverPlacement.Start или PopoverPlacement.End.

```kotlin
Popover(
    alignment = PopoverAlignment.Start,
)
```

## PopoverPlacementMode

Режим расположения Popover.

__PopoverPlacementMode.Loose__ - при отсутствии свободного места в окне для размещения, будет выбрано подходящее место для Popover.

__PopoverPlacementMode.Strict__ - Popover будет показан строго в соответствии с placement и alignment, даже если нет свободного места в окне.

```kotlin
Popover(
    placementMode = PopoverPlacementMode.Strict,
)
```