package com.sdds.compose.uikit.fixtures.stories.notification

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.NotificationUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.NotificationUiStateTransformer
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class NotificationUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Notification Text",
    val hasClose: Boolean = true,
    val focusable: Boolean = false,
    val autoDismiss: Boolean = true,
    val showId: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object NotificationStory : ComposeBaseStory<NotificationUiState, NotificationStyle>(
    ComponentKey.Notification,
    NotificationUiState(),
    NotificationUiStatePropertiesProducer,
    NotificationUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NotificationStyle,
        state: NotificationUiState,
    ) {
        val overlayManager = LocalOverlayManager.current
        Button(
            modifier = Modifier.align(Alignment.Center),
            label = "show",
            onClick = {
                overlayManager.showNotification(
                    durationMillis = if (state.autoDismiss) 3000 else null,
                    position = state.position,
                    isFocusable = state.focusable,
                ) {
                    Notification(
                        style = style,
                        hasClose = state.hasClose,
                        closeIcon = painterResource(R.drawable.ic_close_24),
                        onClose = { overlayManager.remove(it) },
                    ) {
                        val idText = if (state.showId) " $it" else ""
                        NotificationContent(
                            modifier = Modifier.fillMaxWidth(0.8f),
                            title = state.title,
                            text = "${state.text}$idText",
                            buttons = {
                                button { Button(label = "Ok", onClick = {}) }
                                button { Button(label = "Cancel", onClick = {}) }
                            },
                        )
                    }
                }
            },
        )
    }

    @Composable
    override fun Preview(
        style: NotificationStyle,
        key: ComponentKey,
    ) {
        val overlayManager = LocalOverlayManager.current
        Button(
            label = "Show Notification",
            onClick = {
                overlayManager.showNotification(
                    durationMillis = 3000,
                    position = OverlayPosition.CenterStart,
                    isFocusable = true,
                ) {
                    Notification(
                        style = style,
                        hasClose = true,
                        closeIcon = painterResource(R.drawable.ic_close_24),
                        onClose = { overlayManager.remove(it) },
                    ) {
                        val idText = "$it"
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(end = 32.dp),
                        ) {
                            Text(text = "Notification $idText")
                            Spacer(Modifier.size(8.dp))
                            Button(
                                label = "Action",
                                onClick = {},
                            )
                        }
                    }
                }
            },
        )
    }
}
