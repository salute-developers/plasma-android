## ADDED Requirements

### Requirement: Fallback source from .sdds config
`sdds-core/plugin_theme_builder` SHALL use `.sdds/config.json` as a fallback theme source when `themeBuilder` extension does not define `themeSource` or `themeSources`.

#### Scenario: Extension has no explicit theme source
- **WHEN** a project applies `plugin_theme_builder`, does not configure `themeSource` or `themeSources`, and contains `.sdds/config.json`
- **THEN** Theme Builder resolves theme sources from `.sdds/config.json`

#### Scenario: Extension has explicit theme source
- **WHEN** a project configures `themeSource` or `themeSources` in `themeBuilder`
- **THEN** Theme Builder uses the explicit extension sources and does not replace them with `.sdds/config.json` sources

### Requirement: DSBuilder tenants become legacy-compatible theme sources
Theme Builder SHALL convert each tenant from `.sdds/config.json` into a local theme source using `tenant.alias` when present, otherwise `tenant.name`.

#### Scenario: First tenant becomes internal default
- **WHEN** `.sdds/config.json` contains at least one tenant
- **THEN** Theme Builder passes the first tenant to `GenerateThemeTask` with an empty tenant suffix so existing `Tenant.Default` behavior is preserved

#### Scenario: Non-first tenants use public tenant names
- **WHEN** `.sdds/config.json` contains tenants after the first tenant
- **THEN** Theme Builder passes each additional tenant to `GenerateThemeTask` with tenant suffix equal to `tenant.alias` when present, otherwise `tenant.name`

#### Scenario: Base theme name comes from first tenant
- **WHEN** Theme Builder resolves sources from `.sdds/config.json`
- **THEN** Theme Builder uses the first tenant `alias` when present, otherwise `name`, as the base theme name

### Requirement: Local tenant directories provide generation files
Theme Builder SHALL read token files for local `.sdds` sources directly from each tenant directory instead of downloading and unpacking a theme zip archive.

#### Scenario: Tenant has directoryPath
- **WHEN** a tenant in `.sdds/config.json` has `directoryPath`
- **THEN** Theme Builder reads `meta.json` and `android/android_*.json` from that directory relative to the project directory

#### Scenario: Tenant has no directoryPath
- **WHEN** a tenant in `.sdds/config.json` does not have `directoryPath`
- **THEN** Theme Builder reads tenant files from `.sdds/<tenant.name>` relative to the project directory

#### Scenario: Local source avoids theme zip tasks
- **WHEN** Theme Builder uses local `.sdds` theme sources
- **THEN** Theme Builder does not register theme zip fetch or theme unzip tasks for those local sources

### Requirement: Local .sdds palette file provides generation palette
Theme Builder SHALL read the palette file for fallback `.sdds` sources from `palettePath` in `.sdds/config.json`, or from `.sdds/tenants/palette.json` when `palettePath` is absent.

#### Scenario: Config has palettePath
- **WHEN** Theme Builder resolves sources from `.sdds/config.json` and `palettePath` is present
- **THEN** Theme Builder reads the palette from that path relative to the project directory

#### Scenario: Config has no palettePath
- **WHEN** Theme Builder resolves sources from `.sdds/config.json` and `palettePath` is absent
- **THEN** Theme Builder reads the palette from `.sdds/tenants/palette.json`

#### Scenario: Local source avoids palette fetch task
- **WHEN** Theme Builder uses fallback `.sdds` theme sources
- **THEN** Theme Builder does not register `fetchPalette`

#### Scenario: Explicit source keeps paletteUrl flow
- **WHEN** a project configures `themeSource` or `themeSources` in `themeBuilder`
- **THEN** Theme Builder keeps using `paletteUrl` and `fetchPalette`

### Requirement: Existing generation semantics stay unchanged
Theme Builder SHALL keep `GenerateThemeTask` and existing token/theme generators working with the same legacy input model they use today.

#### Scenario: GenerateThemeTask receives legacy tenant list
- **WHEN** Theme Builder resolves sources from `.sdds/config.json`
- **THEN** `GenerateThemeTask` receives `themeTenants` ordered with `""` first and additional tenant suffixes after it

#### Scenario: Generators remain unchanged
- **WHEN** local `.sdds` sources are used
- **THEN** existing token generators, attribute generators, theme generators, and `Tenant.Default` semantics remain unchanged

### Requirement: Invalid .sdds config fails clearly
Theme Builder SHALL fail configuration with a clear error when `.sdds/config.json` is required as fallback but cannot provide usable theme sources.

#### Scenario: Missing config and no explicit source
- **WHEN** a project does not configure `themeSource` or `themeSources` and `.sdds/config.json` does not exist
- **THEN** Theme Builder fails with a message explaining that `themeSource(s)` or `.sdds/config.json` must be provided

#### Scenario: Empty tenants
- **WHEN** `.sdds/config.json` exists but contains no tenants
- **THEN** Theme Builder fails with a message explaining that `.sdds/config.json` must contain at least one tenant

#### Scenario: Missing tenant files
- **WHEN** a resolved local tenant directory does not contain required `meta.json` or `android/android_*.json` files
- **THEN** Theme Builder fails with a message that includes the missing file path

#### Scenario: Missing palette file
- **WHEN** Theme Builder resolves sources from `.sdds/config.json` and the resolved palette file does not exist
- **THEN** Theme Builder fails with a message that includes the missing palette file path
