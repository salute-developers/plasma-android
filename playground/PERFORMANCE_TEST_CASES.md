# Plasma Android performance test cases

The suite contains ten deterministic Macrobenchmark cases. Network access is forbidden. A complete reference is produced from one run of all ten cases on one physical device.

## PERF-01 — Components feed scrolling

- Scenario ID: `perf-components-feed`
- Load: 200 `Cell` items in a `LazyColumn`
- Action: three downward and three upward flings
- Purpose: detect regressions in composition, layout and drawing of repeated design-system components

## PERF-02 — Mass state update

- Scenario ID: `perf-mass-state-update`
- Load: an immutable selection state for 20 `Cell` + `CheckBox` rows in a `LazyColumn`
- Action: select all and clear all ten times
- Purpose: measure a realistic list state update while Compose renders only visible rows

## PERF-03 — Modal interaction cycle

- Scenario ID: `perf-modal-cycle`
- Load: a deterministic performance-only `Modal` fixture
- Action: open and close the Modal five times
- Purpose: detect regressions in overlay creation, transition and disposal without depending on functional integration scenarios

## PERF-04 — Popover trigger interaction cycle

- Scenario ID: `perf-popover-100-triggers`
- Load: a `LazyColumn` containing 100 deterministic triggers, each with its own `Popover`
- Action: sequentially open and dismiss Popovers attached to the first five triggers; scrolling is excluded
- Purpose: detect regressions in popup creation, positioning, transition and disposal across multiple anchors

## PERF-05 — Popover triggers scrolling

- Scenario ID: `perf-popover-100-triggers`
- Load: a `LazyColumn` containing 100 deterministic triggers, each with its own `Popover`
- Action: three downward and three upward flings; Popovers are not opened
- Purpose: detect scrolling regressions caused by trigger measurement, positioning and repeated layout work

## PERF-06 — BottomSheet with Wheel interaction cycle

- Scenario ID: `perf-bottom-sheet-wheel`
- Load: a `ModalBottomSheet` containing a single `Wheel` with 100 deterministic items
- Action: open the BottomSheet, fling the Wheel once and close the BottomSheet; repeat five times
- Purpose: detect regressions in BottomSheet animation, Wheel layout and Wheel scrolling
- Style: `ModalBottomSheet` uses the `sdds.serv` style; `Wheel` uses a local deterministic style because `sdds.serv` has no Wheel style

## PERF-07 — Tabs, List and BottomSheet user flow

- Scenario ID: `perf-tabs-list-bottom-sheet`
- Load: eight horizontally scrollable `Tabs` and a design-system `List` with 30 `ListItem` entries
- Action: scroll Tabs, choose the target category, scroll the List, open the target ListItem in a BottomSheet
- Purpose: measure a short catalog journey spanning navigation, lazy list scrolling and opening item details

## PERF-08 — Select sorting flow

- Scenario ID: `perf-select-sorting`
- Load: a single-choice `Select` containing eight realistic sorting options
- Action: open Select and choose `Newest first`
- Purpose: measure popup creation, option selection, state update and dropdown disposal in a focused user action

## PERF-09 — ComboBox search flow

- Scenario ID: `perf-combobox-search`
- Load: a `ComboBox` containing 20 city options
- Action: focus the field, enter `mos` through UI Automator and choose `Moscow`
- Purpose: measure editable-field interaction, filtering, dropdown update and result selection
- Stability note: the same device keyboard and keyboard settings must be used when recording and comparing a reference

## PERF-10 — Cell and Notification action flow

- Scenario ID: `perf-cell-notification-action`
- Load: a `LazyColumn` containing 30 `Cell` entries and a persistent action `Notification`
- Action: scroll to the target Cell, invoke its action, wait for Notification and press `Confirm`
- Purpose: measure a realistic list-item action, overlay appearance, button interaction and overlay disposal

## Metrics and execution policy

- Metric: `FrameTimingMetric`
- Primary signal: `frameOverrunMs` P95
- Diagnostics: `frameOverrunMs` P50/P90/P99, `frameDurationCpuMs` P50/P90/P95/P99 and `frameCount`
- Build: non-debuggable, profileable `benchmark` variant derived from `release`, with R8 enabled
- Compilation: `CompilationMode.Full`
- Iterations: 3 measured iterations
- Gate: disabled until device-specific noise has been calibrated

## Code structure

- `PerformanceScenarioTags` — test tags exposed by the target application
- `PerformanceBenchmarkIds` — target package, scenario IDs and UI resource IDs used by Macrobenchmark
- `PerformanceTestCases` — deterministic measured actions and waits
- `SandboxPerformanceBenchmark` — the ten reference JUnit entry points and shared measurement configuration
- `scenarios/performance` — isolated target screens measured by the suite

## Automated reference workflow

No Python, Node.js or third-party packages are required.

Run commands from the `playground` directory.

### Record the first accepted reference

```shell
./gradlew :sandbox-macrobenchmark:recordPerformanceReference
```

On Windows use `gradlew.bat`. The task runs all ten benchmarks and requires a complete suite. It then records an explicit device-specific reference outside `build`:

```text
playground/performance-references/<device-model>/
  index.html
  reference.json
  metadata.json
```

`index.html` is autonomous and can be opened directly in a browser. `reference.json` is the unmodified AndroidX benchmark JSON used for future comparisons. Recording is a separate explicit task so a normal benchmark run never overwrites the accepted reference. Record from a committed revision whenever reproducibility matters; the report and `metadata.json` contain the branch, commit and dirty-working-tree flag. Commit the reference directory when the baseline must be shared by the team; Git history then records accepted reference changes.

### Run and compare with the reference

```shell
./gradlew :sandbox-macrobenchmark:runPerformanceBenchmarks
```

The task runs the full suite, finds the reference for the connected device model and creates:

```text
playground/sandbox-macrobenchmark/build/reports/performance/<device-model>/
  index.html
  current.json
  metadata.json
```

Open `index.html` directly. Its dashboard contains:

- a scenario ranking by current `frameOverrunMs P95`
- a solid current-value bar and a dashed saved-reference marker
- absolute and percentage deltas with `STABLE`, `IMPROVED` or `REGRESSION` status
- a per-iteration `frameOverrunMs P95` heatmap calculated from raw frame arrays
- collapsible metric guidance, detailed P50/P90/P95/P99 values, exact reference comparison and environment data

The visual ranking uses P95 as the primary signal, while the status also considers CPU P95 and jank rate. P50, P90, P99, frame count and per-iteration stability remain available for diagnosis. A comparison is disabled and marked incompatible when the device, build fingerprint, compilation mode, measured iteration count, `cpuLocked` or CPU maximum frequencies differ.

The default report marks a regression candidate when at least one condition is true:

- `frameOverrunMs P95` increases by more than `max(3 ms, 15%)`
- `frameDurationCpuMs P95` increases by more than `max(2 ms, 15%)`
- calculated jank rate increases by more than 5 percentage points

`IMPROVED` uses the same thresholds in the opposite direction. Smaller changes remain `STABLE` because they may be device noise.

The task reports candidates without failing the build. Use `-PfailOnPerformanceRegression=true` when a non-zero Gradle result is required.

### Rebuild a report without running the device

```shell
./gradlew :sandbox-macrobenchmark:generatePerformanceReport
```

This reads the latest JSON already present in `sandbox-macrobenchmark/build`, compares it with the saved reference and regenerates the autonomous HTML.

All processing is local. The automated report intentionally contains no accumulated history or Perfetto files. AndroidX still creates Perfetto traces in the module `build` directory; keep a trace separately when the root cause of a regression must be investigated.
