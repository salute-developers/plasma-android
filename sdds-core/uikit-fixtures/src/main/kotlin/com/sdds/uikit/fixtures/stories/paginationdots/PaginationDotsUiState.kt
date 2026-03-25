package com.sdds.uikit.fixtures.stories.paginationdots

import com.sdds.uikit.fixtures.UiState

/**
 * Состояние компонент PaginationDots
 * @property variant вариация
 * @property appearance внешний вид
 * @property itemCount общее кол-во индикаторов
 * @property visibleItemCount кол-во видимых индикаторов
 * @property step шаг изменения индекса
 */
data class PaginationDotsUiState(
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
