package com.sdds.compose.uikit.overlay

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

internal class ViewModelBasedOverlayManager : ViewModel(), OverlayManager {
    private val _overlays = MutableStateFlow<List<OverlayEntry>>(emptyList())

    override val overlays: StateFlow<List<OverlayEntry>> = _overlays.asStateFlow()

    override fun show(
        position: OverlayPosition,
        durationMillis: Long?,
        animationSpec: OverlayAnimationSpec?,
        isFocusable: Boolean,
        content: @Composable (Long) -> Unit,
    ): Long {
        val entry = OverlayEntry(
            content = content,
            durationMillis = durationMillis,
            position = position,
            animationSpec = animationSpec,
            isFocusable = isFocusable,
        )
        _overlays.value += entry
        entry.visible.targetState = true

        if (durationMillis != null) {
            viewModelScope.launch {
                delay(durationMillis)
                entry.visible.targetState = false
            }
        }

        return entry.id
    }

    override fun remove(id: Long) {
        _overlays.value = _overlays.value.filterNot { it.id == id }
    }

    override fun clear() {
        _overlays.value = emptyList()
    }
}
