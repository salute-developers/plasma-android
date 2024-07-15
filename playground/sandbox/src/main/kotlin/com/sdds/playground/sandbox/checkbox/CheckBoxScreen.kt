package com.sdds.playground.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с [SandboxCheckBox]
 */
@Composable
internal fun CheckBoxScreen() {
    val checkboxViewModel: CheckBoxParametersViewModel =
        viewModel(CheckBoxParametersViewModel::class.java)
    val checkboxState by checkboxViewModel.checkboxState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxCheckBox(
                state = checkboxState.state,
                label = checkboxState.label,
                description = checkboxState.description,
                size = checkboxState.size,
                enabled = checkboxState.enabled,
            )
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
