package com.sdds.compose.uikit.internal.drawer

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import com.sdds.compose.uikit.Overlay

@Composable
internal fun DrawerOverlay(
    onClose: () -> Unit,
    fraction: () -> Float,
    open: () -> Boolean,
) {
    val dismissDrawer = if (open()) {
        Modifier
            .pointerInput(onClose) { detectTapGestures { onClose() } }
            .semantics(mergeDescendants = true) {
                contentDescription = CLOSE_DRAWER_DESCRIPTION
                onClick {
                    onClose()
                    true
                }
            }
    } else {
        Modifier
    }
    Overlay(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer {
                alpha = fraction()
            }
            .then(dismissDrawer),
    )
}

private const val CLOSE_DRAWER_DESCRIPTION = "Close Drawer"
