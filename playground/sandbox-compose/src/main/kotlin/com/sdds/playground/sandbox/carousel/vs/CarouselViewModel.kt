package com.sdds.playground.sandbox.carousel.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.carousel.CarouselContentAlignment
import com.sdds.testing.vs.carousel.CarouselUiState

internal class CarouselViewModel(
    defaultState: CarouselUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CarouselUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = CarouselProperty.values().find { it.value == name } ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            CarouselProperty.ITEM_COUNT -> currentState.copy(itemCount = valueString.toIntOrNull() ?: 0)

            CarouselProperty.CONTROLS_ENABLED -> currentState.copy(controlsEnabled = valueString.toBoolean())
            CarouselProperty.INDICATOR_ENABLED -> currentState.copy(indicatorEnabled = valueString.toBoolean())
            CarouselProperty.INDICATOR_VISIBLE_ITEM_COUNT -> currentState.copy(
                indicatorVisibleItemCount = valueString.toIntOrNull() ?: 0,
            )

            CarouselProperty.WITH_GAP -> currentState.copy(withGap = valueString.toBoolean())
            CarouselProperty.ALIGNMENT -> currentState.copy(alignment = CarouselContentAlignment.valueOf(valueString))
        }
    }

    override fun CarouselUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = CarouselProperty.ITEM_COUNT.value,
                value = itemCount,
            ),
            enumProperty(
                name = CarouselProperty.ALIGNMENT.value,
                value = alignment,
            ),
            Property.BooleanProperty(
                name = CarouselProperty.CONTROLS_ENABLED.value,
                value = controlsEnabled,
            ),
            Property.BooleanProperty(
                name = CarouselProperty.INDICATOR_ENABLED.value,
                value = indicatorEnabled,
            ),
            Property.IntProperty(
                name = CarouselProperty.INDICATOR_VISIBLE_ITEM_COUNT.value,
                value = indicatorVisibleItemCount,
            ),
            Property.BooleanProperty(
                name = CarouselProperty.WITH_GAP.value,
                value = withGap,
            ),
        )
    }

    private enum class CarouselProperty(val value: String) {
        ITEM_COUNT("itemCount"),
        ALIGNMENT("contentAlignment"),
        CONTROLS_ENABLED("controlsEnabled"),
        INDICATOR_ENABLED("indicatorEnabled"),
        INDICATOR_VISIBLE_ITEM_COUNT("indicatorCount"),
        WITH_GAP("withGap"),
    }
}

/**
 * Фабрика для [CarouselViewModel]
 */
internal class CarouselViewModelFactory(
    private val defaultState: CarouselUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CarouselViewModel(defaultState, componentKey) as T
    }
}
