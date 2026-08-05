package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.384 5.081 c 0.403 -0.108 0.828 -0.108 1.231 0.0 c 0.41 0.11 0.816 0.399 2.067 1.36 l 11.957 9.195 c 0.438 0.337 1.066 0.255 1.403 -0.183 c 0.336 -0.438 0.254 -1.066 -0.184 -1.402 L 21.742 4.734 C 20.72 3.947 19.98 3.377 19.134 3.15 c -0.743 -0.2 -1.526 -0.2 -2.269 0.0 c -0.845 0.227 -1.586 0.797 -2.608 1.584 L 2.14 14.051 c -0.437 0.336 -0.52 0.964 -0.183 1.402 c 0.337 0.438 0.965 0.52 1.403 0.183 l 11.957 -9.195 c 1.251 -0.961 1.657 -1.25 2.067 -1.36 Z m 0.127 2.453 c 0.32 -0.084 0.658 -0.084 0.978 0.0 c 0.377 0.1 0.692 0.34 0.883 0.486 l 0.055 0.043 l 10.878 8.175 l 0.07 0.053 c 0.283 0.212 0.585 0.438 0.812 0.737 c 0.198 0.26 0.346 0.556 0.436 0.87 c 0.103 0.36 0.102 0.736 0.102 1.087 v 0.088 v 7.392 c 0.0 0.913 0.0 1.667 -0.05 2.281 c -0.053 0.638 -0.166 1.224 -0.449 1.775 c -0.439 0.854 -1.138 1.549 -2.0 1.984 c -0.554 0.28 -1.145 0.392 -1.788 0.444 c -0.62 0.05 -1.379 0.05 -2.3 0.05 H 10.862 c -0.92 0.0 -1.68 0.0 -2.3 -0.05 c -0.642 -0.052 -1.233 -0.164 -1.788 -0.444 c -0.861 -0.435 -1.561 -1.13 -2.0 -1.984 c -0.283 -0.55 -0.395 -1.137 -0.448 -1.775 c -0.05 -0.614 -0.05 -1.368 -0.05 -2.281 v -7.392 v -0.088 c -0.001 -0.351 -0.002 -0.727 0.101 -1.087 c 0.09 -0.314 0.238 -0.61 0.436 -0.87 c 0.227 -0.3 0.53 -0.525 0.812 -0.737 l 0.07 -0.053 l 10.878 -8.175 l 0.055 -0.043 c 0.192 -0.146 0.507 -0.386 0.883 -0.486 Z m -4.086 14.911 c 0.0 -2.526 2.048 -4.575 4.575 -4.575 c 2.526 0.0 4.575 2.049 4.575 4.575 v 8.286 h -9.15 v -8.286 Z")
        )
    }.build()
}
