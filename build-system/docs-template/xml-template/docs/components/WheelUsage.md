---
title: Wheel
---

`Wheel` — это компонент для выбора значения из вертикально прокручиваемых списков (колес), аналогично пикерам даты/времени.  
Поддерживает множество параметров кастомизации, возможность работы с несколькими колесами одновременно, управление стилями и иконками управления.

## Основные возможности

- Один или несколько колес с независимыми наборами данных.
- Управление внешним видом через XML-атрибуты и программно.
- Поддержка кнопок управления (вверх/вниз).
- Возможность бесконечной прокрутки.
- Выравнивание элементов, описание, отступы и кастомные разделители.

## Атрибуты кастомизации

|                          Атрибут | Описание                                                | Тип       |
|---------------------------------:|---------------------------------------------------------|-----------|
|             `sd_controlsEnabled` | Показывать кнопки управления                            | boolean   |
|         `sd_controlsDisplayMode` | Режим отображения кнопок управления (always, if_active) | enum      |
|          `sd_itemTextAppearance` | Стиль основного текста                                  | reference |
|               `sd_itemTextColor` | Цвет основного текста                                   | color     |
|     `sd_itemTextAfterAppearance` | Стиль дополнительного текста                            | reference |
|          `sd_itemTextAfterColor` | Цвет дополнительного текста                             | color     |
|               `sd_itemAlignment` | Выравнивание текста (start, center, end, mixed)         | enum/int  |
|              `sd_itemMinSpacing` | Минимальное расстояние между элементами                 | dimension |
|        `sd_itemTextAfterPadding` | Отступ между основным и дополнительным текстом          | dimension |
|   `sd_descriptionTextAppearance` | Стиль описания                                          | reference |
|        `sd_descriptionTextColor` | Цвет описания                                           | color     |
|               `sd_controlIconUp` | Иконка прокрутки вверх                                  | reference |
|           `sd_controlIconUpTint` | Цвет иконки вверх                                       | color     |
|             `sd_controlIconDown` | Иконка прокрутки вниз                                   | reference |
|         `sd_controlIconDownTint` | Цвет иконки вниз                                        | color     |
|                  `sd_wheelCount` | Количество колес                                        | int       |
|               `sd_separatorType` | Тип разделителя (none, divider, dots)                   | enum/int  |
|              `sd_separatorColor` | Цвет разделителя                                        | color     |
|            `sd_separatorSpacing` | Отступ разделителя                                      | dimension |
|          `sd_descriptionPadding` | Отступ описания                                         | dimension |
|         `sd_itemSelectorEnabled` | Включает/выключает индикатор выбранного элемента        | dimension |
|            `sd_itemSelectorTint` | Цвет индикатора выбранного элемента                     | dimension |
| `sd_itemSelectorShapeAppearance` | Форма индикатора выбранного элемента                    | dimension |

## Пример использования

Ниже показано, как создать `Wheel` программно:

```kotlin
val wheel = Wheel(context).apply {
    wheelCount = 2
    visibleItemsCount = 5
    controlsEnabled = true
    separatorType = Wheel.SEPARATOR_TYPE_DOTS
    infiniteScrollEnabled = true

    setDescription("Выберите значение")

    // Устанавливаем данные
    setData(0, listOf(
        Wheel.WheelItemEntry(1, "Один"),
        Wheel.WheelItemEntry(2, "Два"),
        Wheel.WheelItemEntry(3, "Три"),
    ))
    setData(1, listOf(
        Wheel.WheelItemEntry(10, "A", "руб."),
        Wheel.WheelItemEntry(20, "B", "руб."),
        Wheel.WheelItemEntry(30, "C", "руб."),
    ))

    // Устанавливаем слушатель выбора
    addEntrySelectionListener { wheelId, entry ->
        Log.d("Wheel", "Выбрано на колесе $wheelId: ${entry.title}")
    }
}

parentLayout.addView(wheel)
```

## Использование в XML

Вы также можете определить компонент в XML с помощью доступных атрибутов:

:::warning
Всегда используйте готовые стили с префиксом @style/{{ docs-theme-prefix }}.Components.Wheel
:::

```xml
<com.sdds.uikit.Wheel
    android:id="@+id/wheel"
    style="@style/{{ docs-theme-prefix }}.Components.Wheel.H1"
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    app:sd_wheelCount="2"
    app:sd_controlsEnabled="true"
    app:sd_separatorType="dots" />
```

А затем настроить его в `onViewCreated` или `onCreate`:

```kotlin
wheel.setData(0, generateEntries())
wheel.setData(1, generateOtherEntries())
wheel.setDescription("Выберите параметры")
```

## Режим отображения кнопок управления

Программно: 
```kotlin
// Программное изменение режима отображения кнопок управления для всех колёс
wheel.setControlsDisplayMode(Wheel.CONTROLS_DISPLAY_MODE_IF_ACTIVE)

// Или для конкретного колеса (по идентификатору колеса)
wheel.setControlsDisplayMode(0, Wheel.CONTROLS_DISPLAY_MODE_ALWAYS)
```

В xml:
```xml
<com.sdds.uikit.Wheel
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    app:sd_controlsDisplayMode="if_active"
/>
```

## Индикация выбранного элемента
Индикатор выбранного элемента (itemSelector) включается через XML-атрибут `app:sd_itemSelectorEnabled="true"`. 
Дополнительно можно задать `app:sd_itemSelectorTint` и `app:sd_itemSelectorShapeAppearance`.

:::warning
Если в вашей дизайн системе есть состояние Wheel c индикатором выбранного элемента, то скорее всего для этого состояния есть готовый стиль.
Всегда используйте готовые стили.
:::

```xml
<com.sdds.uikit.Wheel
    android:id="@+id/wheel"
    style="@style/{{ docs-theme-prefix }}.Components.Wheel.H1"
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    app:sd_itemSelectorEnabled="true"
    app:sd_itemSelectorTint="?{{ docs-theme-resPrefix }}_surfaceDefaultSolidDefault"
    app:sd_itemSelectorShapeAppearance="?{{ docs-theme-resPrefix }}_shapeRoundM"
    />
```

## Примечание

Для применения стилей убедитесь, что вы используете правильный `context` или `ContextThemeWrapper`, если создаёте `Wheel` вручную.
