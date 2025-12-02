package com.sdds.playground.sandbox.slider.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.slider.Alignment
import com.sdds.testing.vs.slider.SlideDirection
import com.sdds.testing.vs.slider.SliderUiState

/**
 * ViewModel компонента Slider
 */
internal class SliderParametersViewModel(
    defaultState: SliderUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SliderUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = SliderPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            SliderPropertyName.MinLabel -> currentState.copy(minLabel = valueString)
            SliderPropertyName.MaxLabel -> currentState.copy(maxLabel = valueString)
            SliderPropertyName.Title -> currentState.copy(title = valueString)
            SliderPropertyName.SlideDirection -> currentState.copy(slideDirection = SlideDirection.valueOf(valueString))
            SliderPropertyName.Alignment -> currentState.copy(alignment = Alignment.valueOf(valueString))
            SliderPropertyName.ThumbEnabled -> currentState.copy(thumbEnabled = valueString.toBoolean())
            SliderPropertyName.LabelEnabled -> currentState.copy(labelEnabled = valueString.toBoolean())
            SliderPropertyName.LimitLabelEnabled -> currentState.copy(limitLabelEnabled = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun SliderUiState.toProps(): List<Property<*>> {
        val properties = listOf(
            Property.StringProperty(
                name = SliderPropertyName.MinLabel.value,
                value = minLabel,
            ),
            Property.StringProperty(
                name = SliderPropertyName.MaxLabel.value,
                value = maxLabel,
            ),

            Property.StringProperty(
                name = SliderPropertyName.Title.value,
                value = title,
            ),
            Property.BooleanProperty(
                name = SliderPropertyName.ThumbEnabled.value,
                value = thumbEnabled,
            ),
            Property.BooleanProperty(
                name = SliderPropertyName.LimitLabelEnabled.value,
                value = limitLabelEnabled,
            ),
            Property.BooleanProperty(
                name = SliderPropertyName.LabelEnabled.value,
                value = labelEnabled,
            ),
            enumProperty(
                name = SliderPropertyName.SlideDirection.value,
                value = slideDirection,
            ),
        )
        val appearance = internalUiState.value.appearance
        val horizontal = appearance.contains("Horizontal", true)
        val alignmentProperty = listOf(
            enumProperty(name = SliderPropertyName.Alignment.value, value = alignment),
        )
        return when {
            horizontal -> properties + alignmentProperty
            else -> properties
        }
    }

    private enum class SliderPropertyName(val value: String) {
        LabelEnabled("labelEnabled"),
        LimitLabelEnabled("limitLabelEnabled"),
        MinLabel("minLabel"),
        MaxLabel("maxLabel"),
        Title("title"),
        Alignment("alignment"),
        SlideDirection("slideDirection"),
        ThumbEnabled("thumbEnabled"),
    }
}

internal class SliderParametersViewModelFactory(
    private val defaultState: SliderUiState = SliderUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SliderParametersViewModel(defaultState, componentKey) as T
    }
}
