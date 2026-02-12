package com.sdds.playground.sandbox.navigationbar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.navigationbar.AlignmentStrategy
import com.sdds.testing.vs.navigationbar.ContentBetweenActionsAlignment
import com.sdds.testing.vs.navigationbar.ContentPlacement
import com.sdds.testing.vs.navigationbar.NavigationBarUiState
import com.sdds.testing.vs.navigationbar.TextAlignment
import com.sdds.testing.vs.navigationbar.TextPlacement

/**
 * ViewModel для экранов с компонентом NavigationBar
 */
internal class NavigationBarParametersViewModel(
    defaultState: NavigationBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NavigationBarUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (NavigationBarPropertyName.entries.find { it.value == name }) {
            NavigationBarPropertyName.Title -> updateTitle(value?.toString().orEmpty())
            NavigationBarPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            NavigationBarPropertyName.HasActionStart -> updateHasActionStart((value as? Boolean) == true)
            NavigationBarPropertyName.HasActionEnd -> updateHasActionEnd((value as? Boolean) == true)
            NavigationBarPropertyName.TextPlacement -> updateTextPlacement(TextPlacement.valueOf(value.toString()))
            NavigationBarPropertyName.ContentPlacement -> updateContentPlacement(
                ContentPlacement.valueOf(value.toString()),
            )
            NavigationBarPropertyName.TextAlignment -> updateTextAlignment(TextAlignment.valueOf(value.toString()))
            NavigationBarPropertyName.CenterAlignmentStrategy -> updateCenterAlignmentStrategy(
                AlignmentStrategy.valueOf(value.toString()),
            )
            NavigationBarPropertyName.ContentAlignment -> updateContentAlignment(
                ContentBetweenActionsAlignment.valueOf(value.toString()),
            )
            else -> Unit
        }
    }

    private fun updateTitle(title: String) {
        internalUiState.value = internalUiState.value.copy(title = title)
    }

    private fun updateDescription(description: String) {
        internalUiState.value = internalUiState.value.copy(description = description)
    }

    private fun updateHasActionStart(hasActionStart: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasActionStart = hasActionStart)
    }

    private fun updateHasActionEnd(hasActionEnd: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasActionEnd = hasActionEnd)
    }

    private fun updateTextPlacement(textPlacement: TextPlacement) {
        internalUiState.value = internalUiState.value.copy(textPlacement = textPlacement)
    }

    private fun updateContentPlacement(contentPlacement: ContentPlacement) {
        internalUiState.value = internalUiState.value.copy(contentPlacement = contentPlacement)
    }

    private fun updateTextAlignment(textAlignment: TextAlignment) {
        internalUiState.value = internalUiState.value.copy(textAlign = textAlignment)
    }

    private fun updateCenterAlignmentStrategy(centerAlignmentStrategy: AlignmentStrategy) {
        internalUiState.value = internalUiState.value.copy(centerAlignmentStrategy = centerAlignmentStrategy)
    }

    private fun updateContentAlignment(contentAlignment: ContentBetweenActionsAlignment) {
        internalUiState.value = internalUiState.value.copy(contentBetweenActionsAlignment = contentAlignment)
    }

    override fun NavigationBarUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = NavigationBarPropertyName.Title.value,
                value = title,
            ),

            Property.StringProperty(
                name = NavigationBarPropertyName.Description.value,
                value = description,
            ),

            Property.BooleanProperty(
                name = NavigationBarPropertyName.HasActionStart.value,
                value = hasActionStart,
            ),

            Property.BooleanProperty(
                name = NavigationBarPropertyName.HasActionEnd.value,
                value = hasActionEnd,
            ),
            enumProperty(
                name = NavigationBarPropertyName.TextPlacement.value,
                value = textPlacement,
            ),
            enumProperty(
                name = NavigationBarPropertyName.ContentPlacement.value,
                value = contentPlacement,
            ),
            enumProperty(
                name = NavigationBarPropertyName.TextAlignment.value,
                value = textAlign,
            ),
            enumProperty(
                name = NavigationBarPropertyName.CenterAlignmentStrategy.value,
                value = centerAlignmentStrategy,
            ),
            enumProperty(
                name = NavigationBarPropertyName.ContentAlignment.value,
                value = contentBetweenActionsAlignment,
            ),
        )
    }

    private enum class NavigationBarPropertyName(val value: String) {
        Title("title"),
        Description("description"),
        HasActionStart("hasActionStart"),
        HasActionEnd("hasActionEnd"),
        TextPlacement("textPlacement"),
        ContentPlacement("contentPlacement"),
        TextAlignment("textAlignment"),
        CenterAlignmentStrategy("centerAlignmentStrategy"),
        ContentAlignment("contentBetweenActionsAlignment"),
    }
}

/**
 * Фабрика [NavigationBarParametersViewModel]
 */
internal class NavigationBarParametersViewModelFactory(
    private val defaultState: NavigationBarUiState = NavigationBarUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NavigationBarParametersViewModel(defaultState, componentKey) as T
    }
}
