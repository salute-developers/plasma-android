---
title: Popover
---

Всплывающее окно — появляется при наведении или клике на элемент (триггер), 
используется для отображения одного контента поверх другого.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/popover/Popover_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.popover.Popover_Simple -->

## Стиль Popover

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/popover/Popover_Style.kt
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

Если нужна точная форма trigger для связанных компонентов, поддерживающих cutout, используйте overload с `shape`:

```kotlin
Modifier.popoverTrigger(
    triggerInfo = triggerInfo,
    shape = RoundedCornerShape(16.dp),
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

__PopoverPlacementMode.StrictClipped__ - Popover будет размещен в соответствии с placement и alignment, но его позиция будет ограничена доступной областью окна.

```kotlin
Popover(
    placementMode = PopoverPlacementMode.Strict,
)
```

## PopoverPositionStrategy

Стратегия пересчета позиции Popover.

__PopoverPositionStrategy.Recalculate__ - позиция пересчитывается при изменении размеров Popover, размеров окна или положения trigger. Используется по умолчанию.

__PopoverPositionStrategy.KeepInitial__ - первая рассчитанная позиция, placement и alignment фиксируются на время открытия Popover. Подходит для сценариев, где контент может изменять размер после открытия, но Popover должен оставаться на исходном месте.

```kotlin
Popover(
    positionStrategy = PopoverPositionStrategy.KeepInitial,
)
```

## SafeAreaPadding

`safeAreaPadding` задает дополнительные отступы от краев доступной области экрана, внутри которой располагается Popover.
Отступы учитываются вместе с системными inset'ами и клавиатурой.

```kotlin
Popover(
    safeAreaPadding = PaddingValues(
        start = 16.dp,
        top = 8.dp,
        end = 16.dp,
        bottom = 24.dp,
    ),
)
```
