## MODIFIED Requirements

### Requirement: Fallback source from .sdds config
`sdds-core/plugin_theme_builder` SHALL use the `.sdds/config.json` resolved by `dsBuilder.sddsDirectory` as a fallback theme source when `dsBuilder.theme` does not define an explicit source.

#### Scenario: Extension has no explicit theme source
- **WHEN** a project applies the DS Builder Gradle Plugin, enables `dsBuilder.theme`, does not configure an explicit source, and the resolved `.sdds/config.json` exists
- **THEN** the theme capability resolves theme sources from `.sdds/config.json`

#### Scenario: Extension has explicit theme source
- **WHEN** a project configures an explicit source in `dsBuilder.theme`
- **THEN** the theme capability uses the explicit source and does not replace it with `.sdds/config.json` sources

### Requirement: DSBuilder tenants become legacy-compatible theme sources
The theme capability SHALL convert every tenant from `.sdds/config.json` into a local variation source of one theme using `tenant.alias` when present, otherwise `tenant.name`.

#### Scenario: First tenant becomes internal default
- **WHEN** `.sdds/config.json` contains at least one tenant
- **THEN** the theme capability passes the first tenant to `GenerateThemeTask` with an empty tenant suffix so existing `Tenant.Default` behavior is preserved

#### Scenario: Non-first tenants use public tenant names
- **WHEN** `.sdds/config.json` contains tenants after the first tenant
- **THEN** the theme capability passes each additional tenant to `GenerateThemeTask` with tenant suffix equal to `tenant.alias` when present, otherwise `tenant.name`

#### Scenario: Base theme name comes from first tenant
- **WHEN** the theme capability resolves sources from `.sdds/config.json`
- **THEN** it uses the first tenant `alias` when present, otherwise `name`, as the single base theme name exposed to documentation, sandbox and preview capabilities

### Requirement: Invalid .sdds config fails clearly
The theme capability SHALL fail with a clear error when the resolved `.sdds/config.json` is required as fallback but cannot provide usable theme sources.

#### Scenario: Missing config and no explicit source
- **WHEN** `dsBuilder.theme` does not configure an explicit source and the resolved `.sdds/config.json` does not exist
- **THEN** the theme capability fails with a message explaining that an explicit source or `.sdds/config.json` must be provided

#### Scenario: Empty tenants
- **WHEN** `.sdds/config.json` exists but contains no tenants
- **THEN** the theme capability fails with a message explaining that `.sdds/config.json` must contain at least one tenant

#### Scenario: Missing tenant files
- **WHEN** a resolved local tenant directory does not contain required `meta.json` or `android/android_*.json` files
- **THEN** the theme capability fails with a message that includes the missing file path

#### Scenario: Missing palette file
- **WHEN** the theme capability resolves sources from `.sdds/config.json` and the resolved palette file does not exist
- **THEN** the theme capability fails with a message that includes the missing palette file path
