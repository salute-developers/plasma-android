package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.831 6.408 c -1.242 -2.21 -4.424 -2.21 -5.666 0.0 L 3.92 26.412 c -1.218 2.167 0.348 4.843 2.833 4.843 h 22.488 c 2.485 0.0 4.051 -2.676 2.833 -4.843 L 20.831 6.408 Z m -3.923 0.98 c 0.478 -0.85 1.702 -0.85 2.18 0.0 l 11.244 20.004 c 0.468 0.833 -0.134 1.863 -1.09 1.863 H 6.754 c -0.956 0.0 -1.558 -1.03 -1.09 -1.863 L 16.908 7.388 Z m 1.09 5.31 c 0.635 0.0 1.15 0.515 1.15 1.15 v 5.966 c 0.0 0.635 -0.515 1.15 -1.15 1.15 c -0.635 0.0 -1.15 -0.515 -1.15 -1.15 v -5.966 c 0.0 -0.635 0.515 -1.15 1.15 -1.15 Z m 1.508 13.082 c 0.0 0.824 -0.675 1.491 -1.509 1.491 c -0.833 0.0 -1.509 -0.667 -1.509 -1.49 c 0.0 -0.825 0.676 -1.492 1.51 -1.492 c 0.832 0.0 1.508 0.667 1.508 1.491 Z")
        )
    }.build()
}
