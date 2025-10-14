package com.sdds.playground.sandbox.buttongroup.compose

import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.playground.sandbox.core.compose.UiState

internal data class ButtonGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    val amount: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
