package com.sdds.playground.sandbox.accordion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Accordion
 */
internal class AccordionViewModel(
    defaultState: AccordionUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AccordionUiState, AccordionStyle>(defaultState, componentKey) {

    override fun AccordionUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = { internalUiState.value = internalUiState.value.copy(amount = it) },
            ),
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = { internalUiState.value = internalUiState.value.copy(title = it) },
            ),
            Property.StringProperty(
                name = "contentText",
                value = contentText,
                onApply = { internalUiState.value = internalUiState.value.copy(contentText = it) },
            ),
            Property.BooleanProperty(
                name = "hasDivider",
                value = hasDivider,
                onApply = { internalUiState.value = internalUiState.value.copy(hasDivider = it) },
            ),
            Property.BooleanProperty(
                name = "animation",
                value = animation,
                onApply = { internalUiState.value = internalUiState.value.copy(animation = it) },
            ),
        )
    }
}

internal class AccordionViewModelFactory(
    private val defaultState: AccordionUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AccordionViewModel(defaultState, componentKey) as T
    }
}
