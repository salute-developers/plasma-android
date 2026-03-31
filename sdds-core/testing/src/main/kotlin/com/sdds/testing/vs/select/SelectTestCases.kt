package com.sdds.testing.vs.select

import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import com.sdds.testing.vs.popover.toGravity
import com.sdds.uikit.Select

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
            WRAP_CONTENT,
            WRAP_CONTENT,
        ).apply {
            gravity = state.triggerAlignment.toGravity()
        }
    }

    fun ComponentScope.selectTextFieldTopStartSingle(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.START_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectButtonTopEnd(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.Button,
                    triggerAlignment = PopoverTriggerAlignment.END_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectTextFieldTopCenterEmptyState(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = true,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.CENTER_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectMultipleTightButtonCenterStrict(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.Button,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectSingleNormalTextFieldCenterStartStrict(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.START_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectSingleTightButtonCenterEndEmptyState(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = true,
                    triggerType = TriggerType.Button,
                    triggerAlignment = PopoverTriggerAlignment.END_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.SINGLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectMultipleNormalTextFieldLoadingBottomStart(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = true,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.START_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectMultipleTightTextFieldBottomEnd(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.END_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectMultipleNormalCenterDisabled(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = false,
                    enabled = false,
                ),
            ).apply {
                id = R.id.select
            }
        }

    fun ComponentScope.selectMultipleNormalCenterReadOnly(style: Int): Select =
        fillSize {
            baseSelect(
                style = style,
                SelectUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    triggerType = TriggerType.TextField,
                    triggerAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                    selectionMode = Select.SelectionMode.MULTIPLE,
                    readOnly = true,
                    enabled = true,
                ),
            ).apply {
                id = R.id.select
            }
        }
}
