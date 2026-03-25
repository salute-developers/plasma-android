package com.sdds.uikit.fixtures.stories.autocomplete

import com.sdds.uikit.fixtures.UiState
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacementMode
import com.sdds.uikit.fixtures.stories.popover.PopoverTriggerAlignment

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
 * @property dropdownPlacementMode Режим расположения Dropdown
 */
data class AutocompleteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
    val fieldAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
    val dropdownPlacementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
