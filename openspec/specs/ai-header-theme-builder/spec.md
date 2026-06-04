## ADDED Requirements

### Requirement: AiHeaderProperties SHALL define all configurable properties
`sdds-core/plugin_theme_builder` SHALL содержать `@Serializable internal data class AiHeaderProperties` с полями: `titleStyle: Typography?`, `subtitleStyle: Typography?`, `backgroundColor: Color?`, `titleColor: Color?`, `subtitleColor: Color?`, `dividerColor: Color?`, `dividerThickness: Dimension?`, `textPaddingStart: Dimension?`, `textPaddingEnd: Dimension?`, `textPaddingTop: Dimension?`, `textPaddingBottom: Dimension?`, `subtitlePadding: Dimension?`, `paddingStart: Dimension?`, `paddingEnd: Dimension?`, `paddingTop: Dimension?`, `paddingBottom: Dimension?`, `startButtonStyle: ComponentStyle<ButtonProperties>?`, `endButtonStyle: ComponentStyle<ButtonProperties>?`, `startButtonIcon: Icon?`, `endButtonIcon: Icon?`. Метод `merge(parent)` MUST использовать `?: otherProps.field` для каждого поля.

#### Scenario: merge заполняет null-поля из parent
- **WHEN** `AiHeaderProperties` имеет `titleStyle = null`, а parent имеет `titleStyle = someTypography`
- **THEN** `merge(parent).titleStyle` MUST равняться `someTypography`

#### Scenario: merge не перезаписывает заданные поля
- **WHEN** `AiHeaderProperties` имеет `titleStyle = myTypography`
- **THEN** `merge(parent).titleStyle` MUST равняться `myTypography` независимо от parent

### Requirement: AiHeaderConfig SHALL conform to Config and ComponentConfig
`@Serializable internal data class AiHeaderConfig` SHALL реализовывать `Config<AiHeaderProperties>` и `ComponentConfig`. SHALL содержать поля `view`, `props`, `variations`, `bindings` по образцу `NavigationBarConfig`. Конфиг MUST поддерживать 9 size-вариаций (xs, s, m, l, xl, h5, h4, h3, h2) и 3 view-вариации (default, secondary, clear) согласно `ai_header_config.json`.

#### Scenario: Конфиг десериализуется из JSON
- **WHEN** файл `ai_header_config.json` декодируется через `Serializer.componentConfig`
- **THEN** MUST возвращаться валидный `AiHeaderConfig` без исключений

#### Scenario: size-вариации содержат корректные свойства
- **WHEN** обрабатывается вариация `xs`
- **THEN** `titleStyle` MUST равняться `body.xs.bold`, `paddingTop` MUST равняться `4.dp`

### Requirement: AiHeaderConfigDelegate SHALL parse config and create generators
`internal class AiHeaderConfigDelegate : ComponentConfigDelegate<AiHeaderConfig>()` SHALL реализовывать `parseConfig(file)` через `file.decode(Serializer.componentConfig)`. `createViewGenerator()` MUST возвращать `null` (View не поддерживается). `createComposeGenerator()` MUST возвращать `AiHeaderComposeVariationGenerator`.

#### Scenario: parseConfig возвращает AiHeaderConfig
- **WHEN** передаётся валидный JSON-файл конфига
- **THEN** `parseConfig` MUST возвращать `AiHeaderConfig` без исключений

#### Scenario: createViewGenerator возвращает null
- **WHEN** вызывается `createViewGenerator(deps, component)`
- **THEN** MUST возвращаться `null`

### Requirement: AiHeaderComposeVariationGenerator SHALL generate AiHeaderStyle variations
`internal class AiHeaderComposeVariationGenerator` SHALL генерировать Kotlin-файл со стилями `AiHeaderStyle` для каждой вариации из конфига. Генератор MUST следовать паттерну `NavigationBarComposeVariationGenerator`: использовать `KtFileBuilder`, применять токены темы, генерировать builder-цепочки. Сгенерированный код MUST компилироваться без ошибок.

#### Scenario: Генерируется стиль для вариации xs.default
- **WHEN** `AiHeaderComposeVariationGenerator` обрабатывает вариацию `xs` с view `default`
- **THEN** MUST генерироваться функция-расширение, устанавливающая `titleStyle`, `backgroundColor`, `paddingTop` и другие свойства из конфига

#### Scenario: Цвета генерируются как brush
- **WHEN** конфиг содержит `backgroundColor: Color`
- **THEN** генератор MUST эмитировать `backgroundBrush(theme.colors.backgroundToken)` — через brush-API, не через `Color`

### Requirement: AiHeaderConfigDelegate SHALL be registered in ComponentDelegates
`ComponentDelegates` в `plugin_theme_builder` SHALL содержать запись `"ai-header" to AiHeaderConfigDelegate()` в `componentDelegates` map.

#### Scenario: Делегат регистрируется под ключом ai-header
- **WHEN** `componentDelegates["ai-header"]` запрашивается
- **THEN** MUST возвращаться экземпляр `AiHeaderConfigDelegate`

### Requirement: AiHeader Story SHALL be registered in sandbox-core and uikit-compose-fixtures
`integration-core/sandbox-core` SHALL содержать `AI_HEADER` в `CoreComponentName` и `val AiHeader = ComponentKey(CoreComponentName.AI_HEADER)` в `ComponentKey.companion`, с группой `NAVIGATION`. `integration-core/uikit-compose-fixtures` SHALL содержать `@StoryUiState data class AiHeaderUiState` (поля: `title: String`, `subtitle: String`, `hasDivider: Boolean`, `titleAlignment: AiHeaderTitleAlignment`, `hasStartButton: Boolean`, `hasEndButton: Boolean`) и `@Story object AiHeaderStory : ComposeBaseStory<AiHeaderUiState, AiHeaderStyle>`.

#### Scenario: AiHeaderUiState имеет поля title и subtitle
- **WHEN** создаётся `AiHeaderUiState()`
- **THEN** `title` и `subtitle` MUST быть доступны как `String`; пустой `subtitle` MUST маппироваться в `null` subtitleContent-слот в `AiHeaderStory.Content()`

#### Scenario: Story рендерит компонент с текущим состоянием
- **WHEN** `AiHeaderStory.Content()` вызывается с `state.subtitle = ""`
- **THEN** `AiHeader` MUST вызываться с `subtitleContent = null`

#### Scenario: ComponentKey.AiHeader доступен
- **WHEN** обращаются к `ComponentKey.AiHeader`
- **THEN** MUST возвращаться `ComponentKey` с group `NAVIGATION`
