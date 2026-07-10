package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMinimizeLFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMinimizeLFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 6.62 c 0.0 0.275 0.224 0.5 0.5 0.5 h 3.688 c 0.276 0.0 0.5 -0.225 0.5 -0.5 V 3.0 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 v 2.428 L 1.85 2.643 c -0.197 -0.194 -0.514 -0.19 -0.707 0.006 C 0.95 2.846 0.953 3.163 1.15 3.356 L 3.965 6.12 H 1.5 C 1.224 6.12 1.0 6.343 1.0 6.62 Z M 11.717 2.5 H 6.593 v 1.0 h 5.103 c 0.498 0.0 0.842 0.0 1.109 0.022 c 0.26 0.022 0.404 0.06 0.508 0.114 c 0.236 0.12 0.427 0.311 0.547 0.547 c 0.053 0.104 0.092 0.247 0.114 0.508 c 0.021 0.267 0.022 0.61 0.022 1.109 v 1.509 H 8.412 c -0.882 0.0 -1.323 0.0 -1.66 0.171 C 6.456 7.631 6.215 7.872 6.064 8.17 c -0.172 0.336 -0.172 0.778 -0.172 1.66 v 2.668 H 4.3 c -0.499 0.0 -0.842 0.0 -1.11 -0.022 c -0.26 -0.021 -0.403 -0.06 -0.508 -0.114 c -0.235 -0.12 -0.426 -0.311 -0.546 -0.546 c -0.054 -0.105 -0.093 -0.248 -0.114 -0.51 C 2.0 11.04 2.0 10.696 2.0 10.198 V 7.999 H 1.0 v 2.22 c 0.0 0.471 0.0 0.856 0.025 1.168 c 0.026 0.323 0.082 0.612 0.22 0.881 c 0.215 0.424 0.56 0.768 0.983 0.984 c 0.27 0.137 0.559 0.193 0.881 0.22 c 0.313 0.025 0.697 0.025 1.17 0.025 h 7.438 c 0.472 0.0 0.857 0.0 1.169 -0.025 c 0.323 -0.027 0.612 -0.083 0.881 -0.22 c 0.424 -0.216 0.768 -0.56 0.984 -0.984 c 0.137 -0.269 0.193 -0.558 0.22 -0.88 c 0.025 -0.313 0.025 -0.698 0.025 -1.17 V 5.78 c 0.0 -0.472 0.0 -0.857 -0.026 -1.17 c -0.026 -0.322 -0.082 -0.611 -0.22 -0.88 c -0.215 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.269 -0.137 -0.558 -0.193 -0.881 -0.22 C 12.574 2.5 12.189 2.5 11.717 2.5 Z")
        )
    }.build()
}
