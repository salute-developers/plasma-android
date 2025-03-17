package com.sdds.playground.sandbox.segment.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class SegmentUiState(
    override val variant: String = "",
    val stretch: Boolean = false,
    val hasBackground: Boolean = true,
    val orientation: SegmentOrientation = SegmentOrientation.Horizontal,
    val hasCounter: Boolean = false,
    val hasIcon: Boolean = false,
    val currentSelected: Int = 0,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Ориентация компонента Segment
 */
enum class SegmentOrientation {
    Horizontal,
    Vertical,
}
