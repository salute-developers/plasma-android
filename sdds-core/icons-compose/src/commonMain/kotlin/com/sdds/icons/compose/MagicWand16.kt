package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MagicWand16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MagicWand16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.89 1.621 c 0.053 -0.16 0.28 -0.16 0.333 0.0 l 0.195 0.595 c 0.208 0.634 0.704 1.131 1.337 1.34 l 0.592 0.196 c 0.16 0.053 0.16 0.28 0.0 0.332 L 6.755 4.279 c -0.633 0.21 -1.13 0.707 -1.337 1.34 L 5.223 6.216 c -0.052 0.16 -0.28 0.16 -0.332 0.0 L 4.696 5.62 C 4.488 4.986 3.992 4.489 3.359 4.28 L 2.767 4.083 c -0.16 -0.053 -0.16 -0.28 0.0 -0.332 l 0.592 -0.196 c 0.633 -0.209 1.13 -0.706 1.337 -1.34 L 4.89 1.62 Z m 4.267 10.3 c 0.027 -0.088 0.152 -0.088 0.179 0.0 l 0.095 0.31 c 0.09 0.294 0.32 0.525 0.616 0.617 l 0.308 0.095 c 0.088 0.027 0.088 0.151 0.0 0.178 l -0.308 0.096 c -0.295 0.091 -0.526 0.322 -0.616 0.617 l -0.095 0.31 c -0.027 0.088 -0.152 0.088 -0.179 0.0 l -0.095 -0.31 c -0.09 -0.295 -0.321 -0.526 -0.616 -0.617 L 8.138 13.12 c -0.088 -0.027 -0.088 -0.15 0.0 -0.178 l 0.308 -0.095 c 0.295 -0.092 0.525 -0.323 0.616 -0.618 l 0.095 -0.31 Z m 3.716 -3.361 c -0.04 -0.132 -0.227 -0.132 -0.267 0.0 l -0.143 0.464 c -0.136 0.443 -0.482 0.79 -0.924 0.927 l -0.463 0.143 c -0.131 0.04 -0.131 0.226 0.0 0.267 l 0.463 0.143 c 0.442 0.137 0.788 0.484 0.924 0.927 l 0.143 0.464 c 0.04 0.132 0.227 0.132 0.267 0.0 l 0.143 -0.464 c 0.136 -0.443 0.482 -0.79 0.924 -0.927 l 0.463 -0.143 c 0.131 -0.04 0.131 -0.227 0.0 -0.267 L 13.94 9.95 c -0.442 -0.137 -0.788 -0.484 -0.924 -0.927 L 12.873 8.56 Z m -1.446 -6.312 c 0.63 -0.632 1.649 -0.632 2.277 0.0 c 0.63 0.631 0.63 1.654 0.0 2.286 L 4.279 14.0 c -0.63 0.633 -1.65 0.633 -2.28 0.0 c -0.63 -0.632 -0.63 -1.656 0.0 -2.289 l 9.43 -9.463 Z M 11.08 5.754 l -7.507 7.538 c -0.24 0.24 -0.628 0.24 -0.868 0.0 s -0.24 -0.631 0.0 -0.872 l 7.508 -7.536 l 0.867 0.87 Z")
        )
    }.build()
}
