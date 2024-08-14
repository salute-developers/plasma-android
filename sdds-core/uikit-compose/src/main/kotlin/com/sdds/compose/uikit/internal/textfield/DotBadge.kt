package com.sdds.compose.uikit.internal.textfield

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

/**
 * Компонент, представляющий собой цветную точку
 */
@Composable
internal fun DotBadge(size: Dp, modifier: Modifier = Modifier, color: Color = Color.Red) {
    Canvas(modifier = modifier.requiredSize(size)) {
        drawCircle(color, (size / 2).toPx())
    }
}
