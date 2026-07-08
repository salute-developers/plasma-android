package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FireFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FireFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 10.5 c -2.06 3.436 -2.485 7.836 2.231 10.36 c 0.085 0.046 0.178 -0.043 0.136 -0.129 c -1.293 -2.643 -1.35 -3.666 -0.941 -5.0 c 0.026 -0.086 0.142 -0.095 0.184 -0.016 c 0.422 0.802 0.86 1.39 1.487 2.076 c 0.064 0.07 0.18 0.018 0.174 -0.077 c -0.211 -3.252 0.728 -5.152 2.136 -5.933 c 0.05 -0.028 0.113 -0.005 0.137 0.048 c 1.0 2.183 2.456 2.594 2.456 5.171 c 0.0 2.499 -0.457 2.505 -1.083 3.81 c -0.036 0.075 0.036 0.157 0.117 0.132 c 5.39 -1.611 4.202 -8.867 2.257 -12.841 c -0.027 -0.054 -0.095 -0.071 -0.143 -0.035 c -0.61 0.449 -1.017 1.12 -1.476 1.717 c -0.057 0.074 -0.175 0.033 -0.18 -0.06 c -0.141 -2.814 -2.395 -5.573 -4.04 -6.625 c -0.068 -0.043 -0.154 0.01 -0.15 0.09 c 0.126 3.367 -1.83 4.857 -3.302 7.312 Z")
        )
    }.build()
}
