package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 3.016 c 0.0 -0.158 -0.074 -0.308 -0.2 -0.405 c -0.126 -0.098 -0.291 -0.134 -0.448 -0.097 l -3.974 0.937 C 10.214 3.49 10.182 3.496 10.153 3.5 c -0.034 0.003 -0.067 0.002 -0.1 0.0 c -0.03 -0.004 -0.062 -0.01 -0.225 -0.05 L 6.402 2.607 C 6.277 2.577 6.168 2.55 6.053 2.538 c -0.1 -0.01 -0.201 -0.01 -0.302 -0.001 c -0.114 0.01 -0.224 0.036 -0.349 0.066 l -4.0 0.942 C 1.166 3.601 1.0 3.808 1.0 4.047 v 8.937 c 0.0 0.158 0.074 0.307 0.2 0.405 c 0.126 0.098 0.291 0.134 0.448 0.097 l 3.974 -0.937 c 0.164 -0.039 0.196 -0.045 0.225 -0.048 c 0.034 -0.003 0.067 -0.002 0.1 0.0 c 0.03 0.004 0.062 0.01 0.225 0.05 l 3.426 0.842 c 0.125 0.03 0.234 0.057 0.349 0.069 c 0.1 0.01 0.201 0.01 0.302 0.001 c 0.114 -0.01 0.224 -0.036 0.349 -0.066 l 4.0 -0.943 C 14.834 12.4 15.0 12.191 15.0 11.954 V 3.015 Z M 6.4 4.047 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.875 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 4.047 Z m 4.2 1.031 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.875 c 0.0 0.277 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.223 0.5 -0.5 V 5.078 Z")
        )
    }.build()
}
