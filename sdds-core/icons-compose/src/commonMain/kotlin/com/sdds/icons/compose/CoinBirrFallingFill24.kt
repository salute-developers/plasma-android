package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinBirrFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinBirrFallingFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.0 14.75 v 1.75 h 1.108 c 0.488 0.0 0.881 -0.398 0.875 -0.886 c -0.006 -0.479 -0.396 -0.864 -0.875 -0.864 H 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.0 13.75 h 0.458 c 0.484 0.0 0.875 -0.392 0.875 -0.875 S 10.942 12.0 10.458 12.0 H 10.0 v 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 14.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 C 4.5 10.358 7.858 7.0 12.0 7.0 c 4.142 0.0 7.5 3.358 7.5 7.5 Z M 9.0 11.5 C 9.0 11.224 9.224 11.0 9.5 11.0 h 0.958 c 1.036 0.0 1.875 0.84 1.875 1.875 c 0.0 0.407 -0.13 0.784 -0.35 1.091 c 0.588 0.311 0.991 0.926 1.0 1.636 c 0.013 1.045 -0.83 1.898 -1.875 1.898 H 9.5 C 9.224 17.5 9.0 17.276 9.0 17.0 v -5.5 Z m 5.333 4.255 c 0.0 -0.644 0.523 -1.167 1.167 -1.167 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 c -0.43 0.0 -0.83 0.125 -1.167 0.34 v -0.002 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.78 v 0.049 V 17.0 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 v -1.245 Z")
        )
    }.build()
}
