package com.sdds.plasma.b2c.sandbox.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.playground.sandbox.radiobox.Size

/**
 * Состояния компонента RadioBoxGroup
 * @property size размер элементов
 * @property items элементы группы
 * @property current текущий выбранный элемент
 */
internal data class RadioBoxGroupUiState(
    val size: Size = Size.M,
    val items: List<RadioBoxGroup.Item> = ITEMS,
    val current: Any? = items.first().id,
) {

    private companion object {
        val ITEMS = listOf(
            RadioBoxGroup.Item(1, "Label", "Description"),
            RadioBoxGroup.Item(2, "Label", "Description"),
        )
    }
}

@Composable
internal fun RadioBoxGroupUiState.radioBoxGroupStyle(): RadioBoxGroupStyle =
    when (size) {
        Size.M -> RadioBoxGroup.M.style()
        Size.S -> RadioBoxGroup.S.style()
    }
