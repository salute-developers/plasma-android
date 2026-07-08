package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BendFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BendFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 3.25 c 0.9 0.0 1.654 0.618 1.864 1.453 L 9.9 4.7 h 4.6 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -3.294 c 1.033 0.758 1.785 1.873 2.08 3.162 C 14.248 8.967 15.0 9.783 15.0 10.775 c 0.0 1.063 -0.862 1.925 -1.925 1.925 c -1.063 0.0 -1.924 -0.862 -1.925 -1.925 c 0.0 -0.785 0.47 -1.46 1.144 -1.76 C 11.96 7.658 11.0 6.545 9.735 6.005 l 0.002 -0.006 C 9.428 6.648 8.768 7.1 8.0 7.1 c -0.774 0.0 -1.44 -0.458 -1.745 -1.117 c 0.003 0.007 0.005 0.014 0.009 0.02 c -1.265 0.541 -2.225 1.654 -2.559 3.013 C 4.38 9.315 4.85 9.99 4.85 10.776 c 0.0 1.062 -0.862 1.924 -1.925 1.924 C 1.862 12.7 1.0 11.838 1.0 10.775 c 0.0 -0.991 0.75 -1.808 1.714 -1.913 c 0.295 -1.29 1.047 -2.404 2.08 -3.162 H 1.5 C 1.224 5.7 1.0 5.476 1.0 5.2 s 0.224 -0.5 0.5 -0.5 h 4.6 l 0.035 0.003 C 6.345 3.868 7.1 3.25 8.0 3.25 Z")
        )
    }.build()
}
