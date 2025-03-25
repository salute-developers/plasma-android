package com.sdds.playground.sandbox.segment.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class SegmentItemViewModel(
    defaultState: SegmentItemUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SegmentItemUiState, SegmentItemStyle>(defaultState, componentKey) {

    override fun SegmentItemUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "selected",
                value = selected,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(selected = it)
                },
            ),
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(label = it)
                },
            ),
            Property.StringProperty(
                name = "value",
                value = value,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(value = it)
                },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(enabled = it)
                },
            ),
            Property.BooleanProperty(
                name = "startIcon",
                value = startIcon,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(startIcon = it)
                },
            ),
            enumProperty(
                name = "endContent",
                value = endContent,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(endContent = it)
                },
            ),
            Property.StringProperty(
                name = "count",
                value = count,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(count = it)
                },
            ),
        )
    }
}

internal class SegmentItemViewModelFactory(
    private val defaultState: SegmentItemUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentItemViewModel(defaultState, componentKey) as T
    }
}
