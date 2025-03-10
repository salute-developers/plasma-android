package com.sdds.playground.sandbox.buttons.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.button.ButtonUiState

/**
 * ViewModel для экрана с компонентом IconButton
 */
internal class IconButtonViewModel(
    defaultState: ButtonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ButtonUiState>(defaultState, componentKey) {

    /**
     * @see PropertiesOwner.updateProperty
     */
    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val pName = PropertyName.values().find { it.value == name }
        val valueString = value?.toString() ?: return
        when (pName) {
            PropertyName.Loading -> updateLoadingState(valueString.toBoolean())
            PropertyName.Enabled -> updateEnabledState(valueString.toBoolean())
            null -> {}
        }
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateLoadingState(loading: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            loading = loading,
        )
    }

    override fun ButtonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = PropertyName.Loading.value,
                value = loading,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Loading("loading"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [IconButtonViewModel]
 */
internal class IconButtonViewModelFactory(
    private val defaultState: ButtonUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconButtonViewModel(defaultState, componentKey) as T
    }
}
