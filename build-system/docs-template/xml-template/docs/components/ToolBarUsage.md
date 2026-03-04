---
title: ToolBar
---

Вспомогательная панель с набором инструментов для работы на основном экране. Можно задать неограниченное  
количество секций/слотов. Для добавления контента в слоты предоставляются функции addViewToSection и  
addViewsToSection с указанием индекса слота, в который следует добавить контент. Так же возможно добавление  
через стандартную функцию addView, предварительно, задав контенту  ToolBar.LayoutParams и указав нужный индекс  
через свойство slotIndex. Для добавления  контента через xml предусмотрен атрибут sd_slotIndex. Для визуального  
разделения секций свойством hasDivider включается отображение [Divider](DividerUsage.md). Слоты, а так же  
разделители, в компоненте создаются автоматически, при указании количества, через свойство slotsAmount. В роли  
слотов в ToolBar используется android.widget.LinearLayout с LayoutParams(WRAP_CONTENT, WRAP_CONTENT) и gravity  
Gravity.CENTER_VERTICAL для горизонтального `ToolBar`, Gravity.CENTER_HORIZONTAL - для вертикального.  Ниже пример  
добавления контента в компонент.

```xml
<!-- @sample: com/sdds/uikit/fixtures/ToolBar_Simple.xml -->
```

## Стиль ToolBar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля `ToolBar` предусмотрены следующие атрибуты:  

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_background|цвет фона компонента|reference|
|sd_shadowAppearance|стиль тени под компонентом|reference|
|sd_hasDivider|включение отображения разделителя|boolean|
|sd_dividerStyleOverlay|оверлэй стиль разделителя Divider|reference|
|sd_slotsAmount|количество слотов для контента|integer|
|android:orientation|ориентация компонента|enum (horizontal, vertical)|
|sd_dividerMargin|отступ от краев Divider в горизонтальной ориентации marginTop и marginBottom в вертикальной - marginStart и marginEnd|dimension|
|sd_slotPadding|паддинг между слотами (устанавливается в конце текущего слота и в начале следующего)|dimension|

Компонентам, добавленным в Layout `ToolBar` доступны следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_slotIndex|индекс слота для добавления контента|integer|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  
