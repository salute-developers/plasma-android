package com.sdds.playground.sandbox.buttons.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconButton
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с IconButton
 */
@Composable
internal fun IconButtonScreen(
    theme: Theme.ThemeInfoCompose = Theme.SddsServ.compose,
) {
    val buttonViewModel: IconButtonViewModel = viewModel(
        factory = IconButtonViewModelFactory(ButtonUiState(), theme),
        key = theme.toString(),
    )
    val buttonState by buttonViewModel.uiState.collectAsState()
    ComponentScaffold(
        component = {
            theme.themeWrapper {
                IconButton(
                    icon = painterResource(buttonState.icon.iconId),
                    onClick = { },
                    style = buttonViewModel
                        .getStyleProvider()
                        .style(buttonState.variant),
                    enabled = buttonState.enabled,
                    loading = buttonState.loading,
                )
            }
        },
        propertiesOwner = buttonViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun IconButtonsScreenPreview() {
    SandboxTheme {
        IconButtonScreen()
    }
}
