package com.sdds.playground.sandbox.loader.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.loader.LoaderType
import com.sdds.testing.vs.loader.LoaderUiState

internal class LoaderViewModel(
    defaultState: LoaderUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<LoaderUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.LoaderType -> currentState.copy(loaderType = LoaderType.valueOf(valueString))
        }
    }

    override fun LoaderUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.LoaderType.value,
                value = loaderType,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        LoaderType("loaderType"),
    }
}

internal class LoaderViewModelFactory(
    private val defaultState: LoaderUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoaderViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
