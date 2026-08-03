package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Close16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Close16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.396 3.396 c 0.196 -0.195 0.512 -0.195 0.708 0.0 L 8.0 7.293 l 3.896 -3.897 c 0.196 -0.195 0.512 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 L 8.707 8.0 l 3.897 3.896 c 0.195 0.196 0.195 0.512 0.0 0.708 c -0.196 0.195 -0.512 0.195 -0.708 0.0 L 8.0 8.707 l -3.896 3.897 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 L 7.293 8.0 L 3.396 4.104 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 Z")
        )
    }.build()
}
