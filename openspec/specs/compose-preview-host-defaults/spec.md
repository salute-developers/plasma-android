# compose-preview-host-defaults Specification

## Purpose
TBD - created by archiving change apply-host-defaults-in-plugin. Update Purpose after archive.
## Requirements
### Requirement: Плагин применяет стили по умолчанию из payload

Плагин SHALL по разделу `defaults` payload задавать стиль и цвет текста по умолчанию, а также `LocalButtonStyle`, `LocalSwitchStyle`
и `LocalSpinnerStyle` для содержимого превью. Отсутствующий раздел, токен или стиль MUST NOT приводить к ошибке render.

#### Scenario: Стиль кнопки по умолчанию

- **WHEN** payload содержит `defaults.styles.button` на стиль компонента `BasicButton`
- **THEN** кнопки внутри истории без собственного стиля MUST рисоваться этим стилем.

#### Scenario: Текст по умолчанию

- **WHEN** payload содержит `defaults.text` со стилем и цветом
- **THEN** текст внутри истории без собственного цвета MUST рисоваться этим цветом.

#### Scenario: Payload без defaults

- **WHEN** раздела `defaults` нет
- **THEN** превью MUST рисоваться как раньше.

