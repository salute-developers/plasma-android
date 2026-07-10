package com.sdds.compose.uikit.internal.modal

import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.px
import java.lang.ref.WeakReference
import java.util.UUID

@Composable
internal actual fun RegisterDialogWindow(windowId: String) {
    val localView = LocalView.current
    val dialogWindowProvider = localView.parent as? DialogWindowProvider
    val decorView = dialogWindowProvider?.window?.decorView

    DisposableEffect(windowId, decorView) {
        if (decorView != null) {
            DialogWindowRegistry.register(windowId, decorView)
        }
        onDispose {
            DialogWindowRegistry.unregister(windowId)
        }
    }
}

@Composable
internal actual fun ConfigureWindow(
    edgeToEdge: Boolean,
    useNativeBlackout: Boolean,
    blurRadius: Dp,
    lightAppearance: Boolean,
) {
    val localView = LocalView.current
    val dialogWindowProvider = localView.parent as? DialogWindowProvider
    val blurRadiusPx = if (blurRadius.isSpecified) blurRadius.px else 0
    SideEffect {
        dialogWindowProvider?.window ?: return@SideEffect
        dialogWindowProvider.apply {
            window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            if (edgeToEdge) {
                WindowCompat.setDecorFitsSystemWindows(window, false)
                window.statusBarColor = Color.TRANSPARENT
                window.navigationBarColor = Color.TRANSPARENT

                WindowCompat.getInsetsController(window, localView).apply {
                    isAppearanceLightNavigationBars = lightAppearance
                    isAppearanceLightStatusBars = lightAppearance
                }

                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.R) {
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.attributes.fitInsetsTypes = 0
                    window.attributes.fitInsetsSides = 0
                } else {
                    // Перехватываем инсеты на decoreview и просто отправляем их дальше.
                    ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, insets ->
                        insets
                    }
                }
            } else {
                window.setSoftInputMode(
                    @Suppress("DEPRECATION") WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE,
                )
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

internal actual fun defaultEdgeToEdgeDialogProperties(edgeToEdge: Boolean): DialogProperties {
    return DialogProperties(
        usePlatformDefaultWidth = edgeToEdge,
        decorFitsSystemWindows = !edgeToEdge,
    )
}

internal actual fun DialogProperties.ensureCorrectEdgeToEdgeProperties(edgeToEdge: Boolean): DialogProperties {
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

internal actual fun nextDialogWindowId(): String = UUID.randomUUID().toString()

internal object DialogWindowRegistry {

    private data class WindowEntry(
        val windowId: String,
        val decorViewRef: WeakReference<View>,
    )

    private val windows = mutableListOf<WindowEntry>()

    fun register(windowId: String, decorView: View) = synchronized(windows) {
        cleanupLocked()
        windows.removeAll { it.windowId == windowId }
        windows += WindowEntry(windowId, WeakReference(decorView))
    }

    fun unregister(windowId: String) = synchronized(windows) {
        windows.removeAll { it.windowId == windowId }
    }

    fun findDecorViewBelow(windowId: String): View? = synchronized(windows) {
        cleanupLocked()
        val currentIndex = windows.indexOfLast { it.windowId == windowId }
        if (currentIndex <= 0) return null
        windows.subList(0, currentIndex)
            .asReversed()
            .firstNotNullOfOrNull { it.decorViewRef.get() }
    }

    private fun cleanupLocked() {
        windows.removeAll { entry ->
            val decorView = entry.decorViewRef.get()
            decorView == null || !decorView.isAttachedToWindow || decorView.windowToken == null
        }
    }
}
