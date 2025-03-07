package com.sdds.playground.sandbox.buttons.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.compose.NewComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.CoreComponent

/**
 * Экран с LinkButton
 */
@Composable
internal fun LinkButtonScreen(componentKey: ComponentKey = ComponentKey.LinkButton) {

    NewComponentScaffold(
        key = componentKey,
        viewModel = viewModel<LinkButtonViewModel>(
            factory = LinkButtonViewModelFactory(ButtonUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { buttonState, style ->
            Button(
                label = buttonState.buttonLabel,
                value = buttonState.buttonValue,
                style = style,
                enabled = buttonState.enabled,
                loading = buttonState.loading,
                spacing = buttonState.spacing,
                icons = when (val icon = buttonState.icon) {
                    ButtonIcon.End -> Button.Icons(end = painterResource(id = icon.iconId))
                    ButtonIcon.No -> null
                    ButtonIcon.Start -> Button.Icons(start = painterResource(id = icon.iconId))
                },
                onClick = {},
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun LinkButtonsScreenPreview() {
    SandboxTheme {
        LinkButtonScreen()
    }
}
