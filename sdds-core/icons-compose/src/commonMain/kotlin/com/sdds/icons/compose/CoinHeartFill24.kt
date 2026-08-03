package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinHeartFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinHeartFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.146 9.25 c -0.856 0.0 -1.396 0.747 -1.396 1.334 c 0.0 0.5 0.26 1.065 0.762 1.698 c 0.496 0.624 1.151 1.22 1.794 1.784 c 0.239 0.21 0.391 0.342 0.51 0.433 c 0.077 0.06 0.114 0.08 0.123 0.085 c 0.04 0.011 0.056 0.012 0.061 0.012 c 0.005 0.0 0.021 0.0 0.061 -0.012 c 0.009 -0.005 0.046 -0.025 0.123 -0.085 c 0.119 -0.09 0.271 -0.224 0.51 -0.433 c 0.643 -0.563 1.298 -1.16 1.794 -1.784 c 0.503 -0.633 0.762 -1.199 0.762 -1.698 c 0.0 -0.587 -0.54 -1.334 -1.396 -1.334 c -0.17 0.0 -0.367 0.066 -0.6 0.228 c -0.236 0.162 -0.465 0.392 -0.685 0.648 c -0.143 0.165 -0.35 0.26 -0.569 0.26 c -0.219 0.0 -0.426 -0.095 -0.569 -0.26 c -0.22 -0.256 -0.45 -0.486 -0.684 -0.648 c -0.234 -0.162 -0.431 -0.228 -0.6 -0.228 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 h 14.968 Z M 7.25 10.584 c 0.0 -1.291 1.092 -2.834 2.896 -2.834 c 0.573 0.0 1.065 0.225 1.454 0.494 c 0.141 0.098 0.275 0.205 0.4 0.317 c 0.125 -0.112 0.259 -0.22 0.4 -0.317 c 0.389 -0.269 0.88 -0.494 1.454 -0.494 c 1.804 0.0 2.896 1.543 2.896 2.834 c 0.0 1.002 -0.505 1.898 -1.088 2.63 c -0.589 0.743 -1.34 1.419 -1.98 1.98 l -0.017 0.015 c -0.216 0.19 -0.405 0.356 -0.566 0.48 c -0.163 0.125 -0.362 0.26 -0.602 0.33 c -0.342 0.102 -0.652 0.102 -0.994 0.0 c -0.24 -0.07 -0.439 -0.205 -0.602 -0.33 c -0.16 -0.124 -0.35 -0.29 -0.566 -0.48 l -0.018 -0.015 c -0.64 -0.561 -1.39 -1.237 -1.98 -1.98 c -0.582 -0.732 -1.087 -1.628 -1.087 -2.63 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
