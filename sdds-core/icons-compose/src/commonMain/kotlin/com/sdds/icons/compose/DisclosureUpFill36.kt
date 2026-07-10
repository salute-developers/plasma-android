package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureUpFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureUpFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.351 20.853 c 0.181 0.394 0.574 0.647 1.006 0.647 h 13.286 c 0.432 0.0 0.825 -0.253 1.006 -0.647 c 0.18 -0.394 0.116 -0.858 -0.166 -1.187 l -6.642 -7.778 C 18.63 11.642 18.323 11.5 18.0 11.5 c -0.323 0.0 -0.63 0.142 -0.84 0.388 l -6.643 7.778 c -0.282 0.33 -0.346 0.793 -0.166 1.187 Z")
        )
    }.build()
}
