---
title: DropdownMenu
---

Раскрывающееся меню — отображает список пунктов поверх контента. 

В качестве контента ожидает List c элементами ListItem (стилизуются автоматически при использовании предопределенных стилей) либо произвольный контент.


```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/dropdownmenu/DropdownMenu_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.dropdownmenu.DropdownMenu_Simple -->

## Модальный DropdownMenu

`DropdownMenu` поддерживает модальный режим отображения. В таком режиме вся область экрана "блокируется" и затемняется. 
Если trigger должен остаться незатемнённым, форму выреза можно передать через `Modifier.popoverTrigger(triggerInfo, shape = ...)`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/dropdownmenu/DropdownMenu_Modal.kt
```

## Стиль DropdownMenu

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/dropdownmenu/DropdownMenu_Style.kt
```

## TriggerInfo

см. [TriggerInfo](PopoverUsage.md#triggerinfo)

## PopoverPlacement

см. [PopoverPlacement](PopoverUsage.md#popoverplacement)

## PopoverAlignment

см. [PopoverAlignment](PopoverUsage.md#popoveralignment)

## PopoverPlacementMode

см. [PopoverPlacementMode](PopoverUsage.md#popoverplacementmode)

## PopoverPositionStrategy

см. [PopoverPositionStrategy](PopoverUsage.md#popoverpositionstrategy)

`PopoverPositionStrategy.KeepInitial` удобно использовать, если содержимое DropdownMenu меняется после открытия,
например при переходе с короткого списка на длинный, но позиция меню должна остаться исходной.

```kotlin
DropdownMenu(
    opened = opened,
    triggerInfo = triggerInfo.value,
    positionStrategy = PopoverPositionStrategy.KeepInitial,
)
```

## SafeAreaPadding

см. [SafeAreaPadding](PopoverUsage.md#safeareapadding)

`safeAreaPadding` задает дополнительные отступы от краев доступной области экрана, внутри которой располагается DropdownMenu.

```kotlin
DropdownMenu(
    opened = opened,
    triggerInfo = triggerInfo.value,
    safeAreaPadding = PaddingValues(16.dp),
)
```
