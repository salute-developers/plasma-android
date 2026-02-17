package com.sdds.playground.sandbox.form

import com.sdds.playground.sandbox.core.compose.UiState

internal data class FormItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val content: String = "Form item text content.\nSecond line text.",
    val title: String = "Title",
    val titleCaption: String = "",
    val caption: String = "Caption",
    val counter: String = "",
    val optional: String = "Optional",
    val hasHint: Boolean = false,
    val hasCaptionIcon: Boolean = true,
    val enabled: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
