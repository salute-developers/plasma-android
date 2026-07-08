package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WeatherFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WeatherFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.37 28.518 c 0.346 -0.515 1.049 -0.654 1.569 -0.311 c 0.519 0.343 0.66 1.039 0.313 1.554 L 13.744 32.0 c -0.346 0.515 -1.05 0.654 -1.57 0.31 c -0.519 -0.343 -0.66 -1.038 -0.313 -1.553 l 1.508 -2.24 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.91 28.518 c 0.347 -0.515 1.049 -0.654 1.569 -0.311 s 0.66 1.039 0.313 1.554 L 21.284 32.0 c -0.346 0.515 -1.048 0.654 -1.568 0.31 c -0.52 -0.343 -0.66 -1.038 -0.314 -1.553 l 1.508 -2.24 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.2 13.53 c 1.357 -7.543 12.667 -8.29 14.779 -0.074 c 8.438 1.37 7.232 11.534 1.156 13.207 c -0.02 0.037 -0.04 0.075 -0.065 0.11 l -1.508 2.24 c -0.346 0.515 -1.048 0.654 -1.568 0.311 s -0.66 -1.039 -0.313 -1.554 l 0.587 -0.872 h -4.822 l -1.424 2.116 c -0.346 0.515 -1.05 0.653 -1.569 0.31 c -0.52 -0.343 -0.66 -1.039 -0.313 -1.554 l 0.587 -0.872 h -4.822 l -1.424 2.116 c -0.346 0.514 -1.048 0.653 -1.568 0.31 S 9.253 28.285 9.6 27.77 l 0.666 -0.99 c -3.185 -0.58 -5.236 -3.0 -5.685 -5.67 c -0.754 -4.48 3.848 -8.326 7.618 -7.58 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.54 3.0 c 2.557 0.0 4.817 1.26 6.18 3.188 c -2.45 0.559 -4.617 2.27 -5.395 5.005 c -0.114 0.403 -0.514 0.672 -0.936 0.656 c -2.18 -0.086 -4.492 1.213 -5.82 3.18 C 3.584 13.766 3.0 12.184 3.0 10.468 C 3.0 6.344 6.376 3.0 10.54 3.0 Z")
        )
    }.build()
}
