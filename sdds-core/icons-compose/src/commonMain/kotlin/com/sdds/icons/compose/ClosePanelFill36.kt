package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClosePanelFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClosePanelFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 7.5 h 7.5 c 1.65 0.0 3.0 1.34 3.0 3.0 v 15.0 c 0.0 1.65 -1.35 3.0 -3.0 3.0 H 6.0 c -1.66 0.0 -3.0 -1.35 -3.0 -3.0 v -15.0 c 0.0 -1.66 1.34 -3.0 3.0 -3.0 Z m 16.5 0.0 H 30.0 c 1.65 0.0 3.0 1.34 3.0 3.0 v 15.0 c 0.0 1.65 -1.35 3.0 -3.0 3.0 h -7.5 c -1.66 0.0 -3.0 -1.35 -3.0 -3.0 v -15.0 c 0.0 -1.66 1.34 -3.0 3.0 -3.0 Z m -9.18 9.67 l -5.23 -4.9 c -0.72 -0.67 -1.9 -0.16 -1.9 0.82 v 9.81 c 0.0 0.98 1.18 1.49 1.9 0.82 l 5.23 -4.9 c 0.47 -0.45 0.47 -1.2 0.0 -1.65 Z m 9.35 0.0 l 5.23 -4.9 c 0.72 -0.67 1.9 -0.16 1.9 0.82 v 9.81 c 0.0 0.98 -1.18 1.49 -1.9 0.82 l -5.23 -4.9 c -0.47 -0.45 -0.47 -1.2 0.0 -1.65 Z")
        )
    }.build()
}
