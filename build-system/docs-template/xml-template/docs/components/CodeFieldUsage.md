---
title: CodeField
---
Компонент CodeField представляет собой горизонтальный ряд текстовых полей. Каждое поле вмещает в себя один символ, введеный с клавиатуры.

После каждого ввода символа происходит автоматических переход к следующему.  
После заполнения всех символов, если код верный, осуществляется автоматических переход к следующему действию.  
Если код неверный - значения в полях сбрасываются и ввод осуществляется снова с первого символа.

Заполнение полей возможно только по порядку. Если требуется вернуться назад к одному из символов - необходимо удалить все впереди стоящие символы тоже.  

## Пример использования

### XML: Accordion

```xml
<com.sdds.uikit.CodeField
    android:id="@+id/codeField"
    style="@style/{{ docs-theme-prefix }}.Components.CodeField.M"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    app:sd_codeLength="4"
    android:layout_gravity="center"
    app:sd_caption="Caption"
    app:sd_hasCursor="true"
    app:sd_captionAlignment="center"/>
```

## Стиль CodeField

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
Для настройки стиля CodeField в формате xml предусмотрены следующие атрибуты:

| Атрибут | Описание | Тип |
|:-------:|:--------:|:---:|
|sd_codeLength|длина кода (количество ячеек для ввода)|integer|
|sd_captionAppearance|стиль текста подписи|reference|
|sd_itemShapeAppearance|форма скруглений ячейки|reference|
|sd_groupShapeAppearance|форма скруглений группы ячеек (наружние углы крайних ячеек)|reference|
|sd_itemHeight|высота ячейки|dimension|
|sd_itemWidth|ширина ячейки|dimension|
|sd_itemSpacing|отступ между ячейками|dimension|
|sd_groupSpacing|отступ между группой ячеек|dimension|
|sd_captionPadding|отступ поля для подписи|dimension|
|sd_captionColor|цвет текста подписи|reference,color|
|sd_hasCursor|наличие курсора|boolean|
|sd_valueAppearance|стиль текста вводимых символов|reference|
|sd_valueColor|цвет текста вводимых символов|reference,color|
|sd_strokeWidth|толщина обводки(бордера) точки, скрывающей вводимые символы|float,fraction,dimension|
|sd_strokeColor|цвет точки, скрывающей вводимые символы|reference,color|
|sd_dotSize|размер (диаметр) точки, скрывающей вводимые символы|dimension,float,reference|
|sd_dotColor|цвет точки, скрывающей вводимые символы|reference,color|
|sd_background|цвет фона ячейки|reference,color|
|sd_cursorColor|цвет курсора|reference,color|
|sd_caption|текст поля caption(подсказка)|string|
|sd_captionAlignment|выравнивание текста в поле caption|enum(left, center)|
|sd_focusGain|может ли ячейка получать фокус|boolean|
|android:inputType|задает тип вводимого контента|integer|
|android:imeOptions|задает дополнительные параметры при взаимодействии с текстовым полем|integer|

### Примечание

Для валидации введенного кода или единичного символа используйте лямбды onCodeComplete и onCharValidate, соответственно.
