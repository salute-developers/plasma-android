package com.sdds.playground.sandbox.navigationbar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.navigationbar.NavigationBarUiState

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
        )
    }

    private enum class NavigationBarPropertyName(val value: String) {
        Title("title"),
        Description("description"),
        HasActionStart("hasActionStart"),
        HasActionEnd("hasActionEnd"),
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