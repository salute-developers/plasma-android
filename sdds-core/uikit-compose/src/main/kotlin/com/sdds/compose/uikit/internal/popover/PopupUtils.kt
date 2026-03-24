package com.sdds.compose.uikit.internal.popover

import android.view.View

@Suppress("ClickableViewAccessibility")
internal fun View.enablePassthroughTouch(decorView: View) {
    setOnTouchListener { v, event ->
        val anchorLocation = decorView.getScreenRect()
        val listLocation = v.getScreenRect()
        val offsetX = (listLocation.left - anchorLocation.left).toFloat()
        val offsetY = (listLocation.top - anchorLocation.top).toFloat()
        event.offsetLocation(offsetX, offsetY)
        decorView.dispatchTouchEvent(event)
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
