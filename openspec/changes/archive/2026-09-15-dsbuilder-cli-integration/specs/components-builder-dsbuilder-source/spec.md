## ADDED Requirements

### Requirement: Fallback source from .sdds/components

`sdds-core/plugin_theme_builder` SHALL use `.sdds/components`, resolved relative to `dsBuilder.sddsDirectory`, as
a fallback components source when `dsBuilder.components` does not define an explicit source.

#### Scenario: Extension has no explicit components source

- **WHEN** a project applies the DS Builder Gradle Plugin, enables `dsBuilder.components`, does not configure an
  explicit source, and `.sdds/components/meta.json` exists
- **THEN** the components capability resolves its source from `.sdds/components`

#### Scenario: Extension has explicit components source

- **WHEN** a project configures an explicit `source(name, version)` or `source(url)` in `dsBuilder.components`
- **THEN** the components capability uses the explicit source and does not replace it with `.sdds/components`

### Requirement: Local components directory skips remote fetch

Components Builder SHALL read `meta.json` and per-component configuration files directly from `.sdds/components`
for local sources, instead of downloading and unpacking a components archive.

#### Scenario: Local source avoids components zip tasks

- **WHEN** the components capability resolves its source from `.sdds/components`
- **THEN** the plugin SHALL NOT register `fetchComponents` or `unpackComponentFiles` for that source
- **THEN** `GenerateComponentsTask.componentsDir` SHALL point directly at `.sdds/components`

#### Scenario: Existing generation semantics stay unchanged

- **WHEN** `componentsDir` points at `.sdds/components`
- **THEN** `GenerateComponentsTask` SHALL read `meta.json` and each component's `config` file the same way it does
  for a directory unpacked from a remote components archive

### Requirement: Invalid local components source fails clearly

The components capability SHALL fail with a clear error when `.sdds/components` is required as fallback but
cannot provide a usable source.

#### Scenario: Missing directory and no explicit source

- **WHEN** `dsBuilder.components` does not configure an explicit source and `.sdds/components` does not exist
- **THEN** the components capability fails with a message explaining that an explicit source or
  `.sdds/components` must be provided

#### Scenario: Missing meta.json

- **WHEN** `.sdds/components` exists but does not contain `meta.json`
- **THEN** the components capability fails with a message that includes the missing file path
