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

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.bottomsheet.ModalBottomSheet_Simple -->

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

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.bottomsheet.ModalBottomSheetHandleInner_Simple -->

## Ограничение высоты ModalBottomSheet по контенту

С помощью параметра fitContent возможно ограничить высоту bottomSheet в развернутом виде, но только в том случае, если высота контента меньше высоты экрана.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheetFitContent_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.bottomsheet.ModalBottomSheetFitContent_Simple -->


## Обработка Window Insets

Для корректной работы с системными отступами (status bar, navigation bar, IME) рекомендуется
явно управлять модификаторами insets снаружи и внутри `ModalBottomSheet`.

Общий принцип:

- `statusBarsPadding()` добавляется к самому `ModalBottomSheet` через параметр `modifier`,
  чтобы компонент открывался до границы status bar и корректно учитывал верхний системный отступ.
- `navigationBarsPadding()` применяется внутри контента (например, к `Column`), чтобы
  содержимое не перекрывалось navigation bar, при этом сам `ModalBottomSheet` продолжал
  рисоваться под системной панелью.
- `imePadding()` также применяется внутри контента, чтобы элементы (например, `TextField`)
  корректно поднимались при появлении клавиатуры.


Таким образом:
- внешний модификатор отвечает за корректное позиционирование всего bottom sheet
  относительно status bar;
- внутренние модификаторы управляют безопасными отступами контента относительно
  navigation bar и клавиатуры.

:::warning
⚠️ Расположение модификаторов (снаружи или внутри `ModalBottomSheet`) является рекомендацией. 
В зависимости от архитектуры экрана и требований к дизайну разработчик может самостоятельно
определить, на каком уровне обрабатывать системные insets.
::: 

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/bottomsheet/ModalBottomSheet_Insets.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.bottomsheet.ModalBottomSheet_Insets -->
