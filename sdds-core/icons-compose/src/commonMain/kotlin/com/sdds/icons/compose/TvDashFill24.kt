package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.026 4.035 c 0.282 -0.294 0.28 -0.761 -0.01 -1.05 c -0.293 -0.294 -0.768 -0.294 -1.061 0.0 L 18.94 4.0 H 3.53 C 3.408 4.0 3.275 4.0 3.16 4.01 c -0.13 0.01 -0.3 0.036 -0.477 0.126 c -0.236 0.12 -0.427 0.311 -0.547 0.546 C 2.046 4.86 2.02 5.031 2.01 5.16 C 2.0 5.275 2.0 5.407 2.0 5.53 v 9.94 c 0.0 0.122 0.0 0.255 0.01 0.37 c 0.01 0.129 0.036 0.3 0.126 0.477 c 0.12 0.235 0.311 0.427 0.547 0.546 c 0.176 0.09 0.348 0.117 0.478 0.128 C 3.275 17.0 3.408 17.0 3.53 17.0 h 2.41 l -2.956 2.955 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 16.97 -16.97 l 0.006 -0.006 l 0.005 -0.004 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.182 17.0 l 11.81 -11.811 C 22.0 5.297 22.0 5.417 22.0 5.529 v 9.941 c 0.0 0.122 0.0 0.255 -0.01 0.37 c -0.01 0.129 -0.036 0.3 -0.126 0.477 c -0.12 0.235 -0.311 0.427 -0.547 0.546 c -0.176 0.09 -0.348 0.117 -0.477 0.128 C 20.725 17.0 20.591 17.0 20.47 17.0 H 10.182 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.182 18.0 l -1.5 1.5 H 20.0 V 18.0 H 9.182 Z")
        )
    }.build()
}
