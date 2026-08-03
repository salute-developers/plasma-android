package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CarOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CarOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.5 15.0 c 0.828 0.0 1.5 -0.671 1.5 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 16.0 12.672 16.0 13.5 c 0.0 0.829 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 13.5 C 8.0 14.33 7.328 15.0 6.5 15.0 S 5.0 14.33 5.0 13.5 C 5.0 12.672 5.672 12.0 6.5 12.0 S 8.0 12.672 8.0 13.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 12.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.358 4.0 h 5.284 c 1.113 0.0 1.88 0.0 2.551 0.266 c 0.59 0.235 1.11 0.615 1.513 1.106 c 0.386 0.471 0.612 1.066 0.876 1.878 h 0.668 C 20.664 7.25 21.0 7.586 21.0 8.0 s -0.336 0.75 -0.75 0.75 h -0.19 l 0.392 1.231 c 0.508 0.312 0.921 0.76 1.194 1.294 c 0.199 0.39 0.28 0.809 0.317 1.272 C 22.0 12.995 22.0 13.545 22.0 14.219 v 4.531 c 0.0 0.967 -0.784 1.75 -1.75 1.75 s -1.75 -0.783 -1.75 -1.75 V 18.0 h -13.0 v 0.75 c 0.0 0.967 -0.784 1.75 -1.75 1.75 S 2.0 19.717 2.0 18.75 V 14.22 c 0.0 -0.674 0.0 -1.224 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 C 2.626 10.74 3.04 10.293 3.55 9.98 l 0.391 -1.23 H 3.75 C 3.336 8.75 3.0 8.413 3.0 8.0 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 h 0.668 c 0.264 -0.813 0.49 -1.408 0.876 -1.879 c 0.403 -0.49 0.923 -0.871 1.513 -1.106 C 7.477 3.999 8.245 4.0 9.358 4.0 Z m 7.923 7.0 c 0.696 0.0 1.176 0.001 1.55 0.032 c 0.37 0.03 0.57 0.085 0.713 0.159 c 0.33 0.168 0.598 0.435 0.765 0.765 c 0.074 0.144 0.13 0.343 0.16 0.713 c 0.03 0.38 0.031 0.869 0.031 1.581 v 2.25 h -17.0 v -2.25 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 c 0.144 -0.074 0.343 -0.13 0.713 -0.16 c 0.374 -0.03 0.854 -0.03 1.55 -0.03 H 17.28 Z m 1.443 -1.5 H 5.276 L 5.65 8.322 C 6.053 7.06 6.202 6.63 6.454 6.323 C 6.695 6.03 7.008 5.8 7.362 5.66 C 7.73 5.513 8.184 5.5 9.51 5.5 h 4.98 c 1.326 0.0 1.78 0.013 2.149 0.16 c 0.353 0.14 0.666 0.369 0.907 0.663 c 0.252 0.307 0.402 0.736 0.803 2.0 L 18.724 9.5 Z")
        )
    }.build()
}
