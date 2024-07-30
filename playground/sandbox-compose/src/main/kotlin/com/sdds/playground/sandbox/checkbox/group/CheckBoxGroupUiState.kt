package com.sdds.playground.sandbox.checkbox.group

import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.checkbox.SandboxCheckBox

/**
 * Состояние checkbox group
 *
 * @property size размер checkbox [SandboxCheckBox.Size]
 * @property rootItem рутовый checkbox
 * @property items дочерние checkbox
 * @property enabled включен ли checkbox group
 */
internal data class CheckBoxGroupUiState(
    val size: SandboxCheckBox.Size = SandboxCheckBox.Size.M,
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
