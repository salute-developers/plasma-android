package com.sdds.playground.sandbox.core.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal abstract class ComponentViewModel<State: UiState, S: Style>(
    private val defaultState: State,
) : ViewModel(), PropertiesOwner {

    protected val internalUiState = MutableStateFlow(defaultState)

    val uiState: StateFlow<State>
        get() = internalUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    final override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .mapLatest { state -> variantProperty(state) + state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("UNCHECKED_CAST")
    private fun variantProperty(state: State): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider()
        val variantProperties = mutableListOf<Property.SingleChoiceProperty>()
        if (styleProvider.variants.isNotEmpty()) {
            variantProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                    onApply = {
                        internalUiState.value = internalUiState.value.updateVariant(it) as State
                    },
                ),
            )
        }
        return variantProperties
    }

    abstract fun getStyleProvider(): ComposeStyleProvider<String, S>

    abstract fun State.toProps(): List<Property<*>>

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
    }
}
