package com.sdds.playground.sandbox.carousel.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Carousel
 */
internal class CarouselViewModel(
    defaultState: CarouselUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CarouselUiState, CarouselStyle>(defaultState, componentKey) {

    override fun CarouselUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "withGap",
                value = withGap,
                onApply = { internalUiState.value = internalUiState.value.copy(withGap = it) },
            ),
            Property.BooleanProperty(
                name = "hasButtons",
                value = controlsEnabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(controlsEnabled = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasPaginator",
                value = indicatorEnabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(indicatorEnabled = it)
                },
            ),
            enumProperty(
                name = "alignment",
                value = alignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(alignment = it)
                },
            ),
            Property.IntProperty(
                name = "itemCount",
                value = itemCount,
                onApply = {
                    if (it >= indicatorVisibleItemCount) {
                        internalUiState.value = internalUiState.value.copy(itemCount = it)
                    }
                },
            ),
            Property.IntProperty(
                name = "indicatorVisibleItemCount",
                value = indicatorVisibleItemCount,
                onApply = {
                    if (it <= itemCount) {
                        internalUiState.value =
                            internalUiState.value.copy(indicatorVisibleItemCount = it)
                    }
                },
            ),
        )
    }
}

internal class CarouselViewModelFactory(
    private val defaultState: CarouselUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CarouselViewModel(defaultState, componentKey) as T
    }
}
