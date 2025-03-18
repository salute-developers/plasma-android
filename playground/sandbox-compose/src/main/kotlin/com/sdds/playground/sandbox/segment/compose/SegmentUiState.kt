package com.sdds.playground.sandbox.segment.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class SegmentUiState(
    override val variant: String = "",
    val enabled: Boolean = true,
    val amount: Int = 2,
    val stretch: Boolean = false,
    val hasBackground: Boolean = true,
    val orientation: SegmentOrientation = SegmentOrientation.Horizontal,
    val currentSelected: Int = 0,
    val label: String = "Label",
    val value: String = "",
    val startIcon: Boolean = false,
    val endContent: SegmentItemContent = SegmentItemContent.COUNTER,
    val count: String = "1",
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
