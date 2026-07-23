package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FireFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FireFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.76 6.958 c -1.413 2.386 -1.704 5.44 1.525 7.194 c 0.06 0.032 0.125 -0.03 0.096 -0.09 c -0.885 -1.832 -0.925 -2.543 -0.646 -3.468 c 0.018 -0.06 0.1 -0.066 0.13 -0.01 c 0.287 0.553 0.586 0.96 1.014 1.434 c 0.045 0.05 0.126 0.013 0.122 -0.053 C 6.857 9.71 7.5 8.39 8.463 7.849 C 8.5 7.829 8.543 7.845 8.56 7.882 c 0.685 1.515 1.683 1.801 1.683 3.59 c 0.0 1.735 -0.313 1.74 -0.742 2.644 c -0.025 0.053 0.026 0.11 0.082 0.093 c 3.691 -1.12 2.879 -6.156 1.545 -8.915 c -0.018 -0.039 -0.066 -0.05 -0.1 -0.025 c -0.416 0.311 -0.694 0.775 -1.007 1.188 c -0.04 0.052 -0.123 0.024 -0.126 -0.042 c -0.099 -1.951 -1.64 -3.864 -2.767 -4.595 C 7.08 1.789 7.02 1.827 7.022 1.883 c 0.086 2.336 -1.254 3.371 -2.263 5.075 Z")
        )
    }.build()
}
