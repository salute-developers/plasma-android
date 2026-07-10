package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.244 29.98 C 21.626 31.739 19.959 33.0 18.0 33.0 c -1.96 0.0 -3.627 -1.261 -4.244 -3.02 h 8.488 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.0 c 0.394 0.0 0.784 0.078 1.148 0.23 c 0.364 0.151 0.695 0.374 0.973 0.655 c 0.279 0.28 0.5 0.613 0.65 0.98 c 0.144 0.349 0.221 0.722 0.228 1.1 c 1.386 0.4 2.51 1.098 3.405 2.046 c 0.266 0.281 0.509 0.582 0.73 0.897 l 4.615 -4.615 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 1.935 -1.935 C 5.941 27.638 5.75 27.32 5.75 26.96 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 1.332 l 0.042 -0.043 c 0.152 -1.419 0.203 -3.002 0.258 -4.677 l 0.022 -0.684 c 0.076 -2.26 0.183 -4.646 0.598 -6.809 c 0.414 -2.158 1.156 -4.215 2.593 -5.736 c 0.895 -0.948 2.02 -1.646 3.405 -2.046 c 0.007 -0.378 0.085 -0.751 0.228 -1.1 c 0.151 -0.367 0.372 -0.7 0.65 -0.98 c 0.28 -0.28 0.61 -0.504 0.974 -0.656 C 17.215 3.078 17.606 3.0 18.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.799 12.83 c 0.073 0.303 0.14 0.61 0.199 0.917 c 0.415 2.163 0.52 4.55 0.597 6.809 l 0.022 0.684 c 0.055 1.692 0.107 3.29 0.263 4.72 h 1.37 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 11.67 l 15.129 -15.13 Z")
        )
    }.build()
}
