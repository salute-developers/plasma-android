package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Line16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Line16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.854 2.146 c 0.195 0.196 0.195 0.512 0.0 0.708 L 2.54 14.167 c -0.195 0.196 -0.512 0.196 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 13.147 2.146 c 0.195 -0.195 0.511 -0.195 0.707 0.0 Z")
        )
    }.build()
}
