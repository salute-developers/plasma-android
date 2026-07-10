package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelicopterFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelicopterFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.25 5.0 C 21.664 5.0 22.0 5.336 22.0 5.75 S 21.664 6.5 21.25 6.5 H 13.0 V 8.0 h 3.02 c 0.836 0.0 1.812 0.056 2.71 0.478 c 3.035 1.424 3.248 4.47 3.268 6.264 C 22.006 15.444 21.435 16.0 20.75 16.0 h -0.975 l 0.9 1.5 h 0.575 c 0.414 0.0 0.75 0.336 0.75 0.75 S 21.664 19.0 21.25 19.0 h -11.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 1.575 l 0.926 -1.546 c -0.072 -0.02 -0.143 -0.043 -0.209 -0.074 c -0.108 -0.052 -0.208 -0.119 -0.297 -0.198 c -0.133 -0.12 -0.241 -0.269 -0.314 -0.439 l -0.99 -2.303 l -7.183 -0.933 c -0.31 -0.04 -0.581 -0.23 -0.724 -0.509 l -0.57 -1.115 c -0.023 -0.047 -0.042 -0.096 -0.058 -0.144 L 2.08 9.585 c -0.185 -0.37 -0.034 -0.82 0.336 -1.006 c 0.37 -0.185 0.82 -0.034 1.006 0.336 L 3.464 9.0 h 6.03 C 9.516 8.893 9.55 8.79 9.6 8.692 C 9.62 8.648 9.646 8.605 9.673 8.563 c 0.11 -0.166 0.258 -0.307 0.435 -0.406 C 10.286 8.058 10.492 8.0 10.717 8.0 H 11.5 V 6.5 H 3.25 C 2.836 6.5 2.5 6.164 2.5 5.75 S 2.836 5.0 3.25 5.0 h 18.0 Z m -6.793 11.0 c -0.016 0.046 -0.037 0.092 -0.063 0.136 L 13.575 17.5 h 5.35 l -0.819 -1.364 c -0.026 -0.044 -0.047 -0.09 -0.063 -0.136 h -3.586 Z m 0.59 -6.5 c 0.079 0.605 0.251 1.036 0.466 1.348 c 0.29 0.422 0.706 0.698 1.24 0.879 c 0.545 0.184 1.19 0.258 1.895 0.28 c 0.495 0.017 0.966 0.008 1.442 0.0 c -0.33 -0.883 -0.924 -1.667 -1.997 -2.171 C 17.51 9.563 16.818 9.5 16.02 9.5 h -0.973 Z")
        )
    }.build()
}
