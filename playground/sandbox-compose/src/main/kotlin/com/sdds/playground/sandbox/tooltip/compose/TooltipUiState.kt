package com.sdds.playground.sandbox.tooltip.compose

import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.playground.sandbox.core.compose.UiState
import com.sdds.playground.sandbox.popover.compose.TriggerPlacement

internal data class TooltipUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
    val alignment: PopoverAlignment = PopoverAlignment.Start,
    val placement: PopoverPlacement = PopoverPlacement.Top,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val autoHide: Boolean = false,
    val text: String = "Tooltip text you can replace",
    val hasContentStart: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
