## ADDED Requirements

### Requirement: Совместимость in-place KMP публикации
Модуль `sdds-core/uikit-compose` SHALL мигрировать в сторону Kotlin Multiplatform без изменения существующей Android-координаты зависимости `io.github.salute-developers:sdds-uikit-compose`.

#### Scenario: Android-клиент использует существующую координату
- **WHEN** Android Gradle-клиент объявляет `implementation("io.github.salute-developers:sdds-uikit-compose:<version>")`
- **THEN** разрешение зависимостей MUST предоставить Android runtime-вариант без требования перейти на новый artifactId.

#### Scenario: Existing sdds.serv.compose app validates publication
- **WHEN** `tokens/sdds.serv.compose/app` собирается с локально опубликованной KMP-версией `io.github.salute-developers:sdds-uikit-compose:<version>`
- **THEN** сборка MUST проходить без зависимости от `sdds-uikit-compose-android` в пользовательской конфигурации app-модуля.

#### Scenario: Совместимость публикации не подтверждена
- **WHEN** локальная KMP-публикация и проверка Android-потребителя проваливаются для существующей координаты
- **THEN** реализация MUST остановиться до массовой миграции исходников и зафиксировать нужную правку публикации или резервную стратегию с отдельным модулем.

### Requirement: Разделение multiplatform source set'ов
Реализация UIKit Compose SHALL размещать production API в `commonMain` и platform-dependent поведение в target source set bridge implementations.

#### Scenario: Production component API мигрирует
- **WHEN** production-компонент входит в публичный UIKit Compose API
- **THEN** его common API, styles, models и platform-neutral dependencies MUST быть размещены в `commonMain`.

#### Scenario: Platform-specific behavior изолирован
- **WHEN** компонент требует Android dialog, popup, window, view, lifecycle или platform graphics поведения
- **THEN** platform behavior MUST быть вынесено в `androidMain` или другой target source set через явную common-абстракцию или bridge implementation.

#### Scenario: Skiko targets compile common components
- **WHEN** `uikit-compose` собирается для iOS, macOS, JVM, JS или wasmJs targets
- **THEN** common production components MUST compile через `skikoMain` и target-specific bridge implementations без Android-only imports в bridge-independent common code.

### Requirement: Common-аннотации сохраняют Android-семантику
Публичный common API SHALL использовать SDDS multiplatform-аннотации для resource и range контрактов, а Android actual реализации SHALL сохранять Android resource/range intent без зависимости common API от AndroidX.

#### Scenario: Drawable resource annotation используется в common API
- **WHEN** common-коду нужно аннотировать целочисленный параметр drawable resource
- **THEN** он MUST использовать SDDS `DrawableRes` annotation, а Android actual implementation MUST preserve Android drawable resource intent.

#### Scenario: Range annotations используются в common API
- **WHEN** common-коду нужны integer или float range annotations
- **THEN** он MUST использовать SDDS expect-аннотации с Android actual implementations, сопоставленными с AndroidX-аннотациями там, где существуют эквиваленты.

### Requirement: Preview-код является Android-only
Compose preview-функции и зависимости `androidx.compose.ui.tooling.preview.Preview` SHALL не попадать в `commonMain`.

#### Scenario: Компонент с существующим preview переносится в commonMain
- **WHEN** файл компонента с runtime-примерами `@Preview` переносится в `commonMain`
- **THEN** preview-функции MUST быть перенесены в `androidMain` или другой Android-only preview source set.

### Requirement: Конфигурация Compose compiler соответствует Kotlin 2.1.10
Настройка Compose compiler SHALL быть совместима с проектной версией Kotlin `2.1.10` и SHALL NOT опираться на старую подмену `androidx.compose.compiler:compiler:1.5.15` для мигрированной KMP Compose-компиляции.

#### Scenario: KMP Compose-модуль настроен
- **WHEN** `uikit-compose` собирается как KMP Compose-модуль
- **THEN** сборка MUST использовать путь Kotlin Compose compiler Gradle plugin, совместимый с Kotlin `2.1.10`.

### Requirement: Compose BOM обновлен
Проектная версия Compose BOM SHALL быть обновлена до `2025.05.01` в рамках миграции.

#### Scenario: Compose dependencies резолвятся
- **WHEN** Compose dependencies объявлены через BOM из version catalog
- **THEN** они MUST резолвиться с использованием Compose BOM `2025.05.01`.
