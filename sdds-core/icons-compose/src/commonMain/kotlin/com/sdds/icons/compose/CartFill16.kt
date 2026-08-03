package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.035 3.05 c 0.489 0.0 0.622 0.005 0.727 0.035 c 0.215 0.062 0.398 0.2 0.513 0.389 C 2.329 3.562 2.367 3.68 2.48 4.1 H 2.479 l 1.23 5.01 l 0.02 0.078 l 0.042 0.151 l 0.095 0.354 l 0.013 -0.004 c 0.06 0.164 0.131 0.312 0.232 0.442 c 0.171 0.22 0.399 0.392 0.66 0.498 c 0.298 0.122 0.638 0.122 1.026 0.121 H 5.88 h 5.387 h 0.082 c 0.388 0.0 0.728 0.001 1.027 -0.12 c 0.26 -0.107 0.488 -0.279 0.66 -0.499 c 0.196 -0.252 0.282 -0.575 0.38 -0.943 l 0.022 -0.079 l 0.924 -3.133 c 0.047 -0.175 0.09 -0.338 0.115 -0.476 c 0.025 -0.147 0.041 -0.326 -0.016 -0.515 c -0.078 -0.256 -0.25 -0.476 -0.483 -0.615 c -0.171 -0.103 -0.352 -0.134 -0.502 -0.147 c -0.143 -0.013 -0.314 -0.013 -0.499 -0.013 H 3.646 L 3.511 3.822 c -0.097 -0.367 -0.174 -0.652 -0.32 -0.89 c -0.254 -0.414 -0.656 -0.719 -1.128 -0.854 C 1.79 2.0 1.49 2.0 1.105 2.0 h -0.07 C 0.739 2.0 0.5 2.235 0.5 2.525 c 0.0 0.29 0.24 0.525 0.535 0.525 Z m 5.882 9.975 c 0.0 0.677 -0.559 1.225 -1.248 1.225 s -1.247 -0.548 -1.247 -1.225 S 4.98 11.8 5.668 11.8 c 0.69 0.0 1.248 0.548 1.248 1.225 Z m 4.813 1.225 c 0.689 0.0 1.247 -0.548 1.247 -1.225 S 12.42 11.8 11.73 11.8 c -0.69 0.0 -1.248 0.548 -1.248 1.225 s 0.559 1.225 1.248 1.225 Z")
        )
    }.build()
}
