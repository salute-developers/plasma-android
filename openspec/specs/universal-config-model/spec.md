## ADDED Requirements

### Requirement: UniversalComponentConfig хранит свойства вариации как JsonObject
`UniversalComponentConfig` SHALL представлять собой универсальную модель конфига компонента, хранящую свойства каждой вариации в виде `JsonObject` (kotlinx.serialization). Класс SHALL реализовывать интерфейс `Config<UniversalPropertyOwner>`, где `UniversalPropertyOwner` предоставляет доступ к значению свойства по id из `PropertyMeta`.

#### Scenario: Получение значения свойства по id из PropertyMeta
- **WHEN** вызывается `UniversalPropertyOwner.getValue(meta: PropertyMeta)` где `meta.id` соответствует ключу в `JsonObject`
- **THEN** возвращается типизированное значение `Stateful<*, *>`, декодированное из `JsonElement` по типу из `PropertyMeta`

#### Scenario: Отсутствующее свойство в конфиге вариации
- **WHEN** вызывается `UniversalPropertyOwner.getValue(meta: PropertyMeta)` где `meta.id` отсутствует в `JsonObject`
- **THEN** возвращается `null`

### Requirement: UniversalComponentConfig парсится из JSON без компонент-специфичных классов
`UniversalComponentConfig` SHALL десериализоваться из стандартного JSON-конфига компонента без наличия компонент-специфичного `*Properties`-класса.

#### Scenario: Парсинг конфига компонента
- **WHEN** JSON-конфиг компонента десериализуется в `UniversalComponentConfig`
- **THEN** корневые свойства и свойства каждой вариации доступны через `UniversalPropertyOwner.getValue(meta)`

#### Scenario: Merge свойств родительской вариации с дочерней
- **WHEN** вызывается `UniversalPropertyOwner.merge(parent: PropertyOwner)`
- **THEN** возвращается новый `UniversalPropertyOwner`, в котором свойства дочерней вариации имеют приоритет над свойствами родительской

### Requirement: Поддержка всех типов PropertyMeta при декодировании
`UniversalPropertyOwner.getValue` SHALL корректно декодировать значение для каждого из поддерживаемых типов `PropertyMeta`: `ColorPropertyMeta`, `DimensionPropertyMeta`, `TypographyPropertyMeta`, `ShapePropertyMeta`, `ShadowPropertyMeta`, `BooleanPropertyMeta`, `IntegerPropertyMeta`, `FloatPropertyMeta`, `IconPropertyMeta`, `ComponentPropertyMeta`, `ValuePropertyMeta`.

#### Scenario: Декодирование Color свойства
- **WHEN** `getValue` вызывается с `ColorPropertyMeta` и соответствующий `JsonElement` представляет `SolidColor` или `Gradient`
- **THEN** возвращается `Color` (SolidColor или Gradient) со всеми состояниями

#### Scenario: Декодирование Dimension свойства
- **WHEN** `getValue` вызывается с `DimensionPropertyMeta` и соответствующий `JsonElement` представляет `Dimension`
- **THEN** возвращается `Dimension` с корректным значением и состояниями

#### Scenario: Декодирование ComponentStyle свойства
- **WHEN** `getValue` вызывается с `ComponentPropertyMeta` и соответствующий `JsonElement` представляет ссылку на стиль компонента
- **THEN** возвращается `ComponentStyle<UniversalPropertyOwner>` с корректным значением
