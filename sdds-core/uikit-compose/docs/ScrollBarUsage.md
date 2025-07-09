# Package com.sdds.compose.uikit

## ScrollBar

Интерактивный индикатор для горизонтального или вертикального перемещения по контенту.

Предусмотрены две Composable функции для работы с ScrollState и LazyListState.

### ScrollBar для обычного списка

```kotlin
val scrollState = rememberScrollState()
Box {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
    ) {
        repeat(100) {
            Text(text = "Item $it")
        }
    }
    ScrollBar(
        modifier = Modifier.align(Alignment.CenterEnd),
        style = ScrollBar.M.style(),
        scrollState = scrollState,
        orientation = Orientation.Vertical,
        alwaysShowScrollbar = true,
        hasTrack = true,
        hoverExpand = false,
    )
}
```

### ScrollBar для ленивого списка

```kotlin
val lazyState = rememberLazyListState()
Box {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = lazyState,
    ) {
        items(100) {
            Text(text = "Item $it")
        }
    }
    ScrollBar(
        modifier = Modifier.align(Alignment.CenterEnd),
        style = ScrollBar.M.style(),
        scrollState = lazyState,
        alwaysShowScrollbar = true,
        hasTrack = true,
        hoverExpand = true,
    )
}
```

## Стиль ScrollBar

Стиль ScrollBar можно настроить с помощью ScrollBarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ScrollBarStyle.builder()
    .colors {
        trackColor(
            SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
        )
        thumbColor(
            SddsServTheme.colors.surfaceDefaultPositive.asInteractive(),
        )
    }
    .shape(CircleShape)
    .hoverExpandFactor(2.0f)
    .dimensions {
        width(4.0.dp)
    }
    .style()
```
