package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicroscopeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicroscopeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.35 1.25 c 0.856 0.0 1.55 0.694 1.55 1.55 v 1.605 c 1.89 0.058 3.829 1.199 4.84 3.057 c 1.034 1.903 0.826 4.32 -0.741 6.389 h 1.35 c 0.277 0.0 0.5 0.223 0.5 0.5 c 0.0 0.275 -0.223 0.5 -0.5 0.5 H 1.75 c -0.276 0.0 -0.5 -0.225 -0.5 -0.5 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 9.938 c 1.84 -1.94 2.085 -4.235 1.172 -5.913 c -0.838 -1.541 -2.441 -2.475 -3.96 -2.533 V 8.4 c 0.0 0.856 -0.694 1.55 -1.55 1.55 H 5.6 c -0.856 0.0 -1.55 -0.694 -1.55 -1.55 V 2.8 c 0.0 -0.856 0.694 -1.55 1.55 -1.55 h 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.258 11.226 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.275 -0.224 0.5 -0.5 0.5 H 4.68 c -0.276 0.0 -0.5 -0.225 -0.5 -0.5 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 3.578 Z")
        )
    }.build()
}
