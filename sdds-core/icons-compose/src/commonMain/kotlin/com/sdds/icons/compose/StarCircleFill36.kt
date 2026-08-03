package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 0.713 -26.305 c -0.224 -0.69 -1.202 -0.69 -1.426 0.0 l -2.15 6.615 c -0.1 0.31 -0.388 0.518 -0.713 0.518 H 7.47 c -0.727 0.0 -1.029 0.93 -0.44 1.357 l 5.626 4.088 c 0.263 0.191 0.373 0.53 0.273 0.839 l -2.15 6.614 c -0.224 0.691 0.566 1.266 1.154 0.839 l 5.627 -4.088 c 0.263 -0.191 0.619 -0.191 0.882 0.0 l 5.627 4.088 c 0.587 0.427 1.378 -0.148 1.154 -0.839 l -2.15 -6.614 c -0.1 -0.31 0.01 -0.648 0.273 -0.839 l 5.627 -4.088 c 0.588 -0.427 0.285 -1.357 -0.441 -1.357 h -6.955 c -0.325 0.0 -0.613 -0.209 -0.713 -0.518 l -2.15 -6.615 Z")
        )
    }.build()
}
