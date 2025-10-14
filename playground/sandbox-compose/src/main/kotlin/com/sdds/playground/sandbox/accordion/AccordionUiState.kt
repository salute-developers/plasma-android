package com.sdds.playground.sandbox.accordion

import com.sdds.playground.sandbox.core.compose.UiState

internal data class AccordionUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 9,
    val title: String = "Title",
    val contentText: String = "Content text",
    val animation: Boolean = true,
    val hasDivider: Boolean = false,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
