package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldChildFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldChildFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.383 1.116 c -0.233 -0.155 -0.533 -0.155 -0.766 0.0 c -0.271 0.18 -1.11 0.72 -2.144 1.212 c -1.05 0.5 -2.23 0.917 -3.202 0.917 c -0.288 0.0 -0.521 0.236 -0.521 0.526 c 0.0 4.923 1.41 7.73 2.926 9.315 c 1.507 1.575 3.056 1.876 3.23 1.906 h 0.005 l 0.013 0.003 C 7.938 14.997 7.966 15.0 8.0 15.0 c 0.034 0.0 0.062 -0.003 0.076 -0.005 l 0.013 -0.003 h 0.003 h 0.001 c 0.175 -0.03 1.724 -0.331 3.23 -1.906 c 1.517 -1.584 2.927 -4.392 2.927 -9.315 c 0.0 -0.29 -0.233 -0.526 -0.52 -0.526 c -0.973 0.0 -2.154 -0.417 -3.203 -0.917 c -1.034 -0.493 -1.873 -1.032 -2.144 -1.212 Z m -1.46 3.425 c 0.0 -0.603 0.484 -1.091 1.08 -1.091 c 0.596 0.0 1.08 0.488 1.08 1.09 c 0.0 0.603 -0.484 1.092 -1.08 1.092 c -0.596 0.0 -1.08 -0.489 -1.08 -1.091 Z m 0.023 1.853 C 7.12 6.196 7.37 6.068 7.651 6.068 h 0.704 c 0.282 0.0 0.532 0.128 0.705 0.326 l 1.816 1.695 c 0.188 0.176 0.2 0.474 0.026 0.665 c -0.174 0.19 -0.468 0.202 -0.657 0.025 L 9.793 8.358 C 9.604 8.18 9.298 8.317 9.298 8.576 V 9.23 l 0.177 2.584 c 0.022 0.316 -0.226 0.583 -0.538 0.583 c -0.283 0.0 -0.517 -0.222 -0.537 -0.508 l -0.11 -1.622 c -0.01 -0.152 -0.136 -0.27 -0.287 -0.27 c -0.151 0.0 -0.276 0.118 -0.287 0.27 l -0.11 1.622 c -0.02 0.286 -0.254 0.508 -0.538 0.508 c -0.312 0.0 -0.559 -0.267 -0.537 -0.583 l 0.176 -2.581 V 8.576 c 0.0 -0.26 -0.305 -0.395 -0.494 -0.218 L 5.761 8.779 C 5.572 8.956 5.278 8.944 5.104 8.754 C 4.93 8.563 4.941 8.265 5.13 8.089 l 1.817 -1.695 Z")
        )
    }.build()
}
