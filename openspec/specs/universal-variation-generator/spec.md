## ADDED Requirements

### Requirement: UniversalComposeVariationGenerator не требует наследования для новых компонентов
`UniversalComposeVariationGenerator` SHALL быть финальным классом (не абстрактным), принимающим через конструктор `ComponentMeta`, экземпляры всех `PropertyMapper`-ов и стандартные зависимости генератора. Новый компонент SHALL подключаться к генератору исключительно через конфигурацию и метаданные, без написания подкласса.

#### Scenario: Регистрация нового компонента без написания подкласса
- **WHEN** в фабрике плагина создаётся `UniversalComposeVariationGenerator` с `ComponentMeta` нового компонента и соответствующим `UniversalComponentConfig`
- **THEN** генератор производит корректный файл стилей Compose без какого-либо компонент-специфичного кода

### Requirement: Генератор итерирует по ComponentMeta.params и делегирует маппинг PropertyMapper-ам
Для каждой вариации `UniversalComposeVariationGenerator` SHALL итерировать по `ComponentMeta.params`, для каждого `PropertyMeta` получать значение из `UniversalPropertyOwner`, находить подходящий `PropertyMapper` по типу `PropertyMeta` и вызывать `PropertyMapper.map()` для получения строки с вызовом билдера.

#### Scenario: Маппинг Color свойства в вызов билдера
- **WHEN** `ComponentMeta.params` содержит `ColorPropertyMeta` с id `backgroundColor` и в `UniversalPropertyOwner` для этого id есть `SolidColor`
- **THEN** `ColorPropertyMapper.map()` вызывается и результирующая строка добавляется в тело билдера стиля

#### Scenario: Пропуск отсутствующего свойства
- **WHEN** `UniversalPropertyOwner.getValue(meta)` возвращает `null` для некоторого `PropertyMeta`
- **THEN** данный `PropertyMeta` пропускается и в файл стиля не добавляется соответствующий вызов билдера

#### Scenario: Маппинг всех типов свойств
- **WHEN** `ComponentMeta.params` содержит `PropertyMeta` всех поддерживаемых типов
- **THEN** для каждого типа вызывается соответствующий `PropertyMapper`, и все вызовы добавляются в тело билдера

### Requirement: Сгенерированный код семантически эквивалентен коду от компонент-специфичного генератора
После миграции компонента на `UniversalComposeVariationGenerator` сгенерированный `*Styles.kt` файл SHALL быть семантически эквивалентен файлу, который ранее производил компонент-специфичный генератор. Генератор НЕ воспроизводит вызовы, жёстко закодированные в старом генераторе как дефолты (напр., `singleLine(false)` для TextArea), если соответствующее свойство отсутствует в JSON-конфиге.

#### Scenario: Сравнение сгенерированных файлов для мигрированного компонента
- **WHEN** компонент переведён с `*ComposeVariationGenerator` на `UniversalComposeVariationGenerator`
- **THEN** сгенерированный файл отличается только отсутствием вызовов, которые в старом генераторе были закодированы как дефолт (не через конфиг), а не через данные конфига

#### Scenario: Отсутствие дефолтных вызовов, не присутствующих в конфиге
- **WHEN** компонент-специфичный генератор генерировал вызов (`singleLine(false)`, `fieldType(Optional)`) как жёстко закодированный дефолт
- **THEN** универсальный генератор НЕ генерирует этот вызов, если соответствующего свойства нет в конфиге вариации; runtime-поведение при этом идентично, поскольку дефолтное значение билдера совпадает

### Requirement: Имя класса билдера выводится из `ComponentMeta.qualifiedName`
`UniversalComposeVariationGenerator` SHALL выводить простое имя класса билдера стиля (`styleBuilderName`) из `ComponentMeta.qualifiedName` (последний сегмент после точки), а не из `componentName`. Это обеспечивает корректный импорт и тип для компонентов, использующих общий билдер с другим именем (напр., `TextArea` использует `TextFieldStyleBuilder`).

#### Scenario: Компоненты с общим билдером стиля
- **WHEN** `ComponentMeta` имеет `componentName = "TextArea"` и `qualifiedName = "...TextFieldStyleBuilder"`
- **THEN** генератор использует `TextFieldStyleBuilder` в качестве типа билдера в сгенерированном файле стилей

### Requirement: Генератор поддерживает группировку вызовов билдера по PropertyMeta.group
`UniversalComposeVariationGenerator` SHALL группировать вызовы билдера по значению поля `group` из `PropertyMeta`. Свойства с одинаковым `group` SHALL оборачиваться в соответствующий блок билдера (напр., `.colors { }`, `.dimensions { }`).

#### Scenario: Группировка цветовых свойств в блок .colors
- **WHEN** несколько `PropertyMeta` имеют `group = "colors"`
- **THEN** соответствующие вызовы оборачиваются в единый блок `.colors { ... }`

#### Scenario: Свойства без группировки остаются плоскими вызовами
- **WHEN** `PropertyMeta.group` пуст или равен значению "root"
- **THEN** вызов добавляется напрямую в тело билдера без обёртки
