package com.sdds.playground.macrobenchmark

import android.content.Intent
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.MacrobenchmarkScope
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SandboxPerformanceBenchmark {

    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun componentsFeedScrolling() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.COMPONENTS_FEED) {
            PerformanceTestCases(this).componentsFeedScrolling()
        }

    @Test
    fun massStateUpdate() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.MASS_STATE_UPDATE) {
            PerformanceTestCases(this).massStateUpdate()
        }

    @Test
    fun modalInteractionCycle() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.MODAL_CYCLE) {
            PerformanceTestCases(this).modalInteractionCycle()
        }

    @Test
    fun popoverTriggerInteractionCycle() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.POPOVER_100_TRIGGERS) {
            PerformanceTestCases(this).popoverTriggerInteractionCycle()
        }

    @Test
    fun popoverTriggersScrolling() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.POPOVER_100_TRIGGERS) {
            PerformanceTestCases(this).popoverTriggersScrolling()
        }

    @Test
    fun bottomSheetWheelInteractionCycle() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.BOTTOM_SHEET_WHEEL) {
            PerformanceTestCases(this).bottomSheetWheelInteractionCycle()
        }

    @Test
    fun tabsListBottomSheetFlow() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.TABS_LIST_BOTTOM_SHEET) {
            PerformanceTestCases(this).tabsListBottomSheetFlow()
        }

    @Test
    fun selectSortingFlow() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.SELECT_SORTING) {
            PerformanceTestCases(this).selectSortingFlow()
        }

    @Test
    fun comboBoxSearchFlow() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.COMBOBOX_SEARCH) {
            PerformanceTestCases(this).comboBoxSearchFlow()
        }

    @Test
    fun cellNotificationActionFlow() =
        measureScenario(PerformanceBenchmarkIds.Scenarios.CELL_NOTIFICATION_ACTION) {
            PerformanceTestCases(this).cellNotificationActionFlow()
        }

    private fun measureScenario(
        scenarioId: String,
        measureBlock: MacrobenchmarkScope.() -> Unit,
    ) {
        benchmarkRule.measureRepeated(
            packageName = PerformanceBenchmarkIds.TARGET_PACKAGE,
            metrics = listOf(FrameTimingMetric()),
            compilationMode = CompilationMode.Full(),
            iterations = ITERATIONS,
            setupBlock = {
                killProcess()
                startScenario(scenarioId)
            },
            measureBlock = measureBlock,
        )
    }

    private fun MacrobenchmarkScope.startScenario(scenarioId: String) {
        val intent = Intent(Intent.ACTION_MAIN).apply {
            setClassName(
                PerformanceBenchmarkIds.TARGET_PACKAGE,
                PerformanceBenchmarkIds.TARGET_ACTIVITY,
            )
            putExtra(PerformanceBenchmarkIds.EXTRA_SCENARIO_ID, scenarioId)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        startActivityAndWait(intent)
        device.waitForIdle()
    }

    private companion object {
        const val ITERATIONS = 3
    }
}
