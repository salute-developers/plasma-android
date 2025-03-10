package com.sdds.playground.sandbox.progress.compose

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.ProgressBar
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [ProgressBar]
 */
@Composable
internal fun ProgressScreen(componentKey: ComponentKey = ComponentKey.ProgressBar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ProgressViewModel>(
            factory = ProgressViewModelFactory(defaultState = ProgressUiState(), componentKey = componentKey),
            key = componentKey.toString(),
        ),
        component = { progressUiState, style ->
            ProgressBar(
                progress = progressUiState.progress,
                modifier = Modifier.width(240.dp),
                style = style,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun IndicatorsPreview() {
    SandboxTheme {
        ProgressScreen()
    }
}
