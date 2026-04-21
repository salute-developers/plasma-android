---
title: ButtonGroup
---
Группа кнопок.

В качестве контента ожидает [Button](BasicButtonUsage) либо [IconButton](BasicButtonUsage). Кнопки стилизуются автоматически.

### Группа кнопок BasicButton
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/buttongroup/ButtonGroup_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.buttongroup.ButtonGroup_Simple -->

### Группа кнопок IconButton
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/buttongroup/IconButtonGroup_Simple.kt
```

## Стиль ButtonGroup

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder() для базовой кнопки BasicButton

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/buttongroup/ButtonGroup_Style.kt
```

### Создание стиля с помощью builder() для кнопки с иконкой IconButton

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/buttongroup/IconButtonGroup_Style.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.buttongroup.IconButtonGroup_Simple -->

## ButtonGroupOrientation

Способ расположения кнопок: по вертикали либо по горизонтали. Возможные значения: Horizontal, Vertical
