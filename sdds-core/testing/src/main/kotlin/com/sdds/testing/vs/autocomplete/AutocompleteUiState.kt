package com.sdds.testing.vs.autocomplete

import com.sdds.testing.vs.UiState
import com.sdds.testing.vs.popover.PopoverTriggerAlignment

/**
 * UI-состояние компонента Autocomplete для тестовых стендов.
 *
 * Описывает внешний вид, выравнивание и дополнительные опции отображения,
 * такие как индикатор загрузки и экран пустого состояния.
 * @property variant Название варианта компонента, влияющее на стилизацию.
 * @property appearance Внешний вид компонента.
 * @property showLoading Показывать ли индикатор загрузки.
 * @property withEmptyState Отображать ли секцию пустого состояния при отсутствии подсказок
 * @property fieldAlignment Выравнивание поля Autocomplete относительно экрана.
 */
data class AutocompleteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
    val fieldAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
