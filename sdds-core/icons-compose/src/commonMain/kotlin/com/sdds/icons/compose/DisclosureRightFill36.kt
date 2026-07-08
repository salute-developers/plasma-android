package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureRightFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureRightFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.647 10.351 C 15.253 10.532 15.0 10.925 15.0 11.357 v 13.286 c 0.0 0.432 0.253 0.825 0.647 1.006 c 0.394 0.18 0.858 0.116 1.187 -0.166 l 7.778 -6.642 C 24.858 18.63 25.0 18.323 25.0 18.0 c 0.0 -0.323 -0.142 -0.63 -0.388 -0.84 l -7.778 -6.643 c -0.33 -0.282 -0.793 -0.346 -1.187 -0.166 Z")
        )
    }.build()
}
