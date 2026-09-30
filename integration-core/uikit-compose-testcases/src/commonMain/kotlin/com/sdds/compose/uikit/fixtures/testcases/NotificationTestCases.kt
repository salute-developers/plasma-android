package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayAnimationSpec
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.compose.uikit.Text
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.SddsIcons

/**
 * Тест кейсы для Notification
 */

/**
 * PLASMA-T2048
 */
@Composable
fun NotificationCompactLTopStartHasCloseText(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.TopStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseText(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2049
 */
@Composable
fun NotificationCompactMTopCenterHasCloseActionButton(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.TopCenter,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseTextActionButton(
                                style = style,
                                buttonStyle = buttonStyle,
                            )
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2049
 */
@Composable
fun NotificationCompactMTopCenterHasCloseActionButtonOpened(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationHasCloseTextActionButton(
            modifier = Modifier.align(Alignment.TopCenter),
            style = style,
            buttonStyle = buttonStyle,
        )
    }
}

/**
 * PLASMA-T2050
 */
@Composable
fun NotificationCompactSTopEndText(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.TopEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationText(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2051
 */
@Composable
fun NotificationCompactLCenterStartNoTextHasClose(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.CenterStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationNoTextHasClose(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2052
 */
@Composable
fun NotificationLooseLCenterTextHasClose(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.Center,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseText(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2053
 */
@Composable
fun NotificationLooseMCenterEndTextHasClose(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.CenterEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseText(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2053
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun NotificationLooseMCenterEndTextHasCloseOpened(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationHasCloseText(
            modifier = Modifier.align(Alignment.CenterEnd),
            style = style,
        )
    }
}

/**
 * PLASMA-T2054
 */
@Composable
fun NotificationLooseSBottomStartText(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.BottomStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationText(style = style)
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2054
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun NotificationLooseSBottomStartTextOpened(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationText(
            modifier = Modifier.align(Alignment.BottomStart),
            style = style,
        )
    }
}

/**
 * PLASMA-T2055
 */
@Composable
fun NotificationLooseLBottomCenterTextHasClose(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.BottomCenter,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseTextActionButton(
                                style = style,
                                buttonStyle = buttonStyle,
                            )
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2056
 */
@Composable
fun NotificationLooseLBottomEndTextHasCloseActionButton(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    OverlayHost {
        Box(modifier = Modifier.fillMaxSize()) {
            val overlayManager = LocalOverlayManager.current
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .align(Alignment.Center),
                label = "Show",
                onClick = {
                    overlayManager.showNotification(
                        position = OverlayPosition.BottomEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = {
                            NotificationHasCloseTextActionButton(
                                style = style,
                                buttonStyle = buttonStyle,
                            )
                        },
                    )
                },
            )
        }
    }
}

/**
 * Notification с текстом и hasClose
 */
@Composable
fun NotificationHasCloseText(
    style: NotificationStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 32.dp),
            ) {
                Text(text = "Notification")
                Spacer(Modifier.size(8.dp))
            }
        },
    )
}

/**
 * Notification с текстом
 */
@Composable
fun NotificationText(
    style: NotificationStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = false,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Notification")
            }
        },
    )
}

/**
 * Notification без текста, только hasClose
 */
@Composable
fun NotificationNoTextHasClose(style: NotificationStyle) {
    Notification(
        style = style,
        hasClose = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 32.dp),
            ) {
                Text(text = "")
//                Spacer(Modifier.size(8.dp))
            }
        },
    )
}

/**
 * Notification с текстом, hasClose и ActionButton
 */
@Composable
fun NotificationHasCloseTextActionButton(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 32.dp),
            ) {
                Text(text = "Notification")
                Spacer(Modifier.size(8.dp))
                Button(
                    style = buttonStyle,
                    label = "Action",
                    onClick = {},
                )
            }
        },
    )
}

/**
 * Preview для меню песочницы
 */
@Composable
fun NotificationForSandbox(style: NotificationStyle) {
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
                    closeIcon = rememberVectorPainter(SddsIcons.Close24),
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
