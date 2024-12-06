package com.sdds.playground.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.checkbox.Size
import com.sdds.serv.styles.checkbox.group.M
import com.sdds.serv.styles.checkbox.group.S

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
    val rootItem: CheckBoxGroupItem? = ROOT_ITEM,
    val items: List<CheckBoxGroupItem> = ITEMS,
    val enabled: Boolean = true,
) {
    internal companion object {
        val ROOT_ITEM = CheckBoxGroupItem(
            label = "root label",
            description = "root description",
        )

        val ITEMS = listOf(
            CheckBoxGroupItem(
                label = "label",
                description = "description",
            ),
            CheckBoxGroupItem(
                label = "label",
                description = "description",
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

internal data class CheckBoxGroupItem(
    val label: String?,
    val description: String?,
    val state: ToggleableState = ToggleableState.Off,
)
