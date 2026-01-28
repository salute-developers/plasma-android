---
title: File
---
Компонент для отображения загруженных файлов.

В качестве `progress` ожидает [CircularProgressBar](CircularProgressBarUsage.md) для варианта с внутренним расположением прогресса 
и [ProgressBar](ProgressBarUsage.md) для варианта с нижним расположением прогресса (см. [FileProgressPlacement](#fileactionplacement)). Либо произвольный контент.

В качестве `action` ожидает [IconButton](ButtonUsage.md) либо произвольный контент.

В качестве `image` ожидает иконку / изображение / произвольный контент.

### Пример со встроенным круглым прогрессом
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/FileCircular_Simple.kt
```

### Пример с внешним линейным прогрессом снизу
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/FileLinear_Simple.kt
```

## Стиль File

Стиль File можно настроить с помощью FileStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/File_Style.kt
```

## FileActionPlacement

Расположение `action` и встроенного `progress`. Возможные значения: Start, End.

## FileProgressPlacement

Расположение `progress`. Возможные значения: Inner (прогресс встроен слева или справа от `label` и `description`), Outer (прогресс расположен снизу).