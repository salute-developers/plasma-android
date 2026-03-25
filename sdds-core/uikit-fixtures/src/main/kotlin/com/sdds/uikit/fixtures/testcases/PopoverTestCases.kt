package com.sdds.uikit.fixtures.testcases

import android.widget.FrameLayout
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.popover.PopoverAlignment
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacement
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacementMode
import com.sdds.uikit.fixtures.stories.popover.PopoverTriggerAlignment
import com.sdds.uikit.fixtures.stories.popover.PopoverUiState
import com.sdds.uikit.fixtures.stories.popover.popoverWithTrigger
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * Тест-кейсы для компонента [Popover]
 */
@Suppress("UndocumentedPublicFunction")
abstract class PopoverTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2007
     */
    abstract fun testPopoverMDefaultStrictBottomEndStartTop()

    /**
     * PLASMA-T2008
     */
    abstract fun testPopoverMAccentStrictTopCenterStartCenter()

    /**
     * PLASMA-T2009
     */
    abstract fun testPopoverSDefaultLooseEndStartBottom()

    /**
     * PLASMA-T2010
     */
    abstract fun testPopoverSAccentStrictBottomStartCenterTop()

    /**
     * PLASMA-T2011
     */
    abstract fun testPopoverMDefaultLooseStartCenter()

    /**
     * PLASMA-T2012
     */
    abstract fun testPopoverMDefaultLooseStartCenterBottom()

    /**
     * PLASMA-T2013
     */
    abstract fun testPopoverMDefaultLooseTopEndEndTop()

    /**
     * PLASMA-T2014
     */
    abstract fun testPopoverMDefaultLooseStartEndCenter()

    /**
     * PLASMA-T2015
     */
    abstract fun testPopoverMDefaultLooseStartCenterEndBottom()

    private fun ComponentScope.basePopover(style: Int, state: PopoverUiState) =
        popoverWithTrigger(
            context = context,
            style = style,
            state = state,
        ).trigger.apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
            )
                .apply {
                    gravity = state.triggerAlignment.toGravity()
                }
        }

    fun ComponentScope.popoverMDefaultStrictBottomEndStartTop(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.BOTTOM,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.END,
                    triggerAlignment = PopoverTriggerAlignment.START_TOP,
                    triggerCentered = true,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMAccentStrictTopCenterStartCenter(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.TOP,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.START_CENTER,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = false,
                ),
            )
        }

    fun ComponentScope.popoverSDefaultLooseEndStartBottom(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.END,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.END,
                    triggerAlignment = PopoverTriggerAlignment.START_BOTTOM,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverSAccentStrictBottomStartCenterTop(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.BOTTOM,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_TOP,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMDefaultLooseStartCenter(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMDefaultLooseStartCenterBottom(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_BOTTOM,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMDefaultLooseTopEndEndTop(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.TOP,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.END,
                    triggerAlignment = PopoverTriggerAlignment.END_TOP,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMDefaultLooseStartEndCenter(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.END_CENTER,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }

    fun ComponentScope.popoverMDefaultLooseStartCenterEndBottom(style: Int) =
        fillSize {
            basePopover(
                style = style,
                state = PopoverUiState(
                    variant = "",
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.END_BOTTOM,
                    triggerCentered = false,
                    autoDismiss = false,
                    tailEnabled = true,
                ),
            )
        }
}
