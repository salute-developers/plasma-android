## Why

DS Builder должен отображать изменения темы и конфигурации компонентов настоящими Compose-компонентами без пересборки клиента или preview plugin. Для первого проверяемого vertical slice нужен Compose/Wasm SDK, который переиспользует существующие sandbox stories, динамически собирает стиль `BasicButton` из effective payload и загружает реальные шрифты во время выполнения.

## What Changes

- Добавляется KMP-модуль `integration-core:preview-sdk-compose` с преобразованием renderer-ready `PreviewPayload` в Compose theme, state и style для выполнения в `wasmJs`.
- `preview-contract` расширяется минимальными font-family и asset descriptors, необходимыми для загрузки настоящих `.ttf`/`.otf` шрифтов до render.
- Для component properties фиксируется минимальная форма literal/token reference и поддержка stateful values, достаточная для ручной сборки `BasicButtonStyle`.
- Compose-facing контракт story переносится в `integration-core:sandbox-core`; `integration-core:sandbox-compose` остается UI-обвязкой demo-приложений.
- Существующие `ComponentKey`, `StoryRegistry`, `PropertiesProducer` и `StateTransformer` переиспользуются; generated `registerStories()` становится доступен preview assembly.
- В `integration-core:preview-compose-plugin` добавляется ручной `BasicButtonPreviewStyleFactory` как PoC динамической сборки style через UIKit builder API; `uikit-api-meta.json` используется как основание для будущей, но не входящей в change, генерации.
- Добавляется минимальный Compose/Wasm PoC, проверяющий загрузку font bytes, построение `FontFamily`, подготовку theme, применение props и render `BasicButton` из полного payload.
- Добавляется self-contained browser distribution с HTML shell, plugin manifest, HTTP asset resolver, минимальным payload bridge и воспроизводимым zip artifact.
- Универсальный generator style factories, tooling Gradle plugin, production trust policy/resolver service и публикация artifacts не входят в scope.

## Capabilities

### New Capabilities

- `compose-preview-sdk`: Подготовка Compose theme с runtime fonts, динамическая сборка `BasicButtonStyle`, преобразование example props и rendering существующей sandbox story в Compose/Wasm.

### Modified Capabilities

- `preview-contract`: Добавление runtime-neutral font families, font asset descriptors и минимальной структуры effective component property values.
- `sandbox-compose-multiplatform`: Перенос минимального Compose story renderer API в `sandbox-core` и публичная common-compatible регистрация stories без включения demo UI в preview runtime.

## Impact

- Затрагиваются included build `integration-core` и модули `preview-contract`, `sandbox-core`, `sandbox-compose`, `sandbox-ksp`, а также новый `preview-sdk-compose` и PoC Wasm assembly/test fixture.
- Меняется публичный KMP API `preview-contract`; schemas, fixtures и KDoc должны быть обновлены совместно.
- Публичная story API меняет расположение между sandbox-модулями, при этом существующие Compose fixtures и demo consumers должны сохранить source compatibility через обновленные imports/зависимости.
- `sandbox-core` получает Compose-facing зависимости; Android View и существующие Compose sandbox consumers должны продолжить компилироваться.
- Tokens, документационный generator и Gradle conventions не меняются.
- Валидация охватывает contract schema/serialization tests, sandbox KMP targets, `preview-sdk-compose` common/wasm tests и браузерный render PoC с реальным font asset.
