package com.sdds.playground.sandbox.codefield.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class CodeFieldViewModel(
    defaultState: CodeFieldUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CodeFieldUiState, CodeFieldStyle>(defaultState, componentKey) {

    override fun CodeFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "caption",
                value = caption,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(caption = it)
                },
            ),
            Property.StringProperty(
                name = "errorItem",
                value = errorItem,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(errorItem = it.first().toString())
                },
            ),
            Property.BooleanProperty(
                name = "hidden",
                value = hidden,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hidden = it)
                },
            ),
            Property.IntProperty(
                name = "codeLength",
                value = codeLength,
                onApply = {
                    if (it in 3..6) {
                        internalUiState.value = internalUiState.value.copy(codeLength = it)
                    }
                },
            ),
            enumProperty(
                name = "captionAlignment",
                value = captionAlignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(captionAlignment = it)
                },
            ),
        )
    }
}

internal class CodeFieldViewModelFactory(
    private val defaultState: CodeFieldUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CodeFieldViewModel(defaultState, componentKey) as T
    }
}
