---
title: Text
---

`Text` используется для отображения текста в Compose. Обеспечивает поддержку  
локального стиля `LocalTextStyle`, настраиваемого поведения и работу через универсальный `TextSource`.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Simple -->

## Варианты использования

Компонент принимает `TextSource`, который можно создать из разных источников текста:

- Обычная строка (`String`)
- Аннотированная строка (`AnnotatedString`)
- Строковый ресурс (`@StringRes`)

### String

Используется для простого отображения текста через `stringSource`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_String.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_String -->

### AnnotatedString

Поддерживает различные стили внутри одного текста и возможность вставки встроенных composable-элементов через `annotatedStringSource`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Annotated.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Annotated -->

## Настройка стиля текста

По умолчанию `Text` использует значение из LocalTextStyle. Чтобы задать общий стиль для вложенных `Text`- компонентов,  
можно использовать `ProvideTextStyle`. Если в ProvideTextStyle указан TextStyle, он объединяется с текущим локальным  
стилем (`LocalTextStyle`), заполняя недостоющие пераметры.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_ProvideStyle.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_ProvideStyle -->

Для задания цвета или кисти по умолчанию можно использовать overload `ProvideTextStyle(..., brush = ...)`.

## Inline Content

Текст с типом `AnnotatedString` поддерживает отображение встроенных composable через параметр `inlineContent`.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_InlineContent.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_InlineContent -->

## Параметры отображения

Компонент поддерживает стандартные параметры форматирования текста:  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/text/Text_Formatting.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.text.Text_Formatting -->
