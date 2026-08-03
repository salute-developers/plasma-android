package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppleLogoFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppleLogoFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.209 11.624 c 1.226 0.0 3.552 -1.604 5.987 -1.364 c 1.022 0.045 3.882 0.39 5.72 2.97 c -0.14 0.09 -3.41 1.92 -3.378 5.714 c 0.047 4.53 4.165 6.045 4.212 6.06 c -0.048 0.108 -0.662 2.16 -2.17 4.244 c -1.303 1.86 -2.686 3.675 -4.792 3.705 c -2.106 0.045 -2.782 -1.184 -5.17 -1.184 c -2.405 0.0 -3.144 1.154 -5.14 1.23 c -2.058 0.074 -3.615 -1.981 -4.935 -3.796 c -2.687 -3.705 -4.746 -10.53 -1.98 -15.119 c 1.368 -2.28 3.82 -3.72 6.475 -3.765 c 2.012 -0.03 3.93 1.305 5.17 1.305 Z M 24.227 3.0 c 0.205 1.755 -0.533 3.525 -1.633 4.785 c -1.085 1.275 -2.877 2.264 -4.637 2.13 c -0.236 -1.726 0.645 -3.525 1.65 -4.665 c 1.148 -1.245 3.049 -2.19 4.62 -2.25 Z")
        )
    }.build()
}
