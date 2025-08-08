---
title: Accordion
---

`Accordion` — это UI-компонент для отображения списка разворачиваемых элементов. Каждый элемент можно открыть или закрыть с анимацией.  
Компонент основан на использовании [List](ListUsage.md) с `AccordionAdapter`, который управляет состоянием открытия элементов и их повторным использованием.

## Основные возможности

- Отображение вертикального списка с возможностью разворачивания элементов.
- Использование адаптера `AccordionAdapter` с автоматическим управлением состоянием.
- Кастомизация иконок, текста, стилей и анимаций для каждого элемента.
- Поддержка `RecyclerView` и повторного использования ViewHolder'ов.
- Адаптация под сложные макеты с разными типами контента.

## Атрибуты кастомизации

Атрибуты применяются к корневому компоненту `Accordion`:

| Атрибут | Описание | Тип |
|--------:|----------|-----|
| `sd_itemDividerEnabled` | Включает отображение разделителей между элементами | boolean |
| `sd_itemSpacing` | Задаёт отступ между элементами | dimension |
| `sd_accordionItemViewStyleOverlay` | Позволяет переопределить стиль элементов `AccordionItemView` внутри `Accordion` | reference |
| `sd_dividerStyleOverlay` | Позволяет переопределить стиль разделителей между элементами | reference |


Атрибуты применяются к `AccordionItemView`, который используется адаптером:

| Атрибут | Описание | Тип |
|--------:|----------|-----|
| `sd_opened` | Состояние: открыт ли элемент по умолчанию | boolean |
| `sd_title` | Текст заголовка | string |
| `sd_titleAppearance` | Стиль текста заголовка | reference |
| `sd_titleColor` | Цвет текста заголовка | color/reference |
| `sd_contentText` | Текст раскрываемого содержимого | string |
| `sd_contentTextAppearance` | Стиль текста содержимого | reference |
| `sd_contentTextColor` | Цвет текста содержимого | color/reference |
| `sd_closedIcon`, `sd_openedIcon` | Иконки состояний | reference |
| `sd_iconColor` | Цвет иконок | color |
| `sd_iconPadding`, `sd_iconPlacement` | Отступы и позиция иконок | dimension / enum |
| `sd_*Animation` | Анимации появления/исчезновения иконок | reference |
| `sd_headerPadding*`, `sd_contentPadding*` | Отступы заголовка и содержимого | dimension |
| `sd_shapeAppearance`, `sd_background` | Форма и фон элемента | reference / color |

## Пример использования

### XML: Accordion

```xml
<com.sdds.uikit.Accordion
    android:id="@+id/accordion"
    style="@style/{{ docs-theme-prefix }}.Components.Accordion.M"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

### Kotlin: Простая настройка
```kotlin
val accordion = findViewById<Accordion>(R.id.accordion)
// Используем простой адапетр из пакета com.sdds.uikit
val myAdapter = SimpleAccordionAdapter()
accordion.adapter = myAdapter

// Включаем разделители
accordion.itemDividerEnabled = true

// Устанавливаем данные
myAdapter.submitList(
    listOf(
        MyItem(id = 1L, title = "Пункт 1", description = "Описание 1"),
        MyItem(id = 2L, title = "Пункт 2", description = "Описание 2"),
        // ...
    )
)

// Открываем контент у первого элемента
myAdapter.setOpened(id = 1L, true)
```

### Kotlin: Кастомный адаптер

```kotlin
data class MyAccordionItem(
    override val id: Long,
    override val title: String,
    override val contentText: String?,
) : AccordionItem {
    override val hasDisclosure: Boolean = false
} 

class MyViewHolder(override val accordionItemView: AccordionItemView) : AccordionItemHolder<MyAccordionItem>(view) {
    
    private val customContent: TextView = accordionItemView.findViewById(R.id.customContent)
    
    override fun bind(item: MyAccordionItem) {
        // super.bind(item) автоматически свяжет данные из AccordionItem в AccordionItemView
        // А также возьмет на себя ответственность за открытие/закрытие контента
        super.bind(item)
        // Ваша кастомная логика связывания данных
        customContent.text = item.contentText
    }
}

class MyAccordionAdapter : AccordionAdapter<MyItem, MyViewHolder>() {
    
    override fun shouldAnimate(position: Int): Boolean {
        // Выключаем анимацию открытия/закрытия для первого элемента
        return position != 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_accordion, parent, false) as AccordionItemView
        return MyViewHolder(view)
    }
}
```

### XML: разметка элемента

```xml
<com.sdds.uikit.AccordionItemView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    style="@style/{{ docs-theme-prefix }}.Components.AccordionItem.M" >
    
    <!-- Кастомный дополнительный контент   -->
    <com.sdds.uikit.TextView
        android:id="@+id/customContent"/>
</com.sdds.uikit.AccordionItemView>
```

### Примечание
- Используйте AccordionAdapter для управления состоянием и анимацией.
- Методы isOpened(id: Long) и shouldAnimate(id: Long) можно переопределить для реализации кастомного поведения.
- AccordionItemView можно использовать повторно в разных стилях через sd_accordionItemViewStyleOverlay.