# icons-compose-generation Specification

## Purpose
TBD - created by archiving change add-icons-compose-module. Update Purpose after archive.
## Requirements
### Requirement: KMP-совместимый модуль Compose-иконок

Система SHALL предоставлять отдельный публикуемый модуль `sdds-core:icons-compose`, содержащий иконки дизайн-системы в виде `androidx.compose.ui.graphics.vector.ImageVector`, пригодные для использования в `commonMain` Compose Multiplatform без зависимости от android-ресурсов.

#### Scenario: Иконки доступны в commonMain

- **WHEN** потребитель подключает артефакт `sdds-icons-compose` и обращается к `SddsIcons.<IconName>` в `commonMain`
- **THEN** он получает валидный `ImageVector` без ссылок на android `R.drawable` или иные android-ресурсы

#### Scenario: Модуль публикуется отдельным артефактом со своей версией

- **WHEN** запускается публикация модуля
- **THEN** он публикуется как `sdds-icons-compose` с собственной версией из `gradle/icons-compose.version.toml`, независимо от версии `sdds-icons`

### Requirement: Генерация из общего с XML-модулем источника

Compose-иконки SHALL генерироваться из того же набора `android-icons/*.xml`, что копируется в `sdds-core:icons`, обеспечивая паритет набора и геометрии между XML- и Compose-наборами (с единственным исключением — отсевом коллизий, см. ниже).

#### Scenario: Паритет набора иконок

- **WHEN** в одном прогоне пайплайна сгенерирован `android-icons/*.xml`
- **THEN** XML-модуль и Compose-модуль строятся из одного и того же набора файлов одного прогона, без возможности разъехаться по разным версиям plasma

#### Scenario: Формат генерируемого кода

- **WHEN** Valkyrie генерирует иконку из `ic_<name>_<size>.xml`
- **THEN** создаётся top-level extension-property `val SddsIcons.<Name><Size>: ImageVector` в формате `lazy-property` с плоским именем и числовым суффиксом размера, консистентно с именованием XML-модуля

#### Scenario: Путь как строка pathData для снижения нагрузки на компилятор

- **WHEN** Valkyrie генерирует иконки (`--use-path-data-string true`)
- **THEN** геометрия каждой иконки эмитится как строковый литерал через `addPathNodes("…")`, а НЕ как тысячи DSL-вызовов `moveTo/curveTo/…`, что кратно снижает объём байткода и пиковую память кодогена (устраняет OOM при полной параллельной сборке репозитория)

### Requirement: Отсев case-insensitive коллизий только для Compose-набора

Для 6 пар иконок, различающихся в plasma только заменой `Sber`→`Sb` и схлопывающихся Valkyrie в имена, отличающиеся только регистром, система SHALL включать в Compose-набор только первый вариант (`ic_sb_boom_*`) и исключать второй (`ic_sbboom_*`) до вызова Valkyrie. XML-модуль `sdds-core:icons` при этом НЕ изменяется.

#### Scenario: Коллидирующий вариант отсеивается перед Valkyrie

- **WHEN** во входном наборе присутствуют оба файла пары, например `ic_sb_boom_cast_24.xml` и `ic_sbboom_cast_24.xml`
- **THEN** перед вызовом Valkyrie остаётся `ic_sb_boom_cast_24.xml`, а `ic_sbboom_cast_24.xml` удаляется, и Valkyrie отрабатывает без ошибки case-insensitive коллизии

#### Scenario: XML-набор сохраняет обратную совместимость

- **WHEN** выполняется генерация Compose-набора с отсевом 6 пар
- **THEN** набор drawable в `sdds-core:icons/src/main/res/drawable/` остаётся без изменений и продолжает содержать оба варианта каждой пары

#### Scenario: Отсев детерминирован и стабилен

- **WHEN** пайплайн запускается повторно на неизменном входе
- **THEN** тот же вариант из каждой пары остаётся в наборе, а публичные имена оставшихся 6 иконок не меняются между прогонами

### Requirement: Интеграция в единый workflow генерации иконок

Генерация Compose-иконок SHALL быть частью существующего workflow `.github/workflows/generate-icons.yml`, а не отдельного workflow, с бампом обоих модулей и общим PR в рамках одного прогона. Изменения каждого модуля SHALL размещаться в ОТДЕЛЬНЫХ коммитах (свой коммит на bump и свой на иконки для каждого модуля) в рамках одной общей релизной ветки и одного PR.

#### Scenario: Единый прогон и общий PR

- **WHEN** срабатывает триггер обновления иконок (workflow_dispatch или repository_dispatch build-icons)
- **THEN** в одном прогоне копируется XML в `icons`, генерируются Compose-иконки в `icons-compose`, бампаются обе версии и создаётся один общий PR

#### Scenario: Раздельные коммиты по модулям

- **WHEN** формируется релизная ветка в одном прогоне
- **THEN** изменения `icons` и `icons-compose` разнесены по отдельным коммитам (bump `icons`, bump `icons-compose`, xml-иконки `icons`, compose-иконки `icons-compose`) со своими conventional-commit-скоупами, при этом ветка и PR остаются общими

#### Scenario: Сборка крупного сгенерированного модуля не падает по памяти

- **WHEN** CI собирает модуль `icons-compose` с несколькими тысячами сгенерированных файлов в рамках полной параллельной сборки репозитория
- **THEN** компиляция завершается без OutOfMemoryError за счёт лёгкой формы кода (`--use-path-data-string`, строки вместо тысяч DSL-вызовов) при действующих настройках heap (`org.gradle.jvmargs` / `kotlin.daemon.jvmargs`) — без необходимости сериализации сборки или разбивки модуля
