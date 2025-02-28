package com.sdds.playground.sandbox.indicator.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel компонента Indicator
 */
internal class IndicatorViewModel(
    defaultState: IndicatorUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<IndicatorUiState, IndicatorStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, IndicatorStyle> {
        return theme.stylesProvider.indicator
    }

    override fun IndicatorUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class IndicatorViewModelFactory(
    private val defaultState: IndicatorUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IndicatorViewModel(defaultState, theme) as T
    }
}
