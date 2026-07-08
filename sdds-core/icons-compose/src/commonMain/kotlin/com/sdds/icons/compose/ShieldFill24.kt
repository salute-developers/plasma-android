package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.448 2.216 c 0.336 -0.22 0.768 -0.22 1.104 0.0 c 0.39 0.256 1.598 1.025 3.087 1.727 C 17.15 4.655 18.85 5.25 20.25 5.25 C 20.664 5.25 21.0 5.586 21.0 6.0 c 0.0 7.014 -2.03 11.015 -4.214 13.272 c -2.17 2.244 -4.4 2.674 -4.652 2.716 h -0.001 h -0.004 l -0.02 0.004 C 12.089 21.995 12.049 22.0 12.0 22.0 c -0.05 0.0 -0.089 -0.005 -0.109 -0.008 l -0.02 -0.003 l -0.005 -0.001 c -0.252 -0.043 -2.482 -0.472 -4.652 -2.716 C 5.03 17.015 3.0 13.014 3.0 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 c 1.4 0.0 3.1 -0.595 4.61 -1.307 c 1.49 -0.702 2.698 -1.47 3.088 -1.727 Z")
        )
    }.build()
}
