package com.sdds.plasma.b2c.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.plasma.b2c.sandbox.SandboxTheme
import com.sdds.plasma.b2c.sandbox.core.ComponentScaffold

/**
 * Экран с [CheckBox]
 */
@Composable
internal fun CheckBoxScreen() {
    val checkboxViewModel: CheckBoxParametersViewModel =
        viewModel(CheckBoxParametersViewModel::class.java)
    val checkboxState by checkboxViewModel.checkboxState.collectAsState()

    ComponentScaffold(
        component = {
            CheckBox(
                style = checkboxState.checkBoxStyle(),
                state = checkboxState.state,
                label = checkboxState.label,
                description = checkboxState.description,
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
