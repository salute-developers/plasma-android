---
title: Note
---
Компонент для отображения краткой статусной информации внутри контентного блока.  
Реализован в двух ориентациях вертикальной - Note и горизонтальной - NoteCompact.  

В качестве action ожидает LinkButton.

```kotlin
NoteCompact(
    style = NoteCompact.L.Default.style(),
    title = "Title",
    text = "Text",
    contentBefore = {
        Icon(
            painter = painterResource(R.drawable.ic_salute_outline_24),
            contentDescription = null,
        )
    },
    action = {
        Button(
            style = LocalLinkButtonStyle.current,
            label = "Label",
            onClick = {},
        )
    },
)
```

```kotlin
Note(
    style = Note.L.Default.style(),
    title = "Title",
    text = "Text",
    contentBefore = {
        Icon(
            painter = painterResource(R.drawable.ic_salute_outline_24),
            contentDescription = null,
        )
    },
    action = {
        Button(
            style = LocalLinkButtonStyle.current,
            label = "Label",
            onClick = {},
        )
    },
)
```

## Стиль Note

Стиль Note можно настроить с помощью NoteStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля NoteCompact с помощью builder()

```kotlin
NoteCompactStyle.builder()
    .shape({{ docs-theme-codeReference }}.shapes.roundL.adjustBy(all = -2.0.dp))
    .contentBeforeArrangement(ContentBeforeArrangement.Top)
    .titleStyle({{ docs-theme-codeReference }}.typography.textXsBold)
    .textStyle({{ docs-theme-codeReference }}.typography.textXsNormal)
    .dimensions {
        paddingStart(30.0.dp)
        paddingEnd(30.0.dp)
        paddingTop(7.0.dp)
        paddingBottom(24.0.dp)
        iconSize(24.0.dp)
        contentBeforeEndMargin(12.0.dp)
        textTopMargin(4.0.dp)
        closeStartMargin(0.0.dp)
        actionStartMargin(16.0.dp)
        actionEndMargin(0.0.dp)
    }
    .style()
```

### Создание стиля Note с помощью builder()

```kotlin
NoteStyle.builder()
    .shape({{ docs-theme-codeReference }}.shapes.roundL.adjustBy(all = -2.0.dp))
    .contentBeforeArrangement(ContentBeforeArrangement.Top)
    .titleStyle({{ docs-theme-codeReference }}.typography.textXsBold)
    .textStyle({{ docs-theme-codeReference }}.typography.textXsNormal)
    .dimensions {
        paddingStart(28.0.dp)
        paddingEnd(28.0.dp)
        paddingTop(24.0.dp)
        paddingBottom(7.0.dp)
        iconSize(24.0.dp)
        closeTopMargin(0.0.dp)
        contentBeforeEndMargin(12.0.dp)
        textTopMargin(4.0.dp)
        titlePaddingEnd(0.0.dp)
        closeEndMargin(0.0.dp)
        actionTopMargin(0.0.dp)
    }
    .style()
```

## ContentBeforeArrangement

Расположение слота contentBefore. Возможные значения: Top, Center, Bottom.  
Выравнивание при Top осуществляется относительно центра Title. Выравнивание при Center осуществляется  
относительно всего текстового блока, содержащего и Title и Text. Bottom - выравнивание по нижней границе Text.  
