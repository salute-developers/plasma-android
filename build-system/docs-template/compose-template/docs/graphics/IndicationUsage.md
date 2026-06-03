---
title: Indication
---

`Indication` описывает визуальную реакцию компонента на взаимодействие: нажатие, фокус,
hover и другие события из `InteractionSource`.

В UIKit используется свой composition local:

```kotlin
LocalIndication provides indication
```

Он позволяет переопределить indication для всех кликабельных компонентов дизайн-системы в
пределах поддерева Compose.

## Базовое использование

Передайте indication через `CompositionLocalProvider` рядом с темой дизайн-системы:

```kotlin
val indication: Indication = ...

CompositionLocalProvider(
    LocalIndication provides indication,
) {
    Button(label = "Button", onClick = {})
}
```

Если компонент поддерживает явный параметр `indication`, его можно переопределить точечно:

```kotlin
val indication: Indication = ...

Button(
    label = "Button",
    indication = indication,
    onClick = {},
)
```

## Компоненты с shape

Некоторые компоненты имеют собственную форму, но не могут клипать весь composable: например,
из-за тени, badge или другого контента, который должен выходить за границы. Для таких случаев
indication может реализовать `ShapeableIndication`.

Компонент должен адаптировать indication через `maybeShapeable(shape)`:

```kotlin
Modifier.clickable(
    interactionSource = interactionSource,
    indication = LocalIndication.current.maybeShapeable(shape),
    onClick = onClick,
)
```

Если indication поддерживает `ShapeableIndication`, она получит shape компонента и сможет
ограничить только собственный слой рисования. Если не поддерживает, `maybeShapeable(shape)`
вернёт исходную indication без изменений.

## Когда использовать null

`indication = null` стоит использовать только для компонентов, где визуальная реакция на
interaction намеренно отключена. Для обычных кликабельных компонентов предпочтительно брать
значение из `LocalIndication.current`, чтобы тема могла централизованно управлять поведением.
