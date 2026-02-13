package com.sdds.compose.uikit.internal.modal

import android.os.Build
import android.view.ViewGroup
import android.view.WindowManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.px

@Composable
internal fun EdgeToEdgeDialog(
    onDismissRequest: () -> Unit,
    edgeToEdge: Boolean = true,
    dialogProperties: DialogProperties = DialogProperties(
        usePlatformDefaultWidth = edgeToEdge,
        decorFitsSystemWindows = !edgeToEdge,
    ),
    useNativeBlackout: Boolean = true,
    blurRadius: Dp = Dp.Unspecified,
    content: @Composable () -> Unit,
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = dialogProperties.ensureCorrectProperties(edgeToEdge),
    ) {
        ConfigureWindow(edgeToEdge, useNativeBlackout, blurRadius)
        content()
    }
}

@Composable
private fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
) {
    val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
    val blurRadiusPx = if (blurRadius.isSpecified) blurRadius.px else 0
    SideEffect {
        dialogWindowProvider?.window ?: return@SideEffect
        dialogWindowProvider.apply {
            if (edgeToEdge) {
                WindowCompat.setDecorFitsSystemWindows(window, false)
                window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

                window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    window.attributes.fitInsetsTypes = 0
                    window.attributes.fitInsetsSides = 0
                }
            }
            window.setWindowAnimations(-1)
            if (!useNativeBlackout) {
                window.setDimAmount(0f)
                window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (blurRadiusPx > 0) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)
                } else {
                    window.clearFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)
                }
                window.attributes.blurBehindRadius = blurRadiusPx
            }
        }
    }
}

private fun DialogProperties.ensureCorrectProperties(edgeToEdge: Boolean): DialogProperties {
    return when {
        edgeToEdge == usePlatformDefaultWidth && edgeToEdge != decorFitsSystemWindows -> this
        else -> DialogProperties(
            usePlatformDefaultWidth = edgeToEdge,
            decorFitsSystemWindows = !edgeToEdge,
            dismissOnBackPress = dismissOnBackPress,
            dismissOnClickOutside = dismissOnClickOutside,
            securePolicy = securePolicy,
        )
    }
}
