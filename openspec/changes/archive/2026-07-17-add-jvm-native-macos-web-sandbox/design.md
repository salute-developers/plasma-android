## Context

Предыдущее изменение перенесло `integration-core:sandbox-core`, `integration-core:sandbox-compose`, fixtures и пилот `tokens/sdds.serv.compose/app` на KMP/CMP source sets. Общий `SandboxApp` и `SddsServSandboxApp` уже находятся в `commonMain`; Android использует `SandboxActivity`, iOS — `ComposeUIViewController`. `convention.cmp-app` объявляет JVM, Android, iOS, macOS, JS и Wasm targets, но JVM/Web/native macOS сейчас являются только компилируемыми targets без production launcher configuration.

Текущий `MainContent` выбирает TV layout только по expanded width. `TvLayout` использует `Drawer(openOnFocus = true)`, поэтому широкое JVM/macOS/Web окно получает focus-driven поведение, предназначенное для Android TV. Одновременно component screen на большом окне уже содержит панель свойств шириной 300 dp, что требует отдельного desktop breakpoint для постоянной component navigation.

Compose Multiplatform 1.8.2 содержит экспериментальный Kotlin/Native macOS backend: `androidx.compose.ui.window.Window` создаёт `NSWindow`, подключает Metal `SkiaLayer` и передаёт Compose scene события мыши, колеса и клавиатуры. Текущий dependency graph пилота успешно линкуется в `macosArm64` framework, но JVM-сборка на Mac не исполняет `macosMain` и не является native macOS проверкой.

## Goals / Non-Goals

**Goals:**

- Сделать `tokens/sdds.serv.compose/app` запускаемым на JVM Desktop, Kotlin/Native macOS ARM64, Kotlin/Wasm и Kotlin/JS без дублирования общего sandbox UI.
- Сохранить Android/iOS launcher-ы и обратную совместимость common sandbox entrypoint.
- Разделить TV focus и desktop pointer navigation.
- Получать нативный macOS executable, локальный `.app` и `.dmg` стандартными возможностями текущего Compose Gradle plugin.
- Обеспечить target-specific compile/link/run validation, явно различающую JVM-on-macOS и Kotlin/Native macOS.
- Подготовить browser history integration и полноэкранный Web viewport.

**Non-Goals:**

- Массовая миграция остальных `tokens/*/app` в этом изменении.
- Замена Compose navigation собственной navigation architecture.
- App Store delivery, Developer ID signing/notarization, hardened runtime и provisioning native macOS приложения.
- Universal macOS binary. `macosArm64` обязателен; `macosX64` может выпускаться отдельным артефактом, пока target поддерживается текущей версией Compose.
- Полноценный AppKit view interop, multi-window UI, fullscreen или прозрачные native macOS окна.
- Изменение token contract, Theme Builder output или docs generation.

## Decisions

### Сохранить один общий app root и добавить тонкие platform entrypoint-ы

`SddsServSandboxApp` остаётся единственным корнем UI. JVM, native macOS и Web entrypoint-ы сначала вызывают идемпотентную common-инициализацию темы/stories, затем создают платформенный host и отображают common root.

```text
SddsServSandboxApp (commonMain)
├── Android Activity
├── iOS ComposeUIViewController
├── JVM application/Window
├── macOS Native NSApplication/Compose Window
├── Wasm ComposeViewport
└── JS ComposeViewport
```

Альтернатива: отдельный sandbox UI для каждого desktop target. Отклонено, потому что он перестанет проверять общий CMP stack и быстро разойдётся по поведению.

### JVM и native macOS являются независимыми launcher-ами

JVM launcher использует `jvmMain` и Compose Desktop JVM runtime. Native launcher использует `macosMain`, Kotlin/Native executable и AppKit/Metal backend. Оба получают desktop navigation policy, но имеют отдельные Gradle tasks и критерии проверки.

Альтернатива: считать JVM-запуск на Mac проверкой macOS libraries. Отклонено: variant resolution в таком запуске не включает `macosMain`, native `.klib`, Kotlin/Native linker и macOS actual implementations.

### Native macOS запускается из Kotlin/Native executable без отдельного Xcode host

В `macosMain` добавляется `main`, который создаёт `NSApplication`, задаёт regular activation policy, инициализирует sandbox, создаёт Compose native `Window` и запускает AppKit event loop. macOS targets получают executable binaries дополнительно к существующим framework binaries.

Для формирования `.app` и `.dmg` используется экспериментальный `compose.desktop.nativeApplication` из Compose Gradle plugin 1.8.2. Он уже умеет оборачивать native executable в app bundle и DMG, поэтому отдельный Xcode project не требуется для локального sandbox workflow.

Альтернатива: Swift/AppKit Xcode host поверх Kotlin framework. Он даёт больше контроля над lifecycle, entitlements и signing, но добавляет второй project model и ручное framework embedding. Его следует рассматривать только при расширении scope до production distribution или если native `Window` не обеспечит необходимый lifecycle.

Поскольку native `Window` backend не предоставляет полноценный close/dispose callback, launcher должен установить AppKit delegate/notification handling, завершать приложение после закрытия последнего окна и по возможности освобождать platform resources через доступный API. Это обязательный runtime acceptance check, а не только compile-time задача.

### Native macOS packaging остаётся локальным/экспериментальным

Native application DSL создаёт `.app` и `.dmg`, но текущая реализация packager не завершает production signing/notarization workflow и формирует отдельный bundle для каждого target binary. В этом change артефакт предназначен для локальной разработки и внутренней проверки.

Альтернатива: сразу добавить Developer ID signing, notarization и universal binary. Отклонено как отдельный delivery/security scope, не требующийся для проверки KMP библиотек и sandbox UI.

### Navigation policy передаётся явно, а layout остаётся адаптивным

Common sandbox API получает документированную конфигурацию navigation policy с обратимо-совместимым default:

- `Auto` — сохраняет текущее поведение для существующих consumers;
- `Tv` — focus-driven drawer с peek area;
- `Desktop` — pointer-oriented navigation;
- при необходимости `Touch` может явно закрепить mobile/touch flow.

JVM, native macOS и Web передают `Desktop`; Android TV использует `Tv`; существующие вызовы без аргумента остаются на `Auto`. Названия могут быть уточнены при реализации, но публичный контракт не должен раскрывать Android framework types. Для нового public API требуется KDoc.

Внутри `Desktop`:

- широкое окно использует постоянную левую navigation panel;
- узкое окно показывает явную menu button и controlled `Drawer` с `openOnFocus = false`;
- переход через breakpoint не меняет активный route;
- selected menu item выводится из navigation state, а не только из локального индекса списка.

Persistent breakpoint задаётся sandbox layout constants и выбирается выше существующего large-component breakpoint, чтобы одновременно помещались component navigation, 300 dp properties panel и story preview. Финальное значение определяется визуальной проверкой на типовых ширинах, начальная оценка — 1200 dp.

Альтернатива: определять desktop по expanded width. Отклонено, поскольку размер окна не определяет наличие D-pad/focus input и воспроизводит исходную проблему.

### Web использует Wasm как основной и JS как compatibility executable

`wasmJs` и `js` получают `binaries.executable()` и самостоятельные browser distributions. Wasm остаётся основным современным вариантом, а JS публикуется как совместимый отдельный launcher; runtime-выбор между ними в scope не входит. Текущая target hierarchy не создаёт общий `webMain` source set, поэтому `wasmJsMain` и `jsMain` содержат только тонкие platform entrypoint-ы и history binding. HTML host, viewport CSS и единственный UI-root `SddsServSandboxApp` остаются общими, поэтому реализации не расходятся по UI.

Для browser binding версия `org.jetbrains.androidx.navigation` должна быть согласована с Compose Multiplatform 1.8.2. Обновление выполняется минимально и только после focused compilation и browser smoke test обоих Web targets.

Альтернатива: Web без history binding. Отклонено, потому что Back/Forward и прямые ссылки являются базовым browser поведением и без binding common NavHost создаёт ложное ощущение нативной навигации.

### Изменения Gradle остаются scoped к пилотному приложению

Executable и distribution configuration сначала размещаются в `tokens/sdds.serv.compose/app`. Общая `convention.cmp-app` не должна автоматически превращать каждый CMP module в JVM/native/Web executable. Повторно используемая sandbox convention выделяется только если конфигурация не может быть выражена узко или сразу появляется второй CMP sandbox app.

Альтернатива: безусловно добавить launcher packaging в `convention.cmp-app`. Отклонено из-за широкого влияния на composite build и будущие CMP applications с другим набором targets.

## Risks / Trade-offs

- [Native macOS Compose backend экспериментален и официально не равен стабильному JVM Desktop backend] → Ограничить scope sandbox workflow, зафиксировать поддерживаемые операции и обязательно выполнить runtime smoke test на ARM64 Mac.
- [Native window lifecycle может оставить event loop или Compose scene после закрытия окна] → Добавить AppKit termination handling и отдельный acceptance test закрытия последнего окна; при невозможности корректного поведения перейти на Xcode/AppKit host.
- [Native packager не обеспечивает production signing/notarization] → Не позиционировать DMG как внешний release; вынести signed distribution в отдельное изменение.
- [Две desktop реализации увеличивают build time и матрицу проверок] → Разделить focused tasks и запускать native link/package только на macOS CI agent.
- [Navigation dependency upgrade может затронуть Android/iOS] → Выбрать минимально совместимую версию и прогнать compile/link всех pilot targets.
- [Постоянные navigation и properties panels могут сжать preview] → Использовать отдельный persistent breakpoint и визуально проверить narrow/medium/wide размеры.
- [Web resources и шрифты загружаются асинхронно] → Добавить host styles и при заметном FOUT preload только реально используемых sandbox fonts.
- [Глобальная регистрация theme/stories может повториться при lifecycle restart] → Сделать pilot initialization идемпотентной или явно гарантировать однократный вызов каждым launcher-ом.

## Migration Plan

1. Добавить common navigation configuration с backward-compatible `Auto` и покрыть resolver unit tests.
2. Реализовать desktop persistent/toggle layouts, не меняя TV focus layout.
3. Добавить JVM launcher и подтвердить common UI на JVM variants.
4. Добавить `macosArm64` executable, native event loop/lifecycle и проверить запуск/закрытие.
5. Включить native `.app`/`.dmg` tasks и проверить bundle resources.
6. Добавить Wasm и JS executables, shared Web viewport resources и browser history binding.
7. Выполнить Android/iOS regression compilation и platform smoke tests для обоих Web targets.

Rollback выполняется удалением новых platform entrypoint-ов/executable configuration и возвратом default common navigation resolver; Android/iOS common root остаётся совместимым и не требует миграции данных.

## Open Questions

- Нужен ли `macosX64` как отдельный DMG в первой поставке или достаточно обязательного `macosArm64`?
- Должен ли browser URL включать только component key или также group/theme для будущей устойчивости deep links?
