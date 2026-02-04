package com.sdds.playground.sandbox.navigationbar.collapsing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента CollapsingNavigationBar
 */
internal class CollapsingNavigationBarViewModel(
    defaultState: CollapsingNavigationBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CollapsingNavigationBarUiState, CollapsingNavigationBarStyle>(
    defaultState,
    componentKey,
) {

    override fun CollapsingNavigationBarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "collapsedTitle",
                value = collapsedTitle,
                onApply = { internalUiState.value = internalUiState.value.copy(collapsedTitle = it) },
            ),
            Property.StringProperty(
                name = "expandedTitle",
                value = expandedTitle,
                onApply = { internalUiState.value = internalUiState.value.copy(expandedTitle = it) },
            ),
            Property.StringProperty(
                name = "collapsedDescription",
                value = collapsedDescription,
                onApply = { internalUiState.value = internalUiState.value.copy(collapsedDescription = it) },
            ),
            Property.StringProperty(
                name = "expandedDescription",
                value = expandedDescription,
                onApply = { internalUiState.value = internalUiState.value.copy(expandedDescription = it) },
            ),
            Property.StringProperty(
                name = "content text",
                value = contentText,
                onApply = { internalUiState.value = internalUiState.value.copy(contentText = it) },
            ),
            Property.BooleanProperty(
                name = "hasActionStart",
                value = hasActionStart,
                onApply = { internalUiState.value = internalUiState.value.copy(hasActionStart = it) },
            ),
            Property.BooleanProperty(
                name = "hasActionEnd",
                value = hasActionEnd,
                onApply = { internalUiState.value = internalUiState.value.copy(hasActionEnd = it) },
            ),
            enumProperty(
                name = "collapsedTextAlign",
                value = collapsedTextAlign,
                onApply = { internalUiState.value = internalUiState.value.copy(collapsedTextAlign = it) },
            ),
            enumProperty(
                name = "expandedTextAlign",
                value = expandedTextAlign,
                onApply = { internalUiState.value = internalUiState.value.copy(expandedTextAlign = it) },
            ),
            enumProperty(
                name = "centerAlignmentStrategy",
                value = centerAlignmentStrategy,
                onApply = { internalUiState.value = internalUiState.value.copy(centerAlignmentStrategy = it) },
            ),
        )
    }
}

internal class CollapsingNavigationBarViewModelFactory(
    private val defaultState: CollapsingNavigationBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CollapsingNavigationBarViewModel(defaultState, componentKey) as T
    }
}
