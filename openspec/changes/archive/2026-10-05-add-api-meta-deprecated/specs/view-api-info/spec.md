## ADDED Requirements

### Requirement: Пометка устаревшего свойства через sdds:api_deprecated
Словарь `sdds` SHALL содержать атрибут `sdds:api_deprecated`, значением которого является сообщение об устаревании. Наличие атрибута на `<attr>` внутри размеченного `declare-styleable` SHALL означать, что свойство устарело; значение SHALL NOT проверяться на непустоту, и пустое значение SHALL NOT быть ошибкой разметки. Пометка SHALL относиться только к тому `<attr>`, на котором стоит, и SHALL NOT распространяться на другие `<attr>` с тем же `id`.

#### Scenario: Атрибут с сообщением помечается устаревшим
- **WHEN** `<attr name="sd_textColor" sdds:api_deprecated="Use android:textColor" />` находится в размеченном `declare-styleable`
- **THEN** свойство `sd_textColor` SHALL иметь в мете `deprecated.message == "Use android:textColor"`

#### Scenario: Пустое значение допустимо
- **WHEN** на `<attr>` стоит `sdds:api_deprecated=""`
- **THEN** парсер SHALL NOT завершаться ошибкой, и свойство SHALL иметь `deprecated.message == ""`

#### Scenario: Пометка не распространяется на атрибуты с тем же id
- **WHEN** `sd_textColor` помечен `sdds:api_deprecated`, а `android:textColor` с тем же `id` `textColor` не помечен
- **THEN** `deprecated` SHALL присутствовать только у записи `sd_textColor`

#### Scenario: Свойство без разметки не получает deprecated
- **WHEN** на `<attr>` нет `sdds:api_deprecated`
- **THEN** поле `deprecated` SHALL отсутствовать в JSON этого свойства
