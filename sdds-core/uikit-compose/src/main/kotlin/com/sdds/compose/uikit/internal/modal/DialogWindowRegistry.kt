package com.sdds.compose.uikit.internal.modal

import android.view.View
import androidx.compose.runtime.staticCompositionLocalOf
import java.lang.ref.WeakReference

internal val LocalDialogWindowId = staticCompositionLocalOf<String?> { null }

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
