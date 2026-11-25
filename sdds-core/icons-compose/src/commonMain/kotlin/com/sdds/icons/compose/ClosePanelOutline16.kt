package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClosePanelOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClosePanelOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 4.5 c 0.0 -0.78 0.62 -1.4 1.4 -1.4 h 3.5 c 0.77 0.0 1.4 0.62 1.4 1.4 v 7.0 c 0.0 0.77 -0.63 1.4 -1.4 1.4 H 2.4 c -0.78 0.0 -1.4 -0.63 -1.4 -1.4 v -7.0 Z m 9.09 -1.4 c -0.77 0.0 -1.4 0.62 -1.4 1.4 v 7.0 c 0.0 0.77 0.63 1.4 1.4 1.4 h 3.5 c 0.78 0.0 1.41 -0.63 1.41 -1.4 v -7.0 c 0.0 -0.78 -0.63 -1.4 -1.41 -1.4 h -3.5 Z M 2.0 4.5 c 0.0 -0.23 0.17 -0.4 0.4 -0.4 h 3.5 c 0.22 0.0 0.4 0.17 0.4 0.4 v 7.0 c 0.0 0.22 -0.18 0.4 -0.4 0.4 H 2.4 c -0.23 0.0 -0.4 -0.18 -0.4 -0.4 v -7.0 Z m 8.09 -0.4 c -0.22 0.0 -0.4 0.17 -0.4 0.4 v 7.0 c 0.0 0.22 0.18 0.4 0.4 0.4 h 3.5 c 0.23 0.0 0.41 -0.18 0.41 -0.4 v -7.0 c 0.0 -0.23 -0.18 -0.4 -0.41 -0.4 h -3.5 Z M 3.71 5.49 l 1.96 2.15 c 0.18 0.2 0.18 0.51 0.0 0.71 L 3.71 10.5 c -0.33 0.35 -0.91 0.12 -0.91 -0.36 V 5.85 c 0.0 -0.48 0.58 -0.71 0.91 -0.36 Z m 8.57 0.0 l -1.96 2.15 c -0.18 0.2 -0.18 0.51 0.0 0.71 l 1.96 2.15 c 0.33 0.35 0.91 0.12 0.91 -0.36 V 5.85 c 0.0 -0.48 -0.58 -0.71 -0.91 -0.36 Z")
        )
    }.build()
}
