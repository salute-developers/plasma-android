## ADDED Requirements

### Requirement: Манифест плагина содержит группы компонентов песочницы

Манифест `preview-plugin.json` SHALL содержать поле `groups`: массив `{ "name", "components" }`, сформированный по реестру
историй (`ComponentKey.group`) в порядке групп песочницы, с компонентами группы по алфавиту. Каждый компонент из `components`
MUST входить ровно в одну группу, а группы MUST NOT содержать компонентов вне `components`. Остальные поля манифеста и
`schemaVersion` MUST NOT меняться.

#### Scenario: Компонент входит в группу песочницы

- **WHEN** история `CircularProgressBar` имеет группу «Data Display»
- **THEN** `groups` MUST содержать «Data Display» с `CircularProgressBar`.

#### Scenario: Расхождение состава

- **WHEN** компонент из `components` не входит ни в одну группу или входит в несколько
- **THEN** сборка манифеста MUST завершиться ошибкой с перечнем расхождений.

#### Scenario: Порядок групп

- **WHEN** манифест собирается
- **THEN** группы MUST идти в порядке `ordinal` групп песочницы.
