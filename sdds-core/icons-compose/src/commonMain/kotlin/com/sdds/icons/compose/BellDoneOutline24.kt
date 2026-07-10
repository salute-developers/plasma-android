package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDoneOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDoneOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 6.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 9.538 12.0 6.5 S 14.462 1.0 17.5 1.0 S 23.0 3.462 23.0 6.5 Z m -2.146 -1.854 c 0.195 0.196 0.195 0.512 0.0 0.708 l -4.0 4.0 c -0.196 0.195 -0.512 0.195 -0.708 0.0 l -2.0 -2.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 c 0.196 -0.195 0.512 -0.195 0.708 0.0 L 16.5 8.293 l 3.646 -3.647 c 0.196 -0.195 0.512 -0.195 0.708 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.48 13.756 l -0.03 -0.825 C 18.14 12.977 17.821 13.0 17.5 13.0 c -0.185 0.0 -0.369 -0.008 -0.55 -0.023 c 0.011 0.275 0.021 0.552 0.03 0.83 l 0.016 0.458 c 0.033 1.015 0.066 2.038 0.158 2.985 H 6.846 c 0.092 -0.947 0.125 -1.97 0.158 -2.984 l 0.015 -0.46 c 0.051 -1.504 0.12 -2.98 0.374 -4.289 c 0.253 -1.313 0.676 -2.369 1.365 -3.094 c 0.531 -0.558 1.27 -0.972 2.351 -1.117 c 0.226 -1.212 0.787 -2.306 1.585 -3.182 C 12.472 2.042 12.236 2.0 12.0 2.0 c -0.263 0.0 -0.523 0.052 -0.765 0.152 c -0.243 0.1 -0.463 0.248 -0.65 0.434 c -0.185 0.186 -0.332 0.406 -0.433 0.649 C 10.052 3.477 10.0 3.737 10.0 4.0 h 0.022 c -0.956 0.266 -1.733 0.74 -2.35 1.39 C 6.696 6.413 6.197 7.795 5.92 9.232 c -0.278 1.44 -0.35 3.027 -0.4 4.523 l -0.015 0.453 c -0.036 1.09 -0.07 2.119 -0.166 3.041 H 4.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 15.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -0.839 c -0.097 -0.922 -0.13 -1.95 -0.166 -3.04 l -0.015 -0.454 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.17 20.0 c 0.412 1.165 1.524 2.0 2.83 2.0 s 2.417 -0.835 2.83 -2.0 H 9.17 Z")
        )
    }.build()
}
