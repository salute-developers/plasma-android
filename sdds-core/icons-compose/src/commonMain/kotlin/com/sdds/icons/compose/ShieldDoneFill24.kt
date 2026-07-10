package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDoneFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDoneFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.552 2.216 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 7.014 2.03 11.015 4.214 13.272 c 2.17 2.244 4.4 2.674 4.652 2.716 h 0.005 l 0.01 0.002 l 0.01 0.002 C 11.911 21.995 11.951 22.0 12.0 22.0 c 0.05 0.0 0.089 -0.005 0.109 -0.008 l 0.02 -0.003 h 0.004 l 0.001 -0.001 c 0.252 -0.043 2.482 -0.472 4.652 -2.716 C 18.97 17.015 21.0 13.014 21.0 6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 c -1.4 0.0 -3.1 -0.595 -4.61 -1.307 c -1.49 -0.702 -2.698 -1.47 -3.088 -1.727 Z m 3.992 7.8 c 0.285 -0.3 0.273 -0.775 -0.028 -1.06 c -0.3 -0.285 -0.775 -0.273 -1.06 0.028 l -4.243 4.474 l -1.716 -1.52 c -0.31 -0.274 -0.784 -0.245 -1.059 0.065 c -0.274 0.31 -0.245 0.784 0.065 1.059 l 2.258 2.0 c 0.303 0.268 0.764 0.247 1.042 -0.046 l 4.741 -5.0 Z")
        )
    }.build()
}
