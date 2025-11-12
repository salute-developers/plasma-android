---
title: PaginationDots
---

`PaginationDots` — индикатор пагинации в виде ряда точек. Компонент подходит для каруселей, ViewPager(2), горизонтальных/вертикальных списков и любых сценариев, где нужно показать общее количество страниц и текущую.

Поддерживает анимации активной точки, окно видимости (если страниц больше, чем точек на экране), уменьшение «краевых» индикаторов и настраиваемые размеры/цвета через стейт-листы.

## Основные возможности

- Отображение текущей страницы среди общего количества.
- Окно видимости при большом количестве страниц (скролл точек с анимацией).
- «Краевые» индикаторы с постепенным уменьшением (подсказка о скрытых страницах).
- Горизонтальная или вертикальная ориентация.
- Кастомизация размеров и цвета точки по состояниям (обычная/активная).

## Атрибуты кастомизации

|                         Атрибут | Описание                                                              | Тип        |
|--------------------------------:|-----------------------------------------------------------------------|------------|
|            `sd_itemCount`       | Общее количество элементов (точек).                                   | int        |
|       `sd_visibleItemCount`     | Сколько точек одновременно видно.                                     | int        |
|           `sd_currentItem`      | Индекс текущего элемента (0..itemCount-1).                            | int        |
|               `sd_gap`          | Расстояние между точками.                                             | dimension  |
|          `sd_dotWidth`          | Ширина точки. Можно указать NumberStateList для разных состояний.     | number/ref |
|         `sd_dotHeight`          | Высота точки. Можно указать NumberStateList для разных состояний.     | number/ref |
|       `sd_dotBackground`        | Цвет/палитра точки (ColorValueStateList).                             | color/ref  |
|   `sd_edgeIndicatorCount`       | Количество «краевых» точек, которые будут уменьшаться в размере.      | int        |
| `sd_edgeIndicatorShrinkFactor`  | Сила уменьшения краевых индикаторов (0f..1f).                          | float      |
|        `android:orientation`    | Ориентация (`horizontal`/`vertical`).                                 | enum       |

> Примечание: размеры (`sd_dotWidth`/`sd_dotHeight`) и фон (`sd_dotBackground`) поддерживают state-list ресурсы, поэтому активная точка может иметь отличные от обычной размеры/цвета.

## Пример использования (программно)

```kotlin
val dots = PaginationDots(context).apply {
    // Базовые параметры
    itemCount = 10
    visibleItemCount = 7
    currentIndex = 0
    gap = resources.getDimensionPixelSize(R.dimen.sd_spacing_xs)

    // Краевые индикаторы
    edgeIndicatorCount = 2
    edgeIndicatorShrinkFactor = 0.12f
}

parent.addView(dots)

// Связка с ViewPager2
viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
    override fun onPageSelected(position: Int) {
        dots.currentIndex = position
    }
})
```

## Использование в XML

:::warning
Всегда используйте готовые стили с префиксом @style/{{ docs-theme-prefix }}.Components.PaginationDots
:::

```xml
<com.sdds.uikit.PaginationDots
    android:id="@+id/paginationDots"
    style="@style/{{ docs-theme-prefix }}.Components.PaginationDotsHorizontal.M"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:sd_itemCount="10"
    app:sd_visibleItemCount="7"
    app:sd_currentItem="0"/>
```

## Вертикальная ориентация

```xml
<com.sdds.uikit.PaginationDots
    android:id="@+id/paginationDots"
    style="@style/{{ docs-theme-prefix }}.Components.PaginationDotsVertical.M"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:sd_itemCount="10"
    app:sd_visibleItemCount="7"
    app:sd_currentItem="0"/>
```

## Советы по настройке

- Если `itemCount` больше, чем `visibleItemCount`, точки будут плавно прокручиваться так, чтобы текущая точка оказывалась примерно по центру окна.
- Для более явного намека на «есть ещё страницы» используйте `sd_edgeIndicatorCount` и `sd_edgeIndicatorShrinkFactor` — краевые точки будут визуально меньше.
- Чтобы активная точка выделялась сильнее, задайте различающиеся значения в `sd_dotWidth`/`sd_dotHeight` и `sd_dotBackground` через state-list.


## Примечание

Для применения стилей убедитесь, что используете корректный `Context` или `ContextThemeWrapper`, если создаёте `PaginationDots` вручную.