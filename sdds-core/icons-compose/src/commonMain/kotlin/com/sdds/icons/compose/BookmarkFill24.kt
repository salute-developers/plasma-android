package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.882 3.0 h 4.236 c 0.626 0.0 1.137 0.0 1.553 0.037 c 0.43 0.037 0.818 0.118 1.181 0.317 c 0.568 0.312 1.03 0.809 1.32 1.42 c 0.184 0.391 0.259 0.81 0.294 1.273 C 18.5 6.494 18.5 7.045 18.5 7.719 v 10.237 c 0.0 0.503 0.0 0.931 -0.028 1.266 c -0.028 0.329 -0.091 0.72 -0.327 1.04 c -0.309 0.416 -0.777 0.658 -1.272 0.657 c -0.378 0.0 -0.702 -0.192 -0.957 -0.374 c -0.26 -0.185 -0.571 -0.453 -0.936 -0.767 l -1.095 -0.943 c -0.422 -0.364 -0.71 -0.611 -0.948 -0.787 c -0.231 -0.171 -0.377 -0.245 -0.504 -0.283 c -0.283 -0.085 -0.583 -0.085 -0.866 0.0 c -0.127 0.038 -0.273 0.112 -0.504 0.283 c -0.239 0.176 -0.526 0.423 -0.948 0.787 L 9.02 19.778 c -0.365 0.314 -0.675 0.582 -0.936 0.767 c -0.255 0.182 -0.58 0.374 -0.957 0.374 c -0.495 0.001 -0.963 -0.241 -1.272 -0.658 c -0.236 -0.318 -0.3 -0.71 -0.327 -1.039 C 5.5 18.887 5.5 18.459 5.5 17.956 V 7.72 c 0.0 -0.674 0.0 -1.224 0.034 -1.672 c 0.035 -0.463 0.11 -0.882 0.295 -1.272 c 0.29 -0.612 0.75 -1.11 1.319 -1.42 c 0.363 -0.2 0.751 -0.28 1.181 -0.318 C 8.745 3.0 9.256 3.0 9.882 3.0 Z")
        )
    }.build()
}
