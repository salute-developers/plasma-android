package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.54 3.48 c 0.68 -1.18 2.39 -1.18 3.07 0.0 l 4.3 7.45 c 0.69 1.19 -0.17 2.67 -1.53 2.67 H 3.77 c -1.36 0.0 -2.22 -1.48 -1.53 -2.67 l 4.3 -7.45 Z M 8.68 4.0 C 8.41 3.53 7.73 3.53 7.45 4.0 l -4.3 7.45 c -0.27 0.47 0.07 1.07 0.62 1.07 h 8.6 c 0.55 0.0 0.89 -0.6 0.62 -1.07 L 8.68 4.0 Z M 8.07 5.06 l -3.69 6.39 h 7.37 L 8.07 5.06 Z")
        )
    }.build()
}
