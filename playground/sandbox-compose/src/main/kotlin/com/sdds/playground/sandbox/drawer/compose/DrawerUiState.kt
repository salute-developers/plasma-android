package com.sdds.playground.sandbox.drawer.compose

import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние BottomSheet
 */
internal data class DrawerUiState(
    override val variant: String = "",
    val alignment: DrawerAlignment = DrawerAlignment.Bottom,
    val closeIconPlacement: CloseIconPlacement = CloseIconPlacement.End,
    val header: Boolean = false,
    val footer: Boolean = false,
    val hasOverlay: Boolean = false,
    val hasClose: Boolean = false,
    val hasPeekOffset: Boolean = false,
    val gesturesEnabled: Boolean = true,
    val moveContentEnabled: Boolean = false,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
