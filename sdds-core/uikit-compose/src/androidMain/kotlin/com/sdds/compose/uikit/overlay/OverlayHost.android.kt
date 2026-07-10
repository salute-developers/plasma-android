package com.sdds.compose.uikit.overlay

import android.graphics.Rect
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.DialogWindowProvider
import com.sdds.compose.uikit.internal.modal.DialogWindowRegistry
import com.sdds.compose.uikit.internal.modal.LocalDialogWindowId

@Composable
internal actual fun ConfigureOverlayPopup(position: OverlayPosition, isFocusable: Boolean) {
    val dialogView = LocalView.current
    val rootView = dialogView.rootView
    val currentWindowId = LocalDialogWindowId.current

    LaunchedEffect(dialogView, currentWindowId, position, isFocusable, rootView) {
        val dialogWindowProvider = dialogView.parent as? DialogWindowProvider
        dialogWindowProvider?.window?.ensureCorrect(position, isFocusable)
        dialogView.rootView.enablePassthroughTouch {
            currentWindowId?.let(DialogWindowRegistry::findDecorViewBelow) ?: rootView
        }
    }
}

@Suppress("ClickableViewAccessibility")
private fun View.enablePassthroughTouch(decorViewProvider: () -> View?) {
    setOnTouchListener { v, event ->
        val decorView = decorViewProvider()
        if (decorView == null) return@setOnTouchListener false
        val anchorLocation = decorView.getScreenRect()
        val listLocation = v.getScreenRect()
        val offsetX = (listLocation.left - anchorLocation.left).toFloat()
        val offsetY = (listLocation.top - anchorLocation.top).toFloat()
        val transformedEvent = MotionEvent.obtain(event)
        transformedEvent.offsetLocation(offsetX, offsetY)
        val handled = decorView.dispatchTouchEvent(transformedEvent)
        transformedEvent.recycle()
        handled
    }
}

@Suppress("ClickableViewAccessibility")
private fun Window.ensureCorrect(position: OverlayPosition, isFocusable: Boolean) {
    setLayout(
        WindowManager.LayoutParams.MATCH_PARENT,
        WindowManager.LayoutParams.WRAP_CONTENT,
    )
    setGravity(position.toGravity())
    if (!isFocusable) {
        addFlags(
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                or WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
        )
    }
}

private fun View.getScreenRect(): Rect {
    val location = IntArray(2)
    getLocationOnScreen(location)
    return Rect(
        location[0],
        location[1],
        (location[0] + width * scaleX).toInt(),
        (location[1] + height * scaleY).toInt(),
    )
}

private fun OverlayPosition.toGravity(): Int = when (this) {
    OverlayPosition.TopStart -> Gravity.TOP or Gravity.START
    OverlayPosition.TopCenter -> Gravity.TOP or Gravity.CENTER_HORIZONTAL
    OverlayPosition.TopEnd -> Gravity.TOP or Gravity.END
    OverlayPosition.CenterStart -> Gravity.CENTER_VERTICAL or Gravity.START
    OverlayPosition.Center -> Gravity.CENTER
    OverlayPosition.CenterEnd -> Gravity.CENTER_VERTICAL or Gravity.END
    OverlayPosition.BottomStart -> Gravity.BOTTOM or Gravity.START
    OverlayPosition.BottomCenter -> Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
    OverlayPosition.BottomEnd -> Gravity.BOTTOM or Gravity.END
}
