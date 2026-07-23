## Why

`integration-core:preview-compose-plugin` уже собирается как self-contained Wasm web distribution
и принимает полный `PreviewPayload` через direct API или `postMessage`. Однако текущий bridge
является односторонним: host не может определить готовность Wasm runtime, получить
коррелированный `PreviewResult` или отличить завершение актуального render от устаревшего.

Перед подключением плагина к React-клиенту DS Builder требуется законченный browser boundary,
который можно независимо проверить на canonical `BasicButton` payload.

## What Changes

- `preview-compose-plugin` сообщает host о готовности сообщением `sdds.preview.ready`.
- Входящее сообщение `sdds.preview.payload` сохраняет полный `PreviewPayload` без введения patch.
- После обработки payload плагин отправляет `sdds.preview.result` с существующим
  `PreviewResult.Success` или `PreviewResult.Failure` и тем же `requestId`.
- Результат success отправляется после применения подготовленного preview к Compose state, а не
  сразу после передачи JSON в Wasm export.
- Последовательные payload обрабатываются с latest-request-wins семантикой: завершение старого
  запроса не заменяет более новый preview и не подтверждается как результат нового запроса.
- Добавляется canonical полный Button fixture и browser integration test для ready, success,
  failure и повторного render без перезагрузки iframe.
- Browser integration test использует настоящий TTF/OTF asset, проверяет обязательную font
  failure и фиксирует first-render latency.
- Обновляются manifest и README с двусторонним transport contract.
- Существующая Wasm web distribution и zip artifact переиспользуются без нового формата
  поставки.

## Capabilities

### New Capabilities

- `compose-preview-browser-bridge`: двусторонний browser transport между iframe-host и
  Compose/Wasm preview plugin с lifecycle, корреляцией результата и проверяемым Button render.

## Impact

- Затрагивается только included build `integration-core`, модуль `preview-compose-plugin`.
- `preview-contract` и `preview-sdk-compose` используются как существующие зависимости и не
  меняются этим change.
- Публичный Kotlin API, tokens, docs generation и Gradle conventions не меняются.
- Меняется внешний JavaScript/message API HTML shell и структура `payloadBridge` в
  `preview-plugin.json`; эти изменения должны быть описаны в README.
- React host в `design-system-builder/apps/client`, publication pipeline, подпись artifact,
  plugin resolver и production origin allowlist не входят в scope.
- Валидация включает focused JVM/common tests, production Wasm artifact assembly и browser
  integration test собранного artifact.
