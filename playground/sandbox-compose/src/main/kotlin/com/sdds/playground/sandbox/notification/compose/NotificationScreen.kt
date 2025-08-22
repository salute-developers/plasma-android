package com.sdds.playground.sandbox.notification.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Notification]
 */
@Composable
internal fun NotificationScreen(componentKey: ComponentKey = ComponentKey.Notification) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<NotificationViewModel>(
            factory = NotificationViewModelFactory(
                defaultState = NotificationUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { notificationUiState, style ->
            val overlayManager = LocalOverlayManager.current
            Button(
                modifier = Modifier.align(Alignment.Center),
                label = "show",
                onClick = {
                    overlayManager.showNotification(
                        durationMillis = if (notificationUiState.autoDismiss) 3000 else null,
                        position = notificationUiState.position,
                        isFocusable = notificationUiState.focusable,
                    ) {
                        Notification(
                            style = style,
                            hasClose = notificationUiState.hasClose,
                            closeIcon = painterResource(R.drawable.ic_close_24),
                            onClose = { overlayManager.remove(it) },
                        ) {
                            val idText = if (notificationUiState.showId) " $it" else ""
                            NotificationContent(
                                modifier = Modifier.fillMaxWidth(0.8f),
                                title = notificationUiState.title,
                                text = "${notificationUiState.text}$idText",
                                buttons = {
                                    button { Button(label = "Ok", onClick = {}) }
                                    button { Button(label = "Cancel", onClick = {}) }
                                },
                            )
                        }
                    }
                },
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun NotificationScreenPreview() {
    SandboxTheme {
        NotificationScreen()
    }
}
