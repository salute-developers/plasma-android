# Package com.sdds.uikit

## Flow

Компонент FlowLayout (a.k.a Flow) контейнер, который упорядочивает компоненты в направленном потоке, подобно строкам текста в абзаце.  
Компоненты добавляются в контейнер последовательно: каждый новый элемент располагается вслед за предыдущим в направлении слева направо и сверху вниз.  
Если на одной строке не хватает места, часть компонентов переносится на следующую строку.

```kotlin
    <com.sdds.uikit.FlowLayout
        app:sd_mainAxisGap="5dp"
        app:sd_crossAxisGap="5dp"
        app:sd_alignment="end"
        app:sd_arrangement="center"
        app:sd_itemsPerLine="3"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <com.sdds.uikit.Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="LabeL"
            app:sd_value="Value" />

        <com.sdds.uikit.Button
            style="@style/Serv.Sdds.Components.BasicButton.Xs"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="LabeL"
            app:sd_value="Value" />

        <com.sdds.uikit.Button
            style="@style/Serv.Sdds.Components.BasicButton.Xs"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="LabeL"
            app:sd_value="Value" />

        <com.sdds.uikit.Button
            style="@style/Serv.Sdds.Components.BasicButton.Xs"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="LabeL"
            app:sd_value="Value" />
    </com.sdds.uikit.FlowLayout>
```

## Настройка Flow

Для настройки Flow в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_mainAxisGap|отступ между компонентами по основной оси(для горизонтальной ориентации - ось х, для вертикальной - y)|dimension|
|sd_crossAxisGap|отступ между компонентами по оси пересекающей основную|dimension|
|android:orientation|ориентация контейнера|enum(horizontal, vertical)|
|sd_alignment|выравнивание элементов внутри строк по вертикали при горизонтальной ориентации, или внутри столбцов по горизонтали при вертикальной|enum(start, center, end)|
|sd_arrangement|расположение элементов относительно выбранной ориентации|enum(start, center, end, space_between, space_around)|
|sd_itemsPerLine|количество элементов в строке|dimension|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  
Для настройки и корректировки фокус селектора используйте [настройки фокус-селектора](./FocusSelectorUsage.md).  
