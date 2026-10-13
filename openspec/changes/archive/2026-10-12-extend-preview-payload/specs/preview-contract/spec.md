## MODIFIED Requirements

### Requirement: Нормализованные theme values

Theme MUST быть отображением token ID в типизированное normalized value. v1 MUST
поддерживать color, dimension, shape, shadow, gradient, font family и typography без
Android/Compose типов. Слой shadow MUST содержать `x`, `y`, `blur`, `spread` и `color`.
Gradient MUST содержать слои `{kind: "linear", angle, stops}`, где `angle` задан в градусах по соглашению CSS (0° снизу вверх, 90° слева направо), а `stops` включает не менее
двух элементов `{color, position}`. Font-family value MUST описывать faces через asset ID,
weight и style, а typography MUST ссылаться на font-family token и содержать
числовые font size, line height, letter spacing и weight.

#### Scenario: Palette reference

- **WHEN** исходный token использует palette reference
- **THEN** assembler разрешает reference и payload содержит только normalized value

#### Scenario: Font family references assets

- **WHEN** typography использует пользовательское семейство шрифтов
- **THEN** payload MUST содержать font-family token с face descriptors
- **AND** каждый face MUST ссылаться на font asset по стабильному asset ID

#### Scenario: Shadow со spread

- **WHEN** shadow token содержит слой с растяжением
- **THEN** слой MUST передавать `spread` числом, в том числе отрицательным

#### Scenario: Gradient token

- **WHEN** тема содержит gradient token с линейным слоем и двумя stops
- **THEN** payload MUST пройти schema validation и Kotlin round trip

### Requirement: Effective component configuration

Component MUST содержать component ID, выбранные styles по variation axes и
вычисленные properties. Каждое property value MUST содержать `base` и упорядоченный массив
`states` из записей `{when, source}`, где `when` это непустой набор уникальных имён состояний.
Source MUST быть `literal`, `tokenRef`, `styleRef` или `assetRef`; `literal` и `tokenRef`
MAY содержать `alpha` от 0 до 1. Вложенные стили MUST передаваться словарём верхнего уровня
`styles`. История adjustments, combinations и reuse MUST NOT входить в v1.

#### Scenario: Stateful property

- **WHEN** effective component property имеет значения для состояний
- **THEN** payload MUST сохранять base value и записи `states` в порядке, необходимом платформенному renderer

#### Scenario: Составное состояние

- **WHEN** значение зависит от одновременно активных состояний `pressed` и `selected`
- **THEN** payload MUST содержать запись с `when: ["pressed", "selected"]`

#### Scenario: Literal component property

- **WHEN** effective property получено из literal configuration
- **THEN** payload MUST передать нормализованное literal value без платформенного UI-типа

#### Scenario: Component property references theme token

- **WHEN** effective property использует theme token
- **THEN** payload MUST сохранить token ID, по которому platform SDK получает подготовленное typed value

#### Scenario: Component property references nested style

- **WHEN** property ссылается на стиль вложенного компонента
- **THEN** payload MUST содержать `styleRef` и соответствующую запись в `styles`

### Requirement: Простой результат request

Host MUST вернуть коррелированный по `requestId` success либо failure. Failure MUST
содержать стабильный code, message и MAY содержать path. Success MAY содержать массив
`warnings` из элементов `{code, message, path?}`.

#### Scenario: Failure is correlated

- **WHEN** renderer не может обработать preview request
- **THEN** host MUST вернуть failure с тем же `requestId`, стабильным code и message

#### Scenario: Success с предупреждением

- **WHEN** renderer пропустил необязательную часть payload, например запись с неизвестным состоянием
- **THEN** host MUST вернуть success с тем же `requestId` и `warnings`, не меняя статус на failure

### Requirement: Версионированные schemas

Payload и result MUST иметь JSON Schema Draft 2020-12 со стабильными `$id` и
canonical fixtures. Kotlin-модели MUST проходить schema/serialization round trip.
Schema payload и общие фикстуры `valid` и `invalid` MUST быть побайтово идентичны каноническим
файлам в DS Builder (`backend-kt/preview/contract/schemas/v1`), расхождение MUST обнаруживаться
проверкой.

#### Scenario: Schema round trip

- **WHEN** canonical fixture сериализуется и десериализуется Kotlin-моделью
- **THEN** результат MUST соответствовать JSON Schema и сохранять данные payload

#### Scenario: Общие фикстуры

- **WHEN** тест контракта валидирует общие фикстуры
- **THEN** все `valid` MUST проходить schema validation, а все `invalid` MUST не проходить

#### Scenario: Копия схемы разошлась с канонической

- **WHEN** файл схемы или фикстуры отличается от канонического
- **THEN** проверка MUST завершиться ошибкой с именем файла

### Requirement: Preview payload describes runtime assets

`PreviewPayload` MUST содержать runtime-neutral descriptors ресурсов, необходимых
renderer, с stable ID, type, URL и optional digest. Preview Protocol v1 SHALL
поддерживать font assets форматов TTF и OTF и image assets форматов SVG и PNG.

#### Scenario: Font asset is available to renderer

- **WHEN** font-family token содержит face с asset ID
- **THEN** payload MUST содержать ровно один соответствующий font asset descriptor

#### Scenario: Asset has integrity identity

- **WHEN** assembler располагает digest ресурса
- **THEN** descriptor MUST передавать digest для проверки и кеширования renderer

#### Scenario: Image asset

- **WHEN** свойство ссылается через `assetRef` на иконку
- **THEN** payload MUST содержать asset типа SVG либо PNG с этим ID
