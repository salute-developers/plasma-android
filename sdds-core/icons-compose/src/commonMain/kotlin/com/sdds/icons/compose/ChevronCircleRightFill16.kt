package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleRightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleRightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 8.0 c 0.0 -3.59 -2.91 -6.5 -6.5 -6.5 S 1.5 4.41 1.5 8.0 s 2.91 6.5 6.5 6.5 s 6.5 -2.91 6.5 -6.5 Z m -8.104 3.146 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.196 0.195 0.512 0.195 0.708 0.0 l 3.5 -3.5 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 l -3.5 -3.5 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 c -0.195 0.196 -0.195 0.512 0.0 0.708 L 9.543 8.0 l -3.147 3.146 Z")
        )
    }.build()
}
