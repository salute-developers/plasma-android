---
title: Text
---

`Text` используется для отображения текста в Compose. Оборачивает `BasicText`, добавляя поддержку  
локального стиля `LocalTextStyle` и возможность объединения стилей через `ProvideTextStyle`.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Simple -->

## Варианты использования

Компонент использует два типа входных данных:  

- Обычная строка (`String`)

- Аннотированная строка (`AnnotatedString`)  

### String

Используется для простого отображения текста.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/TextStyle_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.TextStyle_Simple -->

### AnnotatedString

Поддерживает различные стили внутри одного текста и возможность вставки встроенных composable-элементов.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Custom.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Custom -->

## Настройка стиля текста

По умолчанию `Text` использует значение из LocalTextStyle. Чтобы задать общий стиль для вложенных `Text`- компонентов,  
можно использовать `ProvideTextStyle`. Если в ProvideTextStyle указан TextStyle, он объединяется с текущим локальным  
стилем (`LocalTextStyle`), заполняя недостоющие пераметры.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Style.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Style -->

## Inline Content

Текст с типом `AnnotatedString` поддерживает отображение встроенных composable через параметр `inlineContent`.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/TextInlineContent_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.TextInlineContent_Simple -->

## Параметры отображения

Компонент поддерживает стандартные параметры форматирования текста:  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/TextFormat_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.TextFormat_Simple -->
