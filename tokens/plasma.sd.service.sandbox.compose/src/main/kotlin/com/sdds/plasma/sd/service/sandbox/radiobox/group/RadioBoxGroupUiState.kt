package com.sdds.plasma.sd.service.sandbox.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.plasma.sd.service.sandbox.radiobox.Size
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.S

/**
 * Состояния компонента RadioBoxGroup
 * @property size размер элементов
 * @property items элементы группы
 * @property current текущий выбранный элемент
 */
internal data class RadioBoxGroupUiState(
    val size: Size = Size.M,
    val items: List<RadioBoxGroupItem> = ITEMS,
    val current: Any? = items.first().id,
) {

    private companion object {
        val ITEMS = listOf(
            RadioBoxGroupItem(1, "Label", "Description"),
            RadioBoxGroupItem(2, "Label", "Description"),
        )
    }
}

@Composable
internal fun RadioBoxGroupUiState.radioBoxGroupStyle(): RadioBoxGroupStyle =
    when (size) {
        Size.M -> RadioBoxGroup.M.style()
        Size.S -> RadioBoxGroup.S.style()
    }

internal data class RadioBoxGroupItem(
    val id: Int,
    val label: String? = null,
    val description: String? = null,
)
