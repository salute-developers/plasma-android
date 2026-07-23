package com.sdds.compose.uikit.internal.popover

import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.window.PopupProperties
import androidx.core.view.updateLayoutParams

private class AndroidPopoverAnchor(
    val rootView: View,
) : PopoverAnchor

@Composable
internal actual fun rememberPopoverAnchor(): PopoverAnchor {
    val rootView = LocalView.current.rootView
    return remember(rootView) { AndroidPopoverAnchor(rootView) }
}

@Composable
internal actual fun rememberPopoverRootSize(anchor: PopoverAnchor): IntSize {
    val rootView = (anchor as AndroidPopoverAnchor).rootView
    return remember(rootView) { IntSize(rootView.width, rootView.height) }
}

@Composable
internal actual fun rememberDeferredConstraintsUpdater(
    apply: (IntSize) -> Unit,
): DeferredConstraintsUpdater {
    val rootView = LocalView.current.rootView
    val currentApply = rememberUpdatedState(apply)
    return remember(rootView) {
        AndroidDeferredConstraintsUpdater(rootView) { currentApply.value.invoke(it) }
    }
}

@Composable
internal actual fun PlatformPopupContentEffects(
    anchor: PopoverAnchor,
    popupProperties: PopupProperties,
) {
    val rootView = (anchor as AndroidPopoverAnchor).rootView
    val popupRootView = LocalView.current.rootView
    if (!popupProperties.focusable) {
        LaunchedEffect(popupRootView, rootView) {
            popupRootView.enablePassthroughTouch(rootView)
        }
    }
    if (popupProperties.usePlatformDefaultWidth) {
        SideEffect {
            popupRootView.updateLayoutParams {
                width = ViewGroup.LayoutParams.MATCH_PARENT
            }
        }
    }
}

internal actual fun PopupProperties.ensureCorrectPopoverProperties(): PopupProperties = this

internal actual val DefaultPopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
    usePlatformDefaultWidth = true,
)

private class AndroidDeferredConstraintsUpdater(
    private val view: View,
    private val apply: (IntSize) -> Unit,
) : DeferredConstraintsUpdater {
    private var pending: IntSize? = null
    private var scheduled = false
    private var version = 0

    override fun request(value: IntSize) {
        pending = value
        if (scheduled) return

        scheduled = true
        val scheduledVersion = version
        view.post {
            if (scheduledVersion != version) return@post

            scheduled = false
            val constraints = pending ?: return@post
            pending = null
            apply(constraints)
        }
    }

    override fun reset() {
        version += 1
        scheduled = false
        pending = null
    }
}

@Suppress("ClickableViewAccessibility")
private fun View.enablePassthroughTouch(decorView: View) {
    setOnTouchListener { v, event ->
        val anchorRect = decorView.getScreenRect()
        val popupRect = v.getScreenRect()
        val offsetX = (popupRect.left - anchorRect.left).toFloat()
        val offsetY = (popupRect.top - anchorRect.top).toFloat()

        val transformedEvent = MotionEvent.obtain(event)
        transformedEvent.offsetLocation(offsetX, offsetY)
        val result = decorView.dispatchTouchEvent(transformedEvent)
        transformedEvent.recycle()

        result
    }
}

private fun View.getScreenRect(): android.graphics.Rect {
    val location = IntArray(2)
    getLocationOnScreen(location)
    return android.graphics.Rect(
        location[0],
        location[1],
        (location[0] + width * scaleX).toInt(),
        (location[1] + height * scaleY).toInt(),
    )
}
