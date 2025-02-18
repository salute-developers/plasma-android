package com.sdds.playground.sandbox.checkbox.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [CheckBox]
 */
@Composable
internal fun CheckBoxScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val checkboxViewModel: CheckBoxViewModel =
        viewModel(
            factory = CheckBoxViewModelFactory(CheckBoxUiState(), theme),
            key = theme.toString(),
        )
    val checkboxState by checkboxViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                CheckBox(
                    style = checkboxViewModel
                        .getStyleProvider()
                        .style(checkboxState.variant),
                    state = checkboxState.state,
                    label = checkboxState.label,
                    description = checkboxState.description,
                    enabled = checkboxState.enabled,
                )
            }
        },
        propertiesOwner = checkboxViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        CheckBoxScreen()
    }
}
