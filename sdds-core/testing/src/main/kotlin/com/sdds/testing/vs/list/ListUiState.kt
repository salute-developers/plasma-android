package com.sdds.testing.vs.list

import com.sdds.testing.vs.UiState

/**
 * Состояние компонента ListView
 * @property variant вариация
 * @property amount кол-во элементов
 * @property itemTitle заголовок элемента
 * @property hasDisclosure наличие индикатора доп. информации
 */
data class ListUiState(
    override val variant: String = "",
    val amount: Int = 15,
    val itemTitle: String = "Title",
    val hasDisclosure: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
