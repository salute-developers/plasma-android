# Package com.sdds.uikit

## DropDownMenu

Всплывающее окно — появляется при клике на элемент(триггер), используется для отображения списка элементов поверх контента.  
Разработано на основе [Popover](./PopoverUsage.md). Контент формируется из DropDownMenuItem.

## Стили DropDownMenu и DropDownMenuItem

Существует набор сгенерированных стилей как для DropDownMenu так и для DropDownMenuItem. Готовые стили наследованы от стилей  
[List](./ListUsage.md#стиль-list) и [ListItem](./ListItemUsage.md#стиль-listitem) соответственно. Поэтому их атрибуты доступны  
для конфигурирования. Так же можно создать стили самостоятельно, при этом рекомендуется указать в качестве parent  
(базовый стиль) core стиль из SDDS UI Kit - Sdds.Components.List и ListItem.
Для конфигурирования стиля DropDownMenu преддусмтотрены следующие дополнительные атрибуты.

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_itemDividerEnabled|включение разделителя между элементами списка|boolean|
|sd_listViewStyleOverlay|стиль элемента списка|reference|
|sd_dividerStyleOverlay|стиль разделителя элементов|reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
Для отображения DropDownMenu, как и для [Popover](./PopoverUsage.md) предусмотрена функция showWithTrigger,  
ниже приведен пример использования. Где style - ресурс оверлэй стиля DropDownMenu.

```kotlin
val context = requireContext()
val dropMenu = DropDownMenu(ContextThemeWrapper(context, style)).apply {
    itemAdapter = SimpleListViewAdapter()
    itemListView.itemAnimator = null
    itemDividerEnabled = state.itemDividerEnabled
    setItems<SimpleListViewAdapter>(
        mutableListOf<ListItem>().apply {
            repeat(5) {
                add(
                    ListItem.simpleItem(
                        id = it.toLong(),
                        title = "Title",
                        hasDisclosure = true,
                    ),
                )
            }
        },
    )
}

val trigger = Button(context).apply {
    id = R.id.dropdown_menu_trigger
    text = "Show DropdownMenu"
    setOnClickListener { dropMenu.showWithTrigger(
        trigger = it,
        placement = Popover.PLACEMENT_START,
        placementMode = Popover.PLACEMENT_MODE_LOOSE,
        alignment = Popover.ALIGNMENT_START,
        )
    }
}
```
