package com.sdds.playground.sandbox.counter.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [Counter]
 */
@Composable
internal fun CounterScreen(
    theme: Theme.ThemeInfoCompose = Theme.composeDefault,
) {
    val counterViewModel: CounterParametersViewModel = viewModel(
        factory = CounterParametersViewModelFactory(CounterUiState(), theme),
        key = theme.toString(),
    )
    val counterUiState by counterViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                Counter(
                    style = counterViewModel
                        .getStyleProvider()
                        .style(counterUiState.variant),
                    count = counterUiState.count,
                )
            }
        },
        propertiesOwner = counterViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun CounterScreenPreview() {
    SandboxTheme {
        CounterScreen()
    }
}
