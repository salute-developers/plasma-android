package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.21 4.987 c 1.04 -1.105 2.788 -1.132 3.861 -0.058 c 1.073 1.073 1.047 2.82 -0.058 3.861 L 16.4 11.249 l 2.004 6.544 c 0.28 0.916 0.032 1.913 -0.646 2.59 c -0.754 0.755 -2.012 0.619 -2.587 -0.28 l -3.078 -4.8 l -1.818 1.71 v 0.876 c 0.0 0.73 -0.29 1.429 -0.805 1.944 L 8.574 20.73 c -0.526 0.526 -1.42 0.315 -1.656 -0.39 l -0.814 -2.443 l -2.443 -0.814 c -0.705 -0.235 -0.916 -1.13 -0.39 -1.656 l 0.895 -0.896 c 0.516 -0.516 1.216 -0.805 1.945 -0.805 h 0.875 l 1.711 -1.818 l -4.801 -3.078 C 2.998 8.253 2.862 6.995 3.616 6.24 c 0.678 -0.677 1.674 -0.925 2.59 -0.645 l 6.545 2.003 l 2.459 -2.612 Z m 2.8 1.002 c -0.474 -0.475 -1.248 -0.463 -1.708 0.026 l -2.778 2.952 c -0.196 0.208 -0.493 0.287 -0.766 0.203 l -6.99 -2.14 C 5.381 6.912 4.961 7.017 4.676 7.302 C 4.6 7.379 4.614 7.507 4.705 7.566 l 5.562 3.565 c 0.188 0.12 0.313 0.318 0.34 0.54 c 0.027 0.221 -0.045 0.443 -0.198 0.606 l -2.553 2.712 c -0.141 0.15 -0.339 0.236 -0.546 0.236 H 6.111 c -0.332 0.0 -0.65 0.131 -0.884 0.366 l -0.324 0.324 l 2.031 0.677 c 0.224 0.074 0.4 0.25 0.474 0.474 l 0.677 2.03 l 0.324 -0.323 c 0.235 -0.235 0.366 -0.553 0.366 -0.884 v -1.2 c 0.0 -0.206 0.086 -0.404 0.236 -0.546 l 2.712 -2.552 c 0.162 -0.153 0.384 -0.225 0.606 -0.198 c 0.221 0.027 0.42 0.152 0.54 0.34 l 3.565 5.561 c 0.058 0.092 0.187 0.106 0.264 0.029 c 0.285 -0.285 0.39 -0.705 0.271 -1.09 l -2.14 -6.991 c -0.083 -0.273 -0.004 -0.57 0.204 -0.766 l 2.952 -2.778 c 0.489 -0.46 0.5 -1.234 0.026 -1.709 Z")
        )
    }.build()
}
