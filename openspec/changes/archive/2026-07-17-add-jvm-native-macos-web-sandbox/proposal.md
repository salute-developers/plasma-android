## Why

После переноса sandbox-инфраструктуры в `commonMain` пилот `tokens/sdds.serv.compose/app` по-прежнему имеет исполняемые launcher-ы только для Android и iOS. Из-за этого JVM, Kotlin/Native macOS и Web варианты библиотек компилируются как KMP-артефакты, но не проверяются в реальном sandbox-приложении и не позволяют оценить desktop/web взаимодействие с общей UI-оболочкой.

## What Changes

- Добавить в `tokens/sdds.serv.compose/app` независимые исполняемые launcher-ы для JVM Desktop, Kotlin/Native macOS и Web, переиспользующие общий `SddsServSandboxApp`.
- Для native macOS собирать Kotlin/Native executable как минимум для `macosArm64`, запускать его через AppKit/Compose native window и формировать локально запускаемый `.app`; `.dmg` включить в поставляемый Gradle workflow.
- Добавить два Web launcher-а: Kotlin/Wasm как основной вариант и Kotlin/JS как обязательный compatibility-вариант; оба переиспользуют общий sandbox UI и browser navigation integration.
- Отделить выбор sandbox layout от одной только ширины окна: Android TV сохраняет открытие navigation drawer по фокусу, а JVM/native macOS/Web используют pointer-oriented desktop navigation.
- На широком desktop/web окне показывать навигацию постоянно, на более узком — открывать её явной кнопкой без focus-triggered поведения.
- Сохранить существующие Android и iOS launcher-ы и общий контракт регистрации темы/stories.
- Зафиксировать экспериментальный статус Compose Kotlin/Native macOS backend и обязательную runtime-проверку его поддерживаемого поведения.

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `sandbox-compose-multiplatform`: расширить требования пилотного CMP sandbox на JVM Desktop, native macOS и Web launcher-ы, а также определить desktop/TV политики навигации и платформенную валидацию.

## Impact

- Affected modules: `integration-core:sandbox-compose`, `tokens/sdds.serv.compose:app`; при необходимости точечные изменения `build-system` CMP/sandbox conventions.
- Public API: вероятно потребуется common-конфигурация `SandboxApp` для выбора navigation/layout policy и callback для platform navigation integration; Android framework API не должен попадать в common contract.
- Gradle: executable/browser/native application configuration, native `.app`/`.dmg` packaging и focused run/link/distribution tasks. Изменения общей `convention.cmp-app` должны быть опциональными, чтобы не сделать все CMP-модули приложениями неявно.
- Dependencies: потребуется проверить согласование Compose Multiplatform Navigation с browser history API; обновление версии допускается только при необходимости и с проверкой Android/iOS/JVM/native macOS/Web.
- Tokens and generation: token contract и Theme Builder output не меняются; сгенерированный integration-код вручную не редактируется.
- Docs generation: не затрагивается.
- Validation: Android/iOS regression checks, JVM run, native macOS ARM64 link and app launch, `.app`/`.dmg` packaging, Wasm и JS browser distributions, а также ручная проверка мыши, клавиатуры, изменения размера окна и TV focus navigation.
- Native macOS packaging на первом этапе не обещает App Store delivery, universal binary или production signing/notarization; эти требования требуют отдельного явного scope.
