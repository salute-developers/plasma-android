package com.sdds.compose.uikit.internal.modal

import android.os.Build
import android.view.ViewGroup
import android.view.WindowManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.core.view.WindowCompat

@Composable
internal fun EdgeToEdgeDialog(
    onDismissRequest: () -> Unit,
    edgeToEdge: Boolean = true,
    content: @Composable () -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            usePlatformDefaultWidth = edgeToEdge,
            decorFitsSystemWindows = !edgeToEdge
        )
    ) {
        if (edgeToEdge) {
            val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
            SideEffect {
                val dialogWindow = dialogWindowProvider?.window ?: return@SideEffect
                WindowCompat.setDecorFitsSystemWindows(dialogWindow, false)
                dialogWindow.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                dialogWindow.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

                dialogWindow.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    dialogWindow.attributes.fitInsetsTypes = 0
                    dialogWindow.attributes.fitInsetsSides = 0
                }
            }
        }
        content()
    }
}