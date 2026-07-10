package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindBackwardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindBackwardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.11 12.782 c -0.962 -0.584 -0.962 -1.98 0.0 -2.563 l 7.724 -4.695 c 1.0 -0.607 2.279 0.112 2.279 1.282 v 9.389 c 0.0 1.17 -1.28 1.89 -2.28 1.282 L 3.11 12.782 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 8.158 v 6.685 l 4.334 2.634 c 1.0 0.607 2.279 -0.112 2.279 -1.282 V 6.806 c 0.0 -1.17 -1.28 -1.889 -2.28 -1.281 L 14.5 8.158 Z")
        )
    }.build()
}
