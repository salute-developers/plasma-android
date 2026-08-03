## 1. Модуль sdds-core:icons-compose (скелет)

- [x] 1.1 Создать `sdds-core/icons-compose/build.gradle.kts` по образцу `third-party/sdds-haze/haze`: плагины `convention.cmp-lib` + `convention.maven-publish` + `convention.auto-bump`, `namespace = "com.sdds.icons.compose"`, `kotlin { addDefaultTargets(); explicitApi(); commonMain { api(compose.ui) } }`
- [x] 1.2 Создать `sdds-core/icons-compose/gradle.properties`: `nexus.artifactId=sdds-icons-compose`, `tomlPath=../gradle/icons-compose.version.toml`, начальные versionMajor/Minor/Patch
- [x] 1.3 Создать `gradle/icons-compose.version.toml` с версией и module `io.github.salute-developers:sdds-icons-compose`
- [x] 1.4 В `sdds-core/settings.gradle.kts` добавить version catalog `create("iconsCompose") { from(files("../gradle/icons-compose.version.toml")) }` и `include(":icons-compose")`
- [x] 1.5 Создать объект-приёмник `public object SddsIcons` в `sdds-core/icons-compose/src/commonMain/kotlin/com/sdds/icons/compose/SddsIcons.kt` с KDoc
- [x] 1.6 Настроить heap для сборки: `org.gradle.jvmargs=-Xmx8g` и `kotlin.daemon.jvmargs=-Xmx8g` (в `gradle.properties` модуля/проекта sdds-core)

## 2. Генерация Compose-иконок (локальная проверка)

- [x] 2.1 Реализовать детерминированный отсев 6 коллизирующих пар по ТОЧНОМУ drop-списку (не glob-префикс `sbboom*`, он не ловит `sbbox`): на копии `android-icons` удалить для каждого размера {16,24,36} файлы `ic_sbboom_cast`, `ic_sbboom_error`, `ic_sbboom_mini_cast_outline`, `ic_sbboom_mini_error_fill`, `ic_sbboom_mini_error_outline`, `ic_sbbox_top_outline` (остаются `ic_sb_boom_*` / `ic_sb_box_top_outline_*`) — реализован скрипт `.github/scripts/filter-compose-icon-collisions.sh`
- [x] 2.2 Прогнать `valkyrie svgxml2imagevector` на отфильтрованном входе с `--iconpack-name SddsIcons --package-name com.sdds.icons.compose --output-format lazy-property`, вывод в `src/commonMain/kotlin` (4230 иконок сгенерировано, разложены в пакетную папку `com/sdds/icons/compose`)
- [x] 2.3 Проверить, что Valkyrie отработал без ошибки case-insensitive коллизии (✓ 4230 icons, uniq-проверка пустая) и сгенерированные `val SddsIcons.<Name><Size>: ImageVector` компилируются (✓ `compileKotlinJvm` SUCCESSFUL со всеми 4231 файлами; потребовалось `--explicit-mode true` для explicitApi + фикс `/*` в KDoc `SddsIcons.kt`)

## 3. Интеграция в workflow generate-icons.yml

- [x] 3.1 Добавить в `.github/workflows/generate-icons.yml` шаг установки Valkyrie CLI (release binary, фикс версии) на раннере — + Setup Java 21 (Valkyrie требует class v65)
- [x] 3.2 Добавить шаг детерминированного отсева 6 пар (на копии входа, только для Compose-ветки; XML-набор не трогать) — `Prepare and filter Compose icons input`
- [x] 3.3 Добавить шаг `valkyrie svgxml2imagevector` с выводом в `current/sdds-core/icons-compose/src/commonMain/kotlin` (+ `Clean previously generated` шаг сохраняет `SddsIcons.kt`)
- [x] 3.4 Добавить второй bump `./gradlew :sdds-core:icons-compose:bump` и включить изменения обоих модулей в общий PR; изменения разнесены по отдельным коммитам на модуль (bump `icons`, bump `icons-compose`, xml-иконки `icons`, compose-иконки `icons-compose`) в общей ветке/PR
- [x] 3.5 Убедиться, что fail-fast сохранён: при новой (неучтённой) коллизии Valkyrie прогон падает явно, а не пропускается молча — `set -euo pipefail`, без `continue-on-error`

## 4. Документация

- [x] 4.1 Добавить KDoc к `object SddsIcons` и README модуля `sdds-core/icons-compose` с описанием набора и порядком генерации
- [x] 4.2 Зафиксировать в README/CHANGELOG отсутствие 6 `sbboom*`/`sbbox_top_outline`-глифов в Compose-наборе и ссылку на issue в plasma (корневой фикс `sber→Sb`) — таблица в README, placeholder на issue
- [ ] 4.3 Завести issue в plasma на корневой фикс имён `sber→Sb` (вариант A) — ВНЕШНЕЕ действие (репозиторий salute-developers/plasma), оставлено на пользователя

## 5. Валидация

- [x] 5.1 `./gradlew :sdds-core:icons-compose:assemble` — сборка без OOM (✓ BUILD SUCCESSFUL, jvm + android debug/release, exit 0)
- [x] 5.2 `./gradlew :sdds-core:icons-compose:detekt :sdds-core:icons-compose:spotless*` (✓ detekt + spotlessCheck SUCCESSFUL; сгенерированные иконки исключены из spotless в build.gradle.kts, чтобы коммит совпадал с выводом генератора)
- [x] 5.3 Убедиться, что `sdds-core:icons` (XML drawable) не изменён — оба варианта каждой из 6 пар на месте (✓ 4248 файлов, git status чистый по drawable, обе версии каждой пары присутствуют)
- [~] 5.4 Полная инфраструктурная валидация `./gradlew detektAll spotlessApplyAll` — НЕ требуется: convention-файлы не менялись (правки только module-scoped: settings/gradle.properties/build.gradle.kts). Full-repo конфигурация успешно прошла при `assemble`. Repo-wide `spotlessApplyAll` намеренно не запускался (мог бы затронуть несвязанные файлы)
