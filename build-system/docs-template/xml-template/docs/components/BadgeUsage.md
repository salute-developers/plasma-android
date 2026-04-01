---
title: Badge
---

```xml
<!-- @sample: com/sdds/uikit/fixtures/Badge_Simple.xml -->
```

<!-- @screenshot: com.sdds.uikit.fixtures.samples.badge.Badge_Simple -->

```xml
<!-- @sample: com/sdds/uikit/fixtures/IconBadge_Simple.xml -->
```

## Стиль Badge

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля Badge в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|android:drawableStart / android:drawableEnd|устанавливает ресурс drawable к начале и в конце Badge|reference|
|sd_contentStartSize / sd_contentEndSize|размер контента (drawable) в начале и в конце Badge|dimension|
|sd_drawableStartTint / sd_drawableEndTint|цвет контента (drawable) в начале и в конце Badge|color|
|sd_textPaddingStart / sd_textPaddingEnd|отступы от текста в  начале и в конце|dimension|

Для задания лэйбла (текста внутри Badge), а так же конфигурирования стиля и цвета текста - используйте  
стандартные атрибуты android(android:text, android:textAppearance, android:textColor).  
Для изменения цвета фона, а так же задания отступов(paddings), размера Badge - используйте  
стандартные атрибуты android (android:BackgroundTint, android:paddingStart, android:minHeight и другие).  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

## Стиль IconBadge

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля IconBadge в формате xml предусмотрены те же атрибуты, что и у Badge.  
Для корректного отображения IconBadge следует устанавливать drawable либо в начале либо в конце,  
устанавливать текст не следует.
