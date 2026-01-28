---
title: ModalBottomSheet
---

Модальное, диалоговое окно в формате bottom sheet. Используется для отображения дополнительного контента
поверх основного интерфейса, не переключая экран. Обычно применяется для показа выбора, подтверждений и
других взаимодействий с пользователем. Компонент перекрывает весь экран полупрозрачным фоном и блокирует
взаимодействие с остальной частью UI до закрытия. Условно поделен на 3 части - header, body, footer.
Каждая часть может содержать любые composable элементы.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheet_Simple.kt
```

## Стиль ModalBottomSheet

Стиль ModalBottomSheet можно настроить с помощью ModalBottomSheet.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheet_Style.kt
```

## ModalBottomSheet HandlePlacement (Ручка)

Размещения handle относительно границы ModalBottomSheet можно задать с помощью парметра handlePlacement, ожидаемое значение - enum BottomSheetHandlePlacement.
В режиме Auto (по дефолту) изначально handle находится снаружи, но по мере выдвижения ModalBottomSheet - смещается во внутрь.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheetHandleInner_Simple.kt
```

## FeetContent

С помощью параметра feetContent возможно ограничить высоту bottomSheet в развернутом виде, но только в том случае, если высота контента меньше высоты экрана.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheetFitContent_Simple.kt
```
