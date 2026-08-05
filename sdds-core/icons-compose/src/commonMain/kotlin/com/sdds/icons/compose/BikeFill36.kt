package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.125 10.5 c 1.45 0.0 2.625 -1.175 2.625 -2.625 S 23.575 5.25 22.125 5.25 S 19.5 6.425 19.5 7.875 s 1.175 2.625 2.625 2.625 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.875 16.875 c -2.95 0.0 -5.137 -1.537 -6.648 -3.078 l -3.243 3.243 l 2.224 1.907 c 0.582 0.499 0.917 1.227 0.917 1.993 v 5.31 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -5.31 c 0.0 -0.11 -0.048 -0.214 -0.131 -0.285 l -3.496 -2.997 c -1.161 -0.995 -1.23 -2.768 -0.148 -3.849 l 2.852 -2.852 c 1.168 -1.168 3.017 -0.943 3.984 0.252 c 0.063 0.077 0.127 0.155 0.193 0.233 c 1.358 1.617 3.224 3.183 5.746 3.183 c 0.621 0.0 1.125 0.504 1.125 1.125 s -0.504 1.125 -1.125 1.125 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 30.75 c 3.314 0.0 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 Z m 0.0 -4.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 s -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 24.75 c 0.0 3.314 -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 s 2.686 -6.0 6.0 -6.0 s 6.0 2.686 6.0 6.0 Z m -4.5 0.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z")
        )
    }.build()
}
