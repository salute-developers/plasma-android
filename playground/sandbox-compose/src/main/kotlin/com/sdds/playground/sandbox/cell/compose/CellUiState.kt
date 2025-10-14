package com.sdds.playground.sandbox.cell.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class CellUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = true,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class CellContent {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}
