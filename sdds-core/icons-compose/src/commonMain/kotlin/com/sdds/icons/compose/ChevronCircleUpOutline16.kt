package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleUpOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleUpOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.0 8.0 c 0.0 3.314 -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 s 2.686 -6.0 6.0 -6.0 s 6.0 2.686 6.0 6.0 Z m -6.0 7.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 3.146 -5.396 c 0.196 0.195 0.512 0.195 0.708 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 l -3.5 -3.5 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 l -3.5 3.5 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.196 0.195 0.512 0.195 0.708 0.0 L 8.0 6.457 l 3.146 3.147 Z")
        )
    }.build()
}
