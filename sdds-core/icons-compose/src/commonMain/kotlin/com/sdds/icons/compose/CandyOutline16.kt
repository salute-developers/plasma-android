package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CandyOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CandyOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.583 1.198 c -0.364 -0.364 -0.986 -0.202 -1.127 0.294 L 9.958 3.254 c -0.827 -0.37 -1.83 -0.215 -2.509 0.464 L 3.72 7.447 C 3.042 8.125 2.887 9.129 3.256 9.956 l -1.764 0.499 c -0.496 0.14 -0.658 0.762 -0.294 1.127 l 3.221 3.22 c 0.365 0.365 0.987 0.203 1.127 -0.293 l 0.498 -1.764 c 0.828 0.37 1.832 0.216 2.511 -0.463 l 3.73 -3.729 c 0.678 -0.679 0.832 -1.683 0.463 -2.51 l 1.762 -0.498 c 0.496 -0.14 0.658 -0.762 0.294 -1.126 l -3.22 -3.22 Z m -1.7 3.188 L 9.9 4.403 l 1.7 1.7 l 0.017 0.016 c 0.449 0.49 0.436 1.252 -0.039 1.727 l -3.729 3.729 c -0.488 0.488 -1.28 0.488 -1.768 0.0 L 4.427 9.922 c -0.488 -0.489 -0.488 -1.28 0.0 -1.768 l 3.73 -3.73 C 8.63 3.95 9.392 3.938 9.882 4.387 Z m 2.218 0.801 l 1.604 -0.453 l -2.437 -2.437 l -0.454 1.604 l 1.287 1.286 Z m -8.198 5.625 l -1.606 0.454 l 2.437 2.437 l 0.454 -1.606 l -1.285 -1.285 Z m 5.21 -4.43 c 0.196 -0.196 0.196 -0.512 0.0 -0.707 c -0.195 -0.196 -0.512 -0.196 -0.707 0.0 l -2.73 2.73 C 5.48 8.6 5.48 8.917 5.676 9.112 c 0.195 0.195 0.512 0.195 0.707 0.0 l 2.73 -2.73 Z")
        )
    }.build()
}
