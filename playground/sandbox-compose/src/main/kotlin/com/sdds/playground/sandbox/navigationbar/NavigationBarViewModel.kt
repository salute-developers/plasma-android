package com.sdds.playground.sandbox.navigationbar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента NavigationBar
 */
internal class NavigationBarViewModel(
    defaultState: NavigationBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NavigationBarUiState, NavigationBarStyle>(
    defaultState,
    componentKey,
) {

    override fun NavigationBarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "text",
                value = text,
                onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
            ),
            Property.StringProperty(
                name = "content text",
                value = contentText,
                onApply = { internalUiState.value = internalUiState.value.copy(contentText = it) },
            ),
            Property.BooleanProperty(
                name = "hasActionStart",
                value = hasActionStart,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasActionStart = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasActionEnd",
                value = hasActionEnd,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasActionEnd = it)
                },
            ),
            enumProperty(
                name = "textPlacement",
                value = textPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(textPlacement = it)
                },
            ),
            enumProperty(
                name = "textAlign",
                value = textAlign,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(textAlign = it)
                },
            ),
            enumProperty(
                name = "contentPlacement",
                value = contentPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(contentPlacement = it)
                },
            ),
        )
    }
}

internal class NavigationBarViewModelFactory(
    private val defaultState: NavigationBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NavigationBarViewModel(defaultState, componentKey) as T
    }
}
