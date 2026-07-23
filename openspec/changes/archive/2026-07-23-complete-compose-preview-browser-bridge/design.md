## Context

`preview-sdk-compose` change уже реализовал полный путь
`PreviewPayload -> PreparedComposeTheme -> BasicButtonPreviewStyleFactory -> BasicButtonStory`
и self-contained Wasm distribution. HTML shell предоставляет `submitPreviewPayload(payload)` и
принимает `sdds.preview.payload`, но вызов Kotlin export запускает coroutine и немедленно
возвращается. Ошибка отображается внутри viewport, а host не получает `PreviewResult`.

`preview-contract` уже определяет коррелированные `PreviewResult.Success` и
`PreviewResult.Failure`. Новый transport contract должен переиспользовать эти модели, не
добавляя вторую модель результата и не перенося browser lifecycle в platform-neutral contract.

## Goals / Non-Goals

**Goals:**

- Сделать bridge между iframe-host и Compose/Wasm plugin двусторонним.
- Дать host детерминированные сигналы готовности и результата обработки полного payload.
- Коррелировать каждый результат по `requestId`.
- Не допустить замены актуального preview результатом более медленного старого запроса.
- Проверить browser boundary собранного production artifact на полном `BasicButton` fixture.
- Подтвердить реальное декодирование TTF/OTF в browser Skia и измерить first-render latency.

**Non-Goals:**

- Интеграция iframe в React-клиент DS Builder.
- Формирование payload из backend-модели.
- Изменение `PreviewPayload`, `PreviewResult` или JSON Schema Preview Protocol v1.
- Patch transport, streaming и передача событий взаимодействия пользователя.
- Publication, каталог плагинов, подпись, trust policy и production origin allowlist.
- Добавление новых компонентов или генерация style factories.
- Изменение формата self-contained zip distribution.

## Decisions

### 1. Browser transport использует отдельные envelopes

Transport messages оборачивают существующие contract payload/result:

```json
{
  "type": "sdds.preview.payload",
  "payload": {
    "protocolVersion": 1,
    "requestId": "button-1"
  }
}
```

```json
{
  "type": "sdds.preview.result",
  "result": {
    "type": "success",
    "requestId": "button-1"
  }
}
```

Lifecycle message не относится к конкретному render:

```json
{
  "type": "sdds.preview.ready",
  "protocolVersion": 1
}
```

Envelopes остаются browser API плагина и не добавляются в `preview-contract`. Поля `payload` и
`result` сериализуются существующим `PreviewContractJson`.

### 2. Kotlin/Wasm entrypoint возвращает результат асинхронно

`submitPreviewPayload` не считается подтверждением render. Kotlin/Wasm слой выполняет
deserialize и suspend preparation, обновляет Compose state и передает сериализованный
`PreviewResult` browser bridge callback-ом.

HTML shell маршрутизирует результат:

- direct caller получает Promise, завершенный соответствующим `PreviewResult`;
- iframe sender получает `sdds.preview.result` в тот же `event.source`;
- ответ отправляется с `event.origin` как `targetOrigin`, а не широковещательно.

Malformed transport envelope, из которого невозможно извлечь `requestId`, игнорируется и не
создает некоррелированный result. Валидный payload, завершившийся ошибкой decode, validation,
asset loading или preparation, возвращает `PreviewResult.Failure`.

### 3. Ready означает готовность принимать payload

`sdds.preview.ready` отправляется только после загрузки Kotlin/Wasm module, инициализации
runtime/story registry и запуска Compose viewport. Host не должен использовать задержку или
наличие iframe `load` как доказательство готовности Wasm export.

Для первого iframe-host ready отправляется parent window. Сообщение не содержит данных проекта
или темы. Production handshake и allowlist origins проектируются вместе с trust policy
отдельным change.

### 4. Последовательные payload используют latest-request-wins

Каждому принятому payload назначается внутреннее монотонное поколение. Подготовленный preview
применяется к state, только если его поколение остается актуальным. Завершение старого запроса:

- не заменяет актуальный preview;
- возвращает failure с отдельным стабильным code `superseded` для исходного `requestId`;
- не изменяет результат более нового запроса.

Это необходимо, поскольку font/assets preparation является suspend и изменения редактора могут
приходить быстрее завершения предыдущей подготовки.

### 5. Browser test использует production distribution

Integration test поднимает статический HTTP server над содержимым production artifact и
управляет iframe из отдельной host page. Он проверяет реальный HTML shell, JS loader и Wasm
binaries, а не вызывает `ComposePreviewRuntime` напрямую.

Canonical Button fixture содержит поддержанные root, color и dimension properties, token
references, interaction-state values, typography, shape и example props. Проверка включает:

- получение ready;
- success с исходным `requestId`;
- изменение token/property/example props вторым полным payload без reload iframe;
- failure для невалидного payload;
- отсутствие применения superseded preview при перекрывающихся запросах.

Проверка использует настоящий TTF/OTF asset и подтверждает, что подготовленная typography
содержит загруженный runtime font, а Compose viewport завершает успешный render. Pixel-perfect
сравнение glyph rasterization не требуется: browser test использует детерминированный
browser-observable признак применённого render state. Отдельно проверяется failure обязательного
font asset и измеряется время от отправки первого payload до success/result.

### 6. Manifest описывает полный bridge

`preview-plugin.json` сохраняет текущие `schemaVersion`, plugin `id`, `platform`,
`protocolVersion`, `entrypoint` и supported components. `payloadBridge` дополнительно фиксирует
direct API и все message types:

```json
{
  "direct": "submitPreviewPayload",
  "payloadMessageType": "sdds.preview.payload",
  "readyMessageType": "sdds.preview.ready",
  "resultMessageType": "sdds.preview.result"
}
```

Host может проверить manifest до загрузки iframe. Отдельная версия transport не вводится:
совместимость определяется `schemaVersion` manifest и `protocolVersion`.

## Risks / Trade-offs

- [Compose state применен, но browser еще не выполнил paint] -> Success означает успешную
  подготовку и commit нового Compose render state; pixel-level paint readiness не обещается.
- [Медленная загрузка font assets меняет порядок завершения requests] -> Generation guard
  обеспечивает latest-request-wins и отдельный `superseded` result.
- [Ready отправляется parent без production allowlist] -> Сообщение не содержит project data;
  trust/origin handshake остается обязательным отдельным change перед production deployment.
- [Browser E2E может зависеть от локального toolchain/browser] -> Тест запускается над production
  artifact одной документированной Gradle-задачей и отделяется от быстрых common/JVM unit tests.

## Migration Plan

1. Добавить внутренний bridge callback и generation guard в Wasm entrypoint.
2. Обновить HTML shell для Promise-based direct API и двустороннего `postMessage`.
3. Расширить manifest описанием ready/result messages.
4. Добавить canonical Button fixture и browser host test.
5. Обновить README и пересобрать self-contained zip.

Rollback возвращает односторонний bridge без изменения `preview-contract`,
`preview-sdk-compose`, Button factory или формата artifact.
