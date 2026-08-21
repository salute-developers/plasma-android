package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayAnimationSpec
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.icons.compose.Close16
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Shazam16

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
 * PLASMA-T2041
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun ToastPilledPositiveCenterEndHasContentStartEndOpened(
    style: ToastStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        ToastForTestContentStartEnd(
            style = style,
            modifier = Modifier.align(Alignment.CenterEnd),
        )
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
 * PLASMA-T2042
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun ToastRoundedDefaultBottomStartHasContentEndOpened(
    style: ToastStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        ToastForTestContentEnd(
            style = style,
            modifier = Modifier.align(Alignment.BottomStart),
        )
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
 * PLASMA-T2589
 */
@Composable
fun ToastMultiLine(
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
                        content = {
                            Toast(
                                style = style,
                                contentStart = {
                                    Icon(painter = rememberVectorPainter(SddsIcons.Shazam16), "")
                                },
                                contentEnd = {
                                    Icon(
                                        painter = rememberVectorPainter(SddsIcons.Close16),
                                        contentDescription = "",
                                    )
                                },
                            ) {
                                Text("First line\nSecond Line")
                            }
                        },
                    )
                },
            )
        }
    }
}

/**
 * PLASMA-T2696
 */
@Composable
fun ToastFillMaxWidth(
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
                        content = {
                            ToastForTestContentStartEnd(
                                style = style,
                                modifier = Modifier.fillMaxWidth(),
                            )
                        },
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
fun ToastForTestContentStartEnd(
    style: ToastStyle,
    modifier: Modifier = Modifier,
) {
    Toast(
        style = style,
        modifier = modifier,
        text = "Toast Text",
        contentStart = {
            Icon(painter = rememberVectorPainter(SddsIcons.Shazam16), "")
        },
        contentEnd = {
            Icon(
                painter = rememberVectorPainter(SddsIcons.Close16),
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
            Icon(painter = rememberVectorPainter(SddsIcons.Shazam16), "")
        },
        contentEnd = null,
    )
}

/**
 * Toast с Content End
 */
@Composable
fun ToastForTestContentEnd(
    style: ToastStyle,
    modifier: Modifier = Modifier,
) {
    Toast(
        style = style,
        modifier = modifier,
        text = "Toast Text",
        contentStart = null,
        contentEnd = {
            Icon(
                painter = rememberVectorPainter(SddsIcons.Close16),
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
                    contentStart = { Icon(painter = rememberVectorPainter(SddsIcons.Shazam16), "") },
                    contentEnd = {
                        Icon(
                            modifier = Modifier.clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                overlayManager.remove(it)
                            },
                            painter = rememberVectorPainter(SddsIcons.Close16),
                            contentDescription = "",
                        )
                    },
                )
            }
        },
    )
}
