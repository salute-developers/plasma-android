package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinBirrFallingOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinBirrFallingOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 16.75 6.664 16.414 7.0 16.0 7.0 s -0.75 -0.336 -0.75 -0.75 v -2.5 C 15.25 3.336 15.586 3.0 16.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 12.75 5.664 12.414 6.0 12.0 6.0 s -0.75 -0.336 -0.75 -0.75 v -2.5 C 11.25 2.336 11.586 2.0 12.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.75 3.75 C 8.75 3.336 8.414 3.0 8.0 3.0 S 7.25 3.336 7.25 3.75 v 2.5 C 7.25 6.664 7.586 7.0 8.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.5 11.0 C 9.224 11.0 9.0 11.224 9.0 11.5 V 17.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.608 c 1.044 0.0 1.888 -0.853 1.875 -1.898 c -0.009 -0.71 -0.412 -1.325 -1.0 -1.636 c 0.22 -0.307 0.35 -0.684 0.35 -1.091 c 0.0 -1.036 -0.84 -1.875 -1.875 -1.875 H 9.5 Z m 0.5 5.5 v -1.75 h 1.108 c 0.48 0.0 0.87 0.385 0.875 0.864 c 0.006 0.488 -0.388 0.886 -0.875 0.886 H 10.0 Z m 0.458 -2.75 H 10.0 V 12.0 h 0.458 c 0.483 0.0 0.875 0.392 0.875 0.875 s -0.392 0.875 -0.875 0.875 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.5 14.588 c -0.644 0.0 -1.167 0.523 -1.167 1.167 V 17.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -1.245 v -0.05 v -1.778 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 s 0.5 0.223 0.5 0.5 v 0.002 c 0.337 -0.216 0.737 -0.34 1.167 -0.34 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.275 -0.224 0.5 -0.5 0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.0 c 4.142 0.0 7.5 3.358 7.5 7.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 C 4.5 10.358 7.858 7.0 12.0 7.0 Z m 6.0 7.5 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 Z")
        )
    }.build()
}
