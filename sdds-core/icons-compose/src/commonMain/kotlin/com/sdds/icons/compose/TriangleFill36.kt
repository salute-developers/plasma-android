package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TriangleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TriangleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 4.5 c 0.404 0.0 0.778 0.216 0.98 0.566 l 14.368 24.887 c 0.203 0.35 0.203 0.781 0.0 1.131 c -0.202 0.35 -0.575 0.566 -0.98 0.566 H 3.632 c -0.404 0.0 -0.777 -0.216 -0.98 -0.566 c -0.202 -0.35 -0.202 -0.781 0.0 -1.131 l 14.37 -24.887 C 17.221 4.716 17.595 4.5 18.0 4.5 Z")
        )
    }.build()
}
