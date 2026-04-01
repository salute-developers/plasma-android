package com.sdds.playground.sandbox.select.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SelectStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Select
 */
internal class SelectViewModel(
    defaultState: SelectUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SelectUiState, SelectStyle>(defaultState, componentKey) {

    @Suppress("LongMethod")
    override fun SelectUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "showEmptyState",
                value = showEmptyState,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(showEmptyState = it)
                },
            ),
            Property.BooleanProperty(
                name = "showLoading",
                value = showLoading,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(showLoading = it)
                },
            ),
            Property.BooleanProperty(
                name = "readOnly",
                value = readOnly,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(readOnly = it)
                },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(enabled = it)
                },
            ),
            enumProperty(
                name = "triggerType",
                value = triggerType,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(triggerType = it)
                },
            ),
            enumProperty(
                name = "triggerAlignment",
                value = triggerAlignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(triggerAlignment = it)
                },
            ),
            enumProperty(
                name = "placement",
                value = dropdownProperties.placement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        dropdownProperties = internalUiState.value.dropdownProperties.copy(
                            placement = it,
                        ),
                    )
                },
            ),
            enumProperty(
                name = "placementMode",
                value = dropdownProperties.placementMode,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        dropdownProperties = internalUiState.value.dropdownProperties.copy(
                            placementMode = it,
                        ),
                    )
                },
            ),
        )
    }
}

internal class SelectViewModelFactory(
    private val defaultState: SelectUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SelectViewModel(defaultState, componentKey) as T
    }
}
