package com.sdds.testing.compose.toast

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayAnimationSpec
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.icons.R

/**
 * Тест кейсы для Toast
 */

/**
 * PLASMA-T2036
 */
@Composable
fun ToastRoundedDefaultTopStartHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.TopStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2037
 */
@Composable
fun ToastRoundedNegativeTopCenterHasContentStart(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.TopCenter,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStart(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2038
 */
@Composable
fun ToastRoundedPositiveTopEndHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.TopEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2039
 */
@Composable
fun ToastPilledDefaultCenterStart(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.CenterStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestWithoutContent(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2040
 */
@Composable
fun ToastPilledNegativeCenterHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.Center,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2041
 */
@Composable
fun ToastPilledPositiveCenterEndHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.CenterEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2042
 */
@Composable
fun ToastRoundedDefaultBottomStartHasContentEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.BottomStart,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2043
 */
@Composable
fun ToastRoundedDefaultBottomCenterHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.BottomCenter,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2044
 */
@Composable
fun ToastRoundedDefaultBottomEndHasContentStartEnd(
    style: ToastStyle,
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
                    overlayManager.showToast(
                        position = OverlayPosition.BottomEnd,
                        animationSpec = OverlayAnimationSpec(
                            EnterTransition.None,
                            ExitTransition.None,
                        ),
                        durationMillis = null,
                        content = { ToastForTestContentStartEnd(style = style) },
                    )
                },
            )
        }
    }
}

/**
 * Toast с Content Start и End
 */
@Composable
fun ToastForTestContentStartEnd(style: ToastStyle) {
    Toast(
        style = style,
        text = "Toast Text",
        contentStart = {
            Icon(painter = painterResource(R.drawable.ic_shazam_16), "")
        },
        contentEnd = {
            Icon(
                painter = painterResource(R.drawable.ic_close_16),
                contentDescription = "",
            )
        },
    )
}

/**
 * Toast с Content Start
 */
@Composable
fun ToastForTestContentStart(style: ToastStyle) {
    Toast(
        style = style,
        text = "Toast Text",
        contentStart = {
            Icon(painter = painterResource(R.drawable.ic_shazam_16), "")
        },
        contentEnd = null,
    )
}

/**
 * Toast с Content End
 */
@Composable
fun ToastForTestContentEnd(style: ToastStyle) {
    Toast(
        style = style,
        text = "Toast Text",
        contentStart = null,
        contentEnd = {
            Icon(
                painter = painterResource(R.drawable.ic_close_16),
                contentDescription = "",
            )
        },
    )
}

/**
 * Toast без Content
 */
@Composable
fun ToastForTestWithoutContent(style: ToastStyle) {
    Toast(
        style = style,
        text = "Toast Text",
        contentStart = null,
        contentEnd = null,
    )
}

/**
 * Preview для меню песочницы
 */
@Composable
fun ToastForSandbox(style: ToastStyle) {
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
