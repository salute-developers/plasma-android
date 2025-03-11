package com.sdds.playground.sandbox.indicator.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Indicator
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Indicator]
 */
@Composable
internal fun IndicatorScreen(componentKey: ComponentKey = ComponentKey.Indicator) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<IndicatorViewModel>(
            factory = IndicatorViewModelFactory(IndicatorUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            Indicator(
                style = style,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun IndicatorsPreview() {
    SandboxTheme {
        IndicatorScreen()
    }
}
