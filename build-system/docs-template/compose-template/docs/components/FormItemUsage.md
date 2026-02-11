---
title: FormItem
---

Компонент-оболочка с набором вариаций и элементами управления формой.

### Простой пример элемента формы

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormItem_Simple.kt
```

### Пример с hint и Tooltip

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormItem_WithHint.kt
```

## Стиль FormItem

Стиль FormItem можно настроить с помощью FormItemStyle.builder(). Так же существует набор
сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormItem_Style.kt
```

## FormVertical

Компонент предназначенный для вертикальной группировки нескольких FormItem

### Пример с вертикальной группировкой элементов

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormVertical_Simple.kt
```

## FormHorizontal

### Пример с горизонтальной группировкой элементов

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormHorizontal_Simple.kt
```

## FormTitlePlacement

Расположение Title в элементе формы FormItem. Возможные значения: `Start`, `Top`, `None`.

## FormBottomTextAlignment

Режим выранивания нижнего текста FormItem (caption и counter).
Возможные значения: `Center` (caption и counter центрированы по горизонтали относительно формы,
расположены друг под другом), `Edge` (Caption расположен в начале, Counter расположен в конце).

## FormIndicatorAlignment

Выравнивание индикатора формы.
Возможные значения: `TopStart`, `TopCenter`, `TopEnd`, `CenterStart`, `Center`, `CenterEnd`,
`BottomStart`, `BottomCenter`, `BottomEnd`.

## FormType

Тип элемента формы.
Возможные значения: `Required` (показывается индикатор), `Optional` (показывается optional-текст).
