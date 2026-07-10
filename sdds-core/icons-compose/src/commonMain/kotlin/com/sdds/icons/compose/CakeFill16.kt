package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CakeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CakeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.041 2.95 C 9.041 3.53 8.575 4.0 8.0 4.0 C 7.424 4.0 6.958 3.53 6.958 2.95 C 6.958 1.9 8.0 0.5 8.0 0.5 S 9.04 1.9 9.04 2.95 Z M 8.5 5.4 V 4.7 h -1.0 v 0.7 H 4.007 C 2.76 5.4 1.75 6.42 1.75 7.675 V 9.45 c 1.503 0.0 2.631 -1.185 2.982 -1.61 l 0.003 -0.004 c 0.016 -0.019 0.042 -0.05 0.068 -0.077 c 0.022 -0.024 0.102 -0.107 0.23 -0.15 c 0.135 -0.047 0.279 -0.04 0.41 0.016 C 5.567 7.678 5.64 7.767 5.66 7.792 c 0.024 0.03 0.048 0.063 0.062 0.083 L 5.725 7.88 c 0.13 0.185 0.409 0.543 0.81 0.85 C 6.934 9.039 7.427 9.276 8.0 9.276 c 0.572 0.0 1.066 -0.237 1.466 -0.544 c 0.4 -0.308 0.68 -0.666 0.809 -0.851 l 0.003 -0.005 c 0.014 -0.02 0.037 -0.053 0.061 -0.082 c 0.021 -0.026 0.094 -0.115 0.218 -0.168 c 0.131 -0.057 0.275 -0.063 0.41 -0.017 c 0.128 0.044 0.207 0.126 0.23 0.15 c 0.026 0.027 0.052 0.06 0.068 0.078 l 0.003 0.005 c 0.351 0.424 1.48 1.61 2.982 1.61 V 7.674 c 0.0 -1.256 -1.01 -2.275 -2.257 -2.275 H 8.5 Z m 5.75 5.05 c -1.622 0.0 -2.844 -1.01 -3.443 -1.627 c -0.183 0.215 -0.428 0.467 -0.732 0.7 C 9.564 9.918 8.86 10.276 8.0 10.276 c -0.86 0.0 -1.564 -0.358 -2.075 -0.751 c -0.303 -0.234 -0.55 -0.486 -0.732 -0.701 C 4.594 9.441 3.372 10.45 1.75 10.45 v 1.775 c 0.0 1.257 1.01 2.275 2.257 2.275 h 7.986 c 1.246 0.0 2.257 -1.018 2.257 -2.275 V 10.45 Z")
        )
    }.build()
}
