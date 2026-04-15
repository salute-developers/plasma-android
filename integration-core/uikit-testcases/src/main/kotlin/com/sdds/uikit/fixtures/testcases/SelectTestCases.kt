package com.sdds.uikit.fixtures.testcases

import android.view.ViewGroup
import android.widget.FrameLayout
import com.sdds.uikit.Select
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacementMode
import com.sdds.uikit.fixtures.stories.popover.PopoverTriggerAlignment
import com.sdds.uikit.fixtures.stories.popover.toGravity
import com.sdds.uikit.fixtures.stories.select.SelectUiState
import com.sdds.uikit.fixtures.stories.select.TriggerType
import com.sdds.uikit.fixtures.stories.select.select

/**
 * Тест-кейс для [Select]
 */
@Suppress("UndocumentedPublicFunction")
abstract class SelectTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2578
     */
    abstract fun testSelectSingleNormalXlTextFieldTopStartSingle()

    /**
     * PLASMA-T2579
     */
    abstract fun testSelectSingleTightLButtonTopEnd()

    /**
     * PLASMA-T2580
     */
    abstract fun testSelectMultipleNormalMTextFieldTopCenterEmptyState()

    /**
     * PLASMA-T2581
     */
    abstract fun testSelectMultipleTightSButtonCenterTopStrict()

    /**
     * PLASMA-T2582
     */
    abstract fun testSelectSingleNormalXsTextFieldCenterStartStrict()

    /**
     * PLASMA-T2583
     */
    abstract fun testSelectSingleTightLButtonCenterEndEmptyState()

    /**
     * PLASMA-T2584
     */
    abstract fun testSelectMultipleNormalLTextFieldLoadingBottomStart()

    /**
     * PLASMA-T2585
     */
    abstract fun testSelectMultipleTightLTextFieldBottomEnd()

    /**
     * PLASMA-T2586
     */
    abstract fun testSelectMultipleNormalCenterDisabled()

    /**
     * PLASMA-T2592
     */
    abstract fun testSelectMultipleNormalCenterReadOnly()

    private fun ComponentScope.baseSelect(
        style: Int,
        state: SelectUiState,
    ): Select = select(
        context = context,
        style = style,
        state,
    ).apply {
        layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        ).apply {
            gravity = state.triggerAlignment.toGravity()
        }
            .apply { id = R.id.select }
    }

    fun ComponentScope.selectTextFieldTopStartSingle(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.START_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectButtonTopEnd(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.END_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectTextFieldTopCenterEmptyState(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = true,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectMultipleTightButtonCenterStrict(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectSingleNormalTextFieldCenterStartStrict(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.START_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectSingleTightButtonCenterEndEmptyState(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = true,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.END_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectMultipleNormalTextFieldLoadingBottomStart(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = true,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.START_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectMultipleTightTextFieldBottomEnd(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.END_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            )
        }

    fun ComponentScope.selectMultipleNormalCenterDisabled(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = false,
                ),
            )
        }

    fun ComponentScope.selectMultipleNormalCenterReadOnly(style: Int, triggerType: TriggerType): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = triggerType,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = true,
                    enabled = true,
                ),
            )
        }
}
