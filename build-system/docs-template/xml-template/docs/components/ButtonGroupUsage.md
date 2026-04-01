---
title: ButtonGroup
---

Контент ButtonGroup формируется с помощью [Button](Button/BasicButtonUsage.md).

```xml
<!-- @sample: com/sdds/uikit/fixtures/ButtonGroup_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.button.group.ButtonGroup_Simple -->

Или с помощью [IconButton](Button/BasicButtonUsage.md).

```xml
<!-- @sample: com/sdds/uikit/fixtures/IconButtonGroup_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.button.group.IconButtonGroup_Simple -->

## Стиль ButtonGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля ButtonGroup в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_buttonStyleOverlay|оверлэй стиль кнопки|reference|
|sd_externalShapeAppearance|форма скруглений наружных углов у крайних элементов группы|reference|
|sd_internalShapeAppearance|форма скруглений углов элементов группы |reference|
|sd_buttonSpacing|отступ между элементами внутри группы|dimension|
