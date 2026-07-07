package com.sdds.compose.uikit.internal.popover

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TriggerInfo
import kotlin.math.roundToInt

internal expect fun Modifier.basePopoverTrigger(
    triggerInfo: MutableState<TriggerInfo>,
    shape: Shape = RectangleShape,
    cutoutPaddings: PaddingValues = PaddingValues(0.dp),
): Modifier

internal fun Rect.toScreenRect(hostLocation: IntArray): Rect {
    return Rect(
        left = left + hostLocation[0],
        top = top + hostLocation[1],
        right = right + hostLocation[0],
        bottom = bottom + hostLocation[1],
    ).roundToPixelBounds()
}

internal fun Rect.roundToPixelBounds(): Rect {
    return Rect(
        left = left.roundToInt().toFloat(),
        top = top.roundToInt().toFloat(),
        right = right.roundToInt().toFloat(),
        bottom = bottom.roundToInt().toFloat(),
    )
}
