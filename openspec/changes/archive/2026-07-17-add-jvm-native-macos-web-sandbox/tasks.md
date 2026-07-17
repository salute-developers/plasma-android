## 1. integration-core: sandbox-compose navigation

- [x] 1.1 Добавить в common API sandbox документированную navigation policy с обратно совместимым значением `Auto` и явно выбираемыми TV/desktop режимами, не раскрывая Android-типы в public contract.
- [x] 1.2 Вынести выбор layout из проверки одной только ширины окна и сохранить существующий focus-driven drawer для TV policy.
- [x] 1.3 Реализовать desktop layout: постоянную левую панель на широком окне и controlled drawer с явной кнопкой и `openOnFocus = false` на узком окне.
- [x] 1.4 Сохранять текущий route и корректно выводить выбранный пункт меню из navigation state при изменении размера окна и переходе через desktop breakpoint.
- [x] 1.5 Добавить common unit tests для resolver-а navigation policy и breakpoint-переходов, включая обратно совместимое поведение `Auto`.

## 2. tokens: sdds.serv.compose JVM Desktop launcher

- [x] 2.1 Настроить в `tokens/sdds.serv.compose/app` исполняемый JVM Desktop target и scoped Gradle run/distribution tasks без изменения поведения остальных CMP-модулей.
- [x] 2.2 Добавить `jvmMain` entrypoint с desktop window, идемпотентной регистрацией темы/stories и запуском общего `SddsServSandboxApp` с desktop navigation policy.
- [x] 2.3 Запустить JVM sandbox, открыть компонент и проверить мышь, колесо, клавиатуру, изменение размера окна и оба состояния desktop navigation.

## 3. tokens: sdds.serv.compose native macOS launcher

- [x] 3.1 Добавить для `macosArm64` Kotlin/Native executable binary, сохранив существующую framework-конфигурацию для iOS/macOS library validation.
- [x] 3.2 Реализовать `macosMain` launcher на AppKit: настроить `NSApplication`, activation policy, Compose native window и запуск общего `SddsServSandboxApp` с desktop navigation policy.
- [x] 3.3 Реализовать обработку закрытия последнего окна и завершение AppKit event loop без оставшегося процесса или активной sandbox scene.
- [x] 3.4 Настроить экспериментальный `compose.desktop.nativeApplication` для локальной ARM64-сборки `.app` и `.dmg` с native executable и Compose resources.
- [x] 3.5 Собрать и запустить ARM64 native executable и `.app`, проверить открытие component story, мышь, прокрутку, клавиатуру, resize и корректное завершение; отдельно проверить содержимое и запуск приложения из `.dmg`.

## 4. tokens: sdds.serv.compose Web launcher

- [x] 4.1 Настроить `wasmJs` и `js` browser executables с отдельными distribution tasks в пилотном app-модуле; Wasm оставить основным, а JS — обязательным compatibility launcher-ом.
- [x] 4.2 Добавить shared Web entrypoint helpers, HTML host и стили полнооконного Compose viewport, чтобы `wasmJsMain` и `jsMain` запускали общий `SddsServSandboxApp` с desktop navigation policy без дублирования UI.
- [x] 4.3 Связать common navigation state с browser history и устойчивым route URL в обоих Web launcher-ах, поддержав Back/Forward и прямое открытие известного component route.
- [x] 4.4 При необходимости минимально согласовать версию Compose Multiplatform Navigation с Compose 1.8.2 и подтвердить компиляцию всех pilot targets после изменения зависимости.
- [x] 4.5 Собрать Wasm и JS browser distributions и вручную проверить в каждой меню, component story, property editing, Back/Forward, resize и отсутствие focus-triggered drawer.

## 5. Документация и target-specific validation

- [x] 5.1 Обновить KDoc нового common navigation API и README пилотного app-модуля командами запуска JVM, native macOS и Web, явно указав различие JVM-on-macOS и Kotlin/Native macOS.
- [x] 5.2 Выполнить из корня focused Gradle compilation для common/Android, iOS framework, JVM, `macosArm64` link, Wasm и JS distributions; зафиксировать фактически проверенный Kotlin target для каждой команды.
- [x] 5.3 Повторно собрать или запустить существующие Android и iOS launcher-ы и проверить, что общий root, регистрация темы/stories и mobile navigation не регрессировали.
- [x] 5.4 Запустить форматирование и статические проверки затронутых модулей, затем устранить найденные ошибки без ручного редактирования generated integration-кода.
- [x] 5.5 Задокументировать ограничения первой версии: обязательные ARM64, Wasm и JS launcher-ы; отсутствие universal binary, production signing/notarization и App Store delivery, а также отсутствие runtime-переключения между Web bundles.
