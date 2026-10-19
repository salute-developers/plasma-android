## MODIFIED Requirements

### Requirement: Plugin manifest описывает двусторонний bridge

`preview-plugin.json` SHALL объявлять direct API и message types для payload, ready, render
result, component describe request и component description result при сохранении текущего
browser entrypoint и Preview Protocol version.

#### Scenario: Host проверяет bridge до загрузки iframe

- **WHEN** host читает manifest production artifact
- **THEN** manifest MUST содержать имена `sdds.preview.payload`, `sdds.preview.ready`,
  `sdds.preview.result`, `sdds.preview.describe` и `sdds.preview.description`
- **AND** host MUST иметь возможность сопоставить `protocolVersion` manifest с поддерживаемой
  версией Preview Protocol.

## ADDED Requirements

### Requirement: Browser bridge описывает выбранный component

Browser bridge SHALL предоставлять direct и `postMessage` operations для получения
коррелированного `PreviewComponentDescriptionResult` после ready.

#### Scenario: Direct caller запрашивает description

- **WHEN** caller выполняет `await describePreviewComponent("BasicButton")`
- **THEN** Promise MUST завершиться success с description зарегистрированной story.

#### Scenario: Iframe host запрашивает description

- **WHEN** plugin получает `sdds.preview.describe` с `requestId` и component ID
- **THEN** plugin MUST отправить `sdds.preview.description` исходному `event.source`
- **AND** использовать исходный `event.origin` как `targetOrigin`
- **AND** result MUST сохранить `requestId`.

#### Scenario: Describe выполняется во время render

- **WHEN** host запрашивает description параллельно render request
- **THEN** describe MUST NOT участвовать в latest-request-wins render coordination
- **AND** MUST NOT изменить текущий prepared preview.
