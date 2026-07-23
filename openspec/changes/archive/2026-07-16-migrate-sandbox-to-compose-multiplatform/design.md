## Context

`integration-core` содержит общий sandbox-стек для demo-приложений: `sandbox-core`, `sandbox-compose`, `sandbox-ksp` и fixtures. Сейчас `sandbox-core` и `sandbox-ksp` собираются как JVM/Kotlin modules, а `sandbox-compose` и app-модули песочницы остаются Android-only. При этом базовый Compose UIKit и `tokens/sdds.serv.compose` уже имеют KMP/CMP-структуру, поэтому sandbox становится финальным слоем, который мешает проверить полный мультиплатформенный путь.

Пилот выбран на `tokens/sdds.serv.compose/app`, потому что соответствующий token module уже использует `convention.cmp-lib`, Compose resources и `themeBuilder { compose { multiplatform(true) } }`. Текущий app тонкий: Android Activity вызывает `registerCoreStories()` и `registerTheme()`, а затем использует общий `SandboxActivity`.

Код в `tokens/*/integration/src` является сгенерированным. Для `sdds.serv.compose/integration` источником правок должны быть генераторы и шаблоны в `build-system`, прежде всего `tasks.integration.ComposeComponentsGenerator`, `ComposeRegisterThemeKt_V2.txt` и `ComposeComponentProviderKt_V2.txt`. Ручные изменения в сгенерированных `SddsServ*VariationsCompose.kt`, `SddsServComposeComponents.kt` и `SddsServRegisterTheme.kt` допустимы только как временный spike и не являются целевой реализацией.

## Goals / Non-Goals

**Goals:**

- Перевести sandbox-инфраструктуру на существующие KMP/CMP-конвенции проекта: `convention.kmp-lib`, `convention.cmp-lib`, `convention.cmp-app`.
- Разместить platform-neutral sandbox API и Compose UI в `commonMain`.
- Оставить Android-only поведение в `androidMain`: Activity launcher, настройка window/insets, Android permissions/manifest. APK updater не входит в CMP-пилот.
- Обеспечить KMP-friendly работу `sandbox-ksp`: processor остается JVM, но его generated code и Gradle wiring работают для common/KMP сборки.
- Использовать официальную Compose Multiplatform navigation-зависимость в `commonMain`.
- Запустить пилотную песочницу через `tokens/sdds.serv.compose/app` без регресса Android-сценария.

**Non-Goals:**

- Массовый перевод всех `tokens/*/app` в рамках первого изменения.
- Перенос View sandbox (`sandbox-view`) на KMP.
- Кросс-платформенная реализация APK/self-update. Updater не проектируется для CMP-пилота.
- Изменение контракта токенов и стилей `sdds.serv.compose`, кроме адаптации интеграционного sandbox-слоя.
- Введение сторонней navigation architecture вроде Voyager, Decompose или Circuit.

## Decisions

### Использовать существующие Gradle-конвенции

`sandbox-core` переводится на `convention.kmp-lib`, `sandbox-compose` и `tokens/sdds.serv.compose/integration` на `convention.cmp-lib`, пилотный app на `convention.cmp-app`. Это сохраняет единый путь с уже мигрированными модулями `sdds-core/uikit-compose` и `tokens/sdds.serv.compose`.

Альтернатива: создать отдельные sandbox-specific конвенции. Отклонено для первого этапа, потому что это расширяет blast radius в `build-system`. Если `convention.cmp-app` не покрывает sandbox packaging/KSP, допускается точечное расширение существующей конвенции или минимальная новая конвенция, но только после проверки текущего набора.

### Разделить sandbox UI и платформенные launcher-и

В `sandbox-compose/commonMain` вводится общий composable root, например `SandboxApp`, который применяет sandbox theme, overlay host и основной navigation content. Android `SandboxActivity` становится thin wrapper в `androidMain` и вызывает этот root через `setContent`.

Альтернатива: оставить `SandboxActivity` главным API и делать expect/actual вокруг него. Отклонено, потому что Activity не существует на iOS/desktop и не должна быть обязательной для common-клиентов.

### Вынести state management из Android ViewModel-зависимости

Логика `ComponentViewModel` переносится в common state holder/controller на корутинах и `StateFlow`; Android ViewModel может остаться adapter-ом, если нужен lifecycle-retained state на Android. Public story API не должен зависеть от `androidx.lifecycle.ViewModel`.

Альтернатива: использовать multiplatform lifecycle ViewModel напрямую в common. Это возможно, но для sandbox логика уже почти platform-neutral, поэтому отдельный lightweight controller уменьшает зависимость story framework от lifecycle API.

### Использовать Compose Multiplatform Navigation

Android-only `androidx.navigation:navigation-compose` заменяется на `org.jetbrains.androidx.navigation:navigation-compose` в `commonMain`. Текущая структура `MainContent`/`NavigationGraph` сохраняется: `rememberNavController`, `NavHost`, `composable`, строковые routes.

Альтернатива: написать собственный stack-router для sandbox. Отклонено, потому что official navigation уже покрывает common back stack, transitions и platform back gestures, а sandbox не требует кастомной архитектуры.

### Оставить `sandbox-ksp` JVM processor-ом

`sandbox-ksp` не становится KMP library: KSP processor остается JVM-инструментом. Требование меняется к output: generated registry/producers/transformers должны быть пригодны для common source set и не ссылаться на Android-only API.

Альтернатива: отказаться от KSP и регистрировать stories вручную в пилоте. Отклонено, потому что KSP story discovery является частью существующей sandbox-модели и должен быть проверен в финальном KMP stack.

### Менять integration-код через генератор

`tokens/sdds.serv.compose/integration` переводится не ручным редактированием сгенерированных файлов, а изменением generator/templates в `build-system`, чтобы CMP-compatible registration/provider/style-provider output воспроизводился при следующей генерации. Сгенерированные файлы в пилотном модуле обновляются регенерацией и служат проверкой генератора.

Альтернатива: вручную переложить `tokens/sdds.serv.compose/integration/src/main` в `commonMain`. Отклонено, потому что следующий запуск генерации перезапишет эти изменения, а остальные token integration modules не получат повторяемый путь миграции.

### Пилотировать на `tokens/sdds.serv.compose`

`tokens/sdds.serv.compose/integration` переводится вместе с app, потому что generated `registerTheme()` сейчас находится в Android-only integration module и имеет receiver `SandboxActivity`, хотя Activity не используется. Генератор должен начать выпускать common API регистрации, например `registerSddsServTheme(...)`, и при необходимости Android compatibility extension.

Альтернатива: оставить integration Android-only и вызывать регистрацию только из Android launcher. Отклонено, потому что тогда common app root не сможет быть полноценной проверкой KMP sandbox stack.

## Risks / Trade-offs

- KSP common metadata wiring может отличаться от Android `ksp(...)` сценария -> начать с локального паттерна `kspCommonMainMetadata`, как в `sdds-core/uikit-compose`, и валидировать generated sources до переноса остальных app-модулей.
- `uikit-compose-fixtures` содержит Android resource usage через `painterResource`/`R.drawable` -> либо перевести используемые core stories на CMP resources/image sources в этом изменении, либо явно ограничить пилот минимальным набором stories, который компилируется в common.
- Android self-update не имеет прямого iOS/desktop аналога -> updater исключен из CMP-пилота, common sandbox API не должен от него зависеть.
- Навигационная библиотека меняет dependency group/artifact -> зафиксировать версию в version catalog и собрать Android-пилот, чтобы проверить API совместимость текущего `NavHost` usage.
- Публичные entrypoint-и sandbox изменятся -> добавить/обновить KDoc для новых common API и сохранить Android-compatible wrapper там, где это нужно текущим app-модулям.
- `convention.cmp-app` может не покрыть текущую Android release packaging логику `convention.sandbox-app` -> перенести только необходимые sandbox-specific настройки или расширить конвенцию узко, без изменения остальных app-модулей.
- Ручные правки generated integration-кода будут потеряны при регенерации -> все устойчивые изменения для `tokens/*/integration` делать в `build-system` generator/templates, а generated output использовать как проверяемый результат.

## Migration Plan

1. Перевести `sandbox-core` на `convention.kmp-lib`, переместив исходники в `src/commonMain`.
2. Подготовить `sandbox-ksp`: убрать Android-only references из generated code, настроить KMP/common metadata output, проверить registry/producers/transformers.
3. Перевести `sandbox-compose` на `convention.cmp-lib`; разложить common UI, navigation, state holder и платформенные Android actual/wrappers по source set.
4. Перевести необходимые части `uikit-compose-fixtures`, которые нужны пилотному app, чтобы `registerCoreStories()` был доступен из common.
5. Обновить `build-system` integration generator/templates так, чтобы generated Compose integration-код поддерживал CMP/common output без `SandboxActivity` requirement.
6. Перегенерировать `tokens/sdds.serv.compose/integration`, перевести модуль на `convention.cmp-lib` и проверить generated common registration/provider output.
7. Перевести `tokens/sdds.serv.compose/app` на `convention.cmp-app`, добавить common `SandboxApp` usage и Android launcher.
8. Выполнить focused validation: сборка sandbox-модулей, сборка `tokens:sdds.serv.compose:app`, Android запуск пилотной песочницы.

Rollback: если common navigation/KSP wiring блокирует пилот, сохранить Android app на старом `convention.sandbox-app` до исправления инфраструктуры, не переводя остальные token app-модули.

## Open Questions

- Нужен ли desktop launcher в первом apply или достаточно Android app в KMP-структуре как DoD?
- Должен ли `registerCoreStories()` целиком стать common API в этом изменении, или пилот допустимо ограничить subset-ом core stories?
- Нужно ли сохранить старый `SandboxActivity.registerTheme()` compatibility extension для остальных Android-only app-модулей до их миграции?

## Apply Notes

- Android-пилот `tokens/sdds.serv.compose/app` переведен на KMP/CMP-структуру и компилируется через `convention.cmp-app`: common root делегирует рендеринг в `sandbox-compose` common `SandboxApp`, Android launcher остается платформенным входом.
- `tokens/sdds.serv.compose/integration` переведен через генератор/templates, а не ручной правкой generated-кода. `generateComposeIntegration` теперь определяет CMP/KMP-модуль по `org.jetbrains.kotlin.multiplatform`, пишет production output в `src/commonMain/kotlin` и очищает устаревший generated package из `src/main`.
- `addDefaultTargets()` оставлен на стандартной Kotlin hierarchy template без кастомного `nonAndroidMain`: platform-specific no-op реализации sandbox system bars разложены по обычным source set-ам `jvmMain`, `iosMain`, `macosMain`, `jsMain` и `wasmJsMain`.
- Для iOS-пилота добавлен common-to-UIKit entrypoint `MainViewController()` и framework binary `SddsServSandbox`; локальная сборка доходит до Xcode tooling и блокируется отсутствующей/неполной установкой Xcode CLI tools.
- `integration-core:sandbox-compose` и `tokens:sdds.serv.compose:app` проверены на `wasmJs` compile. Desktop/web launcher-и остаются будущим продуктовым решением, но common sandbox stack уже компилируется под эти targets.
- Android-пилот проверен вручную: песочница запускается и открывает stories.
- Updater исключен из CMP-пилота; новая common sandbox API не должна требовать update behavior.
- `uikit-compose-fixtures` переведен на CMP для core stories, используемых пилотом: `sandbox-ksp` запускается через common metadata, common stories используют `ImageSource`/`icons-compose` вместо Android `R.drawable`, а Android-only docs/samples остаются в Android source set-ах.
