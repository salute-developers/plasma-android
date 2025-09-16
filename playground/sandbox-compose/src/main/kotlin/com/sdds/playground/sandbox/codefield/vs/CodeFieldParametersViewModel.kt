package com.sdds.playground.sandbox.codefield.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.codefield.CodeFieldUiState
import com.sdds.uikit.CodeField

/**
 * ViewModel для экрана с компонентом CodeField
 * @param defaultState состояние по-умолчанию
 */
internal class CodeFieldParametersViewModel(
    defaultState: CodeFieldUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CodeFieldUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.CodeLength -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(codeLength = valueString.toInt())
            } else {
                currentState
            }

            PropertyName.Hidden -> currentState.copy(hidden = valueString.toBoolean())
            PropertyName.ErrorItem -> currentState.copy(errorItem = valueString)
            PropertyName.Caption -> currentState.copy(caption = valueString)
            PropertyName.CaptionAlignment -> currentState.copy(
                captionAlignment = CodeField.CaptionAlignment.valueOf(valueString),
            )
        }
    }

    override fun CodeFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = PropertyName.ErrorItem.value,
                value = errorItem,
            ),

            Property.IntProperty(
                name = PropertyName.CodeLength.value,
                value = codeLength,
            ),

            Property.BooleanProperty(
                name = PropertyName.Hidden.value,
                value = hidden,
            ),

            Property.StringProperty(
                name = PropertyName.Caption.value,
                value = caption,
            ),
            enumProperty(
                name = PropertyName.CaptionAlignment.value,
                value = captionAlignment,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        ErrorItem("errorItem"),
        CodeLength("codeLength"),
        Hidden("hidden"),
        Caption("caption"),
        CaptionAlignment("captionAlignment"),
    }
}

/**
 * Фабрика [CodeFieldParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class CodeFieldParametersViewModelFactory(
    private val defaultState: CodeFieldUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CodeFieldParametersViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
