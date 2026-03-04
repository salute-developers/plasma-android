---
title: ButtonGroup
---

Контент ButtonGroup формируется с помощью [Button](Button/ButtonUsage.md).

```xml
<!-- @sample: com/sdds/uikit/fixtures/ButtonGroup_Simple.xml -->
```

Или с помощью [IconButton](Button/ButtonUsage.md).

```xml
<!-- @sample: com/sdds/uikit/fixtures/IconButtonGroup_Simple.xml -->
```

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
