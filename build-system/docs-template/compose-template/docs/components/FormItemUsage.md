---
title: FormItem
---

Компонент-оболочка с набором вариаций и элементами управления формой.

### Простой пример элемента формы

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormItem_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.formitem_FormItem_Simple -->

### Пример с hint и Tooltip

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/formitem/FormItem_WithHint.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.formitem_FormItem_WithHint -->

## Стиль FormItem

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

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

## FormTextAlignment

Режим выранивания вспомогательного текста FormItem (title, titleCaption, caption, counter).
Возможные значения: `Center` (тексты центрированы по горизонтали относительно формы,
расположены друг под другом), `Edge` (тексты расположены в начале и в конце компонента).

## FormIndicatorAlignment

Выравнивание индикатора формы.
Возможные значения: `TopStart`, `TopCenter`, `TopEnd`, `CenterStart`, `Center`, `CenterEnd`,
`BottomStart`, `BottomCenter`, `BottomEnd`.

## FormType

Тип элемента формы.
Возможные значения: `Required` (показывается индикатор), `Optional` (показывается optional-текст).
