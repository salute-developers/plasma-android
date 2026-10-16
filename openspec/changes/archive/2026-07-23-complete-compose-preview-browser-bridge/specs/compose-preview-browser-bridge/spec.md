## ADDED Requirements

### Requirement: Compose preview plugin сообщает о готовности browser host

`integration-core:preview-compose-plugin` SHALL отправлять lifecycle message
`sdds.preview.ready` только после готовности Kotlin/Wasm runtime, story registry и Compose
viewport принимать полный `PreviewPayload`.

#### Scenario: Iframe plugin готов к первому payload

- **WHEN** browser host загружает production entrypoint плагина в iframe
- **THEN** plugin MUST отправить parent window сообщение `sdds.preview.ready`
- **AND** сообщение MUST содержать поддерживаемый `protocolVersion`.

### Requirement: Browser bridge возвращает коррелированный PreviewResult

Browser bridge SHALL принимать полный `PreviewPayload` в envelope
`sdds.preview.payload` и возвращать существующий `PreviewResult` в envelope
`sdds.preview.result`.

#### Scenario: Button payload успешно применен

- **WHEN** host отправляет валидный полный BasicButton payload с `requestId`
- **THEN** plugin MUST подготовить theme, style и example state
- **AND** plugin MUST применить подготовленный preview к Compose render state
- **AND** plugin MUST вернуть `PreviewResult.Success` с тем же `requestId`.

#### Scenario: Подготовка payload завершается ошибкой

- **WHEN** валидно коррелируемый payload не может быть декодирован, провалил protocol validation
  или не может быть подготовлен renderer
- **THEN** plugin MUST вернуть `PreviewResult.Failure` с исходным `requestId`, стабильным error
  code и диагностическим message
- **AND** plugin MUST NOT заменять последний успешно подготовленный preview ошибочным state.

#### Scenario: Message отправлен из iframe host

- **WHEN** plugin принял `sdds.preview.payload` через `postMessage`
- **THEN** result MUST быть отправлен в исходный `event.source`
- **AND** bridge MUST использовать исходный `event.origin` как `targetOrigin` ответа.

### Requirement: Direct browser API является асинхронным

HTML shell SHALL предоставлять `submitPreviewPayload(payload)` как Promise-based API, который
завершается соответствующим `PreviewResult`, а не только подтверждает передачу JSON в Kotlin
export.

#### Scenario: Direct caller ожидает render result

- **WHEN** caller вызывает `await submitPreviewPayload(payload)`
- **THEN** Promise MUST завершиться после подготовки и применения актуального preview
- **AND** resolved value MUST быть коррелированным `PreviewResult`.

### Requirement: Последний payload определяет отображаемый preview

Plugin SHALL использовать latest-request-wins семантику для перекрывающихся асинхронных
подготовок полных payload.

#### Scenario: Старый запрос завершается после нового

- **WHEN** plugin принимает второй payload до завершения подготовки первого
- **AND** второй payload становится актуальным
- **THEN** завершение первого payload MUST NOT заменить render state второго
- **AND** первый запрос MUST получить failure с code `superseded`
- **AND** результат второго запроса MUST сохранять его собственный `requestId`.

#### Scenario: Последовательный полный payload обновляет preview

- **WHEN** host отправляет новый полный payload после успешного первого render
- **THEN** plugin MUST заменить theme, effective component properties и example state
- **AND** iframe и Wasm application MUST NOT перезагружаться.

### Requirement: Plugin manifest описывает двусторонний bridge

`preview-plugin.json` SHALL объявлять direct API и message types для payload, ready и result
при сохранении текущего browser entrypoint и Preview Protocol version.

#### Scenario: Host проверяет bridge до загрузки iframe

- **WHEN** host читает manifest production artifact
- **THEN** manifest MUST содержать имена `sdds.preview.payload`, `sdds.preview.ready` и
  `sdds.preview.result`
- **AND** host MUST иметь возможность сопоставить `protocolVersion` manifest с поддерживаемой
  версией Preview Protocol.

### Requirement: Production artifact проходит browser integration test

Change SHALL проверять browser bridge на собранном self-contained production artifact и
canonical полном BasicButton fixture.

#### Scenario: Полный Button lifecycle работает в browser

- **WHEN** integration test обслуживает production artifact по HTTP и загружает его в iframe
- **THEN** test MUST подтвердить ready, коррелированный success и повторный render измененного
  Button без reload iframe
- **AND** test MUST подтвердить коррелированный failure для невалидного payload.

#### Scenario: Настоящий font используется в browser render

- **WHEN** canonical Button payload содержит доступный TTF или OTF asset
- **THEN** plugin MUST загрузить font bytes и подготовить typography с runtime `FontFamily`
- **AND** production browser test MUST завершить Button render с коррелированным success.

#### Scenario: Обязательный font недоступен

- **WHEN** canonical Button payload с `allowFallback=false` ссылается на недоступный font asset
- **THEN** production browser test MUST получить коррелированный failure
- **AND** ошибочный payload MUST NOT заменить последний успешный preview.

#### Scenario: First-render latency измеряется

- **WHEN** production browser test отправляет первый canonical payload
- **THEN** test MUST измерить время до коррелированного success
- **AND** результат и browser/toolchain context MUST быть записаны в документации PoC.
