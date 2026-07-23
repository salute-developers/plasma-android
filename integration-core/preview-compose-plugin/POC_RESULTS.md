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

## Отложенная browser-проверка

Фактическое декодирование реального TTF/OTF в browser Skia, визуальное подтверждение применения
семейства и измерение first-render latency не выполнялись. Эти проверки перенесены в OpenSpec
change `complete-compose-preview-browser-bridge`. До его завершения byte-backed fonts считаются
подтверждёнными на уровне API, unit tests и Wasm compilation, но не browser rendering.

## Известные ограничения

- PoC типизирован только для BasicButton и не является универсальным registry factories.
- WOFF/WOFF2 и variable-font axes не поддерживаются.
- HTML shell предоставляет `submitPreviewPayload(payload)` и принимает сообщения типа
  `sdds.preview.payload`.
- HTTP resolver использует browser `fetch`; внешний asset URL должен быть доступен согласно CORS.
- Artifact не включает publication, подпись и production trust policy.
