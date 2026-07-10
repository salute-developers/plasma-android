package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 11.448 2.216 c 0.336 -0.22 0.768 -0.22 1.104 0.0 c 0.39 0.256 1.598 1.025 3.087 1.727 c 0.778 0.366 1.605 0.702 2.416 0.94 l 1.9 -1.899 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.061 l -16.97 16.97 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.292 -0.294 -0.767 0.0 -1.06 l 2.677 -2.678 C 4.157 14.87 3.0 11.293 3.0 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 c 1.4 0.0 3.1 -0.595 4.61 -1.307 c 1.49 -0.702 2.698 -1.47 3.088 -1.727 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.564 19.618 L 21.0 6.182 c -0.035 6.902 -2.05 10.852 -4.214 13.09 c -2.17 2.244 -4.4 2.674 -4.652 2.716 h -0.001 h -0.004 l -0.02 0.004 C 12.089 21.995 12.049 22.0 12.0 22.0 c -0.05 0.0 -0.089 -0.005 -0.109 -0.008 l -0.01 -0.002 l -0.01 -0.001 l -0.005 -0.001 c -0.238 -0.04 -2.249 -0.427 -4.302 -2.37 Z")
        )
    }.build()
}
