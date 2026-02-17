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

## Стиль Editable

Стиль Editable можно настроить с помощью EditableStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/editable/Editable_Style.kt
```

## EditableIconPlacement

Режим расположения иконки в компоненте. 
Возможные значения: `Absolute` (иконка не учитывается в лэйауте компонента), `Relative` (иконка включена в лэйаут компонента).

