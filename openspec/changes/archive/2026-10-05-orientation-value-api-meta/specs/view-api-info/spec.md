## ADDED Requirements

### Requirement: Значения enum без собственных вложенных элементов
Если атрибут с `sdds:api_type="value"` (или `format="enum"`) не содержит собственных `<enum>`, его значения SHALL определяться в порядке приоритета: определение атрибута с тем же именем и `<enum>` в ресурсах модуля, затем встроенный словарь генератора значений framework-enum атрибутов. Собственные `<enum>` атрибута SHALL иметь наивысший приоритет. Встроенный словарь SHALL содержать для `android:orientation` значения `horizontal=0` и `vertical=1`, и ресурсы модуля SHALL NOT дублировать эти значения ради генератора.

Свойство `orientation` SHALL иметь тип `value` у всех компонентов меты и нести значения `horizontal=0` и `vertical=1`.

#### Scenario: Framework-атрибут получает значения из встроенного словаря
- **WHEN** `declare-styleable` компонента содержит `<attr name="android:orientation" sdds:api_type="value" sdds:api_name="orientation" />` без `<enum>`, и в ресурсах модуля определения этого атрибута нет
- **THEN** свойство `orientation` SHALL иметь тип `value` и значения `horizontal=0`, `vertical=1` с `configName`, совпадающим с `name`

#### Scenario: Собственные enum приоритетнее встроенного словаря
- **WHEN** атрибут `android:orientation` в `declare-styleable` содержит собственные `<enum>`
- **THEN** в мету SHALL попасть собственные значения

#### Scenario: Определение в модуле приоритетнее встроенного словаря
- **WHEN** ресурсы модуля определяют `<attr name="android:orientation">` с `<enum>`, а `declare-styleable` ссылается на атрибут без `<enum>`
- **THEN** в мету SHALL попасть значения из определения модуля

#### Scenario: Orientation единообразен у всех компонентов
- **WHEN** мета сгенерирована для uikit
- **THEN** свойства `orientation` у Slider, Tabs, ToolBar, PaginationDots и ScrollBar SHALL иметь тип `value`, и ни одно из них SHALL NOT иметь тип `integer`
