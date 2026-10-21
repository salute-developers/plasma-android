## Context

`List.kt` (`sdds-core/uikit-compose/src/commonMain/kotlin/com/sdds/compose/uikit/List.kt`) — тонкая обёртка над `LazyColumn`: принимает `state: LazyListState`, `flingBehavior`, `userScrollEnabled`, контент `LazyListScope.() -> Unit`; оборачивает в `CompositionLocalProvider(LocalListItemStyle provides style.listItemStyle, LocalDividerStyle provides style.dividerStyle)` и рисует фон `style.colors.backgroundBrush` формы `style.shapes` поверх `LazyColumn`. `ListStyle` (`ListStyle.kt`) полностью stateful (`StatefulValue`-контракты `colors`/`shapes`/`dimensions`), per-brand стили (`List.S.*` во всех `tokens/*`) уже сгенерированы и являются экземплярами именно этого типа.

Проблема потребителя (обсуждение с лидом зафиксировано): экран «заголовок + карточки-секции по 3–5 `ListItem` с разделителями» прокручивается целиком; общий фон/скругление секции нельзя задать на группу отдельных items ленты — секция обязана быть одним `item {}`, а значит внутри неё не может быть lazy-контейнера: `LazyColumn` внутри прокрутки измеряется с `maxHeight = Infinity` и падает (или требует фиксированной высоты); `userScrollEnabled = false` отключает только жест, не механизм прокрутки и не проблему измерения. Статического аналога нет — секции лепят вручную из `Card`/`Column`/`Cell`/`Divider` вне DS-контрактов.

Ранее предложенный `ListSection` (новый компонент + новый `ListSectionStyle`) отклонён: дизайн-макет отдельной «секции» не планируется, а новый стилевый тип потребовал бы внешней конфигурации в `theme-converter` и перегенерации токенов. `StaticList` снимает оба требования: тип стиля не меняется, существующие `List.S.*` применимы как есть.

Внутри репозитория уже есть рабочий precedent статического контейнера со «списочным» контрактом — `SegmentVertical` (`Segment.kt`): `Column` + `backgroundBrush` + `Arrangement.spacedBy(gap)` + прокидка `LocalDividerStyle`. Также в uikit-compose есть практика отдельных функций вместо флагов-режимов (`SegmentHorizontal`/`SegmentVertical`, перегрузки List с motion).

## Goals / Non-Goals

**Goals:**
- Публичная функция `StaticList` в `sdds-core:uikit-compose`: контент-контракт `LazyListScope.() -> Unit` (привычный `item {}`/`items {}`), движок раскладки — `Column`, высота = содержимое, безопасность вложения в прокручиваемые контейнеры.
- Визуальный/стилевой контракт 1-в-1 с `List`: тот же `ListStyle`, тот же `LocalListStyle`, те же CompositionLocals (`listItemStyle`/`dividerStyle`), фон/shape/gap/contentPaddings резолвятся идентично → бренд-стили `List.S.*` работают без изменений где-либо во внешней генерации.
- Motion-слой без нового типа: существующие `ListMotionStyle`/`rememberListMotion` (анимируемый фон есть только в них).
- Демо в существующей `ListStory` (переключатель движка), testcase-фикстуры, раздел на существующей странице `ListUsage.md`.
- Полная аддитивность: `List`/`ListStyle`/`ListItem` не меняются.

**Non-Goals:**
- Новый компонент/компонентный макет дизайна, новый стилевой тип (`ListSectionStyle`), изменения внешней themebuilder-конфигурации (`theme-converter`) и перегенерация `tokens/**` — ничего из этого не нужно и не делается.
- View-система (`sdds-core/uikit`) — не затрагивается.
- Ленивость в статическом режиме (оконное переиспользование) — не делается: статический режим существует ровно для того, чтобы не быть lazy.
- Изменение семантики `userScrollEnabled` у `List` — не делается.

## Decisions

### 1. Отдельная функция `StaticList`, а не режим/флаг внутри `List`
```kotlin
@Composable
fun StaticList(
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    contentPadding: PaddingValues = UnspecifiedPaddingValues,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: LazyListScope.() -> Unit,
)
// + перегрузка motion: Motion<ListMotionStyle> — по образцу List
```
Аргументы `state: LazyListState`, `flingBehavior`, `userScrollEnabled` в сигнатуру **не входят**: у контейнера без прокрутки они бессмысленны, а их присутствие — ловушка («передал state — думает, что управляю прокруткой»).

*Почему не флаг в `List`*: (а) при `isScrollable = false` большинство параметров `List` (`state`, `flingBehavior`, `userScrollEnabled`) тихо теряли силу — «валидные-невалидные» параметры; (б) `List` уже опубликован, BCV не даст менять сигнатуру без adding overload'ов, а перегрузка с флагом даёт две почти идентичные точки входа с разной семантикой половины аргументов; (в) практика uikit-compose — отдельные функции под отдельные роли (`SegmentHorizontal`/`SegmentVertical`); (г) семантика «LazyColumn vs Column» — это различие движков раскладки, а не настроек: отдельное имя лучше гуглится и честнее в KDoc.
*Почему не переиспользовать `userScrollEnabled = false` как переключатель режима*: опубликованное поведение (жест выключен, скролл-контейнер на месте) менять нельзя — silent breaking change; и это всё равно не чинит измерение с `Infinity`.

*Альтернатива — отдельный DSL (`StaticListScope { item {} }`)*: отказались — потребители имели бы два почти одинаковых DSL; сохранение `LazyListScope` позволяет переносить существующий контент `List` в `StaticList` заменой имени функции.

### 2. Реализация контент-контракта — internal-рекордер `LazyListScope`
`LazyListScope` — обычный интерфейс; пишем internal-реализацию `StaticListScopeImpl`, **записывающую** вызовы `item`/`items`/`itemsIndexed` (методы с дефолтными реализациями в androidx делегируют к ним автоматически) во внутреннюю коллекцию записей `{ key, contentType, content(index) }`; затем рендерим записи в `Column` в порядке объявления. Это уже применяемый в библиотеке паттерн scope-коллекции (`SegmentScopeImpl` + `SegmentItem` в `Segment.kt`).

Семантика полей записи в статическом режиме:
- `key` — применяется через `androidx.compose.runtime.key(...)` вокруг контента (сохраняется стабильная идентичность для анимаций/состояний, семантика «как у LazyColumn» сохраняется бесплатно);
- `contentType` — игнорируется (нет recycling — нет и применения); документируется;
- индекс элемента передаётся в content-лямбду как в `LazyColumn`.

*Риск* реализации чужого интерфейса — в новой версии foundation могут появиться **абстрактные** методы: компилятор сломает сборку сразу (не рантайм), фикс — тривиальная дописывалка; фиксируем как check при апгрейде Compose (см. Risks).

### 3. Стили — переиспользование `ListStyle` без правок
`StaticList` читает те же поля, что `List`: `style.colors.backgroundBrush` (`getBrushAsState(motion.context, motion.style.backgroundColor)` + `backgroundBrush(modifier, shape)`), `style.shapes.getValue(interactionSource)`, `style.dimensions.gapValues` → `Arrangement.spacedBy` с нормализацией `Unspecified → 0.dp` (тот же приём, что `gap.toArrangementSpacing()` в `Segment`), content-padding'и из `getContentPaddings(...)`, и прокидывает `LocalListItemStyle`/`LocalDividerStyle` из `style.listItemStyle`/`style.dividerStyle`.

Следствие (главный аргумент решения): «карточка-секция» = `StaticList(style = List.S.HasBackground.style())` — фон/скругление/паддинги/вложенные стили `ListItem`/`Divider` берутся из уже существующих бренд-стилей; ни новых токенов, ни макетов, ни изменений в `theme-converter`/`plugin_theme_builder`/`tokens/**` не требуется. Новые public-символы — только функции, `@ApiInfo`-билдеры не тронуты → api-info/themebuilder-меты не меняются.

Частичный extract: приватные `UnspecifiedPaddingValues`/`ListDimensions.getContentPaddings` из `List.kt` и `Dp.toArrangementSpacing()` из `Segment.kt` переносятся в internal-утилиты и переиспользуются `StaticList` (поведение `List`/`Segment` не меняется). Если extract заденет слишком много — допустимо продублировать хелперы в internal `StaticList.kt`, это не публичный API.

### 4. Движок — `Column`, не самодельный `Layout`
`Column(reverseLayout, verticalArrangement, horizontalAlignment)` + `Modifier.backgroundBrush(...)` — минимальная поверхность: высота = сумма детей (дочерние `ListItem` не lazy и контент-сайзены), никаких constraint-трюков. `reverseLayout` поддерживает перевернутый порядок (полный аналог порядка `LazyColumn` при `reverseLayout = true`, без скролл-составляющей — её нет по определению).

### 5. Motion — переиспользование `ListMotionStyle`
Существующий `rememberListMotion` + публичная перегрузка `StaticList(motion, ...)` — по образцу обеих перегрузок `List`. Новый motion-стиль не вводится: набор анимируемых свойств у статического контейнера тот же (фон/паддинги/зазор), что резолвится через `motion.context` generic-механизмом.

### 6. Eager-семантика и рекомендации в KDoc
Все элементы композятся сразу — это суть режима; для секций 3–10 элементов стоимость пренебрежима. В KDoc и документации явно: **для длинных лент — `List`; `StaticList` — для групп/секций внутри прокручиваемого контейнера и экранов без прокрутки**; `StaticList` безопасно вложен в `List` (в отличие от `List` в `List`).

### 7. Демо/фикстуры/доки — минимальные правки, без новых регистраций
- `ListStory` (`integration-core/uikit-compose-fixtures`): в `ListUiState` добавляется enum-свойство движка (`ListEngine { Scrollable, Static }`); контент уже написан на `LazyListScope` — вызов меняется на `when (state.engine) { Scrollable -> List(...) ; Static -> StaticList(...) }` с одним и тем же content. `ListUiStatePropertiesProducer`/`ListUiStateTransformer` — генерируемые sandbox-ksp (`@StoryUiState` → `StoryPropertiesProducerGenerator`/`StoryStateTransformerGenerator`), перегенерируются автоматически; KSP-пикер enum (`enumProperty`) подхватит enum без ручных правок UI (механизм проверен на `add-checkbox-error-state`). `ComponentKey.List` не меняется, регистрация в `sandbox-core` не нужна.
- `ListTestCases.kt` (`integration-core/uikit-compose-testcases`): статические дубль-кейсы (`StaticListAmountThreeHasDisclosure(style)` и т.п.) — переиспользуют те же аргументы-стили, что lazy-кейсы.
- Скриншотный референс заводится в одном бренд-модуле (`tokens/plasma.homeds.compose`, по образцу `ComposeListScreenshotTest.kt`, baseline в `screenshots-compose/`) — этого достаточно для защиты от регрессов; тираж по остальным брендам — отдельной задачей владельцам.
- Документация: раздел «StaticList» в существующем `build-system/docs-template/compose-template/docs/components/ListUsage.md` (+ `@DocSample` в `ListSamples.kt`) — «когда List vs StaticList», запрет `List`-в-`List`, паттерн «секция внутри прокрутки». `structure.json` не правится.

## Risks / Trade-offs

- **[Риск] Реализация чужого интерфейса `LazyListScope`: новая версия androidx может добавить абстрактные методы.** → Компиляторная (не рантайм) поломка при апгрейде Compose; фикс — заглушка/реализация нового метода в рекордере. Фиксируется как check-пункт процесса апгрейда Compose (KDoc рекордера с явной пометкой).
- **[Риск] Ожидание ленивости: `StaticList(items(10_000))` даст 10k композиций.** → Осознанно: ограничение документируется в KDoc (`@remark`-подобное замечание) и на странице доков; жёсткий лимит не вводим (легитимны и экраны на ~50 элементов без прокрутки).
- **[Риск] Расхождение поведения `LazyListScope`-контракта между режимами** (contentType игнорируется; нет `item`-measure-оптимизаций; `key` через `runtime.key`, а не через lazy-механизм) → Всё расхождение перечисляется в KDoc одним списком; testcase-кейсы покрывают key/items/itemsIndexed пути.
- **[Trade-off] `StaticList` визуально дублирует «карточку-секцию» с самописными `Card`+`Column`** — у потребителя два пути. → Публичный путь с контрактом (`List.S.*`) документируется как рекомендуемый; самописный остаётся ответственностью потребителя, библиотеку это не ограничивает.
- **[Trade-off] Два имени (`List`/`StaticList`) вместо одного API с режимом** — когнитивная цена выбора. → Обоснована Decision 1; взаимный перенос контента — замена имени функции.

## Open Questions

- Имя enum-свойства движка в `ListUiState` для пикера сэндбокса (`engine`/`type`) — решить при реализации по конвенциям соседних story; на публичный API не влияет.
- Показывать ли `StaticList` в превью карточки компонента (`Preview` в `ListStory`) — оставить Scrollable или чередовать; решить при визуальной проверке сэндбокса.
