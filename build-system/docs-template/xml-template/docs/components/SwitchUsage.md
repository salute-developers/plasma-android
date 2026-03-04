---
title: Switch
---

```xml
<!-- @sample: com/sdds/uikit/fixtures/Switch_Simple.xml -->
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
<!-- @sample: com/sdds/uikit/fixtures/Switch_Background.xml -->
```

### Изменение цвета фона у Switch, в зависимости от фокуса

```xml
<!-- @sample: com/sdds/uikit/fixtures/bg_switch_sample.xml -->
```

```xml
<!-- @sample: com/sdds/uikit/fixtures/Switch_Custom_Color.xml -->
```
