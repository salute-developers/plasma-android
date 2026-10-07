## ADDED Requirements

### Requirement: Поле deprecated в модели свойства View
Модель `PropertyMeta` (producer в `build-system/conventions` и consumer в `plugin_theme_builder`) SHALL содержать необязательное поле `deprecated` — объект с единственным полем `message`. У свойств без разметки `sdds:api_deprecated` поле SHALL быть `null` и SHALL NOT сериализоваться в `uikit-api-meta.json`. Consumer SHALL читать JSON с этим полем и без него.

#### Scenario: Deprecated сериализуется у размеченного свойства
- **WHEN** свойство помечено `sdds:api_deprecated`
- **THEN** его запись в `uikit-api-meta.json` SHALL содержать `"deprecated": { "message": ... }`

#### Scenario: Формат не-deprecated свойств не меняется
- **WHEN** ни одно свойство не помечено
- **THEN** сгенерированный `uikit-api-meta.json` SHALL быть идентичен выводу до этого change

#### Scenario: Consumer читает мету с deprecated
- **WHEN** `UikitApiMetaTask` читает JSON, где у части свойств есть `deprecated`
- **THEN** он SHALL десериализовать его без ошибки и сохранить `deprecated` в выходном файле

### Requirement: Генератор View пропускает deprecated-свойства
Универсальный View-генератор SHALL NOT эмитить `<item>`, ресурсы и значения состояний для свойств с заполненным `deprecated`; фильтрация SHALL выполняться по записи свойства (`attrName`), так что незамеченные записи с тем же `id` продолжают генерироваться. Если все записи `id` устарели, свойство SHALL отсутствовать в выводе без ошибки генерации.

#### Scenario: Помеченный атрибут не эмитится
- **WHEN** `sd_textColor` помечен как deprecated, а `android:textColor` нет, и конфиг задаёт `textColor`
- **THEN** стиль SHALL содержать `<item name="android:textColor">` и SHALL NOT содержать `<item name="sd_textColor">`

#### Scenario: Все записи id устарели
- **WHEN** все записи с `id` `size` помечены deprecated
- **THEN** генерация SHALL завершиться без ошибки, и стиль SHALL NOT содержать items для `size`
