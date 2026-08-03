package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.637 5.651 c 0.221 -0.672 1.17 -0.672 1.392 0.0 L 7.564 7.28 c 0.15 0.452 0.505 0.807 0.957 0.956 l 1.627 0.535 c 0.673 0.221 0.673 1.173 0.0 1.394 l -1.627 0.535 c -0.452 0.149 -0.808 0.504 -0.957 0.956 L 7.03 13.282 c -0.22 0.672 -1.171 0.672 -1.392 0.0 l -0.535 -1.627 c -0.15 -0.452 -0.505 -0.807 -0.957 -0.956 l -1.627 -0.535 c -0.672 -0.222 -0.672 -1.173 0.0 -1.394 l 1.627 -0.535 C 4.597 8.086 4.953 7.731 5.102 7.28 l 0.535 -1.628 Z m 0.414 1.94 C 5.803 8.345 5.21 8.937 4.457 9.185 L 3.6 9.468 l 0.857 0.28 c 0.754 0.249 1.346 0.84 1.594 1.595 L 6.333 12.2 l 0.282 -0.857 c 0.248 -0.754 0.84 -1.346 1.594 -1.594 l 0.857 -0.281 L 8.21 9.185 c -0.754 -0.248 -1.346 -0.84 -1.594 -1.594 L 6.333 6.734 L 6.051 7.591 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.54 2.88 c 0.038 -0.125 0.215 -0.125 0.254 0.0 l 0.294 0.952 c 0.13 0.421 0.46 0.752 0.88 0.882 l 0.952 0.293 c 0.125 0.038 0.125 0.216 0.0 0.254 l -0.951 0.293 c -0.422 0.13 -0.751 0.46 -0.881 0.882 l -0.294 0.951 c -0.039 0.126 -0.216 0.126 -0.255 0.0 l -0.293 -0.95 c -0.13 -0.422 -0.46 -0.753 -0.882 -0.883 l -0.95 -0.293 c -0.126 -0.038 -0.126 -0.216 0.0 -0.254 l 0.95 -0.293 c 0.422 -0.13 0.752 -0.46 0.882 -0.882 L 11.54 2.88 Z")
        )
    }.build()
}
