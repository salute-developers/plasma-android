## Requirements

### Requirement: WheelWidthMode enum определяет режим распределения ширины
`WheelWidthMode` SHALL быть публичным enum в пакете `com.sdds.compose.uikit` (объявлен в `Wheel.kt`) со значениями `Auto`, `Equal`, `CenterContent`.

#### Scenario: Auto является значением по умолчанию в стиле
- **WHEN** `WheelStyle` создаётся через `WheelStyle.builder().style()` без явного вызова `widthMode`
- **THEN** `WheelStyle.widthMode == WheelWidthMode.Auto`

#### Scenario: Builder принимает WheelWidthMode
- **WHEN** вызывается `WheelStyle.builder().widthMode(WheelWidthMode.CenterContent).style()`
- **THEN** возвращаемый `WheelStyle.widthMode == WheelWidthMode.CenterContent`

### Requirement: WheelStyle и WheelStyleBuilder предоставляют widthMode
`WheelStyle` SHALL предоставлять свойство `widthMode: WheelWidthMode`.
`WheelStyleBuilder` SHALL предоставлять метод `fun widthMode(widthMode: WheelWidthMode): WheelStyleBuilder`.

#### Scenario: widthMode сохраняется в стиле
- **WHEN** вызывается `WheelStyle.builder().widthMode(WheelWidthMode.Equal).style()`
- **THEN** `WheelStyle.widthMode == WheelWidthMode.Equal`

### Requirement: Wheel принимает параметр widthMode
`Wheel(...)` SHALL принимать параметр `widthMode: WheelWidthMode` со значением по умолчанию `style.widthMode`.
Явный параметр SHALL иметь приоритет над значением из стиля.

#### Scenario: Дефолт берётся из стиля
- **WHEN** `Wheel(style = S)` вызывается без параметра `widthMode`
- **THEN** компонент использует `S.widthMode`

#### Scenario: Параметр переопределяет стиль
- **WHEN** `Wheel(style = S, widthMode = WheelWidthMode.CenterContent)` вызывается, а `S.widthMode == WheelWidthMode.Equal`
- **THEN** компонент использует `CenterContent`

### Requirement: Auto сохраняет прежнее поведение, привязанное к alignment
Эффективный режим ширины SHALL резолвиться из `widthMode` и `alignment` по правилу: `Auto` при `alignment == WheelAlignment.Mixed` → `CenterContent`; `Auto` при любом другом `alignment` → `Equal`; явные `Equal`/`CenterContent` SHALL использоваться без изменений.
Поведение всех конфигураций, не вызывавших `.widthMode(...)`, SHALL быть идентичен поведению до введения `WheelWidthMode`.

#### Scenario: Mixed без явного widthMode ведёт себя как раньше
- **WHEN** `Wheel(alignment = WheelAlignment.Mixed)` без явного `widthMode`
- **THEN** эффективный режим — `CenterContent`: крайние колёса растянуты, центральные измерены по контенту
- **AND** контент колёс выровнен `End/Center/Start` как для `Mixed`

#### Scenario: Center без явного widthMode ведёт себя как раньше
- **WHEN** `Wheel(alignment = WheelAlignment.Center)` без явного `widthMode`
- **THEN** эффективный режим — `Equal`: все колёса равной ширины, контент по центру

### Requirement: Equal распределяет ширину между колёсами поровну
При эффективном режиме `Equal` и фиксированной ширине компонента каждое колесо SHALL получать равную долю доступной ширины за вычетом разделителей.

#### Scenario: Три колеса при фиксированной ширине
- **WHEN** `wheelCount = 3`, `widthMode = Equal`, ширина компонента фиксирована
- **THEN** каждое колесо измеряется с `minWidth == maxWidth == (availableWidth - separatorsWidth) / 3`

### Requirement: CenterContent измеряет центральные колёса по контенту, крайние — на остаток
При эффективном режиме `CenterContent` и фиксированной ширине компонента:
крайние колёса (индексы `0` и `wheelCount - 1`) SHALL измеряться равной шириной, составляющей остаток доступной ширины после compact-колёс и разделителей;
все остальные колёса SHALL измеряться по ширине контента (ограниченной `wheelConstraints`: `Strict` — не более `1/N` доступной ширины, `Loose` — без дополнительного лимита).

#### Scenario: Макетное состояние — центр по контенту, контент везде по центру
- **WHEN** `wheelCount = 3`, `alignment = WheelAlignment.Center`, `widthMode = WheelWidthMode.CenterContent`, ширина компонента фиксирована
- **THEN** центральное колесо имеет ширину самого широкого своего элемента
- **AND** крайние колёса имеют равную ширину `(componentWidth - separatorsWidth - centerWidth) / 2`
- **AND** контент всех трёх колёс отцентрован в границах своего колеса

#### Scenario: Четыре колеса — компактные все некрайние
- **WHEN** `wheelCount = 4`, эффективный режим `CenterContent`, ширина фиксирована
- **THEN** колёса `1` и `2` измерены по контенту, колёса `0` и `3` делят остаток поровну

#### Scenario: Одно колесо занимает всю ширину
- **WHEN** `wheelCount = 1`, `widthMode = WheelWidthMode.CenterContent`, ширина фиксирована
- **THEN** единственное колесо (одновременно крайнее) растянуто на всю доступную ширину

#### Scenario: Два колеса эквивалентны Equal
- **WHEN** `wheelCount = 2`, эффективный режим `CenterContent`, ширина фиксирована
- **THEN** оба колеса имеют равную ширину, как при `Equal`

### Requirement: Режим ширины применяется только при фиксированной ширине компонента
При отсутствии фиксированной внешней ширины (`constraints.hasFixedWidth == false`) все колёса SHALL измеряться по контенту независимо от значения `widthMode` (нынешнее поведение `stretchWheels == false`).

#### Scenario: Wrap-ширина игнорирует режим
- **WHEN** `Wheel` без внешней фиксированной ширины, `widthMode = WheelWidthMode.Equal`
- **THEN** все колёса измерены по ширине контента

### Requirement: Выравнивание контента не зависит от режима ширины
`getBaseWheelAlignment` SHALL определять выравнивание контента колеса только по `WheelAlignment` и SHALL NOT зависеть от `widthMode`. Значение `WheelAlignment.Mixed` SHALL сохранять выравнивание контента `End`/`Center`/`Start` и SHALL NOT помечаться deprecated.

#### Scenario: Mixed + Equal — контент к центру в равных колёсах
- **WHEN** `alignment = WheelAlignment.Mixed`, `widthMode = WheelWidthMode.Equal`, ширина фиксирована
- **THEN** все колёса равной ширины, при этом контент первого прижат к правому краю, последнего — к левому, центральных — центрирован

#### Scenario: Ширина не меняет выравнивание Center
- **WHEN** `alignment = WheelAlignment.Center`, любой эффективный `widthMode`
- **THEN** контент каждого колеса отцентрован в границах этого колеса

### Requirement: Measure-логика режимов доступна для модульного тестирования
Чистые функции разрешения и распределения режима (`resolveFor`/аналог, `shouldStretchWheel`) SHALL быть `internal` (прецедент `calculateLoopingInitialFirstVisibleItemIndex`) и SHALL покрываться JUnit4-тестами без Compose-правила.

#### Scenario: Таблица резолва Auto
- **WHEN** тестируются комбинации `(Auto, Mixed)`, `(Auto, Center)`, `(Auto, Start)`, `(Equal, Mixed)`, `(CenterContent, Center)`
- **THEN** эффективные режимы равны `CenterContent, Equal, Equal, Equal, CenterContent` соответственно

### Requirement: Кодогенерация поддерживает свойство widthMode
KSP-мета `WheelStyleBuilder` SHALL включать enum-значения `Auto/Equal/CenterContent` для свойства `widthMode`; универсальный Compose-генератор SHALL генерировать `.widthMode(WheelWidthMode.<X>)` при наличии значения в конфиге вариации и SHALL НЕ генерировать вызов при его отсутствии. Нерезолвившееся строковое значение SHALL вести себя как в существующем `ValuePropertyMapper` (вызов пропускается).

#### Scenario: Генерация для centerContent
- **WHEN** конфиг вариации содержит `widthMode = { "type": "value", "value": "centerContent" }`
- **THEN** в сгенерированный билдер добавляется `.widthMode(WheelWidthMode.CenterContent)` и импорт `WheelWidthMode`

#### Scenario: Отсутствие widthMode в конфиге
- **WHEN** конфиг вариации не содержит `widthMode`
- **THEN** вызов `.widthMode(...)` не генерируется, стиль получает `Auto`
