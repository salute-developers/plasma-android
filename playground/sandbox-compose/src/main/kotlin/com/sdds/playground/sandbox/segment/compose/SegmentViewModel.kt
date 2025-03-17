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

    override fun SegmentUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
                name = "hasIcon",
                value = hasIcon,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasIcon = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasCounter",
                value = hasCounter,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasCounter = it)
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
