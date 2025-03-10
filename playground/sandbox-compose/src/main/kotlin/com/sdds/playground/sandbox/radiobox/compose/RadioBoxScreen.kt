package com.sdds.playground.sandbox.radiobox.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [RadioBox]
 */
@Composable
internal fun RadioBoxScreen(componentKey: ComponentKey = ComponentKey.RadioBox) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<RadioBoxViewModel>(
            factory = RadioBoxViewModelFactory(RadioBoxUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { radioBoxState, style ->
            RadioBox(
                style = style,
                checked = radioBoxState.checked,
                onClick = {},
                label = radioBoxState.label,
                description = radioBoxState.description,
                enabled = radioBoxState.enabled,
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun RadioBoxScreenPreview() {
    SandboxTheme {
        RadioBoxScreen()
    }
}
