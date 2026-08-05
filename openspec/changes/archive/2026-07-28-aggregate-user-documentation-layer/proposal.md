## Why

Android documentation aggregation currently emits only enriched Core pages, while ADR-0003 requires the final documentation bundle to preserve both Core and design-system-specific user layers for a later merge by DS Builder CLI. Existing user documentation already lives in `tokens/*/docs/override-docs`, but it has no declarative structure and relies on the legacy Docusaurus `+*.md` append convention.

## What Changes

- Introduce an optional user documentation source rooted at `override-docs`, with an explicit `structure.json` and public markdown under `docs/**/*.md`.
- Enrich public user markdown with the same Kotlin/XML samples and Compose style API as Core markdown, while preserving screenshot keys and copying screenshot assets.
- **BREAKING**: separate platform output into `.sdds/temp/docs/content/core/**` and `.sdds/temp/docs/content/user/**` instead of writing Core pages directly under `content/**`.
- Emit the two source structures independently as `structure-core.json` and optional `structure-user.json`; DS Builder CLI remains responsible for navigation merge and final `contentRefs`.
- Preserve legacy Docusaurus behavior: `+Name.md` remains the physical source for an `append` user page, while `structure.json` uses the logical path `Name.md` without the prefix.
- Add declarative user structures for the existing `plasma.homeds.compose` and `sdds-sbcom-compose` overrides and validate that every public path resolves to the correct ordinary or `+`-prefixed markdown source.
- Keep Docusaurus generation, Core/user merge, `docs.json`/`manifest.json`, S3 upload and publication outside the Android aggregation task.

## Capabilities

### New Capabilities

- `user-documentation-layer`: Defines the Android user documentation source layout, explicit navigation, legacy `+*.md` compatibility and independently enriched output.

### Modified Capabilities

- `android-documentation-aggregation`: Separates Core and user content namespaces and enriches both layers without merging them.

## Impact

- `sdds-core:plugin_theme_builder`: documentation DSL/task inputs, enrichment routing, output layout and unit tests change.
- `tokens/*/docs`: existing user markdown becomes explicitly described by `override-docs/structure.json`; current Docusaurus source files remain compatible.
- `build-system`: shared validation may be extended for the logical-path-to-physical-source mapping, without changing the legacy Docusaurus merge contract.
- DS Builder CLI must consume `structure-core.json`, optional `structure-user.json`, `content/core/**` and `content/user/**`; implementing that consumer remains outside this repository change.
- The change affects documentation generation and Gradle task contracts, but does not change UIKit public API or design tokens.
- Validation covers focused plugin tests, existing override documentation, legacy Docusaurus generation, and Compose/View `documentationAggregate` outputs.
