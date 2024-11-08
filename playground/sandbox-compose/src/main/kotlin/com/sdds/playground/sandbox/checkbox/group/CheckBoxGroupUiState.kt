package com.sdds.playground.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.checkbox.Size

/**
 * Состояние checkbox group
 *
 * @property size размер checkbox [Size]
 * @property rootItem рутовый checkbox
 * @property items дочерние checkbox
 * @property enabled включен ли checkbox group
 */
internal data class CheckBoxGroupUiState(
    val size: Size = Size.M,
    val rootItem: CheckBoxGroup.RootItem? = ROOT_ITEM,
    val items: List<CheckBoxGroup.Item> = ITEMS,
    val enabled: Boolean = true,
) {
    internal companion object {
        val ROOT_ITEM = CheckBoxGroup.RootItem(
            label = "root label",
            description = "root description",
        )

        val ITEMS = listOf(
            CheckBoxGroup.Item(
                id = "1",
                label = "label",
                description = "description",
            ),
            CheckBoxGroup.Item(
                id = "2",
                label = "label",
                description = "description",
                initialChecked = true,
            ),
        )
    }
}

@Composable
internal fun CheckBoxGroupUiState.checkBoxGroupStyle(): CheckBoxGroupStyle =
    when (size) {
        Size.M -> CheckBoxGroup.M.style()
        Size.S -> CheckBoxGroup.S.style()
    }
