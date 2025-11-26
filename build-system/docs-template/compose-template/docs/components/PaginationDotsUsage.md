---
title: PaginationDots
---

`PaginationDots` — индикатор пагинации в виде ряда точек. Компонент подходит для каруселей, горизонтальных/вертикальных списков и любых сценариев, где нужно показать общее количество страниц и текущую.

Поддерживает анимации активной точки, окно видимости (если страниц больше, чем точек на экране), уменьшение «краевых» индикаторов и настраиваемые размеры/цвета через StatefulValue.

## Основные возможности

- Отображение текущей страницы среди общего количества.
- Окно видимости при большом количестве страниц (скролл точек с анимацией).
- «Краевые» индикаторы с постепенным уменьшением (подсказка о скрытых страницах).
- Горизонтальная или вертикальная ориентация.
- Кастомизация размеров и цвета точки по состояниям (обычная/активная).

## Пример использования

```kotlin
var selectedIndex by remember { mutableIntStateOf(0) }
PaginationDots(
    style = PaginationDotsHorizontal.M.style(),
    selectedIndex = selectedIndex,
    totalCount = 11,
    visibleCount = 5,
)
Spacer(Modifier.size(16.dp))
Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
    IconButton(
        iconRes = com.sdds.icons.R.drawable.ic_arrow_left_24,
        style = IconButton.M.Default.style(),
        onClick = {
            // для корректной работы необходимо следить, чтобы индекс не выходил за пределы totalCount
            selectedIndex = selectedIndex.minus(1).coerceIn(0, 10)
        },
    )
    IconButton(
        style = IconButton.M.Default.style(),
        iconRes = com.sdds.icons.R.drawable.ic_arrow_right_24,
        onClick = {
            // для корректной работы необходимо следить, чтобы индекс не выходил за пределы totalCount
            selectedIndex = selectedIndex.plus(1).coerceIn(0, 10)
        },
    )
}
```

> Для корректной работы необходимо следить, чтобы selectedIndex не выходил за пределы общего количества точек totalCount

## Стиль PaginationDots

Для PaginationDots существует набор сгенерированных стилей. Также стиль PaginationDots можно настроить с помощью PaginationDotsStyle.builder(). 

### Создание стиля с помощью builder()

```kotlin
PaginationDotsStyle.builder()
    .orientation(PaginationDotsOrientation.Vertical)
    .edgeShrinkFactor(0.3f)
    .edgeCount(2)
    .colors {
        dotBackgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentSecondary.asStatefulValue(
                setOf(InteractiveState.Activated)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault,
            ),
        )
    }
    .dimensions {
        gap(6.0.dp)
        dotWidth(8.0.dp)
        dotHeight(
            8.0.dp.asStatefulValue(
                setOf(InteractiveState.Activated) to 32.0.dp,
            ),
        )
    }
    .style()
```