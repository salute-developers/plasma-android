## Context

Высота навбара рождается в двух местах, и иерархии Compose и View **структурно различаются**:

```
        COMPOSE                                    VIEW
────────────────────────────────      ────────────────────────────────────
Column                                NavigationBar (LinearLayout, VERTICAL)
 ├─ NavigationBarLayout               ├─ containerWithPaddings  ◄── paddings
 │   ◄── paddings ЗДЕСЬ               │   │   (LinearLayout, VERTICAL)
 │   ┌──────────────────┐             │   ├─ actionsBlock       ◄── своих
 │   │ start │ ctr │ end│             │   │  (CustomCenteringLayout) паддингов нет
 │   └──────────────────┘             │   │   ┌──────────────────┐
 │   paddingBottom = 0,               │   │   │ start │ ctr │ end│
 │   если текст снизу                 │   │   └──────────────────┘
 ├─ OuterText (свои паддинги)         │   └─ textBlock (topMargin = tbTop)
 └─ OuterContent                      └─ contentView
```

В Compose паддинги лежат на самом ряду, и при `textPlacement = Bottom` нижний обнуляется (`NavigationBar.kt:207`), а текстовый блок несёт паддинги сам. Во View паддинги лежат на контейнере, оборачивающем и ряд, и текстовый блок. Визуальный результат одинаковый, но **точка приложения минимума разная**.

`CollapsingNavigationBar` существует только в Compose. Он собран из двух слоёв `CollapsingNavBarLayout` в общем `Box`, и высота верхнего слоя — не только визуал, но и математика скролла:

```
слой 1 «свёрнутый ряд»    offset = 0,  h → onMainContentSizeChanged → topContentSize
слой 2 «раскрытый блок»   offset = topContentSize − paddingBottom + heightOffset
```

Инфраструктура состоянийзависимых значений уже используется обоими компонентами: `descriptionPadding` — это `StatefulValue<Dp>` в Compose и `NumberStateList` (`@xml/..._description_margin` с ключом `sd_state_collapsed`) во View.

## Goals / Non-Goals

**Goals:**
- Дать теме возможность задать нижнюю границу высоты контент-области навбара, чтобы бар не менял высоту между экранами с разным содержимым слотов.
- Покрыть `NavigationBar` в Compose и View и `CollapsingNavigationBar` в Compose одним и тем же понятием.
- Для `CollapsingNavigationBar` — дать управление высотой именно свёрнутого ряда.
- Сохранить полную обратную совместимость: без явно заданного значения ничего не меняется.

**Non-Goals:**
- Фиксированная (не минимальная) высота бара.
- Ограничение высоты сверху и обрезка контента, превышающего минимум.
- Схлопывающийся навбар во View-системе — его не существует, и этот change его не вводит.
- Заведение токена высоты в источниках тем и перегенерация модулей `tokens/*`.
- Изменения генератора тем: существующий путь для `dimension`-атрибутов и `NumberStateList` уже покрывает новое свойство.

## Decisions

### D1. Минимум применяется к контент-области, а не к полной высоте бара

Свойство называется `minContentHeight` и задаёт минимальную высоту **ряда экшенов** (области между вертикальными отступами), а не полную высоту компонента. Значение применяется напрямую, без вычитания паддингов.

Причина — структурное расхождение из раздела Context. Если бы минимум означал полную высоту ряда вместе с паддингами, платформы разъехались бы на сценарии «текст снизу»: в Compose нижний паддинг ряда обнулён, и ряд растянулся бы на величину этого паддинга, сместив текстовый блок вниз; во View паддинги лежат на контейнере, и ряд не растянулся бы вовсе. Минимум контент-области — единственная семантика, дающая идентичный результат на обеих иерархиях.

Прямое следствие для авторов тем: значение задаётся в терминах контент-области. Если дизайн оперирует полной высотой бара, пересчёт `minContentHeight = высотаБара − paddingTop − paddingBottom` выполняется на стороне источника токенов, а не в рантайме компонента.

Отвергнутая альтернатива — назвать свойство `height`/`minHeight` в терминах полной высоты и вычитать паддинги внутри компонента (прецедент: `TextField.kt:730`, `_decorationBox.minimumHeight = (minimumHeight - totalHeight)...`). Отвергнута ради однозначности имени: имя должно совпадать с применяемой величиной, иначе на каждом чтении кода приходится держать в голове скрытое вычитание.

### D2. Минимум складывается в `contentHeight`, а не в итоговую высоту

В `NavBarMeasurePolicy` минимум входит в тот же `maxOf`, что и слоты:

```kotlin
val contentHeight = maxOf(
    startContent.heightOrZero(),
    centerContent.heightOrZero(),
    endContent.heightOrZero(),
    minContentHeight.roundToPx(),
)
```

Это важнее, чем кажется: `contentHeight` уже используется ниже в трёх местах, и все три становятся корректными автоматически.

- `onMainContentSizeChanged(contentHeight + paddingTop + paddingBottom)` — репортит высоту **после** минимума, поэтому `topContentSize` в `BaseCollapsingNavBar` остаётся правдой и раскрытый блок не наезжает на свёрнутый ряд.
- `height = contentHeight + offset + paddingTop + paddingBottom` — итоговая высота растёт ровно на добивку.
- `calculateVerticalPosition(containerHeight = contentHeight, elementHeight = …)` — слоты центрируются внутри увеличенной области, а не прилипают к верху.

Если бы минимум применялся к `height`, каждое из этих трёх мест пришлось бы чинить отдельно. Складывание в `contentHeight` — ещё один аргумент в пользу семантики из D1.

### D3. Тип значения — `StatefulValue<Dp>` в Compose и `NumberStateList` во View

`CollapsingNavigationBar` по своей природе требует двух значений: минимум свёрнутого ряда и минимум раскрытого блока. Состоянийзависимое значение выражает это одним свойством, потому что оба слоя уже читают один и тот же токен по разным состояниям (`BaseCollapsingNavigationBar.kt`):

```kotlin
// верхний слой (свёрнутый ряд)
style.dimensions.minContentHeight.getValue(interactionSource, setOf(CollapsingNavigationBarStates.Collapsed))
// нижний слой (раскрытый блок)
style.dimensions.minContentHeight.getValue(interactionSource)
```

Это ровно тот способ, которым здесь уже читается `descriptionPadding`. «Высота свёрнутого бара» из постановки задачи — значение для состояния `Collapsed`. Минимум раскрытого блока остаётся опциональным: если тема не задала дефолтное значение, его просто нет.

Для обычного `NavigationBar` состоянийзависимость даёт разные минимумы для `text-inlined` и обычного режима. В Compose значение резолвится как `minContentHeight.getValue(setOf(textPlacement))` — калька с `NavigationBar.kt:76`. Во View тому же соответствует существующее состояние `sd_state_collapsed` (`api_name="text-inlined"`, `NavigationBar.kt:1192` `InlinedState`).

Отвергнутая альтернатива — скалярные `Dp`/`Int` плюс отдельное поле `collapsedMinContentHeight` для Collapsing. Отвергнута: плодит поля, не покрывает ось `text-inlined` и расходится с уже принятым в этих же компонентах способом описания состоянийзависимых размеров.

### D4. Во View — собственный атрибут `sd_minContentHeight`, а не `android:minHeight`

Атрибут объявляется как

```xml
<attr name="sd_minContentHeight" format="dimension|reference"
      sdds:api_name="minContentHeight" sdds:api_type="dimension" />
```

то есть точной калькой с `sd_descriptionMargin`. `format="dimension|reference"` обязателен: без `reference` в атрибут нельзя положить `@xml/`-ресурс с `NumberStateList`.

`android:minHeight` (прецеденты: `button_attrs`, `chip_attrs`, `cell_layout_attrs`, `card_attrs`) отвергнут по двум причинам. Во-первых, его разбирает базовый конструктор `View`, и минимум сел бы заодно на сам `NavigationBar` — а он `LinearLayout`, который при добивке высоты не перецентрирует детей, и контент уехал бы вверх. Во-вторых, платформенный `android:minHeight` объявлен с форматом `dimension`, и `@xml/`-ресурс в него положить нельзя, что убивает D3.

### D5. Во View минимум пробрасывается в `actionsBlock` через `minimumHeight`

`NavigationBar` резолвит `NumberStateList` по `drawableState` и выставляет `actionsBlock.minimumHeight`. Это существующий в модуле паттерн проброса минимума во внутренний блок (`Popover.kt:110,149,615`).

`CustomCenteringLayout.onMeasure` сейчас заканчивается на `resolveSize(heightUsed, heightMeasureSpec)` и минимум игнорирует — `resolveSize` про `suggestedMinimumHeight` ничего не знает. Нужен явный `maxOf(heightUsed, suggestedMinimumHeight)` перед `resolveSize` (прецеденты: `CellLayout.kt:396`, `FlowLayout.kt:241`).

Центрирование во View править не нужно: `CustomCenteringLayout.onLayout` уже раскладывает детей от `centerY = (b - t) / 2` через `viewTop(h) = centerY - h / 2`, поэтому при добивке высоты они центрируются сами.

### D6. Обновление по смене состояния

Во View значение обновляется тем же механизмом, что и `descriptionMargin`: приватный `refreshMinContentHeight()` пересчитывает `currentMinContentHeight` из `NumberStateList.getIntForState(drawableState)` и вызывается из `drawableStateChanged()` рядом с `refreshDescriptionMargin()`. Публичные сеттеры — `setMinContentHeightsList(NumberStateList?)` и `setMinContentHeight(Int)` — по образцу `setDescriptionMarginsList`/`setDescriptionMargin`.

### D7. Инсеты

В `BaseCollapsingNavBar` `windowInsetsPadding(WindowInsetsSides.Top)` применяется на внешнем `Box`, над обоими слоями. Значит `minContentHeight` считается в области **под** статус-баром и не включает его высоту — как `containerHeight` у `TopAppBar` в Material. Отдельного кода не требует, но фиксируется в KDoc свойства, чтобы не разойтись с макетом на устройствах с разными инсетами.

### D8. Дефолт и обратная совместимость

Дефолт — `0.dp` в Compose и отсутствие атрибута во View. Ни одна тема в `tokens/` сейчас не задаёт высоту навбара, поэтому после изменения все существующие стили измеряются ровно как раньше: `maxOf(…, 0)` не влияет на результат.

### D9. KDoc

Новые публичные члены — свойства `minContentHeight` в двух интерфейсах Compose, методы билдеров, атрибут `sd_minContentHeight` (комментарий в XML) и публичные сеттеры View-компонента — получают KDoc/комментарии на русском в стиле окружающего кода. В KDoc явно указывается, что величина относится к контент-области без учёта вертикальных отступов (D1) и не включает системные инсеты (D7).

## Risks / Trade-offs

- **[Тема задаёт `minContentHeight` в терминах полной высоты бара]** → визуально бар окажется выше на `paddingTop + paddingBottom`. Митигируется явной формулировкой в KDoc и в spec-требовании; ошибка заметна сразу на первом же рендере.
- **[Слот выше минимума — бар всё равно «скачет»]** → осознанный компромисс D1/Non-Goals: `center`-слот принимает произвольный контент и меряется `looseConstraints`, поэтому фиксированная высота дала бы обрезку. Минимум решает заявленный сценарий (иконка против текста) и оставляет запас для нестандартного контента.
- **[Регресс раскрытого блока `CollapsingNavigationBar`]** → снимается D2: минимум входит в `contentHeight`, который и уезжает в `onMainContentSizeChanged`, поэтому `topContentSize` остаётся согласованным с реальной высотой свёрнутого ряда. Отдельно проверяется, что `heightOffsetLimit` (считается от `bottomContentSize`) не затронут.
- **[`remember` в `NavigationBarLayout` не пересоберёт policy]** → `remember(centerAlignmentStrategy, textAlign, offsetPx, onMainContentSizeChanged, paddings)` на `NavigationBarLayout.kt:50` обязан получить `minContentHeight` в список ключей, иначе смена значения не приведёт к перемеру.
- **[Скриншот-тесты в `tokens/*` не поймают регресс]** → по опыту репозитория эти тесты могут прогоняться против опубликованного артефакта uikit, а не против локального кода. Перед тем как полагаться на них как на защиту, это нужно проверить; основную защиту дают тесты `sdds-core/uikit-compose` и `sdds-core/uikit` и фикстуры в `integration-core`.

## Validation

- `:sdds-core:uikit-compose:spotlessApply`, `:sdds-core:uikit:spotlessApply`
- `:sdds-core:uikit-compose:detekt`, `:sdds-core:uikit:detekt`
- `:sdds-core:uikit-compose:test`, `:sdds-core:uikit:test`
- При сомнениях в межмодульном влиянии — `./gradlew testAll` из корня репозитория.
