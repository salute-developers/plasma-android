## ADDED Requirements

### Requirement: Владение adjustment формы через sdds:api_shape_adjustment
`sd_shapeAppearanceAdjustment` объявлен в styleable `SdShape` парно к `sd_shapeAppearance` и в стиле встречается один раз — на все формы компонента. Поэтому shape-свойство SHALL нести признак владения этим атрибутом, задаваемый разметкой `sdds:api_shape_adjustment` со значениями `true`/`false`.

По умолчанию владельцем SHALL быть основной `<prefix>shapeAppearance`; прочие shape-атрибуты (`sd_externalShapeAppearance`, `sd_itemShapeAppearance`, …) adjustment SHALL NOT печатать, пока владение не задано явно. Разметка на свойстве, тип которого не `shape`, SHALL завершать разбор ошибкой.

#### Scenario: Дефолтный владелец — основная форма
- **WHEN** `<attr name="sd_shapeAppearance" sdds:api_name="shape" />` размечен без `sdds:api_shape_adjustment`
- **THEN** свойство SHALL владеть `sd_shapeAppearanceAdjustment`

#### Scenario: Прочие формы adjustment не печатают
- **WHEN** компонент несёт `sd_externalShapeAppearance` и `sd_internalShapeAppearance` без явной разметки
- **THEN** ни одно из этих свойств SHALL NOT владеть `sd_shapeAppearanceAdjustment`

#### Scenario: Владение задаётся явно
- **WHEN** `<attr name="sd_itemSelectorShapeAppearance" sdds:api_name="itemSelectorShape" sdds:api_shape_adjustment="true" />`
- **THEN** adjustment SHALL печататься рядом с этой формой

#### Scenario: Разметка на не-shape свойстве отклоняется
- **WHEN** `sdds:api_shape_adjustment` задан на свойстве типа `dimension`
- **THEN** разбор разметки SHALL завершаться ошибкой

### Requirement: Один атрибут — одна запись в declare-styleable
Атрибут SHALL быть объявлен внутри `declare-styleable` не более одного раза: повторное объявление ловится android lint как `DuplicateDefinition` и делает тему несобираемой. Несколько ключей токен-конфига, проецируемых в один XML-атрибут, SHALL выражаться `sdds:api_state_value` либо нормализацией конфига, а не вторым `<attr>`.

#### Scenario: Дубль атрибута отклоняется
- **WHEN** `declare-styleable` содержит два `<attr>` с одинаковым `name`
- **THEN** `lintDebug` модуля `uikit` SHALL падать с `DuplicateDefinition`, и разметка SHALL исправляться удалением дубля
