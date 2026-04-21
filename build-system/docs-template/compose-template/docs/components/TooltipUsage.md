---
title: Tooltip
---

Простое всплывающее окно с текстом. Раскрывает контекстную информацию об элементе при наведении.

### Простой пример использования кнопки вызова Tooltip

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tooltip/Tooltip_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.tooltip.Tooltip_Simple -->

> Важно понимать, что контент Tooltip рендерится в отдельном окне поверх основного окна. 
> Однако вызов Composable-функции Tooltip сам по себе формирует LayoutNode с нулевыми размерами, который размещается в основной верстке.
> Поэтому если вызов происходит в контейнерах с отступами между дочерними элементами, это может привести к нежелательным эффектам в ui (добавление ненужного отступа).
> Чтобы избежать такого эффекта, нужно размещать вызов Tooltip вне скоупа таких контейнеров, либо оборачивать в Box функцию триггера и Tooltip.

### Пример использования кнопки вызова Tooltip в Column

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tooltip/Tooltip_ColumnScopeWithBox.kt
```

## Стиль Tooltip

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tooltip/Tooltip_Style.kt
```

## TriggerInfo

см. [TriggerInfo](PopoverUsage.md#triggerinfo)

## PopoverPlacement

см. [PopoverPlacement](PopoverUsage.md#popoverplacement)

## PopoverAlignment

см. [PopoverAlignment](PopoverUsage.md#popoveralignment)

## PopoverPlacementMode

см. [PopoverPlacementMode](PopoverUsage.md#popoverplacementmode)
