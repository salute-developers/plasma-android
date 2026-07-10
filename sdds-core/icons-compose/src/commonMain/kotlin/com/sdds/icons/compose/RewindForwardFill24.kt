package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindForwardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindForwardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.03 10.252 c 0.96 0.584 0.96 1.98 0.0 2.564 l -7.725 4.694 c -1.0 0.608 -2.279 -0.112 -2.279 -1.282 V 6.84 c 0.0 -1.17 1.28 -1.89 2.28 -1.282 l 7.723 4.694 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.639 14.839 V 8.154 L 5.305 5.52 c -1.0 -0.607 -2.279 0.112 -2.279 1.282 v 9.389 c 0.0 1.17 1.28 1.89 2.28 1.282 l 4.333 -2.634 Z")
        )
    }.build()
}
