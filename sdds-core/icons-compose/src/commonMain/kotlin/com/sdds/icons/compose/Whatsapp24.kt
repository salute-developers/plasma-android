package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Whatsapp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Whatsapp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.084 11.91 c -0.001 1.747 0.457 3.452 1.329 4.955 L 2.0 22.0 l 5.279 -1.378 c 1.455 0.79 3.092 1.206 4.759 1.206 h 0.004 c 5.488 0.0 9.956 -4.446 9.958 -9.91 c 0.0 -2.648 -1.034 -5.138 -2.914 -7.011 C 17.206 3.033 14.706 2.0 12.042 2.0 c -5.49 0.0 -9.956 4.446 -9.958 9.91 Z m 3.143 4.696 L 5.03 16.294 c -0.829 -1.311 -1.266 -2.827 -1.265 -4.383 c 0.002 -4.542 3.714 -8.237 8.28 -8.237 c 2.21 0.0 4.289 0.859 5.851 2.416 c 1.563 1.557 2.423 3.626 2.423 5.827 c -0.002 4.542 -3.715 8.238 -8.277 8.238 h -0.004 c -1.485 -0.001 -2.942 -0.398 -4.212 -1.149 l -0.303 -0.178 l -3.132 0.817 l 0.836 -3.04 Z m 6.815 5.222 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.553 7.767 C 9.366 7.354 9.17 7.346 8.993 7.339 C 8.848 7.332 8.682 7.333 8.516 7.333 c -0.166 0.0 -0.435 0.062 -0.663 0.31 C 7.625 7.89 6.982 8.49 6.982 9.709 c 0.0 1.218 0.891 2.396 1.016 2.561 c 0.124 0.165 1.721 2.747 4.25 3.74 c 2.102 0.824 2.53 0.66 2.986 0.619 c 0.456 -0.041 1.472 -0.599 1.68 -1.177 c 0.207 -0.579 0.207 -1.075 0.144 -1.178 c -0.062 -0.103 -0.228 -0.165 -0.477 -0.29 c -0.248 -0.123 -1.472 -0.722 -1.7 -0.805 c -0.228 -0.083 -0.394 -0.124 -0.56 0.124 c -0.166 0.248 -0.642 0.806 -0.787 0.97 c -0.145 0.166 -0.29 0.187 -0.54 0.063 c -0.248 -0.124 -1.05 -0.385 -2.0 -1.23 c -0.74 -0.656 -1.24 -1.467 -1.385 -1.715 c -0.145 -0.247 -0.015 -0.381 0.11 -0.505 c 0.111 -0.11 0.248 -0.29 0.373 -0.434 c 0.124 -0.144 0.165 -0.248 0.248 -0.413 c 0.084 -0.165 0.042 -0.31 -0.02 -0.434 c -0.063 -0.124 -0.546 -1.349 -0.767 -1.838 Z")
        )
    }.build()
}
