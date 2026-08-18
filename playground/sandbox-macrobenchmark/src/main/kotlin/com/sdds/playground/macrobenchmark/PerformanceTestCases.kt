package com.sdds.playground.macrobenchmark

import androidx.benchmark.macro.MacrobenchmarkScope
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.Until

/** Deterministic user actions measured by [SandboxPerformanceBenchmark]. */
internal class PerformanceTestCases(
    private val scope: MacrobenchmarkScope,
) {
    fun componentsFeedScrolling() {
        scope.requireObject(PerformanceBenchmarkIds.Ui.COMPONENTS_FEED).flingBothWays()
    }

    fun massStateUpdate() {
        val updateButton = scope.requireObject(PerformanceBenchmarkIds.Ui.MASS_UPDATE_BUTTON)
        repeat(STATE_UPDATE_COUNT) {
            updateButton.click()
            scope.device.waitForIdle()
        }
    }

    fun modalInteractionCycle() {
        repeat(INTERACTION_COUNT) {
            scope.requireObject(PerformanceBenchmarkIds.Ui.MODAL_OPEN_BUTTON).click()
            scope.requireObject(PerformanceBenchmarkIds.Ui.MODAL_CONTENT)
            scope.device.waitForIdle()
            scope.requireObject(PerformanceBenchmarkIds.Ui.MODAL_CLOSE_BUTTON).click()
            scope.requireGone(PerformanceBenchmarkIds.Ui.MODAL_CONTENT, "Modal")
        }
    }

    fun popoverTriggerInteractionCycle() {
        repeat(POPOVER_INTERACTION_COUNT) { index ->
            scope.requireObject("${PerformanceBenchmarkIds.Ui.POPOVER_TRIGGER_PREFIX}_${index + 1}").click()
            scope.requireObject(PerformanceBenchmarkIds.Ui.POPOVER_CONTENT)
            scope.device.waitForIdle()
            scope.device.pressBack()
            scope.requireGone(PerformanceBenchmarkIds.Ui.POPOVER_CONTENT, "Popover")
        }
    }

    fun bottomSheetWheelInteractionCycle() {
        repeat(INTERACTION_COUNT) {
            scope.requireObject(PerformanceBenchmarkIds.Ui.BOTTOM_SHEET_OPEN_BUTTON).click()
            scope.requireObject(PerformanceBenchmarkIds.Ui.BOTTOM_SHEET_CONTENT)
            scope.device.waitForIdle()
            scope.requireObject(PerformanceBenchmarkIds.Ui.BOTTOM_SHEET_WHEEL).apply {
                setGestureMargin(visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
                fling(Direction.UP)
            }
            scope.device.waitForIdle()
            scope.requireObject(PerformanceBenchmarkIds.Ui.BOTTOM_SHEET_CLOSE_BUTTON).click()
            scope.requireGone(PerformanceBenchmarkIds.Ui.BOTTOM_SHEET_CONTENT, "BottomSheet")
        }
    }

    private fun MacrobenchmarkScope.requireObject(tag: String): UiObject2 =
        checkNotNull(device.wait(Until.findObject(By.res(tag)), UI_TIMEOUT_MS)) {
            "UI object with resource name '$tag' was not found within $UI_TIMEOUT_MS ms"
        }

    private fun MacrobenchmarkScope.requireGone(tag: String, componentName: String) {
        check(device.wait(Until.gone(By.res(tag)), UI_TIMEOUT_MS)) {
            "$componentName did not close within $UI_TIMEOUT_MS ms"
        }
    }

    private fun UiObject2.flingBothWays() {
        setGestureMargin(visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
        repeat(FEED_FLING_COUNT) { fling(Direction.UP) }
        repeat(FEED_FLING_COUNT) { fling(Direction.DOWN) }
    }

    private companion object {
        const val INTERACTION_COUNT = 5
        const val POPOVER_INTERACTION_COUNT = 5
        const val STATE_UPDATE_COUNT = 10
        const val FEED_FLING_COUNT = 3
        const val GESTURE_MARGIN_DIVISOR = 5
        const val UI_TIMEOUT_MS = 5_000L
    }
}
