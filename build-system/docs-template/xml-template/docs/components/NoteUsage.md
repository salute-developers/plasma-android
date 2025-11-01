---
title: Note и NoteCompact
---
Компонент для отображения краткой статусной информации внутри контентного блока.  
Реализован в двух ориентациях вертикальной - Note и горизонтальной - NoteCompact.

Компонент наследует FrameLayout, для добавления view в слоты Action и ContentBefore  
можно воспользоваться удобными функциями addAction и addContentBefore, передав в аргументы view.
При добавлении view стандартным способом, необходимо задать Note.LayoutParams, в которых указать  
noteContent: NoteContent (NoteContent.ACTION или NoteContent.CONTENT_BEFORE) для размещения в  
нужном слоте. По умолчанию, при отсутствии параметра noteContent, view будет размещена в слоте  
ContentBefore.  Для корректного отображения, компоненты Note и NoteCompact реализованы так,  
что могут отобразить только одну view в каждой из секций, поэтому, при добавлении новых view  
в слот, старые view будут автоматически удалены. Компонент автоматически предопределяет стиль  
только для компонента [LinkButton](ButtonUsage.md#стиль-linkbutton), для стилизации других компонентов необходимл  
вручную указывать стиль этого компонента. Для удобного добавления иконки, в слот ContentBefore,  
достаточно указать ее ресурс, воспользовавшись функцией setIconResource или через атрибут sd_icon.  
Альтернативным вариантом является добавление компоннета ImageView, с установленной заранне иконкой.

``` kotlin
 addContentBefore(
    ImageView(context).apply {
        setImageResource(R.drawable.ic_salute_fill_36)
    },
)
```

Окрас иконки в слоте ContentBefore синхронизирован со стилем компонента Note/NoteCompact.

## Использование Note в xml

```xml
<com.sdds.uikit.NoteCompact
    style="@style/{{ docs-theme-prefix }}.Components.Note.L.HasClose.Negative"
    app:sd_title="Title"
    app:sd_text="Text"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" >

    <com.sdds.uikit.ImageView
        app:layout_noteContent="contentBefore"
        android:src="@drawable/ic_salute_outline_24"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.LinkButton
        app:layout_noteContent="action"
        android:text="Label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    
</com.sdds.uikit.NoteCompact>
```

## Использование NoteCompact в xml

```xml
<com.sdds.uikit.NoteCompact
    style="@style/{{ docs-theme-prefix }}.Components.NoteCompact.L.HasClose.Positive"
    app:sd_title="Title"
    app:sd_text="Text"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" >

    <com.sdds.uikit.ImageView
        app:layout_noteContent="contentBefore"
        android:src="@drawable/ic_salute_outline_24"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <com.sdds.uikit.LinkButton
        app:layout_noteContent="action"
        android:text="Label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    
</com.sdds.uikit.NoteCompact>
```

## Стили

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля Note предусмотрены следующие атрибуты:

### Note

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_linkButtonStyleOverlay|оверлэй стиль компонента LinkButton|reference|
|sd_background|цвет фона|color, reference|
|sd_title|Заголовок|string|
|sd_text|Текст|string|
|sd_titleAppearance|Стиль текста в заголовке|reference|
|sd_textAppearance|Стиль текста|reference|
|sd_titleColor|Цвет текста в заголовке|color,reference|
|sd_textColor|Цвет текста|color,reference|
|sd_contentBeforeArrangement|Расположение contentBefore| enum(top,center,bottom)|
|sd_textTopMargin|Отступ текста от заголовка|dimension|
|sd_contentBeforeEndMargin|Отступ contentBefore от текстового блока|dimension|
|sd_icon|Ссылка на ресурс иконки в contentBefore|reference|
|sd_iconSize|Размер иконки в contentBefore|dimension|
|sd_iconTint|Окрас иконки в contentBefore|color,reference|
|sd_closeIcon|Ссылка на ресурс иконки close|reference|
|sd_closeIconTint|Окрас иконки close|color,reference|
|sd_closeIconSize|Размер иконки close|dimension|
|sd_titlePaddingEnd|Отступ заголовка от иконки close|dimension|
|sd_closeTopMargin|Верхний отступ иконки close|dimension|
|sd_closeEndMargin|Отступ в конце иконки close|dimension|
|sd_actionTopMargin|Верхний отступ action (отступ от text)|dimension|

### NoteCompact

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_closeStartMargin|Отступ в начале иконки close|dimension|
|sd_actionStartMargin|Отступ в начале action (отступ от text)|dimension|
|sd_actionEndMargin|Отступ в конце action (отступ от close)|dimension|

Так же для NoteCompact доступны все атрибуты Note

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

### Для расположения дочерних view

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|layout_noteContent|Расположение дочерних view в Note и NoteCompact|enum(contentBefore, action)|
