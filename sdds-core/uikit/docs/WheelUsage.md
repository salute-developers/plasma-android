

# Компонент Wheel

`Wheel` — это компонент для выбора значения из вертикально прокручиваемых списков (колес), аналогично пикерам даты/времени.  
Поддерживает множество параметров кастомизации, возможность работы с несколькими колесами одновременно, управление стилями и иконками управления.

## Основные возможности

- Один или несколько колес с независимыми наборами данных.
- Управление внешним видом через XML-атрибуты и программно.
- Поддержка кнопок управления (вверх/вниз).
- Возможность бесконечной прокрутки.
- Выравнивание элементов, описание, отступы и кастомные разделители.

## Атрибуты кастомизации

| Атрибут | Описание | Тип |
|--------:|----------|-----|
| `sd_controlsEnabled` | Показывать кнопки управления | boolean |
| `sd_itemTextAppearance` | Стиль основного текста | reference |
| `sd_itemTextColor` | Цвет основного текста | color |
| `sd_itemTextAfterAppearance` | Стиль дополнительного текста | reference |
| `sd_itemTextAfterColor` | Цвет дополнительного текста | color |
| `sd_itemAlignment` | Выравнивание текста (start, center, end, mixed) | enum/int |
| `sd_itemMinSpacing` | Минимальное расстояние между элементами | dimension |
| `sd_itemTextAfterPadding` | Отступ между основным и дополнительным текстом | dimension |
| `sd_descriptionTextAppearance` | Стиль описания | reference |
| `sd_descriptionTextColor` | Цвет описания | color |
| `sd_controlIconUp` | Иконка прокрутки вверх | reference |
| `sd_controlIconUpTint` | Цвет иконки вверх | color |
| `sd_controlIconDown` | Иконка прокрутки вниз | reference |
| `sd_controlIconDownTint` | Цвет иконки вниз | color |
| `sd_wheelCount` | Количество колес | int |
| `sd_separatorType` | Тип разделителя (none, divider, dots) | enum/int |
| `sd_separatorColor` | Цвет разделителя | color |
| `sd_separatorSpacing` | Отступ разделителя | dimension |
| `sd_descriptionPadding` | Отступ описания | dimension |

## Пример использования

Ниже показано, как создать `Wheel` программно:

```kotlin
val wheel = Wheel(context).apply {
    wheelCount = 2
    visibleEntriesCount = 5
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

```xml
<com.sdds.uikit.Wheel
    android:id="@+id/wheel"
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    app:sd_wheelCount="2"
    app:sd_controlsEnabled="true"
    app:sd_itemTextAppearance="@style/TextAppearance.MyApp.Item"
    app:sd_separatorType="dots"
    app:sd_separatorSpacing="8dp" />
```

А затем настроить его в `onViewCreated` или `onCreate`:

```kotlin
wheel.setData(0, generateEntries())
wheel.setData(1, generateOtherEntries())
wheel.setDescription("Выберите параметры")
```

## Примечание

Для применения стилей убедитесь, что вы используете правильный `context` или `ContextThemeWrapper`, если создаёте `Wheel` вручную.