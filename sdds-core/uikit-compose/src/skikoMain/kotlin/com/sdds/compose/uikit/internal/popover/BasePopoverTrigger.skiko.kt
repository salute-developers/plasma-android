package com.sdds.compose.uikit.internal.popover

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.isSpecified
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.layout.positionOnScreen
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
        fun updateTriggerBounds(layoutCoordinates: LayoutCoordinates) {
            val positionInWindow = layoutCoordinates.positionInWindow().round()
            val positionOnScreen = layoutCoordinates.positionOnScreen()
            val positionInScreen = positionOnScreen.takeIf { it.isSpecified }?.round()
                ?: positionInWindow
            val visibleBoundsInWindow = layoutCoordinates.boundsInWindow()
            val screenOffset = positionOnScreen.takeIf { it.isSpecified }
                ?.let {
                    Offset(
                        x = it.x - positionInWindow.x,
                        y = it.y - positionInWindow.y,
                    )
                }
                ?: Offset.Zero
            val updatedTriggerInfo = triggerInfo.value.copy(
                size = layoutCoordinates.size,
                positionInRoot = positionInWindow,
                positionInScreen = positionInScreen,
                cutoutShape = shape,
                cutoutPaddings = cutoutPaddings,
                visibleBoundsInScreen = visibleBoundsInWindow
                    .translate(screenOffset)
                    .roundToPixelBounds(),
            )
            if (updatedTriggerInfo != triggerInfo.value) {
                triggerInfo.value = updatedTriggerInfo
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
