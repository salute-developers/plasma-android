package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.515 3.0 c -1.104 0.0 -1.946 1.032 -1.771 2.171 l 1.06 6.92 c 0.108 0.71 -0.067 1.434 -0.483 2.006 l -3.053 4.187 c -1.26 1.728 -0.08 4.216 1.998 4.216 h 5.25 v 8.25 L 18.0 33.0 l 1.485 -2.25 V 22.5 h 5.249 c 2.078 0.0 3.257 -2.488 1.998 -4.216 l -3.053 -4.187 c -0.416 -0.572 -0.59 -1.297 -0.482 -2.006 l 1.06 -6.92 C 24.43 4.032 23.588 3.0 22.484 3.0 h -8.97 Z")
        )
    }.build()
}
