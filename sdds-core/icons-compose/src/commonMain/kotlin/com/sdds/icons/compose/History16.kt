package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.History16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "History16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.002 8.001 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 c -2.209 0.0 -4.14 1.194 -5.181 2.972 H 4.03 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 1.502 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 2.946 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 s 0.5 0.223 0.5 0.5 v 1.448 C 3.226 2.36 5.455 1.0 8.002 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 c -2.901 0.0 -5.39 -1.765 -6.45 -4.277 c -0.108 -0.255 0.01 -0.548 0.265 -0.656 c 0.255 -0.107 0.548 0.012 0.655 0.266 c 0.911 2.156 3.045 3.667 5.53 3.667 c 3.314 0.0 6.0 -2.686 6.0 -6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.1 5.5 c 0.0 -0.331 -0.269 -0.6 -0.6 -0.6 c -0.331 0.0 -0.6 0.269 -0.6 0.6 v 3.57 c 0.0 0.223 0.117 0.43 0.308 0.544 l 1.778 1.067 c 0.284 0.17 0.653 0.079 0.823 -0.206 c 0.17 -0.284 0.079 -0.652 -0.205 -0.823 L 8.1 8.75 V 5.5 Z")
        )
    }.build()
}
