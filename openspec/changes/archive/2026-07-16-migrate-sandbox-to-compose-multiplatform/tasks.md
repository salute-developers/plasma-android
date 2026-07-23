## 1. Build-system and dependencies

- [x] 1.1 Add the Compose Multiplatform navigation dependency to `gradle/libs.versions.toml` for use from `commonMain`.
- [x] 1.2 Audit existing `convention.kmp-lib`, `convention.cmp-lib`, and `convention.cmp-app` behavior against sandbox needs.
- [x] 1.3 Add only the minimal build-system wiring needed for sandbox KSP/common metadata or sandbox app packaging if existing conventions do not cover it.
- [x] 1.4 Update `build-system` integration generator/templates so generated Compose integration code can target CMP/common source sets.
- [x] 1.5 Ensure generated `ComposeRegisterTheme` output does not require `SandboxActivity` for common theme registration.
- [x] 1.6 Ensure generated Compose component provider/style provider output uses common-compatible imports and APIs.

## 2. integration-core:sandbox-core

- [x] 2.1 Switch `integration-core/sandbox-core` from `convention.kotlin-lib` to `convention.kmp-lib`.
- [x] 2.2 Move production sources from `src/main/kotlin` to `src/commonMain/kotlin`.
- [x] 2.3 Ensure sandbox core dependencies are declared in `commonMain` and contain no Android/JVM-only API.
- [x] 2.4 Compile the migrated `sandbox-core` Android target and common metadata.

## 3. integration-core:sandbox-ksp

- [x] 3.1 Keep `integration-core/sandbox-ksp` as a JVM/KSP processor module.
- [x] 3.2 Remove or replace Android-only annotations/imports from generated producers, transformers, and registry files.
- [x] 3.3 Verify generated `registerStories`, property producers, and state transformers reference only common-compatible sandbox API.
- [x] 3.4 Validate story generation for KMP source sets: the pilot must either run `sandbox-ksp` for common metadata or intentionally keep story registration manual/static until KSP-common wiring is added.

## 4. integration-core:sandbox-compose

- [x] 4.1 Switch `integration-core/sandbox-compose` from Android library convention to `convention.cmp-lib`.
- [x] 4.2 Move platform-neutral Compose UI, styles, menu rendering, properties UI, and story framework code to `commonMain`.
- [x] 4.3 Introduce a common `@Composable` sandbox root that applies sandbox theme, overlay host, and main content.
- [x] 4.4 Replace AndroidX Navigation Compose usage with Compose Multiplatform navigation in `commonMain`.
- [x] 4.5 Refactor `ComponentViewModel` behavior into common state management based on coroutines/StateFlow.
- [x] 4.6 Keep Android ViewModel, Activity, lifecycle retention, and window configuration as Android-only wrappers/adapters.
- [x] 4.7 Remove APK updater from the CMP sandbox pilot scope; common sandbox API must not depend on updater behavior.
- [x] 4.8 Replace Android `painterResource`/`R.drawable` usage in common sandbox UI with CMP-compatible icon/image source usage.
- [x] 4.9 Add or update KDoc for new public common sandbox entrypoints and any compatibility wrappers.

## 5. integration-core:uikit-compose-fixtures

- [x] 5.1 Identify the core stories required by `tokens/sdds.serv.compose/app` pilot.
- [x] 5.2 Move or adapt required fixture story code so `registerCoreStories()` is callable from common app initialization.
- [x] 5.3 Check migrated fixture stories for Android-only sample assets (`R.drawable`, Android `painterResource`, Android resource IDs) and replace them only where those stories must run outside Android.
- [x] 5.4 Keep Android-only fixture code outside common source sets where migration is not required for the pilot.

## 6. tokens:sdds.serv.compose integration

- [x] 6.1 Switch `tokens/sdds.serv.compose/integration` to `convention.cmp-lib`.
- [x] 6.2 Regenerate integration sources from the updated `build-system` generator/templates rather than manually rewriting generated files.
- [x] 6.3 Place regenerated production sources in the appropriate CMP source set layout.
- [x] 6.4 Verify generated theme registration exposes a common function that does not require Activity or Context.
- [x] 6.5 Preserve or generate an Android compatibility extension if needed by existing Android-only callers.
- [x] 6.6 Verify the generated registration uses existing SddsServ CMP theme, colors, gradients, components, and subthemes.

## 7. tokens:sdds.serv.compose app pilot

- [x] 7.1 Switch `tokens/sdds.serv.compose/app` from `convention.sandbox-app` to `convention.cmp-app`.
- [x] 7.2 Add common app initialization that registers SddsServ theme and available core/generated stories before rendering sandbox UI.
- [x] 7.3 Add common app root usage that delegates rendering to `sandbox-compose` common root.
- [x] 7.4 Keep Android manifest, launcher Activity, icons, permissions, and release packaging behavior in Android-specific configuration.
- [x] 7.5 Ensure Android launcher Activity delegates to the common sandbox app root.

## 8. Validation

- [x] 8.1 Run focused Gradle compilation for `integration-core:sandbox-core`, `integration-core:sandbox-ksp`, and `integration-core:sandbox-compose`.
- [x] 8.2 Run focused Gradle compilation for `integration-core:uikit-compose-fixtures` after fixture migration.
- [x] 8.3 Run focused Gradle compilation for `tokens:sdds.serv.compose:integration` and `tokens:sdds.serv.compose:app`.
- [x] 8.4 Install or launch the Android pilot app and verify the sandbox menu opens at least one SddsServ component story.
- [x] 8.5 Run relevant detekt/spotless checks for touched modules.
- [x] 8.6 Record any non-Android target limitations that remain after the pilot.

## Sync Notes

- 2026-07-15: `generateComposeIntegration` is now synced with the CMP pilot path: it auto-detects Kotlin Multiplatform modules, emits generated Compose integration sources to `src/commonMain/kotlin`, and cleans stale generated package output from `src/main`.
- 2026-07-15: `addDefaultTargets()` uses the default Kotlin source set hierarchy; sandbox non-Android actuals are placed in standard target source sets instead of a custom shared `nonAndroidMain`.
- 2026-07-15: `tokens:sdds.serv.compose:integration` was regenerated from the updated generator, formatted with `spotlessApply`, and compiled through `compileCommonMainKotlinMetadata`.
- 2026-07-15: Android runtime launch was verified by Sergey: the sandbox starts and opens stories.
- 2026-07-15: Updater was removed from the CMP pilot scope by product decision; the sandbox migration should not introduce non-Android updater behavior.
- 2026-07-15: `integration-core:uikit-compose-fixtures` now runs `sandbox-ksp` through `kspCommonMainMetadata` and exposes `build/generated/ksp/metadata/commonMain/kotlin` to KMP target compilations; verified by `:uikit-compose-fixtures:compileCommonMainKotlinMetadata` and pilot `:sdds.serv.compose:app:compileKotlinWasmJs`.
- 2026-07-15: Core fixture stories used by the pilot were made common-compatible by replacing Android `R.drawable`/resource helpers with icons-compose/ImageSource-based fixture helpers; Android-only docs/samples remain outside `commonMain`.
- 2026-07-15: KMP fixture changes must preserve existing Android-compatible API surface: deprecated resource overloads such as `ButtonIcons(startRes/endRes)`, `IconButton(iconRes)`, `ComboBoxTextField(iconOpened/iconClosed: Int?)`, and related component overloads stay in Android source sets and delegate to ImageSource-based APIs.
