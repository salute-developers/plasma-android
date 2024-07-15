package com.sdds.playground.sandbox.radiobox.group

import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.playground.sandbox.radiobox.SandboxRadioBox

/**
 * Состояния компонента RadioBoxGroup
 * @property size размер элементов
 * @property items элементы группы
 * @property current текущий выбранный элемент
 */
internal data class RadioBoxGroupUiState(
    val size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
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
