package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.197 c -0.84 0.535 -2.55 1.574 -4.6 2.54 c -2.054 0.967 -4.55 1.91 -6.891 2.134 c 0.176 9.577 3.02 14.808 5.777 17.655 c 2.524 2.606 5.07 3.313 5.714 3.457 c 0.644 -0.144 3.19 -0.85 5.715 -3.457 c 2.756 -2.847 5.6 -8.078 5.776 -17.655 c -2.34 -0.224 -4.837 -1.167 -6.892 -2.134 C 20.55 6.77 18.84 5.732 18.0 5.197 Z m -0.759 -1.891 c 0.462 -0.304 1.056 -0.304 1.518 0.0 c 0.59 0.387 2.427 1.555 4.692 2.621 c 2.294 1.08 4.895 1.994 7.049 1.994 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 10.591 -3.07 16.61 -6.349 19.996 c -3.261 3.368 -6.61 4.008 -6.971 4.069 h -0.007 l -0.026 0.005 C 18.121 32.995 18.067 33.0 18.0 33.0 c -0.068 0.0 -0.121 -0.006 -0.147 -0.01 l -0.026 -0.004 l -0.007 -0.001 c -0.36 -0.061 -3.71 -0.701 -6.971 -4.069 C 7.569 25.531 4.5 19.512 4.5 8.921 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 c 2.154 0.0 4.755 -0.913 7.049 -1.994 c 2.264 -1.066 4.101 -2.234 4.692 -2.621 Z")
        )
    }.build()
}
