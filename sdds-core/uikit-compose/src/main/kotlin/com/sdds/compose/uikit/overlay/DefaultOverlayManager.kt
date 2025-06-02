package com.sdds.compose.uikit.overlay

import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

internal open class DefaultOverlayManager(
    private val scope: CoroutineScope? = null,
) : OverlayManager {
    private val _overlays = MutableStateFlow<List<OverlayEntry>>(emptyList())

    override val overlays: StateFlow<List<OverlayEntry>> = _overlays.asStateFlow()

    override fun show(
        position: OverlayPosition,
        durationMillis: Long?,
        animationSpec: OverlayAnimationSpec?,
        content: @Composable (Long) -> Unit,
    ): Long {
        val entry = OverlayEntry(
            content = content,
            durationMillis = durationMillis,
            position = position,
            animationSpec = animationSpec,
        )
        _overlays.value += entry
        entry.visible.targetState = true

        if (durationMillis != null && scope != null) {
            scope.launch {
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
