package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureDownFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureDownFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.649 15.026 c -0.181 -0.394 -0.574 -0.647 -1.006 -0.647 H 11.357 c -0.432 0.0 -0.825 0.253 -1.006 0.647 c -0.18 0.394 -0.116 0.858 0.166 1.187 l 6.642 7.778 c 0.21 0.246 0.518 0.388 0.841 0.388 c 0.323 0.0 0.63 -0.142 0.84 -0.388 l 6.643 -7.778 c 0.282 -0.33 0.346 -0.793 0.166 -1.187 Z")
        )
    }.build()
}
