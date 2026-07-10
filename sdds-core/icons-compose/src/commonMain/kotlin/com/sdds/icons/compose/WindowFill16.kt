package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.717 2.5 c 0.472 0.0 0.857 0.0 1.169 0.026 c 0.323 0.026 0.612 0.082 0.881 0.22 c 0.424 0.215 0.768 0.56 0.984 0.983 c 0.137 0.269 0.193 0.558 0.22 0.88 c 0.025 0.313 0.025 0.698 0.025 1.17 v 4.44 c 0.0 0.471 0.0 0.856 -0.026 1.168 c -0.026 0.323 -0.082 0.612 -0.22 0.882 c -0.215 0.423 -0.56 0.767 -0.983 0.983 c -0.269 0.137 -0.558 0.193 -0.881 0.22 c -0.312 0.025 -0.697 0.025 -1.169 0.025 H 4.278 c -0.472 0.0 -0.856 0.0 -1.169 -0.025 c -0.322 -0.027 -0.612 -0.083 -0.881 -0.22 c -0.423 -0.216 -0.768 -0.56 -0.983 -0.983 c -0.138 -0.27 -0.194 -0.559 -0.22 -0.882 C 1.0 11.075 1.0 10.69 1.0 10.218 v -4.44 C 1.0 5.308 1.0 4.923 1.025 4.61 c 0.026 -0.323 0.082 -0.612 0.22 -0.881 c 0.215 -0.424 0.56 -0.768 0.983 -0.984 c 0.27 -0.137 0.559 -0.193 0.881 -0.22 C 3.422 2.5 3.806 2.5 4.28 2.5 h 7.438 Z m 1.596 1.136 c -0.104 -0.053 -0.248 -0.093 -0.508 -0.114 C 12.538 3.5 12.195 3.5 11.695 3.5 H 4.3 c -0.499 0.0 -0.842 0.0 -1.11 0.022 c -0.26 0.022 -0.403 0.06 -0.508 0.114 c -0.235 0.12 -0.426 0.311 -0.546 0.547 C 2.082 4.287 2.043 4.43 2.022 4.69 C 2.0 4.958 2.0 5.301 2.0 5.8 v 4.397 c 0.0 0.498 0.0 0.842 0.022 1.109 c 0.021 0.26 0.06 0.404 0.114 0.509 c 0.12 0.235 0.31 0.426 0.546 0.546 c 0.105 0.053 0.248 0.093 0.509 0.114 c 0.267 0.022 0.61 0.022 1.109 0.022 h 1.592 V 9.83 c 0.0 -0.883 0.0 -1.324 0.172 -1.66 c 0.15 -0.297 0.392 -0.538 0.688 -0.689 C 7.089 7.31 7.53 7.31 8.412 7.31 h 5.584 V 5.8 c 0.0 -0.498 0.0 -0.842 -0.022 -1.109 c -0.022 -0.26 -0.06 -0.404 -0.114 -0.508 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 Z")
        )
    }.build()
}
