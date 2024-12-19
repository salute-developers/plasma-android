package com.sdds.playground.sandbox.cell.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel компонента Cell
 * @author Малышев Александр on 14.10.2024
 */
internal class CellParametersViewModel(
    private val defaultState: CellUiState,
) : ViewModel(), PropertiesOwner {

    private val _cellUiState = MutableStateFlow(defaultState)

    /**
     * Состояние компонента Cell
     */
    val cellUiState: StateFlow<CellUiState>
        get() = _cellUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _cellUiState
            .mapLatest { it.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        val propertyName = CellPropertyName.values().find { it.value == name }
        val currentState = _cellUiState.value
        _cellUiState.value = when (propertyName) {
            CellPropertyName.Variant -> currentState.copy(variant = CellVariant.valueOf(valueString))
            CellPropertyName.Label -> currentState.copy(label = valueString)
            CellPropertyName.Title -> currentState.copy(title = valueString)
            CellPropertyName.Subtitle -> currentState.copy(subtitle = valueString)
            CellPropertyName.DisclosureText -> currentState.copy(disclosureText = valueString)
            CellPropertyName.HasDisclosure -> currentState.copy(hasDisclosure = valueString.toBoolean())
            CellPropertyName.StartContent -> currentState.copy(startContent = CellContent.valueOf(valueString))
            CellPropertyName.EndContent -> currentState.copy(endContent = CellContent.valueOf(valueString))
            else -> currentState
        }
    }

    override fun resetToDefault() {
        _cellUiState.value = defaultState
    }

    private fun CellUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = CellPropertyName.Variant.value,
                value = variant,
            ),
            Property.StringProperty(
                name = CellPropertyName.Label.value,
                value = label,
            ),
            Property.StringProperty(
                name = CellPropertyName.Title.value,
                value = title,
            ),
            Property.StringProperty(
                name = CellPropertyName.Subtitle.value,
                value = subtitle,
            ),
            Property.StringProperty(
                name = CellPropertyName.DisclosureText.value,
                value = disclosureText,
            ),
            Property.BooleanProperty(
                name = CellPropertyName.HasDisclosure.value,
                value = hasDisclosure,
            ),
            enumProperty(
                name = CellPropertyName.StartContent.value,
                value = startContent,
            ),
            enumProperty(
                name = CellPropertyName.EndContent.value,
                value = endContent,
            ),
        )
    }

    private enum class CellPropertyName(val value: String) {
        Variant("variant"),
        Label("label"),
        Title("title"),
        Subtitle("subtitle"),
        DisclosureText("disclosureText"),
        HasDisclosure("hasDisclosure"),
        StartContent("startContent"),
        EndContent("endContent"),
    }
}

/**
 * Фабрика для [CellParametersViewModel]
 */
internal class CellParametersViewModelFactory(
    private val defaultState: CellUiState = CellUiState(),
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CellParametersViewModel(defaultState) as T
    }
}
