---
title: Select
---

`Select` — компонент с возможностью выбора одного или нескольких вариантов в выпадающем списке. 
Он показывает список доступных вариантов по нажатию на триггер, позволяет настраивать источник данных,
отображение пустого состояния и футера, а также внешний вид триггера.

## Основные возможности

- Пустое состояние (`EmptyStateView`) при отсутствии подсказок.
- Нижний футер (`FooterView`) — например, индикатор загрузки.
- Гибкая настройка через XML-атрибуты и программно.

---

## Атрибуты кастомизации

| Атрибут | Описание | Тип |
|--------|----------|-----|
| `sd_buttonStyleOverlay` | Стиль Button внутри Select | reference |
| `sd_textFieldStyleOverlay` | Стиль TextField внутри Select | reference |
| `sd_dropdownMenuStyleOverlay` | Стиль выпадающего меню | reference |
| `sd_emptyStateStyleOverlay` | Стиль пустого состояния | reference |

> Примечание: реальные имена стилей зависят от темы дизайн‑системы. Всегда предпочтительно использовать готовые стили `@style/{{ docs-theme-prefix }}.Components.Select`.

---

## Пример использования (Kotlin)

Пример создания Select программно, с добавлением плейсхолдера для пустого состояния:

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/select/Select_EmptyState.kt
```

---

## Пример использования в XML

```xml
<!-- @sample: com/sdds/uikit/fixtures/Select_Trigger_Button.xml -->
```

## Можно указать свой плейсхолдер для пустого состояния
```xml
<!-- @sample: com/sdds/uikit/fixtures/Select_EmptyState_PlaceHolder.xml -->
```
Или футер: 

```xml
<!-- @sample: com/sdds/uikit/fixtures/Select_EmptyState_Footer.xml -->
```
---

## Пример обработки данных

```kotlin
select.setItems(
    listOf(
        ListItem.simpleItem(1, "Иван Иванов"),
        ListItem.simpleItem(2, "Пётр Петров"),
        ListItem.simpleItem(3, "Анна Смирнова"),
    )
)
```

### Примечание 

Для удобства использования в Select уже установлена простая реализация адаптера, с необходимыми, для "быстрого  
старта" функциями. Вы можете создать свою собственную реализацию и установить adapter для Select. Стоит отметить, что  
в качестве adapter ожидается реализация абстрактного класса SelectAdapter, так как в нем уже реализована логика  
выбора элемента списка для разных режимов работы (single и multiple выбор). Режим выбора в adapter меняется с помощью  
`adapter.selectionMode` ожидаемый тип значения - enum `Select.SelectionMode`.

## SelectItem

Предназначен для использования в качестве элемента списка `Select`. Поддерживает состояние `checked`. 
В зависимости от типа `itemType` отображает в `checked` состоянии иконку (`SELECT_ITEM_TYPE_SINGLE`)  
или [CheckBox](./CheckBoxUsage.md) (`SELECT_ITEM_TYPE_MULTIPLE`).

## Атрибуты кастомизации

| Атрибут | Описание | Тип |
|--------|----------|-----|
| `sd_cellStyleOverlay` | стиль CellLayout внутри SelectItem | reference |
| `sd_checkBoxStyleOverlay` | стиль CheckBox внутри SelectItem | reference |
| `sd_background` | цвет фона | color, reference |
| `android:checked` | находится ли элемент в выбранном состоянии | boolean |
| `android:checkable` | может ли элемент быть выбранным | boolean |
| `sd_iconTint` | окрас иконки, отображающей состояние checked | color,reference |
| `sd_icon` | иконка, отображающая состояние checked | reference |
| `sd_controlMargin` | отступ основного контента от элемента отвечающего за checked состояние | dimension |
| `sd_controlSize` | размер области для элемента отвечающего за checked состояние | dimension |
| `sd_itemType` | тип SelectItem в Select | enum(single, multiple) |
|`layout_fileContent`|роли компонентов, размещаемых внутри SelectItem|enum(start, center, label, title, subtitle, end , disclosure)|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance). 

> Примечание: реальные имена стилей зависят от темы дизайн‑системы. Всегда предпочтительно использовать готовые стили `@style/{{ docs-theme-prefix }}.Components.SelectItem`.

---

## Пример использования в XML

```xml
<!-- @sample: com/sdds/uikit/fixtures/SelectItem_Simple.xml -->
```
