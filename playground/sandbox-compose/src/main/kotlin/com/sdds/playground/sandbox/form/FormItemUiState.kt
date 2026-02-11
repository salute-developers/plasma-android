package com.sdds.playground.sandbox.form

import com.sdds.compose.uikit.FormBottomTextAlignment
import com.sdds.playground.sandbox.core.compose.UiState

internal data class FormItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val content: String = "Form item text content.\nSecond line text.",
    val title: String = "Title",
    val titleCaption: String = "TitleCaption",
    val caption: String = "Caption",
    val counter: String = "Counter",
    val optional: String = "Optional",
    val hasHint: Boolean = true,
    val hasCaptionIcon: Boolean = true,
    val enabled: Boolean = true,
    val bottomTextAlignment: FormBottomTextAlignment = FormBottomTextAlignment.Edge,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
