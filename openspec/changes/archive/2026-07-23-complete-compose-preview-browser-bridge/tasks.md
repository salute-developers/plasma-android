## 1. `integration-core:preview-compose-plugin` — runtime lifecycle

- [x] 1.1 Изменить Wasm entrypoint так, чтобы обработка полного JSON payload завершалась
  сериализованным `PreviewResult` после suspend preparation и применения актуального Compose
  state.
- [x] 1.2 Добавить внутреннюю корреляцию по `requestId` и generation guard с
  latest-request-wins семантикой для перекрывающихся запросов.
- [x] 1.3 Возвращать стабильный `PreviewResult.Failure` для decode, protocol validation,
  component lookup, asset loading и theme/style preparation errors.
- [x] 1.4 Добавить unit tests для success, failure, последовательной замены payload и
  superseded запроса, не меняя публичный API `preview-contract` и `preview-sdk-compose`.

## 2. `integration-core:preview-compose-plugin` — browser bridge и manifest

- [x] 2.1 Обновить HTML shell: публиковать `sdds.preview.ready` только после готовности Wasm
  runtime и Compose viewport.
- [x] 2.2 Сделать direct `submitPreviewPayload(payload)` Promise-based API, результатом которого
  является соответствующий `PreviewResult`.
- [x] 2.3 Для `sdds.preview.payload` отправлять `sdds.preview.result` обратно в исходный
  `event.source` с исходным `event.origin` как `targetOrigin`.
- [x] 2.4 Валидировать минимальную структуру transport envelope и игнорировать посторонние или
  некоррелируемые сообщения без изменения render state.
- [x] 2.5 Расширить `preview-plugin.json` именами payload, ready и result message types, сохранив
  текущий entrypoint, protocol version и список компонентов.

## 3. `integration-core:preview-compose-plugin` — Button browser fixture

- [x] 3.1 Добавить canonical полный `BasicButton` payload fixture с поддержанными root, color и
  dimension properties, literals, token references, interaction states, typography, shape и
  example props.
- [x] 3.2 Добавить production-artifact browser test, который загружает plugin в iframe,
  дожидается ready и получает success с тем же `requestId`.
- [x] 3.3 Проверить вторым полным payload обновление token/property/example state без reload
  iframe.
- [x] 3.4 Проверить коррелированный failure для невалидного payload и отсутствие применения
  superseded preview при перекрывающихся запросах.
- [x] 3.5 Зафиксировать детерминированный browser-observable признак примененного render state,
  не вводя test-only API в production manifest.
- [x] 3.6 Использовать в canonical fixture настоящий TTF/OTF asset и подтвердить подготовку
  runtime `FontFamily` в production browser render.
- [x] 3.7 Проверить коррелированный failure недоступного обязательного font asset при
  `allowFallback=false` без замены последнего успешного preview.

## 4. Документация и validation

- [x] 4.1 Обновить README примерами direct Promise API, iframe lifecycle, ready/result envelopes,
  request correlation и ограничениями origin policy.
- [x] 4.2 Собрать artifact командой
  `./gradlew -p integration-core :preview-compose-plugin:previewPluginArtifact` и проверить
  наличие HTML, manifest, production JavaScript и всех Wasm resources в zip.
- [x] 4.3 Выполнить focused common/JVM tests и browser integration test
  `preview-compose-plugin` из корня репозитория.
- [x] 4.4 Выполнить focused Detekt и Spotless проверки модуля и устранить нарушения без
  редактирования generated/build artifacts.
- [x] 4.5 Сверить реализацию с capability spec и подтвердить, что React host, backend assembler,
  publication, подпись, plugin resolver, production origin allowlist и новые компоненты не
  попали в scope.
- [x] 4.6 Измерить first-render latency canonical payload, записать browser/toolchain context,
  поддержанные font/property форматы и ограничения byte-backed fonts.
