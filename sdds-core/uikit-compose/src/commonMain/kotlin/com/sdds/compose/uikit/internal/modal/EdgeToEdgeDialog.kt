package com.sdds.compose.uikit.internal.modal

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

internal val LocalDialogWindowId = staticCompositionLocalOf<String?> { null }

@Composable
internal fun EdgeToEdgeDialog(
    onDismissRequest: () -> Unit,
    edgeToEdge: Boolean = true,
    dialogProperties: DialogProperties = defaultEdgeToEdgeDialogProperties(edgeToEdge),
    useNativeBlackout: Boolean = true,
    blurRadius: Dp = Dp.Unspecified,
    lightAppearance: Boolean = !isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val windowId = remember { nextDialogWindowId() }
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = dialogProperties.ensureCorrectEdgeToEdgeProperties(edgeToEdge),
    ) {
        RegisterDialogWindow(windowId)
        ConfigureWindow(edgeToEdge, useNativeBlackout, blurRadius, lightAppearance)
        CompositionLocalProvider(LocalDialogWindowId provides windowId) {
            content()
        }
    }
}

@Composable
internal expect fun RegisterDialogWindow(windowId: String)

@Composable
internal expect fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
    lightAppearance: Boolean,
)

internal expect fun defaultEdgeToEdgeDialogProperties(edgeToEdge: Boolean): DialogProperties

internal expect fun DialogProperties.ensureCorrectEdgeToEdgeProperties(edgeToEdge: Boolean): DialogProperties

internal expect fun nextDialogWindowId(): String
