---
title: Drawer
--- 

`Drawer` — выдвижная панель, располагаемая поверх или рядом с основным контентом.


---

## 1) Базовое открытие по кнопке

```kotlin
@Composable
fun DrawerBasic() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        drawerContent = { Text("Содержимое Drawer") },
    ) {
        Button(
            label = "Открыть Drawer",
            modifier = Modifier.align(Alignment.Center),
            onClick = { scope.launch { drawerState.open() } }
        )
    }
}
```

---

## 2) С заголовком и футером

```kotlin
@Composable
fun DrawerWithHeaderFooter() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        drawerHeader = { Text("Заголовок", modifier = Modifier.padding(16.dp)) },
        drawerFooter = {
            Button(
                label = "Закрыть",
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                onClick = { scope.launch { drawerState.close() } }
            )
        },
        drawerContent = { Text("Основное содержимое", modifier = Modifier.padding(16.dp)) },
    ) {
        Button(
            label = "Открыть",
            modifier = Modifier.align(Alignment.Center),
            onClick = { scope.launch { drawerState.open() } }
        )
    }
}
```

---

## 3) Peek Offset и затемняющий оверлей

```kotlin
@Composable
fun DrawerPeekAndOverlay() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        peekOffset = 56.dp,
        overlayEnabled = true,
        drawerContent = { Text("Контент панели", modifier = Modifier.padding(16.dp)) },
    ) {
        Button(
            label = "Открыть",
            modifier = Modifier.align(Alignment.Center),
            onClick = { scope.launch { drawerState.open() } }
        )
    }
}
```

---

## 4) Выравнивание: слева, справа, сверху, снизу

> Направление задаётся в состоянии: `rememberDrawerState(alignment = DrawerAlignment.*)`

```kotlin
@Composable
fun DrawerAlignments() {
    val start = rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.Start)
    val end = rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.End)
    val top = rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.Top)
    val bottom = rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.Bottom)
    val scope = rememberCoroutineScope()

    Column {
        Button(label = "Слева", onClick = { scope.launch { start.open() } })
        Drawer(drawerState = start, drawerContent = { Text("Панель слева") }) { }

        Button(label = "Справа", onClick = { scope.launch { end.open() } })
        Drawer(drawerState = end, drawerContent = { Text("Панель справа") }) { }

        Button(label = "Сверху", onClick = { scope.launch { top.open() } })
        Drawer(drawerState = top, drawerContent = { Text("Панель сверху") }) { }

        Button(label = "Снизу", onClick = { scope.launch { bottom.open() } })
        Drawer(drawerState = bottom, drawerContent = { Text("Панель снизу") }) { }
    }
}
```

---

## 5) Кастомная иконка закрытия

Чтобы иконка была показана, укажите `hasClose = true`. Можно передать свой `closeIcon` и выбрать позицию `closeIconPlacement`.

```kotlin
@Composable
fun DrawerCustomCloseIcon() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        hasClose = true,
        closeIconPlacement = CloseIconPlacement.End,
        closeIcon = {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Закрыть")
        },
        drawerContent = { Text("Панель с кастомной иконкой", modifier = Modifier.padding(16.dp)) },
    ) {
        Button(label = "Открыть", modifier = Modifier.align(Alignment.Center), onClick = { scope.launch { drawerState.open() } })
    }
}
```

---

## 6) Отключение жестов (только программное управление)

```kotlin
@Composable
fun DrawerNoGestures() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        gesturesEnabled = false,
        drawerContent = { Text("Жесты отключены", modifier = Modifier.padding(16.dp)) },
    ) {
        Row(Modifier.align(Alignment.Center)) {
            Button(label = "Открыть", onClick = { scope.launch { drawerState.open() } })
            Spacer(Modifier.width(12.dp))
            Button(label = "Закрыть", onClick = { scope.launch { drawerState.close() } })
        }
    }
}
```

---

## 7) Сдвиг основного контента при открытии (`moveContentEnabled`)

```kotlin
@Composable
fun DrawerMoveContent() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        moveContentEnabled = true,
        drawerContent = { Text("Контент панели", modifier = Modifier.padding(16.dp)) },
    ) {
        Button(
            label = "Открыть",
            modifier = Modifier.align(Alignment.Center),
            onClick = { scope.launch { drawerState.open() } }
        )
    }
}
```

---

## 8) Авто-открытие по фокусу (`openOnFocus`)

Если передать `openOnFocus = false`, панель **не** будет автоматически открываться при получении фокуса.

```kotlin
@Composable
fun DrawerNoAutoOpenOnFocus() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    Drawer(
        drawerState = drawerState,
        openOnFocus = false,
        drawerContent = { Text("Панель не открывается по фокусу") },
    ) {
        /* Основной контент */
    }
}
```

---

## 9) Подтверждение смены состояния (`confirmStateChange`)

Можно ограничить закрытие/открытие панели (например, запретить закрытие, пока не выполнено условие).

```kotlin
@Composable
fun DrawerWithConfirm() {
    val canClose = remember { mutableStateOf(false) }
    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed,
        confirmStateChange = { target ->
            // Разрешаем закрытие только если canClose == true
            if (target == DrawerValue.Closed) canClose.value else true
        }
    )
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        drawerContent = {
            Column(Modifier.padding(16.dp)) {
                Text("Чтобы закрыть панель, включите переключатель")
                Switch(checked = canClose.value, onCheckedChange = { canClose.value = it })
                Spacer(Modifier.height(12.dp))
                Button(label = "Закрыть программно", onClick = { scope.launch { drawerState.close() } })
            }
        },
    ) {
        Button(label = "Открыть", modifier = Modifier.align(Alignment.Center), onClick = { scope.launch { drawerState.open() } })
    }
}
```

---

## 10) Программное переключение `open/close/snapTo`

```kotlin
@Composable
fun DrawerProgrammaticControl() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        drawerContent = { Text("Контент") },
    ) {
        Row(Modifier.align(Alignment.Center)) {
            Button(label = "open()", onClick = { scope.launch { drawerState.open() } })
            Spacer(Modifier.width(8.dp))
            Button(label = "close()", onClick = { scope.launch { drawerState.close() } })
            Spacer(Modifier.width(8.dp))
            Button(label = "snapTo(Open)", onClick = { scope.launch { drawerState.snapTo(DrawerValue.Opened) } })
        }
    }
}
```

---

### Подсказки
- Выравнивание — только через `rememberDrawerState(alignment = ...)`.
- Для показа иконки закрытия укажите `hasClose = true` (и при необходимости — параметр `closeIcon`).
- `overlayEnabled` включает затемнение фона; нажатие по оверлею попытается закрыть панель (если `gesturesEnabled = true` и `confirmStateChange` разрешает).
- `peekOffset` можно поставить в `0.dp`, чтобы скрыть подглядывание.
- `moveContentEnabled` сдвигает основной контент синхронно с движением панели.
