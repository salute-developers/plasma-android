package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.564 1.0 h 4.873 c 0.57 0.0 1.027 0.0 1.398 0.03 c 0.381 0.031 0.714 0.097 1.02 0.253 c 0.49 0.25 0.887 0.647 1.137 1.137 c 0.156 0.307 0.222 0.639 0.253 1.02 c 0.03 0.37 0.03 0.829 0.03 1.399 V 5.91 c 0.062 -0.025 0.13 -0.04 0.2 -0.04 c 0.29 0.0 0.525 0.236 0.525 0.526 v 1.051 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.061 0.0 -0.12 -0.01 -0.175 -0.03 v 5.831 c 0.0 0.677 -0.548 1.225 -1.225 1.225 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 V 12.89 h -7.7 v 0.884 c 0.0 0.677 -0.548 1.225 -1.225 1.225 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 V 7.94 c -0.055 0.019 -0.114 0.03 -0.175 0.03 C 1.235 7.969 1.0 7.733 1.0 7.444 V 6.392 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 c 0.07 0.0 0.138 0.015 0.2 0.04 V 4.838 c 0.0 -0.57 0.0 -1.027 0.03 -1.398 c 0.031 -0.381 0.097 -0.714 0.253 -1.02 c 0.25 -0.49 0.647 -0.887 1.137 -1.137 c 0.306 -0.156 0.639 -0.222 1.02 -0.253 C 4.535 1.0 4.994 1.0 5.564 1.0 Z m 7.711 3.86 V 6.22 H 2.725 V 4.86 c 0.0 -0.596 0.0 -1.013 0.027 -1.339 c 0.026 -0.319 0.075 -0.505 0.147 -0.647 c 0.154 -0.301 0.399 -0.546 0.7 -0.7 c 0.142 -0.072 0.328 -0.121 0.647 -0.147 C 4.572 2.0 4.99 2.0 5.585 2.0 h 4.83 c 0.596 0.0 1.014 0.0 1.339 0.027 c 0.319 0.026 0.505 0.075 0.647 0.147 c 0.302 0.154 0.546 0.399 0.7 0.7 c 0.072 0.142 0.121 0.328 0.147 0.648 c 0.027 0.325 0.027 0.742 0.027 1.338 Z M 4.85 10.783 c 0.58 0.0 1.05 -0.471 1.05 -1.053 S 5.43 8.676 4.85 8.676 c -0.58 0.0 -1.05 0.472 -1.05 1.054 c 0.0 0.582 0.47 1.053 1.05 1.053 Z m 6.3 0.0 c 0.58 0.0 1.05 -0.471 1.05 -1.053 s -0.47 -1.054 -1.05 -1.054 c -0.58 0.0 -1.05 0.472 -1.05 1.054 c 0.0 0.582 0.47 1.053 1.05 1.053 Z")
        )
    }.build()
}
