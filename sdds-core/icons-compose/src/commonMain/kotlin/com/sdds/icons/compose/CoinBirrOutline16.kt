package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinBirrOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinBirrOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.847 2.853 C 5.804 2.294 6.891 2.0 7.997 2.0 c 1.106 0.0 2.192 0.294 3.15 0.853 c 0.957 0.558 1.751 1.36 2.303 2.326 s 0.843 2.061 0.843 3.176 c 0.0 1.114 -0.29 2.21 -0.843 3.175 c -0.137 0.24 -0.442 0.323 -0.682 0.186 c -0.24 -0.137 -0.323 -0.442 -0.186 -0.682 c 0.465 -0.814 0.71 -1.738 0.71 -2.68 c 0.0 -0.94 -0.245 -1.864 -0.71 -2.678 c -0.465 -0.815 -1.134 -1.49 -1.94 -1.96 C 9.839 3.248 8.926 3.0 7.998 3.0 C 7.068 3.0 6.156 3.247 5.35 3.717 C 4.546 4.186 3.877 4.86 3.41 5.676 c -0.465 0.814 -0.71 1.738 -0.71 2.679 c 0.0 0.94 0.245 1.865 0.71 2.679 c 0.138 0.24 0.055 0.545 -0.185 0.682 S 2.68 11.77 2.544 11.53 C 1.992 10.564 1.7 9.47 1.7 8.355 c 0.0 -1.115 0.29 -2.21 0.843 -3.176 c 0.552 -0.965 1.346 -1.768 2.303 -2.326 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.0 13.5 C 1.0 13.222 1.224 13.0 1.5 13.0 h 12.996 c 0.277 0.0 0.5 0.223 0.5 0.5 c 0.0 0.275 -0.223 0.5 -0.5 0.5 H 1.5 C 1.224 14.0 1.0 13.774 1.0 13.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 5.25 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.732 c 1.114 0.0 2.013 -0.91 2.0 -2.024 c -0.01 -0.775 -0.46 -1.444 -1.11 -1.767 c 0.255 -0.336 0.406 -0.755 0.406 -1.209 c 0.0 -1.104 -0.896 -2.0 -2.0 -2.0 H 5.0 Z m 0.5 6.0 v -2.0 h 1.232 c 0.547 0.0 0.993 0.44 1.0 0.988 c 0.006 0.557 -0.443 1.012 -1.0 1.012 H 5.5 Z m 0.528 -3.0 H 5.5 v -2.0 h 0.528 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 9.074 c -0.721 0.0 -1.306 0.584 -1.306 1.305 v 1.371 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -1.37 v -0.042 v -1.94 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.223 0.5 0.5 v 0.08 c 0.372 -0.255 0.821 -0.404 1.306 -0.404 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 Z")
        )
    }.build()
}
