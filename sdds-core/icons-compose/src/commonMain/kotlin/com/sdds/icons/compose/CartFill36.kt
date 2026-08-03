package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.146 7.25 c 1.048 0.0 1.334 0.011 1.558 0.076 c 0.46 0.132 0.852 0.429 1.1 0.832 C 4.919 8.346 5.0 8.602 5.243 9.5 H 5.241 l 2.634 10.734 l 0.046 0.168 l 0.087 0.325 l 0.204 0.757 l 0.028 -0.007 c 0.127 0.35 0.281 0.669 0.498 0.947 c 0.367 0.472 0.854 0.84 1.413 1.068 c 0.64 0.26 1.368 0.26 2.2 0.258 h 0.177 H 24.07 h 0.178 c 0.831 0.001 1.56 0.003 2.2 -0.258 c 0.558 -0.228 1.045 -0.596 1.412 -1.068 c 0.42 -0.54 0.606 -1.232 0.817 -2.021 l 0.046 -0.169 l 1.98 -6.714 c 0.1 -0.375 0.195 -0.724 0.246 -1.02 c 0.056 -0.314 0.09 -0.698 -0.034 -1.103 c -0.167 -0.55 -0.535 -1.02 -1.034 -1.319 c -0.367 -0.22 -0.754 -0.287 -1.077 -0.315 c -0.305 -0.026 -0.673 -0.026 -1.067 -0.026 H 7.74 L 7.453 8.903 C 7.243 8.12 7.08 7.507 6.767 6.997 C 6.223 6.11 5.36 5.457 4.348 5.167 C 3.766 4.998 3.122 4.998 2.295 5.0 h -0.15 C 1.514 5.0 1.0 5.504 1.0 6.125 S 1.513 7.25 2.146 7.25 Z M 14.75 28.625 c 0.0 1.45 -1.197 2.625 -2.674 2.625 c -1.477 0.0 -2.674 -1.175 -2.674 -2.625 S 10.6 26.0 12.077 26.0 c 1.477 0.0 2.674 1.175 2.674 2.625 Z m 10.313 2.625 c 1.476 0.0 2.674 -1.175 2.674 -2.625 S 26.54 26.0 25.064 26.0 c -1.477 0.0 -2.674 1.175 -2.674 2.625 s 1.197 2.625 2.674 2.625 Z")
        )
    }.build()
}
