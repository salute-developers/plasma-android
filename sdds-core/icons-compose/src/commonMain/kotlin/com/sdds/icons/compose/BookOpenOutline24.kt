package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOpenOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOpenOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 3.75 c 3.701 0.0 5.426 2.122 5.497 3.652 h 0.003 V 19.0 c 0.0 0.276 -0.336 0.5 -0.75 0.5 s -0.75 -0.224 -0.75 -0.5 c 0.0 0.115 0.035 0.072 -0.105 -0.12 c -0.115 -0.157 -0.315 -0.363 -0.623 -0.569 c -0.611 -0.407 -1.65 -0.811 -3.272 -0.811 c -3.3 0.0 -4.0 1.6 -4.0 2.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.4 -0.7 -2.0 -4.0 -2.0 c -1.623 0.0 -2.66 0.404 -3.271 0.811 c -0.309 0.206 -0.509 0.412 -0.625 0.57 C 3.214 19.07 3.25 19.115 3.25 19.0 c 0.0 0.276 -0.336 0.5 -0.75 0.5 S 1.75 19.276 1.75 19.0 V 7.437 h 0.004 c 0.01 -0.166 0.053 -0.329 0.1 -0.46 c 0.057 -0.162 0.139 -0.34 0.243 -0.525 C 2.306 6.082 2.62 5.66 3.056 5.26 C 3.938 4.45 5.305 3.75 7.25 3.75 c 2.445 0.0 4.027 0.926 4.84 1.996 c 0.136 -0.162 0.291 -0.326 0.466 -0.486 c 0.882 -0.81 2.249 -1.51 4.194 -1.51 Z m -9.5 1.5 c -1.554 0.0 -2.563 0.55 -3.18 1.115 C 3.754 6.653 3.537 6.95 3.402 7.188 c -0.067 0.12 -0.11 0.22 -0.135 0.29 c -0.01 0.027 -0.015 0.046 -0.018 0.056 v 9.463 C 4.138 16.437 5.444 16.0 7.25 16.0 c 1.76 0.0 3.09 0.43 4.0 1.053 V 7.5 c 0.0 -0.464 -0.78 -2.25 -4.0 -2.25 Z m 9.5 0.0 c -1.555 0.0 -2.563 0.55 -3.18 1.115 c -0.315 0.288 -0.532 0.585 -0.667 0.823 c -0.067 0.12 -0.11 0.22 -0.135 0.29 c -0.01 0.027 -0.015 0.046 -0.018 0.056 v 9.519 c 0.91 -0.623 2.24 -1.053 4.0 -1.053 c 1.806 0.0 3.112 0.436 4.0 0.997 V 7.5 c 0.0 -0.464 -0.78 -2.25 -4.0 -2.25 Z")
        )
    }.build()
}
