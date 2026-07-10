package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagesOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagesOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.88 8.708 l 0.23 -1.15 c 0.014 -0.068 0.047 -0.13 0.096 -0.18 l 5.588 -5.585 c 0.391 -0.39 1.024 -0.39 1.415 0.0 s 0.391 1.025 0.0 1.416 L 8.622 8.794 C 8.573 8.843 8.51 8.876 8.443 8.89 l -1.15 0.23 C 7.046 9.169 6.83 8.953 6.88 8.708 Z M 4.78 1.825 c -0.472 0.0 -0.857 0.0 -1.17 0.025 c -0.322 0.027 -0.611 0.083 -0.88 0.22 C 2.305 2.286 1.96 2.63 1.745 3.053 c -0.137 0.27 -0.193 0.56 -0.22 0.882 C 1.5 4.247 1.5 4.632 1.5 5.104 v 6.117 c 0.0 0.472 0.0 0.857 0.026 1.169 c 0.026 0.322 0.082 0.612 0.22 0.881 c 0.215 0.423 0.56 0.768 0.983 0.983 c 0.269 0.138 0.558 0.194 0.88 0.22 C 3.923 14.5 4.308 14.5 4.78 14.5 H 10.9 c 0.473 0.0 0.857 0.0 1.17 -0.026 c 0.322 -0.026 0.611 -0.082 0.88 -0.22 c 0.424 -0.215 0.768 -0.56 0.984 -0.983 c 0.137 -0.27 0.193 -0.559 0.22 -0.881 c 0.025 -0.313 0.025 -0.697 0.025 -1.17 V 6.04 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 v 5.16 c 0.0 0.498 0.0 0.842 -0.022 1.108 c -0.021 0.261 -0.06 0.404 -0.114 0.51 c -0.12 0.234 -0.311 0.426 -0.546 0.545 c -0.105 0.054 -0.248 0.093 -0.509 0.114 c -0.267 0.022 -0.61 0.023 -1.109 0.023 H 4.8 c -0.498 0.0 -0.842 0.0 -1.109 -0.023 c -0.26 -0.02 -0.404 -0.06 -0.508 -0.114 c -0.236 -0.12 -0.427 -0.31 -0.547 -0.546 c -0.053 -0.105 -0.093 -0.248 -0.114 -0.509 C 2.5 12.042 2.5 11.698 2.5 11.2 V 5.125 c 0.0 -0.498 0.0 -0.842 0.022 -1.109 c 0.022 -0.26 0.06 -0.404 0.114 -0.509 c 0.12 -0.235 0.311 -0.426 0.547 -0.546 C 3.287 2.908 3.43 2.868 3.69 2.847 C 3.958 2.825 4.301 2.825 4.8 2.825 h 5.163 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.78 Z")
        )
    }.build()
}
