package com.sdds.playground.sandbox.scrollbar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.scrollbar.ScrollBarUiState
import com.sdds.testing.vs.scrollbar.ScrollOrientation

/**
 * ViewModel компонента ScrollBar
 */
internal class ScrollBarParametersViewModel(
    defaultState: ScrollBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ScrollBarUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = ScrollPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            ScrollPropertyName.Orientation -> currentState.copy(orientation = ScrollOrientation.valueOf(valueString))
            ScrollPropertyName.ItemsAmount -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(itemsAmount = valueString.toInt())
            } else {
                currentState
            }

            ScrollPropertyName.HasTrack -> currentState.copy(hasTrack = valueString.toBoolean())
            ScrollPropertyName.HoverExpand -> currentState.copy(hoverExpand = valueString.toBoolean())
            ScrollPropertyName.AutoHideScrollBar -> currentState.copy(autoHideScrollBar = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun ScrollBarUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = ScrollPropertyName.Orientation.value,
                value = orientation,
            ),
            Property.IntProperty(
                name = ScrollPropertyName.ItemsAmount.value,
                value = itemsAmount,
            ),
            Property.BooleanProperty(
                name = ScrollPropertyName.HasTrack.value,
                value = hasTrack,
            ),
            Property.BooleanProperty(
                name = ScrollPropertyName.HoverExpand.value,
                value = hoverExpand,
            ),
            Property.BooleanProperty(
                name = ScrollPropertyName.AutoHideScrollBar.value,
                value = autoHideScrollBar,
            ),
        )
    }

    private enum class ScrollPropertyName(val value: String) {
        Orientation("orientation"),
        ItemsAmount("itemsAmount"),
        HasTrack("hasTrack"),
        HoverExpand("hoverExpand"),
        AutoHideScrollBar("autoHideScrollBar"),
    }
}

internal class ScrollBarParametersViewModelFactory(
    private val defaultState: ScrollBarUiState = ScrollBarUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ScrollBarParametersViewModel(defaultState, componentKey) as T
    }
}
