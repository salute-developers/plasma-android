---
title: File
---

Компонент File позволяет компоновать дочерние view согласно заданным им ролей FileContent при помощи
атрибута R.styleable.File_Layout_layout_fileContent. Предназначен для отображения информации о загружаемом
контенте, показывая прогресс загрузки с помощью компонентов ProgressBar и CircularProgressBar. 
Компонент построен на android.widget.LinearLayout, содержит [Cell](CellUsage.md), в котором распределяется
весь передаваемый контент, за исключением горизонтального [ProgressBar](ProgressUsage.md) - он располагается
под Cell. При передаче контента в File, происходит автоматическая конвертация FileLayoutParams в   
СellLayoutParams. Для установки и удаления контента разработаны удобные функции вида setLabel,  removeLabel и т.д.,     
так же добавлять контент можно через стандартные перегрузки функции addView.  


## Использование File в xml

```xml
<com.sdds.uikit.File xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/file"
    style="@style/{{ docs-theme-prefix }}.Components.FileCircularProgress.L.Negative"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.sdds.uikit.ImageView
        android:id="@+id/componentFileIcon"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_file_check_fill_24"
        app:layout_fileContent="icon" />

    <com.sdds.uikit.IconButton
        android:id="@+id/componentFileIconButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_fileContent="action"
        app:sd_icon="@drawable/ic_close_24" />

    <com.sdds.uikit.TextView
        android:id="@+id/componentFileLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label"
        app:layout_fileContent="label" />

    <com.sdds.uikit.TextView
        android:id="@+id/componentFileDescription"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Description"
        app:layout_fileContent="description" />


    <com.sdds.uikit.CircularProgressBar
        android:id="@+id/componentFileCircularPB"
        android:gravity="center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_fileContent="progress"
        app:sd_progress="0.5" >

        <com.sdds.uikit.IconButton
            android:id="@+id/actionInProgress"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            app:layout_fileContent="action"
            app:sd_icon="@drawable/ic_close_16" />

    </com.sdds.uikit.CircularProgressBar>

</com.sdds.uikit.File>
```

Обратите внимание, что у каждого вложенного компонента указана роль layout_fileContent.  
Стоит так же отметить, что внутри File предусмотрена автоматическая стилизация компонентов 
ProgressBar, CircularProgressBar и IconButton (использующегося в качестве Action) если заданы атрибуты  
заданы R.styleable.File_sd_circularProgressBarStyleOverlay, R.styleable.File_sd_progressBarStyleOverlay,  
R.styleable.File_sd_iconButtonStyleOverlay.

## Стили

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для конфигурирования стиля File предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|sd_circularProgressBarStyleOverlay|Оверлэй стиль компонента CircularProgressBar|reference|
|sd_progressBarStyleOverlay|Оверлэй стиль компонента ProgressBar|reference|
|sd_iconButtonStyleOverlay|Оверлэй стиль компонента IconButton|reference|
|sd_contentStartPadding|отступ после контента, расположенного в начале|dimension|
|sd_contentEndPadding|отступ перед контентом, расположенным в конце|dimension|
|sd_contentBottomPadding|отступ перед контентом, расположенным снизу|dimension|
|sd_descriptionPadding|отступ между Label и Description|dimension|
|sd_labelAppearance|стиль текста Label|reference|
|sd_labelColor|цвет текста Label|reference,color|
|sd_iconTint|окрас иконки|reference,color|
|sd_descriptionAppearance|стиль текста Description|reference|
|sd_descriptionColor|цвет текста Description|reference,color|
|sd_isLoading|перевод компонента в состояние загрузки|boolean|
|sd_progressPlacement|Расположение компонента с ролью прогресс|enum(inner, outer)|
|sd_actionPlacement|расположение компонента с ролью Action|enum(start, end)|
|layout_fileContent|роли компонентов, размещаемых внутри File|enum(image, icon, action, progress, label, description)|

## Размещение контента внутри CircularProgressBar

Обратите внимание, в примере выше, CircularProgressBar так же содержит некий Action внутри себя, это возможно  
благодаря тому, что CircularProgressBar - FrameLayout. Вы можете располагать любой контент внутри CircularProgressBar,  
выравнивая его с помощью gravity. Примером такого использования может послужить необходимость отмены загрузки, если  
таковая уже началась. Объяснение этому описано в разделе [isLoading](FileUssage.md#isloading)

## isLoading

Режим компонента, в котором отображается компонент прогресс. Особенностью этого режима является то, что если,  
в качестве прогресса используется компонент CircularProgressBar, все компоненты, находящиеся в одном слоте с  
прогрессом будут скрыты. Например: actionPlacement выставлен в end и присутствует компонент с ролью Action,  
это означает, что при isLoading = true будет показан компонент CircularProgressBar, а компонент с ролью  
Action скрыт. Если же в качестве компонента прогресса используется горизонтальный ProgressBar, то компонент с  
ролью Action не будет скрываться, это объясняется тем, что ProgressBar расположен НЕ в Cell.

## ActionPlacement

При переключении этого свойства, роли компонентов внутри Cell переприсваиваются автоматически, компоненты  
с ролью Action и Progress меняют свое положение внутри компонента относительно Label и Description.
При этом, если в File имеются компоненты с ролями Image или Icon, и actionPlacement = ACTION_PLACEMENT_START,  
то эти компоненты будут скрыты.

## ProgressPlacement

Указывает на то, какой компонент прогресса отобразить, если isLoading = true. Если добавлены оба компонента,  
и ProgressBar в качестве горизонтального прогресса и CircularProgressBar в качестве круглого прогресса, будет
отображен только один из них. При PROGRESS_PLACEMENT_OUTER- горизонтальный прогресс, при PROGRESS_PLACEMENT_INNER -  
круглый прогресс.