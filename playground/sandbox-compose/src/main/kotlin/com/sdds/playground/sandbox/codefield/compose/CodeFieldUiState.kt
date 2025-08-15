package com.sdds.playground.sandbox.codefield.compose

import androidx.compose.ui.Alignment
import com.sdds.playground.sandbox.core.compose.UiState

internal data class CodeFieldUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CaptionAlignment = CaptionAlignment.Center,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class CaptionAlignment(val alignment: Alignment.Horizontal) {
    Start(Alignment.Start),
    Center(Alignment.CenterHorizontally),
}
