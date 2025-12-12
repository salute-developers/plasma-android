package com.sdds.playground.sandbox.slider.compose

import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.playground.sandbox.core.compose.UiState

internal data class SliderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val limitLabelEnabled: Boolean = true,
    val labelEnabled: Boolean = true,
    val minLabel: String = "0",
    val maxLabel: String = "100",
    val title: String = "Title",
    val thumbEnabled: Boolean = true,
    val slideDirection: SlideDirection = SlideDirection.Normal,
    val alignment: SliderAlignment = SliderAlignment.Start,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
