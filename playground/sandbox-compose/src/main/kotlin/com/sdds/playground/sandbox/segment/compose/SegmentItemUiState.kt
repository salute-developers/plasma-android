package com.sdds.playground.sandbox.segment.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class SegmentItemUiState(
    override val variant: String = "",
    val label: String = "Label",
    val value: String = "",
    val startContent: SegmentItemContent = SegmentItemContent.NONE,
    val endContent: SegmentItemContent = SegmentItemContent.COUNTER,
    val enabled: Boolean = true,
    val count: String = "1",
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class SegmentItemContent {
    NONE,
    ICON,
    COUNTER,
}
