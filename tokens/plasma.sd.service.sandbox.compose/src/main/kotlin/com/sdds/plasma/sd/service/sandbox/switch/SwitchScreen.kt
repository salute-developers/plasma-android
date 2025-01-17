package com.sdds.plasma.sd.service.sandbox.switch

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Switch
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.core.ComponentScaffold

/**
 * Экран с [Switch]
 */
@Composable
internal fun SwitchScreen() {
    val switchViewModel: SwitchParametersViewModel =
        viewModel(SwitchParametersViewModel::class.java)
    val switchState by switchViewModel.switchState.collectAsState()

    ComponentScaffold(
        component = {
            Switch(
                active = switchState.active,
                label = switchState.label,
                description = switchState.description,
                enabled = switchState.enabled,
                modifier = Modifier.fillMaxWidth(),
                onActiveChanged = { switchViewModel.updateActive(it) },
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
