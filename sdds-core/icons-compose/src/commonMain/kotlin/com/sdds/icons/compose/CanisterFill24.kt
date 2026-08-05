package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CanisterFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CanisterFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.875 3.53 c 0.431 -0.344 0.5 -0.973 0.156 -1.405 c -0.345 -0.43 -0.974 -0.5 -1.406 -0.156 l -0.6 0.48 c -0.39 0.313 -0.66 0.529 -0.894 0.774 c -0.617 0.647 -1.047 1.445 -1.25 2.31 C 15.074 5.19 14.185 5.0 13.25 5.0 h -0.268 c -0.012 -0.185 -0.034 -0.352 -0.072 -0.509 c -0.285 -1.188 -1.213 -2.116 -2.401 -2.401 C 10.133 2.0 9.699 2.0 9.097 2.0 H 8.474 C 7.914 2.0 7.455 2.0 7.08 2.025 C 6.694 2.052 6.343 2.108 6.006 2.247 C 5.21 2.577 4.577 3.21 4.247 4.007 C 4.108 4.342 4.052 4.693 4.026 5.08 C 4.0 5.455 4.0 5.914 4.0 6.474 V 17.75 C 4.0 19.545 5.455 21.0 7.25 21.0 h 9.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 v -6.0 c 0.0 -1.998 -0.868 -3.793 -2.248 -5.03 c 0.003 -0.215 0.01 -0.336 0.025 -0.45 c 0.085 -0.626 0.365 -1.21 0.801 -1.667 c 0.13 -0.135 0.287 -0.264 0.749 -0.634 l 0.548 -0.438 Z m -9.716 0.018 C 9.979 3.505 9.74 3.5 9.0 3.5 H 8.5 c -0.593 0.0 -1.0 0.0 -1.317 0.022 c -0.31 0.021 -0.48 0.06 -0.603 0.111 C 6.152 3.811 5.81 4.151 5.633 4.58 c -0.05 0.123 -0.09 0.293 -0.11 0.603 C 5.514 5.281 5.51 5.388 5.506 5.506 C 6.011 5.186 6.61 5.0 7.25 5.0 h 4.228 c -0.007 -0.062 -0.015 -0.112 -0.026 -0.159 c -0.154 -0.64 -0.654 -1.14 -1.293 -1.293 Z M 9.28 9.22 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 10.94 13.0 l -2.72 2.72 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 L 12.0 14.06 l 2.72 2.72 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 13.06 13.0 l 2.72 -2.72 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 12.0 11.94 L 9.28 9.22 Z")
        )
    }.build()
}
