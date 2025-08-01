package com.sdds.playground.sandbox.codeinput.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class CodeInputViewModel(
    defaultState: CodeInputUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CodeInputUiState, CodeInputStyle>(defaultState, componentKey) {

    override fun CodeInputUiState.toProps(): List<Property<*>> {
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
                        internalUiState.value.copy(caption = it.first().toString())
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

internal class CodeInputViewModelFactory(
    private val defaultState: CodeInputUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CodeInputViewModel(defaultState, componentKey) as T
    }
}
