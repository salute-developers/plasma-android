## ADDED Requirements

### Requirement: Минимальный renderer-ready payload

Система MUST предоставлять полный `PreviewPayload` с `protocolVersion`,
`requestId`, renderer platform, effective theme values, effective component
configuration и runtime example props. Surface MAY быть передан отдельно.

#### Scenario: Полный render

- **WHEN** assembler формирует preview
- **THEN** renderer получает все необходимые effective values без обращения к
  внутренним моделям DS Builder

### Requirement: Нормализованные theme values

Theme MUST быть отображением token ID в типизированное normalized value. v1 MUST
поддерживать color, dimension, shape, shadow и typography без Android/Compose типов.

#### Scenario: Palette reference

- **WHEN** исходный token использует palette reference
- **THEN** assembler разрешает reference и payload содержит только normalized value

### Requirement: Effective component configuration

Component MUST содержать component ID, выбранные styles по variation axes и
вычисленные properties. Источники properties, adjustments, combinations,
dependencies и reuse MUST NOT входить в v1.

#### Scenario: Stateful property

- **WHEN** assembler выбирает effective state
- **THEN** payload содержит готовое значение property для rendering

### Requirement: Runtime example отделён от component

Example MUST иметь стабильный ID и runtime props отдельно от component styles.

### Requirement: Простой результат request

Host MUST вернуть коррелированный по `requestId` success либо failure. Failure MUST
содержать стабильный code, message и MAY содержать path.

### Requirement: Версионированные schemas

Payload и result MUST иметь JSON Schema Draft 2020-12 со стабильными `$id` и
canonical fixtures. Kotlin-модели MUST проходить schema/serialization round trip.

### Requirement: Runtime-neutral KMP API

Модуль MUST компилироваться для default KMP targets без Compose, Android UI,
renderer, `sandbox-*` и component-library API. Публичный API MUST иметь русский
KDoc.
