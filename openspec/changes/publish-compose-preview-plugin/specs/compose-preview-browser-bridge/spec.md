## MODIFIED Requirements

### Requirement: Plugin manifest описывает двусторонний bridge

`preview-plugin.json` SHALL объявлять direct API и message types для payload, ready, render
result, component describe request и component description result при сохранении текущего
browser entrypoint и Preview Protocol version. Manifest дополнительно SHALL идентифицировать
билд полями `version`, `uikitComposeVersion`, `apiMetaSha256` и `commit`, а production artifact
SHALL содержать `api-meta.json`, по которому построены фабрики стилей плагина.

#### Scenario: Host проверяет bridge до загрузки iframe

- **WHEN** host читает manifest production artifact
- **THEN** manifest MUST содержать имена `sdds.preview.payload`, `sdds.preview.ready`,
  `sdds.preview.result`, `sdds.preview.describe` и `sdds.preview.description`
- **AND** host MUST иметь возможность сопоставить `protocolVersion` manifest с поддерживаемой
  версией Preview Protocol.

#### Scenario: Manifest идентифицирует билд

- **WHEN** host читает manifest production artifact
- **THEN** `version` MUST совпадать с идентификатором каталога билда
- **AND** `uikitComposeVersion` MUST совпадать с версией проекта `sdds-core:uikit-compose` из его `gradle.properties`
- **AND** `commit` MUST содержать коммит, из которого собран артефакт.

#### Scenario: Мета в артефакте соответствует sha256

- **WHEN** потребитель вычисляет sha256 файла `api-meta.json` из артефакта
- **THEN** результат MUST совпадать с `apiMetaSha256` manifest
- **AND** `api-meta.json` MUST быть тем же файлом, из которого `generateComposePreview` построил фабрики стилей этого артефакта.
