## 1. CMP-флаг и проброс

- [x] 1.1 Добавить `multiplatform: Boolean` (default `false`) + DSL-метод в `ComposeConfigBuilder`, с KDoc
- [x] 1.2 Пробросить флаг в `StyleGeneratorDependencies`
- [x] 1.3 Прокинуть флаг через `UniversalComponentConfigDelegate` → `PropertyMapperRegistry` до мапперов и `UniversalComposeVariationGenerator`
- [x] 1.4 Юнит-тест: при `multiplatform(false)` мапперы получают Android-режим (регресс не задет)

## 2. Утилита манглинга имён Valkyrie

- [x] 2.1 Реализовать утилиту `drawableName → SddsIcons identifier` по правилам Valkyrie (отдельно от `PropertyMapper.toCamelCase`)
- [x] 2.2 Сверка со всем реальным корпусом (`feature/kmp-icons`): 4230/4230 идентификаторов воспроизводятся байт-в-байт, 0 коллизий; 18 «лишних» = ровно несобранные Valkyrie (`Sbboom*`/`Sbbox*`)
- [x] 2.3 Юнит-тесты утилиты на краевые случаи из реального набора (`Button2X2TopLFill36`, `AirQuality24`, `AiFill16`, `PanelSidebarRFill36`, точки-разделители)
- [x] 2.4 Валидация существования иконки НЕ реализуется (решение): `availableIconNames` и проверка удалены из `IconPropertyMapper`. Отсутствие `ImageVector` проявляется как ошибка компиляции CMP-кода (unresolved reference), доп. диагностика на этапе генерации сочтена излишней и требовала converged-classpath.

## 3. Иконки в CMP-режиме (`IconPropertyMapper`)

- [x] 3.1 CMP-ветка `getTokenRef`: эмиссия `imageVectorSource(SddsIcons.<Name>)` + импорты `SddsIcons` и `<Name>` через `ImportCollector`
- [x] 3.2 Stateful-обёртка: `imageVectorSource(...)` применяется к каждому состоянию через базовый `getStateTokenRef` → `getTokenRef` (отдельный override не требуется)
- [x] 3.3 Android-ветка (флаг off) без изменений — проверено прежним `IconPropertyMapperTest`
- [x] 3.4 Юнит-тесты CMP-emit: простая иконка, stateful, краевое имя

## 4. Шрифты в CMP-режиме (`FontTokenGenerator`) — выбран путь F1 (compose-resources)

- [x] 4.0 Проброс CMP-флага через цепочку темы: `GenerateThemeTask.multiplatform` → плагин `.set(extension.multiplatform)` → `GeneratorFactory` → `FontTokenGenerator`
- [x] 4.1 CMP-ветка: эмиссия `Font(Res.font.<name>)` из `org.jetbrains.compose.resources` вместо `Font(R.font.*, Int)`
- [x] 4.2 Перегенерация `FontTokens` как `@Composable`-геттеров (через `Getter.Annotated(@Composable)`)
- [x] 4.3 Импорты: `org.jetbrains.compose.resources.Font`, `<namespace>.generated.resources.Res` + per-font accessor; без `androidx...Font`/`R` в CMP
- [x] 4.4 Юнит-тест `FontTokenGenerator`: CMP-эмит содержит `Font(Res.font.*)`, `@Composable`, `Res`-импорт; нет `R.font`; Android-вывод при off не изменён (golden-тест зелёный)

> `variationSettings` (вариативные шрифты) теперь доступны (CMP 1.8.2) и гейтятся флагом `variableFonts` (default false) — ветка эмита сохранена без изменений. Пакет `Res` = `<namespace>.generated.resources` (допущение; должен совпасть с `packageOfResClass` модуля токенов, план 06).

## 4b. Каскад @Composable в типографике (следствие F1)

- [x] 4b.1 `TypographyTokenGenerator`: в CMP-режиме `Typography<Screen>Tokens.<style>: TextStyle` — `@Composable`-геттеры (мирроринг существующей `fromResources`-ветки, без `@ReadOnlyComposable`/`LocalDensity`)
- [x] 4b.2 `ComposeTypographyAttributeGenerator`: `small/medium/largeSddsServTypography()` в CMP → `@Composable` (без `ReadOnlyComposable`); ломающее изменение API темы
- [x] 4b.3 Проброс CMP-флага: `GeneratorFactory` → `TypographyTokenGenerator` и → `ComposeTypographyAttributeGeneratorFactory` → генератор
- [x] 4b.4 Юнит-тесты: CMP-эмит типографики `@Composable` (токены + фабрики); Android-вывод при off не изменён (golden-тесты зелёные)
- [x] 4b.5 Компиляционная верификация всей цепочки шрифты→типографика→тема — выполнено на самом модуле `sdds.serv.compose`, переведённом на KMP (`multiplatform(true)`). Скомпилировано во всех таргетах: `commonMain` metadata, `jvm`, `iosSimulatorArm64`, `wasmJs`, `js`, `androidDebug`.

## 7. Раскладка вывода под CMP-флагом (генератор/плагин)

- [x] 7.1 Под `multiplatform` вывод `.kt` → `src/commonMain/kotlin` (константа `CMP_OUTPUT_PATH`), ресурсы/шрифты → `src/commonMain/composeResources` (`CMP_OUTPUT_RESOURCE_PATH`); флаг проброшен в `getSourcePath`/`getResourcePath` из `extension.multiplatform`
- [x] 7.2 Шрифты автоматически попадают в `commonMain/composeResources/font/` (fontDir добавляет `/font` к outputResDir) → compose-resources генерит `Res.font.*`
- [x] 7.3 Кастомная регистрация сорсетов не нужна для SRC-вывода: KMP и compose-resources сканируют `src/commonMain/kotlin` и `src/commonMain/composeResources` конвенционально
- [x] 7.4 BUILD-вывод (`outputLocation(BUILD)`) под CMP — **won't do** (осознанное решение). Токены всегда используют `SRC`, а под CMP `SRC`-раскладка (`commonMain/kotlin` + `commonMain/composeResources`) сканируется конвенционально. Покрытие `BUILD` потребовало бы `compose.resources { customDirectory(...) }` ради гипотетического сценария без потребителей — не реализуем.
- [x] 7.5 (модуль, не генератор) `sdds.serv.compose` переведён на KMP-конвенцию (`convention.cmp-lib` + `addDefaultTargets()`, `packageOfResClass = com.sdds.serv.compose.generated.resources`): `src/main/kotlin`→`src/commonMain/kotlin`, шрифты→`src/commonMain/composeResources/font`, screenshot-тесты→`src/androidUnitTest/kotlin`, `AndroidManifest.xml`→`src/androidMain`. Зависимости: `uikit-compose`/`icons-compose`/`compose.foundation`/`compose.components.resources` в commonMain; roborazzi-стек в androidUnitTest. Каталог `iconsCompose` + подстановка `sdds-icons-compose` — в инфраструктуре build. Консьюмеры `app/docs/integration` собираются через androidTarget.

## 8. Пробелы генератора, найденные пилотом (CMP-совместимость сгенерированного кода)

- [x] 8.1 `WindowSize`: Android-only реализация (`LocalContext`/`LocalConfiguration`/`displayMetrics`) заменена в CMP на шаблон `WindowSizeCmp.txt` (`LocalWindowInfo.current.containerSize` + `derivedStateOf`); выбор шаблона по флагу в `ComposeTypographyAttributeGenerator.createWindowSizeFile()`
- [x] 8.2 `TypographyTokens`: `platformStyle = PlatformTextStyle(includeFontPadding = false)` — Android-only API; в CMP аргумент `platformStyle`, сама `TextStyleDefault.platformStyle` и импорт `PlatformTextStyle` не эмитятся (includeFontPadding=false и так дефолт в CMP)
- [x] 8.3 Подстановка included-build для KMP-иконок: добавлен `sdds-icons-compose → sdds-core:icons-compose:*` в `convention.core-dependencies` (по образцу `sdds-uikit-compose`); каталог `iconsCompose` добавлен в `tokens/settings.gradle.kts`
- [x] 8.4 Юнит-тесты на 8.1/8.2: `ComposeTypographyAttributeGeneratorTest` (CMP→`LocalWindowInfo`/`containerSize` без Android-API; Android→`LocalContext`/`displayMetrics`), `TypographyTokenGeneratorTest` (CMP→нет `platformStyle`/`PlatformTextStyle`/`includeFontPadding`; Android→есть). Зелёные.
- [x] 8.5 Verifier-модуль удалён — поддержка добавлена напрямую в `sdds.serv.compose` (см. 7.5), сгенерированный CMP-код версионируется как у обычных token-модулей.

## 5. Импорты и общая эмиссия (`UniversalComposeVariationGenerator`)

- [x] 5.1 `addCommonImports()`: не добавлять `painterResource` в CMP-режиме (мёртвый импорт)
- [x] 5.2 `addCommonImports()`: не выполнять ветку `fromResources` (`dimensionResource`/`R`/`LocalDensity`) в CMP-режиме
- [x] 5.3 Тест: CMP-`*Styles.kt` не добавляет импорт `painterResource` (verify через мок `KtFileBuilder`)

## 6. Двойная генерация и верификация

- [x] 6.1 `sdds.serv.compose` переведён на KMP c `multiplatform(true)` — единый модуль генерит `commonMain` для всех таргетов (verifier-модуль удалён)
- [x] 6.2 Golden-дифф: при `multiplatform(false)` вывод не изменился — подтверждено юнит-тестами (весь suite `plugin_theme_builder:test` зелёный) и косвенно скриншот-паритетом serv (1276/1276 unchanged); полный golden-дифф по всем темам — вне скоупа этого change
- [x] 6.3 Компиляция CMP-пилота в `commonMain` — ВЫПОЛНЕНО. Блокер снят: на смердженном дереве билдеры уже типизированы `ImageSource`, а compose-генерация `sdds_serv` идёт 100% через universal-путь (Hybrid→universal), где `IconPropertyMapper` эмитит `imageVectorSource(SddsIcons.*)` без двойной обёртки. Скомпилировано во всех таргетах (см. 4b.5)
- [x] 6.4 Скриншот-паритет Android — ПОДТВЕРЖДЁН. `verifyRoborazziDebug` на `sdds.serv.compose` (screenshot-тесты перенесены в `androidUnitTest`): `{total: 1276, changed: 0, unchanged: 1276}` — весь CMP-вывод рендерится пиксель-в-пиксель как прежний Android (иконки `imageVectorSource`, шрифты `Res.font.*`, `@Composable`-типографика, `WindowSizeCmp`, отсутствие `platformStyle`). Эталоны не перезаписаны.
- [x] 6.5 Прогнать `:sdds-core:plugin_theme_builder:test`, `:detekt`, `:spotlessApply` — зелёные
