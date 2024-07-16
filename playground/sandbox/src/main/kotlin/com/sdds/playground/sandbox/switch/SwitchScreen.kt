package com.sdds.playground.sandbox.switch

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с [SandboxSwitch]
 */
@Composable
internal fun SwitchScreen() {
    val switchViewModel: SwitchParametersViewModel =
        viewModel(SwitchParametersViewModel::class.java)
    val switchState by switchViewModel.switchState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxSwitch(
                active = switchState.active,
                label = switchState.label,
                description = switchState.description,
                enabled = switchState.enabled,
                modifier = Modifier.fillMaxWidth(),
            )
        },
        propertiesOwner = switchViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun SwitchScreenPreview() {
    SandboxTheme {
        SwitchScreen()
    }
}
