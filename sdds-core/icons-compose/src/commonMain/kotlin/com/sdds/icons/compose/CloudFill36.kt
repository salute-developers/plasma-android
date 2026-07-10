package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.333 13.058 C 5.682 14.062 3.0 17.405 3.0 21.375 C 3.0 26.139 6.862 30.0 11.625 30.0 H 26.25 c 3.728 0.0 6.75 -3.022 6.75 -6.75 c 0.0 -2.673 -1.553 -4.98 -3.804 -6.075 c 0.036 -0.345 0.054 -0.696 0.054 -1.05 C 29.25 10.533 24.717 6.0 19.125 6.0 c -3.643 0.0 -6.835 1.923 -8.619 4.81 c 0.893 -0.095 1.796 -0.077 2.688 0.057 c 1.44 0.215 2.822 0.724 4.058 1.496 c 1.236 0.771 2.3 1.79 3.126 2.99 c 0.826 1.2 1.396 2.557 1.675 3.987 c 0.106 0.543 -0.248 1.068 -0.79 1.174 c -0.542 0.105 -1.067 -0.248 -1.173 -0.79 c -0.226 -1.161 -0.689 -2.263 -1.36 -3.238 c -0.67 -0.974 -1.534 -1.8 -2.537 -2.427 c -1.003 -0.626 -2.125 -1.04 -3.295 -1.214 c -1.17 -0.175 -2.363 -0.107 -3.505 0.2 c -0.02 0.004 -0.04 0.01 -0.06 0.013 Z")
        )
    }.build()
}
