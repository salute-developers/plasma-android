## Context

`sdds-core/uikit-compose` является публичной Compose UIKit библиотекой с artifactId `sdds-uikit-compose`. Сейчас модуль собран как Android library через `convention.android-lib`, но значительная часть компонентов использует только Compose runtime/foundation/ui API и может быть размещена в `commonMain`.

В репозитории уже есть KMP-инфраструктура: `convention.cmp-lib`, Compose Multiplatform plugin и пример `third-party/sdds-haze/haze`. При этом текущий `convention.cmp-lib` содержит историческую подмену Compose compiler на `androidx.compose.compiler:compiler:1.5.15`, что несовместимо с направлением Kotlin `2.1.10` и должно быть пересмотрено для этой миграции.

Основной риск изменения - не сам перенос исходников, а публикационная совместимость. Android-клиенты уже зависят от `io.github.salute-developers:sdds-uikit-compose`; миграция на KMP не должна заставить их менять координату на target-specific artifact.

## Goals / Non-Goals

**Goals:**

- Сохранить модуль `sdds-core/uikit-compose` и artifactId `sdds-uikit-compose`, если spike публикационной совместимости подтверждает совместимость.
- Добавить структуру KMP source set'ов и перенести production UIKit Compose API в `commonMain`.
- Сохранить Android/Skiko-specific поведение через platform bridge файлы в target source set'ах там, где зависимость на platform API является архитектурной.
- Сохранить Android lint-смысл resource/range annotations через SDDS common annotations и Android actual-реализации.
- Перенести preview-only код в `androidMain`.
- Обновить Compose BOM до `2025.05.01` и использовать настройку Compose compiler, совместимую с Kotlin `2.1.10`.
- Получить проверяемый процесс миграции: spike публикации, API check, focused builds, consumer validation.

**Non-Goals:**

- Не гарантировать одинаковую runtime-полноту всех non-Android targets сверх того, что подтверждено компиляцией и bridge-заглушками/реализациями.
- Не менять визуальное поведение Android runtime при переносе dialog/popup/window infrastructure за common-обертки.
- Не менять публичные координаты Android-клиентов без отдельного решения.
- Не добавлять новые платформы как гарантированно поддерживаемые runtime targets, пока не будет набора проверок для них.
- Не менять визуальное поведение компонентов в рамках миграции source set'ов.

## Decisions

### Миграция в том же модуле при успешном spike

Основной путь - переводить `sdds-core/uikit-compose` на KMP in-place. Это сохраняет ownership, документацию, auto-bump, artifact metadata и привычную точку подключения для клиентов.

Альтернатива - создать новый модуль, например `uikit-compose-multiplatform`. Она снижает риск публикационной несовместимости, но создает дубли API, новую координату, миграционный период и риск расхождения с существующей Android библиотекой. Этот вариант остается fallback, если spike покажет, что старая координата не может надежно работать для Android-клиентов.

### Spike публикации как первый gate

До массового переноса исходников нужно временно перевести модуль на KMP и опубликовать его в локальный Maven repository. Проверочным Android consumer является `tokens/sdds.serv.compose/app`, потому что это обычный Android app-модуль, который потребляет Compose UIKit через `tokens/sdds.serv.compose` и `tokens/sdds.serv.compose/integration`. В spike нужно заставить этот consumer использовать локально опубликованную старую координату:

```kotlin
implementation("io.github.salute-developers:sdds-uikit-compose:<version>")
```

Spike должен проверить Gradle Module Metadata, root publication, Android target publication и POM-only риск. Если `tokens/sdds.serv.compose/app` требует `sdds-uikit-compose-android` или не собирается со старой координатой, in-place миграция не считается безопасной без доработки publish-конфигурации. Отдельный временный consumer нужен только как резервная дополнительная проверка, если поведение существующего app-модуля окажется неоднозначным из-за composite build substitution.

### Разделение source set'ов

Первая структура:

```text
commonMain
  production components, styles, models, interactions, motion
  SDDS annotations
  expect platform/resource utilities

androidMain
  Android actual utilities/resource bridge
  previews
  Android Dialog/Popup/Window/View, graphics and shadow bridge implementations

skikoMain
  Skiko/Desktop/iOS/macOS/JS/Wasm bridge implementations where shared Compose/Skiko API is enough

iosMain, macosMain, jvmMain, jsMain, wasmJsMain
  target-specific bridge implementations such as platform clock
```

Итоговый scope шире первоначальной первой волны: все production-компоненты переносятся в `commonMain`, включая `Modal`, `ModalBottomSheet`, `DropdownMenu`, `Autocomplete`, `ComboBox`, `Select`, `Popover`, `Tooltip`, `overlay/OverlayHost`, `overlay/OverlayManager` и slider/tabs dependencies. Platform behavior выносится в `androidMain` и `skikoMain` bridge-файлы, чтобы common API оставался единым.

### Annotations через expect/actual

В common API вводятся SDDS annotations (`DrawableRes`, `StringRes`, `FloatRange`, `IntRange`) с default-параметрами, пригодными для common usage. На Android они реализуются через actual annotation classes, чтобы common API не требовал AndroidX annotations и сохранял resource/range contract на Android.

Это сохраняет JVM method descriptors для runtime API и минимизирует churn исходников в common-коде. Простая зависимость common API от `androidx.annotation` не выбрана, потому что она ломает non-Android source sets.

### Previews остаются Android-only

`androidx.compose.ui.tooling.preview.Preview` не должен попадать в `commonMain`. Preview functions из переносимых файлов выносятся в `androidMain` рядом с Android preview dependencies. Это не часть runtime API и не должно влиять на бинарную совместимость компонентов.

### Compose compiler и BOM

Compose BOM обновляется до `2025.05.01` для версий Compose libraries. Compose compiler не должен управляться старой dependency substitution на `androidx.compose.compiler:compiler:1.5.15`; для Kotlin `2.1.10` используется путь Kotlin Compose compiler Gradle plugin. Если существующие KMP conventions требуют изменений, они должны быть узко scoped и проверены на `third-party/sdds-haze/haze` или явно исключать регрессию.

## Risks / Trade-offs

- Publication metadata может быть несовместима с существующими Android clients -> сначала выполнить local publication spike и consumer build на старой координате.
- POM-only clients могут не понять KMP root publication -> проверить root POM и `.module`; при риске документировать requirement на Gradle Module Metadata или доработать publishing.
- KSP `api-info-compose` может быть Android source set oriented -> проверить генерацию API info после переноса первых style/builders; при необходимости оставить KSP-generated участки в Android source set до отдельной адаптации.
- Перенос preview functions может создать дубли или потерю preview coverage -> переносить preview рядом с компонентом в `androidMain` и не смешивать с runtime common API.
- Изменение `build-system` может затронуть другие модули -> ограничить правки KMP/Compose compiler conventions и проверить существующий KMP пример `third-party/sdds-haze/haze`.

## Migration Plan

1. Выполнить spike публикации на временной ветке: минимальная KMP-конфигурация, локальная публикация, проверка `tokens/sdds.serv.compose/app` на старой координате.
2. Если spike успешен, обновить Gradle conventions и build script `uikit-compose` для KMP layout.
3. Добавить common annotations и Android actual typealiases.
4. Перенести preview functions из кандидатов первой волны в `androidMain`.
5. Перенести production-компоненты и их internal dependencies в `commonMain`.
6. Решить легкие Android dependencies: preview logs, `Throttle`/platform clock, `WindowSize`, resource bridges, graphics/shadow bridges.
7. Перенести dialog/popup/overlay-dependent components в common API через Android и Skiko bridge implementations.
8. Прогнать focused validation: `:uikit-compose:assemble`, publish to local distribution, сборку `tokens/sdds.serv.compose/app` или replacement consumer.
9. Прогнать validation для `playground/sandbox-integration-test`, который зависит от `sdds-uikit-compose`.

Rollback: если publication compatibility не подтверждается, не продолжать in-place migration; оформить альтернативу с новым module/artifact или доработкой publishing до повторного spike.

## Open Questions

- Требуется ли поддержка POM-only клиентов, или достаточно Gradle Module Metadata для новой версии?
