## Why

Compose-песочница сейчас остается Android-only слоем поверх уже мультиплатформенного Compose-стека. Это мешает использовать sandbox как финальную проверку KMP-миграции токенов, стилей и UIKit, хотя `tokens/sdds.serv.compose` уже переведен на мультиплатформенную структуру и подходит для пилота.

## What Changes

- Перевести `integration-core:sandbox-core` на KMP-конвенцию и разместить общий sandbox API в `commonMain`.
- Перевести `integration-core:sandbox-compose` на Compose Multiplatform-конвенцию, оставив общий story/demo UI в `commonMain`, а Android-only части в платформенных source set.
- Сохранить `integration-core:sandbox-ksp` как JVM/KSP processor, но обеспечить KMP-friendly генерацию stories/state helpers и подключение к common/KMP сборке.
- Заменить Android-only Navigation Compose в sandbox на официальную Compose Multiplatform navigation-зависимость в `commonMain`.
- Вынести Activity launcher и настройку окна в платформенный слой; APK updater не входит в CMP-пилот и не должен требоваться common sandbox API.
- Перевести пилотные модули `tokens/sdds.serv.compose/integration` и `tokens/sdds.serv.compose/app` на CMP/KMP-структуру с использованием существующих `cmp`/`kmp` Gradle-конвенций; для `integration` менять источник генерации в `build-system`, а не править сгенерированные файлы вручную.
- Сформировать общий `@Composable` корень sandbox app, который запускается платформенными entrypoint-ами.

## Capabilities

### New Capabilities

- `sandbox-compose-multiplatform`: требования к запуску Compose sandbox в KMP/CMP-структуре, включая общий UI-фреймворк, KSP stories, навигацию и пилотный app на `tokens/sdds.serv.compose`.

### Modified Capabilities

Нет.

## Impact

- Affected included builds/modules: `integration-core:sandbox-core`, `integration-core:sandbox-compose`, `integration-core:sandbox-ksp`, `integration-core:uikit-compose-fixtures`, `tokens:sdds.serv.compose`, `tokens:sdds.serv.compose:integration`, `tokens:sdds.serv.compose:app`, `build-system` integration generators/templates.
- Gradle conventions: изменение должно использовать существующие `convention.kmp-lib`, `convention.cmp-lib`, `convention.cmp-app`; при необходимости допускается точечное расширение конвенций для sandbox app/KSP wiring.
- Public API: возможны новые common entrypoint-и sandbox (`SandboxApp`, регистрация темы без `SandboxActivity` receiver) и перенос Android API в `androidMain`.
- Dependencies: замена AndroidX Navigation Compose на `org.jetbrains.androidx.navigation:navigation-compose` для `commonMain`; проверка KSP configurations для common metadata.
- Tokens/docs generation: токены `sdds.serv.compose` уже KMP; изменение не должно менять token contract. Сгенерированный код `tokens/*/integration` должен обновляться через `build-system` generator/templates и последующую регенерацию.
- Validation scope: focused Gradle tasks для `integration-core` sandbox-модулей и `tokens/sdds.serv.compose/app`, плюс Android запуск пилотной песочницы в KMP-структуре.
