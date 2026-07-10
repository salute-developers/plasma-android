package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.935 2.452 c -0.251 -0.604 -1.107 -0.604 -1.358 0.0 L 5.387 5.32 c -0.105 0.255 -0.344 0.429 -0.62 0.45 l -3.09 0.25 c -0.651 0.052 -0.915 0.864 -0.42 1.29 l 2.358 2.025 c 0.208 0.18 0.3 0.46 0.236 0.727 L 3.13 13.09 c -0.151 0.636 0.541 1.138 1.1 0.796 l 2.64 -1.618 c 0.173 -0.105 0.378 -0.134 0.567 -0.085 l 0.35 -1.08 l -1.402 -1.022 C 5.314 9.299 5.865 7.6 7.19 7.6 h 1.733 L 9.46 5.945 c 0.025 -0.078 0.055 -0.15 0.09 -0.218 c -0.19 -0.07 -0.345 -0.216 -0.425 -0.408 l -1.19 -2.868 Z m 3.46 3.71 c -0.199 -0.615 -1.067 -0.615 -1.267 0.0 l -0.693 2.14 H 7.192 c -0.645 0.0 -0.914 0.828 -0.391 1.208 l 1.814 1.323 l -0.693 2.139 c -0.2 0.616 0.503 1.127 1.025 0.747 l 1.815 -1.322 l 1.815 1.322 c 0.522 0.38 1.224 -0.131 1.025 -0.747 l -0.693 -2.14 l 1.814 -1.322 c 0.522 -0.38 0.254 -1.208 -0.391 -1.208 h -2.243 l -0.694 -2.14 Z")
        )
    }.build()
}
