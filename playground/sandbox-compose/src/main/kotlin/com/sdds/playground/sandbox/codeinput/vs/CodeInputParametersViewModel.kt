package com.sdds.playground.sandbox.codeinput.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.codeinput.CodeInputUiState
import com.sdds.uikit.CodeField

/**
 * ViewModel для экрана с компонентом CodeInput
 * @param defaultState состояние по-умолчанию
 */
internal class CodeInputParametersViewModel(
    defaultState: CodeInputUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CodeInputUiState>(defaultState, componentKey) {

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
            PropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
            PropertyName.CaptionAlignment -> currentState.copy(
                captionAlignment = CodeField.CaptionAlignment.valueOf(valueString),
            )

            PropertyName.FocusGain -> currentState.copy(focusGain = valueString.toBoolean())
            PropertyName.CodeValidateBehavior -> currentState.copy(
                codeValidateBehavior = CodeField.CodeErrorBehavior.valueOf(valueString),
            )

            PropertyName.CharValidateBehavior -> currentState.copy(
                charValidateBehavior = CodeField.CharErrorBehavior.valueOf(valueString),
            )
        }
    }

    override fun CodeInputUiState.toProps(): List<Property<*>> {
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

            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),

            enumProperty(
                name = PropertyName.CaptionAlignment.value,
                value = captionAlignment,
            ),

            Property.BooleanProperty(
                name = PropertyName.FocusGain.value,
                value = focusGain,
            ),
            enumProperty(
                name = PropertyName.CodeValidateBehavior.value,
                value = codeValidateBehavior,
            ),
            enumProperty(
                name = PropertyName.CharValidateBehavior.value,
                value = charValidateBehavior,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        ErrorItem("errorItem"),
        CodeLength("codeLength"),
        Hidden("hidden"),
        Caption("caption"),
        Enabled("enabled"),
        CaptionAlignment("captionAlignment"),
        FocusGain("focusGain"),
        CodeValidateBehavior("codeValidateBehavior"),
        CharValidateBehavior("charValidateBehavior"),
    }
}

/**
 * Фабрика [CodeInputParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class CodeInputParametersViewModelFactory(
    private val defaultState: CodeInputUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CodeInputParametersViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
