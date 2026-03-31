package com.sdds.compose.uikit.internal.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties

@Composable
internal actual fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
    lightAppearance: Boolean
) {
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal actual fun DialogProperties.ensureCorrectProperties(edgeToEdge: Boolean): DialogProperties {
    return when {
        edgeToEdge == usePlatformDefaultWidth && edgeToEdge == usePlatformInsets
                && edgeToEdge == useSoftwareKeyboardInset -> this
        else -> DialogProperties(
            usePlatformDefaultWidth = edgeToEdge,
            usePlatformInsets = edgeToEdge,
            useSoftwareKeyboardInset = edgeToEdge,
            dismissOnBackPress = dismissOnBackPress,
            dismissOnClickOutside = dismissOnClickOutside,
        )
    }
}