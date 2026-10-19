## ADDED Requirements

### Requirement: Compose Preview SDK строит descriptor из story contracts

`integration-core:preview-sdk-compose` SHALL строить `PreviewComponentDescription` из
зарегистрированной `ComposeBaseStory`, её `defaultState` и `PropertiesProducer`.

#### Scenario: Sandbox property преобразуется в descriptor

- **WHEN** `propertiesProducer.getProperties(defaultState)` возвращает поддержанный
  `Property` subtype
- **THEN** SDK MUST сохранить property name, type, default value и single-choice variants.

#### Scenario: Property выключено

- **WHEN** sandbox property имеет `enabled=false`
- **THEN** SDK MUST исключить его из published description.

#### Scenario: Property является framework variation

- **WHEN** property name равно `variant` или `appearance`
- **THEN** SDK MUST исключить его из example description
- **AND** variation selection MUST оставаться ответственностью `PreviewComponent.variations`.

### Requirement: Runtime описывает зарегистрированный component без render

`ComposePreviewRuntime` SHALL возвращать component description независимо от текущего
`PreviewPayload` и SHALL NOT изменять render state.

#### Scenario: BasicButton description запрошено после ready

- **WHEN** runtime получает describe request для `BasicButton`
- **THEN** result MUST содержать descriptors `label`, `value`, `icon`, `spacing`,
  `hasFixedWidth`, `enabled`, `loading` в producer order.

#### Scenario: Unknown component description запрошено

- **WHEN** component ID отсутствует в runtime registry
- **THEN** runtime MUST вернуть failure с code `unknown_component`.

#### Scenario: Property names дублируются

- **WHEN** producer возвращает несколько properties с одинаковым name
- **THEN** component description MUST завершиться validation failure
- **AND** runtime MUST NOT публиковать неоднозначную schema.
