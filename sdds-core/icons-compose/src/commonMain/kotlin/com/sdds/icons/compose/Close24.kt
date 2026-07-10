package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Close24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Close24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 5.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 12.0 10.94 l 5.47 -5.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 13.06 12.0 l 5.47 5.47 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 L 12.0 13.06 l -5.47 5.47 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 L 10.94 12.0 L 5.47 6.53 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
