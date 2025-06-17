package com.sdds.playground.sandbox.textskeleton.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class TextSkeletonUiState(
    override val variant: String = "",
    val lineCount: Int = 3,
    val text: String = "",
    val width: TextSkeletonWidth = TextSkeletonWidth.Random,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class TextSkeletonWidth {
    Random,
    FullWidth,
}
