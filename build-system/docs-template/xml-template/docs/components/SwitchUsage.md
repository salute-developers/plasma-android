---
title: Switch
---

```xml
<com.sdds.uikit.Switch
    style="@style/{{ docs-theme-prefix }}.Components.Switch.L.ToggleS"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Label"
    app:sd_description="Description" />
```

## Стиль Switch

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки.  
Для настройки стиля Switch в формате xml предусмотрены следующие атрибуты:

|      Название атрибута       |                     Описание                     |Формат данных|
|:----------------------------:|:------------------------------------------------:|:-:|
|        sd_description        |         дополнительный текст (описание)          |string|
| sd_descriptionTextAppearance |           стиль дополнительного текста           |reference|
|   sd_descriptionTextColor    |           цвет дополнительного текста            |color, reference|
|    sd_descriptionPadding     | отступ дополнительного текста от нижней границы  |dimension|
|   android:drawablePadding    |        отступ основного текста от toggle         |dimension|
|        sd_switchWidth        |      ширина неподвижной части переключателя      |dimension|
|       sd_switchHeight        |      высота неподвижной части переключателя      |dimension|
|     sd_switchBorderWidth     |        толщина бордера неподвижной части         |dimension|
|     sd_buttonTrackColor      |       цвет неподвижной части переключателя       |color, reference|
|  sd_buttonTrackBorderColor   |   цвет бордера неподвижной части переключателя   |color, reference|
|     sd_buttonThumbColor      |        цвет подвижной части переключателя        |color, reference|
|        sd_thumbWidth         |       ширина подвижной части переключателя       |dimension|
|        sd_thumbHeight        |       высота подвижной части переключателя       |dimension|
|       sd_thumbPadding        |       отступ подвижной части переключателя       |dimension|
|   sd_thumbShapeAppearance    |  форма скругления подвижной части переключателя  |reference|
|   sd_trackShapeAppearance    | форма скругления неподвижной части переключателя |reference|
|      sd_shapeAppearance      |              форма скругления фона               |reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

## Установка фона у Switch

:::warning
Если в вашей дизайн системе есть состояние Switch с фоном, то скорее всего для этого состояния есть готовый стиль. 
Всегда используйте готовые стили.
:::

```xml
<com.sdds.uikit.Switch
    style="..."
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Label"
    app:sd_description="Description"
    app:sd_background="?{{ docs-theme-resPrefix }}_surfaceDefaultSolidDefault"
    app:sd_shapeAppearance="?{{ docs-theme-resPrefix }}_shapeRoundM"
/>
```

### Изменение цвета фона у Switch, в зависимости от фокуса

```xml
<!-- @color/bg_switch_example -->
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:color="?{{ docs-theme-resPrefix }}_surfaceDefaultSolidDefault" android:state_focused="true"/>
    <item android:color="?{{ docs-theme-resPrefix }}_surfaceDefaultClear"/>
</selector>
```

```xml
<com.sdds.uikit.Switch
    style="..."
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Label"
    app:sd_description="Description"
    app:sd_background="@color/bg_switch_example"
    app:sd_shapeAppearance="?{{ docs-theme-resPrefix }}_shapeRoundM"
/>
```
