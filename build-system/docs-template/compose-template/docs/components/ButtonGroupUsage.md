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

Стиль ButtonGroup можно настроить с помощью ButtonGroupStyle.builder(). 
Так же существует набор сгенерированных стилей.

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
