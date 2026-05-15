# dropdown-menu-overlay-cutout Specification

## Purpose
TBD - created by archiving change add-dropdown-menu-overlay-cutout. Update Purpose after archive.
## Requirements
### Requirement: ModalDropdownMenu SHALL support overlay with trigger cutout
`ModalDropdownMenu` в `sdds-core/uikit-compose` SHALL отображать затемняющий overlay внутри `EdgeToEdgeDialog`. Overlay SHALL использовать `OverlayStyle` из `DropdownMenuStyle` и содержать вырез под trigger, чтобы trigger визуально не затемнялся.

#### Scenario: Existing DropdownMenu behavior remains unchanged
- **WHEN** существующий callsite открывает `DropdownMenu`
- **THEN** `DropdownMenu` MUST вести себя как раньше и не показывать overlay

#### Scenario: Overlay is shown for modal dropdown
- **WHEN** `ModalDropdownMenu` открыт
- **THEN** поверх фона MUST отображаться overlay, стилизованный через `DropdownMenuStyle.overlayStyle`

#### Scenario: Trigger remains visually highlighted through cutout
- **WHEN** `ModalDropdownMenu` открыт и trigger передал форму выреза
- **THEN** overlay MUST иметь вырез, совпадающий по размеру, положению и форме с trigger

### Requirement: Overlay tap SHALL dismiss ModalDropdownMenu
Когда overlay показан вместе с открытым `ModalDropdownMenu`, нажатие по overlay SHALL вызывать `onDismissRequest`, чтобы потребитель мог закрыть меню стандартным способом.

#### Scenario: Tap outside menu dismisses modal dropdown through overlay
- **WHEN** пользователь нажимает по overlay вне области меню
- **THEN** `ModalDropdownMenu` MUST вызвать `onDismissRequest`

### Requirement: TriggerInfo SHALL support trigger cutout shape
Публичный API `TriggerInfo` и `Modifier.popoverTrigger(...)` SHALL поддерживать передачу формы trigger для построения cutout. Библиотека MUST сохранить существующий API без обязательных изменений для старых callsite-ов и добавить новый overload modifier для сценариев, где нужна точная форма выреза.

#### Scenario: Existing popoverTrigger callsite remains valid
- **WHEN** потребитель использует существующий `Modifier.popoverTrigger(triggerInfo)`
- **THEN** код MUST оставаться совместимым и собираться без изменений

#### Scenario: New popoverTrigger overload provides shape for cutout
- **WHEN** потребитель использует новый `Modifier.popoverTrigger(triggerInfo, shape = ...)`
- **THEN** переданная `Shape` MUST быть доступна `DropdownMenu` для построения выреза под trigger

### Requirement: DropdownMenuStyle SHALL support modal overlay styling
`DropdownMenuStyle` SHALL предоставлять `overlayStyle` как часть публичного style contract, чтобы token styles, custom styles и generated docs могли задавать оформление overlay без прямой зависимости от `LocalOverlayStyle`.

#### Scenario: Custom DropdownMenu style defines overlay appearance
- **WHEN** потребитель создаёт `DropdownMenuStyle` через builder и задаёт `overlayStyle(...)`
- **THEN** открытый `ModalDropdownMenu` MUST использовать этот стиль для overlay

