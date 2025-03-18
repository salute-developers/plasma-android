package com.sdds.playground.sandbox.segment.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class SegmentViewModel(
    defaultState: SegmentUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SegmentUiState, SegmentStyle>(defaultState, componentKey) {

    fun updateCurrentItem(currentId: Int) {
        internalUiState.value = internalUiState.value.copy(
            currentSelected = currentId,
        )
    }

    fun isSelected(id: Int): Boolean {
        return internalUiState.value.currentSelected == id
    }

    @Suppress("LongMethod")
    override fun SegmentUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(amount = it)
                },
            ),
            enumProperty(
                name = "orientation",
                value = orientation,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(orientation = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasBackground",
                value = hasBackground,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasBackground = it)
                },
            ),
            Property.BooleanProperty(
                name = "stretch",
                value = stretch,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(stretch = it)
                },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(enabled = it)
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

internal class SegmentViewModelFactory(
    private val defaultState: SegmentUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentViewModel(defaultState, componentKey) as T
    }
}
