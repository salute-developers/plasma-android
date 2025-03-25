package com.sdds.playground.sandbox.chip.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ChipStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Chip
 */
internal class ChipViewModel(
    defaultState: ChipUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ChipUiState, ChipStyle>(defaultState, componentKey) {

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasStartIcon = hasIcon)
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasEndIcon = hasIcon)
    }

    private fun updateClickable(isClickable: Boolean) {
        internalUiState.value = internalUiState.value.copy(isClickable = isClickable)
    }

    override fun ChipUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { updateLabel(it) },
            ),

            Property.BooleanProperty(
                name = "start icon",
                value = hasStartIcon,
                onApply = { updateStartIcon(it) },
            ),

            Property.BooleanProperty(
                name = "end icon",
                value = hasEndIcon,
                onApply = { updateEndIcon(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),

            Property.BooleanProperty(
                name = "clickable",
                value = isClickable,
                onApply = { updateClickable(it) },
            ),
        )
    }
}

internal class ChipViewModelFactory(
    private val defaultState: ChipUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChipViewModel(defaultState, componentKey) as T
    }
}
