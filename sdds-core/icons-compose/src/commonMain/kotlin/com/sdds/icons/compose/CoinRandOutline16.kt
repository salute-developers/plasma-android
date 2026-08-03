package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.997 2.0 C 6.89 2.0 5.804 2.294 4.847 2.852 C 3.89 3.411 3.096 4.213 2.544 5.18 S 1.7 7.24 1.7 8.354 c 0.0 1.115 0.29 2.21 0.843 3.176 c 0.137 0.24 0.442 0.323 0.682 0.186 c 0.24 -0.137 0.323 -0.443 0.186 -0.682 c -0.466 -0.815 -0.71 -1.739 -0.71 -2.68 c 0.0 -0.94 0.244 -1.864 0.71 -2.679 c 0.465 -0.814 1.134 -1.49 1.939 -1.959 C 6.156 3.246 7.068 3.0 7.997 3.0 c 0.928 0.0 1.841 0.247 2.646 0.716 c 0.805 0.47 1.474 1.145 1.939 1.96 c 0.465 0.814 0.71 1.738 0.71 2.678 c 0.0 0.941 -0.245 1.865 -0.71 2.68 c -0.137 0.24 -0.054 0.545 0.186 0.682 s 0.545 0.054 0.682 -0.186 c 0.552 -0.966 0.843 -2.061 0.843 -3.176 c 0.0 -1.114 -0.29 -2.21 -0.843 -3.175 c -0.552 -0.966 -1.346 -1.768 -2.303 -2.327 C 10.189 2.294 9.103 2.0 7.997 2.0 Z M 1.5 12.999 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 12.996 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 5.5 C 6.0 5.224 6.224 5.0 6.5 5.0 h 1.575 c 1.146 0.0 2.075 0.929 2.075 2.075 c 0.0 0.873 -0.54 1.62 -1.303 1.927 l 1.239 2.203 c 0.135 0.24 0.05 0.545 -0.19 0.68 c -0.242 0.136 -0.546 0.05 -0.682 -0.19 L 7.783 9.15 H 7.0 v 2.3 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 6.0 11.726 6.0 11.45 V 5.5 Z m 2.065 2.65 H 7.0 h 1.065 Z m 0.017 0.0 C 8.672 8.146 9.15 7.666 9.15 7.075 C 9.15 6.481 8.669 6.0 8.075 6.0 H 7.0 v 2.15")
        )
    }.build()
}
