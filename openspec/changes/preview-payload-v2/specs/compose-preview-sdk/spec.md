## MODIFIED Requirements

### Requirement: BasicButton style is built from effective component properties

The `preview-compose-plugin` assembly SHALL provide a hand-written `BasicButtonPreviewStyleFactory` that builds a `ButtonStyle` through the UIKit builder API using effective properties from `PreviewComponent` and prepared theme lookups.

#### Scenario: Button style uses literal and token values
- **WHEN** Button properties contain supported literals and token references for colors, dimensions, typography, shape or primitive builder values
- **THEN** the factory MUST apply resolved values to the matching root, `colors` or `dimensions` builder methods.

#### Scenario: Button style uses interactive values
- **WHEN** a supported Button property contains base value and `states` entries for interaction states
- **THEN** the factory MUST build the corresponding UIKit stateful or interactive value using the resolution rule for state sets
- **AND** entries whose `when` contains an unsupported state name MUST be skipped with an `unknown_state` warning.

#### Scenario: Unknown Button property is ignored
- **WHEN** the payload contains a property that is not supported by `BasicButtonPreviewStyleFactory`
- **THEN** the factory MUST ignore it and allow the builder default to remain in effect.

## ADDED Requirements

### Requirement: SDK разрешает значения Preview Protocol v2

SDK SHALL разрешать source каждого свойства в Compose-значение: применять `alpha` к цвету, превращать gradient token в `Brush`, учитывать `spread` тени и выбирать запись `states` по набору активных состояний. При нескольких подходящих записях SDK MUST выбирать запись с наибольшим числом имён в `when`, а при равенстве последнюю.

#### Scenario: Выбор записи по набору состояний

- **WHEN** активны `pressed` и `selected`, а `states` содержит записи для `["pressed"]` и `["pressed", "selected"]`
- **THEN** SDK MUST использовать запись `["pressed", "selected"]`

#### Scenario: Alpha применён к токену цвета

- **WHEN** source `tokenRef` на цвет содержит `alpha: 0.5`
- **THEN** итоговый Compose `Color` MUST иметь альфа-канал, умноженный на 0.5

#### Scenario: Gradient token

- **WHEN** токен темы имеет тип `gradient` с линейным слоем
- **THEN** SDK MUST подготовить линейный `Brush` с заданными углом и stops

### Requirement: SDK проверяет граф вложенных стилей

Перед построением стиля SDK SHALL проверить все `styleRef` и `assetRef`. SDK MUST вернуть failure с кодом `unknown_style_ref` для отсутствующего стиля, `style_ref_cycle` для цикла и `unknown_asset_ref` для отсутствующего ресурса, и MUST NOT отрисовывать частичный результат.

#### Scenario: Цикл стилей

- **WHEN** стиль прямо или через другие стили ссылается сам на себя
- **THEN** SDK MUST вернуть failure с кодом `style_ref_cycle` и путём к ссылке

#### Scenario: Отсутствующий стиль

- **WHEN** `styleRef` указывает на ключ, которого нет в `styles`
- **THEN** SDK MUST вернуть failure с кодом `unknown_style_ref`

#### Scenario: Ресурс не поддержан для отрисовки

- **WHEN** `assetRef` указывает на SVG либо PNG, а SDK пока не умеет создавать painter
- **THEN** SDK MUST вернуть success с предупреждением `unsupported_asset`
