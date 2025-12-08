package com.sdds.playground.sandbox.autocomplete

import androidx.compose.ui.Alignment
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.playground.sandbox.core.compose.UiState

internal data class AutocompleteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
    val fieldAlignment: AutocompleteFieldAlignment = AutocompleteFieldAlignment.TopCenter,
    val dropdownProperties: DropdownProperties = DropdownProperties(),
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class AutocompleteFieldAlignment(val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    TopCenter(Alignment.TopCenter),
    Center(Alignment.Center),
    CenterStart(Alignment.CenterStart),
    CenterEnd(Alignment.CenterEnd),
}
