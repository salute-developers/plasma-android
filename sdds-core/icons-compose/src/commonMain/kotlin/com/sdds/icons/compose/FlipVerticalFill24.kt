package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipVerticalFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipVerticalFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.606 9.625 c 0.904 0.5 0.55 1.875 -0.483 1.875 H 5.5 C 4.67 11.5 4.0 10.828 4.0 10.0 V 2.695 l 0.01 -0.14 c 0.092 -0.678 0.849 -1.08 1.473 -0.735 l 14.123 7.805 Z M 5.5 3.543 V 10.0 h 11.684 L 5.5 3.543 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.092 13.25 c 0.105 0.406 -0.033 0.876 -0.485 1.126 L 5.484 22.181 c -0.026 0.014 -0.054 0.025 -0.08 0.037 c -0.057 0.025 -0.112 0.045 -0.169 0.06 l -0.037 0.006 C 5.17 22.29 5.141 22.296 5.113 22.3 l -0.059 0.004 l -0.062 0.002 c -0.025 0.0 -0.049 -0.002 -0.073 -0.004 l -0.05 -0.005 l -0.062 -0.01 l -0.066 -0.016 l -0.054 -0.017 l -0.05 -0.019 c -0.023 -0.008 -0.044 -0.018 -0.066 -0.028 l -0.05 -0.025 c -0.02 -0.01 -0.037 -0.022 -0.055 -0.034 c -0.013 -0.007 -0.025 -0.015 -0.038 -0.024 c -0.022 -0.015 -0.043 -0.032 -0.064 -0.049 l -0.032 -0.028 l -0.052 -0.049 l -0.037 -0.04 c -0.015 -0.018 -0.03 -0.035 -0.044 -0.054 c -0.012 -0.015 -0.021 -0.032 -0.032 -0.048 c -0.012 -0.018 -0.023 -0.034 -0.033 -0.052 l -0.029 -0.055 c -0.01 -0.019 -0.02 -0.038 -0.028 -0.058 c -0.009 -0.02 -0.015 -0.043 -0.023 -0.065 c -0.006 -0.018 -0.013 -0.036 -0.018 -0.055 c -0.011 -0.04 -0.02 -0.082 -0.026 -0.126 L 4.0 21.304 V 14.0 l 0.008 -0.153 c 0.01 -0.101 0.03 -0.2 0.06 -0.293 c 0.028 -0.094 0.067 -0.184 0.113 -0.269 C 4.435 12.818 4.931 12.5 5.5 12.5 h 13.623 c 0.064 0.0 0.126 0.005 0.185 0.016 c 0.06 0.01 0.116 0.025 0.17 0.045 c 0.16 0.057 0.293 0.154 0.397 0.274 c 0.103 0.12 0.177 0.263 0.217 0.415 Z")
        )
    }.build()
}
