package com.sdds.playground.sandbox.segment.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class SegmentItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val value: String = "",
    val selected: Boolean = true,
    val startIcon: Boolean = false,
    val endContent: SegmentItemContent = SegmentItemContent.COUNTER,
    val enabled: Boolean = true,
    val count: String = "1",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class SegmentItemContent {
    NONE,
    ICON,
    COUNTER,
}
