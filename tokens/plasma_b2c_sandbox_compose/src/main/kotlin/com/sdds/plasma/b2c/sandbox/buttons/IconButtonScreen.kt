package com.sdds.plasma.b2c.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconButton
import com.sdds.plasma.b2c.sandbox.SandboxTheme
import com.sdds.plasma.b2c.sandbox.core.ComponentScaffold

/**
 * Экран с IconButton
 */
@Composable
internal fun IconButtonScreen() {
    val buttonViewModel: ButtonParametersViewModel = viewModel(
        factory = ButtonParametersViewModelFactory(ButtonType.Icon),
        key = "iconButton",
    )
    val buttonState by buttonViewModel.buttonState.collectAsState()
    ComponentScaffold(
        component = {
            IconButton(
                icon = painterResource(buttonState.icon.iconId),
                onClick = { },
                style = buttonState.iconButtonStyle(),
                enabled = buttonState.enabled,
                loading = buttonState.loading,
            )
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
