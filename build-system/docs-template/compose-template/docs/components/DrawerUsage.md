---
title: Drawer
--- 

`Drawer` — выдвижная панель, располагаемая поверх или рядом с основным контентом.


---

## 1) Базовое открытие по кнопке

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_Simple.kt
```

---

## 2) С заголовком и футером

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_WithHeaderFooter.kt
```

---

## 3) Peek Offset и затемняющий оверлей

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_PeekAndOverlay.kt
```

---

## 4) Выравнивание: слева, справа, сверху, снизу

> Направление задаётся в состоянии: `rememberDrawerState(alignment = DrawerAlignment.*)`

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_Alignments.kt
```

---

## 5) Кастомная иконка закрытия

Чтобы иконка была показана, укажите `hasClose = true`. Можно передать свой `closeIcon` и выбрать позицию `closeIconPlacement`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_CustomCloseIcon.kt
```

---

## 6) Отключение жестов (только программное управление)

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_NoGestures.kt
```

---

## 7) Сдвиг основного контента при открытии (`moveContentEnabled`)

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_MoveContent.kt
```

---

## 8) Авто-открытие по фокусу (`openOnFocus`)

Если передать `openOnFocus = false`, панель **не** будет автоматически открываться при получении фокуса.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_NoAutoOpenOnFocus.kt
```

---

## 9) Подтверждение смены состояния (`confirmStateChange`)

Можно ограничить закрытие/открытие панели (например, запретить закрытие, пока не выполнено условие).

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_WithConfirm.kt
```

---

## 10) Программное переключение `open/close/snapTo`

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/drawer/Drawer_ProgrammaticControl.kt
```

---

### Подсказки
- Выравнивание — только через `rememberDrawerState(alignment = ...)`.
- Для показа иконки закрытия укажите `hasClose = true` (и при необходимости — параметр `closeIcon`).
- `overlayEnabled` включает затемнение фона; нажатие по оверлею попытается закрыть панель (если `gesturesEnabled = true` и `confirmStateChange` разрешает).
- `peekOffset` можно поставить в `0.dp`, чтобы скрыть подглядывание.
- `moveContentEnabled` сдвигает основной контент синхронно с движением панели.
