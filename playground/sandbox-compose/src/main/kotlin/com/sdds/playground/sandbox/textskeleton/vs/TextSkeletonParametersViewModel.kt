package com.sdds.playground.sandbox.textskeleton.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.skeleton.TextSkeletonUiState
import com.sdds.testing.vs.skeleton.TextSkeletonWidth

/**
 * ViewModel компонента TextSkeleton
 */
internal class TextSkeletonParametersViewModel(
    defaultState: TextSkeletonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TextSkeletonUiState>(defaultState, componentKey) {

    private val _propsMap = TextSkeletonPropertyName.values().associateBy { name -> name.value }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            TextSkeletonPropertyName.LineCount -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(lineCount = valueString.toInt())
            } else {
                currentState
            }
            TextSkeletonPropertyName.Text -> currentState.copy(text = valueString)
            TextSkeletonPropertyName.Width -> currentState.copy(width = TextSkeletonWidth.valueOf(valueString))
        }
    }

    override fun TextSkeletonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = TextSkeletonPropertyName.LineCount.value,
                value = lineCount,
            ),
            Property.StringProperty(
                name = TextSkeletonPropertyName.Text.value,
                value = text,
            ),
            enumProperty(
                name = TextSkeletonPropertyName.Width.value,
                value = width,
            ),
        )
    }

    private enum class TextSkeletonPropertyName(val value: String) {
        LineCount("lineCount"),
        Text("text"),
        Width("width"),
    }
}

internal class TextSkeletonParametersViewModelFactory(
    private val defaultState: TextSkeletonUiState = TextSkeletonUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TextSkeletonParametersViewModel(defaultState, componentKey) as T
    }
}
