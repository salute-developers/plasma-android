package com.sdds.playground.sandbox.radiobox.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [RadioBox]
 */
@Composable
internal fun RadioBoxScreen() {
    val radioboxViewModel: RadioBoxParametersViewModel = viewModel(RadioBoxParametersViewModel::class.java)
    val radioboxState by radioboxViewModel.radioBoxState.collectAsState()

    ComponentScaffold(
        component = {
            RadioBox(
                style = radioboxState.radioBoxStyle(),
                checked = radioboxState.checked,
                onClick = {},
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
private fun RadioBoxScreenPreview() {
    SandboxTheme {
        RadioBoxScreen()
    }
}
