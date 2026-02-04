# Подготовка и использование примеров кода в документации

Этот документ описывает, **как правильно писать примеры кода** и **как подключать их в Markdown-документации** в экосистеме SDDS.

## Общая идея

Примеры кода:
- пишутся **как реальный рабочий код**
- автоматически извлекаются Gradle-задачей
- сохраняются в виде сниппетов
- подставляются в Markdown по идентификатору

❗ **Никогда не копируйте код вручную в Markdown.**  
Markdown всегда ссылается на сниппеты либо по имени функции, либо по`id`.

---

## Kotlin / Compose примеры

### 1. Где писать примеры

Общие Kotlin‑примеры пишутся в `fixtures` модулях. 
Для sdds-core:uikit-compose:
```
sdds-uikit-compose-fixtures/
└── src/main/kotlin/
    └── com/sdds/uikit/compose/fixtures/samples/button/
        └── ButtonSamples.kt
```

Для sdds-core:uikit:
```
sdds-core/uikit-fixtures/
└── src/main/kotlin/
    └── com/sdds/uikit/fixtures/samples/button/
        └── ButtonSamples.kt
```

Для библиотек из `tokens` в подмодуле `docs`. Например:
```
tokens/sdds.vserv.compose/docs/
└── src/main/kotlin/
    └── com/sdds/serv/docs/samples/button/
        └── ButtonSamples.kt
```
---

### 2. Аннотация `@DocSample`

Каждый пример должен быть помечен аннотацией `@DocSample`.

```kotlin
@DocSample
fun BasicButton_Simple() {
    ...
}
```

- `id` - необязательный параметр, если он не задан, используется имя функции
- ❗** Лучше пока не указывать `id` и оставить дефолтное поведение. Я это не тестировал. Извините :-) **
---

### 3. `codeSnippet {}` и `composableCodeSnippet {}`

Код, который должен попасть в документацию, **оборачивается в сниппет**:

```kotlin
@DocSample
fun BasicButton_Simple() {
    codeSnippet {
        Button(
            label = "Label",
            onClick = {}
        )
    }
}
```

Для Compose используйте:

```kotlin
@DocSample
@Composable
fun BasicButton_Composable() {
    composableCodeSnippet {
        Button(
            label = "Label",
            onClick = {}
        )
    }
}
```

---

### 4. Placeholder для Kotlin

Placeholder позволяет **показать в документации абстрактное значение**, сохранив реальное значение в коде.

```kotlin
codeSnippet {
    Button(
        shape = placeholder(RoundedCornerShape(16.dp), "/** Токен формы */")
    )
}
```

В сниппете будет:

```kotlin
Button(
  shape = /** Токен формы */
)

```

---

## XML примеры

### 1. Где писать XML примеры

XML‑примеры должны лежать в `res/` директории модуля `sdds-core/uikit-fixtures` или подмодуля `tokens/*/docs`

---

### 2. Разметка сниппета

Используются XML‑комментарии:

```xml
<!-- sample-start: id=BasicButton_Simple -->
<com.sdds.uikit.Button
    android:text="Label"
    app:sd_icon="@drawable/ic_arrow_down_16"
/>
<!-- sample-end: id=BasicButton_Simple -->
```
❗** Здесь использовать `id` обязательно **
---

### 3. Placeholder в XML

Placeholder в XML задаётся **через комментарий**, не нарушая валидность XML:

```xml
<!-- placeholder: app:sd_icon="@drawable/ic_arrow_down_16" -> app:sd_icon="Your icon" -->
```

Полный пример:

```xml
<!-- sample-start: id=BasicButton_Icon -->
<!-- placeholder: app:sd_icon="@drawable/ic_arrow_down_16" -> app:sd_icon="Your icon" -->
<com.sdds.uikit.Button
    android:text="Label"
    app:sd_icon="@drawable/ic_arrow_down_16"
/>
<!-- sample-end: id=BasicButton_Icon -->
```

В сниппете будет:

```xml
<com.sdds.uikit.Button 
    android:text="Label"
    app:sd_icon="Your icon"
/>
```

---

## Добавление примеров в Markdown

### 1. Синтаксис

В Markdown используется специальный маркер.
Для Kotlin кода:

```md
// @sample: path/to/function/FunctionName.kt
```
Обратите внимание, что:
- `path/to/function` - это всегда package name, но с разделителями в виде `/` вместо точки.
- `FunctionName` - название функции, которая помечена аннотацией @DocSample
- В конце указано расширение файла

Для XML:
```md
<!-- @sample: project_namespace/SampleId.xml -->
```

Обратите внимание, что:
- `project_namespace` - это android namespace, но с разделителями в виде `/` вместо точки.
- `SampleId` - идентификатор, указанный в аннотации @DocSample
- В конце указано расширение файла
---

### 2. Рекомендации

- Не делайте большие сниппеты
- Используйте placeholder вместо комментариев в коде
- Примеры должны компилироваться

---

## Что НЕ нужно делать

❌ Копировать код в Markdown  
❌ Писать примеры, которые не компилируются  

---

## Итог

- Код — **единый источник правды**
- Документация всегда синхронизирована с кодом
- Примеры можно переиспользовать для:
    - Markdown
    - Скриншотов

---

Если есть сомнения — ориентируйтесь на существующие примеры в модулях `fixtures`.