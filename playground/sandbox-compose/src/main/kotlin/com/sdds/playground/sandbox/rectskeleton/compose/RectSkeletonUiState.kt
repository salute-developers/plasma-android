package com.sdds.playground.sandbox.rectskeleton.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class RectSkeletonUiState(
    override val variant: String = "",
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
