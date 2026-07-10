package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScenarioAutoOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScenarioAutoOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.623 2.083 C 7.21 1.935 5.793 2.294 4.624 3.097 C 3.454 3.9 2.611 5.092 2.244 6.461 C 2.174 6.715 1.928 6.879 1.667 6.845 C 1.407 6.811 1.21 6.588 1.21 6.325 v -3.66 c 0.0 -0.29 0.235 -0.526 0.525 -0.526 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.317 C 2.738 3.302 3.335 2.708 4.03 2.23 C 5.405 1.287 7.073 0.865 8.732 1.04 c 1.66 0.174 3.203 0.934 4.352 2.143 c 1.149 1.209 1.828 2.787 1.915 4.452 c 0.015 0.29 -0.207 0.537 -0.497 0.552 c -0.29 0.015 -0.536 -0.207 -0.551 -0.497 c -0.075 -1.415 -0.652 -2.756 -1.629 -3.784 c -0.976 -1.028 -2.288 -1.674 -3.7 -1.822 Z M 1.498 7.815 C 1.788 7.799 2.034 8.022 2.05 8.31 c 0.074 1.415 0.651 2.757 1.628 3.784 c 0.976 1.028 2.288 1.674 3.7 1.822 c 1.411 0.149 2.829 -0.211 3.998 -1.014 c 1.17 -0.802 2.014 -1.995 2.38 -3.363 c 0.07 -0.255 0.315 -0.42 0.577 -0.385 c 0.26 0.035 0.456 0.257 0.456 0.52 v 3.661 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 12.02 c -0.477 0.678 -1.074 1.272 -1.769 1.749 c -1.375 0.944 -3.042 1.367 -4.702 1.193 c -1.66 -0.175 -3.202 -0.934 -4.351 -2.143 C 1.767 11.609 1.088 10.03 1.0 8.366 C 0.986 8.076 1.208 7.83 1.498 7.815 Z m 6.97 -2.85 c -0.09 -0.178 -0.271 -0.29 -0.47 -0.29 c -0.199 0.0 -0.38 0.112 -0.47 0.29 l -2.453 4.9 c -0.13 0.26 -0.024 0.575 0.235 0.705 c 0.26 0.13 0.575 0.024 0.704 -0.235 l 0.731 -1.46 h 2.506 l 0.73 1.46 c 0.13 0.26 0.446 0.364 0.705 0.235 c 0.26 -0.13 0.364 -0.446 0.235 -0.705 l -2.454 -4.9 Z m -0.47 1.408 l 0.727 1.452 H 7.271 l 0.727 -1.452 Z")
        )
    }.build()
}
