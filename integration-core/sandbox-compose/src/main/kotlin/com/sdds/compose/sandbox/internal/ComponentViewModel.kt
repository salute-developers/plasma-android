package com.sdds.compose.sandbox.internal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.getStyleProvider
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.PropertiesOwner
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.Property
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.ThemeManager
import com.sdds.sandbox.UiState
import com.sdds.sandbox.getAppearances
import com.sdds.sandbox.getDefaultAppearance
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn

internal class ComponentViewModel<State : UiState, S : Style>(
    private val defaultState: State,
    private val propertiesProducer: PropertiesProducer<State>,
    private val stateTransformer: StateTransformer<State>,
    private val componentKey: ComponentKey,
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel(), PropertiesOwner {

    private val internalUiState = MutableStateFlow(defaultState)
    private val _subtheme = MutableStateFlow<SubTheme?>(null)

    val uiState: StateFlow<State>
        get() = internalUiState.asStateFlow()

    /**
     * Подтема
     */
    val theme: StateFlow<ComposeTheme>
        get() = themeManager.currentTheme
            .mapNotNull { it as? ComposeTheme }
            .stateIn(viewModelScope, SharingStarted.Lazily, ComposeTheme.Default)

    /**
     * Подтема
     */
    val subtheme: StateFlow<SubTheme?>
        get() = _subtheme.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .mapLatest { state ->
                updateUiStateWithDefaultVariant()
                appearanceProperties(state) + variantProperty(state) + state.toProps()
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("UNCHECKED_CAST")
    override fun updateProperty(name: String, value: Any?) {
        val state = internalUiState.value
        internalUiState.value = when (name) {
            APPEARANCE_PROPERTY_NAME -> state.updateVariant(value?.toString() ?: "", state.variant) as State
            VARIANT_PROPERTY_NAME -> state.updateVariant(state.appearance, value?.toString() ?: "") as State
            SUBTHEME_PROPERTY_NAME -> {
                val type = SubTheme.entries.firstOrNull { it.key == value }
                _subtheme.value = type
                state
            }
            else -> stateTransformer.transform(internalUiState.value, name, value ?: "")
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultVariant() {
        val state = internalUiState.value
        val defaultAppearance = getDefaultAppearances()
        val appearance = state.appearance.ifEmpty { defaultAppearance }
        val styleProvider = getStyleProvider(appearance) ?: return
        if (state.variant.isNotEmpty() &&
            styleProvider.variants.contains(state.variant)
        ) {
            return
        }
        internalUiState.value = state.updateVariant(
            appearance = appearance,
            variant = styleProvider.defaultVariant,
        ) as State
    }

    private fun appearanceProperties(state: State): List<Property.SingleChoiceProperty> {
        return listOf(
            Property.SingleChoiceProperty(
                APPEARANCE_PROPERTY_NAME,
                variants = getAppearances().toList(),
                value = state.appearance,
            ),
        )
    }

    private fun variantProperty(state: State): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider(state.appearance) ?: return emptyList()
        val subthemes = getSubThemes()
        val variantProperties = mutableListOf<Property.SingleChoiceProperty>()
        if (styleProvider.variants.isNotEmpty()) {
            variantProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                ),
            )
        }
        if (subthemes.isNotEmpty()) {
            variantProperties.add(
                Property.SingleChoiceProperty(
                    SUBTHEME_PROPERTY_NAME,
                    variants = subthemes.map { it.key },
                    value = _subtheme.value?.key ?: subthemes.first().key,
                ),
            )
        }
        return variantProperties
    }

    private fun getStyleProvider(appearance: String): ComposeStyleProvider<S>? {
        return runCatching {
            theme.value.getStyleProvider<S>(componentKey, appearance)
        }.getOrNull()
    }

    private fun getAppearances(): Set<String> {
        return theme.value.getAppearances(componentKey)
    }

    private fun getDefaultAppearances(): String {
        return theme.value.getDefaultAppearance(componentKey)
    }

    private fun getSubThemes(): Set<SubTheme> {
        return theme.value.subthemes.keys
    }

    private fun State.toProps(): List<Property<*>> = propertiesProducer.getProperties(this)

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
        const val SUBTHEME_PROPERTY_NAME = "subtheme"
        const val APPEARANCE_PROPERTY_NAME = "appearance"
    }
}

internal class ComponentViewModelFactory<State : UiState, S : Style>(
    private val defaultState: State,
    private val propertiesProducer: PropertiesProducer<State>,
    private val stateTransformer: StateTransformer<State>,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ComponentViewModel<State, S>(defaultState, propertiesProducer, stateTransformer, componentKey) as T
    }
}
