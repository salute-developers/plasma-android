package com.sdds.playground.sandbox.switcher.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [Switch]
 */
@Composable
internal fun SwitchScreen(componentKey: ComponentKey = ComponentKey.Switch) {
    val switchViewModel: SwitchViewModel =
        viewModel(
            factory = SwitchViewModelFactory(SwitchUiState(), componentKey),
            key = componentKey.toString(),
        )
    ComponentScaffold(
        key = componentKey,
        viewModel = switchViewModel,
        component = { switchState, style ->
            Switch(
                active = switchState.active,
                label = switchState.label,
                style = style,
                description = switchState.description,
                enabled = switchState.enabled,
                modifier = Modifier.fillMaxWidth(),
                onActiveChanged = { switchViewModel.updateActive(it) },
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun SwitchScreenPreview() {
    SandboxTheme {
        SwitchScreen()
    }
}
