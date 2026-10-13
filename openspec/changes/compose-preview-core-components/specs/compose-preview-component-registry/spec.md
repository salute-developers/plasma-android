## ADDED Requirements

### Requirement: История объявляет стабильный componentId

Параметр `componentId` аннотации `@Story` SHALL быть необязательным (значение по умолчанию пустая строка), чтобы не ломать
существующие истории внешних потребителей `sandbox-*`. История, пригодная для preview, SHALL задавать `@Story(componentId = "...")`,
где `componentId` равен `ComponentKey.value` истории и имени компонента в `uikit-compose-api-meta.json`. Идентификатор MUST быть
стабильным между сборками и MUST NOT выводиться из имени класса истории. История с пустым `componentId` MUST NOT попадать
в реестр preview и MUST NOT приводить к ошибке сборки.

#### Scenario: Идентификатор совпадает с ключом

- **WHEN** KSP обрабатывает историю с `@Story(componentId = "BasicButton")`
- **THEN** процессор MUST проверить, что `componentId` совпадает с `ComponentKey.value`, который история передаёт в конструктор
- **AND** при несовпадении сборка MUST завершиться ошибкой с именем класса истории.

#### Scenario: Идентификатор не задан

- **WHEN** история объявлена как `@Story` без `componentId`
- **THEN** она MUST регистрироваться в `StoryRegistry` как раньше
- **AND** она MUST NOT попадать в перечисление preview и в manifest плагина.

#### Scenario: Идентификатор не уникален

- **WHEN** две истории объявляют один `componentId`
- **THEN** сборка MUST завершиться ошибкой с именами обеих историй.

### Requirement: Реестр историй перечислим и type-erased

`StoryRegistry` SHALL предоставлять перечисление всех зарегистрированных историй в виде записей
`{componentId, story, styleQualifiedName}`, где `styleQualifiedName` это полное имя класса стиля, который
история передаёт в `ComposeBaseStory<State, Style>`. Запись MUST создаваться сгенерированным кодом,
а не вручную.

#### Scenario: Реестр содержит все истории

- **WHEN** выполнена сгенерированная регистрация историй
- **THEN** перечисление MUST содержать по одной записи на каждую аннотированную `@Story` историю
- **AND** порядок записей MUST быть детерминирован (по `componentId`).

#### Scenario: Запись раскрывает класс стиля

- **WHEN** история объявлена как `ComposeBaseStory<ButtonUiState, ButtonStyle>`
- **THEN** её запись MUST содержать `styleQualifiedName = "com.sdds.compose.uikit.ButtonStyle"`.

### Requirement: Компонент preview собирается из истории и фабрики по идентификатору

Плагин SHALL строить `ComposePreviewComponent` для каждой записи реестра, у которой есть сгенерированная фабрика
с тем же `componentId`. При сборке компонента SDK MUST проверить, что стиль фабрики совпадает с `styleQualifiedName`
записи реестра.

#### Scenario: Фабрика и история согласованы

- **WHEN** для записи `BasicButton` найдена фабрика `BasicButton`, стиль которой `ButtonStyle`
- **THEN** плагин MUST зарегистрировать компонент `BasicButton`.

#### Scenario: Стиль фабрики не совпадает

- **WHEN** тип стиля фабрики отличается от `styleQualifiedName` истории
- **THEN** запуск плагина MUST завершиться ошибкой с `componentId` и обоими типами
- **AND** компонент MUST NOT регистрироваться.

#### Scenario: Для истории нет фабрики

- **WHEN** запись реестра не имеет фабрики (например, у истории нет стиля в api-мете)
- **THEN** компонент MUST NOT попадать в manifest и в реестр плагина
- **AND** payload с таким `component.id` MUST получить `PreviewResult.Failure` с кодом `component_not_found`.

### Requirement: Список компонентов manifest формируется из реестра

Поле `components` в `preview-plugin.json` SHALL формироваться при сборке из тех же записей, из которых плагин регистрирует
компоненты, и MUST NOT поддерживаться вручную.

#### Scenario: Manifest соответствует реестру

- **WHEN** собран production artifact
- **THEN** `components` MUST содержать ровно `componentId` зарегистрированных компонентов в порядке реестра
- **AND** тест MUST завершаться ошибкой, если список расходится с реестром плагина.
