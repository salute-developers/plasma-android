package com.sdds.playground.sandbox.progress.compose

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.ProgressBar
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с компонентом [ProgressBar]
 */
@Composable
internal fun ProgressScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val progressViewModel: ProgressViewModel = viewModel(
        factory = ProgressViewModelFactory(defaultState = ProgressUiState(), theme = theme),
        key = theme.toString(),
    )
    val progressUiState by progressViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                ProgressBar(
                    progress = progressUiState.progress,
                    modifier = Modifier.width(240.dp),
                    style = progressViewModel
                        .getStyleProvider()
                        .style(progressUiState.variant),
                )
            }
        },
        propertiesOwner = progressViewModel,
    )
}

@Composable
@Preview(showBackground = true)
private fun IndicatorsPreview() {
    SandboxTheme {
        ProgressScreen()
    }
}
