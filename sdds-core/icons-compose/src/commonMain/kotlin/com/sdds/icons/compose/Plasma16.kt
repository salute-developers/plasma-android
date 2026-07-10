package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Plasma16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Plasma16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 C 4.686 2.0 2.0 4.686 2.0 8.0 c 0.0 1.535 0.577 2.936 1.525 3.997 c -0.23 -0.564 -0.358 -1.182 -0.358 -1.83 c 0.0 -2.67 2.164 -4.834 4.833 -4.834 c 2.67 0.0 4.833 2.164 4.833 4.834 c 0.0 0.648 -0.127 1.266 -0.358 1.83 C 13.423 10.937 14.0 9.535 14.0 8.0 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 Z m 2.583 11.0 c 0.768 -0.702 1.25 -1.711 1.25 -2.833 c 0.0 -2.117 -1.716 -3.834 -3.833 -3.834 S 4.167 8.05 4.167 10.167 c 0.0 1.122 0.482 2.131 1.25 2.832 c -0.055 -0.213 -0.084 -0.436 -0.084 -0.666 c 0.0 -1.472 1.194 -2.666 2.667 -2.666 c 1.473 0.0 2.667 1.194 2.667 2.666 c 0.0 0.23 -0.03 0.453 -0.084 0.666 Z M 8.0 14.0 c 0.92 0.0 1.667 -0.746 1.667 -1.667 c 0.0 -0.92 -0.747 -1.666 -1.667 -1.666 s -1.667 0.746 -1.667 1.666 C 6.333 13.253 7.08 14.0 8.0 14.0 Z m 0.0 1.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z")
        )
    }.build()
}
