---
title: Autocomplete
---

`Autocomplete` — это компонент ввода текста с выпадающим списком подсказок.  
Он показывает список доступных вариантов при вводе текста, позволяет настраивать источник данных, отображение пустого состояния и футера, а также внешний вид поля ввода.

## Основные возможности

- Ввод текста с автоматическим отображением подсказок.
- Поддержка статического и динамического списка элементов.
- Пустое состояние (`EmptyStateView`) при отсутствии подсказок.
- Нижний футер (`FooterView`) — например, индикатор загрузки.
- Гибкая настройка через XML-атрибуты и программно.
- Автоматическое открытие/закрытие выпадающего меню при фокусе и вводе текста.

---

## Атрибуты кастомизации

| Атрибут | Описание | Тип |
|--------|----------|-----|
| `sd_textFieldStyleOverlay` | Стиль TextField внутри Autocomplete | reference |
| `sd_dropdownMenuStyleOverlay` | Стиль выпадающего меню | reference |
| `sd_emptyStateStyleOverlay` | Стиль пустого состояния | reference |

> Примечание: реальные имена стилей зависят от темы дизайн‑системы. Всегда предпочтительно использовать готовые стили `@style/{{ docs-theme-prefix }}.Components.Autocomplete`.

---

## Пример использования (Kotlin)

Пример создания Autocomplete программно:

```kotlin
val autocomplete = Autocomplete(context).apply {
    // Настройка текстового поля
    textField.caption = "Введите имя"
    textField.placeholder = "Сотрудник"
    textField.setAction(R.drawable.ic_search_24)

    // Пример динамического списка
    setItemProducer { text ->
        items.filter { it.title.contains(text, ignoreCase = true) }
    }
}

// Добавление пустого состояния и футера
autocomplete.setDropdownEmptyStateView(
    DropdownEmptyStateView(context).apply {
        setDescription("Нет совпадений")
    }
)

autocomplete.setDropdownFooterView(
    DropdownFooterView(context).apply {
        setContent("Загрузка…")
    }
)

parent.addView(autocomplete)
```

---

## Пример использования в XML

```xml
<com.sdds.uikit.Autocomplete
    android:id="@+id/autocomplete"
    style="@style/{{ docs-theme-prefix }}.Components.Autocomplete"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
```

## Можно указать свой TextField

```xml
<com.sdds.uikit.Autocomplete
    android:id="@+id/autocomplete"
    style="@style/{{ docs-theme-prefix }}.Components.Autocomplete"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.sdds.uikit.TextField
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</com.sdds.uikit.Autocomplete>
```

## Можно указать свой плейсхолдер для пустого состояния
```xml
<com.sdds.uikit.Autocomplete
    android:id="@+id/autocomplete"
    style="@style/{{ docs-theme-prefix }}.Components.Autocomplete"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    
    <com.sdds.uikit.dropdown.DropdownEmptyStateView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:sd_description="Нет данных"
        app:sd_icon="@drawable/ic_info" />

</com.sdds.uikit.Autocomplete>
```
Или футер: 

```xml
<com.sdds.uikit.Autocomplete
    android:id="@+id/autocomplete"
    style="@style/{{ docs-theme-prefix }}.Components.Autocomplete"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    
    <com.sdds.uikit.dropdown.DropdownFooterView
        android:layout_width="match_parent"
        android:layout_height="48dp">

        <com.sdds.uikit.TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Загрузка…"
            android:layout_gravity="center" />
    </com.sdds.uikit.dropdown.DropdownFooterView>

</com.sdds.uikit.Autocomplete>
```
---

## Пример обработки данных

```kotlin
autocomplete.setItems(
    listOf(
        ListItem.simpleItem(1, "Иван Иванов"),
        ListItem.simpleItem(2, "Пётр Петров"),
        ListItem.simpleItem(3, "Анна Смирнова"),
    )
)
```

Динамический список:

```kotlin
autocomplete.setItemProducer { query ->
    allUsers.filter { it.title.contains(query, ignoreCase = true) }
}
```
---
