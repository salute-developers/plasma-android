package com.sdds.playground.sandbox.drawer.compose

import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние BottomSheet
 */
internal data class DrawerUiState(
    override val variant: String = "",
    val alignment: DrawerAlignment = DrawerAlignment.Bottom,
    val closeIconAlignment: CloseIconAlignment = CloseIconAlignment.End,
    val closeIconAbsolute: Boolean = false,
    val header: Boolean = false,
    val footer: Boolean = false,
    val hasOverlay: Boolean = true,
    val hasPeekOffset: Boolean = false,
    val gesturesEnabled: Boolean = true,
    val moveContentEnabled: Boolean = false,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
