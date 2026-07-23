package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LikeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LikeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.006 2.11 c 0.285 -0.854 1.192 -1.332 2.058 -1.085 c 1.86 0.531 2.951 2.455 2.453 4.324 L 15.56 8.937 c -0.042 0.158 0.077 0.314 0.242 0.314 h 2.056 c 2.872 0.0 4.678 3.095 3.265 5.595 l -2.52 4.457 c -1.024 1.813 -3.109 2.747 -5.143 2.305 l -5.79 -1.259 c -0.46 0.659 -1.261 1.053 -2.124 0.945 l -1.0 -0.125 c -1.173 -0.147 -2.033 -1.177 -1.967 -2.358 l 0.368 -6.624 c 0.05 -0.891 0.62 -1.669 1.456 -1.982 l 0.955 -0.358 c 0.89 -0.334 1.808 -0.068 2.399 0.534 c 0.154 -0.173 0.295 -0.358 0.42 -0.555 l 2.36 -3.708 c 0.186 -0.294 0.336 -0.608 0.446 -0.938 l 1.023 -3.07 Z m -3.61 9.745 c 0.003 0.066 0.003 0.133 0.0 0.2 l -0.311 6.85 l 5.693 1.237 c 1.392 0.302 2.82 -0.337 3.52 -1.577 l 2.52 -4.457 c 0.847 -1.5 -0.237 -3.357 -1.96 -3.357 h -2.056 c -1.15 0.0 -1.987 -1.09 -1.691 -2.2 l 0.957 -3.588 c 0.287 -1.079 -0.342 -2.189 -1.416 -2.496 c -0.093 -0.026 -0.192 0.025 -0.223 0.118 l -1.023 3.07 c -0.148 0.445 -0.351 0.871 -0.604 1.268 l -2.36 3.708 c -0.29 0.458 -0.643 0.87 -1.045 1.224 Z m -1.525 -0.108 c -0.115 -0.407 -0.564 -0.654 -0.986 -0.496 L 4.93 11.61 c -0.278 0.104 -0.469 0.363 -0.485 0.66 l -0.368 6.625 c -0.022 0.393 0.264 0.737 0.655 0.785 l 1.0 0.125 c 0.37 0.047 0.71 -0.185 0.812 -0.527 c 0.017 -0.057 0.028 -0.118 0.03 -0.183 l 0.324 -7.107 C 6.902 11.9 6.89 11.82 6.87 11.747 Z")
        )
    }.build()
}
