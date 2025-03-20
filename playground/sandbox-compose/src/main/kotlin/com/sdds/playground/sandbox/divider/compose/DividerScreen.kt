package com.sdds.playground.sandbox.divider.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Divider
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Divider]
 */
@Composable
internal fun DividerScreen(componentKey: ComponentKey = ComponentKey.Divider) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<DividerViewModel>(
            factory = DividerViewModelFactory(DividerUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            Divider(
                style = style,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun DividerPreview() {
    SandboxTheme {
        DividerScreen()
    }
}
