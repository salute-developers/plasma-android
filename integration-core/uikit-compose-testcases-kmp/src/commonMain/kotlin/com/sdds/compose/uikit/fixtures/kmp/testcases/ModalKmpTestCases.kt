package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalAnimations
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.SddsIcons

/**
 * PLASMA-T2497
 */
@Composable
fun ModalTopStartKmp(style: ModalStyle) {
    ModalCommonKmp(
        style = style,
        hasClose = true,
        gravity = ModalGravity.TopStart,
        dimBackground = true,
        edgeToEdge = true,
    )
}

/**
 * PLASMA-T2499
 */
@Composable
fun ModalTopEndKmp(style: ModalStyle) {
    ModalCommonKmp(
        style = style,
        gravity = ModalGravity.TopEnd,
        edgeToEdge = true,
    )
}

/**
 * PLASMA-T2502
 */
@Composable
fun ModalCenterEndKmp(style: ModalStyle) {
    ModalCommonKmp(
        style = style,
        gravity = ModalGravity.CenterEnd,
    )
}

/**
 * PLASMA-T2503
 */
@Composable
fun ModalBottomStartKmp(style: ModalStyle) {
    ModalCommonKmp(
        style = style,
        gravity = ModalGravity.BottomStart,
        dimBackground = true,
        edgeToEdge = true,
    )
}

@Composable
private fun ModalCommonKmp(
    style: ModalStyle,
    dimBackground: Boolean = false,
    hasClose: Boolean = false,
    gravity: ModalGravity,
    edgeToEdge: Boolean = false,
) {
    Box {
        Modal(
            show = true,
            style = style,
            modifier = Modifier.width(300.dp),
            gravity = gravity,
            dimBackground = dimBackground,
            useNativeBlackout = false,
            onDismissRequest = {},
            hasClose = hasClose,
            edgeToEdge = edgeToEdge,
            closeIcon = rememberVectorPainter(SddsIcons.Close24),
            animations = ModalAnimations(
                contentEnterTransition = EnterTransition.None,
                contentExitTransition = ExitTransition.None,
                overlayEnterSpec = tween(0),
                overlayExitSpec = tween(0),
            ),
        ) {
            Text("Modal", modifier = Modifier.wrapContentSize())
        }
    }
}
