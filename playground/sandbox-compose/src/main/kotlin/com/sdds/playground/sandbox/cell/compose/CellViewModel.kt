package com.sdds.playground.sandbox.cell.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CellStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class CellViewModel(
    defaultState: CellUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CellUiState, CellStyle>(defaultState, componentKey) {

    override fun CellUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(label = it)
                },
            ),
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(title = it)
                },
            ),
            Property.StringProperty(
                name = "subtitle",
                value = subtitle,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(subtitle = it)
                },
            ),
            Property.StringProperty(
                name = "disclosureText",
                value = disclosureText,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(disclosureText = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasDisclosure",
                value = hasDisclosure,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasDisclosure = it)
                },
            ),
            enumProperty(
                name = "startContent",
                value = startContent,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(startContent = it)
                },
            ),
            enumProperty(
                name = "endContent",
                value = endContent,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(endContent = it)
                },
            ),
        )
    }
}

internal class CellViewModelFactory(
    private val defaultState: CellUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CellViewModel(defaultState, componentKey) as T
    }
}
