# themebuilder-cmp-styles Specification

## Purpose
TBD - created by archiving change themebuilder-cmp-icons-fonts. Update Purpose after archive.
## Requirements
### Requirement: CMP-режим включается суб-флагом COMPOSE-таргета

Генератор SHALL поддерживать флаг `multiplatform` в DSL `compose { ... }` внутри существующего COMPOSE-таргета. Флаг MUST иметь значение по умолчанию `false` и MUST пробрасываться до всех `PropertyMapper`-ов и `UniversalComposeVariationGenerator` через `StyleGeneratorDependencies` → `UniversalComponentConfigDelegate` → `PropertyMapperRegistry`. Новый `ThemeBuilderTarget` вводиться НЕ SHALL.

#### Scenario: Флаг по умолчанию выключен

- **WHEN** тема сконфигурирована `compose { }` без вызова `multiplatform(...)`
- **THEN** генератор работает в текущем Android-режиме и эмитит прежний код без изменений

#### Scenario: Флаг проброшен до мапперов

- **WHEN** тема сконфигурирована `compose { multiplatform(true) }`
- **THEN** `IconPropertyMapper` и `FontTokenGenerator` получают признак CMP-режима и переключают формат эмиссии

### Requirement: Эмиссия иконки через imageVectorSource в CMP-режиме

В CMP-режиме `IconPropertyMapper` SHALL эмитить builder-call вида `imageVectorSource(SddsIcons.<Name>)` вместо `com.sdds.icons.R.drawable.ic_<name>`. Импорты `com.sdds.icons.compose.SddsIcons` и `com.sdds.icons.compose.<Name>` MUST быть добавлены через `ImportCollector`. В выключенном режиме поведение MUST остаться прежним (эмиссия ссылки на `R.drawable`).

#### Scenario: Простая иконка в CMP-режиме

- **WHEN** значение токена `add.fill.16` маппится в CMP-режиме для метода `startIcon`
- **THEN** builder-call равен `startIcon(imageVectorSource(SddsIcons.AddFill16))`
- **AND** в файл добавлены импорты `com.sdds.icons.compose.SddsIcons` и `com.sdds.icons.compose.AddFill16`

#### Scenario: Та же иконка в Android-режиме не меняется

- **WHEN** значение токена `actions.add` маппится при выключенном флаге для метода `startIcon`
- **THEN** builder-call равен `startIcon(com.sdds.icons.R.drawable.ic_actions_add)`

### Requirement: Stateful-иконки оборачиваются в imageVectorSource в обеих ветках

В CMP-режиме обёртка `imageVectorSource(...)` SHALL применяться и к дефолтному значению (`getTokenRef`), и к каждому состоянию (`getStateTokenRef`), так что итоговое выражение образует `StatefulValue<ImageSource>` через `.asStatefulValue(...)`.

#### Scenario: Иконка с состояниями в CMP-режиме

- **WHEN** значение токена `add.fill.16` с состоянием `pressed → remove.fill.16` маппится в CMP-режиме для метода `startIcon`
- **THEN** builder-call равен `startIcon(imageVectorSource(SddsIcons.AddFill16).asStatefulValue(setOf(InteractiveState.Pressed) to imageVectorSource(SddsIcons.RemoveFill16)))`

### Requirement: Имя ImageVector выводится репликацией правил Valkyrie

Генератор SHALL выводить идентификатор `SddsIcons.<Name>` из имени drawable (`ic_*`) алгоритмом, воспроизводящим правила именования Valkyrie. Алгоритм MUST корректно обрабатывать краевые случаи (сегменты из цифр, шаблоны вида `2x2`, однобуквенные сегменты). Набор сверен со всем реальным корпусом иконок (`icons-compose`): байт-в-байт для всех воспроизводимых имён. Проверка существования иконки на этапе генерации не выполняется — отсутствие `ImageVector` проявляется как ошибка компиляции сгенерированного CMP-кода (unresolved reference).

#### Scenario: Краевое имя с шаблоном 2x2

- **WHEN** значение токена соответствует drawable `ic_button_2x2_top_l_fill_36`
- **THEN** сгенерированное имя равно `Button2X2TopLFill36`

### Requirement: Эмиссия шрифта через compose-resources в CMP-режиме (F1)

В CMP-режиме `FontTokenGenerator` SHALL эмитить `Font(Res.font.<name>)` через `org.jetbrains.compose.resources` вместо `Font(R.font.<name>, ...)`. `FontTokens` MUST генерироваться как `@Composable`-геттеры (перегрузка `Font(FontResource, ...)` помечена `@Composable`). Импорты `org.jetbrains.compose.resources.Font`, `<resPackage>.Res` и per-font accessor `<resPackage>.<name>` MUST добавляться; Android-only импорты `androidx.compose.ui.text.font.Font` и класс `R` в CMP-режиме НЕ добавляются. Пакет `Res` (`<resPackage>`) MUST совпадать с настройкой compose-resources модуля токенов (`packageOfResClass`, план 06); по умолчанию — `<namespace>.generated.resources`.

#### Scenario: Обычный шрифт в CMP-режиме

- **WHEN** `FontTokens` генерируются в CMP-режиме для файла шрифта `s_b_sans_regular`
- **THEN** эмитится `Font(Res.font.s_b_sans_regular, ...)` с импортом `org.jetbrains.compose.resources.Font` и `<namespace>.generated.resources.Res`
- **AND** соответствующий токен объявлен как `@Composable`-геттер
- **AND** файл не содержит `import androidx.compose.ui.text.font.Font` и класса `R`

### Requirement: Каскад @Composable в типографике (F1)

Поскольку `FontTokens.*` в CMP-режиме — `@Composable`-геттеры, потребляющая их типографика MUST также стать `@Composable`: `TypographyTokenGenerator` (`Typography<Screen>Tokens.*: TextStyle`) и фабрики темы (`small/medium/largeSddsServTypography()`) в CMP-режиме SHALL генерироваться как `@Composable`. Это ломающее изменение публичного API сгенерированной темы (фабрики становятся `@Composable`).

#### Scenario: Токены типографики становятся @Composable в CMP-режиме

- **WHEN** тема генерируется в CMP-режиме
- **THEN** `Typography<Screen>Tokens.<style>` и `<size>SddsServTypography()` объявлены как `@Composable`
- **AND** в Android-режиме (флаг off) они остаются обычными `val`/`fun` без изменений

### Requirement: Ресурсные импорты обрабатываются условно в CMP-режиме

`addCommonImports()` SHALL не добавлять мёртвый импорт `androidx.compose.ui.res.painterResource` в CMP-режиме и SHALL не выполнять ветку `fromResources` (импорты `dimensionResource`, `R`, `LocalDensity`) в CMP-режиме.

#### Scenario: Нет Android-only ресурсных импортов в CMP-файле

- **WHEN** `*Styles.kt` генерируется в CMP-режиме
- **THEN** файл не содержит импортов `androidx.compose.ui.res.painterResource`, `dimensionResource` и класса `R`

### Requirement: Android- и View-вывод неизменны при выключенном флаге

При выключенном CMP-флаге сгенерированные `*Styles.kt` (Android-compose) и View-артефакты SHALL быть идентичны выводу до изменения для всех тем (пустой golden-дифф).

#### Scenario: Регресс-дифф пуст

- **WHEN** генерация запускается при `multiplatform(false)` для каждой из существующих тем
- **THEN** дифф сгенерированных Android-compose и View файлов относительно эталона пуст

