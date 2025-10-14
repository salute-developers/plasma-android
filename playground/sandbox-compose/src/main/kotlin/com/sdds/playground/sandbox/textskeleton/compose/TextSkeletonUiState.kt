package com.sdds.playground.sandbox.textskeleton.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class TextSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val lineCount: Int = 3,
    val text: String = "",
    val width: TextSkeletonWidth = TextSkeletonWidth.Random,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class TextSkeletonWidth {
    Random,
    FullWidth,
}
