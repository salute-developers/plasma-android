package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.847 2.852 C 5.804 2.294 6.891 2.0 7.997 2.0 c 1.106 0.0 2.192 0.294 3.15 0.852 c 0.957 0.559 1.751 1.361 2.303 2.327 s 0.843 2.061 0.843 3.175 c 0.0 1.115 -0.29 2.21 -0.843 3.176 c -0.137 0.24 -0.442 0.323 -0.682 0.186 c -0.24 -0.137 -0.323 -0.443 -0.186 -0.682 c 0.465 -0.815 0.71 -1.739 0.71 -2.68 c 0.0 -0.94 -0.245 -1.864 -0.71 -2.679 c -0.465 -0.814 -1.134 -1.49 -1.94 -1.959 C 9.839 3.246 8.926 3.0 7.998 3.0 C 7.068 3.0 6.156 3.247 5.35 3.716 c -0.805 0.47 -1.474 1.145 -1.94 1.96 c -0.465 0.814 -0.71 1.738 -0.71 2.678 c 0.0 0.941 0.245 1.865 0.71 2.68 c 0.138 0.24 0.055 0.545 -0.185 0.682 S 2.68 11.77 2.544 11.53 C 1.992 10.564 1.7 9.469 1.7 8.354 c 0.0 -1.114 0.29 -2.21 0.843 -3.175 c 0.552 -0.966 1.346 -1.768 2.303 -2.327 Z M 1.0 13.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 12.996 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 1.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 6.12 -8.661 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 2.693 H 6.066 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 6.62 v 0.774 H 6.066 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 6.62 v 0.565 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.565 h 1.256 c 0.277 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 H 7.62 V 9.031 h 1.065 c 1.158 0.0 2.096 -0.938 2.096 -2.096 c 0.0 -1.158 -0.938 -2.097 -2.096 -2.097 H 7.12 Z m 1.565 3.193 H 7.62 V 5.838 h 1.065 c 0.605 0.0 1.096 0.491 1.096 1.097 c 0.0 0.605 -0.49 1.096 -1.096 1.096 Z")
        )
    }.build()
}
