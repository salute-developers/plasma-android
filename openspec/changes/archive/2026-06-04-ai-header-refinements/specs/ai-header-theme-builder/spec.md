## ADDED Requirements

### Requirement: AiHeaderProperties SHALL include startButtonGroupStyle and endButtonGroupStyle
`@Serializable internal data class AiHeaderProperties` SHALL содержать поля `startButtonGroupStyle: ComponentStyle<ButtonProperties>?` и `endButtonGroupStyle: ComponentStyle<ButtonProperties>?`. Метод `merge(parent)` MUST использовать `?: otherProps.field` для каждого из этих полей.

#### Scenario: merge заполняет null-поля группы кнопок из parent
- **WHEN** `AiHeaderProperties` имеет `startButtonGroupStyle = null`, а parent имеет `startButtonGroupStyle = someStyle`
- **THEN** `merge(parent).startButtonGroupStyle` MUST равняться `someStyle`

#### Scenario: merge не перезаписывает заданные поля группы кнопок
- **WHEN** `AiHeaderProperties` имеет `startButtonGroupStyle = myStyle`
- **THEN** `merge(parent).startButtonGroupStyle` MUST равняться `myStyle` независимо от parent

### Requirement: AiHeaderComposeVariationGenerator SHALL generate startButtonGroupStyle and endButtonGroupStyle
`AiHeaderComposeVariationGenerator` SHALL генерировать вызовы `startButtonGroupStyle(...)` и `endButtonGroupStyle(...)` в builder-цепочке по образцу существующих `startButtonStyle`/`endButtonStyle`. Генерируемый код MUST компилироваться без ошибок.

#### Scenario: Генерируется startButtonGroupStyle для вариации
- **WHEN** конфиг содержит `startButtonGroupStyle`
- **THEN** генератор MUST эмитировать `.startButtonGroupStyle(<variation_style>)` в builder-цепочке

#### Scenario: Генерируется endButtonGroupStyle для вариации
- **WHEN** конфиг содержит `endButtonGroupStyle`
- **THEN** генератор MUST эмитировать `.endButtonGroupStyle(<variation_style>)` в builder-цепочке
