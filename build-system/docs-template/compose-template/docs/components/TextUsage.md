---
title: Text
--- 

`Text` используется для отображения текста в Compose. Оборачивает `BasicText`, добавляя поддержку  
локального стиля `LocalTextStyle` и возможность объединения стилей через `ProvideTextStyle`.  

```kotlin
Text(
    text = "Hello, world!",
)
```

## Варианты использования

Компонент использует два типа входных данных:  

- Обычная строка (`String`)

- Аннотированная строка (`AnnotatedString`)  

### String

Используется для простого отображения текста.

```kotlin
Text(
    text = "Hello, world",
    style = TextStyle(fontSize = 16.sp),
)
```

### AnnotatedString

Поддерживает различные стили внутри одного текста и возможность вставки встроенных composable-элементов.

```kotlin
val text = buildAnnbuildAnnotatedString {
    append("Текст с ")
    withStyle(SpanStyle(color = Color.Red)) {
        append("цветным фрагментом")
    }
}
Text(
    text = text,
    style = TextStyle(fontSize = 16.sp),
)
```

## Настройка стиля текста

По умолчанию `Text` использует значение из LocalTextStyle. Чтобы задать общий стиль для вложенных `Text`- компонентов,  
можно использовать `ProvideTextStyle`. Если в ProvideTextStyle указан TextStyle, он объединяется с текущим локальным  
стилем (`LocalTextStyle`), заполняя недостоющие пераметры.

```kotlin
ProvideTextStyle(TextStyle(color = Color.Gray, fontSize = 20.sp)) {
    Column{
        Text("Заголовок")
        Text("Описание")
    }
}
```

## Inline Content

Текст с типом `AnnotatedString` поддерживает отображение встроенных composable через параметр `inlineContent`.  

```kotlin
val inlineContent = mapOf(
    "icon" to InlineTextContent(
        placeholder = Placeholder(16.sp, 16.sp, PlaceholderVerticalAlign.Center),
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = null,
        )
    }
)

val text = buildAnnotatedString {
    append("Добавляем иконку")
    appendInlineContent("icon","[icon]")
}

Text(
    text = text,
    inlineContent = inlineContent
)
```

## Параметры отображения

Компонент поддерживает стандартные параметры форматирования текста:  

```kotlin
Text(
    text = "Длинное описание чего то, содержащее много строк",
    maxLines = 2,
    overflow = TextOverflow.Ellipsis,
    softWrap = true
)
```
