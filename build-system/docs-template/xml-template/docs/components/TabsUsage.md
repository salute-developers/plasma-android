---
title: Tabs
---

Компонент **Tabs** — это контейнер вкладок с поддержкой:
- горизонтальной и вертикальной ориентации;
- трёх режимов размещения: прокрутка, растяжение и «пока хватает места» (IF_ROOM);
- индикатора выбранной вкладки;
- скрытия невместившихся вкладок в disclosure-элемент (кнопка «ещё»);
- кнопок перелистывания (prev/next) в режиме прокрутки.

Tabs работает с дочерними элементами **TabItem** (текст + иконка) и **IconTabItem** (только иконка с опциональным счётчиком). Их можно объявлять в XML или собирать программно через билдеры `Tabs.Tab.builder(...)` и `Tabs.IconTab.builder(...)`.

---

## Быстрый старт

### XML
```xml
<com.sdds.uikit.Tabs
    android:id="@+id/tabs"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    app:sd_tabIndicatorColor="@color/sd_color_state_primary"
    app:sd_tabIndicatorThickness="2dp"
    app:sd_tabsMinSpacing="8dp"
    app:sd_dividerEnabled="true"
    app:sd_overflowIconsEnabled="true"
    app:sd_overflowPrevIcon="@drawable/ic_chevron_left"
    app:sd_overflowNextIcon="@drawable/ic_chevron_right"
    app:sd_disclosureIcon="@drawable/ic_more_horiz"
    app:sd_disclosureText="Ещё"
    app:sd_disclosureColor="@color/sd_color_state_secondary"
    app:sd_tabItemStyleOverlay="@style/Widget.Sdds.TabItemOverlay">

    <!-- Текст + иконка -->
    <com.sdds.uikit.TabItem
        android:id="@+id/tab_home"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Главная"
        app:sd_actionEnabled="true"
        app:sd_action="@drawable/ic_close_16"/>

    <com.sdds.uikit.TabItem
        android:id="@+id/tab_profile"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Профиль"/>

    <!-- Только иконка (IconTabItem) с возможным счётчиком -->
    <com.sdds.uikit.IconTabItem
        android:id="@+id/tab_notifications"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:sd_counterOffsetX="2dp"
        app:sd_counterOffsetY="2dp"/>

</com.sdds.uikit.Tabs>
```

> Внутренний `Tabs` автоматически превратит дочерние `TabItem`/`IconTabItem` в элементы вкладок.

### Код (Kotlin)
```kotlin
val tabs: Tabs = findViewById(R.id.tabs)

// Режимы размещения
// Прокрутка со стрелками
tabs.displayMode = Tabs.DISPLAY_MODE_SCROLL
// Или растяжение на всё доступное пространство
// tabs.displayMode = Tabs.DISPLAY_MODE_STRETCH
// Или «если есть место» — лишние уйдут в disclosure-меню
// tabs.displayMode = Tabs.DISPLAY_MODE_IF_ROOM

// Ориентация ленты вкладок
 tabs.orientation = Tabs.VERTICAL // по умолчанию HORIZONTAL

// Программное добавление вкладок (текст + иконка)
val tabFeed = Tabs.Tab.builder(this)
    .setId(R.id.tab_feed)
    .setText("Лента")
    .setIcon(R.drawable.ic_home_24)
    .setHelperText("новое")
    .setCounterEnabled(true)
    .setCounterText("3")
    .setActionEnabled(true)
    .setAction(ContextCompat.getDrawable(this, R.drawable.ic_close_16))
    .build()

// Вкладка-иконка (с текстом для disclosure-меню)
val tabBell = Tabs.IconTab.builder(this)
    .setId(R.id.tab_bell)
    .setIcon(R.drawable.ic_notifications_24)
    .setCounterEnabled(true)
    .setCounterText("99+")
    .setDisclosureText("Уведомления")
    .build()

tabs.addTab(tabFeed)
tabs.addTab(tabBell)

// Выбор вкладки
tabs.setSelected(R.id.tab_feed)
// или
tabs.setSelected(tabBell)
```

---

## Поведение и режимы

- **DISPLAY_MODE_SCROLL** — вкладки прокручиваются внутри `HorizontalScrollView`/`ScrollView`. При `app:sd_overflowIconsEnabled="true"` показываются кнопки prev/next.
- **DISPLAY_MODE_STRETCH** — каждая видимая вкладка получает равную ширину (горизонталь) или высоту (вертикаль), чтобы занять всё пространство контейнера.
- **DISPLAY_MODE_IF_ROOM** — видимые вкладки раскладываются «пока хватает места»; невместившиеся собираются в disclosure-меню (кнопка с иконкой/текстом `sd_disclosure*`).

Индикатор выбранного таба настраивается через `sd_tabIndicatorColor` и `sd_tabIndicatorThickness`.

---

## XML-атрибуты `Tabs`

| Атрибут | Тип | По умолчанию | Описание |
|---|---|---|---|
| `android:orientation` | enum: `horizontal`/`vertical` | `horizontal` | Ориентация ленты вкладок. В коде соответствует `tabs.orientation`. |
| `app:sd_tabIndicatorColor` | `ColorStateList` | — | Цвет индикатора выбранной вкладки. |
| `app:sd_tabIndicatorThickness` | `dimension` | `0dp` | Толщина индикатора (горизонтальная лента снизу или вертикальная слева, в зависимости от ориентации). |
| `app:sd_tabsMinSpacing` | `dimension` | `0dp` | Минимальный зазор между вкладками в режимах `SCROLL`/`IF_ROOM`. В `STRETCH` не используется. |
| `app:sd_dividerEnabled` | `boolean` | `false` | Показывать разделитель контейнера вкладок. |
| `app:sd_overflowIconsEnabled` | `boolean` | `false` | Показывать кнопки перелистывания prev/next в режиме `SCROLL`. |
| `app:sd_overflowPrevIcon` | `drawable` | — | Иконка кнопки «назад» в режиме `SCROLL`. |
| `app:sd_overflowPrevIconColor` | `ColorStateList` | — | Цвет (tint) иконки «назад». |
| `app:sd_overflowNextIcon` | `drawable` | — | Иконка кнопки «вперёд» в режиме `SCROLL`. |
| `app:sd_overflowNextIconColor` | `ColorStateList` | — | Цвет (tint) иконки «вперёд». |
| `app:sd_disclosureIcon` | `drawable` | — | Иконка disclosure-элемента (кнопка «ещё») для режимов `IF_ROOM`/когда есть скрытые вкладки. |
| `app:sd_disclosureText` | `string` | — | Текст disclosure-элемента (если вкладки не иконки). Используется как подпись «Ещё». |
| `app:sd_disclosureColor` | `ColorStateList` | — | Цвет текста/иконки disclosure-элемента. |
| `app:sd_disclosureTextAppearance` | `style` | `0` | Стиль текста disclosure-элемента. |
| `app:sd_tabItemStyleOverlay` | `style` | `0` | Overlay-стиль, который оборачивает дочерние `TabItem`/`IconTabItem` (удобно для единых размеров, отступов и т.д.). |

> Обратите внимание: режим размещения (`displayMode`) задаётся **только из кода**: `tabs.displayMode = Tabs.DISPLAY_MODE_*`.

---

## XML-атрибуты дочерних элементов

### `TabItem`
| Атрибут | Тип | По умолчанию | Описание |
|---|---|---|---|
| `app:sd_actionEnabled` | `boolean` | `false` | Отображать иконку-действие справа. |
| `app:sd_action` | `drawable` | — | Drawable иконки-действия. |
| `app:sd_actionTint` | `ColorStateList` | — | Цвет (tint) иконки-действия. |
| `app:sd_actionPadding` | `dimension` | `0dp` | Отступ слева от иконки-действия. |
| `app:sd_actionSize` | `dimension` | `wrap_content` | Размер иконки-действия. |

### `IconTabItem`
| Атрибут | Тип | По умолчанию | Описание |
|---|---|---|---|
| `app:sd_counterOffsetX` | `dimension` | `0dp` | Смещение счётчика по оси X относительно иконки. |
| `app:sd_counterOffsetY` | `dimension` | `0dp` | Смещение счётчика по оси Y относительно иконки. |

> Тексты/иконки основных вкладок в `TabItem` задавайте обычными API виджета: `android:text`, tint через методы/стили и т.п.

---

## Программное API

### Создание вкладок
```kotlin
// Текстовая вкладка
val textTab: Tabs.Tab = Tabs.Tab.builder(context)
    .setId(R.id.tab_text)
    .setText("Каталог")
    .setHelperText("новинки")
    .setIcon(ContextCompat.getDrawable(context, R.drawable.ic_store_24))
    .setCounterEnabled(true)
    .setCounterText("5")
    .setActionEnabled(true)
    .setAction(ContextCompat.getDrawable(context, R.drawable.ic_close_16))
    .setActionClickListener { /* ... */ }
    .build()

// Иконка-вкладка
val iconTab: Tabs.IconTab = Tabs.IconTab.builder(context)
    .setId(R.id.tab_icon)
    .setIcon(R.drawable.ic_star_24)
    .setCounterEnabled(true)
    .setCounterText("1")
    .setDisclosureText("Избранное")
    .build()

// Добавление в контейнер
tabs.addTab(textTab)
tabs.addTab(iconTab)
```

### Управление
```kotlin
// Выбор
tabs.setSelected(R.id.tab_text)        // по id
// либо
tabs.setSelected(iconTab)              // по модели

// Прокрутка к вкладке без выбора
tabs.scrollToTab(iconTab)

// Удаление/очистка
tabs.removeTab(iconTab)
tabs.removeTabAt(0)
tabs.clearTabs()

// Слушатель изменения выбора
 tabs.setOnSelectedChangeListener { t, item, isSelected ->
     if (isSelected) {
         // item — это TabItem выбранной вкладки
     }
 }
```

---

## Disclosure-режим (когда вкладок слишком много)
В режиме `DISPLAY_MODE_IF_ROOM` Tabs автоматически помещает невошедшие вкладки в disclosure-меню. В качестве визуального элемента используется специальная вкладка (иконка/текст «Ещё»), настраиваемая через `sd_disclosure*`. Для `IconTab` рекомендуется задать `setDisclosureText(...)`, чтобы в выпадающем списке было понятно назначение иконки.

---

---

## Стилизация
- Цвета/толщина индикатора — `sd_tabIndicatorColor`, `sd_tabIndicatorThickness`.
- Цвета disclosure и иконок перелистывания — `sd_disclosureColor`, `sd_overflowPrevIconColor`, `sd_overflowNextIconColor`.
- Единый стиль дочерних `TabItem` — через `sd_tabItemStyleOverlay`.

> Внутри `Tabs` используется `ShapeDrawable` для индикатора и `DividerDrawable` для разделителя.
