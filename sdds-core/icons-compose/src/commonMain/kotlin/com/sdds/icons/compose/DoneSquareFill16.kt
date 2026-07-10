package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.75 c -1.256 0.0 -2.275 1.019 -2.275 2.275 v 7.95 c 0.0 1.256 1.019 2.275 2.275 2.275 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -7.95 c 0.0 -1.256 -1.019 -2.275 -2.275 -2.275 h -7.95 Z m 8.15 4.347 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 c -0.196 -0.196 -0.512 -0.196 -0.708 0.0 l -4.854 4.854 l -1.73 -1.73 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 c -0.196 0.196 -0.196 0.512 0.0 0.708 l 2.083 2.083 c 0.195 0.195 0.512 0.195 0.707 0.0 l 5.208 -5.208 Z")
        )
    }.build()
}
