---
title: Note
---
Компонент для отображения краткой статусной информации внутри контентного блока.  
Реализован в двух ориентациях вертикальной - Note и горизонтальной - NoteCompact.  

В качестве action ожидает LinkButton.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/note/NoteCompact_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.note.NoteCompact_Simple -->

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/note/Note_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.note.Note_Simple -->

## Стиль Note

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля NoteCompact с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/note/NoteCompact_Style.kt
```

### Создание стиля Note с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/note/Note_Style.kt
```

## ContentBeforeArrangement

Расположение слота contentBefore. Возможные значения: Top, Center, Bottom.  
Выравнивание при Top осуществляется относительно центра Title. Выравнивание при Center осуществляется  
относительно всего текстового блока, содержащего и Title и Text. Bottom - выравнивание по нижней границе Text.  
