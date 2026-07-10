package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipHorizontalOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipHorizontalOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.437 6.589 c 0.75 -1.356 2.812 -0.823 2.813 0.726 v 20.434 l -0.012 0.23 c -0.108 1.06 -0.95 1.9 -2.008 2.008 L 15.0 30.0 H 4.043 l -0.21 -0.014 c -1.018 -0.138 -1.622 -1.274 -1.104 -2.212 L 14.437 6.59 Z M 4.89 27.999 H 15.0 c 0.138 0.0 0.25 -0.112 0.25 -0.25 V 9.253 L 4.89 27.999 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.75 7.315 c 0.001 -1.55 2.064 -2.082 2.813 -0.726 l 11.708 21.184 c 0.518 0.938 -0.086 2.074 -1.104 2.212 L 31.957 30.0 H 21.002 l -0.23 -0.012 c -1.06 -0.107 -1.901 -0.949 -2.009 -2.007 l -0.011 -0.23 V 7.314 Z m 2.0 20.434 c 0.0 0.138 0.113 0.25 0.25 0.25 h 10.11 L 20.75 9.253 v 18.496 Z")
        )
    }.build()
}
