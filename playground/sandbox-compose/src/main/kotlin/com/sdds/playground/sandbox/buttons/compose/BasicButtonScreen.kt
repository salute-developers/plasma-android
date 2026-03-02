package com.sdds.playground.sandbox.buttons.compose

import android.util.Log
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonIcons
import com.sdds.compose.uikit.ButtonSpacing
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
            val widthModifier = if (buttonState.hasFixedWidth) {
                Modifier.width(260.dp)
            } else {
                Modifier
            }
            Button(
                modifier = widthModifier,
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
                onClickLabel = "Протестировать текст для Accessibility",
                onClick = {
                    Log.d("BasicButton", "onClick")
                },
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

@Preview
@Composable
private fun TestButtonInScrollContainer() {
    SandboxTheme {
        Row(
            Modifier.horizontalScroll(rememberScrollState()),
        ) {
            repeat(20) {
                Button(
                    modifier = Modifier,
                    label = "Label$it",
                    value = "Value",
                    spacing = ButtonSpacing.SpaceBetween,
                    onClick = {
                        Log.d("BasicButton", "onClick")
                    },
                )
            }
        }
    }
}
