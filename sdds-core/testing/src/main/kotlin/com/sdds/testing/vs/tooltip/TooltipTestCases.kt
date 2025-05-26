package com.sdds.testing.vs.tooltip

import android.widget.FrameLayout
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import com.sdds.testing.vs.popover.toGravity

/**
 * Тест-кейсы для компонента [Popover]
 */
@Suppress("UndocumentedPublicFunction")
abstract class TooltipTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2007
     */
    abstract fun testTooltipMStrictBottomEndStartTop()

    /**
     * PLASMA-T2008
     */
    abstract fun testTooltipMStrictTopCenterStartCenter()

    /**
     * PLASMA-T2009
     */
    abstract fun testTooltipSLooseEndStartBottom()

    /**
     * PLASMA-T2010
     */
    abstract fun testTooltipSStrictBottomStartCenterTop()

    /**
     * PLASMA-T2011
     */
    abstract fun testTooltipMLooseStartCenter()

    /**
     * PLASMA-T2012
     */
    abstract fun testTooltipMLooseStartCenterBottom()

    /**
     * PLASMA-T2013
     */
    abstract fun testTooltipMLooseTopEndEndTop()

    /**
     * PLASMA-T2014
     */
    abstract fun testTooltipMLooseStartEndCenter()

    /**
     * PLASMA-T2015
     */
    abstract fun testTooltipMLooseStartCenterEndBottom()

    private fun ComponentScope.baseTooltip(style: Int, state: TooltipUiState) =
        tooltipWithTrigger(
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

    fun ComponentScope.tooltipMStrictBottomEndStartTop(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMStrictTopCenterStartCenter(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipSLooseEndStartBottom(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipSStrictBottomStartCenterTop(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMLooseStartCenter(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMLooseStartCenterBottom(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMLooseTopEndEndTop(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMLooseStartEndCenter(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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

    fun ComponentScope.tooltipMLooseStartCenterEndBottom(style: Int) =
        fillSize {
            baseTooltip(
                style = style,
                state = TooltipUiState(
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
