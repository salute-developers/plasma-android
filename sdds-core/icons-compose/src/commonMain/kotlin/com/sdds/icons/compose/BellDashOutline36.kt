package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDashOutline36",
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
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 0.394 0.0 0.784 0.078 1.147 0.23 c 0.364 0.151 0.695 0.374 0.974 0.655 c 0.279 0.28 0.5 0.613 0.65 0.98 c 0.144 0.349 0.221 0.722 0.228 1.1 c 1.386 0.4 2.51 1.098 3.405 2.046 c 0.266 0.281 0.508 0.582 0.729 0.897 l 4.616 -4.615 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 1.936 -1.936 C 5.942 27.637 5.75 27.32 5.75 26.96 c 0.0 -0.552 0.449 -1.0 1.0 -1.0 h 1.333 l 0.04 -0.042 c 0.153 -1.419 0.205 -3.002 0.26 -4.678 l 0.022 -0.684 c 0.076 -2.26 0.183 -4.646 0.598 -6.809 c 0.414 -2.158 1.156 -4.215 2.593 -5.736 c 0.895 -0.948 2.02 -1.646 3.405 -2.046 c 0.007 -0.378 0.084 -0.751 0.227 -1.1 c 0.151 -0.367 0.372 -0.7 0.65 -0.98 c 0.28 -0.28 0.61 -0.504 0.975 -0.656 C 17.215 3.078 17.606 3.0 18.0 3.0 Z m 0.0 4.573 c -2.402 0.0 -3.925 0.724 -4.951 1.81 c -1.06 1.122 -1.7 2.747 -2.083 4.741 c -0.382 1.99 -0.486 4.228 -0.563 6.498 l -0.022 0.693 c -0.027 0.817 -0.054 1.636 -0.094 2.439 l 13.402 -13.402 c -0.22 -0.355 -0.465 -0.679 -0.739 -0.968 c -1.026 -1.087 -2.549 -1.81 -4.95 -1.81 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.799 12.83 c 0.073 0.303 0.139 0.61 0.198 0.917 c 0.415 2.163 0.522 4.55 0.598 6.809 l 0.022 0.684 c 0.055 1.692 0.107 3.29 0.263 4.72 h 1.37 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 11.67 l 2.0 -2.0 h 12.199 c -0.148 -1.464 -0.2 -3.059 -0.25 -4.645 l -0.023 -0.693 c -0.072 -2.12 -0.168 -4.212 -0.49 -6.099 l 1.693 -1.693 Z")
        )
    }.build()
}
