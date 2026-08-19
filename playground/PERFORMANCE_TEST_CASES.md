# Plasma Android performance test cases

The suite contains five deterministic Macrobenchmark cases. Network access is forbidden. A complete reference is produced from one run of all five cases on one physical device.

## PERF-01 — Components feed scrolling

- Scenario ID: `perf-components-feed`
- Load: 200 `Cell` items in a `LazyColumn`
- Action: three downward and three upward flings
- Purpose: detect regressions in composition, layout and drawing of repeated design-system components

## PERF-02 — Mass state update

- Scenario ID: `perf-mass-state-update`
- Load: an immutable selection state for 100 `Cell` + `CheckBox` rows in a `LazyColumn`
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

## PERF-05 — BottomSheet with Wheel interaction cycle

- Scenario ID: `perf-bottom-sheet-wheel`
- Load: a `ModalBottomSheet` containing a single `Wheel` with 100 deterministic items
- Action: open the BottomSheet, fling the Wheel once and close the BottomSheet; repeat five times
- Purpose: detect regressions in BottomSheet animation, Wheel layout and Wheel scrolling
- Style: `ModalBottomSheet` uses the `sdds.serv` style; `Wheel` uses a local deterministic style because `sdds.serv` has no Wheel style

## Metrics and execution policy

- Metric: `FrameTimingMetric`
- Primary signal: `frameOverrunMs` P95
- Diagnostics: `frameOverrunMs` P50/P90/P99, `frameDurationCpuMs` P50/P90/P95/P99 and `frameCount`
- Build: non-debuggable, profileable `benchmark` variant derived from `release`, with R8 enabled
- Compilation: `CompilationMode.Full`
- Iterations: 5 measured iterations
- Gate: disabled until device-specific noise has been calibrated

## Code structure

- `PerformanceScenarioTags` — test tags exposed by the target application
- `PerformanceBenchmarkIds` — target package, scenario IDs and UI resource IDs used by Macrobenchmark
- `PerformanceTestCases` — deterministic measured actions and waits
- `SandboxPerformanceBenchmark` — JUnit entry points and measurement configuration only
- `scenarios/performance` — isolated target screens measured by the suite

## Create one reference snapshot

No Python, Node.js or third-party packages are required.

1. Run all five methods from `SandboxPerformanceBenchmark` on one physical device.
2. Open `playground/performance-report/generate_reference_report.html` in a current Chrome or Edge browser.
3. Select the AndroidX artifacts directory containing `*benchmarkData.json` and `*.perfetto-trace`.
4. Fill in the reference label, Git branch and commit.
5. Review the automatic jank summary and the worst iteration selected for each case.
6. Click **Сохранить полный snapshot** and select the parent directory for the snapshot.

All input files are processed locally in the browser and are not uploaded anywhere. The input may contain a single case, any subset of the suite, or all five cases. A partial run is marked explicitly and can be saved, but only a run containing all five cases is a complete suite reference. The generator still fails on duplicate cases, a missing trace for a present case, mixed devices or JSON without any supported case.

Output:

```text
<new-reference-directory>/
  index.html
  reference.json
  raw/
  traces/
```

The snapshot intentionally contains no graphs or accumulated history. Keep the whole directory as one immutable reference for the device and commit recorded in `reference.json`.

The report additionally calculates the share of raw frames with `frameOverrunMs > 0`, per-iteration P50/P95/P99/max values and the worst iteration by P95. The recommended trace link identifies where manual Perfetto analysis should start. These diagnostics do not replace baseline comparison and cannot determine the root cause without opening the trace.
