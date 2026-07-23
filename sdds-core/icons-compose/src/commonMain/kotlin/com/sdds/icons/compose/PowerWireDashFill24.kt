package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.0 h 4.5 V 3.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 15.75 2.586 15.75 3.0 v 4.0 h 0.188 l 4.016 -4.016 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.293 0.294 0.768 0.0 1.061 l -3.497 3.498 L 4.044 21.015 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.292 -0.294 -0.767 0.0 -1.06 l 4.421 -4.422 C 6.51 14.645 6.0 13.432 6.0 12.16 V 8.75 C 6.0 7.784 6.783 7.0 7.75 7.0 h 0.5 V 3.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z m 0.5 15.431 l 8.5 -8.5 v 2.98 c 0.0 1.386 -0.606 2.703 -1.659 3.606 l -1.754 1.503 c -0.055 0.048 -0.087 0.117 -0.087 0.19 V 22.0 h -5.0 v -4.319 Z")
        )
    }.build()
}
