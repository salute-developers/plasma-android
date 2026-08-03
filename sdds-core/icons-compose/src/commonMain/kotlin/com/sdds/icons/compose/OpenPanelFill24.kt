package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OpenPanelFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OpenPanelFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 5.0 h 5.0 c 1.1 0.0 2.0 0.89 2.0 2.0 v 10.0 c 0.0 1.1 -0.9 2.0 -2.0 2.0 H 4.0 c -1.11 0.0 -2.0 -0.9 -2.0 -2.0 V 7.0 c 0.0 -1.11 0.89 -2.0 2.0 -2.0 Z m 16.0 0.0 h -5.0 c -1.11 0.0 -2.0 0.89 -2.0 2.0 v 10.0 c 0.0 1.1 0.89 2.0 2.0 2.0 h 5.0 c 1.1 0.0 2.0 -0.9 2.0 -2.0 V 7.0 c 0.0 -1.11 -0.9 -2.0 -2.0 -2.0 Z M 4.33 11.46 l 3.18 -3.18 C 7.99 7.8 8.8 8.14 8.8 8.81 v 6.37 c 0.0 0.67 -0.81 1.01 -1.29 0.53 l -3.18 -3.18 c -0.3 -0.3 -0.3 -0.77 0.0 -1.07 Z m 12.15 -3.18 l 3.18 3.18 c 0.3 0.3 0.3 0.77 0.0 1.07 l -3.18 3.18 c -0.48 0.48 -1.29 0.14 -1.29 -0.53 V 8.81 c 0.0 -0.67 0.81 -1.01 1.29 -0.53 Z")
        )
    }.build()
}
