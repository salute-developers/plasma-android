package com.sdds.compose.uikit.internal.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.Color
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

@OptIn(ExperimentalComposeUiApi::class)
internal actual fun defaultEdgeToEdgeDialogProperties(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
): DialogProperties {
    return if (useNativeBlackout) {
        DialogProperties(
            usePlatformDefaultWidth = false,
        )
    } else {
        DialogProperties(
            usePlatformDefaultWidth = false,
            scrimColor = Color.Transparent,
        )
    }
}

@OptIn(ExperimentalComposeUiApi::class)
internal actual fun DialogProperties.ensureCorrectProperties(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
): DialogProperties {
    return if (useNativeBlackout) {
        DialogProperties(
            usePlatformDefaultWidth = false,
        )
    } else {
        DialogProperties(
            usePlatformDefaultWidth = false,
            scrimColor = Color.Transparent,
        )
    }
}

internal actual fun nextDialogWindowId(): String = "dialog-${Random.nextLong()}"
