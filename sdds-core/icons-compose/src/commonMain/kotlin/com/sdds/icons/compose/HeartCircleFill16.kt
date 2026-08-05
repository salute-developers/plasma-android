package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 3.8 6.729 C 3.8 5.725 4.657 4.5 6.054 4.5 C 6.834 4.5 7.5 5.123 8.0 5.716 C 8.5 5.123 9.166 4.5 9.946 4.5 c 1.397 0.0 2.254 1.225 2.254 2.229 c 0.0 1.908 -1.9 3.696 -3.54 4.972 c -0.228 0.177 -0.341 0.265 -0.477 0.302 c -0.115 0.031 -0.25 0.031 -0.366 0.0 c -0.136 -0.037 -0.25 -0.125 -0.476 -0.302 C 5.7 10.425 3.8 8.637 3.8 6.73 Z")
        )
    }.build()
}
