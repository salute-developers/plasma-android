package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 4.5 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 2.797 2.796 L 10.8 4.5 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 8.004 8.711 L 4.5 5.207 C 4.305 5.012 4.305 4.695 4.5 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 8.0 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 2.797 2.796 L 10.8 8.0 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 l -3.503 3.504 L 4.5 8.707 C 4.305 8.512 4.305 8.195 4.5 8.0 Z")
        )
    }.build()
}
