## ADDED Requirements

### Requirement: Story имеет владельца состояния в preview

Preview runtime SHALL подключать к story локального владельца состояния на время показа payload. Нажатие внутри
preview, меняющее состояние story (`CheckBox`, `Switch`, `Accordion`), MUST менять отображаемое состояние
и MUST NOT приводить к исключению.

#### Scenario: Нажатие на CheckBox в preview

- **WHEN** пользователь нажимает на `CheckBox`, нарисованный плагином
- **THEN** состояние story MUST измениться и отображаться
- **AND** plugin MUST продолжать принимать следующие payload.

#### Scenario: Владелец не переживает payload

- **WHEN** plugin показывает следующий payload
- **THEN** состояние предыдущего payload MUST NOT переноситься в новый.
