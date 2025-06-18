package com.sdds.playground.sandbox.textskeleton.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента TextSkeleton
 */
internal class TextSkeletonViewModel(
    defaultState: TextSkeletonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TextSkeletonUiState, TextSkeletonStyle>(defaultState, componentKey) {

    override fun TextSkeletonUiState.toProps() = listOfNotNull(
        Property.IntProperty(
            name = "lineCount",
            value = lineCount,
            onApply = {
                if (it in 1..20) {
                    internalUiState.value = internalUiState.value.copy(lineCount = it)
                }
            },
        ),
        Property.StringProperty(
            name = "text",
            value = text,
            onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
        ),
        enumProperty(
            name = "width",
            value = width,
            onApply = { internalUiState.value = internalUiState.value.copy(width = it) },
        ),
    )
}

internal class TextSkeletonViewModelFactory(
    private val defaultState: TextSkeletonUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TextSkeletonViewModel(defaultState, componentKey) as T
    }
}
