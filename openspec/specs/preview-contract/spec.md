# preview-contract Specification

## Purpose

Определяет минимальный renderer-ready Preview Protocol v1 для передачи полностью
вычисленной конфигурации preview между assembler и runtime-neutral renderer.

## Requirements

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
поддерживать color, dimension, shape, shadow, font family и typography без
Android/Compose типов. Font-family value MUST описывать faces через asset ID,
weight и style, а typography MUST ссылаться на font-family token и содержать
числовые font size, line height, letter spacing и weight.

#### Scenario: Palette reference

- **WHEN** исходный token использует palette reference
- **THEN** assembler разрешает reference и payload содержит только normalized value

#### Scenario: Font family references assets

- **WHEN** typography использует пользовательское семейство шрифтов
- **THEN** payload MUST содержать font-family token с face descriptors
- **AND** каждый face MUST ссылаться на font asset по стабильному asset ID

### Requirement: Effective component configuration

Component MUST содержать component ID, выбранные styles по variation axes и
вычисленные properties. Каждое property value MUST различать literal и token
reference и MAY содержать вычисленные interaction-state values. История
adjustments, combinations, dependencies и reuse MUST NOT входить в v1.

#### Scenario: Stateful property

- **WHEN** effective component property имеет значения для interaction states
- **THEN** payload MUST сохранять base value и вычисленные state values, необходимые платформенному renderer

#### Scenario: Literal component property

- **WHEN** effective property получено из literal configuration
- **THEN** payload MUST передать нормализованное literal value без платформенного UI-типа

#### Scenario: Component property references theme token

- **WHEN** effective property использует theme token
- **THEN** payload MUST сохранить token ID, по которому platform SDK получает подготовленное typed value

### Requirement: Runtime example отделён от component

Example MUST иметь стабильный ID и runtime props отдельно от component styles.

#### Scenario: Runtime props are independent

- **WHEN** assembler формирует runtime example
- **THEN** example props MUST передаваться отдельно от effective component configuration

### Requirement: Простой результат request

Host MUST вернуть коррелированный по `requestId` success либо failure. Failure MUST
содержать стабильный code, message и MAY содержать path.

#### Scenario: Failure is correlated

- **WHEN** renderer не может обработать preview request
- **THEN** host MUST вернуть failure с тем же `requestId`, стабильным code и message

### Requirement: Версионированные schemas

Payload и result MUST иметь JSON Schema Draft 2020-12 со стабильными `$id` и
canonical fixtures. Kotlin-модели MUST проходить schema/serialization round trip.

#### Scenario: Schema round trip

- **WHEN** canonical fixture сериализуется и десериализуется Kotlin-моделью
- **THEN** результат MUST соответствовать JSON Schema и сохранять данные payload

### Requirement: Runtime-neutral KMP API

Модуль MUST компилироваться для default KMP targets без Compose, Android UI,
renderer, `sandbox-*` и component-library API. Публичный API MUST иметь русский
KDoc.

#### Scenario: Contract compiles independently

- **WHEN** модуль preview contract собирается для default KMP targets
- **THEN** его production dependencies MUST NOT включать Compose, Android UI, renderer, `sandbox-*` или component-library API

### Requirement: Preview payload describes runtime assets

`PreviewPayload` MUST содержать runtime-neutral descriptors ресурсов, необходимых
renderer, с stable ID, type, URL и optional digest. Preview Protocol v1 SHALL
поддерживать font assets форматов TTF и OTF.

#### Scenario: Font asset is available to renderer

- **WHEN** font-family token содержит face с asset ID
- **THEN** payload MUST содержать ровно один соответствующий font asset descriptor

#### Scenario: Asset has integrity identity

- **WHEN** assembler располагает digest ресурса
- **THEN** descriptor MUST передавать digest для проверки и кеширования renderer
