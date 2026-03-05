package com.sdds.playground.sandbox.carousel.compose

import androidx.compose.foundation.gestures.snapping.SnapPosition
import com.sdds.playground.sandbox.core.compose.UiState

internal data class CarouselUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 10,
    val alignment: CarouselPageAlignment = CarouselPageAlignment.Center,
    val controlsEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
    val indicatorVisibleItemCount: Int = 5,
    val withGap: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class CarouselPageAlignment(val snapPosition: SnapPosition) {
    Start(SnapPosition.Start),
    Center(SnapPosition.Center),
    End(SnapPosition.End),
}
