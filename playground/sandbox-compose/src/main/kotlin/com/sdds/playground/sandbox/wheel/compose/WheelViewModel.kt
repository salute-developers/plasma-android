package com.sdds.playground.sandbox.wheel.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.WheelStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Wheel
 */
internal class WheelViewModel(
    defaultState: WheelUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<WheelUiState, WheelStyle>(
    defaultState,
    componentKey,
) {

    override fun WheelUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "itemLabel",
                value = itemLabel,
                onApply = { internalUiState.value = internalUiState.value.copy(itemLabel = it) },
            ),
            Property.StringProperty(
                name = "itemTextAfter",
                value = itemTextAfter,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(itemTextAfter = it)
                },
            ),
            Property.StringProperty(
                name = "description",
                value = description,
                onApply = { internalUiState.value = internalUiState.value.copy(description = it) },
            ),
            Property.IntProperty(
                name = "wheelCount",
                value = wheelCount,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(wheelCount = it.coerceIn(1..3))
                },
            ),
            Property.IntProperty(
                name = "visibleItemsCount",
                value = visibleItemsCount,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(visibleItemsCount = it.coerceIn(3..9))
                },
            ),
            enumProperty(
                name = "separatorType",
                value = separatorType,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(separatorType = it)
                },
            ),
        )
    }
}

internal class WheelViewModelFactory(
    private val defaultState: WheelUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WheelViewModel(defaultState, componentKey) as T
    }
}
