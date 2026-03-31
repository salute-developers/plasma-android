package com.sdds.compose.uikit.internal.modal

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun EdgeToEdgeDialog(
    onDismissRequest: () -> Unit,
    edgeToEdge: Boolean = true,
    dialogProperties: DialogProperties = DialogProperties(
        usePlatformDefaultWidth = edgeToEdge,
        usePlatformInsets = edgeToEdge,
        useSoftwareKeyboardInset = edgeToEdge,
    ),
    useNativeBlackout: Boolean = true,
    blurRadius: Dp = Dp.Unspecified,
    lightAppearance: Boolean = !isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = dialogProperties.ensureCorrectProperties(edgeToEdge),
    ) {
        ConfigureWindow(edgeToEdge, useNativeBlackout, blurRadius, lightAppearance)
        content()
    }
}

@Composable
internal expect fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
    lightAppearance: Boolean,
)

@Composable
internal expect fun DialogProperties.ensureCorrectProperties(edgeToEdge: Boolean): DialogProperties
