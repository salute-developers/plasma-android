package com.sdds.compose.uikit.internal.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import kotlin.random.Random

@Composable
internal actual fun RegisterDialogWindow(windowId: String) = Unit

@Composable
internal actual fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
    lightAppearance: Boolean,
) = Unit

internal actual fun defaultEdgeToEdgeDialogProperties(edgeToEdge: Boolean): DialogProperties {
    return DialogProperties(usePlatformDefaultWidth = edgeToEdge)
}

internal actual fun DialogProperties.ensureCorrectEdgeToEdgeProperties(edgeToEdge: Boolean): DialogProperties {
    return if (usePlatformDefaultWidth == edgeToEdge) {
        this
    } else {
        DialogProperties(
            dismissOnBackPress = dismissOnBackPress,
            dismissOnClickOutside = dismissOnClickOutside,
            usePlatformDefaultWidth = edgeToEdge,
        )
    }
}

internal actual fun nextDialogWindowId(): String = "dialog-${Random.nextLong()}"
