package com.sdds.playground.sandbox.cell.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal class CellViewModel : ViewModel(), PropertiesOwner {

    private val _cellState = MutableStateFlow(CellUiState())

    /**
     * Состояние cell
     */
    val cellState: StateFlow<CellUiState>
        get() = _cellState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _cellState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _cellState.value = CellUiState()
    }

    private fun CellUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "size",
                value = size,
                onApply = {
                    _cellState.value = _cellState.value.copy(size = it)
                },
            ),
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = {
                    _cellState.value = _cellState.value.copy(label = it)
                },
            ),
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = {
                    _cellState.value = _cellState.value.copy(title = it)
                },
            ),
            Property.StringProperty(
                name = "subtitle",
                value = subtitle,
                onApply = {
                    _cellState.value = _cellState.value.copy(subtitle = it)
                },
            ),
            Property.StringProperty(
                name = "disclosureText",
                value = disclosureText,
                onApply = {
                    _cellState.value = _cellState.value.copy(disclosureText = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasDisclosure",
                value = hasDisclosure,
                onApply = {
                    _cellState.value = _cellState.value.copy(hasDisclosure = it)
                },
            ),
            enumProperty(
                name = "startContent",
                value = startContent,
                onApply = {
                    _cellState.value = _cellState.value.copy(startContent = it)
                },
            ),
            enumProperty(
                name = "endContent",
                value = endContent,
                onApply = {
                    _cellState.value = _cellState.value.copy(endContent = it)
                },
            ),
        )
    }
}
