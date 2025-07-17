---
title: Tooltip
--- 

Простое всплывающее окно с текстом. Раскрывает контекстную информацию об элементе при наведении.

```kotlin
val showTooltip = remember { mutableStateOf(false) }
val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
Button(
    modifier = Modifier
        .popoverTrigger(triggerInfo),
    label = "show",
    onClick = { showTooltip.value = true },
)
Tooltip(
    show = showTooltip.value,
    triggerInfo = triggerInfo.value,
    placement = PopoverPlacement.Top,
    placementMode = PopoverPlacementMode.Loose,
    triggerCentered = false,
    alignment = PopoverAlignment.Start,
    style = Tooltip.M.style(),
    onDismissRequest = {
        showTooltip.value = false
    },
    duration = 3000,
    text = AnnotatedString("Tooltip Text"),
)
```

## Стиль Tooltip

Для Tooltip существует набор сгенерированных стилей. Также стиль можно настроить с помощью TooltipStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TooltipStyle.builder()
    .shadow(SddsServTheme.shadows.downHardM)
    .shape(SddsServTheme.shapes.roundL)
    .dimensions {
        offset(8.0.dp)
        tailWidth(20.0.dp)
        tailHeight(8.0.dp)
        tailPadding(20.0.dp)
        contentStartSize(16.dp)
        contentStartPadding(4.dp)
        paddingStart(8.dp)
        paddingEnd(8.dp)
        paddingTop(8.dp)
        paddingBottom(8.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.Gray))
        textColor(SolidColor(Color.Black))
        contentStartColor(Color.Black)
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
