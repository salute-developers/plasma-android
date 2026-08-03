package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipHorizontalFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipHorizontalFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.625 4.394 c 0.5 -0.904 1.875 -0.55 1.875 0.483 V 18.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 H 2.695 l -0.14 -0.01 c -0.678 -0.092 -1.08 -0.848 -0.735 -1.473 L 9.625 4.394 Z M 3.543 18.5 H 10.0 V 6.816 L 3.543 18.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 3.908 c 0.406 -0.105 0.876 0.033 1.126 0.485 l 7.804 14.123 c 0.015 0.026 0.026 0.054 0.038 0.08 c 0.024 0.057 0.045 0.112 0.06 0.169 c 0.002 0.012 0.003 0.025 0.006 0.037 c 0.006 0.028 0.011 0.057 0.015 0.085 c 0.002 0.02 0.003 0.039 0.003 0.059 c 0.002 0.02 0.003 0.041 0.003 0.062 c 0.0 0.025 -0.002 0.049 -0.004 0.073 l -0.005 0.05 l -0.011 0.062 l -0.016 0.066 l -0.016 0.054 l -0.019 0.05 l -0.028 0.066 c -0.008 0.017 -0.016 0.034 -0.026 0.05 c -0.01 0.02 -0.021 0.037 -0.033 0.055 l -0.024 0.038 l -0.049 0.064 l -0.028 0.032 c -0.016 0.018 -0.032 0.035 -0.05 0.052 c -0.012 0.013 -0.026 0.025 -0.04 0.037 c -0.017 0.015 -0.034 0.03 -0.053 0.044 c -0.015 0.012 -0.032 0.021 -0.049 0.032 l -0.052 0.034 c -0.017 0.01 -0.036 0.019 -0.054 0.028 c -0.02 0.01 -0.038 0.02 -0.058 0.028 c -0.021 0.009 -0.043 0.015 -0.065 0.023 c -0.018 0.006 -0.036 0.013 -0.055 0.018 c -0.04 0.011 -0.083 0.02 -0.126 0.027 L 21.304 20.0 H 14.0 l -0.153 -0.009 C 13.09 19.916 12.5 19.277 12.5 18.5 V 4.877 c 0.0 -0.323 0.135 -0.58 0.335 -0.752 c 0.12 -0.103 0.263 -0.177 0.415 -0.217 Z")
        )
    }.build()
}
