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
    override val appearance: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Title",
    val hasDisclosure: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
