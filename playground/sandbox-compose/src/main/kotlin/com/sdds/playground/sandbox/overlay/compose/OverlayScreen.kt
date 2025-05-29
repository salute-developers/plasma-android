package com.sdds.playground.sandbox.overlay.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.style.style
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.S

/**
 * Экран с компонентом [Overlay]
 */
@Composable
internal fun OverlayScreen(componentKey: ComponentKey = ComponentKey.Overlay) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<OverlayViewModel>(
            factory = OverlayViewModelFactory(OverlayUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            var showOverlay by remember { mutableStateOf(false) }
            Button(
                label = "Show overlay",
                onClick = {
                    showOverlay = true
                },
            )
            if (showOverlay) {
                Overlay(
                    modifier = Modifier.fillMaxSize(),
                    style = style,
                ) {
                    IconButton(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(end = 8.dp, top = 8.dp),
                        style = IconButton.S.Clear.style(),
                        icon = painterResource(id = R.drawable.ic_close_24),
                        onClick = { showOverlay = false },
                    )
                }
            }
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun OverlayPreview() {
    SandboxTheme {
        OverlayScreen()
    }
}
