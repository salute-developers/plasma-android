## REMOVED Requirements

### Requirement: BasicButton style is built from effective component properties

**Reason**: ручная `BasicButtonPreviewStyleFactory` заменяется сгенерированными фабриками для всех компонентов
(`compose-preview-style-generation`).

**Migration**: поведение сохраняется в сгенерированной фабрике `BasicButton`; сценарии про литералы, токены и состояния
покрыты требованиями `compose-preview-style-generation`.

## MODIFIED Requirements

### Requirement: Compose preview reuses sandbox stories

The SDK SHALL select the existing story by `ComponentKey.value` of any registered component, derive state from its default state and runtime example props, and invoke its existing Compose `Content` renderer with the prepared style.

#### Scenario: Registered story is rendered
- **WHEN** `PreviewComponent.id` equals the `ComponentKey.value` of a story registered in the preview registry
- **THEN** the runtime MUST resolve the existing story
- **AND** it MUST render `Content` with the style built by the generated factory with the same `componentId` and the prepared state.

#### Scenario: Unregistered component
- **WHEN** `PreviewComponent.id` is not in the preview registry
- **THEN** the runtime MUST return `PreviewResult.Failure` with code `component_not_found`.

#### Scenario: Runtime props update default state
- **WHEN** `PreviewExample.props` contains supported properties
- **THEN** the runtime MUST apply them through the existing `PropertiesProducer` and `StateTransformer` contracts before rendering.

#### Scenario: Unknown runtime prop is ignored
- **WHEN** `PreviewExample.props` contains an unknown property or a value incompatible with the known property type
- **THEN** the runtime MUST preserve the corresponding default state value and continue rendering.
