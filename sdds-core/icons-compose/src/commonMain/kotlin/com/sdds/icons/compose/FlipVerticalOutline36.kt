package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipVerticalOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipVerticalOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.41 14.436 c 1.355 0.75 0.823 2.812 -0.726 2.812 H 8.249 l -0.23 -0.011 c -1.059 -0.108 -1.9 -0.95 -2.008 -2.008 l -0.012 -0.23 V 4.04 l 0.014 -0.209 C 6.15 2.814 7.288 2.211 8.225 2.728 l 21.184 11.708 Z M 8.0 4.889 V 15.0 c 0.0 0.137 0.111 0.25 0.25 0.25 h 18.495 L 8.0 4.888 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.684 18.748 c 1.55 0.0 2.081 2.063 0.725 2.813 L 8.225 33.269 c -0.937 0.518 -2.074 -0.086 -2.212 -1.105 l -0.014 -0.209 V 20.998 l 0.012 -0.23 c 0.108 -1.058 0.95 -1.9 2.008 -2.008 l 0.23 -0.012 h 20.435 Z m -20.435 2.0 c -0.137 0.0 -0.25 0.113 -0.25 0.25 v 10.11 l 18.746 -10.36 H 8.25 Z")
        )
    }.build()
}
