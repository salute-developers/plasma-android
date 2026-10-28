## 1. Preview contract

- [x] 1.1 Добавить runtime-neutral модели `PreviewAsset`, font-family faces, font style и TTF/OTF asset type в `integration-core:preview-contract`, сохранив русский KDoc публичного API.
- [x] 1.2 Обновить typography token так, чтобы он ссылался на font-family token и содержал font size, line height, letter spacing и weight без Compose-типов.
- [x] 1.3 Зафиксировать сериализуемую форму literal/token-reference и optional interaction-state values для `PreviewComponent.properties`.
- [x] 1.4 Обновить JSON Schemas и positive/negative fixtures для assets, font families, typography и component property values.
- [x] 1.5 Добавить serialization round-trip и schema validation tests для новых contract данных и выполнить focused tests `preview-contract`.

## 2. Sandbox story boundary

- [x] 2.1 Перенести очищенный `ComposeBaseStory` и typed `Content(style, state)` contract в `integration-core:sandbox-core`, добавив только необходимые Compose/UIKit зависимости и публичный KDoc.
- [x] 2.2 Перенести demo lifecycle, state owner и `Story()` rendering wrapper в `integration-core:sandbox-compose`, сохранив поведение `ComponentScaffold` и существующих demo apps.
- [x] 2.3 Обновить sandbox/fixtures imports и Gradle dependencies после переноса story contract без ручного редактирования generated build outputs.
- [x] 2.4 Изменить `sandbox-ksp`, чтобы generated `registerStories()` был public и common-compatible, и обновить processor tests/golden expectations.
- [x] 2.5 Проверить компиляцию `sandbox-core`, `sandbox-compose`, `sandbox-view`, `sandbox-ksp` и `uikit-compose-fixtures` для затронутых Android/common/Wasm variants.

## 3. Preview SDK module and value preparation

- [x] 3.1 Добавить KMP-модуль `integration-core:preview-sdk-compose` с зависимостями на `preview-contract`, `sandbox-core`, Compose и SDDS Compose UIKit и подключить его в `integration-core/settings.gradle.kts`.
- [x] 3.2 Реализовать `PreparedComposeTheme` и typed lookups для colors, dimensions, shapes, shadows, font families и typography.
- [x] 3.3 Реализовать преобразование `#RRGGBBAA` в эквивалентный Compose ARGB `Color`, ordinary dimensions в `Dp`, а typography dimensions в `Sp`, включая unit tests.
- [x] 3.4 Реализовать parsing helpers для literal/token-reference и interaction-state component properties с игнорированием неизвестных token/property IDs.
- [x] 3.5 Добавить русский KDoc для публичных SDK extension points и краткий README с границами MVP.

## 4. Runtime fonts for Wasm

- [x] 4.1 Определить common `PreviewAssetResolver` и кеш bytes по digest либо stable asset identity с in-memory test implementation.
- [x] 4.2 Реализовать `wasmJsMain` создание byte-backed font через `androidx.compose.ui.text.platform.Font` и сборку faces в Compose `FontFamily`.
- [x] 4.3 Реализовать порядок подготовки assets → font families → typography и запретить успешный render до готовности обязательных font faces.
- [x] 4.4 Добавить tests для weight/style mapping, кеширования, отсутствующего/поврежденного font asset и explicit fallback behavior.
Browser-проверка реального TTF/OTF перенесена в change
`complete-compose-preview-browser-bridge`.

## 5. BasicButton vertical slice

- [x] 5.1 Добавить минимальный `ComposePreviewStyleFactory<S>` contract в `preview-sdk-compose`.
- [x] 5.2 Реализовать вручную `BasicButtonPreviewStyleFactory` в `preview-compose-plugin` по `uikit-api-meta.json` для выбранного набора root, colors и dimensions builder properties.
- [x] 5.3 Добавить в Button factory token/literal resolution, typography с runtime font, shape, primitive и interactive/stateful values.
- [x] 5.4 Добавить unit/golden tests, подтверждающие builder mapping и игнорирование неизвестных Button properties.
- [x] 5.5 Реализовать преобразование `PreviewExample.props` в `ButtonUiState` через существующие `PropertiesProducer` и `StateTransformer` с сохранением defaults для неизвестных или несовместимых props.

## 6. Compose/Wasm PoC runtime

- [x] 6.1 Добавить минимальный Wasm browser executable или test fixture, регистрирующий существующие stories через public generated `registerStories()`.
- [x] 6.2 Реализовать типизированный BasicButton render path: JSON payload → prepared theme/fonts → state → `BasicButtonPreviewStyleFactory` → существующий `BasicButtonStory.Content`.
- [x] 6.3 Реализовать принятие следующего полного payload и recomposition style/state без перезапуска Wasm application.
Browser E2E с настоящим font, обязательная font failure и измерение first-render latency перенесены
в change `complete-compose-preview-browser-bridge`.

## 7. Validation

- [x] 7.1 Выполнить focused test/compile tasks для `preview-contract`, sandbox-модулей, `preview-sdk-compose` и Wasm PoC из корня репозитория.
- [x] 7.2 Выполнить focused detekt и Spotless checks затронутых модулей и устранить найденные нарушения без изменения generated файлов вручную.
- [x] 7.3 Проверить существующие Android Compose demo и Android View sandbox consumers на отсутствие регрессий после изменения зависимостей `sandbox-core`.
- [x] 7.4 Сверить реализацию с обновлёнными capability specs и подтвердить, что universal generator, tooling plugin, production trust policy и publication не попали в scope.

## 8. Self-contained plugin artifact

- [x] 8.1 Добавить browser HTTP asset resolver для TTF/OTF bytes и подключить его к `ComposePreviewRuntime`.
- [x] 8.2 Добавить HTML shell и минимальный direct/postMessage payload bridge для запуска Wasm plugin.
- [x] 8.3 Добавить статический plugin manifest и Gradle-задачу production zip со всеми JS/Wasm/resources.
- [x] 8.4 Собрать production artifact, проверить его состав и обновить документацию команды/ограничений.
