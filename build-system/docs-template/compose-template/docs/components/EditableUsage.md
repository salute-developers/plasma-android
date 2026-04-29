---
title: Editable
---
Редактируемое текстовое поле. Может иметь иконку справа.

### Простой пример
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/editable/Editable_Simple.kt
```

### Пример с иконкой и абсолютным расположением
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/editable/Editable_AbsoluteIcon.kt
```

### Пример с иконкой и относительным расположением
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/editable/Editable_RelativeIcon.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.editable_Editable_RelativeIcon -->

## Стиль Editable

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/editable/Editable_Style.kt
```

## EditableIconPlacement

Режим расположения иконки в компоненте. 
Возможные значения: `Absolute` (иконка не учитывается в лэйауте компонента), `Relative` (иконка включена в лэйаут компонента).

