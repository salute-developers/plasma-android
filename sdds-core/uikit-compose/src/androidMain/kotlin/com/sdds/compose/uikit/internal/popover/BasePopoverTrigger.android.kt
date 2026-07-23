package com.sdds.compose.uikit.internal.popover

import android.view.ViewTreeObserver
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.round
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.bottomAlignmentLine
import com.sdds.compose.uikit.endAlignmentLine
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.startAlignmentLine
import com.sdds.compose.uikit.topAlignmentLine

internal actual fun Modifier.basePopoverTrigger(
    triggerInfo: MutableState<TriggerInfo>,
    shape: Shape,
    cutoutPaddings: PaddingValues,
): Modifier {
    return composed {
        val currentScaleFactor = LocalFocusSelectorSettings.current.scale.scaleFactor
        val hostView = LocalView.current
        var coordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }
        fun updateTriggerBounds(layoutCoordinates: LayoutCoordinates) {
            val positionInWindow = layoutCoordinates.positionInWindow().round()
            val visibleBoundsInWindow = layoutCoordinates.boundsInWindow()
            val hostLocation = IntArray(2)
            hostView.rootView.getLocationOnScreen(hostLocation)
            val updatedTriggerInfo = triggerInfo.value.copy(
                size = layoutCoordinates.size,
                positionInRoot = positionInWindow,
                positionInScreen = IntOffset(
                    x = hostLocation[0] + positionInWindow.x,
                    y = hostLocation[1] + positionInWindow.y,
                ),
                cutoutShape = shape,
                cutoutPaddings = cutoutPaddings,
                visibleBoundsInScreen = visibleBoundsInWindow.toScreenRect(hostLocation),
            )
            if (updatedTriggerInfo != triggerInfo.value) {
                triggerInfo.value = updatedTriggerInfo
            }
        }

        DisposableEffect(hostView.rootView, coordinates) {
            val listener = ViewTreeObserver.OnPreDrawListener {
                coordinates?.takeIf { it.isAttached }?.let(::updateTriggerBounds)
                true
            }
            hostView.rootView.viewTreeObserver.addOnPreDrawListener(listener)
            onDispose {
                val observer = hostView.rootView.viewTreeObserver
                if (observer.isAlive) {
                    observer.removeOnPreDrawListener(listener)
                }
            }
        }
        layout { measurable, constraints ->
            val placeable = measurable.measure(constraints)
            triggerInfo.value = triggerInfo.value.copy(
                topAlignmentLine = placeable[topAlignmentLine],
                bottomAlignmentLine = placeable[bottomAlignmentLine],
                startAlignmentLine = placeable[startAlignmentLine],
                endAlignmentLine = placeable[endAlignmentLine],
            )
            return@layout layout(placeable.width, placeable.height) {
                placeable.placeRelative(IntOffset.Zero)
            }
        }.onGloballyPositioned {
            coordinates = it
            updateTriggerBounds(it)
        }.onFocusChanged {
            val scaleFactor = if (it.isFocused) {
                currentScaleFactor
            } else {
                0f
            }
            triggerInfo.value = triggerInfo.value.copy(focusScaleFactor = scaleFactor)
        }
    }
}
