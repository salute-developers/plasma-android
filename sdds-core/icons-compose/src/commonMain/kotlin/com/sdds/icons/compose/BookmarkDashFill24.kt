package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.5 17.956 c 0.0 0.502 0.0 0.93 -0.028 1.266 c -0.028 0.328 -0.091 0.72 -0.327 1.039 c -0.309 0.416 -0.777 0.658 -1.272 0.658 c -0.378 0.0 -0.701 -0.192 -0.957 -0.374 c -0.26 -0.186 -0.571 -0.453 -0.935 -0.767 l -1.096 -0.943 c -0.422 -0.363 -0.709 -0.611 -0.947 -0.787 c -0.231 -0.171 -0.378 -0.246 -0.504 -0.283 c -0.284 -0.085 -0.584 -0.085 -0.867 0.0 c -0.127 0.037 -0.273 0.112 -0.504 0.283 c -0.239 0.176 -0.527 0.424 -0.949 0.787 L 9.02 19.778 c -0.365 0.314 -0.675 0.581 -0.936 0.767 c -0.256 0.182 -0.579 0.373 -0.957 0.374 c -0.486 0.0 -0.947 -0.233 -1.256 -0.637 l 12.63 -12.629 v 10.303 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.084 2.083 l 0.001 0.001 L 5.502 18.53 L 3.53 20.5 c -0.292 0.294 -0.767 0.294 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 3.03 -3.03 V 7.72 c 0.0 -0.674 0.0 -1.225 0.034 -1.672 c 0.035 -0.463 0.11 -0.882 0.295 -1.273 c 0.29 -0.611 0.751 -1.108 1.319 -1.42 c 0.362 -0.199 0.751 -0.28 1.181 -0.318 C 8.745 2.999 9.257 3.0 9.882 3.0 h 4.236 c 0.626 0.0 1.137 0.0 1.553 0.036 c 0.43 0.038 0.819 0.12 1.182 0.318 c 0.353 0.195 0.665 0.46 0.92 0.782 l 1.668 -1.666 Z")
        )
    }.build()
}
