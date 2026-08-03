package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.04 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -2.72 2.72 c -1.193 -1.06 -2.764 -1.705 -4.485 -1.705 c -3.006 0.0 -5.551 1.964 -6.426 4.678 C 3.838 9.308 2.0 11.561 2.0 14.245 c 0.0 1.827 0.852 3.455 2.18 4.508 L 2.985 19.95 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.061 0.0 l 16.97 -16.97 Z m -4.843 2.723 c -0.92 -0.79 -2.115 -1.268 -3.422 -1.268 c -2.467 0.0 -4.538 1.702 -5.1 3.997 c -0.071 0.29 -0.309 0.512 -0.605 0.561 C 5.034 10.388 3.5 12.138 3.5 14.245 c 0.0 1.413 0.69 2.665 1.751 3.438 l 10.92 -10.92 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.816 9.361 l 1.18 -1.18 c 0.325 0.79 0.504 1.656 0.504 2.564 c 0.0 0.236 -0.012 0.47 -0.036 0.7 c 1.5 0.73 2.536 2.268 2.536 4.05 c 0.0 2.485 -2.015 4.5 -4.5 4.5 H 7.75 c -0.183 0.0 -0.364 -0.009 -0.543 -0.025 l 1.475 -1.475 H 17.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -1.34 -0.878 -2.475 -2.092 -2.86 c -0.364 -0.116 -0.583 -0.487 -0.509 -0.861 c 0.066 -0.332 0.101 -0.676 0.101 -1.03 c 0.0 -0.478 -0.064 -0.942 -0.184 -1.383 Z")
        )
    }.build()
}
