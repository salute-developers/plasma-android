## MODIFIED Requirements

### Requirement: Нормализованные theme values

Theme MUST быть отображением token ID в типизированное normalized value. v1 MUST поддерживать color, dimension, shape, shadow, font family и typography без Android/Compose типов. Font-family value MUST описывать faces через asset ID, weight и style, а typography MUST ссылаться на font-family token и содержать числовые font size, line height, letter spacing и weight.

#### Scenario: Palette reference

- **WHEN** исходный token использует palette reference
- **THEN** assembler разрешает reference и payload содержит только normalized value

#### Scenario: Font family references assets

- **WHEN** typography использует пользовательское семейство шрифтов
- **THEN** payload MUST содержать font-family token с face descriptors
- **AND** каждый face MUST ссылаться на font asset по стабильному asset ID.

### Requirement: Effective component configuration

Component MUST содержать component ID, выбранные styles по variation axes и вычисленные properties. Каждое property value MUST различать literal и token reference и MAY содержать вычисленные interaction-state values. История adjustments, combinations, dependencies и reuse MUST NOT входить в v1.

#### Scenario: Stateful property

- **WHEN** effective component property имеет значения для interaction states
- **THEN** payload MUST сохранять base value и вычисленные state values, необходимые платформенному renderer

#### Scenario: Literal component property

- **WHEN** effective property получено из literal configuration
- **THEN** payload MUST передать нормализованное literal value без платформенного UI-типа.

#### Scenario: Component property references theme token

- **WHEN** effective property использует theme token
- **THEN** payload MUST сохранить token ID, по которому platform SDK получает подготовленное typed value.

## ADDED Requirements

### Requirement: Preview payload describes runtime assets

`PreviewPayload` MUST содержать runtime-neutral descriptors ресурсов, необходимых renderer, с stable ID, type, URL и optional digest. Preview Protocol v1 SHALL поддерживать font assets форматов TTF и OTF.

#### Scenario: Font asset is available to renderer
- **WHEN** font-family token содержит face с asset ID
- **THEN** payload MUST содержать ровно один соответствующий font asset descriptor.

#### Scenario: Asset has integrity identity
- **WHEN** assembler располагает digest ресурса
- **THEN** descriptor MUST передавать digest для проверки и кеширования renderer.
