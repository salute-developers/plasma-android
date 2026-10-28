## Why

`List` в Compose-UIKit (`sdds-core/uikit-compose`) — обёртка над `LazyColumn`: прокручиваемый «контейнер-окошко», который обязан иметь конечную высоту. Типовой экран «заголовок + несколько карточек-секций по 3–5 `ListItem` с разделителями» (пример из практики: экран настроек уведомлений с заголовком «уведомлять при») требует **одной** прокрутки на весь экран, где карточка-секция — неделимый статический `item` (общий фон/скругление нельзя натянуть на несколько отдельных items ленты). Статического аналога `List` в ДС нет: вложить `List` в прокручиваемый `List` нельзя (`LazyColumn` измерится с `maxHeight = Infinity` → `IllegalStateException`; существующий `userScrollEnabled = false` отключает только жест, не механизм), и пользователи собирают секции вручную из `Card` + `Column` + `Cell` + `Divider` с самописными спейсерами и альфой — вне стилевых контрактов ДС.

Дизайн-система не планирует отдельный макет/компонент «секция», поэтому решение уровня API: дать `List` **статический режим рендера** — отдельная функция `StaticList`, сохраняющая контент-контракт и стилевой контракт `List`, но раскладывающая содержимое обычной `Column` (высота = сумма детей, никакой собственной прокрутки).

## What Changes

- В `sdds-core/uikit-compose` вводится публичная функция **`StaticList`** (рядом с `List`, тот же файл-сосед `List.kt` или новый `StaticList.kt`): принимает тот же контент-DSL `LazyListScope.() -> Unit` (`item {}` / `items(count) {}` / `itemsIndexed`), но рендерит его в `Column` — без прокрутки, без `LazyListState`, безопасна для вложения в любой прокручиваемый контейнер (в т.ч. в `List`).
- **Стилевой контракт переиспользуется существующий**: `StaticList(style: ListStyle = LocalListStyle.current)` — фон/форма/gap/паддинги/вложенные `listItemStyle`/`dividerStyle` берутся из `ListStyle`. Следствие: все уже сгенерированные бренд-стили (`List.S.HasBackground` и др. во всех `tokens/*`) работают для `StaticList` **из коробки**, макеты дизайна и изменения внешней themebuilder-конфигурации не требуются.
- Сохраняются: `CompositionLocalProvider(LocalListItemStyle, LocalDividerStyle)` над контентом (как в `List`), фоновая кисть через `backgroundBrush` + shape, разрешение gap/paddings из стиля, motion-слой `ListMotionStyle`/`rememberListMotion` (переиспользуется без нового стиля).
- Прокруточные параметры `state: LazyListState`, `flingBehavior`, `userScrollEnabled` в сигнатуру сознательно не входят: у статического контейнера прокрутки нет, их наличие было бы ловушкой. `reverseLayout` поддерживается.
- Изменение **только Compose-стека** (`sdds-core/uikit-compose`), полностью **аддитивное**: `List`, `ListStyle`, `ListItem` и их поведение не меняются. View-система (`sdds-core/uikit`) не затрагивается.
- Демо/инфраструктура: story в сэндбоксе (расширение существующей `ListStory` переключателем движка), testcase-фикстуры, раздел документации на существующей странице `ListUsage.md` + docs-сэмпл.
- Генерируемые per-brand файлы `tokens/*/styles/**` **не меняются вообще** (в отличие от первоначального варианта `ListSection` — здесь новая стилевая сущность не вводится).

## Capabilities

### New Capabilities
- `static-list-compose`: статический (нескроллируемый) режим списка для Compose — публичный API `StaticList` на контент-контракте `LazyListScope`, стилевой контракт на базе существующего `ListStyle`, контракт безопасности вложения в прокрутку, ограничения eager-рендера (keys/contentType).

### Modified Capabilities
*(нет — в `openspec/specs/` нет задокументированной capability для `List`/`ListItem`, требований к переносу нет)*

## Impact

- **Публичный API**: `sdds-core:uikit-compose` — новые composable-перегрузки `StaticList(...)` (с `interactionSource` и с `motion`). Aditive-only; обновить дамп binary-compatibility-validator `sdds-core/uikit-compose/api/uikit-compose.api` (`apiDump`) — только новые символы.
- **Стили/токены**: новых стилевых типов **нет** (`ListStyle` не меняется → `ListStyleBuilder`, api-info-меты и themebuilder-конвейер не затронуты); бренд-стили `List.S.*` применимы к `StaticList` без перегенерации. `tokens/**` не трогаем.
- **Внутренние утилиты**: возможно, небольшой extract существующих приватных хелперов (`UnspecifiedPaddingValues`/`getContentPaddings` из `List.kt`, `toArrangementSpacing` из `Segment.kt`) в internal — без изменения публичного поведения.
- **Sandbox/demo**: `integration-core/uikit-compose-fixtures` — расширение `ListStory` (свойство-переключатель движка Scrollable/Static, KSP-пикер подхватит enum автоматически) + `ListSamples` (новый `@DocSample`). Новой регистрации компонента в `integration-core/sandbox-core` **не требуется** — это тот же `ComponentKey.List`.
- **Testcases**: `integration-core/uikit-compose-testcases` — статические варианты кейсов рядом с `ListTestCases.kt`.
- **Документация**: `build-system/docs-template/compose-template/docs/components/ListUsage.md` — раздел «StaticList» (`List` vs `StaticList`, запрет `List`-в-`List`, паттерн «секция внутри прокрутки»); новая страница и правка `structure.json` не нужны.
- **Тесты**: скриншотные фикстуры подключаются бренд-модулями сразу (стили уже существуют) — в скоупе добавляем testcase-композиции + один brand-тест-референс (`plasma.homeds.compose`); остальные бренды — по желанию владельцев.
- **Валидация**: `:sdds-core:uikit-compose` (test/detekt/spotless/apiCheck), сборка фикстур; полный `testAll` — перед мёржем/в CI.
- **Superseded**: предыдущий proposal `add-list-section` (новый компонент + новый стиль) отклонён (дизайн-макет компонента не планируется) и удалён из `openspec/changes/`; его «ручная» мотивация перенесена сюда.
