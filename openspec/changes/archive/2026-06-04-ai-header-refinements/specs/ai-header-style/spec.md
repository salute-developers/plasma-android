## ADDED Requirements

### Requirement: AiHeaderStyle SHALL define startButtonGroupStyle and endButtonGroupStyle
`@Stable interface AiHeaderStyle` SHALL содержать поля `startButtonGroupStyle: ButtonGroupStyle` и `endButtonGroupStyle: ButtonGroupStyle`. Дефолтные значения в `DefaultAiHeaderStyle.Builder.style()` MUST быть `ButtonGroupStyle.builder().style()`.

#### Scenario: Поля доступны из стиля без NPE
- **WHEN** получен экземпляр `AiHeaderStyle` через `AiHeaderStyle.builder().style()`
- **THEN** `startButtonGroupStyle` и `endButtonGroupStyle` MUST быть доступны без `NullPointerException`

#### Scenario: Дефолтный стиль группы кнопок не null
- **WHEN** `AiHeaderStyle.builder().style()` вызван без явной установки `startButtonGroupStyle`
- **THEN** `startButtonGroupStyle` MUST быть экземпляром дефолтного `ButtonGroupStyle` (не `null`)

### Requirement: AiHeaderStyleBuilder SHALL provide setters for button group styles
`interface AiHeaderStyleBuilder` SHALL предоставлять методы `fun startButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder` и `fun endButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder`.

#### Scenario: Builder принимает startButtonGroupStyle
- **WHEN** вызывается `AiHeaderStyle.builder().startButtonGroupStyle(myGroupStyle).style()`
- **THEN** `result.startButtonGroupStyle` MUST равняться `myGroupStyle`

#### Scenario: Builder принимает endButtonGroupStyle
- **WHEN** вызывается `AiHeaderStyle.builder().endButtonGroupStyle(myGroupStyle).style()`
- **THEN** `result.endButtonGroupStyle` MUST равняться `myGroupStyle`
