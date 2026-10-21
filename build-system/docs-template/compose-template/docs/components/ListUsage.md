---
title: List
---

Компонент List используется для отображения информации списком.
В качестве контента принимает либо [ListItem](#listitem) либо произвольный контент.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/List_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.list.List_Simple -->

## StaticList

`StaticList` — статическая (нескроллируемая) вариация [List](#list) для сгруппированных секций: тот же контент и тот же `ListStyle`, но без собственной прокрутки и с высотой по содержимому.

Используйте `StaticList` внутри прокручиваемых контейнеров (в `item` компонента `List`, в `verticalScroll`-колонке) и на экранах без прокрутки. Для длинных лент используйте `List`.

Почему нельзя вложить `List` в прокручиваемый `List`: `List` — это `LazyColumn`, ему нужно конечное «окно» прокрутки; внутри прокрутки он измеряется с бесконечной высотой (крах измерения)

или требует фиксированной высоты и конфликтует жестами. `StaticList` таких ограничений не имеет — секция с общим фоном, `ListItem` и `Divider` внутри безопасно участвует в одной прокрутке экрана:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/StaticList_Section.kt
```

Отличия от `List`:
- весь контент компонируется сразу (без ленивой раскладки);
- `contentType` игнорируется, `stickyHeader` отрисовывается как обычный элемент;
- нет параметров прокрутки (`state`, `flingBehavior`, `userScrollEnabled`); `reverseLayout` меняет порядок элементов.

Стилизация — такая же, как у `List` (общий `ListStyle`, готовые бренд-стили применимы без изменений).

## Стиль List

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/List_Style.kt
```

## ListItem

Элемент списка [List](#list). При использовании внутри `List` компонент стилизуется автоматически. Если нужен отдельный стиль для элемента, используйте `ListItemStyle.builder()`. Общие принципы работы `Style` и `StyleBuilder` описаны в разделе [Стилизация компонентов](../theme/Styles.md).

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/list/ListItem_Style.kt
```
