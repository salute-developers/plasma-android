package com.sdds.playground.sandbox.scrollbar.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента ScrollBar
 */
internal data class ScrollBarUiState(
    override val variant: String = "",
    val lazy: Boolean = true,
    val itemCount: Int = 30,
    val hoverExpand: Boolean = true,
    val hasTrack: Boolean = true,
    val alwaysShowScrollbar: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
