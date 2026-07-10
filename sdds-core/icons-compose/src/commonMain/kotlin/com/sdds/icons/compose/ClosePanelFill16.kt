package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClosePanelFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClosePanelFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.4 3.1 h 3.5 c 0.77 0.0 1.4 0.62 1.4 1.4 v 7.0 c 0.0 0.77 -0.63 1.4 -1.4 1.4 H 2.4 c -0.78 0.0 -1.4 -0.63 -1.4 -1.4 v -7.0 c 0.0 -0.78 0.62 -1.4 1.4 -1.4 Z m 7.69 0.0 h 3.5 C 14.37 3.1 15.0 3.72 15.0 4.5 v 7.0 c 0.0 0.77 -0.63 1.4 -1.41 1.4 h -3.5 c -0.77 0.0 -1.4 -0.63 -1.4 -1.4 v -7.0 c 0.0 -0.78 0.63 -1.4 1.4 -1.4 Z M 5.67 7.64 L 3.71 5.49 C 3.38 5.14 2.8 5.37 2.8 5.85 v 4.29 c 0.0 0.48 0.58 0.71 0.91 0.36 l 1.96 -2.15 c 0.18 -0.2 0.18 -0.51 0.0 -0.71 Z m 4.65 0.0 l 1.96 -2.15 c 0.33 -0.35 0.91 -0.12 0.91 0.36 v 4.29 c 0.0 0.48 -0.58 0.71 -0.91 0.36 l -1.96 -2.15 c -0.18 -0.2 -0.18 -0.51 0.0 -0.71 Z")
        )
    }.build()
}
