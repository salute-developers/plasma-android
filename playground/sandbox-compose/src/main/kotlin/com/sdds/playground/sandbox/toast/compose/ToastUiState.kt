package com.sdds.playground.sandbox.toast.compose

import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.playground.sandbox.core.compose.UiState

internal data class ToastUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val text: String = "Toast Text",
    val hasContentStart: Boolean = true,
    val hasContentEnd: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
    val autoDismiss: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
