package com.sdds.testing.vs.paginationdots

import com.sdds.testing.vs.UiState

/**
 * Состояние компонент PaginationDots
 * @property variant вариация
 * @property appearance внешний вид
 * @property itemCount общее кол-во индикаторов
 * @property visibleItemCount кол-во видимых индикаторов
 */
data class PaginationDotsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 20,
    val visibleItemCount: Int = 9,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
