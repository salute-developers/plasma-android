package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.625 1.15 c 0.228 -0.151 0.522 -0.151 0.75 0.0 C 8.649 1.33 9.492 1.87 10.53 2.364 c 1.054 0.5 2.24 0.92 3.22 0.92 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 4.92 -1.412 7.724 -2.928 9.305 c -1.506 1.571 -3.056 1.872 -3.231 1.902 l -0.002 0.001 H 8.086 l -0.014 0.002 C 8.058 14.996 8.032 15.0 8.0 15.0 c -0.033 0.0 -0.058 -0.004 -0.072 -0.006 l -0.014 -0.002 H 7.911 H 7.91 c -0.175 -0.03 -1.725 -0.332 -3.231 -1.903 c -1.516 -1.58 -2.928 -4.384 -2.928 -9.306 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.98 0.0 2.166 -0.418 3.22 -0.919 C 6.508 1.871 7.35 1.331 7.625 1.15 Z")
        )
    }.build()
}
