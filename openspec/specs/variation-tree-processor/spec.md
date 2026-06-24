## ADDED Requirements

### Requirement: VariationTreeProcessor инкапсулирует рекурсивный обход дерева вариаций
`VariationTreeProcessor` SHALL инкапсулировать всю логику рекурсивного обхода дерева вариаций (эквивалент `createVariation`, `addVariationExtension`, `addViewExtensions`, `getOrGenerateWrapper`, `addInvariantPropsVal` из `ComposeVariationGenerator`). Генератор SHALL передавать в процессор только коллбэк `propsToBuilderCalls: (variationNode, variationId) -> List<String>`.

#### Scenario: Обход дерева вариаций через коллбэк
- **WHEN** `VariationTreeProcessor.process(config, propsCallback)` вызывается с конфигом компонента и коллбэком маппинга свойств
- **THEN** процессор рекурсивно обходит все вариации и для каждой вызывает коллбэк для получения вызовов билдера

#### Scenario: Генерация wrapper-классов и extension-функций
- **WHEN** `VariationTreeProcessor.process` обрабатывает вариацию
- **THEN** в `KtFileBuilder` добавляются корректные wrapper value-классы и `@Composable` extension-функции, идентичные тем, что генерировал `ComposeVariationGenerator`

### Requirement: VariationTreeProcessor поддерживает view-вариации и базовый wrapper-интерфейс
`VariationTreeProcessor` SHALL корректно обрабатывать view-вариации компонента (поле `view` в `BaseVariation`), добавляя для них отдельные extension-функции с `@JvmName` аннотациями и соответствующие wrapper-интерфейсы.

#### Scenario: Обработка компонента без view-вариаций
- **WHEN** конфиг компонента не содержит view-вариаций
- **THEN** процессор генерирует базовый wrapper-интерфейс и стандартные extension-функции без view-специфичного кода

#### Scenario: Обработка компонента с view-вариациями
- **WHEN** конфиг компонента содержит одну или несколько view-вариаций
- **THEN** процессор генерирует `WrapperXxxView`-интерфейсы, extension-функции для view-вариаций и корректно заполняет `variationProps` и `viewVariationProps`

### Requirement: VariationTreeProcessor возвращает словари вариаций и пропсов
`VariationTreeProcessor` SHALL по завершении обхода возвращать заполненные `Map<String, VariationReference>` (словарь вариаций) и `Map<String, List<VariationProp>>` (словарь пропсов вариаций), используемые для формирования `ComponentStyleGenerator.Result.Compose`.

#### Scenario: Словарь вариаций для компонента с иерархией
- **WHEN** конфиг содержит вариацию с дочерними подвариациями
- **THEN** словарь вариаций содержит корректные `VariationReference` вида `ComponentName.Parent.Child`

#### Scenario: Пустой словарь для компонента без вариаций
- **WHEN** конфиг не содержит вариаций
- **THEN** словарь вариаций содержит единственную запись `"default"` → `VariationReference("ComponentName.Default")`

### Requirement: ComposeVariationGenerator не изменяется
`ComposeVariationGenerator` и его подклассы SHALL оставаться нетронутыми. `VariationTreeProcessor` — это новый самостоятельный класс; он не заменяет и не изменяет `ComposeVariationGenerator`.

#### Scenario: Сосуществование старых и новых генераторов
- **WHEN** в плагине зарегистрированы как компонент-специфичный `*ComposeVariationGenerator`, так и `UniversalComposeVariationGenerator`
- **THEN** оба работают независимо, каждый для своего набора компонентов, не мешая друг другу
