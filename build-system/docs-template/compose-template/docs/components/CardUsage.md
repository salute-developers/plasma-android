---
title: Card
---

Визуальный контейнер, который объединяет различные элементы, такие как изображения, текст и кнопки, в единый блок.
Настройка размера осуществляется явным образом или в зависимости от содержимого.
Компонент Card является базовым контейнером. CardContent используется для вложенного контента внутри Card, имеет свою форму.

```kotlin
Card(
    modifier = Modifier
        .width(100.dp)
        .height(150.dp),
    style = CardSolid.L.style(),
    focusSelectorSettings = LocalFocusSelectorSettings.current,
) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
        ) {
            Text(
                "Card text",
                modifier = Modifier
                    .align(Alignment.Center),
            )
        }
        CardContent(
            modifier = Modifier
                .weight(2f)
                .align(Alignment.CenterHorizontally),
            style = CardSolid.L.style(),
            focusSelectorSettings = FocusSelectorSettings.None,
        ) {
            Image(
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.il_avatar_test),
                contentDescription = "Android",
            )
            Text(
                text = "Content",
            )
        }
    }
}
```

Еще один вариант функции Card, в компановку которой добавлены слоты для Label и Extra, возможность указать  
ориентацию (вид компановки контента внутри карточки) и отступы внутри слота Content.

```kotlin
Card(
    style = CardSolid.L.style(),
    label = { Text("Title") },
    extra = {
        IconButton(
            Icons.ic_plasma_24,
            modifier = Modifier.align(Alignment.BottomEnd),
        ) { }
    },
    ) {
        Image(
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.il_avatar_test),
            contentDescription = "Android",
        )
}
```

## Стиль Card

Стиль Card можно настроить с помощью CardStyle.builder(). Так же существует набор сгенерированных стилей.

## Создание стиля с помощью builder()

```kotlin
CardStyle.builder()
    .colors {
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidCard
                .asInteractive(),
        )
    }
    .shape({{ docs-theme-codeReference }}.shapes.roundL)
    .contentShape({{ docs-theme-codeReference }}.shapes.roundS)
    .dimensions {
        paddingTop(12.0.dp)
        paddingBottom(12.0.dp)
        paddingStart(12.0.dp)
        paddingEnd(12.0.dp)
    }
    .style()
```

### Примечание

При установке contentPaddings, отступы будут применятся на внутренний контент, при этом слот extra  
будет игнорировать эти паддинги.  При смене orintation, контент будет размещаться в Row (для горизонталоной  
ориентации) или в Column (для вертикальной ориентации).
