package com.sdds.playground.sandbox.indicator.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Indicator
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с компонентом [Indicator]
 */
@Composable
internal fun IndicatorScreen() {
    val indicatorViewModel: IndicatorViewModel = viewModel(IndicatorViewModel::class.java)
    val indicatorUiState by indicatorViewModel.indicatorUiState.collectAsState()

    ComponentScaffold(
        component = {
            Indicator(
                style = indicatorUiState.indicatorStyle(),
            )
        },
        propertiesOwner = indicatorViewModel,
    )
}

@Composable
@Preview(showBackground = true)
private fun IndicatorsPreview() {
    SandboxTheme {
        IndicatorScreen()
    }
}
