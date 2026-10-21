## 1. Ядро компонента (`sdds-core:uikit-compose`)

- [x] 1.1 Реализовать internal-рекордер `StaticListScopeImpl : LazyListScope` (collect записей `item`/`items`/`stickyHeader` (в foundation 1.8+ метода `itemsIndexed` в интерфейсе нет; `stickyHeader` рендерится обычным элементом) → рендер списком; `key` через `androidx.compose.runtime.key`, `contentType` игнорируется; KDoc-пометка «при апгрейде androidx проверять новые методы интерфейса»; `LazyItemScope.fillParentMax*` — no-op)
- [x] 1.2 Создать публичные перегрузки `StaticList(...)` (файл `StaticList.kt` рядом с `List.kt`): `modifier`, `style: ListStyle = LocalListStyle.current`, `reverseLayout`, `verticalArrangement`, `horizontalAlignment`, `contentPadding`, `interactionSource`, `content: LazyListScope.() -> Unit` + перегрузка `motion: Motion<ListMotionStyle>`; без `state`/`flingBehavior`/`userScrollEnabled`
- [x] 1.3 Реализовать рендер по образцу `List`/`SegmentVertical`: `Column` + `Modifier.backgroundBrush(brushProducer, shape)` + `padding(resolvedPaddings)`; у публичного `Column` нет `reverseLayout`/`contentPadding` — реверс реализован обходом записей `asReversed()` + `Arrangement.spacedBy(gap, Bottom/Top)`; gap из `dimensions.gapValues`; `CompositionLocalProvider(LocalListItemStyle, LocalDividerStyle)` над контентом
- [x] 1.4 Переиспользование хелперов `List.kt`: `UnspecifiedPaddingValues` и `getContentPaddings` сделаны internal; `getVerticalArrangement` оставлен private (в `StaticList` своя нормализация gap c vertical-alignment); `Segment.kt` не затронут
- [x] 1.5 KDoc обеих перегрузок: назначение (секции/группы внутри прокрутки, экраны без прокрутки), явное отличие от `List` (eager-композиция, нет прокрутки, безопасно в `List`), список расхождений `LazyListScope`-семантики (contentType игнорируется; `stickyHeader` как обычный элемент; recommendation: длинные ленты — `List`)

## 2. Публичный API (`sdds-core:uikit-compose`)

- [x] 2.1 Обновить дамп BCV: `./gradlew :sdds-core:uikit-compose:apiDump` — **пропущено по решению пользователя** (BCV 0.18.1 требует `kotlin-metadata-jvm:2.1.10`, которого нет в gradle-кэше, а загрузка падает по TLS/корпоративный прокси); при наличии сети дамп регенерируется командой выше, CI с рабочим трастом его подхватит
- [x] 2.2 Убедиться, что в `api/uikit-compose.api` добавились только `StaticList*`-символы — **пропущено вместе с 2.1** (дамп вручную не правился — формат включает синтетические `ComposableSingletons$StaticListKt`, угадать которые нельзя; публичные сигнатуры `List*`/`ListStyle*` в коде не менялись)
- [x] 2.3 Проверить, что api-info/themebuilder-меты не изменились по составу стилевых билдеров — статически: `ListStyle.kt` и все `@ApiInfo`-типы не изменялись (правки `List.kt` — только видимость internal-хелперов), новых стилевых сущностей нет

## 3. Сэндбокс (`integration-core:uikit-compose-fixtures`)

- [x] 3.1 В `ListStory.kt`: добавить enum `ListEngine { Scrollable, Static }` и поле движка в `ListUiState`; в `Content()` рендерить один и тот же `LazyListScope`-контент через `List` или `StaticList` по значению поля
- [x] 3.2 Проверить, что генерируемые sandbox-ksp `ListUiStatePropertiesProducer`/`ListUiStateTransformer` и пикер enum (`enumProperty`) перегенерировались под новое поле без ручных правок
- [x] 3.3 Добавить `@DocSample(needScreenshot = true)` в `ListSamples.kt`: `StaticList_Section` — секция `StaticList` с 3 `ListItem` и `Divider`, внутри внешнего прокручиваемого `List` (канонический паттерн «секция в прокрутке»)

## 4. Testcases для скриншотов (`integration-core:uikit-compose-testcases`)

- [x] 4.1 В `ListTestCases.kt` добавлены статические кейсы `StaticListAmountThreeHasDisclosure(style)` и `StaticListWithDividers(style)` — код написан; отдельная компиляция модуля **пропущена по решению пользователя** (roborazzi 1.53.0 не в кэше, сеть недоступна по TLS); API кейсов идентичен существующим `List*`-кейсам + `StaticList`
- [x] 4.2 В `tokens/plasma.homeds.compose/ComposeListScreenshotTest.kt` добавлены test-методы `testStaticListSHasBackground`/`testStaticListSHasBackgroundWithDividers`; запись baseline-ов **пропущена по решению пользователя** (`recordRoborazziDebug` требует roborazzi 1.53.0 из сети). Остальные бренд-модули — не в скоупе

## 5. Документация (`build-system:docs-template/compose-template`)

- [x] 5.1 Дополнить `docs/components/ListUsage.md` разделом «StaticList»: когда `List` vs `StaticList`, почему `List`-в-`List` невозможен (измерение с Infinity/двойная прокрутка), паттерн «заголовок + секции», ссылка на новый сэмпл
- [x] 5.2 Проверить, что генерация доков подхватила новый сэмпл/KDoc — **пропущено по решению пользователя** (полная сборка доков требует сети; новая страница и `structure.json` не требуются, сэмпл зарегистрирован аннотацией `@DocSample`)

## 6. Валидация

- [x] 6.1 Прогнать `./gradlew :sdds-core:uikit-compose:spotlessApply` — BUILD SUCCESSFUL
- [x] 6.2 Прогнать `./gradlew :sdds-core:uikit-compose:detekt` — BUILD SUCCESSFUL
- [x] 6.3 Прогнать `./gradlew :sdds-core:uikit-compose:test` — **пропущено по решению пользователя** (unit-test classpath не резолвится офлайн: lifecycle 2.8.7); кодизменения в модуле — новый файл + видимость internal-хелперов
- [x] 6.4 Прогнать `./gradlew :sdds-core:uikit-compose:apiCheck` — **пропущено вместе с 2.1**
- [x] 6.5 Сборки: `:sdds-core:uikit-compose:compileDebugKotlinAndroid`, `:integration-core:uikit-compose-fixtures:compileDebugKotlinAndroid`, `:integration-core:sandbox-compose:compileDebugKotlinAndroid` — BUILD SUCCESSFUL (включая KSP-перегенерацию story-пикера). Визуальная проверка `ListStory` в обоих режимах движка и вложенности секции — за пользователем
- [x] 6.6 Прогнать `./gradlew testAll` перед мёржем/в CI — **пропущено по решению пользователя**; будет выполнено штатно в CI (скриншотные тесты бренд-модулей не должны сдвинуться — стили не менялись)
