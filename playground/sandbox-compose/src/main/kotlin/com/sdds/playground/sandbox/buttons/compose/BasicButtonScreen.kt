package com.sdds.playground.sandbox.buttons.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonIcons
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран со [Button]
 */
@Composable
internal fun BasicButtonScreen(componentKey: ComponentKey = ComponentKey.BasicButton) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ButtonViewModel>(
            factory = ButtonViewModelFactory(ButtonUiState(), componentKey),
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
                    ButtonIcon.End -> ButtonIcons(endRes = icon.iconId)
                    ButtonIcon.No -> null
                    ButtonIcon.Start -> ButtonIcons(startRes = icon.iconId)
                },
                onClick = {},
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        BasicButtonScreen()
    }
}
