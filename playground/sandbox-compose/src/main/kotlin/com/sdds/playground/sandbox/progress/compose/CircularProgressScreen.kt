package com.sdds.playground.sandbox.progress.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [CircularProgressBar]
 */
@Composable
internal fun CircularProgressScreen(componentKey: ComponentKey = ComponentKey.CircularProgressBar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CircularProgressViewModel>(
            factory = CircularProgressViewModelFactory(
                defaultState = CircularProgressUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { progressUiState, style ->
            CircularProgressBar(
                progress = progressUiState.progress,
                style = style,
                trackEnabled = progressUiState.trackEnabled,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun CircularProgressScreenPreview() {
    SandboxTheme {
        CircularProgressScreen()
    }
}
