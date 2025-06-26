package com.sdds.playground.sandbox.dropdownmenu.compose

import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.playground.sandbox.core.compose.UiState
import com.sdds.playground.sandbox.popover.compose.TriggerPlacement

internal data class DropdownMenuUiState(
    override val variant: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Item Title",
    val hasDisclosure: Boolean = true,
    val itemDividerEnabled: Boolean = false,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val alignment: PopoverAlignment = PopoverAlignment.Center,
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
