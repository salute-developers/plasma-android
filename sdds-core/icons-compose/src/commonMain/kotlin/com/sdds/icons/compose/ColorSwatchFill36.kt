package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.22 24.63 L 14.853 32.0 h 14.815 c 0.619 0.0 1.212 -0.246 1.65 -0.684 C 31.753 30.88 32.0 30.286 32.0 29.667 V 23.0 c 0.0 -0.619 -0.246 -1.213 -0.684 -1.65 c -0.437 -0.438 -1.03 -0.683 -1.649 -0.683 h -3.406 l -4.04 3.964 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.333 4.0 c -0.619 0.0 -1.212 0.246 -1.65 0.684 C 4.247 5.12 4.0 5.714 4.0 6.333 v 20.0 c 0.0 1.503 0.597 2.944 1.66 4.007 C 6.723 31.403 8.164 32.0 9.667 32.0 c 1.503 0.0 2.944 -0.598 4.007 -1.66 c 1.062 -1.063 1.659 -2.504 1.659 -4.007 v -20.0 c 0.0 -0.619 -0.245 -1.212 -0.683 -1.65 C 14.213 4.247 13.62 4.0 13.0 4.0 H 6.333 Z m 3.334 21.333 c 0.552 0.0 1.0 0.448 1.0 1.0 v 0.017 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -0.017 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.023 6.94 c -0.618 0.0 -1.211 0.247 -1.649 0.684 L 19.25 8.748 l -1.917 1.93 v 15.655 c 0.0 0.121 -0.002 0.243 -0.008 0.363 l 11.06 -11.06 c 0.438 -0.438 0.684 -1.031 0.684 -1.65 c 0.0 -0.618 -0.246 -1.212 -0.683 -1.65 l -4.713 -4.712 c -0.438 -0.437 -1.03 -0.684 -1.65 -0.684 Z")
        )
    }.build()
}
