## ADDED Requirements

### Requirement: Compose plugin viewport применяет payload background

`integration-core:preview-compose-plugin` SHALL применять разрешённый
`PreviewSurface.background` ко всей browser/Compose области после успешной подготовки payload.

#### Scenario: Payload задаёт preview background

- **WHEN** plugin успешно подготавливает payload с `surface.background`
- **THEN** полноразмерный Compose root MUST быть закрашен разрешённым цветом background
- **AND** свободные pixels вокруг story content MUST показывать этот цвет вместо белого canvas.

#### Scenario: Payload ещё не получен

- **WHEN** Wasm runtime готов, но успешный payload отсутствует
- **THEN** viewport MUST оставаться пустым и прозрачным
- **AND** plugin MUST NOT рисовать служебный loading text.

### Requirement: Story content центрируется в viewport

`preview-compose-plugin` SHALL размещать prepared story content по центру доступной ширины и
высоты без изменения собственного размера story.

#### Scenario: BasicButton имеет intrinsic width

- **WHEN** BasicButton render не использует fixed width
- **THEN** его bounds MUST быть центрированы по горизонтали и вертикали в canvas.

#### Scenario: Story меняет собственный размер

- **WHEN** UiState property меняет размер story, например `hasFixedWidth`
- **THEN** outer viewport MUST повторно центрировать новые bounds
- **AND** MUST NOT масштабировать content.
