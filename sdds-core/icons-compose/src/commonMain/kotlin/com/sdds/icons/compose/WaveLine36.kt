package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WaveLine36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WaveLine36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.182 16.89 C 8.154 18.28 6.66 19.307 4.5 19.307 c -0.828 0.0 -1.5 -0.668 -1.5 -1.493 c 0.0 -0.824 0.672 -1.493 1.5 -1.493 c 1.028 0.0 1.69 -0.42 2.267 -1.2 c 0.644 -0.87 1.107 -2.096 1.61 -3.57 l 0.144 -0.43 c 0.428 -1.27 0.914 -2.712 1.605 -3.844 c 0.82 -1.344 2.1 -2.526 4.124 -2.526 c 1.347 0.0 2.346 0.701 3.011 1.646 c 0.623 0.883 1.003 2.03 1.26 3.2 c 0.499 2.26 0.662 5.194 0.817 7.985 l 0.02 0.336 c 0.165 2.981 0.338 5.771 0.833 7.816 c 0.248 1.026 0.544 1.711 0.849 2.113 c 0.26 0.343 0.468 0.418 0.71 0.418 c 0.33 0.0 0.742 -0.155 1.282 -1.26 c 0.453 -0.926 0.797 -2.122 1.2 -3.522 c 0.08 -0.279 0.163 -0.566 0.25 -0.861 c 0.487 -1.664 1.091 -3.557 2.087 -5.033 c 1.05 -1.557 2.618 -2.76 4.931 -2.76 c 0.828 0.0 1.5 0.668 1.5 1.492 c 0.0 0.825 -0.672 1.493 -1.5 1.493 c -1.062 0.0 -1.791 0.477 -2.44 1.439 c -0.703 1.043 -1.201 2.51 -1.698 4.205 c -0.074 0.251 -0.148 0.51 -0.223 0.771 c -0.4 1.392 -0.83 2.898 -1.41 4.082 c -0.69 1.415 -1.872 2.94 -3.979 2.94 c -1.351 0.0 -2.386 -0.66 -3.103 -1.603 c -0.671 -0.884 -1.088 -2.035 -1.373 -3.215 c -0.572 -2.363 -0.75 -5.452 -0.912 -8.35 l -0.01 -0.18 c -0.163 -2.921 -0.315 -5.647 -0.76 -7.665 c -0.229 -1.034 -0.503 -1.724 -0.786 -2.126 c -0.241 -0.342 -0.403 -0.375 -0.556 -0.375 c -0.601 0.0 -1.056 0.265 -1.56 1.09 c -0.506 0.829 -0.882 1.939 -1.34 3.29 l -0.132 0.391 c -0.483 1.418 -1.074 3.084 -2.036 4.384 Z")
        )
    }.build()
}
