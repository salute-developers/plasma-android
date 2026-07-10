package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMinimizeRFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMinimizeRFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.996 6.62 c 0.0 0.275 -0.224 0.5 -0.5 0.5 h -3.688 c -0.276 0.0 -0.5 -0.225 -0.5 -0.5 V 3.0 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 s 0.5 0.223 0.5 0.5 v 2.428 l 2.838 -2.785 c 0.197 -0.194 0.513 -0.19 0.707 0.006 c 0.193 0.197 0.19 0.514 -0.007 0.707 L 12.031 6.12 h 2.465 c 0.276 0.0 0.5 0.224 0.5 0.5 Z M 4.28 2.5 h 5.124 v 1.0 H 4.3 c -0.498 0.0 -0.842 0.0 -1.109 0.022 c -0.26 0.022 -0.404 0.06 -0.508 0.114 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 2.083 4.287 2.043 4.43 2.022 4.69 C 2.0 4.958 2.0 5.301 2.0 5.8 v 1.509 h 5.584 c 0.882 0.0 1.323 0.0 1.66 0.171 C 9.54 7.631 9.781 7.872 9.932 8.17 c 0.172 0.336 0.172 0.778 0.172 1.66 v 2.668 h 1.592 c 0.499 0.0 0.842 0.0 1.11 -0.022 c 0.26 -0.021 0.403 -0.06 0.508 -0.114 c 0.235 -0.12 0.426 -0.311 0.546 -0.546 c 0.054 -0.105 0.093 -0.248 0.114 -0.51 c 0.022 -0.266 0.022 -0.61 0.022 -1.108 V 7.999 h 1.0 v 2.22 c 0.0 0.471 0.0 0.856 -0.025 1.168 c -0.027 0.323 -0.082 0.612 -0.22 0.881 c -0.215 0.424 -0.56 0.768 -0.983 0.984 c -0.27 0.137 -0.559 0.193 -0.882 0.22 c -0.312 0.025 -0.696 0.025 -1.168 0.025 h -7.44 c -0.471 0.0 -0.856 0.0 -1.168 -0.025 c -0.323 -0.027 -0.612 -0.083 -0.881 -0.22 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.984 c -0.137 -0.269 -0.193 -0.558 -0.22 -0.88 C 1.0 11.074 1.0 10.69 1.0 10.217 V 5.78 c 0.0 -0.472 0.0 -0.857 0.026 -1.17 c 0.026 -0.322 0.082 -0.611 0.22 -0.88 c 0.215 -0.424 0.56 -0.768 0.983 -0.984 c 0.269 -0.137 0.558 -0.193 0.88 -0.22 C 3.423 2.5 3.808 2.5 4.28 2.5 Z")
        )
    }.build()
}
