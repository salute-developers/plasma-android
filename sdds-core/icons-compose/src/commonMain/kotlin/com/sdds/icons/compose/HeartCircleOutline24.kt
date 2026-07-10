package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.418 6.75 c -2.344 0.0 -3.768 2.008 -3.768 3.68 c 0.0 1.497 0.749 2.869 1.696 4.031 c 0.955 1.172 2.182 2.216 3.292 3.067 l 0.062 0.048 c 0.255 0.196 0.53 0.41 0.872 0.5 c 0.29 0.078 0.616 0.078 0.906 0.0 c 0.34 -0.09 0.617 -0.304 0.872 -0.5 l 0.062 -0.048 c 1.11 -0.85 2.337 -1.895 3.292 -3.067 c 0.947 -1.162 1.696 -2.534 1.696 -4.03 c 0.0 -1.673 -1.424 -3.681 -3.768 -3.681 c -0.724 0.0 -1.356 0.285 -1.87 0.64 c -0.267 0.184 -0.513 0.395 -0.737 0.612 c -0.224 -0.217 -0.47 -0.428 -0.736 -0.612 c -0.515 -0.355 -1.147 -0.64 -1.87 -0.64 Z M 7.15 10.43 c 0.0 -0.968 0.871 -2.18 2.268 -2.18 c 0.32 0.0 0.658 0.125 1.018 0.374 c 0.361 0.25 0.703 0.595 1.02 0.964 c 0.143 0.165 0.35 0.26 0.569 0.26 c 0.218 0.0 0.426 -0.095 0.569 -0.26 c 0.317 -0.369 0.659 -0.714 1.02 -0.964 c 0.36 -0.249 0.697 -0.374 1.018 -0.374 c 1.396 0.0 2.268 1.212 2.268 2.18 c 0.0 0.996 -0.506 2.037 -1.359 3.084 c -0.846 1.037 -1.966 1.998 -3.042 2.824 c -0.169 0.129 -0.263 0.2 -0.337 0.249 c -0.033 0.021 -0.052 0.031 -0.062 0.036 l -0.009 0.004 H 12.09 c -0.036 0.01 -0.094 0.01 -0.13 0.0 h -0.002 l -0.008 -0.004 c -0.01 -0.005 -0.03 -0.015 -0.062 -0.036 c -0.075 -0.049 -0.169 -0.12 -0.337 -0.25 c -1.076 -0.825 -2.196 -1.786 -3.042 -2.823 c -0.853 -1.047 -1.36 -2.088 -1.36 -3.083 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
