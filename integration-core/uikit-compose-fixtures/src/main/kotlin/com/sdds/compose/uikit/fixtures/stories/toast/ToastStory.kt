package com.sdds.compose.uikit.fixtures.stories.toast

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.fixtures.stories.ToastUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ToastUiStateTransformer
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ToastUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val text: String = "Toast Text",
    val hasContentStart: Boolean = true,
    val hasContentEnd: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
    val autoDismiss: Boolean = true,
    val showViaModal: Boolean = false,
    val modalGravity: ModalGravity = ModalGravity.Center,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ToastStory : ComposeBaseStory<ToastUiState, ToastStyle>(
    ComponentKey.Toast,
    ToastUiState(),
    ToastUiStatePropertiesProducer,
    ToastUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ToastStyle,
        state: ToastUiState,
    ) {
        val overlayManager = LocalOverlayManager.current
        if (state.showViaModal) {
            ToastViaModal(
                state = state,
                style = style,
                overlayManager = overlayManager,
            )
        } else {
            Button(
                modifier = Modifier.align(Alignment.Center),
                label = "show",
                onClick = {
                    overlayManager.showToast(
                        position = state.position,
                        durationMillis = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS
                            .takeIf { state.autoDismiss },
                    ) {
                        Toast(
                            style = style,
                            contentStart = getContentStart(state.hasContentStart),
                            contentEnd = getContentEnd(state.hasContentEnd) {
                                overlayManager.remove(it)
                            },
                        ) {
                            Text(state.text)
                        }
                    }
                },
            )
        }
    }

    @Composable
    override fun Preview(
        style: ToastStyle,
        key: ComponentKey,
    ) {
        val overlayManager = LocalOverlayManager.current
        Button(
            label = "Show Toast",
            onClick = {
                overlayManager.showToast(
                    position = OverlayPosition.BottomCenter,
                ) {
                    Toast(
                        style = style,
                        text = "Toast Text",
                        contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
                        contentEnd = {
                            Icon(
                                modifier = Modifier.clickable(
                                    indication = null,
                                    interactionSource = remember { MutableInteractionSource() },
                                ) {
                                    overlayManager.remove(it)
                                },
                                painter = painterResource(R.drawable.ic_close_16),
                                contentDescription = "",
                            )
                        },
                    )
                }
            },
        )
    }
}

@Composable
private fun BoxScope.ToastViaModal(
    state: ToastUiState,
    style: ToastStyle,
    overlayManager: OverlayManager,
) {
    var showDialog by remember { mutableStateOf(false) }
    if (state.showViaModal) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            label = "show dialog",
            onClick = { showDialog = true },
        )
        if (showDialog) {
            Modal(
                show = true,
                onDismissRequest = { showDialog = false },
                modifier = Modifier.width(300.dp),
                gravity = state.modalGravity,
                dialogProperties = DialogProperties(
                    dismissOnBackPress = false,
                    dismissOnClickOutside = false,
                ),
                hasClose = true,
                edgeToEdge = true,
                dimBackground = false,
                useNativeBlackout = false,
                closeIcon = painterResource(R.drawable.ic_close_24),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Button(
                        modifier = Modifier.align(Alignment.Center),
                        label = "show toast",
                        onClick = {
                            overlayManager.showToast(
                                onDismiss = {},
                                position = state.position,
                                durationMillis = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS
                                    .takeIf { state.autoDismiss },
                            ) {
                                Toast(
                                    style = style,
                                    contentStart = getContentStart(state.hasContentStart),
                                    contentEnd = getContentEnd(state.hasContentEnd) {
                                        overlayManager.remove(it)
                                    },
                                ) {
                                    Text(state.text)
                                }
                            }
                        },
                    )
                }
            }
        }
    }
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
