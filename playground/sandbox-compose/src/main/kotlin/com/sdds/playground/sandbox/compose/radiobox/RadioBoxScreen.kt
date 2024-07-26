package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.playground.sandbox.compose.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с [SandboxRadioBox]
 */
@Composable
internal fun RadioBoxScreen() {
    val radioboxViewModel: RadioBoxParametersViewModel =
        viewModel(RadioBoxParametersViewModel::class.java)
    val radioboxState by radioboxViewModel.radioBoxState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxRadioBox(
                checked = radioboxState.checked,
                onClick = {},
                size = radioboxState.size,
                label = radioboxState.label,
                description = radioboxState.description,
                enabled = radioboxState.enabled,
            )
        },
        propertiesOwner = radioboxViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        RadioBoxScreen()
    }
}
