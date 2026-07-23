package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximizeRFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximizeRFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.279 2.5 h 5.124 v 1.0 H 4.3 c -0.498 0.0 -0.842 0.0 -1.109 0.022 c -0.26 0.022 -0.404 0.06 -0.508 0.114 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 2.083 4.287 2.043 4.43 2.022 4.69 C 2.0 4.958 2.0 5.301 2.0 5.8 v 1.51 h 5.584 c 0.882 0.0 1.323 0.0 1.66 0.171 C 9.54 7.632 9.78 7.873 9.932 8.17 c 0.172 0.336 0.172 0.777 0.172 1.66 v 2.667 h 1.592 c 0.498 0.0 0.842 0.0 1.109 -0.022 c 0.26 -0.021 0.404 -0.06 0.508 -0.114 c 0.236 -0.12 0.427 -0.311 0.547 -0.546 c 0.053 -0.105 0.093 -0.248 0.114 -0.51 c 0.022 -0.266 0.022 -0.61 0.022 -1.108 V 8.0 h 1.0 v 2.22 c 0.0 0.471 0.0 0.856 -0.026 1.168 c -0.026 0.323 -0.082 0.612 -0.22 0.882 c -0.215 0.423 -0.56 0.767 -0.982 0.983 c -0.27 0.137 -0.56 0.193 -0.882 0.22 c -0.312 0.025 -0.697 0.025 -1.169 0.025 H 4.28 c -0.472 0.0 -0.857 0.0 -1.17 -0.025 c -0.322 -0.027 -0.611 -0.083 -0.88 -0.22 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 c -0.137 -0.27 -0.193 -0.559 -0.22 -0.882 C 1.0 11.075 1.0 10.69 1.0 10.218 v -4.44 C 1.0 5.308 1.0 4.923 1.026 4.61 c 0.026 -0.323 0.082 -0.612 0.22 -0.881 c 0.215 -0.424 0.56 -0.768 0.983 -0.984 c 0.269 -0.137 0.558 -0.193 0.88 -0.22 C 3.423 2.5 3.808 2.5 4.28 2.5 Z m 6.38 0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 3.337 c 0.277 0.0 0.5 0.224 0.5 0.5 v 3.275 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 4.19 L 11.16 6.977 C 10.96 7.17 10.645 7.167 10.45 6.97 c -0.193 -0.197 -0.19 -0.514 0.007 -0.707 L 13.273 3.5 H 11.16 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
