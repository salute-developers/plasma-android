# compose-preview-component-registry Specification

## Purpose
TBD - created by archiving change compose-preview-core-components. Update Purpose after archive.
## Requirements
### Requirement: История объявляет стабильный componentId

Параметр `componentId` аннотации `@Story` SHALL быть необязательным (значение по умолчанию пустая строка), чтобы не ломать
существующие истории внешних потребителей `sandbox-*`. История, пригодная для preview, SHALL задавать `@Story(componentId = "...")`,
где `componentId` равен имени компонента (`componentName`) в `uikit-compose-api-meta.json`. `componentId` MAY отличаться от
`ComponentKey.value` истории: например, `ComponentKey.CheckBox.value` это `Checkbox`, а компонент меты называется `CheckBox`.
Идентификатор MUST быть стабильным между сборками и MUST NOT выводиться из имени класса истории или из `ComponentKey.value`. История с пустым `componentId` MUST NOT попадать
в реестр preview и MUST NOT приводить к ошибке сборки.

#### Scenario: Идентификатор отличается от ключа

- **WHEN** история `CheckBoxStory` с `ComponentKey.CheckBox` объявлена как `@Story(componentId = "CheckBox")`
- **THEN** запись реестра MUST использовать `CheckBox` (идентификатор меты), а не `Checkbox` (значение ключа)
- **AND** payload с `component.id = "CheckBox"` MUST находить эту историю.

#### Scenario: Идентификатора нет в мете

- **WHEN** `componentId` истории не совпадает ни с одним `componentName` api-меты
- **THEN** сборка плагина (тест покрытия) MUST завершиться ошибкой с именем истории и идентификатором.

#### Scenario: Идентификатор не задан

- **WHEN** история объявлена как `@Story` без `componentId`
- **THEN** она MUST регистрироваться в `StoryRegistry` как раньше
- **AND** она MUST NOT попадать в перечисление preview и в manifest плагина.

#### Scenario: Идентификатор не уникален

- **WHEN** две истории объявляют один `componentId`
- **THEN** сборка MUST завершиться ошибкой с именами обеих историй.

### Requirement: Дочерние компоненты имеют собственные истории

Каждый компонент api-меты SHALL иметь историю `@Story` в `uikit-compose-fixtures`, если у него есть публичный composable, пригодный для отрисовки.
Это относится и к дочерним компонентам, которые в DS Builder настраиваются как самостоятельные (оформление дочернего компонента, на которое ссылается
свойство-стиль родителя). История MUST
использовать тот же `ComponentKey.value`, что и `componentName` меты. Компонент, для которого истории нет, MUST быть перечислен в списке исключений
теста покрытия с причиной.

#### Scenario: Айтем с публичным composable

- **WHEN** у компонента меты (например, `ListItem`, `TabItem`, `SelectItem`) есть публичный composable
- **THEN** в `uikit-compose-fixtures` MUST быть история с `@Story(componentId = ...)`, а компонент MUST попадать в реестр preview и manifest.

#### Scenario: Айтем, который не отрисовать отдельно

- **WHEN** компонент нельзя отрисовать без родителя либо у него нет публичного composable
- **THEN** его фабрика MUST генерироваться как вложенный стиль родителя
- **AND** компонент MUST быть в списке исключений теста покрытия с причиной.

#### Scenario: Новая история не ломает демо

- **WHEN** история добавлена в `uikit-compose-fixtures`
- **THEN** она MUST регистрироваться в `StoryRegistry` и показываться в демо-приложении так же, как существующие истории.

### Requirement: Реестр историй перечислим и type-erased

`StoryRegistry` SHALL предоставлять перечисление всех зарегистрированных историй в виде записей
`{componentId, story, styleQualifiedName}`, где `styleQualifiedName` это полное имя класса стиля, который
история передаёт в `ComposeBaseStory<State, Style>`. Запись MUST создаваться сгенерированным кодом,
а не вручную.

#### Scenario: Реестр содержит все истории

- **WHEN** выполнена сгенерированная регистрация историй
- **THEN** перечисление MUST содержать по одной записи на каждую аннотированную `@Story` историю с непустым `componentId`
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

