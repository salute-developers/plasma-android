---
title: NavigationDrawer
---

Компонент поддерживающий заголовок, нижний колонтитул, список элементов и анимацию раскрытия/сворачивания.  
Список элементов формируется с помощью NavigationDrawerItem.

## Стиль NavigationDrawer

Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль.  
Для конфигурирования стиля NavigationDrawer предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_itemStyle|стиль элемента|reference|
|sd_itemSelectorEnabled|включение селектора|boolean|
|sd_itemSelectorTint|цвет селектора|color|
|android:backgroundTint|цвет фона|color|
|sd_collapsedItemWidth|ширина свернутого элемента|dimension|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

## Стиль NavigationDrawerItem

Для конфигурирования стиля NavigationDrawerItem предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_counterEnabled|включение Counter|boolean|
|sd_expandedCounterStyle|стиль Counter в свернутом состоянии|reference|
|sd_collapsedCounterStyle|стиль Counter в развернутом состоянии|reference|
|sd_collapsedCounterOffsetX|смещение по X|dimension|
|sd_collapsedCounterOffsetY|смещение по Y|dimension|
|sd_iconTint|цвет иконки|color|

В качестве parent (базового стиля) NavigationDrawerItem следует использовать core стиль из SDDS UI Kit -
Sdds.Components.NavigationDrawerItem. Так как базовый стиль наследуется от стиля [ListItem](ListItemUsage.md#стиль-listitem) -
его атрибуты так же становятся доступны для конфигурирования. Для изменения размеров, отступов, стилизации текста -  
используйте стандартный атрибуты android.  

Ниже приведен пример использования. Где style - ресурс оверлэй стиля NavigationDrawer.

```kotlin
fun navigationDrawer(
    context: Context,
    @StyleRes style: Int = 0,
): NavigationDrawer {
    return NavigationDrawer(ContextThemeWrapper(context, style))
        .apply {
            val items = mutableListOf<NavigationDrawer.Item>()
            id = R.id.navigation_drawer
            setNavigationItemSelectedListener { true }
            mode = NavigationDrawerMode.AUTO
            repeat(state.amount) {
                    items.add(
                        NavigationDrawer.Item.Builder()
                            .setId(it)
                            .setTitle("Item Label")
                            .setIconResource(context, com.sdds.icons.R.drawable.ic_plasma_24)
                            .setCounter("123")
                            .build(),
                    )
                }
            setItems(items)
            setHeader(
                NavigationDrawer.Item.Builder()
                    .setId(R.id.navigation_drawer_header)
                    .setTitle(context.getString(R.string.testing_nav_header))
                    .setIconResource(context, com.sdds.icons.R.drawable.ic_view_person_fill_24)
                    .build()
            )
        }
}
```
