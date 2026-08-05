package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.688 7.269 c 0.174 -0.123 0.41 -0.04 0.503 0.15 c 0.661 1.344 1.877 2.35 3.323 2.742 c 0.44 0.126 0.903 0.189 1.386 0.189 c 0.341 0.0 0.668 -0.033 0.985 -0.092 c 0.202 -0.038 0.403 0.092 0.412 0.297 C 9.299 10.603 9.3 10.652 9.3 10.7 c 0.0 1.24 -0.539 2.36 -1.4 3.122 C 7.158 14.494 6.178 14.9 5.1 14.9 c -2.317 0.0 -4.2 -1.883 -4.2 -4.2 c 0.0 -1.417 0.71 -2.673 1.788 -3.431 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.608 7.42 c 0.094 -0.19 0.33 -0.274 0.503 -0.151 c 1.08 0.758 1.79 2.014 1.79 3.431 c 0.0 2.317 -1.884 4.2 -4.2 4.2 c -0.522 0.0 -1.024 -0.095 -1.484 -0.27 c -0.223 -0.085 -0.265 -0.37 -0.11 -0.552 c 0.8 -0.932 1.243 -2.128 1.243 -3.378 c 0.0 -0.238 -0.021 -0.476 -0.056 -0.7 c -0.02 -0.129 0.045 -0.256 0.16 -0.32 c 0.926 -0.512 1.683 -1.299 2.154 -2.26 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.9 0.9 c 2.317 0.0 4.2 1.883 4.2 4.2 c 0.0 0.546 -0.105 1.071 -0.294 1.547 c -0.483 1.218 -1.52 2.156 -2.8 2.506 C 8.656 9.251 8.286 9.3 7.9 9.3 c -0.385 0.0 -0.756 -0.049 -1.106 -0.147 c -1.28 -0.35 -2.317 -1.288 -2.8 -2.506 C 3.805 6.171 3.7 5.646 3.7 5.1 c 0.0 -2.317 1.884 -4.2 4.2 -4.2 Z")
        )
    }.build()
}
