package com.sdds.playground.sandbox.list.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ListUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val hasDisclosure: Boolean = true,
    val amount: Int = 3,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
