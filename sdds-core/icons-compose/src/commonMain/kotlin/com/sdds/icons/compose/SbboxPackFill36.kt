package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxPackFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxPackFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.125 3.375 C 24.125 3.168 24.293 3.0 24.5 3.0 h 3.0 c 0.207 0.0 0.375 0.168 0.375 0.375 V 6.0 c 0.0 0.555 -0.302 1.04 -0.75 1.3 v 9.204 c 1.034 0.011 1.663 0.059 2.192 0.256 c 1.12 0.418 2.005 1.302 2.423 2.423 C 32.0 19.881 32.0 20.753 32.0 22.5 V 27.0 c 0.0 1.746 0.0 2.62 -0.26 3.317 c -0.418 1.12 -1.302 2.005 -2.423 2.423 C 28.619 33.0 27.747 33.0 26.0 33.0 c -1.746 0.0 -2.62 0.0 -3.317 -0.26 c -1.12 -0.418 -2.005 -1.302 -2.423 -2.424 C 20.0 29.62 20.0 28.747 20.0 27.0 v -4.5 c 0.0 -1.746 0.0 -2.62 0.26 -3.317 c 0.418 -1.12 1.302 -2.005 2.423 -2.423 c 0.529 -0.197 1.158 -0.245 2.192 -0.256 V 7.299 C 24.427 7.04 24.125 6.555 24.125 6.0 V 3.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.5 c -1.657 0.0 -3.0 1.343 -3.0 3.0 V 30.0 c 0.0 1.657 1.343 3.0 3.0 3.0 h 6.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 7.5 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 8.0 Z M 11.0 15.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 12.243 10.5 11.0 10.5 s -2.25 1.007 -2.25 2.25 S 9.757 15.0 11.0 15.0 Z m 1.125 2.625 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 S 10.379 16.5 11.0 16.5 s 1.125 0.504 1.125 1.125 Z")
        )
    }.build()
}
