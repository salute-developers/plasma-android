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

/**
 * Экран с LinkButton
 */
@Composable
internal fun LinkButtonScreen(
    theme: Theme.ThemeInfoCompose = Theme.SddsServ.compose,
) {
    val buttonViewModel: LinkButtonViewModel = viewModel(
        factory = LinkButtonViewModelFactory(ButtonUiState(), theme),
        key = theme.toString(),
    )
    val buttonState by buttonViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                Button(
                    label = buttonState.buttonLabel,
                    value = buttonState.buttonValue,
                    style = buttonViewModel
                        .getStyleProvider()
                        .style(buttonState.variant),
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
            }
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
