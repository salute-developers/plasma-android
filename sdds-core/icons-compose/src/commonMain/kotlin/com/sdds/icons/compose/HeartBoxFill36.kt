package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartBoxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartBoxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.125 3.75 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 15.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -15.75 Z m 0.254 4.39 h 15.242 c 0.8 0.0 1.47 0.0 2.016 0.044 c 0.57 0.047 1.105 0.148 1.61 0.407 c 0.777 0.397 1.408 1.031 1.803 1.81 c 0.258 0.509 0.359 1.046 0.405 1.619 c 0.045 0.548 0.045 1.22 0.045 2.025 V 26.34 c 0.0 0.805 0.0 1.477 -0.045 2.025 c -0.046 0.573 -0.147 1.11 -0.405 1.618 c -0.395 0.78 -1.026 1.413 -1.802 1.81 c -0.506 0.26 -1.041 0.36 -1.611 0.407 c -0.546 0.045 -1.215 0.045 -2.016 0.045 H 10.379 c -0.8 0.0 -1.47 0.0 -2.016 -0.044 c -0.57 -0.047 -1.105 -0.148 -1.61 -0.407 c -0.777 -0.398 -1.408 -1.031 -1.803 -1.81 c -0.258 -0.509 -0.359 -1.046 -0.405 -1.619 C 4.5 27.817 4.5 27.145 4.5 26.34 V 14.045 c 0.0 -0.805 0.0 -1.477 0.045 -2.025 c 0.046 -0.573 0.147 -1.11 0.405 -1.618 c 0.395 -0.78 1.026 -1.414 1.802 -1.81 c 0.506 -0.26 1.041 -0.36 1.611 -0.408 C 8.909 8.14 9.578 8.14 10.379 8.14 Z m 4.145 5.649 c -2.494 0.0 -4.024 2.156 -4.024 3.925 c 0.0 3.277 3.227 6.351 6.103 8.586 c 0.476 0.37 0.714 0.556 1.005 0.634 c 0.244 0.066 0.54 0.066 0.784 0.0 c 0.29 -0.078 0.529 -0.263 1.005 -0.634 c 2.876 -2.235 6.103 -5.31 6.103 -8.586 c 0.0 -1.769 -1.53 -3.925 -4.024 -3.925 c -1.393 0.0 -2.583 1.098 -3.476 2.141 c -0.893 -1.043 -2.083 -2.141 -3.476 -2.141 Z")
        )
    }.build()
}
