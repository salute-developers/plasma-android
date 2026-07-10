package com.sdds.compose.uikit.overlay

import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

internal open class DefaultOverlayManager(
    private val scope: CoroutineScope? = null,
) : OverlayManager {
    private val _overlays = MutableStateFlow<List<OverlayEntry>>(emptyList())
    private val _dismissListeners = mutableSetOf<OverlayManager.OnDismissListener>()

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
        return show(entry)
    }

    override fun show(entry: OverlayEntry): Long {
        _overlays.value += entry
        entry.visible.targetState = true
        val durationMillis = entry.durationMillis

        if (durationMillis != null && scope != null) {
            scope.launch {
                delay(durationMillis)
                entry.visible.targetState = false
            }
        }

        return entry.id
    }

    override fun remove(id: Long) {
        val entry = _overlays.value.find { it.id == id } ?: return
        if (entry.visible.currentState) {
            entry.visible.targetState = false
        } else {
            removeInternal(id)
        }
    }

    private fun removeInternal(entryId: Long) {
        var dismissed: OverlayEntry? = null
        _overlays.update { overlays ->
            val entryIndex = overlays.indexOfFirst { it.id == entryId }
            if (entryIndex == -1) return@update overlays
            dismissed = overlays[entryIndex]
            overlays.filterNot { it.id == entryId }
        }
        dismissed?.let { removed ->
            _dismissListeners
                .toList()
                .forEach { it.onDismiss(removed) }
        }
    }

    override fun clear() {
        _overlays.value = emptyList()
    }

    override fun addOnDismissListener(listener: OverlayManager.OnDismissListener) {
        if (_dismissListeners.contains(listener)) return
        _dismissListeners.add(listener)
    }

    override fun removeOnDismissListener(listener: OverlayManager.OnDismissListener) {
        _dismissListeners.remove(listener)
    }
}
