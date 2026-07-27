# preview-component-description Specification

## Purpose
TBD - created by archiving change refine-compose-preview-viewport-and-story-properties. Update Purpose after archive.
## Requirements
### Requirement: Preview Protocol описывает поддерживаемые example properties

`integration-core:preview-contract` SHALL предоставлять runtime-neutral
`PreviewComponentDescription` с component/story IDs и ordered property descriptors,
необходимыми host для построения example controls.

#### Scenario: Story поддерживает primitive properties

- **WHEN** story поддерживает string, boolean, int или float property
- **THEN** descriptor MUST содержать stable name, соответствующий type и typed default value.

#### Scenario: Story поддерживает single choice

- **WHEN** property допускает одно значение из ограниченного набора
- **THEN** descriptor MUST иметь type `singleChoice`
- **AND** MUST содержать непустой список variants и default value из этого списка.

### Requirement: Component description возвращается коррелированно

Preview Protocol SHALL предоставлять `PreviewComponentDescriptionResult.Success` и
`PreviewComponentDescriptionResult.Failure`, коррелированные по непустому `requestId`.

#### Scenario: Description успешно построено

- **WHEN** renderer описывает зарегистрированный component
- **THEN** success MUST содержать исходный `requestId` и `PreviewComponentDescription`.

#### Scenario: Component неизвестен renderer

- **WHEN** renderer не может описать запрошенный component ID
- **THEN** failure MUST содержать исходный `requestId`, стабильный code и message.

### Requirement: Component description имеет версионированную schema

Description result SHALL иметь JSON Schema Draft 2020-12 со стабильным `$id`, canonical fixtures
и Kotlin serialization round-trip.

#### Scenario: Canonical description валидируется

- **WHEN** canonical component description сериализуется Kotlin-моделью
- **THEN** JSON MUST пройти schema validation
- **AND** round-trip MUST сохранить property order, types, defaults и variants.

