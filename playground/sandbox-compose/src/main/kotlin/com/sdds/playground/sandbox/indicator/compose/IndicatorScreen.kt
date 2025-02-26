package com.sdds.playground.sandbox.indicator.compose

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Indicator
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с компонентом [Indicator]
 */
@Composable
internal fun IndicatorScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val indicatorViewModel: IndicatorViewModel =
        viewModel(
            factory = IndicatorViewModelFactory(IndicatorUiState(), theme),
            key = theme.toString(),
        )
    val uiState by indicatorViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                val interactionSource = remember { MutableInteractionSource() }
                Indicator(
                    style = indicatorViewModel
                        .getStyleProvider()
                        .style(uiState.variant),
                    interactionSource = interactionSource,
                )
            }
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
