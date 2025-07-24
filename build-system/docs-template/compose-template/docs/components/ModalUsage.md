---
title: Modal
--- 

Модальное окно — это всплывающее окно, появляющееся поверх текущей страницы и блокирующее доступ к основному содержимому страницы. 
Если модальное окно необходимо наложить поверх затемненного экрана, то используйте фон с токенами цвета из группы Overlay.

```kotlin
val showModal = remember { mutableStateOf(false) }
Button(
    label = "Show modal",
    onClick = { showModal.value = true },
)
Modal(
    show = showModal.value,
    style = Modal.Default.style(),
    onDismissRequest = { showModal.value = false },
    modifier = Modifier.width(300.dp),
    hasClose = true,
    closeIcon = painterResource(R.drawable.ic_close_24),
) {
    Column {
        Text("Modal text")
        Button(label = "Ok", onClick = { showModal.value = false })
    }
    
}
```

## Стиль Modal

Для Modal существует набор сгенерированных стилей. Также стиль можно настроить с помощью ModalStyle.builder().

### Создание стиля с помощью builder()

```kotlin
ModalStyle.builder()
    .shadow({{ docs-theme-codeReference }}.shadows.downHardM)
    .shape({{ docs-theme-codeReference }}.shapes.roundM)
    .dimensions {
        closeSize(16.0.dp)
        paddingStart(8.dp)
        paddingEnd(8.dp)
        paddingTop(8.dp)
        paddingBottom(8.dp)
    }
    .colors {
        backgroundColor(SolidColor(Color.Gray))
        closeColor(Color.LightGray)
    }
    .style()
```
