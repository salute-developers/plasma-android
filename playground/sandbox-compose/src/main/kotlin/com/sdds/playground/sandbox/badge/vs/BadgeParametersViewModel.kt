package com.sdds.playground.sandbox.badge.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.badge.BadgeUiState

/**
 * ViewModel для экранов с компонентом Badge и IconBadge
 */
internal class BadgeParametersViewModel(
    defaultState: BadgeUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BadgeUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentName = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.Label -> currentName.copy(label = valueString)
            PropertyName.ContentLeft -> currentName.copy(contentLeft = valueString.toBoolean())
            PropertyName.ContentRight -> currentName.copy(contentRight = valueString.toBoolean())
        }
    }

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = PropertyName.Label.value,
                value = label,
            ),
            Property.BooleanProperty(
                name = PropertyName.ContentLeft.value,
                value = contentLeft,
            ),
            Property.BooleanProperty(
                name = PropertyName.ContentRight.value,
                value = contentRight,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Label("Label"),
        ContentLeft("ContentLeft"),
        ContentRight("ContentRight"),
    }
}

/**
 * Фабрика [BadgeParametersViewModel]
 */
internal class BadgeParametersViewModelFactory(
    private val defaultState: BadgeUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BadgeParametersViewModel(defaultState, componentKey) as T
    }
}
