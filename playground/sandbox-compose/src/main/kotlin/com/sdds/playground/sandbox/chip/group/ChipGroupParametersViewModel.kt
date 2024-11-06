package com.sdds.playground.sandbox.chip.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.chip.Size
import com.sdds.playground.sandbox.core.PropertiesOwner
import com.sdds.playground.sandbox.core.Property
import com.sdds.playground.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal class ChipGroupParametersViewModel : ViewModel(), PropertiesOwner {

    private val _chipGroupState = MutableStateFlow(ChipGroupUiState())

    val chipGroupState: StateFlow<ChipGroupUiState>
        get() = _chipGroupState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _chipGroupState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _chipGroupState.value = ChipGroupUiState()
    }

    private fun updateQuantity(quantity: Int, label: String) {
        if (quantity !in 2..10) return
        _chipGroupState.value = _chipGroupState.value.copy(
            items = List(quantity) { label },
        )
    }

    private fun updateLabel(label: String) {
        _chipGroupState.value = _chipGroupState.value.copy(
            items = _chipGroupState.value.items.map { label },
        )
    }

    private fun updateSize(size: Size) {
        _chipGroupState.value = _chipGroupState.value.copy(size = size)
    }

    private fun updateGap(gap: Gap) {
        _chipGroupState.value = _chipGroupState.value.copy(gap = gap)
    }

    private fun updateWrap(wrap: Boolean) {
        _chipGroupState.value = _chipGroupState.value.copy(shouldWrap = wrap)
    }

    private fun updateEnabled(enabled: Boolean) {
        _chipGroupState.value = _chipGroupState.value.copy(enabled = enabled)
    }

    private fun ChipGroupUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "quantity",
                value = items.size,
                onApply = { updateQuantity(it, items.first()) },
            ),

            Property.StringProperty(
                name = "label",
                value = items.first(),
                onApply = { updateLabel(it) },
            ),

            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),

            enumProperty(
                name = "gap",
                value = gap,
                onApply = { updateGap(it) },
            ),

            Property.BooleanProperty(
                name = "wrap",
                value = shouldWrap,
                onApply = { updateWrap(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabled(it) },
            ),
        )
    }
}
