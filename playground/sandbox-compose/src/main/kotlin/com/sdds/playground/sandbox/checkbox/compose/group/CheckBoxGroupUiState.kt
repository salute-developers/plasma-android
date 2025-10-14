package com.sdds.playground.sandbox.checkbox.compose.group

import androidx.compose.ui.state.ToggleableState
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние checkbox group
 *
 * @property rootItem рутовый checkbox
 * @property items дочерние checkbox
 * @property enabled включен ли checkbox group
 */
internal data class CheckBoxGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val rootItem: CheckBoxGroupItem? = ROOT_ITEM,
    val items: List<CheckBoxGroupItem> = ITEMS,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }

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

internal data class CheckBoxGroupItem(
    val label: String?,
    val description: String?,
    val state: ToggleableState = ToggleableState.Off,
)
