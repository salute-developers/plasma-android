## ADDED Requirements

### Requirement: Card SHALL expose title and subtitle slot overload
`Card` в `sdds-core/uikit-compose` SHALL предоставлять публичную Compose-перегрузку с обязательным параметром `title: @Composable () -> Unit` и опциональным параметром `subtitle: (@Composable () -> Unit)?`. Новая перегрузка MUST сохранять существующие параметры расширенной Card API, где это применимо, и MUST не требовать изменений в существующих callsite-ах.

#### Scenario: Existing Card callsite remains valid
- **WHEN** потребитель использует существующую перегрузку `Card` с nullable `label` или без `label`
- **THEN** код MUST компилироваться и вести себя как раньше

#### Scenario: New overload renders title and subtitle
- **WHEN** потребитель вызывает новую перегрузку `Card` с `title` и `subtitle`
- **THEN** Card MUST отобразить оба слота в label area

#### Scenario: New overload renders title without subtitle
- **WHEN** потребитель вызывает новую перегрузку `Card` только с `title`
- **THEN** Card MUST отобразить title без subtitle и без ошибки

### Requirement: Card SHALL compose title and subtitle through existing label slot
Новая перегрузка `Card` SHALL использовать внутри существующую перегрузку с необязательным параметром `label`. Переданный туда `label` MUST быть `Column`, содержащим сначала `title`, затем `subtitle` при наличии, с отступом между ними из `CardStyle`.

#### Scenario: Subtitle is placed below title
- **WHEN** новая перегрузка получает composable `title` и `subtitle`
- **THEN** `subtitle` MUST располагаться ниже `title` внутри одной вертикальной группы

#### Scenario: Subtitle is omitted
- **WHEN** новая перегрузка получает `subtitle = null`
- **THEN** subtitle content MUST not be rendered

#### Scenario: Content-to-label spacing remains unchanged
- **WHEN** новая перегрузка используется в vertical или horizontal orientation
- **THEN** расстояние между content и label area MUST продолжать определяться существующим `mainAxisGap`

### Requirement: CardStyle SHALL support title and subtitle styling
`CardStyle` SHALL предоставлять `titleStyle`, stateful значения для subtitle typography и brush-based значения для title/subtitle color. Runtime rendering новой Card overload MUST применять эти значения к title и subtitle с учетом `interactionSource`.

#### Scenario: Custom subtitle text style is applied
- **WHEN** `CardStyle` содержит кастомный subtitle `TextStyle`
- **THEN** subtitle MUST рендериться с этим text style

#### Scenario: Custom subtitle brush is applied
- **WHEN** `CardStyle` содержит кастомный subtitle brush или color
- **THEN** subtitle MUST рендериться с этим brush/color

#### Scenario: Custom title style and color are applied
- **WHEN** `CardStyle` содержит кастомные `titleStyle` и `titleColor`
- **THEN** title MUST рендериться с этими значениями

### Requirement: CardColors SHALL expose brush-based title and background values
`CardColors` SHALL предоставлять `titleColor: StatefulValue<Brush>` и `backgroundBrush: StatefulValue<Brush>` как API для цвета title и фона Card. Runtime Card MUST использовать brush-based значения для title и background rendering.

#### Scenario: Card background uses background brush
- **WHEN** `CardStyle.colors.backgroundBrush` содержит stateful brush
- **THEN** фон Card MUST рендериться с brush для текущего interaction state

#### Scenario: Card title uses title color
- **WHEN** `CardStyle.colors.titleColor` содержит stateful brush
- **THEN** title MUST рендериться с brush для текущего interaction state

### Requirement: Legacy style properties SHALL stay source-compatible
`CardStyle.labelStyle` SHALL остаться доступным для обратной совместимости, но MUST быть deprecated с миграцией на `titleStyle`. `CardColors.labelColor` SHALL остаться доступным без deprecation как legacy color для старого nullable `label`. `CardColors.backgroundColor` SHALL остаться доступным deprecated с миграцией на `backgroundBrush`.

#### Scenario: Existing color-based Card style remains source-compatible
- **WHEN** потребитель использует существующие color-based API для label или background
- **THEN** код MUST продолжать компилироваться; deprecation warning допускается только для `labelStyle` и `backgroundColor`

#### Scenario: New code can use brush-based Card colors
- **WHEN** потребитель задает `titleColor` или `backgroundBrush`
- **THEN** `CardStyle` MUST использовать эти brush values без обращения к legacy color properties

### Requirement: CardStyle SHALL support subtitle gap dimension
`CardStyle` SHALL предоставлять stateful dimension для отступа между `title` и `subtitle`. Новая Card overload MUST использовать это значение как vertical spacing внутри `Column` с `title` и `subtitle`.

#### Scenario: Custom subtitle gap is applied
- **WHEN** `CardStyle.dimensions` задает subtitle gap
- **THEN** расстояние между `title` и `subtitle` MUST соответствовать этому значению

### Requirement: CardStyle builder SHALL provide title and subtitle convenience overloads
`CardStyle` builder SHALL предоставлять удобные overloads для задания title/subtitle color/brush/style через `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>`, `TextStyle` и `StatefulValue<TextStyle>`. Builder для Card colors также SHALL предоставлять brush-based overloads с color-именами `titleColor(...)`, `backgroundColor(...)` и `subtitleColor(...)`, сохранив legacy `labelColor(...)` color-based методы без deprecation. Эти overloads MUST дополнять существующий builder API без удаления или изменения существующих методов.

#### Scenario: Subtitle style can be configured with simple values
- **WHEN** потребитель задает subtitle color через `Color` или style через `TextStyle`
- **THEN** builder MUST создать валидный `CardStyle` без дополнительных ручных conversions

#### Scenario: Subtitle style can be configured with stateful values
- **WHEN** потребитель задает subtitle brush или text style через `StatefulValue`
- **THEN** runtime Card MUST использовать state-specific значения для subtitle

### Requirement: Theme Builder SHALL generate subtitle style values for Compose Card
Theme Builder для `Card` SHALL поддерживать subtitle properties в `CardConfig.kt` и генерировать соответствующие Compose builder calls в `CardComposeVariationGenerator.kt`. Отсутствие subtitle properties в token config MUST сохранять прежний generated output для существующих полей.

#### Scenario: Card config contains subtitle tokens
- **WHEN** token config для Card содержит subtitle color, subtitle style или subtitle gap
- **THEN** Compose variation generator MUST добавить соответствующие вызовы CardStyle builder

#### Scenario: Card config omits subtitle tokens
- **WHEN** token config для Card не содержит subtitle properties
- **THEN** Compose variation generator MUST не требовать subtitle values и MUST сохранять совместимость с существующими configs
