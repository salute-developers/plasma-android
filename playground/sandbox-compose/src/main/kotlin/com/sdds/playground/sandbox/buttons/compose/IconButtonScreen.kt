package com.sdds.playground.sandbox.buttons.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconButton
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с IconButton
 */
@Composable
internal fun IconButtonScreen(componentKey: ComponentKey = ComponentKey.IconButton) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<IconButtonViewModel>(
            factory = IconButtonViewModelFactory(ButtonUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { buttonState, style ->
            IconButton(
                icon = painterResource(buttonState.icon.iconId),
                onClick = { },
                style = style,
                enabled = buttonState.enabled,
                loading = buttonState.loading,
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun IconButtonsScreenPreview() {
    SandboxTheme {
        IconButtonScreen()
    }
}
