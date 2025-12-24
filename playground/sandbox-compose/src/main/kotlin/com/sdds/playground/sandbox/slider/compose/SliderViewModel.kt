package com.sdds.playground.sandbox.slider.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SliderStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Slider
 */
internal class SliderViewModel(
    defaultState: SliderUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SliderUiState, SliderStyle>(
    defaultState,
    componentKey,
) {

    override fun SliderUiState.toProps(): List<Property<*>> {
        val properties = listOf(
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = { internalUiState.value = internalUiState.value.copy(title = it) },
            ),
            Property.StringProperty(
                name = "minLabel",
                value = minLabel,
                onApply = { internalUiState.value = internalUiState.value.copy(minLabel = it) },
            ),
            Property.StringProperty(
                name = "maxLabel",
                value = maxLabel,
                onApply = { internalUiState.value = internalUiState.value.copy(maxLabel = it) },
            ),
            Property.BooleanProperty(
                name = "thumbEnabled",
                value = thumbEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(thumbEnabled = it) },
            ),
            Property.BooleanProperty(
                name = "limitLabelEnabled",
                value = limitLabelEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(limitLabelEnabled = it) },
            ),
            Property.BooleanProperty(
                name = "labelEnabled",
                value = labelEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(labelEnabled = it) },
            ),
            enumProperty(
                name = "slideDirection",
                value = slideDirection,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(slideDirection = it)
                },
            ),
        )
        val appearance = internalUiState.value.appearance
        val horizontal = appearance.contains("Horizontal", true)
        val alignmentProperty = enumProperty(
            name = "alignment",
            value = alignment,
            onApply = {
                internalUiState.value = internalUiState.value.copy(alignment = it)
            },
        )
        return when {
            horizontal -> properties + alignmentProperty
            else -> properties
        }
    }
}

internal class SliderViewModelFactory(
    private val defaultState: SliderUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SliderViewModel(defaultState, componentKey) as T
    }
}
