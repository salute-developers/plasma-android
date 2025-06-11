package com.sdds.playground.sandbox.spinner

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Spinner
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Spinner]
 */
@Composable
internal fun SpinnerScreen(componentKey: ComponentKey = ComponentKey.Spinner) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<SpinnerViewModel>(
            factory = SpinnerViewModelFactory(SpinnerUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            Spinner(style = style)
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun SpinnerPreview() {
    SandboxTheme {
        SpinnerScreen()
    }
}
