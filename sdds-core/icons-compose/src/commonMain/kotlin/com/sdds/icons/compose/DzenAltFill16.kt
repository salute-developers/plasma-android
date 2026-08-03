package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenAltFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenAltFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.133 1.7 c 0.064 0.0 0.116 0.052 0.118 0.114 c 0.086 2.266 0.373 3.642 1.337 4.607 c 0.962 0.962 2.339 1.251 4.6 1.337 C 14.25 7.76 14.3 7.812 14.3 7.875 L 14.3 8.14 c 0.0 0.063 -0.052 0.115 -0.115 0.117 c -2.26 0.085 -3.635 0.373 -4.598 1.337 c -0.962 0.962 -1.25 2.335 -1.336 4.591 C 8.248 14.248 8.196 14.3 8.133 14.3 H 7.868 c -0.064 0.0 -0.116 -0.051 -0.118 -0.115 c -0.087 -2.256 -0.374 -3.629 -1.337 -4.591 C 5.451 8.63 4.075 8.342 1.814 8.257 C 1.752 8.254 1.7 8.202 1.7 8.14 V 7.875 c 0.0 -0.064 0.052 -0.115 0.114 -0.117 c 2.26 -0.086 3.636 -0.374 4.6 -1.337 c 0.964 -0.965 1.251 -2.342 1.337 -4.607 C 7.754 1.751 7.806 1.7 7.869 1.7 h 0.264 Z")
        )
    }.build()
}
