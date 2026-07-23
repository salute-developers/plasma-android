package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoubleDisclosureLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoubleDisclosureLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.5 11.507 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 L 8.704 8.004 L 11.5 5.207 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 L 7.29 8.004 l 3.503 3.503 c 0.195 0.195 0.512 0.195 0.707 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 11.504 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 L 5.204 8.0 L 8.0 5.204 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 c -0.195 -0.196 -0.512 -0.196 -0.707 0.0 L 3.79 8.0 l 3.503 3.504 c 0.195 0.195 0.512 0.195 0.707 0.0 Z")
        )
    }.build()
}
