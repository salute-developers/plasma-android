package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 8.0 c 0.195 0.195 0.512 0.195 0.707 0.0 l 2.797 -2.797 L 10.8 8.0 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 L 8.004 3.789 L 4.5 7.293 C 4.305 7.488 4.305 7.804 4.5 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 11.5 c 0.195 0.195 0.512 0.195 0.707 0.0 l 2.797 -2.797 L 10.8 11.5 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 L 8.004 7.289 L 4.5 10.793 c -0.195 0.195 -0.195 0.512 0.0 0.707 Z")
        )
    }.build()
}
