package com.sdds.playground.sandbox.codefield.compose

import com.sdds.compose.uikit.CodeFieldCaptionAlignment
import com.sdds.playground.sandbox.core.compose.UiState

internal data class CodeFieldUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeFieldCaptionAlignment = CodeFieldCaptionAlignment.Center,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
