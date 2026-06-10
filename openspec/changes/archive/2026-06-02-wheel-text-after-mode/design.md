## Context

Компонент `BaseWheel` (`sdds-core/uikit-compose`) рендерит `textAfter` внутри каждого прокручиваемого элемента `LazyColumn`. Сценарии типа «выбор времени» требуют суффикс (например, «ч»), который остаётся неподвижным рядом с центральным (выбранным) элементом, не прокручиваясь вместе с остальными. Текущая архитектура не предусматривает такой режим.

Затронутые модули: `sdds-core/uikit-compose` (runtime), `sdds-core/plugin_theme_builder` (кодогенерация).

## Goals / Non-Goals

**Goals:**
- Добавить `enum class TextAfterMode { EachItem, Static }` в публичное API.
- В режиме `Static` рендерить единый неподвижный `Text` поверх области колеса, выровненный по вертикальному центру и горизонтально размещённый по самому широкому тексту элемента.
- Сохранить полную обратную совместимость: дефолт — `EachItem`, поведение не меняется.
- Добавить явный источник статичного суффикса: `WheelDataSet.staticTextAfter`.
- Зафиксировать горизонтальную позицию статичного суффикса по самому широкому основному тексту элементов, чтобы суффикс не прыгал при прокрутке.
- Пробросить `textAfterMode` через `WheelStyle` → `Wheel` → `BaseWheel`.
- Добавить поддержку нового поля в `WheelProperties` и `WheelComposeVariationGenerator`.

**Non-Goals:**
- View-реализация (изменяется только Compose-стек).
- Анимация плавного перехода позиции статичного суффикса при смене выбранного элемента.
- Поддержка `textAfterMode` в View-кодогенераторе `WheelViewStyleGenerator`.

## Decisions

### 1. Расположение `TextAfterMode`

`TextAfterMode` объявляется в `Wheel.kt` (`com.sdds.compose.uikit`) — рядом с другими публичными enum-ами компонента (`WheelAlignment`, `DataEdgePlacement`, `WheelSeparator`). Внутренний `BaseWheel` получает параметр того же типа.

**Альтернатива:** отдельный файл. Отклонено — существующие enum-ы компонента живут в `Wheel.kt`, разрыв не оправдан.

### 2. Обратная совместимость

`WheelStyle` получает новое поле `textAfterMode: TextAfterMode` со значением по умолчанию `TextAfterMode.EachItem` в `DefaultWheelStyle.Builder.style()`. `WheelStyleBuilder` получает метод `fun textAfterMode(mode: TextAfterMode): WheelStyleBuilder`. `WheelDataSet` получает опциональное поле `staticTextAfter: String? = null` через `@JvmOverloads constructor`, поэтому старые вызовы остаются рабочими. Существующие вызовы без явного `textAfterMode` ведут себя идентично нынешнему поведению.

### 3. Рендеринг статичного `textAfter` в `BaseWheel`

В режиме `Static`:
- Элементы `LazyColumn` не рендерят `textAfter` (передаётся `null`/пустая строка внутрь `Item`).
- `SubcomposeLayout` в `BaseWheel` измеряет ширину контента без учёта `textAfter` (widest item по тексту основного поля).
- Единый `SubcomposeLayout` измеряет `LazyColumn`, описание, controls и статичный оверлей, а затем размещает их в одном layout-pass.
- `LazyColumn` размещается внутри clipped viewport высотой `scaledWheelHeight`; сама колонка сохраняет высоту `itemHeight * visibleItemsCount` и центрируется внутри viewport, как в прежней реализации с внешним viewport-контейнером.
- `Description`-оверлей размещается как в прежнем `Box(contentAlignment = ...)`: сначала центрируется внутри viewport по вертикали и горизонтальному alignment с тем же округлением до px, затем получает вычисленный vertical offset относительно центрального item.
- Горизонтальная позиция `staticTextAfterOffsetX` вычисляется через `rememberTextMeasurer()` по максимальной ширине основного текста среди исходных `items`, не включая dummy-элементы из `extendedList`. К ней добавляется `textAfterPadding`.
- Для `Start` суффикс ставится после самого широкого item-текста; для `Center` учитывается центрирование основного текста внутри колонки; для `End` суффикс размещается у правого края, а `LazyColumn` получает дополнительный end padding под ширину суффикса.
- При fixed width constraints ширина layout берётся из `constraints.maxWidth`, но высота остаётся суммой controls и рассчитанной высоты viewport; wheel не растягивается на всю доступную высоту.

**Альтернатива: позиция по ширине текущего выбранного элемента.** Даёт меньший отступ для коротких значений, но суффикс прыгает при прокрутке элементов разной ширины. Отклонено: для статичного режима важнее неподвижность суффикса.

### 4. Конфликт параметров `textAfter` в режиме `Static`

`WheelItemData.textAfter` остаётся без изменений и продолжает означать уникальный суффикс конкретного элемента в режиме `EachItem`. Для режима `Static` используется новый явный источник `WheelDataSet.staticTextAfter`.

Для обратной совместимости `BaseWheel` может использовать первый непустой `WheelItemData.textAfter` как fallback, если `staticTextAfter == null`. Новые сценарии должны задавать `staticTextAfter` явно.

**Альтернатива: использовать `WheelItemData.textAfter` в обоих режимах.** Минимизирует API, но смешивает два разных смысла поля: уникальный item suffix и общий static suffix. Отклонено после уточнения контракта данных.

### 5. Генерация кода в `WheelComposeVariationGenerator`

`WheelProperties` получает поле `textAfterMode: Value? = null`. В `propsToBuilderCalls` добавляется `textAfterModeCall(props)`, генерирующий `.textAfterMode(TextAfterMode.<EachItem|Static>)` при наличии значения. Импорт `TextAfterMode` добавляется в `onAddImports` генератора wheel-стилей.

## Risks / Trade-offs

- **[Trade-off] В режиме `Static` позиция суффикса резервируется по самому широкому тексту** → для коротких выбранных значений будет дополнительный промежуток, зато суффикс остаётся неподвижным.
- **[Trade-off] `WheelDataSet` получает новое поле** → публичный API расширяется, но через nullable default и `@JvmOverloads` сохраняет обратную совместимость для существующих вызовов.
- **[Риск] Fallback из `WheelItemData.textAfter` остаётся неочевидным** → он нужен только для совместимости; документация и fixtures используют `staticTextAfter` явно.
