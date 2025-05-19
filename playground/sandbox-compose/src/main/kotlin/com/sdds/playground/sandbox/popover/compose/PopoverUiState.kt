package com.sdds.playground.sandbox.popover.compose

import androidx.compose.ui.Alignment
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.playground.sandbox.core.compose.UiState

internal data class PopoverUiState(
    override val variant: String = "",
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
    val tailAlignment: PopoverAlignment = PopoverAlignment.Center,
    val placement: PopoverPlacement = PopoverPlacement.Top,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val hideMode: HideMode = HideMode.OnTapOnly,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class TriggerPlacement {
    TopStart,
    TopCenter,
    TopEnd,
    CenterStart,
    Center,
    CenterEnd,
    BottomStart,
    BottomCenter,
    BottomEnd,
}

internal fun TriggerPlacement.toAlignment(): Alignment {
    return when (this) {
        TriggerPlacement.TopStart -> Alignment.TopStart
        TriggerPlacement.TopCenter -> Alignment.TopCenter
        TriggerPlacement.TopEnd -> Alignment.TopEnd
        TriggerPlacement.CenterStart -> Alignment.CenterStart
        TriggerPlacement.Center -> Alignment.Center
        TriggerPlacement.CenterEnd -> Alignment.CenterEnd
        TriggerPlacement.BottomStart -> Alignment.BottomStart
        TriggerPlacement.BottomCenter -> Alignment.BottomCenter
        TriggerPlacement.BottomEnd -> Alignment.BottomEnd
    }
}

internal enum class HideMode {
    AutoHide, OnTapOnly
}

internal fun HideMode.toMs(): Long? = when (this) {
    HideMode.AutoHide -> 3000L
    HideMode.OnTapOnly -> null
}
