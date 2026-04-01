---
title: ChipGroup
---

Контент ChipGroup формируется с помощью [Chip](ChipUsage.md#chip).

```xml
<!-- @sample: com/sdds/uikit/fixtures/ChipGroup_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.chip.group.ChipGroup.Simple -->

## Стиль ChipGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля ChipGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_gap|отступ между чипами|dimension|
|sd_lineSpacing|Отступ между строками при переносе Chip на следующую строку|dimension|
|sd_chipStyleOverlay|стиль Chip в группе|reference|
|android:gravity|расположение Chip в группе, если параметры layout у ChipGroup не wrapContent|enum|
