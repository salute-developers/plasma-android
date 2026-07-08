package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.597 4.404 C 3.142 3.801 3.263 2.943 3.866 2.488 c 0.53 -0.399 1.256 -0.355 1.733 0.07 c 0.077 -0.104 0.17 -0.2 0.28 -0.282 C 6.482 1.82 7.34 1.94 7.795 2.545 l 1.877 2.491 c -0.083 -0.649 0.31 -1.282 0.957 -1.48 c 0.723 -0.22 1.488 0.186 1.709 0.908 l 1.167 3.819 c 0.753 2.464 -0.633 5.073 -3.098 5.826 c -1.929 0.59 -3.945 -0.132 -5.091 -1.653 l -0.02 -0.028 l -2.278 -3.023 C 2.563 8.8 2.684 7.944 3.288 7.489 c 0.101 -0.077 0.21 -0.137 0.323 -0.181 l -0.565 -0.75 c -0.455 -0.603 -0.334 -1.461 0.27 -1.916 c 0.101 -0.077 0.21 -0.137 0.323 -0.181 L 3.597 4.404 Z m 0.798 -0.602 C 4.273 3.64 4.305 3.41 4.468 3.287 C 4.63 3.165 4.86 3.197 4.983 3.359 l 2.82 3.744 c 0.167 0.22 0.48 0.264 0.7 0.098 c 0.221 -0.166 0.266 -0.48 0.1 -0.7 L 6.407 3.589 c -0.122 -0.162 -0.09 -0.393 0.073 -0.515 c 0.162 -0.122 0.393 -0.09 0.515 0.073 l 3.55 4.71 C 10.691 8.05 10.955 8.11 11.171 8.0 c 0.216 -0.11 0.322 -0.36 0.25 -0.591 l -0.744 -2.438 c -0.06 -0.194 0.05 -0.4 0.244 -0.46 c 0.194 -0.059 0.4 0.05 0.46 0.245 l 1.167 3.818 c 0.592 1.936 -0.498 3.986 -2.434 4.578 c -1.504 0.46 -3.077 -0.095 -3.982 -1.274 l -0.018 -0.026 l -2.298 -3.05 C 3.694 8.641 3.727 8.41 3.889 8.288 c 0.162 -0.123 0.393 -0.09 0.515 0.072 l 1.254 1.664 c 0.166 0.22 0.48 0.264 0.7 0.098 c 0.22 -0.166 0.265 -0.48 0.099 -0.7 L 3.845 5.956 c -0.123 -0.162 -0.09 -0.393 0.072 -0.515 C 4.08 5.318 4.31 5.35 4.432 5.513 l 2.299 3.05 c 0.166 0.22 0.48 0.265 0.7 0.099 c 0.22 -0.167 0.265 -0.48 0.098 -0.7 l -3.134 -4.16 Z")
        )
    }.build()
}
