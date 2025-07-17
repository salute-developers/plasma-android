---
title: Badge
---

```xml
<com.sdds.uikit.Badge
    style="@style/{{ docs-theme-prefix }}.Components.BadgeSolid.L.Warning"
    android:text="Badge"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    />
```

```xml
 <com.sdds.uikit.IconBadge
    style="@style/{{ docs-theme-prefix }}.Components.IconBadgeSolid.L.Accent"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:drawableStart="@drawable/ic_bank_card_lock_outline_16"
/>
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
