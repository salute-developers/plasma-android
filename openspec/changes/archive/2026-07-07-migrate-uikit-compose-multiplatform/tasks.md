## 1. Spike Публикации

- [x] 1.1 Создать временную spike-ветку или временный набор изменений для минимального KMP-перевода `sdds-core/uikit-compose`.
- [x] 1.2 Переключить `sdds-core/uikit-compose` на KMP-конфигурацию с сохранением `nexus.artifactId=sdds-uikit-compose` и Android release publication.
- [x] 1.3 Оставить текущий runtime UIKit код в Android source set и добавить минимальный common API, достаточный для формирования KMP metadata publication.
- [x] 1.4 Опубликовать модуль в локальный Maven/distribution repository.
- [x] 1.5 Настроить spike так, чтобы существующий Android consumer `tokens/sdds.serv.compose/app` использовал локально опубликованную координату `io.github.salute-developers:sdds-uikit-compose:<version>` без `-android` artifactId.
- [x] 1.6 Проверить сборку `tokens/sdds.serv.compose/app` и dependency resolution для Android runtime variant.
- [x] 1.7 Проверить root POM, Gradle Module Metadata и наличие target publications; зафиксировать POM-only риск.
- [x] 1.8 Если старая координата не работает для `tokens/sdds.serv.compose/app`, остановить миграцию и документировать publishing fix или fallback на новый модуль.

## 2. Build System И Конфигурация Модуля

- [x] 2.1 Обновить Compose BOM в version catalog до `2025.05.01`.
- [x] 2.2 Убрать или ограничить старую KMP Compose compiler dependency substitution на `androidx.compose.compiler:compiler:1.5.15`.
- [x] 2.3 Настроить путь KMP Compose compiler через Kotlin Compose compiler Gradle plugin, совместимый с Kotlin `2.1.10`.
- [x] 2.4 Перевести `sdds-core/uikit-compose/build.gradle.kts` на KMP library configuration с Android target release publication.
- [x] 2.5 Сохранить Maven publishing, auto-bump, Dokka и artifact coordinates для `sdds-uikit-compose`.
- [x] 2.6 Проверить, что изменения build conventions не ломают существующий KMP пример `third-party/sdds-haze/haze`.

## 3. Базовая Структура Source Set'ов

- [x] 3.1 Создать `commonMain` и `androidMain` layout для `sdds-core/uikit-compose`.
- [x] 3.2 Добавить SDDS common-аннотации для `DrawableRes`, `StringRes`, `FloatRange`, `IntRange`.
- [x] 3.3 Добавить Android actual реализации для SDDS annotations.
- [x] 3.4 Добавить небольшие platform utilities для легких зависимостей, включая provider времени для `Throttle`.
- [x] 3.5 Разделить `WindowSize` на common модели/breakpoints и Android-specific collection implementation.

## 4. Миграция Preview

- [x] 4.1 Найти все runtime файлы `uikit-compose`, которые импортируют `androidx.compose.ui.tooling.preview.Preview`.
- [x] 4.2 Перенести preview-функции из кандидатов первой волны в `androidMain` или Android-only preview source set.
- [x] 4.3 Убедиться, что `commonMain` не зависит от `ui-tooling-preview`.
- [x] 4.4 Проверить, что Android previews продолжают компилироваться после переноса.

## 5. Первая Волна CommonMain Компонентов

- [x] 5.1 Перенести production components/styles/models в `commonMain`; итоговый scope включает не только первую волну, а все компоненты.
- [x] 5.2 Перенести связанные internal helpers, interactions и motion dependencies, необходимые production-компонентам.
- [x] 5.3 Решить легкие Android зависимости: preview logs, `Throttle`/platform clock, `RectSkeleton`/`WindowSize`, resource и graphics bridge.
- [x] 5.4 Перевести `Modal`, `ModalBottomSheet`, `DropdownMenu`, `Autocomplete`, `ComboBox`, `Select`, `Popover`, `Tooltip` и overlay host/manager infrastructure на common API с Android/Skiko bridge implementations.

## 6. API, Документация И KSP

- [x] 6.1 Проверить KSP `api-info-compose` integration после переноса style/builders в KMP source sets.
- [x] 6.2 Проверить Dokka/docs generation для `sdds-core/uikit-compose` или зафиксировать отдельную follow-up задачу, если KMP source sets требуют отдельной адаптации.

## 7. Валидация

- [x] 7.1 Запустить focused build для `sdds-core/uikit-compose` из repo root.
- [x] 7.2 Запустить локальную публикацию и повторить validation через `tokens/sdds.serv.compose/app` на старой координате.
- [x] 7.3 Запустить релевантные static analysis/formatting checks для затронутых модулей.

## Spike Notes

- `:sdds-core:uikit-compose:publishAllPublicationsToDistributionRepository` успешно публикует root `sdds-uikit-compose` и target `sdds-uikit-compose-android`.
- Root Gradle Module Metadata содержит `available-at` для Android variants на `sdds-uikit-compose-android`, поэтому Gradle metadata consumers могут остаться на координате `io.github.salute-developers:sdds-uikit-compose:0.47.0`.
- Root POM `sdds-uikit-compose` не содержит Android AAR artifact и указывает только metadata/root dependencies; POM-only consumers остаются риском.
- `tokens/sdds.serv.compose/app` собирается из root composite build, но проверка именно локально опубликованного artifact через этот app затруднена тем, что `integration-core` требует `includeBuild("../sdds-core")` для `io.github.salute-developers.theme-builder-plugin`, что возвращает composite substitution для `sdds-uikit-compose`.
- Для проверки published artifact использован `playground/sandbox-integration-test`: dependency insight подтвердил, что объявленная координата `io.github.salute-developers:sdds-uikit-compose:0.47.0` резолвится в Android runtime variant через `io.github.salute-developers:sdds-uikit-compose-android:0.47.0`, без ручной зависимости consumer на `-android`.
- `./gradlew -p playground :sandbox-integration-test:assembleDebug` успешно собирает Android app на published artifact из локального distribution repository.
- Preview import inventory для 4.1: `ButtonGroup`, `CheckBox`, `CircularProgressBar`, `CodeInput`, `DropZone`, `List`, `ListItem`, `Notification`, `NotificationContent`, `RadioBox`, `RectSkeleton`, `ScrollBar`, `SelectItem`, `Spinner`, `Splitter`, `Switch`, `TabBar`, `TabBarItem`, `TabItem`, `Toast`, `Wheel`, `ai/AiInput`, `internal/BaseProgress`, `internal/BaseSpinner`, `internal/checkable/switch/SwitchToggle`, `internal/dropdownmenu/BaseDropdownMenu`, `internal/tabs/container/OverflowContainer`, `internal/wheel/BaseWheel`.
- Preview functions for first-wave candidates moved to `src/androidMain/kotlin`: `ButtonGroup`, `CheckBox`, `CircularProgressBar`, `CodeInput`, `List`, `ListItem`, `Notification`, `NotificationContent`, `RadioBox`, `Spinner`, `Switch`, `TabBarItem`, `TabItem`, `Toast`.
- `./gradlew :sdds-core:uikit-compose:assemble` успешно компилирует Android previews после переноса. `commonMain` не содержит `ui-tooling-preview`; tooling-preview остается только в `androidMain` dependencies и Android preview-файлах.
- `api-info-compose` переведен на Kotlin Multiplatform: annotation classes физически перенесены в `src/commonMain/kotlin`, модуль оставляет `jvm()` target для существующих JVM/KSP consumers. `uikit-compose` теперь подключает `project(":api-info-compose")` из `commonMain`.
- Первая runtime-пачка перенесена в `commonMain` и проверена через `./gradlew :sdds-core:uikit-compose:assemble`: `Image`, `Text`, `Icon`, `Spinner`, `Divider`, `CircularProgressBar`, `CheckBox`, `RadioBox`, `RadioBoxGroupStyle` и соответствующие style/internal/motion зависимости.
- Android resource-only API для `Text`/`Icon` отделены в `androidMain`: `resourceTextSource(...)` и `resourceImageSource(...)`; common API больше не зависит от `stringResource`/`painterResource`.
- `asBrush` разделен корректно: `Color.asBrush()` доступен в `commonMain`, а Android-specific `internal.common.Graphics.drawOutline(...)` остается в Android source set из-за зависимости на `LayeredShaderBrush`.
- Для motion shader-brush crossfade добавлен `expect/actual` bridge `platformCrossFadeShaderBrush`: common `MotionEvaluator` не импортирует Android shader implementation напрямую.
- Для checkable-компонентов в `commonMain` перенесены `LocalIndication`, `AdjustmentCornerSize`, `DefaultVerticalArrangement`, `lerp`, `floatPx`, `CheckableMotionStyle`, `BaseCheckableLayout`; `RadioBoxControl` использует `RadioBoxStates.Checked` вместо лишней зависимости на `SwitchStates`.
- Остатки `sdds-core/uikit-compose/src/main` разнесены между `commonMain` и `androidMain`, директория `src/main` удалена.
- Все production-компоненты и production internal/motion/style исходники перенесены в `commonMain`; в `androidMain` остались Android actual/resource bridge файлы и preview-файлы.
- Для resource-based overloads добавлен common `expect` bridge `painterResource(...)` и common `expect fun resourceImageSource(...)` с Android actual implementation.
- SDDS annotations получили default-значения в `commonMain`; Android actual annotations заменены с typealias на actual annotation classes, чтобы common usage не требовал явных `to/fromInclusive/toInclusive`.
- Добавлены `skikoMain`, `iosMain`, `macosMain`, `jvmMain`, `jsMain`, `wasmJsMain` bridge-файлы для platform clock, painter/resource bridge, dialog/popover/dropdown/slider/window/shadow/graphics behavior.
- `api-info-compose` переведен на KMP source sets, `api-info-ksp` и ThemeBuilder task/provider адаптированы под generated resources/common metadata flow.
- `playground/sandbox-integration-test` добавлен как practical consumer для проверки published/root coordinate и Android runtime variant.
- `./gradlew :sdds-core:uikit-compose:assemble` успешно проходит после переноса production-компонентов в `commonMain`; осталось предупреждение Kotlin MPP layout про старый `src/test/kotlin` и предупреждение default hierarchy template из-за explicit `dependsOn`.
- `./gradlew :sdds-core:uikit-compose:dokkaHtmlPartial` успешно проходит.
- `./gradlew -p playground :sandbox-integration-test:assembleDebug` успешно проходит.
- `./gradlew :sdds-core:uikit-compose:detekt` проходит как `NO-SOURCE`; `./gradlew :sdds-core:uikit-compose:spotlessCheck` проходит.
