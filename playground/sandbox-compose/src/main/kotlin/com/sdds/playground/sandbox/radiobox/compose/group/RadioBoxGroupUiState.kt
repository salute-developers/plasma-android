package com.sdds.playground.sandbox.radiobox.compose.group

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояния компонента RadioBoxGroup
 * @property items элементы группы
 * @property current текущий выбранный элемент
 */
internal data class RadioBoxGroupUiState(
    override val variant: String = "",
    val items: List<RadioBoxGroupItem> = ITEMS,
    val current: Any? = items.first().id,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }

    private companion object {
        val ITEMS = listOf(
            RadioBoxGroupItem(1, "Label", "Description"),
            RadioBoxGroupItem(2, "Label", "Description"),
        )
    }
}

internal data class RadioBoxGroupItem(
    val id: Int,
    val label: String? = null,
    val description: String? = null,
)
