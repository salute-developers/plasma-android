---
title: File
---
Компонент для отображения загруженных файлов.

В качестве `progress` ожидает [CircularProgressBar](CircularProgressBarUsage.md) для варианта с внутренним расположением прогресса 
и [ProgressBar](ProgressBarUsage.md) для варианта с нижним расположением прогресса (см. [FileProgressPlacement](#fileactionplacement)). Либо произвольный контент.

В качестве `action` ожидает [IconButton](BasicButtonUsage) либо произвольный контент.

В качестве `image` ожидает иконку / изображение / произвольный контент.

### Пример со встроенным круглым прогрессом
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/FileCircular_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.file.FileCircular_Simple -->

### Пример с внешним линейным прогрессом снизу
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/FileLinear_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.file.FileLinear_Simple -->

## Стиль File

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/file/File_Style.kt
```

## FileActionPlacement

Расположение `action` и встроенного `progress`. Возможные значения: Start, End.

## FileProgressPlacement

Расположение `progress`. Возможные значения: Inner (прогресс встроен слева или справа от `label` и `description`), Outer (прогресс расположен снизу).