package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EraserFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EraserFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.195 4.74 c -0.973 -0.32 -2.02 -0.32 -2.993 0.0 c -0.621 0.203 -1.147 0.562 -1.675 1.014 c -0.51 0.437 -1.09 1.022 -1.8 1.737 l -2.564 2.587 l 12.01 12.115 l 2.564 -2.587 c 0.71 -0.715 1.29 -1.3 1.722 -1.815 c 0.448 -0.533 0.804 -1.063 1.006 -1.69 c 0.316 -0.981 0.316 -2.038 0.0 -3.019 c -0.202 -0.627 -0.558 -1.157 -1.006 -1.69 c -0.433 -0.514 -1.013 -1.1 -1.722 -1.815 l -2.068 -2.086 c -0.709 -0.715 -1.29 -1.3 -1.8 -1.737 c -0.527 -0.452 -1.053 -0.811 -1.674 -1.015 Z m 1.57 18.874 l -12.01 -12.115 l -6.29 6.344 c -0.709 0.716 -1.29 1.301 -1.722 1.816 c -0.448 0.532 -0.804 1.063 -1.006 1.69 c -0.316 0.98 -0.316 2.037 0.0 3.018 c 0.202 0.627 0.558 1.158 1.006 1.69 c 0.433 0.515 1.013 1.1 1.722 1.816 l 1.305 1.316 c 1.467 1.48 3.457 2.311 5.531 2.311 h 18.082 c 0.617 0.0 1.117 -0.505 1.117 -1.127 c 0.0 -0.623 -0.5 -1.128 -1.117 -1.128 H 19.18 l 5.583 -5.631 Z")
        )
    }.build()
}
