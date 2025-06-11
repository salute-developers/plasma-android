package com.sdds.playground.sandbox.list.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ListUiState(
    override val variant: String = "",
    val title: String = "Title",
    val hasDisclosure: Boolean = true,
    val amount: Int = 3,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
