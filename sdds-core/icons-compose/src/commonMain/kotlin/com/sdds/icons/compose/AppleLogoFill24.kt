package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppleLogoFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppleLogoFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.13 6.84 c 0.682 0.03 2.59 0.26 3.815 1.98 c -0.094 0.06 -2.274 1.28 -2.253 3.809 c 0.031 3.013 2.764 4.026 2.808 4.04 c -0.032 0.07 -0.44 1.44 -1.446 2.83 c -0.87 1.24 -1.792 2.45 -3.196 2.47 c -1.403 0.03 -1.854 -0.79 -3.446 -0.79 c -1.603 0.0 -2.096 0.77 -3.427 0.82 c -1.372 0.05 -2.409 -1.32 -3.289 -2.53 c -1.792 -2.47 -3.164 -7.02 -1.32 -10.08 c 0.911 -1.52 2.545 -2.48 4.316 -2.51 c 1.341 -0.02 2.62 0.871 3.447 0.871 c 0.818 0.0 2.368 -1.07 3.992 -0.91 Z M 16.152 2.0 c 0.136 1.17 -0.357 2.35 -1.09 3.19 c -0.723 0.85 -1.917 1.51 -3.09 1.42 c -0.158 -1.15 0.43 -2.35 1.1 -3.11 c 0.765 -0.83 2.032 -1.46 3.08 -1.5 Z")
        )
    }.build()
}
