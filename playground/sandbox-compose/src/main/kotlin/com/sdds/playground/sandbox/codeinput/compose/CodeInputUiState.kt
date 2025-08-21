package com.sdds.playground.sandbox.codeinput.compose

import com.sdds.compose.uikit.CodeInputCaptionAlignment
import com.sdds.playground.sandbox.core.compose.UiState

internal data class CodeInputUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeInputCaptionAlignment = CodeInputCaptionAlignment.Center,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
