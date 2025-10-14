package com.sdds.playground.sandbox.rectskeleton.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class RectSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
