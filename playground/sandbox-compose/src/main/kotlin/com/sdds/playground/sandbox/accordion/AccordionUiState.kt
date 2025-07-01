package com.sdds.playground.sandbox.accordion

import com.sdds.playground.sandbox.core.compose.UiState

internal data class AccordionUiState(
    override val variant: String = "",
    val amount: Int = 3,
    val title: String = "Title",
    val contentText: String = "Content text",
    val animation: Boolean = true,
    val hasDivider: Boolean = false,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
