# Package com.sdds.uikit

## List

Компонент для отображения списка из элементов на основе RecyclerView.  
Можно использовать с ListViewAdapter в качестве RecyclerView.Adapter и [ListItemView](./ListItemUsage.md) в качестве элементов.

```kotlin
<com.sdds.uikit.ListView
    android:id="exampleList"
    style="@style/Serv.Sdds.Components.ListNormal.L"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
```

## Стиль List

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).
В xml возможно задать стиль самого List (или оверлэй стиль ListItem), но для отображение контента, необходимо  
программно задать адаптер и контент:

```kotlin
val listView = findViewById<ListView>(R.id.exampleList)
listView.adapter = SimpleListViewAdapter().apply{
    submitList(
        listOf(
            ListItem.simpleItem(
                id = 1,
                title = "First item",
                hasDisclosure = true,
            )
            ListItem.simpleItem(
                id = 2,
                title = "Second item",
                hasDisclosure = true,
            )
        )
    )
}
listView.layoutManger =  LinearLayoutManager(context)
```
