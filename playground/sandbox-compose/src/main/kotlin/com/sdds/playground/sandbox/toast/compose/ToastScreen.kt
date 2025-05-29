package com.sdds.playground.sandbox.toast.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Toast]
 */
@Composable
internal fun ToastScreen(componentKey: ComponentKey = ComponentKey.Toast) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ToastViewModel>(
            factory = ToastViewModelFactory(
                defaultState = ToastUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { toastUiState, style ->
            val overlayManager = LocalOverlayManager.current
            Button(
                modifier = Modifier.align(Alignment.Center),
                label = "show",
                onClick = {
                    overlayManager.showToast(
                        position = toastUiState.position,
                    ) {
                        Toast(
                            style = style,
                            text = toastUiState.text,
                            contentStart = getContentStart(toastUiState.hasContentStart),
                            contentEnd = getContentEnd(toastUiState.hasContentEnd) {
                                overlayManager.remove(it)
                            },
                        )
                    }
                },
            )
        },
    )
}

private fun getContentStart(hasContentStart: Boolean): @Composable (() -> Unit)? {
    return if (hasContentStart) {
        @Composable { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") }
    } else {
        null
    }
}

private fun getContentEnd(hasContentEnd: Boolean, onClick: () -> Unit): @Composable (() -> Unit)? {
    return if (hasContentEnd) {
        @Composable {
            Icon(
                modifier = Modifier.clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    onClick.invoke()
                },
                painter = painterResource(R.drawable.ic_close_16),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
private fun ToastScreenPreview() {
    SandboxTheme {
        ToastScreen()
    }
}
