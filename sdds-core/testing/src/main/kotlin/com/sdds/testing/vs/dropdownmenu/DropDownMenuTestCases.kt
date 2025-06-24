package com.sdds.testing.vs.dropdownmenu

import android.view.View
import android.widget.FrameLayout
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import com.sdds.testing.vs.popover.toGravity
import com.sdds.uikit.colorstate.ColorState

/**
 * Тест-кейсы для [DropDownMenu]
 */
@Suppress("UndocumentedPublicFunction")
abstract class DropDownMenuTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2081
     */
    abstract fun testDropDownMenuXlHasLooseStartTop()

    /**
     * PLASMA-T2082
     */
    abstract fun testDropDownMenuLPositiveStrictStartCenter()

    /**
     * PLASMA-T2083
     */
    abstract fun testDropDownMenuMNegativeStrictStartBottom()

    /**
     * PLASMA-T2084
     */
    abstract fun testDropDownMenuSNoTextNoDisclosureStrictCenterTop()

    /**
     * PLASMA-T2085
     */
    abstract fun testDropDownMenuXsStrictCenter()

    /**
     * PLASMA-T2086
     */
    abstract fun testDropDownMenuXlAmountTwentyLooseCenterBottom()

    /**
     * PLASMA-T2087
     */
    abstract fun testDropDownMenuXlLooseEndTop()

    /**
     * PLASMA-T2088
     */
    abstract fun testDropDownMenuXlStrictEndCenter()

    /**
     * PLASMA-T2089
     */
    abstract fun testDropDownMenuXlLooseEndBottom()

    /**
     * PLASMA-T2090
     */
    abstract fun testDropDownMenuTightXsStrictCenter()

    private fun ComponentScope.baseDropDown(
        style: Int,
        state: DropdownMenuUiState,
        colorState: ColorState? = null,
    ) = dropdownMenuTrigger(
        context = context,
        style = style,
        state = state,
        colorState = colorState,
    ).trigger.apply {
        layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )
            .apply {
                gravity = state.triggerAlignment.toGravity()
            }
    }

    fun ComponentScope.dropDownMenuXlHasLooseStartTop(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.START_TOP,
                ),
            )
        }

    fun ComponentScope.dropDownMenuLPositiveStrictStartCenter(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.TOP,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.START_CENTER,
                ),
            )
        }

    fun ComponentScope.dropDownMenuMNegativeStrictStartBottom(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.END,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.END,
                    triggerAlignment = PopoverTriggerAlignment.START_BOTTOM,
                ),
            )
        }

    fun ComponentScope.dropDownMenuSNoTextNoDisclosureStrictCenterTop(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "",
                    hasDisclosure = false,
                    itemDividerEnabled = true,
                    placement = PopoverPlacement.BOTTOM,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.START,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_TOP,
                ),
            )
        }

    fun ComponentScope.dropDownMenuXsStrictCenter(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = false,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                ),
            )
        }

    fun ComponentScope.dropDownMenuXlAmountTwentyLooseCenterBottom(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 20,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_BOTTOM,
                ),
            )
        }

    fun ComponentScope.dropDownMenuXlLooseEndTop(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = true,
                    placement = PopoverPlacement.START,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.END_TOP,
                ),
            )
        }

    fun ComponentScope.dropDownMenuXlStrictEndCenter(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 10,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.TOP,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.END_CENTER,
                ),
            )
        }

    fun ComponentScope.dropDownMenuXlLooseEndBottom(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.BOTTOM,
                    placementMode = PopoverPlacementMode.LOOSE,
                    alignment = PopoverAlignment.END,
                    triggerAlignment = PopoverTriggerAlignment.END_BOTTOM,
                ),
            )
        }

    fun ComponentScope.dropDownMenuTightXsStrictCenter(style: Int, colorState: ColorState): View =
        fillSize {
            baseDropDown(
                style = style,
                colorState = colorState,
                state = DropdownMenuUiState(
                    variant = "",
                    colorVariant = "",
                    amount = 3,
                    itemTitle = "Title",
                    hasDisclosure = true,
                    itemDividerEnabled = false,
                    placement = PopoverPlacement.TOP,
                    placementMode = PopoverPlacementMode.STRICT,
                    alignment = PopoverAlignment.CENTER,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                ),
            )
        }
}
