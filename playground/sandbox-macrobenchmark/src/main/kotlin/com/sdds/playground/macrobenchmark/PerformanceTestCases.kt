package com.sdds.playground.macrobenchmark

import android.os.SystemClock
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

    fun popoverTriggersScrolling() {
        scope.requireObject(PerformanceBenchmarkIds.Ui.POPOVER_TRIGGERS_LIST).flingBothWays()
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

    fun tabsListBottomSheetFlow() {
        scope.swipeUntilTextVisible(
            containerTag = PerformanceBenchmarkIds.Ui.TABS_LIST_TABS,
            targetText = TARGET_CATEGORY_TEXT,
            direction = Direction.LEFT,
            swipePercent = TAB_SEARCH_SWIPE_PERCENT,
        )
        scope.requireObject(PerformanceBenchmarkIds.Ui.TABS_LIST_TABS).apply {
            setGestureMargin(visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
            swipe(Direction.LEFT, TAB_CENTERING_SWIPE_PERCENT, CONTROLLED_SWIPE_SPEED_PX_PER_SECOND)
        }
        scope.device.waitForIdle()
        SystemClock.sleep(USER_FLOW_SETTLE_MS)
        scope.selectCatalogCategory(TARGET_CATEGORY_TEXT)

        scope.swipeUntilTextVisible(
            containerTag = PerformanceBenchmarkIds.Ui.TABS_LIST_CONTENT,
            targetText = TARGET_CATALOG_ITEM_TEXT,
            direction = Direction.UP,
            swipePercent = ITEM_SEARCH_SWIPE_PERCENT,
        )
        scope.requireObject(PerformanceBenchmarkIds.Ui.TABS_LIST_CONTENT).apply {
            setGestureMargin(visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
            swipe(Direction.UP, ITEM_CENTERING_SWIPE_PERCENT, CONTROLLED_SWIPE_SPEED_PX_PER_SECOND)
        }
        scope.device.waitForIdle()
        SystemClock.sleep(USER_FLOW_SETTLE_MS)
        scope.openCatalogItem(
            itemText = TARGET_CATALOG_ITEM_TEXT,
            itemTag = PerformanceBenchmarkIds.Ui.TABS_LIST_TARGET_ITEM,
        )
    }

    private fun MacrobenchmarkScope.selectCatalogCategory(categoryText: String) {
        val targetTabCenter = requireText(categoryText, "target category tab").visibleCenter
        check(device.click(targetTabCenter.x, targetTabCenter.y)) {
            "Could not tap the target catalog tab"
        }
        val categoryHeading = "$categoryText products"
        checkNotNull(device.wait(Until.findObject(By.text(categoryHeading)), UI_TIMEOUT_MS)) {
            "Selected category did not change after tapping $targetTabCenter"
        }
        device.waitForIdle()
    }

    private fun MacrobenchmarkScope.openCatalogItem(itemText: String, itemTag: String) {
        requireText(itemText, "catalog item")
        requireObject(itemTag).click()
        requireText(BOTTOM_SHEET_CLOSE_TEXT, "BottomSheet")
        device.waitForIdle()
    }

    fun selectSortingFlow() {
        scope.requireObject(PerformanceBenchmarkIds.Ui.SELECT_TRIGGER).click()
        scope.requireObject(PerformanceBenchmarkIds.Ui.SELECT_TARGET_ITEM).click()
        scope.requireObject(PerformanceBenchmarkIds.Ui.SELECT_RESULT)
        scope.requireGone(PerformanceBenchmarkIds.Ui.SELECT_TARGET_ITEM, "Select")
        scope.device.waitForIdle()
    }

    fun comboBoxSearchFlow() {
        scope.requireObject(PerformanceBenchmarkIds.Ui.COMBOBOX_INPUT).apply {
            click()
            text = COMBOBOX_QUERY
        }
        scope.device.waitForIdle()
        scope.requireObject(PerformanceBenchmarkIds.Ui.COMBOBOX_TARGET_ITEM).click()
        scope.requireObject(PerformanceBenchmarkIds.Ui.COMBOBOX_RESULT)
        scope.requireGone(PerformanceBenchmarkIds.Ui.COMBOBOX_TARGET_ITEM, "ComboBox")
        scope.device.waitForIdle()
    }

    fun cellNotificationActionFlow() {
        scope.flingUntilVisible(
            containerTag = PerformanceBenchmarkIds.Ui.CELL_NOTIFICATION_LIST,
            targetTag = PerformanceBenchmarkIds.Ui.CELL_NOTIFICATION_TARGET,
            direction = Direction.UP,
        ).click()
        scope.requireObject(PerformanceBenchmarkIds.Ui.NOTIFICATION_CONTENT)
        scope.device.waitForIdle()
        scope.requireObject(PerformanceBenchmarkIds.Ui.NOTIFICATION_CONFIRM_BUTTON).click()
        scope.requireGone(PerformanceBenchmarkIds.Ui.NOTIFICATION_CONTENT, "Notification")
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

    private fun MacrobenchmarkScope.requireText(text: String, componentName: String): UiObject2 =
        checkNotNull(device.wait(Until.findObject(By.text(text)), UI_TIMEOUT_MS)) {
            "$componentName text '$text' was not found within $UI_TIMEOUT_MS ms"
        }

    private fun UiObject2.flingBothWays() {
        setGestureMargin(visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
        repeat(FEED_FLING_COUNT) { fling(Direction.UP) }
        repeat(FEED_FLING_COUNT) { fling(Direction.DOWN) }
    }

    private fun MacrobenchmarkScope.flingUntilVisible(
        containerTag: String,
        targetTag: String,
        direction: Direction,
    ): UiObject2 {
        val container = requireObject(containerTag)
        repeat(MAX_USER_FLOW_FLING_COUNT) {
            device.findObject(By.res(targetTag))?.let { return it }
            container.setGestureMargin(container.visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
            container.fling(direction)
            device.waitForIdle()
        }
        return requireObject(targetTag)
    }

    private fun MacrobenchmarkScope.swipeUntilTextVisible(
        containerTag: String,
        targetText: String,
        direction: Direction,
        swipePercent: Float,
        speed: Int = CONTROLLED_SWIPE_SPEED_PX_PER_SECOND,
    ): UiObject2 {
        val container = requireObject(containerTag)
        repeat(MAX_USER_FLOW_SWIPE_COUNT) {
            device.findObject(By.text(targetText))?.let { return it }
            container.setGestureMargin(container.visibleBounds.width() / GESTURE_MARGIN_DIVISOR)
            container.swipe(direction, swipePercent, speed)
            device.waitForIdle()
            SystemClock.sleep(USER_FLOW_STEP_SETTLE_MS)
        }
        return requireText(targetText, "scroll target")
    }

    private companion object {
        const val INTERACTION_COUNT = 5
        const val POPOVER_INTERACTION_COUNT = 5
        const val STATE_UPDATE_COUNT = 10
        const val FEED_FLING_COUNT = 3
        const val GESTURE_MARGIN_DIVISOR = 5
        const val MAX_USER_FLOW_FLING_COUNT = 4
        const val MAX_USER_FLOW_SWIPE_COUNT = 8
        const val TAB_SEARCH_SWIPE_PERCENT = 0.25f
        const val TAB_CENTERING_SWIPE_PERCENT = 0.25f
        const val ITEM_SEARCH_SWIPE_PERCENT = 0.2f
        const val ITEM_CENTERING_SWIPE_PERCENT = 0.1f
        const val USER_FLOW_STEP_SETTLE_MS = 200L
        const val USER_FLOW_SETTLE_MS = 500L
        const val CONTROLLED_SWIPE_SPEED_PX_PER_SECOND = 1_000
        const val COMBOBOX_QUERY = "mos"
        const val TARGET_CATEGORY_TEXT = "Category 7"
        const val TARGET_CATALOG_ITEM_TEXT = "Category 7 item 13"
        const val BOTTOM_SHEET_CLOSE_TEXT = "Close"
        const val UI_TIMEOUT_MS = 5_000L
    }
}
