---
title: Bubble
---

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/Bubble_Default.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.Bubble_Default -->

Bubble — управляемый анимированный бабл апсейла на карточке устройства. Вызывающая сторона задаёт
через `expanded`, отображается ли свёрнутая иконка-триггер или развёрнутый body с произвольным
содержимым. Компонент специфичен для вертикали SberHome и живёт в
`tokens/plasma.homeds.compose`, а не в `sdds-core/uikit-compose` (по аналогии с `NumberPanel`).

Компонент не содержит бизнес-логики: приоритет между статус-бейджами устройства и баблом апсейла,
признак «есть новое предложение» и переход на экран апсейла — ответственность вызывающей стороны.

## Двухчастный API — Trigger и Host

`BubbleTrigger` кладётся внутрь карточки устройства как обычный дочерний composable.
`BubbleHost` монтируется один раз вокруг всей сетки устройств (не на карточку) — он рендерит
развёрнутый бабл поверх соседних карточек, чтобы тот не обрезался клипом отдельной карточки:

```kotlin
BubbleHost {
    // сетка устройств; BubbleTrigger — внутри одной из карточек
}
```

Без `BubbleHost` выше по дереву `BubbleTrigger` продолжает работать как обычная свёрнутая
иконка, но разворот не будет виден.

## Использование с Card

В карточке устройства `BubbleTrigger` следует размещать в слоте `extra`. Слот предоставляет
`BoxScope`, поэтому положение триггера внутри контентной области карточки задаётся стандартными
модификаторами `align`, `padding` и `offset`. В одном `extra` при необходимости можно разместить
несколько элементов.

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/Bubble_Card.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.Bubble_Card -->

## Controlled-состояние и скрытие

Наличие всего Bubble управляется композицией: показывать предложение — значит смонтировать
`BubbleTrigger`, скрывать — не монтировать. Параметр `expanded` управляет только body:
`false` оставляет свёрнутый триггер, `true` раскрывает body. Компонент не меняет это значение
самостоятельно и не хранит dismissed-состояние. Controlled-переход в каждую сторону занимает
600 мс:

```kotlin
var expanded by remember { mutableStateOf(false) }
var hasOffer by remember { mutableStateOf(true) }

if (hasOffer) {
    BubbleTrigger(
        onExpandedClick = { /* переход на экран апсейла */ },
        expanded = expanded,
        onTriggerClick = { expanded = true },
        onDismissRequest = {
            expanded = false
            hasOffer = false
            /* сохранить «просмотрено» */
        },
    ) {
        Text(text = "Прокачать до 100%")
    }
}
```

## Обработка нажатий

Три независимые области, каждая — свой колбэк:

- `onExpandedClick` — клик по ТЕЛУ развёрнутого бабла целиком (текст+прогресс или произвольный
  content-слот); компонент сам не переходит на экран апсейла — это делает вызывающая сторона внутри
  колбэка.
- `onDismissRequest` — запрос на закрытие по клику на крестик. Компонент не меняет `expanded` и
  не удаляет себя; результат определяет вызывающая сторона.
- `onTriggerClick` — клик по самому триггеру (свёрнутая иконка на карточке в состоянии покоя);
  callback только уведомляет вызывающую сторону, которая при необходимости меняет `expanded`:

```kotlin
var expanded by remember { mutableStateOf(false) }

BubbleTrigger(
    onExpandedClick = { /* переход на экран апсейла */ },
    expanded = expanded,
    onTriggerClick = {
        expanded = true
        /* аналитика: триггер открыт */
    },
) {
    Text(text = "Прокачать до 100%")
}
```

## Видимость и несколько триггеров

Каждый `BubbleTrigger` независимо сообщает через `onTriggerVisibilityChange`, полностью ли его
границы находятся внутри `BubbleHost`. Частично вышедший за границы триггер считается невидимым;
callback вызывается только при изменении результата. Идентификатор связывается с событием через
замыкание:

```kotlin
val expandedById = remember { mutableStateMapOf<String, Boolean>() }
val visibleById = remember { mutableStateMapOf<String, Boolean>() }

devices.forEach { device ->
    BubbleTrigger(
        onExpandedClick = { /* открыть предложение device.id */ },
        expanded = expandedById[device.id] == true,
        onTriggerClick = { expandedById[device.id] = true },
        onDismissRequest = { expandedById.remove(device.id) },
        onTriggerVisibilityChange = { visible ->
            visibleById[device.id] = visible
        },
    ) {
        Text(text = device.offerText)
    }
}
```

Компонент допускает несколько одновременно раскрытых баблов. В примере выше каждый элемент имеет
собственное состояние в `expandedById`. Если одновременно должен быть раскрыт только один Bubble,
достаточно хранить его идентификатор:

```kotlin
var expandedId by remember { mutableStateOf<String?>(null) }

devices.forEach { device ->
    BubbleTrigger(
        onExpandedClick = { /* открыть предложение device.id */ },
        expanded = expandedId == device.id,
        onTriggerClick = { expandedId = device.id },
        onDismissRequest = {
            if (expandedId == device.id) expandedId = null
        },
    ) {
        Text(text = device.offerText)
    }
}
```

## Автоматическое раскрытие и сворачивание

Автоматическая политика реализуется снаружи компонента. Например, Bubble можно раскрыть, когда
его триггер полностью появился в `BubbleHost`, и свернуть через пять секунд. Для каждого элемента
такой state следует хранить под стабильным бизнес-идентификатором (например, внутри
`key(device.id)` в списке):

```kotlin
var triggerVisible by remember(device.id) { mutableStateOf(false) }
var expanded by remember(device.id) { mutableStateOf(false) }

LaunchedEffect(triggerVisible) {
    expanded = triggerVisible
}

LaunchedEffect(expanded) {
    if (expanded) {
        delay(5_000)
        expanded = false
    }
}

BubbleTrigger(
    onExpandedClick = { /* открыть предложение device.id */ },
    expanded = expanded,
    onTriggerClick = { expanded = true },
    onDismissRequest = { expanded = false },
    onTriggerVisibilityChange = { visible ->
        triggerVisible = visible
    },
) {
    Text(text = device.offerText)
}
```

При выходе триггера за границы Host Bubble сворачивается, а таймер отменяется из-за изменения
`expanded`. Повторный вход запускает сценарий заново. Отдельный effect по `expanded` означает, что
ручное раскрытие через `onTriggerClick` тоже будет ограничено тем же таймаутом. Чтобы показывать
предложение только один раз, consumer может дополнительно хранить `shownIds` и не выставлять
`expanded = true` для уже показанного id. Задержка `5_000` является частью продуктовой логики
consumer-а и не настраивается через `BubbleStyle`.

## Содержимое бабла

Основной сценарий — перегрузка `BubbleTrigger(text, progress, ...)`: текст, иконка-шеврон
(`chevronIcon`, drawable-ресурс, по умолчанию `R.drawable.ic_disclosure_right_outline_16`) и
прогресс-бар под текстом
(`progress`, `0f..1f`) — компонент сам собирает содержимое. Шеврон встроен в сам текст как
inline-контент — привязан к последнему слову последней строки и переносится вместе с ней при
переносе текста, а не сидит отдельным элементом сбоку от всего блока текста; центрирован по
высоте строки (`lineHeight`) и заезжает на последний символ текста на `chevronTextOverlap`
(токен стиля, по умолчанию `3.dp`); размер иконки задаётся токеном `chevronIconSize` (по
умолчанию `16.dp`):

```kotlin
BubbleTrigger(
    onExpandedClick = { /* переход на экран апсейла */ },
    expanded = expanded,
    text = "Прокачать до 100%",
    progress = 0.6f,
)
```

Прогресс-бар нарисован как два прямоугольника с разрывом (указателем значения) между ними —
позиция разрыва и есть значение `progress` (`0f` — у самого начала, `1f` — у самого конца), а не
сплошная заливка поверх сплошного трека. Скруглены только крайние (внешние) торцы каждого
прямоугольника — торцы у самого разрыва прямые. Толщина разрыва задаётся токеном стиля
`progressPointerThickness`. `hasProgress = false` полностью убирает прогресс-бар и отступ под
него — для случаев, где прогресс не нужен, а не только скрывает с сохранением места.

Ширина тела для этой перегрузки зафиксирована токеном стиля `width` (по умолчанию
`100.dp`) — без него `Text`/прогресс-бар растягивали бы тело на всю доступную ширину экрана.

Обе перегрузки предоставляют цвет текста (`textColor`) и типографику (`textStyle`) из стиля
дочернему `Text` — как своему собственному, так и любому `Text` внутри `content`-слота, через
`LocalTextBrushProducer`/`LocalTextStyle`, а не явным параметром. Для произвольного содержимого
есть отдельная перегрузка с `content`-слотом — компонент не разбирает и не типизирует его:

```kotlin
BubbleTrigger(
    onExpandedClick = { /* переход на экран апсейла */ },
    expanded = expanded,
) {
    // произвольный composable-контент
}
```

## Размещение и выравнивание

С какой стороны от триггера появляется тело бабла и как оно выровнено, задаётся двумя параметрами —
терминология popover/tooltip:

- `placement` (`BubblePlacement.Top`/`.Bottom`/`.Start`/`.End`/`.Auto`) — с какой стороны от
  триггера появляется тело.
- `alignment` (`BubbleAlignment.Start`/`.Center`/`.End`) — выравнивание тела вдоль оси,
  перпендикулярной `placement`.

По умолчанию оба параметра передаются вызывающей стороной, обычно на основе позиции карточки в
сетке. `placement = BubblePlacement.Auto` перекладывает выбор на компонент: в момент
разворота он измеряет свободное место от круга-якоря до границ `BubbleHost` по всем 4
сторонам и выбирает сторону с максимумом места, а `alignment` (переданный отдельным параметром в
этом режиме игнорируется) подбирает так же — по свободному месту вдоль перпендикулярной оси. Это
эвристика по доступному месту, а не гарантия, что тело не наложится на границы хоста — тело растёт
до своего реального размера уже после выбора стороны.

## Стиль Bubble

Сейчас доступна единственная стилевая вариация — `Bubble.Default`. Набор размерных/видовых
вариаций появится отдельным изменением при наличии полной дизайн-спеки. Подробнее о том, как работают
`Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/Bubble_BubbleStyle.kt
```
