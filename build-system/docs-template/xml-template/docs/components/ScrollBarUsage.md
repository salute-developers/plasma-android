---
title: ScrollBar
---

Интерактивный индикатор для горизонтального или вертикального перемещения по контенту.  
Предназначен для совместного использования RecyclerView, ScrollView, HorizontalScrollView.  

```xml
<com.sdds.uikit.ScrollBar
    style="@style/{{ docs-theme-prefix }}.Components.ScrollBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:sd_autoHide="true" />
```

## Стиль ScrollBar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).   
Для настройки стиля TextSkeleton в формате xml предусмотрены следующие атрибуты:

| Название атрибута |                         Описание                          |           Формат данных            |
|:-----------------:|:---------------------------------------------------------:|:----------------------------------:|
|   sd_trackColor   |             цвет неподвижной части скроллбара             |          color, reference          |
|   sd_thumbColor   |          цвет подвижной части скроллбара integer          |          color, reference          |
|  sd_hoverExpand   | будет ли увеличиваться скроллбар при взаимодействии с ним |              boolean               |
|  sd_expandFactor  |   фактор увеличения скроллбара при взаимодействии с ним   |               float                |
|  sd_orientation   |                    ориентация скролла                     | enum(vertical, horizontal, unknow) |
|    sd_autoHide    |      автоматически крывать скроллбар при бездействии      |              boolean               |
|    sd_hasTrack    |              отображение трека у  скроллбара              |              boolean               |
|   sd_thickness    |                    толщина скроллбара                     |             dimension              |

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).

Для использования, необходимо в контейнере (ViewGroup), например FrameLayout, разместить  
RecyclerView и ScrollBar, в ScrollBar воспользоваться функцией attachToRecyclerView, передав туда ссылку на RecyclerView.  
Тем же способом можно поступить со ScrollView и HorizontalScrollView,  для них есть функция attachToScrollView.  
Позиционирование ScrollBar можно настроить с помощью gravity, либо через constraints (в зависимости от родительского контейнера).  

*style - ресурс оверлэй стиля ScrollBar

```kotlin
val actualContext = ContextThemeWrapper(context, style)
val recycler = RecyclerView(context).apply {
    id = R.id.recycler
    layoutParams = FrameLayout.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT,
    )
    layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
}
val scroll = ScrollBar(actualContext).apply {
    id = R.id.scroll_bar
    attachToRecyclerView(recycler)
}
val scrollContainer = FrameLayout(context).apply {
    id = R.id.scroll_container
    setPadding(6)
    addView(recycler)
    addView(scroll)
}
```
