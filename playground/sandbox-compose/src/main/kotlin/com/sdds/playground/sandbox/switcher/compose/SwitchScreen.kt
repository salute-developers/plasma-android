package com.sdds.playground.sandbox.switcher.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [Switch]
 */
@Composable
internal fun SwitchScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val switchViewModel: SwitchViewModel =
        viewModel(
            factory = SwitchViewModelFactory(SwitchUiState(), theme),
            key = theme.toString(),
        )
    val switchState by switchViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                Switch(
                    active = switchState.active,
                    label = switchState.label,
                    style = switchViewModel
                        .getStyleProvider()
                        .style(switchState.variant),
                    description = switchState.description,
                    enabled = switchState.enabled,
                    modifier = Modifier.fillMaxWidth(),
                    onActiveChanged = { switchViewModel.updateActive(it) },
                )
            }
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
