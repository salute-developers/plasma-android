---
title: TextField
---

```xml
<com.sdds.uikit.TextField
    style="@style/{{ docs-theme-prefix }}.Components.TextField.L"
    app:sd_label="Label"
    app:sd_value="Value"
    app:sd_suffixText="TA"
    app:sd_caption="Caption"
    app:sd_indicatorSize="10dp"
    app:sd_icon="@drawable/ic_arrow_down_16"
    app:sd_iconPadding="20dp"
    app:sd_requirementMode="start"
    app:sd_counter="1234"
    app:sd_labelPadding="10dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## Стиль TextField

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля TextField в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_label|текст лэйбла|string|
|sd_labelAppearance|стиль лэйбла|reference|
|sd_labelColor|цвет лэбла|color, reference|
|sd_labelPadding|отступ лэйбла от value|dimension|
|sd_labelPlacement|расположение лэйбла|enum (none, outer, inner)|
|sd_value|основной текст|string|
|sd_valueAppearance|стиль основного текста|reference|
|sd_valueColor|цвет основного текста|color, reference|
|sd_placeholder|текст плйсхолдера|string|
|sd_placeholderAppearance|стиль текста плэйхолдера|reference|
|sd_placeholderColor|цвет текста плэйсхолдера|color, reference|
|sd_caption|текст подписи|string|
|sd_captionEnabled|включение / выключение подписи|boolean|
|sd_captionPlacement|расположение подписи|enum (none, outer, inner)|
|sd_captionAppearance|стиль текста подписи|reference|
|sd_captionColor|цвет подписи|color, reference|
|sd_counter|текст счетчика|string|
|sd_counterEnabled|включение / выключение счетчика|boolean|
|sd_counterPlacement|расположение счетчика|enum (none, outer, inner)|
|sd_counterAppearance|стиль текста счетчика|reference|
|sd_counterColor|цвет текста счетчика|color, reference|
|sd_requirementMode|тип текстового поля - обязательно к заполнению или опционально (работает если задан sd_indicatorSize)|enum (optional, start, end)|
|sd_indicatorSize|размер индикатора|dimension|
|sd_indicatorOffsetX|смещение индикатора от границы по оси X|dimension|
|sd_indicatorOffsetY|смещение индикатора от границы по оси Y|dimension|
|sd_icon|иконка (drawable ) в начале (перед основным текстом - Value)|reference|
|sd_iconTint|цвет иконки|color|
|sd_iconSize|размер иконки|dimension|
|sd_iconPadding|отступ от иконки до основного текста - Value|dimension|
|sd_action|иконка (drawable ) в конце (после основного текста - Value)|reference|
|sd_actionTint|цвет иконки|color|
|sd_actionSize|размер иконки|dimension|
|sd_actionPadding|отступ после основного текста - Value до иконки|dimension|
|sd_alignmentLineHeight|высота первой строки контента|dimension|
|sd_boxMinHeight|минимальная высота текстового поля|dimension|
|sd_boxTint|цвет фона текстового поля|color|
|sd_boxPadding||dimension|
|sd_boxPaddingStart|отступ в начале текстового поля|dimension|
|sd_boxPaddingTop|отступ сверху текстового поля|dimension|
|sd_boxPaddingEnd|отступ в конце текстового поля|dimension|
|sd_boxPaddingBottom|отступ снизу текстового поля|dimension|
|sd_chipGroupStyleOverlay|стиль компонента ChipGroup, если задан, то при вводе текста и нажатии клавиши пробел, введенный текст оборачивается в комопнент Chip с иконкой закрытия (удаления Chip) |reference|
|sd_chipsPadding|оступы между Chip в текстовом поле|dimension|
|sd_suffixText|текст после value|string|
|sd_suffixDrawable|drawable после value|reference|
|sd_suffixTextPadding|отступ между основным текстом (value) и suffix|dimension|
|sd_prefixText|текст перед value|string|
|sd_prefixDrawable|drawable перед value|reference|
|sd_prefixTextPadding|отступ между основным текстом (value) и prefix|dimension|
|sd_scrollBarEnabled|включение / выключение полосы прокрутки|boolean|
|sd_scrollBarThickness|толщина индикатора прокрутки|dimension|
|sd_scrollBarPaddingTop|отступ сверху|dimension|
|sd_scrollBarPaddingEnd|отступ в конце|dimension|
|sd_scrollBarPaddingStart|отступ в начале|dimension|
|sd_scrollBarPaddingBottom|оступ снизу|dimension|
|sd_scrollBarTrackColor|цвет фона полосы прокрутки|color, reference|
|sd_scrollBarThumbColor|цвет индикатора прокрутки|color, reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

## TextArea

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки.  
Для настройки стиля TextArea в формате xml предусмотрены те же атрибуты, что у TextField,  
так как эти два компонента отличаются друг от друга только визуально.

```xml
<com.sdds.uikit.TextArea
    style="@style/{{ docs-theme-prefix }}.Components.TextArea.L"
    app:sd_label="Label"
    app:sd_value="Value"
    app:sd_suffixText="TA"
    app:sd_caption="Caption"
    app:sd_indicatorSize="10dp"
    app:sd_requirementMode="end"
    app:sd_counter="12"
    app:sd_labelPadding="10dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

## TextField readOnly

При включении этого параметра компоннет сатновится доступным только для чтения, изменение текстовых полей невозможно.

## TextField value

Если текст для value не задан, будет отображен текст, который задан в placeholder, в качестве hint.
