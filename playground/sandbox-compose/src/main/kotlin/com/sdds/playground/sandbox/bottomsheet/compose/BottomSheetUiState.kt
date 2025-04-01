package com.sdds.playground.sandbox.bottomsheet.compose

import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние BottomSheet
 */
internal data class BottomSheetUiState(
    override val variant: String = "",
    val header: Boolean = false,
    val footer: Boolean = false,
    val fixedHeader: Boolean = false,
    val fixedFooter: Boolean = false,
    val handlePlacement: BottomSheetHandlePlacement = BottomSheetHandlePlacement.Auto,
    val fitContent: Boolean = false,
    val littleContent: Boolean = false,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
