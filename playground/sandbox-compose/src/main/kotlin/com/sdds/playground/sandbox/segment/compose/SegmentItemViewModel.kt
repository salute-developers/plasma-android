package com.sdds.playground.sandbox.segment.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal class SegmentItemViewModel(
    defaultState: SegmentItemUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<SegmentItemUiState, SegmentItemStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, SegmentItemStyle> {
        return theme.stylesProvider.segmentItem
    }

    override fun SegmentItemUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(label = it)
                },
            ),
            Property.StringProperty(
                name = "value",
                value = value,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(value = it)
                },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(enabled = it)
                },
            ),
            Property.StringProperty(
                name = "count",
                value = count,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(count = it)
                },
            ),
            enumProperty(
                name = "startContent",
                value = startContent,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(startContent = it)
                },
            ),
            enumProperty(
                name = "endContent",
                value = endContent,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(endContent = it)
                },
            ),
        )
    }
}

internal class SegmentItemViewModelFactory(
    private val defaultState: SegmentItemUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentItemViewModel(defaultState, theme) as T
    }
}
