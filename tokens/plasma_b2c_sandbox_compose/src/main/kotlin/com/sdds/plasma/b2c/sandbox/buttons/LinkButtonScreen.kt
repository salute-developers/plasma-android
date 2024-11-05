package com.sdds.plasma.b2c.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с LinkButton
 */
@Composable
internal fun LinkButtonScreen() {
    val buttonViewModel: ButtonParametersViewModel = viewModel(
        factory = ButtonParametersViewModelFactory(ButtonType.Link),
        key = "linkButton",
    )
    val buttonState by buttonViewModel.buttonState.collectAsState()

    ComponentScaffold(
        component = {
            Button(
                label = buttonState.buttonLabel,
                value = buttonState.buttonValue,
                style = buttonState.linkButtonStyle(),
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
        propertiesOwner = buttonViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun LinkButtonsScreenPreview() {
    SandboxTheme {
        LinkButtonScreen()
    }
}
