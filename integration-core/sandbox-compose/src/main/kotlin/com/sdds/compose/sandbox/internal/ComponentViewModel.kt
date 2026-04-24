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
import com.sdds.sandbox.StateOwner
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.ThemeManager
import com.sdds.sandbox.UiState
import com.sdds.sandbox.getAppearances
import com.sdds.sandbox.getDefaultAppearance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn

internal class ComponentViewModel<State : UiState, S : Style>(
    private val defaultState: State,
    private val propertiesProducer: PropertiesProducer<State>,
    private val stateTransformer: StateTransformer<State>,
    private val componentKey: ComponentKey,
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel(), PropertiesOwner, StateOwner<State> {

    private val internalUiState = MutableStateFlow(defaultState)
    private val selectedBindings = MutableStateFlow<Map<String, Any?>>(emptyMap())
    private val _subtheme = MutableStateFlow<SubTheme?>(null)

    override val uiState: StateFlow<State> = internalUiState.asStateFlow()

    /**
     * Подтема
     */
    val theme: StateFlow<ComposeTheme> = themeManager.currentTheme
        .mapNotNull { it as? ComposeTheme }
        .stateIn(viewModelScope, SharingStarted.Lazily, ComposeTheme.Default)

    /**
     * Подтема
     */
    val subtheme: StateFlow<SubTheme?> = _subtheme.asStateFlow()

    /**
     * Параметры стиля
     */
    val styleProperties: StateFlow<List<Property<*>>> =
        combine(internalUiState, theme, selectedBindings) { state, themeState, bindings ->
            if (themeState.components.components.isEmpty()) return@combine emptyList()
            updateUiStateWithDefaultVariant(state, themeState)
            appearanceProperties(state, themeState) +
                styleProperties(state, themeState, bindings)
        }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override val properties: StateFlow<List<Property<*>>> =
        combine(internalUiState, theme, selectedBindings) { state, themeState, bindings ->
            if (themeState.components.components.isEmpty()) return@combine emptyList()
            state.toProps()
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
            else -> {
                val styleProvider = getStyleProvider(state.appearance, theme.value)
                if (styleProvider?.bindings?.any { it.name == name } == true) {
                    selectedBindings.value += (name to normalizeBindingValue(name, value, styleProvider))
                    state.updateVariant(
                        state.appearance,
                        styleProvider.resolveStyleKey(selectedBindings.value),
                    ) as State
                } else {
                    stateTransformer.transform(internalUiState.value, name, value ?: "")
                }
            }
        }
    }

    override fun updateState(state: State) {
        internalUiState.value = state
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultVariant(state: State, themeState: ComposeTheme) {
        val defaultAppearance = runCatching { getDefaultAppearances(themeState) }.getOrNull() ?: return
        val appearance = state.appearance.ifEmpty { defaultAppearance }
        val styleProvider = getStyleProvider(appearance, themeState) ?: return
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

    private fun appearanceProperties(state: State, themeState: ComposeTheme): List<Property.SingleChoiceProperty> {
        return listOf(
            Property.SingleChoiceProperty(
                APPEARANCE_PROPERTY_NAME,
                variants = getAppearances(themeState).toList(),
                value = state.appearance,
            ),
        )
    }

    private fun styleProperties(
        state: State,
        themeState: ComposeTheme,
        bindings: Map<String, Any?>,
    ): List<Property<*>> {
        val styleProvider = getStyleProvider(state.appearance, themeState) ?: return emptyList()
        val subthemes = getSubThemes(themeState)
        val styleProperties = mutableListOf<Property<*>>()
        if (styleProvider.bindings.isNotEmpty()) {
            styleProperties.addAll(resolveBindingProperties(styleProvider, bindings))
        } else if (styleProvider.variants.isNotEmpty()) {
            styleProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                ),
            )
        }
        if (subthemes.isNotEmpty()) {
            styleProperties.add(
                Property.SingleChoiceProperty(
                    SUBTHEME_PROPERTY_NAME,
                    variants = subthemes.map { it.key },
                    value = _subtheme.value?.key ?: subthemes.first().key,
                ),
            )
        }
        return styleProperties
    }

    private fun getStyleProvider(appearance: String, themeState: ComposeTheme): ComposeStyleProvider<S>? {
        return runCatching {
            themeState.getStyleProvider<S>(componentKey, appearance)
        }.getOrNull()
    }

    private fun getAppearances(themeState: ComposeTheme): Set<String> {
        return runCatching { themeState.getAppearances(componentKey) }.getOrNull() ?: emptySet()
    }

    private fun getDefaultAppearances(themeState: ComposeTheme): String {
        return themeState.getDefaultAppearance(componentKey)
    }

    private fun getSubThemes(themeState: ComposeTheme): Set<SubTheme> {
        return themeState.subthemes.keys
    }

    private fun State.toProps(): List<Property<*>> = propertiesProducer.getProperties(this)

    override fun resetToDefault() {
        internalUiState.value = defaultState
        selectedBindings.value = emptyMap()
        _subtheme.value = null
    }

    private fun resolveBindingProperties(
        styleProvider: ComposeStyleProvider<S>,
        bindings: Map<String, Any?>,
    ): List<Property<*>> {
        return styleProvider.bindings.map { property ->
            val value = bindings[property.name] ?: property.value
            property.withValue(value)
        }
    }

    private fun normalizeBindingValue(
        name: String,
        value: Any?,
        styleProvider: ComposeStyleProvider<S>,
    ): Any? {
        val property = styleProvider.bindings.firstOrNull { it.name == name } ?: return value
        return when (property) {
            is Property.BooleanProperty -> when (value) {
                is Boolean -> value
                is String -> value.toBooleanStrictOrNull() ?: property.value
                else -> property.value
            }
            is Property.SingleChoiceProperty -> value?.toString() ?: property.value
            else -> value
        }
    }

    private fun Property<*>.withValue(value: Any?): Property<*> {
        return when (this) {
            is Property.BooleanProperty -> copy(
                value = when (value) {
                    is Boolean -> value
                    is String -> value.toBooleanStrictOrNull() ?: this.value
                    else -> this.value
                },
            )
            is Property.SingleChoiceProperty -> copy(value = value?.toString() ?: this.value)
            else -> this
        }
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
