---
title: Carousel
---

`Carousel` — это компонент для отображения горизонтальной карусели элементов.  
Поддерживает кнопки навигации, индикатор страниц в виде точек, отступы между элементами и отображение соседних страниц за пределами экрана.

## Основные возможности

- Горизонтальная прокрутка элементов.
- Кнопки навигации «Назад» / «Вперёд»:
  - можно отключать полностью;
  - можно менять их расположение (внутри или снаружи карусели относительно контента).
- Индикатор страниц в виде точек (`PaginationDots`) с настройкой количества видимых элементов.
- Управление отступами:
  - между элементами карусели (`gap`);
  - отступами до кнопок навигации;
  - отступом индикатора от контента.
- Поддержка смещения страниц за пределами экрана (`offscreenOffset`) для отображения соседних элементов.
- Управление выравниванием контента (начало / центр / конец).
- Возможность добавления `PageTransformer` и `ItemDecoration` для кастомных эффектов и декора.

## Атрибуты кастомизации

|                                   Атрибут | Описание                                                                 | Тип       |
|-----------------------------------------:|--------------------------------------------------------------------------|-----------|
|                 `sd_indicatorPadding`    | Отступ от индикатора до контента `ViewPager2`                            | dimension |
|                `sd_nextButtonPadding`    | Отступ от кнопки «Следующий» до контента                                 | dimension |
|                `sd_prevButtonPadding`    | Отступ от кнопки «Предыдущий» до контента                                | dimension |
|                              `sd_gap`    | Отступ между элементами карусели                                         | dimension |
|                    `sd_nextButtonIcon`   | Иконка кнопки «Следующий»                                               | reference |
|                    `sd_prevButtonIcon`   | Иконка кнопки «Предыдущий»                                              | reference |
|               `sd_controlsPlacement`     | Расположение кнопок (inner — внутри, outer — снаружи)                   | enum/int  |
|                  `sd_controlsEnabled`    | Включает/выключает кнопки навигации                                     | boolean   |
|       `sd_indicatorVisibleItemCount`     | Количество видимых элементов индикатора `PaginationDots`                | int       |
|               `sd_contentAlignment`      | Выравнивание контента (start, center, end)                              | enum/int  |
|               `sd_offscreenOffset`       | Смещение страниц за границами экрана (для отображения соседних страниц) | dimension |
|      `sd_paginationDotsStyleOverlay`     | Стиль-оверлей для индикатора страниц                                    | reference |
|         `sd_nextButtonStyleOverlay`      | Стиль-оверлей для кнопки «Следующий»                                    | reference |
|         `sd_prevButtonStyleOverlay`      | Стиль-оверлей для кнопки «Предыдущий»                                   | reference |

> Обратите внимание: часть параметров также доступна программно через свойства и методы `Carousel`.

## Пример использования

Ниже показано, как создать `Carousel` программно и задать адаптер:

```kotlin
class CarouselAdapter(
    private val items: List<String>,
) : RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_carousel_example, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Пример простой привязки данных
        holder.view.findViewById<TextView>(R.id.title).text = items[position]
    }

    override fun getItemCount(): Int = items.size
}

// Создание карусели программно
val carousel = Carousel(context).apply {
    // Настройка основных параметров
    controlsEnabled = true
    controlsPlacement = Carousel.CONTROLS_PLACEMENT_INNER
    indicatorEnabled = true
    indicatorVisibleItemCount = 5
    gap = resources.getDimensionPixelSize(R.dimen.sdds_space_m)

    // Смещение страниц для отображения соседних элементов
    setOffscreenOffset(
        resources.getDimension(R.dimen.sdds_carousel_offscreenOffset),
    )

    // Установка адаптера
    adapter = CarouselAdapter(
        items = listOf("Первый", "Второй", "Третий", "Четвёртый"),
    )

    // Дополнительно можно отключить пользовательский скролл
    // isUserInputEnabled = false
}

parentLayout.addView(carousel)
```

## Использование в XML

Вы также можете определить компонент в XML с помощью доступных атрибутов:

:::warning
Всегда используйте готовые стили с префиксом `@style/{{ docs-theme-prefix }}.Components.Carousel`
:::

```xml
<com.sdds.uikit.Carousel
    android:id="@+id/carousel"
    style="@style/{{ docs-theme-prefix }}.Components.Carousel"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:sd_controlsEnabled="true"
    app:sd_controlsPlacement="inner"
    app:sd_gap="20dp" />
```

А затем настроить его в `onViewCreated` или `onCreate`:

```kotlin
carousel.adapter = CarouselAdapter(
    items = listOf("Первый", "Второй", "Третий", "Четвёртый"),
)

// Пример изменения текущей страницы
carousel.currentItem = 0

// Пример изменения смещения страниц для отображения соседних элементов
carousel.setOffscreenOffset(
    resources.getDimension(R.dimen.carousel_offscreenOffset),
)
```

## Расположение кнопок управления

Расположение кнопок навигации задаётся через `controlsPlacement`:

- `CONTROLS_PLACEMENT_INNER` — кнопки находятся внутри карусели (рядом с контентом).
- `CONTROLS_PLACEMENT_OUTER` — кнопки находятся снаружи карусели, «обрамляя» контент.

Программно:

```kotlin
carousel.controlsPlacement = Carousel.CONTROLS_PLACEMENT_OUTER
carousel.nextButtonPadding = resources.getDimensionPixelSize(R.dimen.space_m)
carousel.prevButtonPadding = resources.getDimensionPixelSize(R.dimen.space_m)
```

В XML:

```xml
<com.sdds.uikit.Carousel
    android:id="@+id/carousel"
    style="@style/{{ docs-theme-prefix }}.Components.Carousel"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:sd_controlsPlacement="outer"
    app:sd_nextButtonPadding="@dimen/space_m"
    app:sd_prevButtonPadding="@dimen/space_m" />
```

## Индикатор страниц

Индикатор страниц (`PaginationDots`) включён по умолчанию и управляется свойством `indicatorEnabled` и атрибутами стиля.

Программно:

```kotlin
carousel.indicatorEnabled = true
carousel.indicatorVisibleItemCount = 5
```

Через XML вы можете использовать готовые стили или переопределить внешний вид через `sd_paginationDotsStyleOverlay`.

## Смещение страниц и частичный предпросмотр

Для создания эффекта, когда соседние элементы слегка видны по краям, используется смещение страниц:

Программно:

```kotlin
// Фиксированное смещение
carousel.setOffscreenOffset(
    resources.getDimension(R.dimen.sdds_carousel_offscreenOffset),
)

// Кастомное смещение в зависимости от страницы
carousel.setOffscreenOffset { view ->
    // можно учитывать размеры view для вычисления смещения
    resources.getDimension(R.dimen.sdds_carousel_offscreenOffset)
}
```

Выравнивание контента при этом контролируется через `contentAlignment`:

```kotlin
carousel.contentAlignment = Carousel.CONTENT_ALIGNMENT_CENTER
```

## Примечание

Для применения стилей убедитесь, что вы используете правильный `context` или `ContextThemeWrapper`, если создаёте `Carousel` вручную — это важно для корректного применения `sd_paginationDotsStyleOverlay`, `sd_nextButtonStyleOverlay` и `sd_prevButtonStyleOverlay`.
