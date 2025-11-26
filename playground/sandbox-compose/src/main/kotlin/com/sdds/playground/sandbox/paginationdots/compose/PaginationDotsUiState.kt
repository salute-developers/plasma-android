package com.sdds.playground.sandbox.paginationdots.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class PaginationDotsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 20,
    val visibleItemCount: Int = 9,
    val step: Int = 1,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
