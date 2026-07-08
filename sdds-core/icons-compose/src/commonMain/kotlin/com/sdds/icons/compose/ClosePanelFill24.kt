package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClosePanelFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClosePanelFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 5.0 h 5.0 c 1.1 0.0 2.0 0.89 2.0 2.0 v 10.0 c 0.0 1.1 -0.9 2.0 -2.0 2.0 H 4.0 c -1.11 0.0 -2.0 -0.9 -2.0 -2.0 V 7.0 c 0.0 -1.11 0.89 -2.0 2.0 -2.0 Z m 11.0 0.0 h 5.0 c 1.1 0.0 2.0 0.89 2.0 2.0 v 10.0 c 0.0 1.1 -0.9 2.0 -2.0 2.0 h -5.0 c -1.11 0.0 -2.0 -0.9 -2.0 -2.0 V 7.0 c 0.0 -1.11 0.89 -2.0 2.0 -2.0 Z m -6.34 6.46 L 5.48 8.28 C 5.0 7.8 4.19 8.14 4.19 8.81 v 6.37 c 0.0 0.67 0.81 1.01 1.29 0.53 l 3.18 -3.18 c 0.3 -0.3 0.3 -0.77 0.0 -1.07 Z m 6.67 0.0 l 3.18 -3.18 c 0.48 -0.48 1.29 -0.14 1.29 0.53 v 6.37 c 0.0 0.67 -0.81 1.01 -1.29 0.53 l -3.18 -3.18 c -0.3 -0.3 -0.3 -0.77 0.0 -1.07 Z")
        )
    }.build()
}
