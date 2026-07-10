package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.294 4.15 c 0.27 -0.467 0.943 -0.467 1.212 0.0 l 4.244 7.35 c 0.27 0.467 -0.068 1.05 -0.607 1.05 H 3.656 c -0.538 0.0 -0.875 -0.583 -0.606 -1.05 l 4.244 -7.35 Z M 4.263 11.5 L 7.9 5.2 l 3.637 6.3 H 4.263 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.384 3.625 c 0.674 -1.167 2.358 -1.167 3.031 0.0 l 4.244 7.35 c 0.674 1.167 -0.168 2.625 -1.516 2.625 H 3.656 c -1.347 0.0 -2.189 -1.458 -1.515 -2.625 l 4.243 -7.35 Z m 2.425 0.35 l 4.244 7.35 c 0.404 0.7 -0.101 1.575 -0.91 1.575 H 3.656 c -0.808 0.0 -1.313 -0.875 -0.909 -1.575 l 4.244 -7.35 c 0.404 -0.7 1.414 -0.7 1.818 0.0 Z")
        )
    }.build()
}
