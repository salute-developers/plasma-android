---
title: ModalBottomSheet
--- 

Модальное, диалоговое окно в формате bottom sheet. Используется для отображения дополнительного контента
поверх основного интерфейса, не переключая экран. Обычно применяется для показа выбора, подтверждений и
других взаимодействий с пользователем. Компонент перекрывает весь экран полупрозрачным фоном и блокирует
взаимодействие с остальной частью UI до закрытия. Условно поделен на 3 части - header, body, footer.
Каждая часть может содержать любые composable элементы.

```kotlin
val sheetState = rememberModalBottomSheetState(
    initialValue = BottomSheetValue.Hidden,
)
Button(
    label = "показать BottomSheet",
    onClick = {
        scope.launch {
            sheetState.show()
        }
    },
)
ModalBottomSheet(
    style = ModalBottomSheet.Default.style(),
    sheetState = sheetState,
    handlePlacement = BottomSheetHandlePlacement.Auto,
    fitContent = false,
    header = { ... },
    footer = { ... },
) {
     Text(...)
}
```

## Стиль ModalBottomSheet

Стиль ModalBottomSheet можно настроить с помощью ModalBottomSheet.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
ModalBottomSheetStyle.builder()
    .shape(SddsServTheme.shapes.roundXl)
    .handleShape(CircleShape)
    .dimensions {
        paddingStart(16.0.dp)
        paddingEnd(16.0.dp)
        paddingTop(16.0.dp)
        paddingBottom(16.0.dp)
        handleHeight(4.0.dp)
        handleWidth(48.0.dp)
        handleOffset(6.0.dp)
    }
    .colors {
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultSolidCard.asInteractive(),
        )
        handleColor(
            SddsServTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
        )
    }
    .handlePlacement(BottomSheetHandlePlacement.Auto)
    .style()
```

## ModalBottomSheet HandlePlacement (Ручка)

Размещения handle относительно границы ModalBottomSheet можно задать с помощью парметра handlePlacement, ожидаемое значение - enum BottomSheetHandlePlacement.
В режиме Auto (по дефолту) изначально handle находится снаружи, но по мере выдвижения ModalBottomSheet - смещается во внутрь.

```kotlin
ModalBottomSheet(
    handlePlacement = BottomSheetHandlePlacement.Inner,
)
```

## FeetContent

С помощью параметра feetContent возможно ограничить высоту bottomSheet в развернутом виде, но только в том случае, если высота контента меньше высоты экрана.

```kotlin
ModalBottomSheet(
     fitContent = true,
)
```
