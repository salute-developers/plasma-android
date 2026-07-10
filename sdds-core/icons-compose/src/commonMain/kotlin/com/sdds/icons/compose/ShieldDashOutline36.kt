package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.205 8.212 C 31.387 8.393 31.5 8.644 31.5 8.92 c 0.0 10.591 -3.07 16.61 -6.349 19.996 c -3.26 3.368 -6.61 4.008 -6.971 4.068 l -0.007 0.001 l -0.025 0.005 c -0.027 0.004 -0.08 0.01 -0.148 0.01 c -0.067 0.0 -0.12 -0.006 -0.147 -0.01 l -0.027 -0.005 H 17.82 c -0.36 -0.061 -3.71 -0.701 -6.971 -4.069 l -0.17 -0.178 l 1.415 -1.415 c 0.064 0.069 0.128 0.136 0.191 0.201 c 2.524 2.607 5.072 3.314 5.715 3.457 c 0.644 -0.143 3.19 -0.85 5.714 -3.457 c 2.751 -2.84 5.59 -8.056 5.776 -17.597 l 1.715 -1.716 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.241 3.306 c 0.463 -0.304 1.056 -0.304 1.518 0.0 c 0.59 0.387 2.428 1.555 4.692 2.622 c 1.02 0.48 2.102 0.925 3.177 1.273 l 3.12 -3.119 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.706 30.952 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 l 3.993 -3.994 C 6.131 21.93 4.5 16.64 4.5 8.92 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 c 2.154 0.0 4.755 -0.913 7.049 -1.993 c 2.265 -1.067 4.102 -2.235 4.692 -2.622 Z m 0.76 1.89 c -0.84 0.536 -2.551 1.575 -4.6 2.54 c -2.055 0.968 -4.552 1.911 -6.892 2.135 c 0.121 6.57 1.498 11.095 3.24 14.208 L 25.056 8.773 c -0.86 -0.318 -1.69 -0.675 -2.457 -1.037 c -2.05 -0.965 -3.759 -2.004 -4.599 -2.54 Z")
        )
    }.build()
}
