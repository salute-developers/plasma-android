package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.552 2.216 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 2.658 0.292 4.884 0.773 6.746 l 7.983 -4.605 C 11.752 8.094 11.75 8.047 11.75 8.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 S 15.25 7.034 15.25 8.0 s -0.784 1.75 -1.75 1.75 c -0.37 0.0 -0.712 -0.115 -0.995 -0.31 L 4.218 14.22 c 0.787 2.262 1.871 3.888 2.996 5.051 c 2.17 2.244 4.4 2.674 4.652 2.716 h 0.005 l 0.01 0.002 l 0.01 0.002 C 11.911 21.995 11.951 22.0 12.0 22.0 c 0.05 0.0 0.089 -0.005 0.109 -0.008 l 0.02 -0.003 h 0.004 l 0.001 -0.001 c 0.252 -0.043 2.482 -0.472 4.652 -2.716 c 1.594 -1.648 3.107 -4.227 3.808 -8.23 l -8.35 4.817 c 0.004 0.047 0.006 0.094 0.006 0.141 c 0.0 0.966 -0.784 1.75 -1.75 1.75 S 8.75 16.966 8.75 16.0 s 0.784 -1.75 1.75 -1.75 c 0.37 0.0 0.712 0.115 0.995 0.31 l 9.354 -5.397 C 20.947 8.183 21.0 7.131 21.0 6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 c -1.4 0.0 -3.1 -0.595 -4.61 -1.307 c -1.49 -0.702 -2.698 -1.47 -3.088 -1.727 Z")
        )
    }.build()
}
