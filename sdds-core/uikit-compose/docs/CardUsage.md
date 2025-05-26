# Package com.sdds.compose.uikit

## Card

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

## Стиль Card

Стиль Card можно настроить с помощью CardStyle.builder(). Так же существует набор сгенерированных стилей.

## Создание стиля с помощью builder()

```kotlin
CardStyle.builder()
.colors {
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultSolidCard
            .asInteractive(),
    )
}
.shape(SddsServTheme.shapes.roundL)
.contentShape(SddsServTheme.shapes.roundS)
.dimensions {
    paddingTop(12.0.dp)
    paddingBottom(12.0.dp)
    paddingStart(12.0.dp)
    paddingEnd(12.0.dp)
}
.style()
```
