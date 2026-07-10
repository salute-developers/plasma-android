package com.sdds.compose.uikit.overlay

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.StateFlow

internal class ViewModelBasedOverlayManager : ViewModel(), OverlayManager {
    private val delegate: OverlayManager = DefaultOverlayManager(viewModelScope)

    override val overlays: StateFlow<List<OverlayEntry>> = delegate.overlays

    override fun show(
        position: OverlayPosition,
        durationMillis: Long?,
        animationSpec: OverlayAnimationSpec?,
        isFocusable: Boolean,
        content: @Composable (Long) -> Unit,
    ): Long = delegate.show(position, durationMillis, animationSpec, isFocusable, content)

    override fun show(entry: OverlayEntry): Long {
        return delegate.show(entry)
    }

    override fun remove(id: Long) {
        delegate.remove(id)
    }

    override fun clear() {
        delegate.clear()
    }

    override fun addOnDismissListener(listener: OverlayManager.OnDismissListener) {
        delegate.addOnDismissListener(listener)
    }

    override fun removeOnDismissListener(listener: OverlayManager.OnDismissListener) {
        delegate.removeOnDismissListener(listener)
    }
}
