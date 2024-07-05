package com.sdds.playground.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconButton
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с IconButton
 */
@Composable
internal fun IconButtonsScreen() {
    val buttonViewModel: ButtonParametersViewModel = viewModel(
        factory = ButtonParametersViewModelFactory(ButtonType.Icon),
        key = "iconButton",
    )
    val buttonState by buttonViewModel.buttonState.collectAsState()
    ComponentScaffold(
        component = {
            IconButton(
                icon = painterResource(id = R.drawable.ic_launcher_foreground),
                onClick = { },
                style = buttonState.style,
                size = buttonState.size,
                shape = buttonState.shape,
                enabled = buttonState.enabled,
                loading = buttonState.loading,
                settingsProvider = DefaultButtonSettingsProvider
            )
        },
        propertiesOwner = buttonViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun IconButtonsScreenPreview() {
    SandboxTheme {
        IconButtonsScreen()
    }
}
