package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 14.75 6.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 S 15.716 3.0 14.75 3.0 S 13.0 3.784 13.0 4.75 s 0.784 1.75 1.75 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.818 8.698 c 1.007 1.027 2.465 2.052 4.432 2.052 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 c -1.681 0.0 -2.925 -1.044 -3.83 -2.122 c -0.045 -0.052 -0.088 -0.104 -0.13 -0.155 c -0.644 -0.797 -1.877 -0.947 -2.655 -0.169 L 8.733 8.706 c -0.72 0.72 -0.675 1.903 0.099 2.566 l 2.33 1.998 c 0.056 0.048 0.088 0.117 0.088 0.19 V 17.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.54 c 0.0 -0.51 -0.223 -0.996 -0.611 -1.329 l -1.483 -1.27 l 2.162 -2.163 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 12.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z m -2.5 4.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 s -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 12.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z m -2.5 4.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 s -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 Z")
        )
    }.build()
}
