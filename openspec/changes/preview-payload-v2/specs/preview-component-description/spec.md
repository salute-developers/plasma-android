## MODIFIED Requirements

### Requirement: Component description имеет версионированную schema

Description result SHALL иметь JSON Schema Draft 2020-12 со стабильным `$id`, canonical fixtures
и Kotlin serialization round-trip. Schema и fixtures SHALL находиться в наборе версии 2 вместе
со schemas payload и result, версия 1 MUST быть удалена.

#### Scenario: Canonical description валидируется

- **WHEN** canonical component description сериализуется Kotlin-моделью
- **THEN** JSON MUST пройти schema validation
- **AND** round-trip MUST сохранить property order, types, defaults и variants.
