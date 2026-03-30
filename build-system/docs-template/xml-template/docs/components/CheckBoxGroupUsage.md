---
title: CheckBoxGroup
---

Контент CheckBoxGroup формируется с помощью [CheckBox](CheckBoxUsage.md#checkbox).

```xml
<!-- @sample: com/sdds/uikit/fixtures/CheckBoxGroup_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.checkbox.group.CheckBoxGroup_Simple -->

## Стиль CheckBoxGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля CheckBoxGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_hasMain|с помощью этого атрибута первый CheckBox в группе становится главным. Это значит, что он управляет состоянием checked всех CheckBox'ов, у самого RootCheckBox при этом появляется состояние Indeterminate - когда один из CheckBox'ов в группе не checked, а остальные checked|boolean|
|sd_itemOffset|отступ главного CheckBox от остальных|dimension|
|sd_itemSpacing|отступ между всеми CheckBox в группе|dimension|
|sd_checkBoxStyleOverlay|стиль CheckBox, которые находятся в группе|reference|
