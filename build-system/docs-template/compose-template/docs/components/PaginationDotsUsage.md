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
// @sample: com/sdds/compose/uikit/fixtures/samples/paginationdots/PaginationDots_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.paginationdots.PaginationDots_Simple -->

> Для корректной работы необходимо следить, чтобы selectedIndex не выходил за пределы общего количества точек totalCount

## Стиль PaginationDots

Для PaginationDots существует набор сгенерированных стилей. Также стиль PaginationDots можно настроить с помощью PaginationDotsStyle.builder(). 

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/paginationdots/PaginationDots_Style.kt
```