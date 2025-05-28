package com.sdds.uikit.internal.overlays

import androidx.lifecycle.ViewModel
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.OverlayPosition

internal class ToastManager : ViewModel() {
    private var overlayManagers: MutableMap<OverlayPosition, OverlayManager> = mutableMapOf()

    fun getOverlayManager(
        position: OverlayPosition,
        factory: (OverlayPosition) -> OverlayManager,
    ): OverlayManager {
        val overlayManager = overlayManagers.getOrPut(position) { factory(position) }
        return overlayManager
    }

    override fun onCleared() {
        super.onCleared()
        overlayManagers.values
            .forEach { it.clear() }
        overlayManagers.clear()
    }
}
