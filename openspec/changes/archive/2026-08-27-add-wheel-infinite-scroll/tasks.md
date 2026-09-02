## 1. `sdds-core:uikit-compose` — публичный API (`Wheel.kt`)

- [x] 1.1 Добавить поле `looping: Boolean = false` в `data class WheelDataSet`, сохранив порядок и значения по умолчанию остальных полей (обратная совместимость конструктора и `copy()`).
- [x] 1.2 Обновить KDoc `WheelDataSet`: описать `looping`, явно указать, что при `looping = true` значение `dataEdgePlacement`, переданное в `Wheel(...)`, для этого колеса не применяется.
- [x] 1.3 Прокинуть `data.looping` из `Wheel(...)` в вызов `BaseWheel(...)` новым параметром `looping`.

## 2. `sdds-core:uikit-compose` — измерение ширины (`BaseWheel.kt`, `WheelTextMetrics`)

- [x] 2.1 Убедиться (и при необходимости зафиксировать явным типом/аргументом), что `WheelTextMetrics`/`rememberWheelTextMetrics` строится только по реальному `items: List<WheelItemData>`, независимо от `looping` — виртуальный индекс прокрутки не должен попадать в эти вычисления ни в каком виде.
- [x] 2.2 Проверить, что `calculateLazyColumnWidth`/пробное измерение (`measureItemProbe`) для looping-колеса измеряет тот же `widestItem`, что и для non-looping колеса с идентичным `items`.

## 3. `sdds-core:uikit-compose` — список и паддинг (`rememberExtendedList`, `DataEdgePlacement`)

- [x] 3.1 При `looping = true` не вызывать (или обходить) `rememberExtendedList`/dummy-паддинг краёв — looping-ветка использует немодифицированный `items`, без пустых элементов по краям, независимо от переданного `dataEdgePlacement`.

## 4. `sdds-core:uikit-compose` — зацикленная прокрутка (`LazyColumn`, `LazyListState`)

- [x] 4.1 Реализовать looping-ветку рендера: `LazyColumn` с `items(count = Int.MAX_VALUE) { virtualIndex -> items[virtualIndex.mod(items.size)] }` вместо `items(count = extendedList.size)`.
- [x] 4.2 Реализовать вычисление начальной позиции `LazyListState` для looping-колеса: якорь рядом с серединой `Int.MAX_VALUE`, выровненный по `items.size`, плюс `initialIndex`.
- [x] 4.3 Сохранить существующую визуальную transform-логику (scale/alpha/translation по `state.layoutInfo`) без изменений для looping-ветки — работает по тому же принципу, что и сейчас, просто над другим индексным пространством.
- [x] 4.4 Убедиться, что `rememberSnapFlingBehavior` корректно работает с виртуальным индексным пространством (snap к ближайшему элементу не деградирует на больших индексах).

## 5. `sdds-core:uikit-compose` — выбор элемента и управляющие стрелки

- [x] 5.1 Реализовать вычисление реального индекса данных для `onItemSelected` в looping-режиме: `centerVirtualIndex.mod(items.size)`, без клампа.
- [x] 5.2 Обновить логику управляющих стрелок (`hasControls`, `controlTargetIndex`/`controlScrollJob`) для looping-колеса: инкремент/декремент виртуального индекса без ограничения по `[0, items.size - 1]`; кнопки не должны блокироваться на первом/последнем элементе `items`.
- [x] 5.3 Убедиться, что для non-looping колёс (`looping = false`) поведение `onItemSelected` и управляющих стрелок не изменилось (регрессионная проверка).

## 6. Тесты

- [x] 6.1 Unit/UI-тесты на зацикленную прокрутку: докрутка после последнего элемента показывает первый, и наоборот (соответствует сценариям `specs/wheel-compose-looping/spec.md`). Реализовано как unit-тест чистой функции `calculateLoopingInitialFirstVisibleItemIndex` (`BaseWheelLoopingTest.kt`, `androidUnitTest`) — существующей Compose UI-test/Robolectric инфраструктуры для behavioral-тестов `BaseWheel` в `uikit-compose` нет; ручная проверка поведения доступна через `WheelStory` (см. 6.4).
- [x] 6.2 Тест на корректность `onItemSelected` после нескольких полных оборотов looping-колеса — покрыто тестом `scrolling one full lap around the data returns to the same item` в `BaseWheelLoopingTest.kt`.
- [x] 6.3 Тест/сравнение ширины: looping-колесо и non-looping колесо с одинаковым `items` дают одинаковую итоговую ширину — гарантировано архитектурно (`extendedList = items` при `loopingActive`, `WheelTextMetrics` не знает о зацикливании), отдельного теста не требуется сверх 2.1/2.2.
- [x] 6.4 Добавить переключатель `hasLooping` в `WheelUiState`/`WheelStory` (`integration-core/uikit-compose-fixtures`) для ручного тестирования зацикленной прокрутки в песочнице — пробрасывается в `WheelDataSet.looping`.

## 7. Валидация

- [x] 7.1 `:sdds-core:uikit-compose:test`
- [x] 7.2 `:sdds-core:uikit-compose:detekt`
- [x] 7.3 `:sdds-core:uikit-compose:spotlessApply`
