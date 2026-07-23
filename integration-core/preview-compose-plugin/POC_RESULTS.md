# Compose Preview Plugin

## Сборка artifact

```bash
./gradlew -p integration-core :preview-compose-plugin:previewPluginArtifact
```

Результат: `preview-compose-plugin/build/distributions/preview-compose-plugin.zip`. Архив содержит
HTML shell, manifest, production JavaScript и все Kotlin/Skiko Wasm binaries.

## Подтверждено

- Wasm executable регистрирует существующие stories через generated `registerStories()`.
- Полный JSON payload декодируется и проходит путь theme preparation → example state →
  `BasicButtonPreviewStyleFactory` → `BasicButtonStory.Content`.
- Общий `ComposePreviewRuntime` связывает story и style factory через `previewComponent(...)`;
  отдельные runtime/renderer/prepared-классы для каждого компонента не требуются.
- Экспортированная `submitPreviewPayload(json)` принимает следующий полный payload и заменяет
  Compose state без перезапуска Wasm application.
- JVM test подтверждает замену `requestId` и `ButtonUiState` последовательными payload.
- Wasm target с byte-backed TTF/OTF factory успешно компилируется на Compose Multiplatform 1.8.2.

## Поддержанные форматы

- Font assets: TTF и OTF, integer weight, normal/italic.
- Font-family fallback: только явный `allowFallback=true`, результат — `FontFamily.Default`.
- BasicButton: поддержанный вручную набор root, color и dimension properties SDK.
- Example props: boolean, int, float, string и single-choice значения sandbox contracts.

## Production browser-проверка

`previewPluginBrowserTest` обслуживает распакованный production zip по HTTP и загружает plugin в
iframe Headless Chrome. Canonical полный `BasicButton` payload использует реальный
`s_b_sans_text_regular.otf`; успешный result подтверждает загрузку bytes, создание runtime
`FontFamily`, подготовку typography и commit Compose render state.

Проверено:

- `sdds.preview.ready` с Preview Protocol v1;
- коррелированные success/failure envelopes и direct Promise API;
- замена token/property/example state вторым полным payload без reload;
- latest-request-wins и `superseded`;
- сохранение последнего успешного preview после invalid payload и недоступного обязательного font.

Контрольный запуск 23 июля 2026: macOS arm64, Node.js 24.4.0, Headless Chrome 150.0.0.0,
Kotlin 2.1.10 / Kotlin-Wasm stdlib 2.1.21, Compose Multiplatform 1.8.2. First-render latency от
отправки canonical payload после ready до коррелированного success составила **6 ms**. Значение
диагностическое и зависит от browser/toolchain/cache; task печатает актуальное значение каждого
запуска.

## Известные ограничения

- PoC типизирован только для BasicButton и не является универсальным registry factories.
- WOFF/WOFF2 и variable-font axes не поддерживаются.
- HTML shell предоставляет Promise-based `submitPreviewPayload(payload)` и двусторонние
  `sdds.preview.payload` / `sdds.preview.result` messages.
- HTTP resolver использует browser `fetch`; внешний asset URL должен быть доступен согласно CORS.
- Byte-backed fonts поддерживают TTF/OTF, integer weight и normal/italic; WOFF/WOFF2,
  variable-font axes и проверка glyph rasterization не входят в PoC.
- Artifact не включает publication, подпись и production trust policy.
