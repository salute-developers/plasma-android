package com.sdds.playground.sandbox.radiobox.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [RadioBox]
 */
@Composable
internal fun RadioBoxScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val radioBoxViewModel: RadioBoxViewModel = viewModel(
        factory = RadioBoxViewModelFactory(RadioBoxUiState(), theme),
        key = theme.toString(),
    )
    val radioBoxState by radioBoxViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                RadioBox(
                    style = radioBoxViewModel
                        .getStyleProvider()
                        .style(radioBoxState.variant),
                    checked = radioBoxState.checked,
                    onClick = {},
                    label = radioBoxState.label,
                    description = radioBoxState.description,
                    enabled = radioBoxState.enabled,
                )
            }
        },
        propertiesOwner = radioBoxViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun RadioBoxScreenPreview() {
    SandboxTheme {
        RadioBoxScreen()
    }
}
